import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("")
WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), "Admin")
WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), "hUKwJTbofgPU9eVlw/CnDQ==", FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
WebUI.verifyTextPresent('Dashboard', false)
WebUI.closeBrowser()