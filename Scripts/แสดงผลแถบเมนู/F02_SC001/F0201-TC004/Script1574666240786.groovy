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
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC001/F0201-TC004/เกี่ยวกับเรา'))
WebUI.delay(1)
///Check  Menu Intro_Organizational
WebUI.verifyTextPresent(GlobalVariable.G_Intro_policyIntro_Organizational, false)
WebUI.delay(2)

'แสดงหน้าจอ โครงสร้างองค์กร'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC004/โครงสร้างองค์กร'))
WebUI.delay(2)

///check picture 
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC004/รูปโครงสร้างองค์กร'), 20)
WebUI.delay(2)

WebUI.closeBrowser()

