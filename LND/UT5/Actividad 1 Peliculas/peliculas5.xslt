<?xml version="1.0" encoding="UTF-8"?>
<!-- Ejercicio 5: Cambiar color de fondo  -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="/peliculas">
        <html>
            <body>
                <h2>Películas en amarillo y azul</h2>
                <table border="1">
                    <tr>
                        <th>Título</th>
                        <th>Director</th>
                        <th>Género</th>
                        <th>Año</th>
                        <th>Duración</th>
                    </tr>
                    <xsl:for-each select="pelicula">
                        <xsl:choose>
                            <xsl:when test="duracion &gt; 150">
                                <tr style="background:yellow">
                                    <td><xsl:value-of select="titulo" /></td>
                                    <td><xsl:value-of select="director" /></td>
                                    <td><xsl:value-of select="genero" /></td>
                                    <td><xsl:value-of select="anio" /></td>
                                    <td><xsl:value-of select="duracion" /></td>
                                </tr>
                            </xsl:when>
                            <xsl:otherwise>
                                <tr style="background:blue">
                                    <td><xsl:value-of select="titulo" /></td>
                                    <td><xsl:value-of select="director" /></td>
                                    <td><xsl:value-of select="genero" /></td>
                                    <td><xsl:value-of select="anio" /></td>
                                    <td><xsl:value-of select="duracion" /></td>
                                </tr>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>