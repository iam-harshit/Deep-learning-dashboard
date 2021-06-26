
function validateForm(){    
    var fullName = $("#fullName").val();
    var email = $("#email").val();
    var password = $("#passwrod").val();
    var x = $("#email").val();
    var atposition = x.indexOf("@");
    var dotposition = x.lastIndexOf(".");
    
    
    if(fullName != ""){
        $("#submitButton").removeClass("btn-vibrate");
        $("#fullName").css("bottom-border", "1px solid #ececec");
        $("#fullName-error").hide();
        return true;
    }
    if(email != ""){
        $("#submitButton").removeClass("btn-vibrate");
        $("#email").css("bottom-border", "1px solid #ececec");
        $("#email-error").hide();
        return true;
    }
    
    if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= x.length) {
        $("#submitButton").removeClass("btn-vibrate");
        $("#email").css("border-bottom", "1px solid #ececec");
        $("#email-error").hide();
        return true;
    }
    
    if(password != ""){
        $("#submitButton").removeClass("btn-vibrate");
        $("#password").css("bottom-border", "1px solid #ececec");
        $("#password-error").hide();
        return true;
    }
    
    if(fullName == ""){
        $("#submitButton").addClass("btn-vibrate");
        $("#fullName").css("bottom-border", "1px solid #ff8080");
        $("#fullName-error").text("Full Name required").css("color", "#ff8080").show();
        return false;
    }
    
    else if(email == ""){
        $("#submitButton").addClass("btn-vibrate");
        $("#email").css("bottom-border", "1px solid #ff8080");
        $("#email-error").text("Email required").css("color","#ff8080").show();
        return false;
    }
    
    else if (atposition < 1 || dotposition < atposition + 2 || dotposition + 2 >= x.length) {
        $("#submitButton").addClass("btn-vibrate");
        $("#email").css("bottom-border", "1px solid #ff8080");
        $("#email-error").text("Enter valid email").css("color", "#ff8080").show();
        return false;
    }
    
    
     else if(password == ""){
        $("#submitButton").addClass("btn-vibrate");
        $("#password").css("bottom-border", "1px solid #ff8080");
        $("#password-error").text("Password required").css("color","#ff8080").show();
        return false;
    }
    
    else{
       
      $(".spinner-border").show();    
      $("#submitButton").attr("disabled", true);
      return true;
        
    }
    
}



