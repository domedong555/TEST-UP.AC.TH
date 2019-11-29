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
WebUI.delay(1)

'แสดงปุ่มต่อจากแถบเมนู "เกี่ยวกับเรา"'
WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Organizational/เกี่ยวกับเรา'))
WebUI.delay(1)
///Check  Menu Administrator
WebUI.verifyTextPresent(GlobalVariable.G_Administrator, false)
WebUI.delay(2)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Administrator/ผู้บริหารมหาวิทยาลัยพะเยา'))
WebUI.delay(1)
///Check menu Council
WebUI.verifyTextPresent("กรรมการสภามหาวิทยาลัย", false)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Administrator/กรรมการสภามหาวิทยาลัย'))
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Administrator/รูปนายกสภามหาวิทยาลัยพะเยา'))
WebUI.delay(1)
///check page Council
WebUI.verifyTextPresent("เกี่ยวกับ มพ. > กรรมการสภามหาวิทยาลัย", false)
WebUI.delay(1)
WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Administrator/คณะกรรมการ'))
WebUI.delay(2)
WebUI.closeBrowser()