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
WebUI.click(findTestObject('แสดงผลแถบเมนู/contact/address/contact'))
WebUI.delay(1)

'แสดงหน้า เบอร์โทรภายใน '
//Check contactnumber
WebUI.verifyTextPresent(GlobalVariable.G_contactnumber, false)
WebUI.click(findTestObject('แสดงผลแถบเมนู/contact/contactnumber/contactnumber'))
WebUI.delay(1)

//Check text
WebUI.verifyTextPresent('ลำดับ', false)
WebUI.verifyTextPresent('หน่วยงาน', false)
WebUI.verifyTextPresent('เบอร์ภายใน', false)
WebUI.delay(1)

WebUI.closeBrowser()