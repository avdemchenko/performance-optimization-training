package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stackoverflow_info")
public class StackOverflowInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String stackOverflowDescribes;
	
	@Column
    private String stackOverflowSatisfaction;
	
	@Column
    private String stackOverflowDevices;
	
	@Column
    private String stackOverflowFoundAnswer;
	
	@Column
    private String stackOverflowCopiedCode;
	
	@Column
    private String stackOverflowJobListing;
	
	@Column
    private String stackOverflowCompanyPage;
	
	@Column
    private String stackOverflowJobSearch;
	
	@Column
    private String stackOverflowNewQuestion;
	
	@Column
    private String stackOverflowAnswer;
	
	@Column
    private String stackOverflowMetaChat;
	
	@Column
    private String stackOverflowAdsRelevant;
	
	@Column
    private String stackOverflowAdsDistracting;
	
	@Column
    private String stackOverflowModeration;
	
	@Column
    private String stackOverflowCommunity;
	
	@Column
    private String stackOverflowHelpful;
	
	@Column
    private String stackOverflowBetter;
	
	@Column
    private String stackOverflowWhatDo;
	
	@Column
    private String stackOverflowMakeMoney;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStackOverflowDescribes() {
		return stackOverflowDescribes;
	}

	public void setStackOverflowDescribes(String stackOverflowDescribes) {
		this.stackOverflowDescribes = stackOverflowDescribes;
	}

	public String getStackOverflowSatisfaction() {
		return stackOverflowSatisfaction;
	}

	public void setStackOverflowSatisfaction(String stackOverflowSatisfaction) {
		this.stackOverflowSatisfaction = stackOverflowSatisfaction;
	}

	public String getStackOverflowDevices() {
		return stackOverflowDevices;
	}

	public void setStackOverflowDevices(String stackOverflowDevices) {
		this.stackOverflowDevices = stackOverflowDevices;
	}

	public String getStackOverflowFoundAnswer() {
		return stackOverflowFoundAnswer;
	}

	public void setStackOverflowFoundAnswer(String stackOverflowFoundAnswer) {
		this.stackOverflowFoundAnswer = stackOverflowFoundAnswer;
	}

	public String getStackOverflowCopiedCode() {
		return stackOverflowCopiedCode;
	}

	public void setStackOverflowCopiedCode(String stackOverflowCopiedCode) {
		this.stackOverflowCopiedCode = stackOverflowCopiedCode;
	}

	public String getStackOverflowJobListing() {
		return stackOverflowJobListing;
	}

	public void setStackOverflowJobListing(String stackOverflowJobListing) {
		this.stackOverflowJobListing = stackOverflowJobListing;
	}

	public String getStackOverflowCompanyPage() {
		return stackOverflowCompanyPage;
	}

	public void setStackOverflowCompanyPage(String stackOverflowCompanyPage) {
		this.stackOverflowCompanyPage = stackOverflowCompanyPage;
	}

	public String getStackOverflowJobSearch() {
		return stackOverflowJobSearch;
	}

	public void setStackOverflowJobSearch(String stackOverflowJobSearch) {
		this.stackOverflowJobSearch = stackOverflowJobSearch;
	}

	public String getStackOverflowNewQuestion() {
		return stackOverflowNewQuestion;
	}

	public void setStackOverflowNewQuestion(String stackOverflowNewQuestion) {
		this.stackOverflowNewQuestion = stackOverflowNewQuestion;
	}

	public String getStackOverflowAnswer() {
		return stackOverflowAnswer;
	}

	public void setStackOverflowAnswer(String stackOverflowAnswer) {
		this.stackOverflowAnswer = stackOverflowAnswer;
	}

	public String getStackOverflowMetaChat() {
		return stackOverflowMetaChat;
	}

	public void setStackOverflowMetaChat(String stackOverflowMetaChat) {
		this.stackOverflowMetaChat = stackOverflowMetaChat;
	}

	public String getStackOverflowAdsRelevant() {
		return stackOverflowAdsRelevant;
	}

	public void setStackOverflowAdsRelevant(String stackOverflowAdsRelevant) {
		this.stackOverflowAdsRelevant = stackOverflowAdsRelevant;
	}

	public String getStackOverflowAdsDistracting() {
		return stackOverflowAdsDistracting;
	}

	public void setStackOverflowAdsDistracting(String stackOverflowAdsDistracting) {
		this.stackOverflowAdsDistracting = stackOverflowAdsDistracting;
	}

	public String getStackOverflowModeration() {
		return stackOverflowModeration;
	}

	public void setStackOverflowModeration(String stackOverflowModeration) {
		this.stackOverflowModeration = stackOverflowModeration;
	}

	public String getStackOverflowCommunity() {
		return stackOverflowCommunity;
	}

	public void setStackOverflowCommunity(String stackOverflowCommunity) {
		this.stackOverflowCommunity = stackOverflowCommunity;
	}

	public String getStackOverflowHelpful() {
		return stackOverflowHelpful;
	}

	public void setStackOverflowHelpful(String stackOverflowHelpful) {
		this.stackOverflowHelpful = stackOverflowHelpful;
	}

	public String getStackOverflowBetter() {
		return stackOverflowBetter;
	}

	public void setStackOverflowBetter(String stackOverflowBetter) {
		this.stackOverflowBetter = stackOverflowBetter;
	}

	public String getStackOverflowWhatDo() {
		return stackOverflowWhatDo;
	}

	public void setStackOverflowWhatDo(String stackOverflowWhatDo) {
		this.stackOverflowWhatDo = stackOverflowWhatDo;
	}

	public String getStackOverflowMakeMoney() {
		return stackOverflowMakeMoney;
	}

	public void setStackOverflowMakeMoney(String stackOverflowMakeMoney) {
		this.stackOverflowMakeMoney = stackOverflowMakeMoney;
	}

}
