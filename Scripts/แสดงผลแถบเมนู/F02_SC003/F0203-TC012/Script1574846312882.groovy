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

WebUI.verifyTextPresent(GlobalVariable.G_personel, false)
WebUI.delay(1)
WebUI.click(findTestObject('แสดงผลแถบเมนู/personel/mail/บุคลากร'))
WebUI.delay(1)

///check menu manualUP
WebUI.verifyTextPresent(GlobalVariable.G_manualUP, false)
WebUI.delay(1)

WebUI.navigateToUrl('http://up2018.up.ac.th/Manual_UP.aspx')
WebUI.delay(2)

///check manualUP page
WebUI.verifyElementPresent(findTestObject('แสดงผลแถบเมนู/personel/manualUP/หน้าคู่มือและมาตรฐาน มคอ'),20)
WebUI.delay(1)

WebUI.closeBrowser()