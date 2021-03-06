package Pages;





import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPage {
	
	WebDriver driver;
	WebDriverWait  wait;
	@FindBy(xpath="//div[contains(text(),'Mails')]")private WebElement mailCard;
	@FindBy(xpath="//span[@data-action='expand']")private WebElement expandMail;
	@FindBy(xpath="//md-icon[@md-font-icon='add']")private WebElement composeIcon;
	@FindBy(id="autocompleteInputTo")private WebElement toAddress;
	@FindBy(xpath="//input[@placeholder='Subject']")private WebElement subject;
	@FindBy(id="ui-tinymce-1")private WebElement emailBody;
	@FindBy(xpath="//button[text()='Send']")private WebElement sendButton;
	@FindBy(xpath="//div[@ng-repeat='thread in allThreads | orderBy: orderByTime:true']")private WebElement firstEmail;
	@FindBy(xpath="//md-icon[text()='done']")private WebElement processunprocessedIcon;
	@FindBy(xpath="//button[@role='menuitem']/span[@layout-align='start center']")private WebElement mailFilter;
	@FindBy(xpath="//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-item[3]")private WebElement processedFilter;
	@FindBy(xpath="//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-item[2]")private WebElement unprocessedFilter;
	@FindBy(xpath="//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-item[6]")private WebElement sentFilter;
	@FindBy(xpath="//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-item[7]")private WebElement spamFilter;
	@FindBy(xpath="//div[@class='_md md-open-menu-container md-whiteframe-z2 md-active md-clickable']//md-menu-item[8]")private WebElement trashFilter;
	@FindAll({@FindBy(xpath="//span[@class='subject ng-binding']")}) private WebElement emailSubject;
	@FindAll({@FindBy(xpath="//span[@class='subject ng-binding']")}) private List<WebElement> emailSubject1;
	@FindBy(xpath="//button[@aria-label='tag topics']")private WebElement tagToTopic;
	@FindBy(xpath="//md-autocomplete-wrap/input[@type='search']")private WebElement topicField;
	@FindBy(xpath="//button[contains(text(),'Save')]")private WebElement topicSave;
	@FindBy(xpath="//span[text()='Macro View']")private WebElement macroview;
	@FindBy(xpath="//button[@aria-label='share']")private WebElement shareIcon;
	@FindBy(xpath="//span[@class='subject ng-binding']/../../div[3]/i") private WebElement sharedlabel;
	@FindBy(xpath="//button[@ng-if='actions.reportSpam']")private WebElement spamIcon;
	@FindBy(xpath="//button[@type='button']/span[contains(text(),'More')]")private WebElement more;
	@FindBy(xpath="//button[contains(text(),'Not spam')]")private WebElement notSpam;
	@FindBy(xpath="//button[@ng-if='actions.trash']")private WebElement trashIcon;
	@FindBy(xpath="//md-menu/span/i")private WebElement elipses;
	@FindBy(xpath="//button[contains(text(),'Not trash')]")private WebElement unTrash;
	@FindBy(xpath="//button[contains(text(),'Untrash')]")private WebElement unTrashExpandedView;
	@FindBy(xpath="//md-icon[text()='delete_forever']")private WebElement deleteForever;
	@FindBy(xpath="//img[@class='email-item__img-sp']")private WebElement batchSelection;
	@FindBy(xpath="//button[contains(text(),'Select All')]") private WebElement selectAll;
	@FindAll({@FindBy(xpath="//div[@class='service-panel__content__listItem email-list__item email-item table-fixed ng-scope email-item--unread']")}) private List<WebElement> unreadEmails;
	@FindAll({@FindBy(xpath="//div[@class='service-panel__content__listItem email-list__item email-item table-fixed ng-scope']")}) private List<WebElement> readEmails;
	@FindBy(xpath="//button[contains(text(),'Mark as unread')]") private WebElement unread;
	@FindBy(xpath="//md-icon[text()='markunread']") private WebElement unreadIcon;
	@FindBy(xpath="//md-icon[text()='mail_outline']") private WebElement readIcon;
	@FindAll({@FindBy(xpath="//li[@class='topic-selector__list-item ng-scope']")}) private List<WebElement> topicListInTagToTopic;
	@FindBy(xpath="//*[@type='search']") private WebElement enterTopic;
	@FindBy(xpath="//md-autocomplete[@md-floating-label='Search a topic']") private WebElement searchBox;
	@FindAll({@FindBy(xpath="//div[@class='ng-binding']")}) private List<WebElement> searchResult;
	@FindAll({@FindBy(xpath="//md-checkbox[@type='checkbox']")}) private List<WebElement> checkBox;
	@FindBy(xpath="//button[@aria-label='close']") private WebElement closeMail;
	
	
	
	public MailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	public void clickmailCard()
	{
		(new WebDriverWait(driver, 20))
		   .until(ExpectedConditions.elementToBeClickable(mailCard)).click();
		
	}
	public void clickComposeIcon()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(composeIcon)).click();
		
	}
	public void enterToAddreess(String toaddress)
	{
		toAddress.sendKeys(toaddress);
	}
	public void enterSubject(String sub)
	{
		subject.sendKeys(sub);
	}
	public void enterEmailBody(String body)
	{
		emailBody.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emailBody.sendKeys(body);
	}
	public void clickSendButton()
	{
		sendButton.click();
	}
	public void clickFirstEmail()
	{
		firstEmail.click();
	}
	public void clickProcessUnProcessedIcon()
	{
		processunprocessedIcon.click();
	}
	public void clickMailFilter()
	{
		(new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(mailFilter)).click();
	}
	public void clickProcessedFilter()
	{
		processedFilter.click();
	}
	public void clickUnProcessedFilter()
	{
		unprocessedFilter.click();
	}
	public void clickSentFilter()
	{
		sentFilter.click();
	}
	public void clickSpamFilter()
	{
		spamFilter.click();
	}
	public void clickTrashFilter()
	{
		trashFilter.click();
	}
	public void GetemailSubject()
	{
		emailSubject.click();
	} 
	public List<WebElement> GetemailSubjects()
	{
		return (new WebDriverWait(driver, 20))
		   .until(ExpectedConditions.visibilityOfAllElements(emailSubject1));
		
	} 
	public void clickTagToTopic()
	{
		tagToTopic.click();
	} 
	public void clickTopicField()
	{
		topicField.click();
	}
	public void clickTopicSave()
	{
		topicSave.click();
	}
	
	
	
	public void clickMacroview()
	{
		macroview.click();
	}
	public void clickShareIcon()
	{
	shareIcon.click();
	}
	public void clickSharedlabel()
	{
		sharedlabel.click();
	}
	public void clickSpamIcon()
	{
		spamIcon.click();
	}
	public void clickMore()
	{
		more.click();
	}
	public void clickNotSpam()
	{
		notSpam.click();
	}
	public void clickTrashIcon()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(trashIcon)).click();
		
	}
	public void clickElipses()
	{
		elipses.click();
	}
	public void clickUnTrash()
	{
		unTrash.click();
	}
	public void clickDeleteForever()
	{
		deleteForever.click();
	}
	
	public WebElement batchSelection()
	{
		return batchSelection;
	}
	
	public void clickSelectAll()
	{
		selectAll.click();
	}

	public void clickunTrashExpandedView()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(unTrashExpandedView)).click();
	}
	
	public List<WebElement> getUnreadEmails()
	{
		return (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfAllElements(unreadEmails));
	}
	public List<WebElement> getReadEmails()
	{
	return (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfAllElements(readEmails));
	}
	public void markUnread()
	{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(unread)).click();
	}
	public void markUnreadIcon()
	{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(unreadIcon)).click();
	}
	public void markReadIcon()
	{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(readIcon)).click();
	}
	public List<WebElement> getTopicListInTagToTopic()
	{
		return (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfAllElements(topicListInTagToTopic));
	}
	public void inputTopicname(String topicname)
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(enterTopic)).sendKeys(topicname);
		
	}
	public void clickSearchBox()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(searchBox)).click();;
		
	}
	public List<WebElement> getTopicSearchResults()
	{
		return (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfAllElements(searchResult));
	}
	public List<WebElement> getListOfCheckBox()
	{
		return (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfAllElements(checkBox));
	}
	public boolean checkcloseMailIcon()
	{
		if(closeMail.isDisplayed())
		
				return true;
			else
				return false;
		
	}
	public void clickCloseMailIcon()
	{
		closeMail.click();
	}
	
}
	

