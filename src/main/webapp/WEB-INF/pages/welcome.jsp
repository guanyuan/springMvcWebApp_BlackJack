<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en-US">
<head>
    <title>Black Jack Game</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-responsive.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/myStyle.css" />" rel="stylesheet">

    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

    <script type="text/javascript">

    $(document).ready(function(){

    var imgPrefix = '&lt img src="&lt c:url value="/resources/img';

    var imgSuffix = '" /&gt" style="width: 100px; margin-left: 10px;"/&gt';

    var cardPointArray = "${shuffledCardsPoints}";
    var cardNameArray = "${shuffledCardsNames}";

    var index = 0;
    var playerPoints = 0;
    var hostPoints = 0;


     $("#playerStart").click(function(){
               $(".backCards").show();
               $("#debugWindow").append(cardPointArray[0]);
               $("#debugWindow").append(cardPointArray[1]);
               $("#debugWindow").append(cardPointArray[2]);
               $("#debugWindow").append(cardPointArray[3]);
        playerPoints += (cardPointArray[0] + cardPointArray[1]);
          hostPoints +=  (cardPointArray[2] + cardPointArray[3]);
          index += 4;
          $("#playerScore").text(playerPoints);
          $("#hostScore").text(hostPoints);
          $("#playerStart").attr("disabled", true);
           });

      $("#playerHit").click(function(){
            $("#playerCards").append('<img src="<c:url value="/resources/img/back.jpg" />" style="width: 100px; margin-left: 10px;"/>');

      });

      $("#hostHit").click(function(){
                  $("#hostCards").append('<img src="<c:url value="/resources/img/back.jpg" />" style="width: 100px; margin-left: 10px;"/>');
            });

      $("#playerStand").click(function(){
               $("#playerHit").attr("disabled", true);
      });

      $("#hostStand").click(function(){
              $("#hostHit").attr("disabled", true);
      });
    });
    </script>


</head>
<body>

<div class="container">
    <div class="text-center" contenteditable="true">
        <font size="20" color="black"><strong>Black Jack</strong></font>
        <font size="3" color="gray">Go rock it!</font>
    </div>

    <div class="row">
        <div class="col-md-1">

            <div class="btn-group btn-group-vertical" style="width: 100px;">
                <button id="playerStart" class="btn btn-default" type="button"> Start</button>
                <button id="playerHit" class="btn btn-default" type="button"> Hit</button>
                <button id="playerStand" class="btn btn-default" type="button"> Stand</button>
            </div>

        </div>
        <div class="col-md-7">

            <table align="center" class="table table-bordered" contenteditable="true" style="width: 800px;">
                <thead>
                <tr>
                    <th style="background-color: rgb(238, 238, 238);">Player</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td style="height: 200px;">
                    <span class="backCards", style="display:none">
                    <img src="<c:url value="/resources/img/back.jpg" />" style="width: 100px;"/>
                    <img src="<c:url value="/resources/img/back.jpg" />" style="width: 100px; margin-left: 10px;"/>
                    </span>

                    <span id="playerCards"></span>

                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="col-md-3">
            <table align="right" class="table table-bordered" contenteditable="true" style="width: 150px;">
                <thead>
                <tr>
                    <th style="background-color: rgb(238, 238, 238);">Scores</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td style="height: 200px;">
                        <p><font size="2">Player</font></p>

                        <div class="text-center">
                            <p><font size="6"><strong><span  id="playerScore"></span></strong></font></p>
                        </div>
                        <p><font size="2">Host</font></p>
                        <div class="text-center">
                            <p><font size="6"><strong><span  id="hostScore"></span></strong></font></p>
                        </div>


                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<div class="container">

    <div class="row">
        <div class="col-md-1">

            <div class="btn-group btn-group-vertical" style="width: 100px;">
                <button class="btn btn-default" type="button"> <font color="white"> Start</font></button>
                <button id="hostHit" class="btn btn-default" type="button"> Hit</button>
                <button id="hostStand" class="btn btn-default" type="button"> Stand</button>
            </div>

        </div>
        <div class="col-md-7">

            <table align="center" class="table table-bordered" contenteditable="true" style="width: 800px;">
                <thead>
                <tr>
                    <th style="background-color: rgb(238, 238, 238);">Host</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td style="height: 200px;" >
                    <span class="backCards", style="display:none">
                                        <img src="<c:url value="/resources/img/back.jpg" />" style="width: 100px;"/>
                                        <img src="<c:url value="/resources/img/back.jpg" />" style="width: 100px; margin-left: 10px;"/>
                    </span>
                    <span id="hostCards"></span>

                    </td>
                </tr>
                </tbody>
            </table>
        </div>

    </div>

    <div id="debugWindow"> </div>
    <div id="replayDiv"></div>
</div>

</body>
</html>

