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
import org.openqa.selenium.Keys as Keys

'แสดงหน้า หน้าจอหลัก'
WebUI.openBrowser(GlobalVariable.G_Intro_policyurl)
WebUI.maximizeWindow()
WebUI.delay(1)

'แสดงปุ่มต่อจากแถบเมนู "เกี่ยวกับเรา"'
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC003/เกี่ยวกับเรา'))
WebUI.delay(1)

// check Intro_welcome
WebUI.verifyTextPresent(GlobalVariable.G_Intro_policyIntro_welcome, false)
WebUI.delay(1)

'แสดงหน้าจอ สารจากอธิการบดี'
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC003/สารจากท่านอธิการบดี'))
WebUI.delay(2)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC003/เจตจำนง'))
WebUI.delay(2)

///check video present
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC003/video'), 20)
WebUI.delay(2)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC003/ภาษาไทย'))
WebUI.delay(2)

///check thai language document
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC003/ภาษาไทย'), 20)
WebUI.delay(2)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC003/ภาษาอังกฤษ'))
WebUI.delay(2)

///check thai language document
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC003/ภาษาอังกฤษ'), 20)
WebUI.delay(2)

WebUI.closeBrowser()

