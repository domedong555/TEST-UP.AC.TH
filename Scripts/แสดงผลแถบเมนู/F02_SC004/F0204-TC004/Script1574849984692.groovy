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
///check menu collegian
WebUI.verifyTextPresent(GlobalVariable.G_collegian, false)

WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/collegian/Intro_student/นิสิตปัจจุบัน'))
WebUI.delay(1)

///check menu mail_student
WebUI.verifyTextPresent(GlobalVariable.G_mail_student, false)
WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/collegian/mail_student/อีเมล์สำหรับนิสิต'),20)
WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/collegian/mail_student/อีเมล์สำหรับนิสิต'))
WebUI.delay(2)


'Switch to Documentation window'
WebUI.switchToWindowIndex(1)

///check page mail_student

if (WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/Sign'),20) == true){
   WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/Sign'))
   WebUI.delay(2)
   WebUI.setText(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/Sign'),'61021459@up.ac.th')
   WebUI.delay(2)
   WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/Next to Password'))
   WebUI.delay(2)
   WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/Password'))
   WebUI.setText(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/Password'),'@Tt0638256132')
   WebUI.delay(2)
   WebUI.click(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/Go to mail page'))
   WebUI.delay(2)
   WebUI.click(findTestObject('แสดงผลแถบเมนู/collegian/mail_student/Stay signed in'))
   WebUI.delay(2)
   WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/check offer'),20)
   WebUI.delay(2)
   }else{
   WebUI.verifyElementPresent(findTestObject('Object Repository/แสดงผลแถบเมนู/collegian/mail_student/check offer'),20)}
   WebUI.delay(2)
   
WebUI.closeBrowser()