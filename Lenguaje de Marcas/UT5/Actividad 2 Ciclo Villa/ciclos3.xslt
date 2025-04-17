<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Ejercicio 3: Mostrar en una lista sin numerar los nombres 
    de los ciclos y entre paréntesis su grado 
-->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd" />
    <xsl:template match="/ies">
        <html>
            <body>
                <h2>Mostrar nombres en una lista sin enumerar y con su grado</h2>
                <ul>
                    <xsl:for-each select="ciclos/ciclo">
                        <li><xsl:value-of select="nombre"/> (<xsl:value-of select="grado"/>)</li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>