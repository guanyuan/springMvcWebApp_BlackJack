$(document).ready(function(){

    var imgPrefix = '&lt img src="&lt c:url value="/resources/img';

    var imgSuffix = '" /&gt" style="width: 100px; margin-left: 10px;"/&gt';

    var poker = "${shuffledPoker}";

    var index = 0;
    var playerPoints = 0;
    var hostPoints = 0;


     $("#playerStart").click(function(){
               $(".backCards").show();
        playerPoints += (poker.takeCard(0).getPoint() + poker.takeCard(1).getPoint());
          hostPoints +=  (poker.takeCard(2).getPoint() + poker.takeCard(3).getPoint());
          index += 4;
          $("#playerScore").text(playerPoints);
          $("#hostScore").text(hostPoints);
          $("#playerStart").attr("disabled", true);
           });

      $("#playerHit").click(function(){
            $("#playerCards").append('<img src="./resources/img/back.jpg" style="width: 100px; margin-left: 10px;"/>');

      });

      $("#hostHit").click(function(){
                  $("#hostCards").append('<img src="./resources/img/back.jpg" style="width: 100px; margin-left: 10px;"/>');
            });

      $("#playerStand").click(function(){
               $("#playerHit").attr("disabled", true);
      });

      $("#hostStand").click(function(){
              $("#hostHit").attr("disabled", true);
      });
    });
