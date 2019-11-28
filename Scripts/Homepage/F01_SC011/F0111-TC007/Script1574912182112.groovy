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

<<<<<<< HEAD
WebUI.click(findTestObject('Navbar/F02_SC004/F0204-TC001/นิสิตปัจจุบัน'))
=======
'แสดงแถบเมนู\r\n-แนะนำน้อง "นิสิตปัจจุบัน"\r\n-คู่มือนิสิต\r\n-คู่มือหรือมาตรฐานการให้บริการ\r\n-อีเมล์สำหรับนิสิต\r\n-วิชาการ\r\n-กิจกรรม\r\n-ทุนการศึกษา'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC004/F0204-TC001/นิสิตปัจจุบัน'))
>>>>>>> branch 'master' of https://github.com/domedong555/TEST-UP.AC.TH.git

WebUI.verifyTextPresent(GlobalVariable.G_Intro_student, false)

WebUI.verifyTextPresent(GlobalVariable.G_Student_manual, false)

WebUI.verifyTextPresent(GlobalVariable.G_Fidelity, false)

WebUI.verifyTextPresent(GlobalVariable.G_mail_student, false)

WebUI.verifyTextPresent(GlobalVariable.G_reg, false)

WebUI.verifyTextPresent(GlobalVariable.G_dsa, false)

WebUI.verifyTextPresent(GlobalVariable.G_scholarship, false)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

