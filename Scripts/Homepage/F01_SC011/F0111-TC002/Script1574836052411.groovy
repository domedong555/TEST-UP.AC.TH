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

'แสดงหน้า "หน้าจอหลัก"'
WebUI.navigateToUrl('https://www.up.ac.th/th/')

WebUI.maximizeWindow()

WebUI.delay(3)

'แสดงแถบเมนูู\r\n-ประวัติอธิการบดี\r\n-กรรมการสภามหาวิทยาลัย\r\n-ผู้บริหาร'
WebUI.click(findTestObject('แสดงผลแถบเมนู/About/History/เกี่ยวกับเรา'))

WebUI.verifyTextPresent(GlobalVariable.G_Administrator, false)

WebUI.click(findTestObject('แสดงผลแถบเมนู/About/Administrator/ผู้บริหารมหาวิทยาลัยพะเยา'))

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/About/Administrator/ประวัติอธิการบดี'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/About/Administrator/กรรมการสภามหาวิทยาลัย'), 0)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/About/Administrator/ผู้บริหาร'), 0)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

