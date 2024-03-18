package userdatamanager.aoleg.com.github.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * The general error model of the application
 */

@Schema(name = "errorDto", description = "The general error model of the application")
@JsonTypeName("errorDto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-18T23:14:07.582570704+03:00[Europe/Moscow]", comments = "Generator version: 7.4.0")
public class ErrorDto {

  private String message;

  private Integer code;

  private String errorTime;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ERROR("ERROR"),
    
    WARNING("WARNING");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type = TypeEnum.ERROR;

  private String displayMessage;

  public ErrorDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorDto(Integer code, TypeEnum type) {
    this.code = code;
    this.type = type;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @NotNull
  @Schema(name = "code", example = "10001", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorDto errorTime(String errorTime) {
    this.errorTime = errorTime;
    return this;
  }

  /**
   * Date of the event
   * @return errorTime
  */
  
  @Schema(name = "errorTime", example = "2000-01-01T15:00:00+01", description = "Date of the event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorTime")
  public String getErrorTime() {
    return errorTime;
  }

  public void setErrorTime(String errorTime) {
    this.errorTime = errorTime;
  }

  public ErrorDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorDto displayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
    return this;
  }

  /**
   * Get displayMessage
   * @return displayMessage
  */
  
  @Schema(name = "displayMessage", example = "An error occurred while performing this operation. Error code 10-50000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayMessage")
  public String getDisplayMessage() {
    return displayMessage;
  }

  public void setDisplayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.message, errorDto.message) &&
        Objects.equals(this.code, errorDto.code) &&
        Objects.equals(this.errorTime, errorDto.errorTime) &&
        Objects.equals(this.type, errorDto.type) &&
        Objects.equals(this.displayMessage, errorDto.displayMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, errorTime, type, displayMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errorTime: ").append(toIndentedString(errorTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
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

