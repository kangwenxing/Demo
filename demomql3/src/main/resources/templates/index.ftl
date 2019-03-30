<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>dharma Mall Homepage</title>
    <link rel="stylesheet" href="/css/index.css">
    <script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<h1 id="title">${title}</h1>
<p></p>
<p></p>
<p></p>
<p></p>
<p></p>

<script>
    $(function(){
        $("#title").click(function () {
            $.ajax({
                url: "http://localhost:8081/api/hello",
                type:"POST",
                data:{
                    name: 'dharma'
                },
                success: function (data,status) {
                    console.log(status);
                    $('p').html(data.action+" "+data.name);
                }
            })
        })
    });
</script>
</body>
</html>