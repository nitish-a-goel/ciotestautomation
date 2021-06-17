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

'Login'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://login.microsoftonline.com/common/oauth2/authorize?response_type=id_token&client_id=5bb7c187-5e6e-4f54-8e58-2bc436b1be40&redirect_uri=https%3A%2F%2Fmmc2-perf.ciotest.accenture.com&state=4954555e-54e8-475b-bfb0-ea47f07363c1&client-request-id=b915b714-ab5a-43fe-bb2f-1a54ffc0c496&x-client-SKU=Js&x-client-Ver=1.0.17&nonce=d1a895a8-1561-4884-9b8f-b9dcbfe9e84f')

WebUI.waitForElementPresent(findTestObject('Object Repository/Navigatepages/Page_Sign in to your account/input_Sign in_loginfmt'), 
    30)

WebUI.setText(findTestObject('Object Repository/Navigatepages/Page_Sign in to your account/input_Sign in_loginfmt'), 'T27354.ORION.001@ds.dev.accenture.com')

WebUI.waitForElementPresent(findTestObject('Object Repository/Navigatepages/Page_Sign in to your account/input_Create one_idSIButton9'), 
    30)

WebUI.click(findTestObject('Object Repository/Navigatepages/Page_Sign in to your account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Sign In/input_Sign in with your organizational acco_04b8f7'), 
    'iENwFAOhN6WaM1JNT/i2GYBOzQ8b4zEi')

WebUI.click(findTestObject('Object Repository/Login/Page_Sign In/span_Sign in'))

'Login'
WebUI.click(findTestObject('Object Repository/Navigatepages/Page_Sign in to your account/input_Create one_idSIButton9'))

'Home Page'
WebUI.delay(10)

WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Home Page'
WebUI.delay(10)

//'Home Page'
//WebUI.click(findTestObject('Navigatepages/Page_MMC Next Gen/Page_MMC Next Gen/img_TESTING ALERT BAR_acn-alert-close-icon'))
'Load Delivery Dashboard'
WebUI.mouseOver(findTestObject('Navigatepages/HealthScore'))

WebUI.click(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_Delivery Dashboard'))

//WebUI.delay(10)
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Delivery Dashboard'
WebUI.delay(10)

'Load No LBA Dashboard'
WebUI.mouseOver(findTestObject('Navigatepages/HealthScore'))

WebUI.click(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_No LBA Dashboard'))

//WebUI.delay(10)
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load No LBA Dashboard'
WebUI.delay(10)

'Load Reporting'
WebUI.mouseOver(findTestObject('Navigatepages/HealthScore'))

WebUI.click(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_Reporting'))

//WebUI.delay(10)
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Reporting'
WebUI.delay(10)

'Load Risk and Issues'
WebUI.click(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_Risks  Issues'))

//WebUI.delay(10)
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Risk and Issues'
WebUI.delay(10)

'Load DO'
WebUI.clickOffset(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_D  O'), 3, 3)

WebUI.delay(10)

'Load DO'
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Contracting Status'
WebUI.delay(10)

//'Load Contracting Status'
//WebUI.waitForElementClickable(findTestObject('Navigatepages/Page_MMC Next Gen/a_Contracting Status'), 120)
WebUI.clickOffset(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_Contracting Status'), 4, 3)

//WebUI.delay(10)
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Contracting Status'
WebUI.delay(10)

'Load Manage Page'
WebUI.click(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/span_Manage'))

//WebUI.delay(10)
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Manage Page'
WebUI.delay(10)

'Load Manage Access'
WebUI.click(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_Manage AccessAssignment'))

//WebUI.delay(10)
WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Manage Access'
WebUI.delay(10)

'Load Portfolio'
WebUI.click(findTestObject('Object Repository/Navigatepages/Page_MMC Next Gen/a_Portfolio'))

WebUI.waitForElementNotPresent(findTestObject('Navigatepages/FullScreenLoading'), 120)

'Load Portfolio'
WebUI.delay(10)

WebUI.closeBrowser()

