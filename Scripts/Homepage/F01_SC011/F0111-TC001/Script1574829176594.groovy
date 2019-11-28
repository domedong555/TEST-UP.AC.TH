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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.up.ac.th/th/')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Navbar/F02_SC001/F0201-TC001/เกี่ยวกับเรา'))

WebUI.verifyTextPresent(GlobalVariable.G_history, false)

WebUI.verifyTextPresent(GlobalVariable.G_Symbol, false)

WebUI.verifyTextPresent(GlobalVariable.G_Intro_welcome, false)

WebUI.verifyTextPresent(GlobalVariable.G_Intro_Organizational, false)

WebUI.verifyTextPresent(GlobalVariable.G_Administrator, false)

WebUI.verifyTextPresent(GlobalVariable.G_Intro_Authority, false)

WebUI.verifyTextPresent(GlobalVariable.G_Intro_About2, false)

WebUI.verifyTextPresent(GlobalVariable.G_Intro_Strategic, false)

WebUI.verifyTextPresent(GlobalVariable.G_Intro_etc, false)

WebUI.verifyTextPresent(GlobalVariable.G_Culture, false)

WebUI.verifyTextPresent(GlobalVariable.G_Intro_Rule, false)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

