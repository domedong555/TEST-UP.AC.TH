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

"แสดง ลิ้งที่เกี่ยวข้อง"
//check widget-title menu
WebUI.verifyTextPresent(GlobalVariable.G_widgettitle, false)
WebUI.click(findTestObject('Object Repository/Footer/TC001/aside'))

WebUI.delay(2)

"คลิก QA Information System และ แสดงหน้า QA information"
//check QA information system
WebUI.verifyElementPresent(findTestObject('Object Repository/Footer/TC001/QA Information System'),20)
WebUI.click(findTestObject('Object Repository/Footer/TC001/QA Information System'))

WebUI.delay(5)

WebUI.closeBrowser()

