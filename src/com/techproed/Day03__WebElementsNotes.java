package com.techproed;

public class Day03__WebElementsNotes {
    /*
    <input type="email" class="form-control" placeholder="Email"
     data-test="email" name="session[email]" id="session_email">

     thats a webelement

     -tagName : input
     most of the time its the first keyword

     -attribute : type, class, placeholder, data-test, name, id
     attribute lerden sonra "=" sembolu olur

     -value: email, form-control, Email, email, session[email], session_email


    findElement()    >> to find element
    findElements()   >> to find elements
    click()          >> to click an element
    sendKeys()       >> bir webelement in icine yazi yazar

    driver.manage().timeouts().implicitlyWait([insert time]); >> bekle komutu

                ==locators==
    webelement leri bulmamiza yarayan 8 farkli location bulucu
    1)id    2)name    3) className    4) tagName     5) linkText
    6) partialLinkTExt     7) xpath    8) css
    >>we gonna use one of them to find an element

    1) id
    if element have id attribute, we can use it to find them
    e.g.
    <a id="sign-in" class="nav-item nav-link"
     data-test="sign-in" href="/sign_in">Sign in</a>
     tagName: a
     attributes: id, class, data-test, href



    */

}
