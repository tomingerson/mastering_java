package de.fh_kiel.mastering_java.session10

import geb.Browser

// example code taken from http://www.gebish.org/manual/current/#inline-scripting
Browser.drive {
    go "http://gebish.org"

    assert title == "Geb - Very Groovy Browser Automation"

    $("div.menu a.manuals").click()
    waitFor { !$("#manuals-menu").hasClass("animating") }

    $("#manuals-menu a")[0].click()

    assert title.startsWith("The Book Of Geb")
}
