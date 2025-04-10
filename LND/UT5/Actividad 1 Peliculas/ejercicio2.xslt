<!-- Ejercicio 2: Ordenar las películas por el año de publicación -->
<?xml version="1.0" encoding="UTF-8"?>
<!-- Este XSLT muestra  -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="/peliculas">
        <html>
            <body>
                <h2>Películas ordenadas por año</h2>
                <table border="1">
                    <tr>
                        <th>Título</th>
                        <th>Director</th>
                        <th>Género</th>
                        <th>Año</th>
                        <th>Duración</th>
                    </tr>
                    <xsl:for-each select="pelicula">
                        <xsl:sort select="anio" data-type="number" order="ascending" />
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