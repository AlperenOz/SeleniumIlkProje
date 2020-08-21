package com.techproed;

public class Day04__Notes {
    /*
    NoSuchElementException :
    id yanlis locate edilince olusur

    getText() :
    gets the text of the specified element

    =name=
    name is most of the time unique, use if theres no id

    =By.classname=
    if there are more than one class as a value, dont use it
    e.g.
    <input type="submit" name="commit" value="Sign in" class="btn btn-primary"
     data-test="submit" data-disable-with="Sign in">

     class has "btn btn-primary" so dont use it, there are 2 classes inside

     == By.linkText ==
     use the exact name of the link appears in the page
     if there are two links with the same name, the first one works

     == By.partialLinkText ==
     can use part of the link appears in the page
     e.g. >> a link named "Home" can be searched by BypartialLinkText("H")
     if theres no other link that has "H" then its all good

     == By.tagName ==
     use the tagName

     */
}
