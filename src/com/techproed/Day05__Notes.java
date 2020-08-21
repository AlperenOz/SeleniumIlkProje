package com.techproed;

public class Day05__Notes {
    /*

    XPATH IS THE MOST IMPORTANT ONE

    xpath: typing the address to find the element


    1) Absolute  xpath (not used, but know it)
    e.g.
    html/body/div[2]/div/div/div/div/div
    this is annoying we dont gonna use it

    2) Relative xpath

    //tagName[@attribute='value'];

    e.g.
    <input type="email" class="form-control" placeholder="Email"
     data-test="email" name="session[email]" id="session_email">

     //input[@type='email']
      you can use any attribute, doesn't matter

     if there are more than 1 elements with the same attribute :
     (//input[@class='form-control'])[1] >> takes the first
     (//input[@class='form-control'])[2] >> takes the second

     OR

    add other attributes by using 'and' , 'or'
    //input[@class='form-control' and @placeholder='Password'] >> @placeholder added
    //input[@class='form-control' or @placeholder='Password']


    == note ==
    //*... >> * ignores tagName
    e.g.
    //*[@type='email'] >> calls every type='email' WebElements

    //*[.=... >> [. ignors every attribute
    e.g.
    //*[.='email'] >> calls every element that has 'email' in it
    //div[.='email'] >> calls every element that has 'email' in it with a div tag

    contains :
    //*[contains(text(),'mail')] >> finds all the elements with text 'mail' in it

     */

    /*
    CSS

    id ve class value lari kullanarak yapariz

    css is valuable when it comes to className, bc remember,
    when className has 2 values inside of it, we cant use className locator.
    so by using cssClass we can call any class with any name

    class value >> .value
    id value    >> #value

    e.g. >> #session_email

    we can put tagName at the beginning if we want to be more certain
    e.g. >> input#session_email


    also:
    "tagName[attribute name='value']" da kullanilabilir
    ama bunu yazmaktansa xpath kullanmak daha iyi

     */
}
