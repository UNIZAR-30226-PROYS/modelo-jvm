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
import java.util.ArrayList;
import java.util.List;

/**
 * SongItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class SongItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lenght")
  private String lenght = null;

  @SerializedName("authorID")
  private String authorID = null;

  @SerializedName("authorName")
  private String authorName = null;

  @SerializedName("albumID")
  private String albumID = null;

  @SerializedName("albumName")
  private String albumName = null;

  @SerializedName("genre")
  private List<String> genre = new ArrayList<String>();

  public SongItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "123456789", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SongItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "I Will Survive", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SongItem lenght(String lenght) {
    this.lenght = lenght;
    return this;
  }

   /**
   * Get lenght
   * @return lenght
  **/
  @ApiModelProperty(example = "03:05", required = true, value = "")
  public String getLenght() {
    return lenght;
  }

  public void setLenght(String lenght) {
    this.lenght = lenght;
  }

  public SongItem authorID(String authorID) {
    this.authorID = authorID;
    return this;
  }

   /**
   * Get authorID
   * @return authorID
  **/
  @ApiModelProperty(example = "4567", required = true, value = "")
  public String getAuthorID() {
    return authorID;
  }

  public void setAuthorID(String authorID) {
    this.authorID = authorID;
  }

  public SongItem authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

   /**
   * Get authorName
   * @return authorName
  **/
  @ApiModelProperty(example = "Gloria Gaynor", required = true, value = "")
  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public SongItem albumID(String albumID) {
    this.albumID = albumID;
    return this;
  }

   /**
   * Get albumID
   * @return albumID
  **/
  @ApiModelProperty(example = "9876", required = true, value = "")
  public String getAlbumID() {
    return albumID;
  }

  public void setAlbumID(String albumID) {
    this.albumID = albumID;
  }

  public SongItem albumName(String albumName) {
    this.albumName = albumName;
    return this;
  }

   /**
   * Get albumName
   * @return albumName
  **/
  @ApiModelProperty(example = "Allenrok", required = true, value = "")
  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public SongItem genre(List<String> genre) {
    this.genre = genre;
    return this;
  }

  public SongItem addGenreItem(String genreItem) {
    this.genre.add(genreItem);
    return this;
  }

   /**
   * Get genre
   * @return genre
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getGenre() {
    return genre;
  }

  public void setGenre(List<String> genre) {
    this.genre = genre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SongItem songItem = (SongItem) o;
    return Objects.equals(this.id, songItem.id) &&
        Objects.equals(this.name, songItem.name) &&
        Objects.equals(this.lenght, songItem.lenght) &&
        Objects.equals(this.authorID, songItem.authorID) &&
        Objects.equals(this.authorName, songItem.authorName) &&
        Objects.equals(this.albumID, songItem.albumID) &&
        Objects.equals(this.albumName, songItem.albumName) &&
        Objects.equals(this.genre, songItem.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lenght, authorID, authorName, albumID, albumName, genre);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lenght: ").append(toIndentedString(lenght)).append("\n");
    sb.append("    authorID: ").append(toIndentedString(authorID)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    albumID: ").append(toIndentedString(albumID)).append("\n");
    sb.append("    albumName: ").append(toIndentedString(albumName)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
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

