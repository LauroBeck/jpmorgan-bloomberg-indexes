<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>${pageTitle}</title>
    <style>
        body { background-color: #1a1a1a; color: #00ff00; font-family: monospace; }
        table { border-collapse: collapse; width: 100%; margin-top: 20px; }
        th, td { border: 1px solid #333; padding: 12px; text-align: left; }
        th { background-color: #333; color: #ff9900; }
        .positive { color: #00ff00; }
        .negative { color: #ff3333; }
    </style>
</head>
<body>
    <h1>${pageTitle}</h1>
    <table>
        <tr>
            <th>Ticker</th>
            <th>Name</th>
            <th>Price</th>
            <th>Change (%)</th>
        </tr>
        <c:forEach var="index" items="${indexes}">
            <tr>
                <td>${index.ticker}</td>
                <td>${index.name}</td>
                <td>${index.currentValue}</td>
                <td class="${index.changePercent >= 0 ? 'positive' : 'negative'}">
                    ${index.changePercent}%
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
