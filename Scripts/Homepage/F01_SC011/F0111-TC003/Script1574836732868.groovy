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
WebUI.click(findTestObject('Navbar/F02_SC001/F0201-TC001/เกี่ยวกับเรา'))
=======
'แสดงแถบเมนู\r\n-วัฒนธรรมองค์กร\r\n-ประมวลจริยธรรม และคุณธรรมของบุคลากร'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC001/F0201-TC001/เกี่ยวกับเรา'))
>>>>>>> branch 'master' of https://github.com/domedong555/TEST-UP.AC.TH.git

WebUI.verifyTextPresent(GlobalVariable.G_Administrator, false)

WebUI.click(findTestObject('Navbar/F02_SC001/F0201-TC012/วัฒนธรรมองค์กร'))

WebUI.verifyElementPresent(findTestObject('Navbar/F02_SC001/F0201-TC012/วัฒนธรรมองค์กร tab'), 0)

WebUI.verifyElementPresent(findTestObject('Navbar/F02_SC001/F0201-TC013/ประมวลจริยธรรม และคุณธรรมของบุคลากร'), 0)

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

