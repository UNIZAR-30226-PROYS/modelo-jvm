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
 * SongItemNew
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class SongItemNew {
  @SerializedName("name")
  private String name = null;

  @SerializedName("lenght")
  private String lenght = null;

  @SerializedName("authorID")
  private String authorID = null;

  @SerializedName("albumID")
  private String albumID = null;

  @SerializedName("genre")
  private List<String> genre = new ArrayList<String>();

  public SongItemNew name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Nombre de la nueva canción", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SongItemNew lenght(String lenght) {
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

  public SongItemNew authorID(String authorID) {
    this.authorID = authorID;
    return this;
  }

   /**
   * Get authorID
   * @return authorID
  **/
  @ApiModelProperty(example = "6789", required = true, value = "")
  public String getAuthorID() {
    return authorID;
  }

  public void setAuthorID(String authorID) {
    this.authorID = authorID;
  }

  public SongItemNew albumID(String albumID) {
    this.albumID = albumID;
    return this;
  }

   /**
   * Get albumID
   * @return albumID
  **/
  @ApiModelProperty(example = "45", required = true, value = "")
  public String getAlbumID() {
    return albumID;
  }

  public void setAlbumID(String albumID) {
    this.albumID = albumID;
  }

  public SongItemNew genre(List<String> genre) {
    this.genre = genre;
    return this;
  }

  public SongItemNew addGenreItem(String genreItem) {
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
    SongItemNew songItemNew = (SongItemNew) o;
    return Objects.equals(this.name, songItemNew.name) &&
        Objects.equals(this.lenght, songItemNew.lenght) &&
        Objects.equals(this.authorID, songItemNew.authorID) &&
        Objects.equals(this.albumID, songItemNew.albumID) &&
        Objects.equals(this.genre, songItemNew.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lenght, authorID, albumID, genre);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongItemNew {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lenght: ").append(toIndentedString(lenght)).append("\n");
    sb.append("    authorID: ").append(toIndentedString(authorID)).append("\n");
    sb.append("    albumID: ").append(toIndentedString(albumID)).append("\n");
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

