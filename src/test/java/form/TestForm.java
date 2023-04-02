package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestForm {
    /*
Complete and automate the form as follows:
1. Select all mandatory items
2. at least 1 positive test
3. at least 1 negative test
4. The Text boxes contain max of 10 characters
    1. it can be alpha-numeric and special char
5. After form submission , make sure to validate the thank you message
//https://theautomationtechies.com/welcome-to-automation-testing/

     */



        @Test
        public void radioOne() throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.navigate().to("https://theautomationtechies.com/welcome-to-automation-testing/");


            List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
            System.out.println("Checking Assert");
            Assert.assertEquals(allRadioButtons.size(), 3);
            for (WebElement radioButton : allRadioButtons) {
                radioButton.click();
            }
//            List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//            for (WebElement checkBox : allCheckBoxes) {
//                checkBox.click();
//                Assert.assertEquals(allCheckBoxes.size(), 5);
//            }
//            Select ddm=new Select(driver.findElement(By.id("Work_from_Home_")));
//
//            for (WebElement c:ddm.getOptions()) {
//                System.out.println(c.getText());
//            }
//            System.out.println(ddm.getOptions().size());
//
//            ddm.selectByIndex(0);
//            Thread.sleep(2000);
//            ddm.selectByIndex(1);
//            Thread.sleep(2000);
//            ddm.selectByIndex(2);
//
//            //EMAIL
//
//            driver.findElement(By.id("Email")).sendKeys("speedy@gmail.com");
//
//            //CALENDAR
//
//            driver.findElement(By.id("Today_s_Date_")).sendKeys("002023/3/0025");
//
//            //TIME
//
//            driver.findElement(By.id("Current_Timestamp_")).sendKeys("1150PM");
//
//            //ENTER NUMBER
//
//            driver.findElement(By.id("Enter_any_number_between__1_to_100")).sendKeys("55");
//
//            //UPLOAD URL
//
//            driver.findElement(By.id("Favorite_Website_")).sendKeys("https://google.com");
//
//            //Paragraph
//
//            WebElement paragraph = driver.findElement(By.xpath("//*[@id=\"Paragraph__div\"]/p[2]"));
//            String paragraph2 = paragraph.getText();
//            System.out.println(paragraph2);
//
//            //UPLOAD FILE
//
//            WebElement upload_file=driver.findElement(By.xpath("//*[@id=\"File_Uploader_\"]"));
//            upload_file.sendKeys("/Users/juliakristy/Desktop/cake.jpeg");
//
//
//            //ADDRESS
//
//            driver.findElement(By.id("Fill_in_the_Address_address_line_1")).sendKeys("26 Millennium Drive");
//            driver.findElement(By.id("Fill_in_the_Address_city")).sendKeys("Toronto");
//            driver.findElement(By.id("Fill_in_the_Address_state")).sendKeys("ON");
//            driver.findElement(By.id("Fill_in_the_Address_postal_code")).sendKeys("H5G6H7");
//            driver.findElement(By.id("Fill_in_the_Address_country")).sendKeys("Canada");
//
//            //NOTE
//
//            driver.findElement(By.id("What_do_you_think_of_this_form_")).sendKeys("It was really useful practice");
//
//            //SUBMIT
//
//            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div/section/div/form/fieldset/div[14]/div/input")).click();
//
//
//            WebElement note = driver.findElement(By.xpath("/html/body/pre"));
//            String note2 = note.getText();
//            String note3 = "Rate Limit Exceeded";
//            if(note2.equalsIgnoreCase(note3)){
//                System.out.println("test passed");
//            }
//            else{
//                System.out.println("test failed");
//                Assert.fail();
//            }
            driver.quit();

        }
    }


