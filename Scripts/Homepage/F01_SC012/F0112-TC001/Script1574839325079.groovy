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

'แสดงแถบเมนู\r\n-หลักสูตรปริญญา\r\n-ผู้สนใจเข้าศึกษา\r\n-หลักสูตรที่เปิดสอน\r\n-สำหรับครูแนะแนว\r\n-หลักสูตรอบรม'
WebUI.click(findTestObject('Show Homepage/Admission Objects/admission'))

WebUI.verifyElementText(findTestObject('Show Homepage/Admission Objects/degree'), 'หลักสูตรปริญญา')

WebUI.verifyElementText(findTestObject('Show Homepage/Admission Objects/interest'), 'ผู้สนใจเข้าศึกษา')

WebUI.verifyElementText(findTestObject('Show Homepage/Admission Objects/course'), 'หลักสูตรที่เปิดสอน')

WebUI.verifyElementText(findTestObject('Show Homepage/Admission Objects/only_teacher'), 'สำหรับครูแนะแนว')

WebUI.verifyElementText(findTestObject('Show Homepage/Admission Objects/train'), 'หลักสูตรอบรม')

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

