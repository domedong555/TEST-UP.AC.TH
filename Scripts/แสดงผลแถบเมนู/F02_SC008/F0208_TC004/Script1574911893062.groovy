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

'แสดงหน้าจอหลัก'
WebUI.openBrowser(GlobalVariable.G_url)
WebUI.maximizeWindow()

'แสดงเมนูติดต่อเรา'
//Check contact menu
WebUI.verifyTextPresent(GlobalVariable.G_contact, false)
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC008/F0208_TC001/contact'))
WebUI.delay(1)

'แสดงหน้า ช่องทางแจ้งเรื่องร้องเรียนการทุจริต '
//Check currupt
WebUI.verifyTextPresent(GlobalVariable.G_currupt ,false)
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC008/F0208_TC004/curupt'))
WebUI.delay(1)

//Check text
WebUI.verifyTextPresent('ช่องทางแจ้งเรื่องร้องเรียนการทุจริต', false)
//Check name
WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC008/F0208_TC004/name'), 10)

//Check email
WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC008/F0208_TC004/email'), 10)

//Check subject
WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC008/F0208_TC004/subject'), 10)

//Check message
WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC008/F0208_TC004/message'), 10)
WebUI.delay(1)

WebUI.closeBrowser()



