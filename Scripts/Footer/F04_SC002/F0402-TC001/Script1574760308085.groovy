<<<<<<< HEAD
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'แสดง หน้าจอหลัก'
WebUI.openBrowser(GlobalVariable.G_url)
WebUI.maximizeWindow()

WebUI.delay(2)

'แสดงเมนู ลิ้งที่เกี่ยวข้อง'
//Check widget-title menu
WebUI.verifyTextPresent(GlobalVariable.G_widgettitle, false)
WebUI.click(findTestObject('Footer/F04-SC001/aside'))

WebUI.delay(2)

'คลิก สมาคมอธิการบดีแห่งประเทศไทย และ แสดงหน้า สมาคมอธิการบดีแห่งประเทศไทย'
//Check Association of Chancellors of Thailand
WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/F04-SC002/TC001/01'),10)
WebUI.click(findTestObject('Object Repository/Footer/F04-SC002/TC001/01'))


WebUI.delay(20)

=======
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'แสดง หน้าจอหลัก'
WebUI.openBrowser(GlobalVariable.G_url)
WebUI.maximizeWindow()

WebUI.delay(2)

'แสดงเมนู ในส่วนของ footer'
//Check widget-title menu
WebUI.click(findTestObject('Footer/footer/widgettitle'))
WebUI.verifyTextPresent(GlobalVariable.G_widgettitle, false)

WebUI.delay(2)

'คลิก สมาคมอธิการบดีแห่งประเทศไทย และ แสดงหน้า สมาคมอธิการบดีแห่งประเทศไทย'
//Check Association of Chancellors of Thailand
WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/F04-SC002/TC001/01'),10)
WebUI.click(findTestObject('Object Repository/Footer/F04-SC002/TC001/01'))


WebUI.delay(5)

>>>>>>> branch 'master' of https://github.com/domedong555/TEST-UP.AC.TH.git
WebUI.closeBrowser()