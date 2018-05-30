package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FriendItem;
import io.swagger.client.model.PlaylistItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProfileItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class ProfileItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("bio")
  private String bio = null;

  @SerializedName("friends")
  private List<FriendItem> friends = new ArrayList<FriendItem>();

  @SerializedName("playlists")
  private List<PlaylistItem> playlists = new ArrayList<PlaylistItem>();

  public ProfileItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "11111", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfileItem username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "rms", required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ProfileItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Richard Stallman", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfileItem bio(String bio) {
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @ApiModelProperty(example = "¡Larga vida al Open Source!", required = true, value = "")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public ProfileItem friends(List<FriendItem> friends) {
    this.friends = friends;
    return this;
  }

  public ProfileItem addFriendsItem(FriendItem friendsItem) {
    this.friends.add(friendsItem);
    return this;
  }

   /**
   * Get friends
   * @return friends
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FriendItem> getFriends() {
    return friends;
  }

  public void setFriends(List<FriendItem> friends) {
    this.friends = friends;
  }

  public ProfileItem playlists(List<PlaylistItem> playlists) {
    this.playlists = playlists;
    return this;
  }

  public ProfileItem addPlaylistsItem(PlaylistItem playlistsItem) {
    this.playlists.add(playlistsItem);
    return this;
  }

   /**
   * Get playlists
   * @return playlists
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PlaylistItem> getPlaylists() {
    return playlists;
  }

  public void setPlaylists(List<PlaylistItem> playlists) {
    this.playlists = playlists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileItem profileItem = (ProfileItem) o;
    return Objects.equals(this.id, profileItem.id) &&
        Objects.equals(this.username, profileItem.username) &&
        Objects.equals(this.name, profileItem.name) &&
        Objects.equals(this.bio, profileItem.bio) &&
        Objects.equals(this.friends, profileItem.friends) &&
        Objects.equals(this.playlists, profileItem.playlists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, name, bio, friends, playlists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
    sb.append("    playlists: ").append(toIndentedString(playlists)).append("\n");
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

