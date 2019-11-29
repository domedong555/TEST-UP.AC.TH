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
WebUI.navigateToUrl(GlobalVariable.G_url)

WebUI.maximizeWindow()

WebUI.delay(3)

'แสดงแถบเมนู\r\n-แนะนำการใช้งาน\r\n-อีเมล์สำหรับบุคลากร\r\n-คู่มือและมาตรฐานการปฏิบัติงาน\r\n-คู่มือการให้บริการ\r\n-การให้บริการ\r\n-นโยบายการบริหารทรัพยากรบุคคล\r\n-คู่มือและมาตรฐาน มคอ.\r\n-สวัสดิการ\r\n-การเงิน'
WebUI.click(findTestObject('แสดงผลแถบเมนู/personel/personal_intro/บุคลากร'))

WebUI.verifyTextPresent(GlobalVariable.G_personal_intro, false)

WebUI.verifyTextPresent(GlobalVariable.G_mail, false)

WebUI.verifyTextPresent(GlobalVariable.G_manual, false)

WebUI.verifyTextPresent(GlobalVariable.G_manual2, false)

WebUI.verifyTextPresent(GlobalVariable.G_service, false)

WebUI.verifyTextPresent(GlobalVariable.G_policy, false)

WebUI.verifyTextPresent(GlobalVariable.G_manualUP, false)

WebUI.verifyTextPresent(GlobalVariable.G_Benefits, false)

WebUI.verifyTextPresent(GlobalVariable.G_finance, false)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

