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

WebUI.navigateToUrl('https://www.up.ac.th/th/')

WebUI.maximizeWindow()

WebUI.delay(3)

<<<<<<< HEAD
'ตรวจสอบการแสดงผลของรูป'
WebUI.verifyElementPresent(findTestObject('Show Homepage/Slide Pictures Objects/Slide Pictures'), 20)
=======
WebUI.click(findTestObject('Show Homepage/Picturebtn_prev'))
>>>>>>> branch 'master' of https://github.com/domedong555/TEST-UP.AC.TH.git

<<<<<<< HEAD
'ตรวจสอบว่าสามารถเปลี่ยนเป็นรูปถัดไป'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Slide Pictures Objects/Picturebtn_prev'))
=======
WebUI.delay(1)
>>>>>>> branch 'master' of https://github.com/domedong555/TEST-UP.AC.TH.git

WebUI.click(findTestObject('Show Homepage/Slide Pictures Objects/Picturebtn_prev'))

WebUI.delay(1)

<<<<<<< HEAD
'ตรวจสอบว่าสามารถเปลี่ยนเป็นรูปถัดไป'
WebUI.verifyElementClickable(findTestObject('Show Homepage/Slide Pictures Objects/Picturebtn_next'))
=======
WebUI.click(findTestObject('Show Homepage/Picturebtn_prev'))

WebUI.delay(1)

WebUI.click(findTestObject('Show Homepage/Picturebtn_prev'))

WebUI.delay(1)

WebUI.click(findTestObject('Show Homepage/Picturebtn_prev'))

WebUI.delay(1)

WebUI.click(findTestObject('Show Homepage/Picturebtn_next'))

WebUI.delay(1)

WebUI.click(findTestObject('Show Homepage/Picturebtn_next'))

WebUI.delay(1)

WebUI.click(findTestObject('Show Homepage/Picturebtn_next'))

WebUI.delay(1)

WebUI.click(findTestObject('Show Homepage/Picturebtn_next'))

WebUI.delay(1)
>>>>>>> branch 'master' of https://github.com/domedong555/TEST-UP.AC.TH.git

WebUI.click(findTestObject('Show Homepage/Slide Pictures Objects/Picturebtn_next'))

WebUI.delay(3)

WebUI.closeBrowser()

