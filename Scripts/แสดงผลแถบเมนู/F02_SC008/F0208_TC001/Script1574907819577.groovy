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

'แสดงหน้าที่อยู่'
//Check address 
WebUI.verifyTextPresent(GlobalVariable.G_address, false)
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC008/F0208_TC001/address'))
WebUI.delay(1)

'แสดงหน้าแผนที่ที่มหาวิทยาลัยตั้งอยู่'
//Check Text
WebUI.verifyTextPresent('มหาวิทยาลัยพะเยา', false)
WebUI.delay(2)

'แสดงแผนที่ภายในมหาวิทยาลัย'
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC008/F0208_TC001/map'))
//Check Text
WebUI.verifyTextPresent('แผนที่ผังมหาวิทยาลัยพะเยา', false)
WebUI.delay(2)

WebUI.closeBrowser()

















