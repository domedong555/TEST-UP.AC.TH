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

///Check menu  personel
WebUI.verifyTextPresent(GlobalVariable.G_personel, false)
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC003/F0203-TC002/บุคลากร'))
WebUI.delay(1)
///check menu service
WebUI.verifyTextPresent(GlobalVariable.G_service, false)
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/F02_SC003/F0203-TC002/บุคลากร'))
WebUI.delay(1)
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/การให้บริการ'))
WebUI.delay(1)
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/การให้บริการ'), 20)
WebUI.delay(1)
///
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/ข้อมูลเชิงสถิติการให้บริการตามภารกิจของมหาวิทยาลัยพะเยา'),20)
WebUI.delay(1)
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/ข้อมูลเชิงสถิติการให้บริการตามภารกิจของมหาวิทยาลัยพะเยา'))
WebUI.delay(1)
///check service page
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC005 to F0203-TC007/แสดงผลหน้า ข้อมูลเชิงสถิติการให้บริการ'),20)
WebUI.delay(1)

WebUI.closeBrowser()
