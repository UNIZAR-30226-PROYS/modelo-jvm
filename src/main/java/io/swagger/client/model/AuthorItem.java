package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AlbumItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthorItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-02T13:56:51.539Z")
public class AuthorItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("bio")
  private String bio = null;

  @SerializedName("albums")
  private List<AlbumItem> albums = new ArrayList<AlbumItem>();

  public AuthorItem id(String id) {
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

  public AuthorItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Estopa", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthorItem bio(String bio) {
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @ApiModelProperty(example = "Los hermanos Muñoz de Cornellá", required = true, value = "")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public AuthorItem albums(List<AlbumItem> albums) {
    this.albums = albums;
    return this;
  }

  public AuthorItem addAlbumsItem(AlbumItem albumsItem) {
    this.albums.add(albumsItem);
    return this;
  }

   /**
   * Get albums
   * @return albums
  **/
  @ApiModelProperty(required = true, value = "")
  public List<AlbumItem> getAlbums() {
    return albums;
  }

  public void setAlbums(List<AlbumItem> albums) {
    this.albums = albums;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorItem authorItem = (AuthorItem) o;
    return Objects.equals(this.id, authorItem.id) &&
        Objects.equals(this.name, authorItem.name) &&
        Objects.equals(this.bio, authorItem.bio) &&
        Objects.equals(this.albums, authorItem.albums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, bio, albums);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    albums: ").append(toIndentedString(albums)).append("\n");
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

