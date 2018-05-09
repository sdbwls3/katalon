import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.sun.xml.internal.ws.org.objectweb.asm.Label as Label

WebUI.openBrowser('g5stdhwanta7.godomall.com')

WebUI.click(findTestObject('TOP/top_navi/header_login'))

'ID입력\r\n'
WebUI.setText(findTestObject('Page/login/Page login/input_loginId'), 'hwanta')

'비밀번호 틀림 입력\r\n'
WebUI.setText(findTestObject('Page/login/Page login/input_loginPwd'), '7894561231')

WebUI.click(findTestObject('Page/login/Page login/button_login'))

WebUI.delay(2)

WebUI.acceptAlert()

'ID입력\r\n'
WebUI.setText(findTestObject('Page/login/Page login/input_loginId'), 'hwanta')

'비밀번호 입력\r\n'
WebUI.setText(findTestObject('Page/login/Page login/input_loginPwd'), '789456123w')

WebUI.click(findTestObject('Page/login/Page login/button_login'))

'로그아웃 클릭\r\n'
WebUI.click(findTestObject('TOP/top_navi/header_logout'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('TOP/top_navi/header_login'))

'아이디 체크 확인 부분 추후 처리'

