package mainFunctionalities;

import mainFunctionalities.ImdbAutomationScript;

public class Main {
    public static void main(String[] args) throws Exception {
        //Driver paths
        System.setProperty("webdriver.chrome.driver", "/Users/ujjwal.jain/IdeaProjects/imdbAutomation/driver/chromedriver");



        //Base URL of testing website
          String WebUrl = "https://www.imdb.com/";

        
        // initializing automation script which contain main testing script function
        ImdbAutomationScript imdbAutomationScript=new ImdbAutomationScript();

       // launching testing website
         imdbAutomationScript.launchWebsite(WebUrl);
      // verifying we are landed on derired page
         imdbAutomationScript.verifyHomePageTitle();
      // running main testing script
         imdbAutomationScript.runScript();
        
        
        
        
        
        
        
//        System.setProperty("webdriver.chrome.driver", driverPathChromeDriver);
//        System.setProperty("webdriver.chrome.driver", driverPathSafariDriver);

//        CrossBrowserScript crossBrowserScript = new CrossBrowserScript();
//        crossBrowserScript.setup();
//.       imdbAutomationScript.crossBrowser("Chrome");        
//        imdbAutomationScript.launchBrowser(baseUrl);
//        imdbAutomationScript.verifyHomePageTitle();
//        imdbAutomationScript.runScript();runScript
    }
}
