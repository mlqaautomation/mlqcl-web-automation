package mlhuillier.qcl.testSteps.testExecution;

import mlhuillier.qcl.pageObject.LoginPage;
import mlhuillier.qcl.testSteps.BaseClass;
import mlhuillier.qcl.utilities.TOTPGenerator;
import org.openqa.selenium.WebDriver;

import static mlhuillier.qcl.testSteps.BaseClass.accountCredential;
import static mlhuillier.qcl.utilities.Utilities.*;
import static mlhuillier.qcl.utilities.Utilities.verifyElementPresentAndClick;

public class TestExecutionUtils extends BaseClass {
    public static WebDriver driver = getWebDriver();
    public static String originalWindowHandle = driver.getWindowHandle();


    public static void  signInWithGoogle(String email, String password) throws Exception {
        waitTime(2000);
        click( LoginPage.kpxlogin , "Click the Log in KPX");
        verifyElementPresent(LoginPage.googleSign, "google sign in");
        click(LoginPage.googleSign, "google sign in btn");
        waitTime(2000);
        String handle = originalWindowHandle;
        driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
        waitTime(3000);
        verifyElementPresent(LoginPage.email_google, "email input");
        type(LoginPage.email_google, email, "email inputted");
        click(LoginPage.nextBtn_google, "next btn");
        verifyElementPresent(LoginPage.password_google, "password input");
        waitTime(2000);
        type(LoginPage.password_google, password, "password inputted");
        click(LoginPage.nextBtn_google, "next btn");
//        scrollToBottomOfPageWEB ();
        if(verifyElementPresent ( LoginPage.try_another_way_google, "another way option" )){
            click (LoginPage.try_another_way_google, "another way option");
            verifyElementPresentAndClick(LoginPage.enter_back_up_codes_google, " Google Authenticator");
        }else{
            verifyElementPresentAndClick(LoginPage.enter_back_up_codes_google, " Google Authenticator");
        }

//
//
//
//        if(verifyElementPresent(LoginPage.fieldAttempts,"Error Message")){
//            waitTime(5000);
//            scrollToBottomOfPageWEB();
//            click (LoginPage.enter_back_up_codes_google, "Authenticator");
//
//        }else {
//            verifyElementPresentAndClick(LoginPage.try_another_way_google, "another way option");
//            waitTime(4000);
//            scrollToBottomOfPageWEB();
//            click(LoginPage.enter_back_up_codes_google, "Authenticator");
////        verifyElementPresentAndClick(LoginPage.enter_back_up_codes_google, "Authenticator");
//            waitTime(2000);
//        }


        verifyElementPresent(LoginPage.input_back_up_codes_google, "backup code input text");
        waitTime(2000);
        driver.findElement(LoginPage.input_back_up_codes_google).sendKeys( TOTPGenerator.getTwoFactorCode());
        click(LoginPage.nextBtn_google, "next btn");
        waitTime(2000);
    }

    public static void signInQCL(String kpxusername, String kpxpassword) throws Exception {

        driver.switchTo().window(originalWindowHandle);
        verifyElementPresent(LoginPage.LoginText, "Login Page Header");
        click(LoginPage.kpxusername, "usernamme");
        type(LoginPage.kpxusername, kpxusername, "username inputted");
        click(LoginPage.kpxpassword, "kpxpassword");
        type(LoginPage.kpxpassword, kpxpassword, "password inputted");
        click(LoginPage.kpxlogind, "click login");
    }

    public static void kpxusernameinput(String kpxusername) throws Exception {
        driver.switchTo().window(originalWindowHandle);
        verifyElementPresent(LoginPage.LoginText, "Login Page Header");
        click(LoginPage.kpxusername, "usernamme");
        type(LoginPage.kpxusername, kpxusername, "username inputted");
    }

    public static void kpxpasswordinput(String kpxpassword) throws Exception {
        click(LoginPage.kpxpassword, "kpxpassword");
        type(LoginPage.kpxpassword, kpxpassword, "password inputted");
        click(LoginPage.kpxlogind, "click login");
    }



}

