package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SongItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * AlbumItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class AlbumItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("authorID")
  private String authorID = null;

  @SerializedName("authorName")
  private String authorName = null;

  @SerializedName("publishDate")
  private LocalDate publishDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("songs")
  private List<SongItem> songs = new ArrayList<SongItem>();

  public AlbumItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "98765", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AlbumItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Allenrok", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AlbumItem authorID(String authorID) {
    this.authorID = authorID;
    return this;
  }

   /**
   * Get authorID
   * @return authorID
  **/
  @ApiModelProperty(example = "4678", required = true, value = "")
  public String getAuthorID() {
    return authorID;
  }

  public void setAuthorID(String authorID) {
    this.authorID = authorID;
  }

  public AlbumItem authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @ApiModelProperty(example = "Estopa", required = true, value = "")
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public AlbumItem publishDate(LocalDate publishDate) {
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  @ApiModelProperty(example = "2017-07-21T00:00:00.000Z", value = "")
  public LocalDate getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(LocalDate publishDate) {
    this.publishDate = publishDate;
  }

  public AlbumItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A tope, nene", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AlbumItem songs(List<SongItem> songs) {
    this.songs = songs;
    return this;
  }

  public AlbumItem addSongsItem(SongItem songsItem) {
    this.songs.add(songsItem);
    return this;
  }

   /**
   * Get songs
   * @return songs
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SongItem> getSongs() {
    return songs;
  }

  public void setSongs(List<SongItem> songs) {
    this.songs = songs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlbumItem albumItem = (AlbumItem) o;
    return Objects.equals(this.id, albumItem.id) &&
        Objects.equals(this.name, albumItem.name) &&
        Objects.equals(this.authorID, albumItem.authorID) &&
        Objects.equals(this.authorName, albumItem.authorName) &&
        Objects.equals(this.publishDate, albumItem.publishDate) &&
        Objects.equals(this.description, albumItem.description) &&
        Objects.equals(this.songs, albumItem.songs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, authorID, authorName, publishDate, description, songs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authorID: ").append(toIndentedString(authorID)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    songs: ").append(toIndentedString(songs)).append("\n");
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

