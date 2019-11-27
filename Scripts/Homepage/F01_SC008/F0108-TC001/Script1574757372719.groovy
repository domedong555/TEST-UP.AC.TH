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

'แสดงหน้า บทความอื่นๆ\r\n- มีการแสดงรูป 2 รูป\r\n -มีหัวข้อใต้ภาพ\r\n- แสดงวันที่\r\n-แสดงจำนวนคนดู\r\n- แสดงประเภท #'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Article/articleimg1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Article/articletitle1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Article/articledetail1'), 20)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Article/articleimg2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Article/articletitle2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Article/articledetail2'), 20)

'แสดงหน้า บทความอื่นๆ\r\n- สามารถกดดู บทความทั้งหมด ด้านข้างหัวข้อได้'
WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Show Homepage/Article/AllArticle'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

