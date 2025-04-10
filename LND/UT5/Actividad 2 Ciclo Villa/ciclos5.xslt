<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Ejercicio 5: Mostrar en una etiqueta H1 el nombre del instituto y luego en una tabla con su fila 
encabezado las siguientes columnas, nombre del ciclo y año. Si el año es mayor al 2009 la 
letra será de color verde, si es igual al 2009 de color azul y si es menor al 2009 de color 
rojo.
-->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd" />
    <xsl:template match="/ies">
        <html>
            <body>
                <xsl:for-each select="ciclos/ciclo">
                    <table border="1">
                        <h1><xsl:value-of select="nombre"/></h1>
                        <tr>
                            <th>Nombre del ciclo</th>
                            <th>Año</th>
                        </tr>
                        <xsl:choose>
                            <xsl:when test="decretoTitulo/@año &gt; 2009">
                                <tr style="color:green;">
                                    <td><xsl:value-of select="nombre"/></td>
                                    <td><xsl:value-of select="decretoTitulo/@año"/></td>
                                </tr>
                            </xsl:when>
                            <xsl:when test="decretoTitulo/@año = 2009">
                                <tr style="color:blue;">
                                    <td><xsl:value-of select="nombre"/></td>
                                    <td><xsl:value-of select="decretoTitulo/@año"/></td>
                                </tr>
                            </xsl:when>
                            <xsl:otherwise>
                                <tr style="color:red;">
                                    <td><xsl:value-of select="nombre"/></td>
                                    <td><xsl:value-of select="decretoTitulo/@año"/></td>
                                </tr>
                            </xsl:otherwise>
                        </xsl:choose>
                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>