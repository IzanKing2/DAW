<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Ejercicio 4: Mostrar en una lista enumerada los nombres de los ciclos ordenados
    alfabéticamente de manera descendente y su grado.
-->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes" doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" doctype-system="http://www.w3.org/TR/html4/loose.dtd" />
    <xsl:template match="/ies">
        <html>
            <body>
                <h2>Mostrar nombres en una lista enumerada y con su grado</h2>
                <ol>
                    <xsl:for-each select="ciclos/ciclo">
                        <xsl:sort select="nombre" order="descending"/>
                            <li><xsl:value-of select="nombre"/> (<xsl:value-of select="grado"/>)</li>
                    </xsl:for-each>
                </ol>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>