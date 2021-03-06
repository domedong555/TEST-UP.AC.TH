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

'แสดงหน้าผลงานวิจัย / บทความวิจัย\r\n-ผลงานวิจัย\r\n-วันที่ลง\r\n-จำนวนคนดู\r\n-ภาพเกี่ยวกับบทความ\r\n--มีหัวข้อใต้ภาพ\r\n-ด้านต่างๆที่แสดง #'
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Research/imganddetail1'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Research/imganddetail2'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Research/imganddetail3'), 20)

WebUI.verifyElementPresent(findTestObject('Show Homepage/Research/imganddetail4'), 20)

WebUI.waitForElementClickable(findTestObject('Show Homepage/Research/Allresearch_News'), 20)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

