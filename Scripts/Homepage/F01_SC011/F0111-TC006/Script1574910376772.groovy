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

'แสดงแถบเมนูู\r\n-นโยบายการบริหารทรัพยากรบุคคล\r\n-การดำเนินการตามนโยบายการบริหารทรัพยากรบุคคล\r\n-หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล\r\n-รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี'
WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC001/บุคลากร'))

WebUI.delay(1)

WebUI.click(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC008/นโยบายการบริหารทรัพยากรบุคคล'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC008/หน้านโยบายการบริหาร'), 'นโยบายการบริหารทรัพยากรบุคคล')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC008/หน้านโยบายการบริหาร'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC009/การดำเนินการตามแผน'), 'การดำเนินการตามนโยบายการบริหารทรัพยากรบุคคล')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC009/การดำเนินการตามแผน'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC010/หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล'), 'หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC010/หลักเกณฑ์การบริหารและพัฒนาทรัพยากรบุคคล'))

WebUI.verifyElementText(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC011/รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี'), 
    'รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี')

WebUI.verifyElementClickable(findTestObject('แสดงผลแถบเมนู/F02_SC003/F0203-TC011/รายงานผลการบริหารและพัฒนาทรัพยากรบุคคลประจำปี'))

WebUI.delay(3)

'ปิดหน้าเว็บ'
WebUI.closeBrowser()

