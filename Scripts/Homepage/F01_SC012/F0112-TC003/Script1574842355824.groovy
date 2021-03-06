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

'แสดงแถบเมนู\r\n-ผลงานตีพิมพ์เผยแพร่\r\n-ฐานข้อมูลงานวิจัย\r\n-1 คณะ 1 โมเดล\r\n-โครงการวิจัย'
WebUI.click(findTestObject('Show Homepage/Research Objects/research'))

WebUI.verifyElementText(findTestObject('Show Homepage/Research Objects/publish_research'), 'ผลงานตีพิมพ์เผยแพร่')

WebUI.verifyElementText(findTestObject('Show Homepage/Research Objects/database_research'), 'ฐานข้อมูลงานวิจัย')

WebUI.verifyElementText(findTestObject('Show Homepage/Research Objects/department_research'), '1 คณะ 1 โมเดล')

WebUI.verifyElementText(findTestObject('Show Homepage/Research Objects/projects_research'), 'โครงการวิจัย')

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

