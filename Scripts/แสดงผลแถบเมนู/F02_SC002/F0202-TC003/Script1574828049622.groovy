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
WebUI.openBrowser(GlobalVariable.G_Intro_policyurl)
WebUI.maximizeWindow()

///Check menu award
WebUI.verifyTextPresent(GlobalVariable.G_Intro_policyNewsTopAwardAll, false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC002/F0202-TC001 to F0202-TC003/รางวัล'))
WebUI.delay(1)

///Check NewsTopAwardAll page
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC002/F0202-TC001 to F0202-TC003/รางวัลทั้งหมด'), 20)
WebUI.delay(1)
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC002/F0202-TC001 to F0202-TC003/ช่องค้นหา'), 20)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC002/F0202-TC001 to F0202-TC003/ช่องค้นหา'))
WebUI.delay(1)
WebUI.setText(findTestObject('แสดงผลแถบเมนู/F02_SC002/F0202-TC001 to F0202-TC003/ช่องค้นหา'),"วิกัย")
WebUI.delay(10)

WebUI.closeBrowser()