

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AccountItem;
import io.swagger.client.model.AccountItemUpdate;
import io.swagger.client.model.LoginItem;
import io.swagger.client.model.PlaylistItem;
import io.swagger.client.model.PlaylistItemNew;
import io.swagger.client.model.SessionItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addPlaylist
     * @param playlistItem Playlist item to add (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addPlaylistCall(PlaylistItemNew playlistItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = playlistItem;

        // create path and map variables
        String localVarPath = "/playlists";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addPlaylistValidateBeforeCall(PlaylistItemNew playlistItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = addPlaylistCall(playlistItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * crea una lista de reproducción
     * Un usuario crea una lista de reproducción.
     * @param playlistItem Playlist item to add (optional)
     * @return PlaylistItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaylistItem addPlaylist(PlaylistItemNew playlistItem) throws ApiException {
        ApiResponse<PlaylistItem> resp = addPlaylistWithHttpInfo(playlistItem);
        return resp.getData();
    }

    /**
     * crea una lista de reproducción
     * Un usuario crea una lista de reproducción.
     * @param playlistItem Playlist item to add (optional)
     * @return ApiResponse&lt;PlaylistItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaylistItem> addPlaylistWithHttpInfo(PlaylistItemNew playlistItem) throws ApiException {
        com.squareup.okhttp.Call call = addPlaylistValidateBeforeCall(playlistItem, null, null);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * crea una lista de reproducción (asynchronously)
     * Un usuario crea una lista de reproducción.
     * @param playlistItem Playlist item to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPlaylistAsync(PlaylistItemNew playlistItem, final ApiCallback<PlaylistItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addPlaylistValidateBeforeCall(playlistItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addPlaylistSong
     * @param playlistID ID de la playlist (required)
     * @param songID Song to add (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addPlaylistSongCall(String playlistID, String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = songID;

        // create path and map variables
        String localVarPath = "/playlists{playlistID}/songs"
            .replaceAll("\\{" + "playlistID" + "\\}", apiClient.escapeString(playlistID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addPlaylistSongValidateBeforeCall(String playlistID, String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'playlistID' is set
        if (playlistID == null) {
            throw new ApiException("Missing the required parameter 'playlistID' when calling addPlaylistSong(Async)");
        }
        

        com.squareup.okhttp.Call call = addPlaylistSongCall(playlistID, songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * añade una canción a una lista de reproducción
     * Un usuario añade una canción a una lista de reproducción de su propiedad.
     * @param playlistID ID de la playlist (required)
     * @param songID Song to add (optional)
     * @return PlaylistItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaylistItem addPlaylistSong(String playlistID, String songID) throws ApiException {
        ApiResponse<PlaylistItem> resp = addPlaylistSongWithHttpInfo(playlistID, songID);
        return resp.getData();
    }

    /**
     * añade una canción a una lista de reproducción
     * Un usuario añade una canción a una lista de reproducción de su propiedad.
     * @param playlistID ID de la playlist (required)
     * @param songID Song to add (optional)
     * @return ApiResponse&lt;PlaylistItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaylistItem> addPlaylistSongWithHttpInfo(String playlistID, String songID) throws ApiException {
        com.squareup.okhttp.Call call = addPlaylistSongValidateBeforeCall(playlistID, songID, null, null);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * añade una canción a una lista de reproducción (asynchronously)
     * Un usuario añade una canción a una lista de reproducción de su propiedad.
     * @param playlistID ID de la playlist (required)
     * @param songID Song to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPlaylistSongAsync(String playlistID, String songID, final ApiCallback<PlaylistItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addPlaylistSongValidateBeforeCall(playlistID, songID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteAccount
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAccountCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAccountValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = deleteAccountCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * borra la cuenta del usuario
     * Elimina definitivamente la cuenta del usuario. No se puede deshacer. No funciona con cuentas de administrador 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAccount() throws ApiException {
        deleteAccountWithHttpInfo();
    }

    /**
     * borra la cuenta del usuario
     * Elimina definitivamente la cuenta del usuario. No se puede deshacer. No funciona con cuentas de administrador 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAccountWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * borra la cuenta del usuario (asynchronously)
     * Elimina definitivamente la cuenta del usuario. No se puede deshacer. No funciona con cuentas de administrador 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteAccountValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deletePlaylist
     * @param playlistID ID de la playlist (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePlaylistCall(String playlistID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/playlists/{playlistID}"
            .replaceAll("\\{" + "playlistID" + "\\}", apiClient.escapeString(playlistID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePlaylistValidateBeforeCall(String playlistID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'playlistID' is set
        if (playlistID == null) {
            throw new ApiException("Missing the required parameter 'playlistID' when calling deletePlaylist(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePlaylistCall(playlistID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina una playlist
     * Elimina la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePlaylist(String playlistID) throws ApiException {
        deletePlaylistWithHttpInfo(playlistID);
    }

    /**
     * elimina una playlist
     * Elimina la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePlaylistWithHttpInfo(String playlistID) throws ApiException {
        com.squareup.okhttp.Call call = deletePlaylistValidateBeforeCall(playlistID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina una playlist (asynchronously)
     * Elimina la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePlaylistAsync(String playlistID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePlaylistValidateBeforeCall(playlistID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deletePlaylistSong
     * @param playlistID ID de la playlist (required)
     * @param songID ID de la canción (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePlaylistSongCall(String playlistID, String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/playlists/{playlistID}/songs/{songID}"
            .replaceAll("\\{" + "playlistID" + "\\}", apiClient.escapeString(playlistID.toString()))
            .replaceAll("\\{" + "songID" + "\\}", apiClient.escapeString(songID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePlaylistSongValidateBeforeCall(String playlistID, String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'playlistID' is set
        if (playlistID == null) {
            throw new ApiException("Missing the required parameter 'playlistID' when calling deletePlaylistSong(Async)");
        }
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling deletePlaylistSong(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePlaylistSongCall(playlistID, songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina una canción de una playlist identificada por playlistID
     * Elimina una canción de la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @param songID ID de la canción (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePlaylistSong(String playlistID, String songID) throws ApiException {
        deletePlaylistSongWithHttpInfo(playlistID, songID);
    }

    /**
     * elimina una canción de una playlist identificada por playlistID
     * Elimina una canción de la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @param songID ID de la canción (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePlaylistSongWithHttpInfo(String playlistID, String songID) throws ApiException {
        com.squareup.okhttp.Call call = deletePlaylistSongValidateBeforeCall(playlistID, songID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina una canción de una playlist identificada por playlistID (asynchronously)
     * Elimina una canción de la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @param songID ID de la canción (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePlaylistSongAsync(String playlistID, String songID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePlaylistSongValidateBeforeCall(playlistID, songID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for followProfile
     * @param profileID ID del perfil (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call followProfileCall(String profileID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/profiles/{profileID}/follow"
            .replaceAll("\\{" + "profileID" + "\\}", apiClient.escapeString(profileID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call followProfileValidateBeforeCall(String profileID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileID' is set
        if (profileID == null) {
            throw new ApiException("Missing the required parameter 'profileID' when calling followProfile(Async)");
        }
        

        com.squareup.okhttp.Call call = followProfileCall(profileID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * comienza a seguir al usuario identificado por profileID
     * Comienza a seguir al usuario identificado por profileID
     * @param profileID ID del perfil (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void followProfile(String profileID) throws ApiException {
        followProfileWithHttpInfo(profileID);
    }

    /**
     * comienza a seguir al usuario identificado por profileID
     * Comienza a seguir al usuario identificado por profileID
     * @param profileID ID del perfil (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> followProfileWithHttpInfo(String profileID) throws ApiException {
        com.squareup.okhttp.Call call = followProfileValidateBeforeCall(profileID, null, null);
        return apiClient.execute(call);
    }

    /**
     * comienza a seguir al usuario identificado por profileID (asynchronously)
     * Comienza a seguir al usuario identificado por profileID
     * @param profileID ID del perfil (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call followProfileAsync(String profileID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = followProfileValidateBeforeCall(profileID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAccount
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccountCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAccountCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * devuelve la información de la cuenta del usuario
     * Devuelve la información de la cuenta del usuario. 
     * @return AccountItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountItem getAccount() throws ApiException {
        ApiResponse<AccountItem> resp = getAccountWithHttpInfo();
        return resp.getData();
    }

    /**
     * devuelve la información de la cuenta del usuario
     * Devuelve la información de la cuenta del usuario. 
     * @return ApiResponse&lt;AccountItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountItem> getAccountWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAccountValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * devuelve la información de la cuenta del usuario (asynchronously)
     * Devuelve la información de la cuenta del usuario. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountAsync(final ApiCallback<AccountItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAccountValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for logout
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call logoutCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/login";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call logoutValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = logoutCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * cierra sesión de usuario
     * Cierra la sesión de usuario
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void logout() throws ApiException {
        logoutWithHttpInfo();
    }

    /**
     * cierra sesión de usuario
     * Cierra la sesión de usuario
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> logoutWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = logoutValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * cierra sesión de usuario (asynchronously)
     * Cierra la sesión de usuario
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call logoutAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = logoutValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for restoreSession
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call restoreSessionCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/account/session";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call restoreSessionValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = restoreSessionCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * devuelve información de sincronización de canciones
     * Devuelve la lista de reproducción, la canción y el segundo que estaba escuchando el usuario previamente 
     * @return SessionItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SessionItem restoreSession() throws ApiException {
        ApiResponse<SessionItem> resp = restoreSessionWithHttpInfo();
        return resp.getData();
    }

    /**
     * devuelve información de sincronización de canciones
     * Devuelve la lista de reproducción, la canción y el segundo que estaba escuchando el usuario previamente 
     * @return ApiResponse&lt;SessionItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SessionItem> restoreSessionWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = restoreSessionValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<SessionItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * devuelve información de sincronización de canciones (asynchronously)
     * Devuelve la lista de reproducción, la canción y el segundo que estaba escuchando el usuario previamente 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call restoreSessionAsync(final ApiCallback<SessionItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = restoreSessionValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SessionItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for saveSession
     * @param sessionItem Datos a sincronizar (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveSessionCall(SessionItem sessionItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = sessionItem;

        // create path and map variables
        String localVarPath = "/account/session";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveSessionValidateBeforeCall(SessionItem sessionItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = saveSessionCall(sessionItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * guarda información de sincronización de canciones
     * Guarda la lista de reproducción, la canción y el segundo que está escuchando el usuario
     * @param sessionItem Datos a sincronizar (optional)
     * @return AccountItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountItem saveSession(SessionItem sessionItem) throws ApiException {
        ApiResponse<AccountItem> resp = saveSessionWithHttpInfo(sessionItem);
        return resp.getData();
    }

    /**
     * guarda información de sincronización de canciones
     * Guarda la lista de reproducción, la canción y el segundo que está escuchando el usuario
     * @param sessionItem Datos a sincronizar (optional)
     * @return ApiResponse&lt;AccountItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountItem> saveSessionWithHttpInfo(SessionItem sessionItem) throws ApiException {
        com.squareup.okhttp.Call call = saveSessionValidateBeforeCall(sessionItem, null, null);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * guarda información de sincronización de canciones (asynchronously)
     * Guarda la lista de reproducción, la canción y el segundo que está escuchando el usuario
     * @param sessionItem Datos a sincronizar (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call saveSessionAsync(SessionItem sessionItem, final ApiCallback<AccountItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = saveSessionValidateBeforeCall(sessionItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for unfollowProfile
     * @param profileID ID del perfil (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call unfollowProfileCall(String profileID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/profiles/{profileID}/follow"
            .replaceAll("\\{" + "profileID" + "\\}", apiClient.escapeString(profileID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call unfollowProfileValidateBeforeCall(String profileID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileID' is set
        if (profileID == null) {
            throw new ApiException("Missing the required parameter 'profileID' when calling unfollowProfile(Async)");
        }
        

        com.squareup.okhttp.Call call = unfollowProfileCall(profileID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * deja de seguir al usuario identificado por profileID
     * Deja de seguir al usuario identificado por profileID 
     * @param profileID ID del perfil (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void unfollowProfile(String profileID) throws ApiException {
        unfollowProfileWithHttpInfo(profileID);
    }

    /**
     * deja de seguir al usuario identificado por profileID
     * Deja de seguir al usuario identificado por profileID 
     * @param profileID ID del perfil (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> unfollowProfileWithHttpInfo(String profileID) throws ApiException {
        com.squareup.okhttp.Call call = unfollowProfileValidateBeforeCall(profileID, null, null);
        return apiClient.execute(call);
    }

    /**
     * deja de seguir al usuario identificado por profileID (asynchronously)
     * Deja de seguir al usuario identificado por profileID 
     * @param profileID ID del perfil (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call unfollowProfileAsync(String profileID, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = unfollowProfileValidateBeforeCall(profileID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateAccount
     * @param accountItem Datos a actualizar (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAccountCall(AccountItemUpdate accountItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = accountItem;

        // create path and map variables
        String localVarPath = "/account";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateAccountValidateBeforeCall(AccountItemUpdate accountItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = updateAccountCall(accountItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * actualiza información de cuenta de usuario
     * Actualiza la información de la cuenta del usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param accountItem Datos a actualizar (optional)
     * @return AccountItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountItem updateAccount(AccountItemUpdate accountItem) throws ApiException {
        ApiResponse<AccountItem> resp = updateAccountWithHttpInfo(accountItem);
        return resp.getData();
    }

    /**
     * actualiza información de cuenta de usuario
     * Actualiza la información de la cuenta del usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param accountItem Datos a actualizar (optional)
     * @return ApiResponse&lt;AccountItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountItem> updateAccountWithHttpInfo(AccountItemUpdate accountItem) throws ApiException {
        com.squareup.okhttp.Call call = updateAccountValidateBeforeCall(accountItem, null, null);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * actualiza información de cuenta de usuario (asynchronously)
     * Actualiza la información de la cuenta del usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param accountItem Datos a actualizar (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAccountAsync(AccountItemUpdate accountItem, final ApiCallback<AccountItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateAccountValidateBeforeCall(accountItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAccountCredentials
     * @param loginItem Datos a actualizar (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAccountCredentialsCall(LoginItem loginItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = loginItem;

        // create path and map variables
        String localVarPath = "/account/credentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateAccountCredentialsValidateBeforeCall(LoginItem loginItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = updateAccountCredentialsCall(loginItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * modifica credenciales de acceso de cuenta de usuario
     * Modifica las credenciales de acceso de la cuenta del usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param loginItem Datos a actualizar (optional)
     * @return AccountItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountItem updateAccountCredentials(LoginItem loginItem) throws ApiException {
        ApiResponse<AccountItem> resp = updateAccountCredentialsWithHttpInfo(loginItem);
        return resp.getData();
    }

    /**
     * modifica credenciales de acceso de cuenta de usuario
     * Modifica las credenciales de acceso de la cuenta del usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param loginItem Datos a actualizar (optional)
     * @return ApiResponse&lt;AccountItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountItem> updateAccountCredentialsWithHttpInfo(LoginItem loginItem) throws ApiException {
        com.squareup.okhttp.Call call = updateAccountCredentialsValidateBeforeCall(loginItem, null, null);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * modifica credenciales de acceso de cuenta de usuario (asynchronously)
     * Modifica las credenciales de acceso de la cuenta del usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param loginItem Datos a actualizar (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAccountCredentialsAsync(LoginItem loginItem, final ApiCallback<AccountItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateAccountCredentialsValidateBeforeCall(loginItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePlaylist
     * @param playlistID ID de la playlist (required)
     * @param playlistItem Playlist item to update (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePlaylistCall(String playlistID, PlaylistItemNew playlistItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = playlistItem;

        // create path and map variables
        String localVarPath = "/playlists/{playlistID}"
            .replaceAll("\\{" + "playlistID" + "\\}", apiClient.escapeString(playlistID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updatePlaylistValidateBeforeCall(String playlistID, PlaylistItemNew playlistItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'playlistID' is set
        if (playlistID == null) {
            throw new ApiException("Missing the required parameter 'playlistID' when calling updatePlaylist(Async)");
        }
        

        com.squareup.okhttp.Call call = updatePlaylistCall(playlistID, playlistItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * actualiza la información de una playlist
     * Un usuario actualiza la información de una playlist de su propiedad.
     * @param playlistID ID de la playlist (required)
     * @param playlistItem Playlist item to update (optional)
     * @return PlaylistItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaylistItem updatePlaylist(String playlistID, PlaylistItemNew playlistItem) throws ApiException {
        ApiResponse<PlaylistItem> resp = updatePlaylistWithHttpInfo(playlistID, playlistItem);
        return resp.getData();
    }

    /**
     * actualiza la información de una playlist
     * Un usuario actualiza la información de una playlist de su propiedad.
     * @param playlistID ID de la playlist (required)
     * @param playlistItem Playlist item to update (optional)
     * @return ApiResponse&lt;PlaylistItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaylistItem> updatePlaylistWithHttpInfo(String playlistID, PlaylistItemNew playlistItem) throws ApiException {
        com.squareup.okhttp.Call call = updatePlaylistValidateBeforeCall(playlistID, playlistItem, null, null);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * actualiza la información de una playlist (asynchronously)
     * Un usuario actualiza la información de una playlist de su propiedad.
     * @param playlistID ID de la playlist (required)
     * @param playlistItem Playlist item to update (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePlaylistAsync(String playlistID, PlaylistItemNew playlistItem, final ApiCallback<PlaylistItem> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updatePlaylistValidateBeforeCall(playlistID, playlistItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
