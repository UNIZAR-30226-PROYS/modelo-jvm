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

/**
 * SessionItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class SessionItem {
  @SerializedName("playlistID")
  private String playlistID = null;

  @SerializedName("songID")
  private String songID = null;

  @SerializedName("second")
  private String second = null;

  public SessionItem playlistID(String playlistID) {
    this.playlistID = playlistID;
    return this;
  }

   /**
   * Get playlistID
   * @return playlistID
  **/
  @ApiModelProperty(example = "345", required = true, value = "")
  public String getPlaylistID() {
    return playlistID;
  }

  public void setPlaylistID(String playlistID) {
    this.playlistID = playlistID;
  }

  public SessionItem songID(String songID) {
    this.songID = songID;
    return this;
  }

   /**
   * Get songID
   * @return songID
  **/
  @ApiModelProperty(example = "4975", required = true, value = "")
  public String getSongID() {
    return songID;
  }

  public void setSongID(String songID) {
    this.songID = songID;
  }

  public SessionItem second(String second) {
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @ApiModelProperty(example = "120", required = true, value = "")
  public String getSecond() {
    return second;
  }

  public void setSecond(String second) {
    this.second = second;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionItem sessionItem = (SessionItem) o;
    return Objects.equals(this.playlistID, sessionItem.playlistID) &&
        Objects.equals(this.songID, sessionItem.songID) &&
        Objects.equals(this.second, sessionItem.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playlistID, songID, second);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionItem {\n");
    
    sb.append("    playlistID: ").append(toIndentedString(playlistID)).append("\n");
    sb.append("    songID: ").append(toIndentedString(songID)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
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

