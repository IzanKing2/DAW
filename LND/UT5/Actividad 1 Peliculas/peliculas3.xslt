<?xml version="1.0" encoding="UTF-8"?>
<!-- Ejercicio 3: Mostrar películas dirigidas por Steven Spielberg  -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="/peliculas">
        <html>
            <body>
                <h2>Películas dirigidas por Steven Spielberg</h2>
                <table border="1">
                    <tr>
                        <th>Título</th>
                        <th>Director</th>
                        <th>Género</th>
                        <th>Año</th>
                        <th>Duración</th>
                    </tr>
                    <xsl:for-each select="pelicula[director='Steven Spielberg']">
                        <tr>
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
