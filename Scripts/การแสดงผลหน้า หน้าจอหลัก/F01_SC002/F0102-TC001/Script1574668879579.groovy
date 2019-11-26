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

WebUI.openBrowser('')

'แสดงหน้า "หน้าจอหลัก"'
WebUI.navigateToUrl('https://www.up.ac.th/th/')

WebUI.maximizeWindow()

WebUI.delay(3)

'ตรวจสอบการแสดงผลของรูป'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Slide Pictures'), 20)

'ตรวจสอบว่าสามารถเปลี่ยนเป็นรูปถัดไป'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Picturebtn_prev'))

WebUI.click(findTestObject('Show Homepage/Picturebtn_prev'))

WebUI.delay(3)

'ตรวจสอบว่าสามารถเปลี่ยนเป็นรูปถัดไป'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Picturebtn_next'))

WebUI.click(findTestObject('Show Homepage/Picturebtn_next'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

