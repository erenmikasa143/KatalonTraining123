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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.mims.com/')

WebUI.click(findTestObject('Object Repository/Page_Search Drug Information, Interactions,_4fc15c/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in with your MIMS Account/input_Email_EmailAddress'), 'daniella.orozco@mims.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in with your MIMS Account/input_Password_Password'), 
    'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Page_Sign in with your MIMS Account/button_Sign in with Email'))

WebUI.click(findTestObject('Object Repository/Page_Search Drug Information, Interactions,_4fc15c/a_Find Drugs'))

WebUI.setText(findTestObject('Object Repository/Page_Search Drug Information  MIMS Philippines/input_Advanced Search_searchHome'), 
    'parace')

WebUI.click(findTestObject('Object Repository/Page_Search Drug Information  MIMS Philippines/div_Paracetamol'))

WebUI.click(findTestObject('Object Repository/Page_Search Drug Information  MIMS Philippines/button_SEARCH'))

WebUI.click(findTestObject('Object Repository/Page_ParacetamolDrug Search  MIMS Philippines/a_Find Drug Company'))

WebUI.setText(findTestObject('Object Repository/Page_Search Company Information  MIMS Philippines/input_Find Companies  MIMS Philippines_searchBox'), 
    'pfizer')

WebUI.click(findTestObject('Object Repository/Page_Search Company Information  MIMS Philippines/div_Pfizer'))

WebUI.click(findTestObject('Object Repository/Page_Search Company Information  MIMS Philippines/button_SEARCH'))

WebUI.click(findTestObject('Object Repository/Page_Find Drug Company  MIMS Philippines/span_Daniella'))

WebUI.click(findTestObject('Object Repository/Page_Find Drug Company  MIMS Philippines/a_Sign Out'))

WebUI.click(findTestObject('Object Repository/Page_MIMS Authentication/a_here'))

WebUI.closeBrowser()

