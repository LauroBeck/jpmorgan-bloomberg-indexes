<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JPMorgan Bloomberg Dashboard</title>
    <style>
        body { background-color: #0b0e11; color: #d1d4dc; font-family: 'Courier New', monospace; padding: 20px; }
        h2 { color: #ff9900; border-bottom: 2px solid #363a45; padding-bottom: 10px; }
        table { width: 100%; border-collapse: collapse; margin-top: 20px; background-color: #161a1e; }
        th { text-align: left; border-bottom: 2px solid #363a45; color: #848e9c; padding: 12px; }
        td { padding: 12px; border-bottom: 1px solid #1e222d; }
        .ticker { font-weight: bold; color: #ffffff; }
        .pos { color: #089981; }
        .neg { color: #f23645; }
    </style>
</head>
<body>
    <h2>JPMorgan Bloomberg Market Intelligence</h2>
    <table>
        <thead>
            <tr>
                <th>Ticker</th>
                <th>Name</th>
                <th>Price</th>
                <th>Change (%)</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="idx" items="${indexes}">
                <tr>
                    <td class="ticker">${idx.ticker}</td>
                    <td>${idx.name}</td>
                    <td>${idx.currentValue}</td>
                    <td class="${idx.changePercent >= 0 ? 'pos' : 'neg'}">
                        ${idx.changePercent}%
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
