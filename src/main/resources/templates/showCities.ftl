<!DOCTYPE html>
<html>
<head>
    <title>Cities</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>List of cities ordered by name in descending order</h2>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Population</th>
    </tr>

            <#list cities as city>
                <tr>
                    <td>${city.id}</td>
                    <td>${city.name}</td>
                    <td>${city.population}</td>
                </tr>
            </#list>
</table>
</body>
</html>
