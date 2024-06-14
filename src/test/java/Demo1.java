import com.microsoft.playwright.*;

public class Demo1 {
    public static void main(String[] args){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));//TRUE DERSEK BROWSER ACMADAN TEST ,FALSE OLURSA BROWSER ACIKKEN TEST

        Page page  = browser.newPage();
        page.navigate("https://www.google.com/");
        System.out.println("Hello playwright");
        //
    }
}
