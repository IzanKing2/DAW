<?xml version="1.0" encoding="UTF-8"?>
<!-- Este XSLT transforma un documento XML de ciclos educativos en una página HTML que muestra los nombres de los ciclos. -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd" />
    <xsl:template match="/ies">
        <html>
            <body>
                <h2>Mostrar los nombres de los ciclos</h2>
                <table border="1">
                    <tr>
                        <th><b>Ciclos</b></th>
                    </tr>
                    <xsl:for-each select="ciclos/ciclo">
                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>