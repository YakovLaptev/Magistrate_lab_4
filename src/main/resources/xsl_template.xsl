<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html" encoding="UTF-8" version="5.2" indent="yes"/>
    <xsl:template match="/">
        <html>
            <xsl:call-template name="head"/>
            <body>
                <table class="result-table">
                    <thead>
                        <tr>
                            <th>Номер</th>
                            <th>Id</th>
                            <th>Название</th>
                            <th>Дата</th>
                            <th>Описание</th>
                            <th>Статус</th>
                            <th>Создатель</th>
                            <th>Комментарий</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:for-each select="specialEvents/specialEvent">
                            <xsl:sort select="specialEventStatus" order="descending"/>
                            <tr>
                                <th>
                                    <xsl:number value="position()"/>
                                </th>
                                <th>
                                    <xsl:value-of select="id"/>
                                </th>
                                <th>
                                    <xsl:value-of select="eventName"/>
                                </th>
                                <th>
                                    <xsl:value-of select="eventDate"/>
                                </th>
                                <th>
                                    <xsl:value-of select="specialEventAbout"/>
                                </th>
                                <th>
                                    <xsl:value-of select="specialEventStatus"/>
                                </th>
                                <th>
                                    <xsl:value-of select="specialEventCreator">
                                        <xsl:value-of select="firstname"/>
                                        <xsl:value-of select="middleName"/>
                                        <xsl:value-of select="lastname"/>
                                        <xsl:value-of select="rank"/>
                                    </xsl:value-of>
                                </th>
                                <th>
                                    <xsl:choose>
                                        <xsl:when test="specialEventStatus = 'Run'">
                                            Запущен в
                                            <xsl:value-of select="eventDate"/>
                                        </xsl:when>
                                        <xsl:otherwise>
                                            Ожидание
                                        </xsl:otherwise>
                                    </xsl:choose>
                                </th>
                            </tr>
                        </xsl:for-each>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td style="font-weight: bold">Всего событий:</td>
                            <td style="font-weight: bold">
                                <xsl:value-of select="count(specialEvents/specialEvent)"/>
                            </td>
                        </tr>
                    </tfoot>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template name="head">
        <head>
            <link rel="stylesheet" href="styles.css"/>
        </head>
    </xsl:template>
</xsl:stylesheet>
