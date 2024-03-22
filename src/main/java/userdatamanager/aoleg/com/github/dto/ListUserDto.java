package userdatamanager.aoleg.com.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List of user objects
 */

@Schema(name = "listUserDto", description = "List of user objects")
@JsonTypeName("listUserDto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-18T23:14:07.582570704+03:00[Europe/Moscow]", comments = "Generator version: 7.4.0")
public class ListUserDto {

  @Valid
  private List<@Valid UserDto> users = new ArrayList<>();

  public ListUserDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListUserDto(List<@Valid UserDto> users) {
    this.users = users;
  }

  public ListUserDto users(List<@Valid UserDto> users) {
    this.users = users;
    return this;
  }

  public ListUserDto addUsersItem(UserDto usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of user objects
   * @return users
  */
  @NotNull
  @Valid
  @Schema(name = "users", description = "List of user objects", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("users")
  public List<@Valid UserDto> getUsers() {
    return users;
  }

  public void setUsers(List<@Valid UserDto> users) {
    this.users = users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUserDto listUserDto = (ListUserDto) o;
    return Objects.equals(this.users, listUserDto.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUserDto {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

