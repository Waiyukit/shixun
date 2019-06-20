package cn.edu.hebtu.software.appiumdemo11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class MyClass {
    AndroidDriver<WebElement> driver;
//       by 韦宇杰 2019.6.12
    @BeforeMethod
    public void bm() throws MalformedURLException {
        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot+"/apps");
//        File app = new File(appDir.getCanonicalPath(), "todolist.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "127.0.0.1:62001");

        capabilities.setCapability("noReset", true);//保留历史数据

        capabilities.setCapability("appPackage", " cn.edu.hebtu.software.easytour_main");
        capabilities.setCapability("appActivity", ".MainActivity");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @Test
    //查看“我的”，点击名字，修改个人资料并保存
    public void gainicheng(){
        driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"我的\")").click();
        driver.findElement(By.id("personal_data")).click();//打开个人资料
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"支持4-10个中英文、数字、下划线\")").sendKeys("测试昵称");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"保存\")").click();
        System.out.println("修改昵称保存个人资料");
    }

    @Test
    //打开APP主页，行程
    public void shoyetuijian(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"首页\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"行程\")").click();
        System.out.println("打开主页+行程");

    }

    @Test
    //查看消息里的具体动态
    public void chakanxiaoxi(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"消息\")").click();
        driver.findElement(By.id("tv_center2")).click();
        System.out.println("查看消息动态");

    }

    @Test
    //在聊天窗口回复信息
    public void chakanliaotian(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"消息\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"聊天\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"你好\")").click();
        driver.findElement(By.id("et_chat_message")).sendKeys("耶耶耶耶耶耶耶耶耶耶耶");
        driver.findElement(By.id("btn_chat_message_send")).click();
        System.out.println("查看聊天窗口并回复");

    }
    @Test
    //查看@我的消息
    public void chakanatwode(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"消息\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"@我的\")").click();

        System.out.println("查看@我的消息");

    }
    @Test
    //查看给我点赞的消息
    public void chakandianzan(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"消息\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"点赞\")").click();

        System.out.println("查看给我点赞的消息");

    }

    @Test
    //查看通知
    public void chakantongzhi(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"消息\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"通知\")").click();

        System.out.println("查看通知");

    }
    @Test
    //添加行程，查询活动
    public void tianjiaxingcheng(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"行程\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"+添加行程\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"活动\")").click();
        driver.findElement(By.id("et_text1")).sendKeys("看电影");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"加入行程\")").click();
        System.out.println("添加行程-活动");
    }

    @Test
    //查看添加行程里的每一项标题
    public void tianjiaxingchengchakan(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"行程\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"+添加行程\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"景点\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"酒店\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"机票\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"火车\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"短信\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"活动\")").click();
        System.out.println("查看添加行程");

    }
    @Test
    //查看历史行程
    public void lishixingcheng(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"行程\")").click();
        driver.findElement(By.className("android.widget.TextView")).click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"历史行程\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"最近浏览记录\")").click();
        System.out.println("查看历史行程");

    }
    @Test
    //查看身份认证
    public void shenfenrenzheng(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"行程\")").click();
        driver.findElement(By.className("android.widget.TextView")).click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"身份认证\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"认证身份证\")").click();
        System.out.println("身份认证");

    }
    @Test
    //导入日历
    public void daorurili(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"行程\")").click();
        driver.findElement(By.className("android.widget.TextView")).click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"导入日历\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"知道了\")").click();
        System.out.println("导入日历");

    }

    @Test
    //退出登录，无法在夜神模拟器进行
    public void tuichudenglu(){
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"我的\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"设置\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"退出登录\")").click();
        System.out.println("退出登录");

    }

}

