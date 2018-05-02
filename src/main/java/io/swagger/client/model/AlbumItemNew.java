package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * AlbumItemNew
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class AlbumItemNew {
  @SerializedName("name")
  private String name = null;

  @SerializedName("authorID")
  private String authorID = null;

  @SerializedName("publishDate")
  private LocalDate publishDate = null;

  @SerializedName("description")
  private String description = null;

  public AlbumItemNew name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Nombre del album", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AlbumItemNew authorID(String authorID) {
    this.authorID = authorID;
    return this;
  }

   /**
   * Get authorID
   * @return authorID
  **/
  @ApiModelProperty(example = "9876", required = true, value = "")
  public String getAuthorID() {
    return authorID;
  }

  public void setAuthorID(String authorID) {
    this.authorID = authorID;
  }

  public AlbumItemNew publishDate(LocalDate publishDate) {
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  @ApiModelProperty(example = "2017-07-21T00:00:00.000Z", required = true, value = "")
  public LocalDate getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(LocalDate publishDate) {
    this.publishDate = publishDate;
  }

  public AlbumItemNew description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Descripción del album", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlbumItemNew albumItemNew = (AlbumItemNew) o;
    return Objects.equals(this.name, albumItemNew.name) &&
        Objects.equals(this.authorID, albumItemNew.authorID) &&
        Objects.equals(this.publishDate, albumItemNew.publishDate) &&
        Objects.equals(this.description, albumItemNew.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authorID, publishDate, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumItemNew {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authorID: ").append(toIndentedString(authorID)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

