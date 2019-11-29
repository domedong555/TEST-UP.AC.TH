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
WebUI.navigateToUrl(GlobalVariable.G_url)

WebUI.maximizeWindow()

WebUI.delay(1)

'ตรวจสอบการแสดงผลของรูป'
WebUI.waitForElementVisible(findTestObject('Show Homepage/Slide Pictures Objects/Slide Pictures V2/UP Sign'), 20)

'ตรวจสอบว่าสามารถเปลี่ยนเป็นรูปถัดไป'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Slide Pictures Objects/Page_University of Phayao/div_next'))

WebUI.click(findTestObject('Show Homepage/Slide Pictures Objects/Page_University of Phayao/div_next'))

WebUI.delay(1)

'ตรวจสอบการแสดงผลของรูป'
WebUI.waitForElementVisible(findTestObject('Show Homepage/Slide Pictures Objects/Slide Pictures V2/Statue'), 20)

WebUI.delay(1)

'ตรวจสอบว่าสามารถเปลี่ยนเป็นรูปถัดไป'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Slide Pictures Objects/Page_University of Phayao/div_prev'))

WebUI.click(findTestObject('Show Homepage/Slide Pictures Objects/Page_University of Phayao/div_prev'))

WebUI.delay(1)

'ตรวจสอบการแสดงผลของรูป'
WebUI.waitForElementVisible(findTestObject('Show Homepage/Slide Pictures Objects/Slide Pictures V2/UP Sign'), 20)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

