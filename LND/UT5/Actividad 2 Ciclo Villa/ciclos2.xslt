<?xml version="1.0" encoding="UTF-8"?>
<!-- Ejercicio 2: Mostrar en párrafos cada uno de los nombres de los ciclos -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd" />
    <xsl:template match="/ies">
        <html>
            <body>
                <h2>Mostrar los nombres de los ciclos en parrafos</h2>
                    <xsl:for-each select="ciclos/ciclo">
                        <p><xsl:value-of select="nombre"/></p>
                    </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>