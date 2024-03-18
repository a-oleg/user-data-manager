package userdatamanager.aoleg.com.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * A user object
 */

@Schema(name = "userDto", description = "A user object")
@JsonTypeName("userDto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-18T23:14:07.582570704+03:00[Europe/Moscow]", comments = "Generator version: 7.4.0")
public class UserDto {

    private String firstName;

    private String lastName;

    private String loginName;

    private String email;

    private String password;

    private String createdAt;

    private Boolean activityStatus;

    private String facebookProfile;

    private String instagramProfile;

    private String tikTokProfile;

    private String xProfile;

    private String iMessageProfile;

    private String snapChatProfile;

    private String pinterestProfile;

    private String linkedInProfile;

    private String redditProfile;

    private String gitHubProfile;

    public UserDto() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UserDto(String email, String password, String createdAt, Boolean activityStatus) {
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.activityStatus = activityStatus;
    }

    public UserDto firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * First name of the user
     *
     * @return firstName
     */

    @Schema(name = "firstName", example = "Michael", description = "First name of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserDto lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Last name of the user
     *
     * @return lastName
     */

    @Schema(name = "lastName", example = "Smith", description = "Last name of the user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserDto loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    /**
     * Login for user authorization
     *
     * @return loginName
     */

    @Schema(name = "loginName", example = "myLogin", description = "Login for user authorization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("loginName")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public UserDto email(String email) {
        this.email = email;
        return this;
    }

    /**
     * User e-mail
     *
     * @return email
     */
    @NotNull
    @Schema(name = "email", example = "smith@gmail.com", description = "User e-mail", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDto password(String password) {
        this.password = password;
        return this;
    }

    /**
     * User password
     *
     * @return password
     */
    @NotNull
    @Schema(name = "password", example = "Qwerty1", description = "User password", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDto createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * User creation date
     *
     * @return createdAt
     */
    @NotNull
    @Schema(name = "createdAt", example = "2000-01-01T15:00:00+01", description = "User creation date", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UserDto activityStatus(Boolean activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }

    /**
     * Current or archived version of the user
     *
     * @return activityStatus
     */
    @NotNull
    @Schema(name = "activityStatus", example = "true", description = "Current or archived version of the user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("activityStatus")
    public Boolean getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Boolean activityStatus) {
        this.activityStatus = activityStatus;
    }

    public UserDto facebookProfile(String facebookProfile) {
        this.facebookProfile = facebookProfile;
        return this;
    }

    /**
     * Facebook profile
     *
     * @return facebookProfile
     */

    @Schema(name = "facebookProfile", example = "myFacebookProfile", description = "Facebook profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("facebookProfile")
    public String getFacebookProfile() {
        return facebookProfile;
    }

    public void setFacebookProfile(String facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    public UserDto instagramProfile(String instagramProfile) {
        this.instagramProfile = instagramProfile;
        return this;
    }

    /**
     * Instagram profile
     *
     * @return instagramProfile
     */

    @Schema(name = "instagramProfile", example = "myInstagramProfile", description = "Instagram profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("instagramProfile")
    public String getInstagramProfile() {
        return instagramProfile;
    }

    public void setInstagramProfile(String instagramProfile) {
        this.instagramProfile = instagramProfile;
    }

    public UserDto tikTokProfile(String tikTokProfile) {
        this.tikTokProfile = tikTokProfile;
        return this;
    }

    /**
     * TikTok profile
     *
     * @return tikTokProfile
     */

    @Schema(name = "tikTokProfile", example = "myTikTokProfile", description = "TikTok profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tikTokProfile")
    public String getTikTokProfile() {
        return tikTokProfile;
    }

    public void setTikTokProfile(String tikTokProfile) {
        this.tikTokProfile = tikTokProfile;
    }

    public UserDto xProfile(String xProfile) {
        this.xProfile = xProfile;
        return this;
    }

    /**
     * X (ex Twitter) profile
     *
     * @return xProfile
     */

    @Schema(name = "xProfile", example = "myXProfile", description = "X (ex Twitter) profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("xProfile")
    public String getxProfile() {
        return xProfile;
    }

    public void setxProfile(String xProfile) {
        this.xProfile = xProfile;
    }

    public UserDto iMessageProfile(String iMessageProfile) {
        this.iMessageProfile = iMessageProfile;
        return this;
    }

    /**
     * iMessage profile
     *
     * @return iMessageProfile
     */

    @Schema(name = "iMessageProfile", example = "myiMessageProfile", description = "iMessage profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("iMessageProfile")
    public String getiMessageProfile() {
        return iMessageProfile;
    }

    public void setiMessageProfile(String iMessageProfile) {
        this.iMessageProfile = iMessageProfile;
    }

    public UserDto snapChatProfile(String snapChatProfile) {
        this.snapChatProfile = snapChatProfile;
        return this;
    }

    /**
     * SnapChat profile
     *
     * @return snapChatProfile
     */

    @Schema(name = "snapChatProfile", example = "mySnapChatProfile", description = "SnapChat profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("snapChatProfile")
    public String getSnapChatProfile() {
        return snapChatProfile;
    }

    public void setSnapChatProfile(String snapChatProfile) {
        this.snapChatProfile = snapChatProfile;
    }

    public UserDto pinterestProfile(String pinterestProfile) {
        this.pinterestProfile = pinterestProfile;
        return this;
    }

    /**
     * Pinterest profile
     *
     * @return pinterestProfile
     */

    @Schema(name = "pinterestProfile", example = "myPinterestProfile", description = "Pinterest profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pinterestProfile")
    public String getPinterestProfile() {
        return pinterestProfile;
    }

    public void setPinterestProfile(String pinterestProfile) {
        this.pinterestProfile = pinterestProfile;
    }

    public UserDto linkedInProfile(String linkedInProfile) {
        this.linkedInProfile = linkedInProfile;
        return this;
    }

    /**
     * LinkedIn profile
     *
     * @return linkedInProfile
     */

    @Schema(name = "linkedInProfile", example = "myLinkedInProfile", description = "LinkedIn profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("linkedInProfile")
    public String getLinkedInProfile() {
        return linkedInProfile;
    }

    public void setLinkedInProfile(String linkedInProfile) {
        this.linkedInProfile = linkedInProfile;
    }

    public UserDto redditProfile(String redditProfile) {
        this.redditProfile = redditProfile;
        return this;
    }

    /**
     * Reddit profile
     *
     * @return redditProfile
     */

    @Schema(name = "redditProfile", example = "myRedditProfile", description = "Reddit profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("redditProfile")
    public String getRedditProfile() {
        return redditProfile;
    }

    public void setRedditProfile(String redditProfile) {
        this.redditProfile = redditProfile;
    }

    public UserDto gitHubProfile(String gitHubProfile) {
        this.gitHubProfile = gitHubProfile;
        return this;
    }

    /**
     * GitHub profile
     *
     * @return gitHubProfile
     */

    @Schema(name = "gitHubProfile", example = "myGitHubProfile", description = "GitHub profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gitHubProfile")
    public String getGitHubProfile() {
        return gitHubProfile;
    }

    public void setGitHubProfile(String gitHubProfile) {
        this.gitHubProfile = gitHubProfile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDto userDto = (UserDto) o;
        return Objects.equals(this.firstName, userDto.firstName) &&
                Objects.equals(this.lastName, userDto.lastName) &&
                Objects.equals(this.loginName, userDto.loginName) &&
                Objects.equals(this.email, userDto.email) &&
                Objects.equals(this.password, userDto.password) &&
                Objects.equals(this.createdAt, userDto.createdAt) &&
                Objects.equals(this.activityStatus, userDto.activityStatus) &&
                Objects.equals(this.facebookProfile, userDto.facebookProfile) &&
                Objects.equals(this.instagramProfile, userDto.instagramProfile) &&
                Objects.equals(this.tikTokProfile, userDto.tikTokProfile) &&
                Objects.equals(this.xProfile, userDto.xProfile) &&
                Objects.equals(this.iMessageProfile, userDto.iMessageProfile) &&
                Objects.equals(this.snapChatProfile, userDto.snapChatProfile) &&
                Objects.equals(this.pinterestProfile, userDto.pinterestProfile) &&
                Objects.equals(this.linkedInProfile, userDto.linkedInProfile) &&
                Objects.equals(this.redditProfile, userDto.redditProfile) &&
                Objects.equals(this.gitHubProfile, userDto.gitHubProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, loginName, email, password, createdAt, activityStatus, facebookProfile, instagramProfile, tikTokProfile, xProfile, iMessageProfile, snapChatProfile, pinterestProfile, linkedInProfile, redditProfile, gitHubProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDto {\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    activityStatus: ").append(toIndentedString(activityStatus)).append("\n");
        sb.append("    facebookProfile: ").append(toIndentedString(facebookProfile)).append("\n");
        sb.append("    instagramProfile: ").append(toIndentedString(instagramProfile)).append("\n");
        sb.append("    tikTokProfile: ").append(toIndentedString(tikTokProfile)).append("\n");
        sb.append("    xProfile: ").append(toIndentedString(xProfile)).append("\n");
        sb.append("    iMessageProfile: ").append(toIndentedString(iMessageProfile)).append("\n");
        sb.append("    snapChatProfile: ").append(toIndentedString(snapChatProfile)).append("\n");
        sb.append("    pinterestProfile: ").append(toIndentedString(pinterestProfile)).append("\n");
        sb.append("    linkedInProfile: ").append(toIndentedString(linkedInProfile)).append("\n");
        sb.append("    redditProfile: ").append(toIndentedString(redditProfile)).append("\n");
        sb.append("    gitHubProfile: ").append(toIndentedString(gitHubProfile)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

