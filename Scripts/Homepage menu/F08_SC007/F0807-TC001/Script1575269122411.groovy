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

"เปืด หน้าหลัก"
WebUI.openBrowser(GlobalVariable.G_url)
WebUI.maximizeWindow()


//Check Element 
WebUI.verifyElementPresent(findTestObject('Show Homepage/Graph/Graph'), 10)
WebUI.click(findTestObject('Show Homepage/Graph/Graph'))


//Check Element homepage
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage menu/graph/homepage'), 10)
//Check Element data
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage menu/graph/data'), 10)
//Check Element working
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage menu/graph/working'), 10)
//Check Element palace
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage menu/graph/palace'), 10)
//Check Element dowload
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage menu/graph/dowload'), 10)
//Check Element contact
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage menu/graph/contact'), 10)

WebUI.closeBrowser()