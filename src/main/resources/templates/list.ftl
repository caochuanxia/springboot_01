<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>员工列表</title>
</head>
<body>
    <#list emps as emp>
        <tr>
            <th>${emp.empno}</th>
            <th>${emp.ename}</th>
            <th>${emp.salary}</th>
            <th>${emp.hiredate}</th>
        </tr>
    </#list>
</body>
</html>