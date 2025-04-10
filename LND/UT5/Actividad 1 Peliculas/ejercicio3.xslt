<!-- Ejercicio 3: Mostrar los datos de la película dirigida por Steven Spielberg -->
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" />
    <xsl:template match="/peliculas">
        <html>
            <body>
                <h2>Película dirigida por Steven Spielberg</h2>
                <table>
                    <tr>
                        <th>Título</th>
                        <th>Género</th>
                        <th>Año</th>
                        <th>Duración</th>
                    </tr>
                    <xsl:for-each select="pelicula[director='Steven Spielberg']">
                        <tr>
                            <td><xsl:value-of select="titulo"/></td>
                            <td><xsl:value-of select="genero"/></td>
                            <td><xsl:value-of select="anio"/></td>
                            <td><xsl:value-of select="duracion"/> minutos</td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
