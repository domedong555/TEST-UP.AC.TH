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
WebUI.click(findTestObject('Footer/Related links/00widgettitle'))
WebUI.verifyTextPresent(GlobalVariable.G_widgettitle, false)

WebUI.delay(2)

'คลิก สำนักงานคณะกรรมการการอุดมศึกษา และ แสดงหน้าสำนักงานคณะกรรมการการอุดมศึกษา '
//Check Office of the Higher Education Commission
WebUI.verifyElementPresent(findTestObject('Footer/Other links/02ministry'),10)
WebUI.click(findTestObject('Footer/Other links/02ministry'))


WebUI.delay(2)

'เปลี่ยน tab'
WebUI.switchToWindowIndex(1)
WebUI.delay(1)
//Check text
WebUI.click(findTestObject('Object Repository/Footer/Other links/Enter Site'))
WebUI.verifyTextPresent('กระทรวงการอุดมศึกษา วิทยาศาสตร์ วิจัยและนวัตกรรม ', false)

WebUI.closeBrowser()