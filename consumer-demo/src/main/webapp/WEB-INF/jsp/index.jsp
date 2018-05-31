<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery.min.js"></script>
</head>
<body>
    <h1>UUID</h1><h2>${uuid}</h2>
</body>
<script>
    $().ready(function () {
        console.log("加载完毕");
        setInterval(function () {
            $.post("/uuid",{},function (result) {
                $("h2").html(result);
            });
        }, 5);
        setInterval(function () {
            location.reload();
        }, 1000);
    });
    (function () {
        console.log("自动执行");
    })();
</script>
</html>
