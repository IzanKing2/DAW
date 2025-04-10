<!-- 
    Ejercicio 5: Cambiar el color de fondo de la fila de aquellas películas que 
    duran más de 150 minutos (a color amarillo) y en cualquier otro caso el 
    color de fondo de la fila será azul 
-->

<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="/peliculas">
        <html>
            <body>
                <h2>Películas con duración mayor a 150 minutos</h2>
                <table border="1">
                    <tr>
                        <th>Título</th>
                        <th>Director</th>
                        <th>Género</th>
                        <th>Año</th>
                        <th>Duración</th>
                    </tr>
                    <xsl:for-each select="pelicula">
                        <tr>
                            <xsl:attribute name="style">
                                <xsl:choose>
                                    <xsl:when test="duracion &gt; 150">
                                        <xsl:value-of select="'background-color: yellow;'" />
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <xsl:value-of select="'background-color: blue;'" />
                                    </xsl:otherwise>
                                </xsl:choose>
                            </xsl:attribute>
                            <td><xsl:value-of select="titulo" /></td>
                            <td><xsl:value-of select="director" /></td>
                            <td><xsl:value-of select="genero" /></td>
                            <td><xsl:value-of select="anio" /></td>
                            <td><xsl:value-of select="duracion" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>