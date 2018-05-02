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
 * PlaylistItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class PlaylistItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ownerID")
  private String ownerID = null;

  @SerializedName("ownerName")
  private String ownerName = null;

  @SerializedName("creationDate")
  private LocalDate creationDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("songs")
  private List<SongItem> songs = new ArrayList<SongItem>();

  public PlaylistItem id(String id) {
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

  public PlaylistItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Best music 1980", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlaylistItem ownerID(String ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @ApiModelProperty(example = "11111", required = true, value = "")
  public String getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(String ownerID) {
    this.ownerID = ownerID;
  }

  public PlaylistItem ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @ApiModelProperty(example = "Richard Stallman", required = true, value = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public PlaylistItem creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(example = "2018-03-11T00:00:00.000Z", required = true, value = "")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public PlaylistItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Relax and enjoy the very best hits of the most awesome decade of music", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlaylistItem songs(List<SongItem> songs) {
    this.songs = songs;
    return this;
  }

  public PlaylistItem addSongsItem(SongItem songsItem) {
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
    PlaylistItem playlistItem = (PlaylistItem) o;
    return Objects.equals(this.id, playlistItem.id) &&
        Objects.equals(this.name, playlistItem.name) &&
        Objects.equals(this.ownerID, playlistItem.ownerID) &&
        Objects.equals(this.ownerName, playlistItem.ownerName) &&
        Objects.equals(this.creationDate, playlistItem.creationDate) &&
        Objects.equals(this.description, playlistItem.description) &&
        Objects.equals(this.songs, playlistItem.songs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ownerID, ownerName, creationDate, description, songs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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

