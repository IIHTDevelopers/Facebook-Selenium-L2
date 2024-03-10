package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Facebook_L2_Pages extends StartupPage 
{
	By loginButton = By.xpath(""); 
	By emailAddsPhoneNumberTextbox = By.xpath(""); 
	By passwordTextbox = By.xpath(""); 
	By createNewAccount = By.xpath(""); 
	By signUpButton = By.xpath(""); 
	By nameFieldErorMessage = By.xpath(""); 
	By firstNameTextField = By.xpath(""); 
	By surNameTextField = By.xpath(""); 
	By mobileNumberAndPassword = By.xpath(""); 
	By newPassword = By.xpath(""); 
	By profile = By.xpath(""); 
	By profileName = By.xpath(""); 
	By updateProfilePicture = By.xpath(""); 
	By uploadPhoto = By.xpath(""); 
	By saveButton = By.xpath(""); 
	By editProfileButton=By.xpath("");
	By addButtonInsideBioSection=By.xpath("");
	By describeWhoAreYouTextField=By.xpath("");
	By saveButtonPresentInsideTheBioSection=By.xpath("");
	By xButton=By.xpath("");
	By addBioButton=By.xpath("");
	By aboutSection=By.xpath("");
	By workAndEducationSection=By.xpath("");
	By addUniversityIcon=By.xpath("");
	By schoolTextField=By.xpath("");
	By upperArrowButtonToHideTheYouMayKnowSection=By.xpath("");
	By addWorkplaceButton=By.xpath("");
	By companyTextField=By.xpath("");	
	By addCurrentCityButton=By.xpath("");
	By currentCityTextField=By.xpath("");
	By addHomeTownButton=By.xpath("");
	By homeTownTextField=By.xpath("");
	By cancelButton=By.xpath("");
	By addSecondarySchoolButton=By.xpath("");
	By schoolTextFieldPresentInsideSecondarySchoolTextField=By.xpath("");
	By addRelationshipStatusButton=By.xpath("");
	By stausDropdown=By.xpath("");
	By selectSingle=By.xpath("");
	By accountIcon=By.xpath("");
	By leavePageButton=By.xpath("");
	By LogoutButton=By.xpath("");

	public Facebook_L2_Pages(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this); // Initialize Page Factory
	}

	/**@Test1
	 * about this method loginToFacebookByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill emailAddsPhoneNumberTextbox then enter data in passwordTextbox and click on login button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToFacebookByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**@Test2
	 * about this method afterLoggedinValidateTheTitleOfFacebookHomePage() 
	 * @param : null
	 * @description : print the title of the home page after logged in and verify the title of the home page
	 * @return : String
	 * @author : Yaksha
	 */
	public String afterLoggedinValidateTheTitleOfFacebookHomePage() throws Exception {
		
		return null;
	}

	/**@Test3
	 * about this method clickonProfileIconAndValidateTheProfileName() 
	 * @param : null
	 * @description :click on the profile and validate the profile name
	 * @return : String
	 * @author : Yaksha
	 */
	public String clickonProfileAndValidateTheProfileName() throws Exception {
		
		return null;
	}

	/**@Test4
	 * about this method clickOnUpdateProfilePicture_and_UploadProfilePicture() 
	 * @param : String
	 * @description :click on update profile picture and click on upload photo and upload photo then click on save button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnUpdateProfilePicture_and_UploadProfilePicture(String pathOfTheFile) throws Exception {
		
		return false;
	}

	/**@Test5
	 * about this method clickOnEditProfileAndFillTheDetailInBioSection() 
	 * @param : Map<String, String> 
	 * @description :Click on edit profile then click on the add button inside the bio section and enter data in bio section then click on "X" button.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnEditProfileAndFillTheDetailInBioSection(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**@Test6
	 * about this method clickOnPostsandGoToIntroSectionAndAddDetailsInAddBio() 
	 * @param : String
	 * @description :Click on edit profile then click on the add button inside the bio section and enter data in bio section then click on "X" button.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnPostsandGoToIntroSectionAndAddDetailsInAddBio(Map<String, String> expectedData) throws Exception {
		
		return false;

	}

	/**@Test7
	 * about this method clickOnAboutAndGoIntoOverviewAndAddUniversity() 
	 * @param : Map<String, String>
	 * @description :Click on about section then go to overview section then click on addUniversityIcon then enter data in the school text field.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnAboutAndGoIntoOverviewAndAddUniversity(Map<String, String> expectedData) throws Exception {
		
		return false;

	}


	/**@Test8
	 * about this method clickonAddWorkplaceAndAddCompanyName() 
	 * @param : Map<String, String>
	 * @description :Click on about section then go to overview section then click on addUniversityIcon then enter data in the school text field.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickonAddWorkplaceAndAddCompanyName(Map<String, String> expectedData) throws Exception {
		
		return false;

	}
	/**@Test9
	 * about this method clickOnAddHomeTownandAddHomeTown() 
	 * @param : Map<String, String>
	 * @description :Refresh the page and click on upper arrow button to hide the you may know section 
	 * 				then click on addHomeTownButton and fill data in the homeTownTextField. 
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnAddHomeTownandAddHomeTown(Map<String, String> expectedData) throws Exception {
		
		return false;

	}

	/**@Test10
	 * about this method clickOnAddCurrentCityandAddCurrentCity() 
	 * @param : Map<String, String>
	 * @description :Refresh the page and click on upper arrow button to hide the you may know section 
	 * 				then click on add current city and fill data in the current city text field. 
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnAddCurrentCityandAddCurrentCity(Map<String, String> expectedData) throws Exception {
		
		return false;

	}

	/**@Test11
	 * about this method clickOnAddSecondarySchoolandAddSchool() 
	 * @param : Map<String, String>
	 * @description :Refresh the page and click on upper arrow button to hide the you may know section 
	 * 				then click on addSecondarySchoolButton and fill data in the schoolTextFieldPresentInsideSecondarySchoolTextField. 
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnAddSecondarySchoolandAddSchool(Map<String, String> expectedData) throws Exception {
		
		return false;

	}

	/**@Test12
	 * about this method clickOnAddRelationshipStatusandAddRelationshipStatusAsSingle() 
	 * @param : Map<String, String>
	 * @description :Refresh the page and click on upper arrow button to hide the you may know section 
	 * 				then click on addRelationshipStatusButton and Set the relationship status as single.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnAddRelationshipStatusandAddRelationshipStatusAsSingle(Map<String, String> expectedData) throws Exception {
		
		return false;

	}

	/**@Test13
	 * about this method gotoThePreviousPageAndClickOnAccount() 
	 * @param : null
	 * @description : going to the previous page then click on leave page button and click on Account icon which is present at the top right corner
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean gotoThePreviousPageAndClickOnAccount() throws Exception {
		
		return false;

	}
	/**@Test14
	 * about this method clickOnTheLogoutButton() 
	 * @param : null
	 * @description : Click on the logout button 
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickonTheLogoutButton() throws Exception {
		
		return false;

	}

}