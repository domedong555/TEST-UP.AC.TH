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
'แสดงหน้า หน้าจอหลัก'
WebUI.openBrowser(GlobalVariable.G_url)
WebUI.maximizeWindow()

///Check menu in manual2
WebUI.verifyTextPresent(GlobalVariable.G_manual2, false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC003/F0203-TC002/บุคลากร'))
WebUI.delay(1)

WebUI.verifyTextPresent(GlobalVariable.G_manual2, false)
WebUI.delay(1)

WebUI.navigateToUrl('https://www.up.ac.th/th/Manual2.aspx')
WebUI.delay(1)

///check manual2 page
WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC003/F0203-TC004/บุคลากร-คู่มือการให้บริการ'), 20)
WebUI.delay(1)
WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC003/F0203-TC004/คู่มือการให้บริการ'), 20)
WebUI.delay(1)

WebUI.closeBrowser()
