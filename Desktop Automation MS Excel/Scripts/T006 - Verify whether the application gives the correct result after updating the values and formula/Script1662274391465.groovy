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

Windows.startApplication('file:///C:\\Users\\TUF\\Downloads\\SampleTestcase.xlsx')

Windows.click(findWindowsObject('Close Button'))

Windows.click(findWindowsObject('C2'))

Windows.setText(findWindowsObject('C2'), '3')

Windows.click(findWindowsObject('C3'))

Windows.setText(findWindowsObject('C3'), '3')

Windows.click(findWindowsObject('C4'))

Windows.setText(findWindowsObject('C4'), '3')

Windows.click(findWindowsObject('D5'))

Windows.setText(findWindowsObject('D5'), '=C2*C3-C4')

Windows.sendKeys(findWindowsObject('D5'), Keys.chord(Keys.ENTER))

Windows.delay(3)

Windows.closeApplication()

