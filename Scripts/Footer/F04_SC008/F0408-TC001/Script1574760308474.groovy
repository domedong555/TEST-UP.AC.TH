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

"แสดง หน้าจอหลัก"
WebUI.openBrowser(GlobalVariable.G_url)
WebUI.maximizeWindow()

WebUI.delay(2)

'แสดงเมนู ในส่วนของ footer'
//check widget-title menu
WebUI.verifyTextPresent(GlobalVariable.G_widgettitle, false)
WebUI.click(findTestObject('Footer/footer/widgettitle'))

WebUI.delay(2)

"คลิก รูปมหาวิทยาลัยพะเยา  และ แสดงหน้า หน้าจอหลัก   "
//check home icon
WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/F04_SC008/TC001/home'),10)
WebUI.click(findTestObject('Object Repository/Footer/F04_SC008/TC001/home'))


WebUI.delay(10)

WebUI.closeBrowser()