# Blinds_challenge

Using Selenium with TestNG 
I've created a page object model with pages : BlindsHomePage and BlindsFinderPage
Created tests package for writing test cases to find the cheap blinds
Utilities has resusable action such as Explicit wait to help with code redundancy

In Page Object classes,

BlindsHomePage,
invoked the browser
finding the webelement such as startSearching button and its corresponding method


In BlindsFinderPage
Finding different webelements which include letsGetStarted, windowCoveringYes,
WindowCoveringNext, priceFocused (radiobuttons) and their corresponding methods


Created  Searchingcheapblinds() Method where we click letsgetstarted button
and moving forward we select using getwindowCoveringYes.click() and to click on next button by using the method
getwindowCoveringNext.click() and then we select the option using getHeatAndColdNo().click() later the method
getHeatColdNext().click() to move forward.
Finally to select pricefocused getPriceFocused().click() and to seek the results getBestDescribesYouNext().click() method


In Page Test class

Intializing chrome browser driver from the corresponding file path
Utilizing the Implicitwait with driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
invoke the BlindsHomePage by creating an instance
Calling the method searchingCheapBlinds() by creating instance 
storing the results in an Arraylist by calling getBlindsRatesList() in for each loop
Converting the list of strings to float and stored as RateList
Using Collections.sort(sortList) , we sort the price list in ascending order
Using boolean sorted = sortList.equals(rateList) we have compared both the lists
Finally validating using assertion assertTrue(sorted)

@AfterTest
To close the browser after execution comes to an end


Steps to run 

Right click and select run as TestNG
should display the testNG results with reports

