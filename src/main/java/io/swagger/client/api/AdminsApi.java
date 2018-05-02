

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


import io.swagger.client.model.AlbumItem;
import io.swagger.client.model.AlbumItemNew;
import java.io.File;
import io.swagger.client.model.SongItem;
import io.swagger.client.model.SongItemNew;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminsApi {
    private ApiClient apiClient;

    public AdminsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdminsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addAlbum
     * @param albumItem Album item to add (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addAlbumCall(AlbumItemNew albumItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = albumItem;

        // create path and map variables
        String localVarPath = "/albums";

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
    private com.squareup.okhttp.Call addAlbumValidateBeforeCall(AlbumItemNew albumItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = addAlbumCall(albumItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * crea un álbum
     * Un administrador crea un álbum
     * @param albumItem Album item to add (optional)
     * @return AlbumItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AlbumItem addAlbum(AlbumItemNew albumItem) throws ApiException {
        ApiResponse<AlbumItem> resp = addAlbumWithHttpInfo(albumItem);
        return resp.getData();
    }

    /**
     * crea un álbum
     * Un administrador crea un álbum
     * @param albumItem Album item to add (optional)
     * @return ApiResponse&lt;AlbumItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AlbumItem> addAlbumWithHttpInfo(AlbumItemNew albumItem) throws ApiException {
        com.squareup.okhttp.Call call = addAlbumValidateBeforeCall(albumItem, null, null);
        Type localVarReturnType = new TypeToken<AlbumItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * crea un álbum (asynchronously)
     * Un administrador crea un álbum
     * @param albumItem Album item to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAlbumAsync(AlbumItemNew albumItem, final ApiCallback<AlbumItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addAlbumValidateBeforeCall(albumItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AlbumItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addAlbumSong
     * @param albumID ID del album (required)
     * @param songID Song to add (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addAlbumSongCall(String albumID, String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = songID;

        // create path and map variables
        String localVarPath = "/albums/{albumID}/songs"
            .replaceAll("\\{" + "albumID" + "\\}", apiClient.escapeString(albumID.toString()));

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
    private com.squareup.okhttp.Call addAlbumSongValidateBeforeCall(String albumID, String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'albumID' is set
        if (albumID == null) {
            throw new ApiException("Missing the required parameter 'albumID' when calling addAlbumSong(Async)");
        }
        

        com.squareup.okhttp.Call call = addAlbumSongCall(albumID, songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * añade una canción a un album
     * Un admin añade una canción a un album
     * @param albumID ID del album (required)
     * @param songID Song to add (optional)
     * @return AlbumItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AlbumItem addAlbumSong(String albumID, String songID) throws ApiException {
        ApiResponse<AlbumItem> resp = addAlbumSongWithHttpInfo(albumID, songID);
        return resp.getData();
    }

    /**
     * añade una canción a un album
     * Un admin añade una canción a un album
     * @param albumID ID del album (required)
     * @param songID Song to add (optional)
     * @return ApiResponse&lt;AlbumItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AlbumItem> addAlbumSongWithHttpInfo(String albumID, String songID) throws ApiException {
        com.squareup.okhttp.Call call = addAlbumSongValidateBeforeCall(albumID, songID, null, null);
        Type localVarReturnType = new TypeToken<AlbumItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * añade una canción a un album (asynchronously)
     * Un admin añade una canción a un album
     * @param albumID ID del album (required)
     * @param songID Song to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAlbumSongAsync(String albumID, String songID, final ApiCallback<AlbumItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addAlbumSongValidateBeforeCall(albumID, songID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AlbumItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addSong
     * @param songItem Song item to add (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addSongCall(SongItemNew songItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = songItem;

        // create path and map variables
        String localVarPath = "/songs";

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
    private com.squareup.okhttp.Call addSongValidateBeforeCall(SongItemNew songItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = addSongCall(songItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * añade una canción
     * Un admin añade una canción a la base de datos.
     * @param songItem Song item to add (optional)
     * @return SongItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SongItem addSong(SongItemNew songItem) throws ApiException {
        ApiResponse<SongItem> resp = addSongWithHttpInfo(songItem);
        return resp.getData();
    }

    /**
     * añade una canción
     * Un admin añade una canción a la base de datos.
     * @param songItem Song item to add (optional)
     * @return ApiResponse&lt;SongItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SongItem> addSongWithHttpInfo(SongItemNew songItem) throws ApiException {
        com.squareup.okhttp.Call call = addSongValidateBeforeCall(songItem, null, null);
        Type localVarReturnType = new TypeToken<SongItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * añade una canción (asynchronously)
     * Un admin añade una canción a la base de datos.
     * @param songItem Song item to add (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addSongAsync(SongItemNew songItem, final ApiCallback<SongItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addSongValidateBeforeCall(songItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SongItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteAlbum
     * @param albumID ID del álbum (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAlbumCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/albums/{albumID}"
            .replaceAll("\\{" + "albumID" + "\\}", apiClient.escapeString(albumID.toString()));

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
    private com.squareup.okhttp.Call deleteAlbumValidateBeforeCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'albumID' is set
        if (albumID == null) {
            throw new ApiException("Missing the required parameter 'albumID' when calling deleteAlbum(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteAlbumCall(albumID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina un álbum
     * Elimina el álbum identificado por albumID 
     * @param albumID ID del álbum (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAlbum(String albumID) throws ApiException {
        deleteAlbumWithHttpInfo(albumID);
    }

    /**
     * elimina un álbum
     * Elimina el álbum identificado por albumID 
     * @param albumID ID del álbum (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAlbumWithHttpInfo(String albumID) throws ApiException {
        com.squareup.okhttp.Call call = deleteAlbumValidateBeforeCall(albumID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina un álbum (asynchronously)
     * Elimina el álbum identificado por albumID 
     * @param albumID ID del álbum (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAlbumAsync(String albumID, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAlbumValidateBeforeCall(albumID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteAlbumImage
     * @param albumID ID del álbum (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAlbumImageCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/albums/{albumID}/image"
            .replaceAll("\\{" + "albumID" + "\\}", apiClient.escapeString(albumID.toString()));

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
    private com.squareup.okhttp.Call deleteAlbumImageValidateBeforeCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'albumID' is set
        if (albumID == null) {
            throw new ApiException("Missing the required parameter 'albumID' when calling deleteAlbumImage(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteAlbumImageCall(albumID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina la carátula de un álbum
     * Elimina la carátula de un álbum identificadoa por albumID 
     * @param albumID ID del álbum (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAlbumImage(String albumID) throws ApiException {
        deleteAlbumImageWithHttpInfo(albumID);
    }

    /**
     * elimina la carátula de un álbum
     * Elimina la carátula de un álbum identificadoa por albumID 
     * @param albumID ID del álbum (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAlbumImageWithHttpInfo(String albumID) throws ApiException {
        com.squareup.okhttp.Call call = deleteAlbumImageValidateBeforeCall(albumID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina la carátula de un álbum (asynchronously)
     * Elimina la carátula de un álbum identificadoa por albumID 
     * @param albumID ID del álbum (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAlbumImageAsync(String albumID, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAlbumImageValidateBeforeCall(albumID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteAuthorImage
     * @param authorID ID del autor (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAuthorImageCall(String authorID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authors/{authorID}/image"
            .replaceAll("\\{" + "authorID" + "\\}", apiClient.escapeString(authorID.toString()));

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
    private com.squareup.okhttp.Call deleteAuthorImageValidateBeforeCall(String authorID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorID' is set
        if (authorID == null) {
            throw new ApiException("Missing the required parameter 'authorID' when calling deleteAuthorImage(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteAuthorImageCall(authorID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina la imagen de un autor
     * Elimina la imagen de un autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAuthorImage(String authorID) throws ApiException {
        deleteAuthorImageWithHttpInfo(authorID);
    }

    /**
     * elimina la imagen de un autor
     * Elimina la imagen de un autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAuthorImageWithHttpInfo(String authorID) throws ApiException {
        com.squareup.okhttp.Call call = deleteAuthorImageValidateBeforeCall(authorID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina la imagen de un autor (asynchronously)
     * Elimina la imagen de un autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAuthorImageAsync(String authorID, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAuthorImageValidateBeforeCall(authorID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteSong
     * @param songID ID de la canción (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSongCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs/{songID}"
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
    private com.squareup.okhttp.Call deleteSongValidateBeforeCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling deleteSong(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteSongCall(songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina una canción
     * Elimina información y fichero de  la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSong(String songID) throws ApiException {
        deleteSongWithHttpInfo(songID);
    }

    /**
     * elimina una canción
     * Elimina información y fichero de  la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSongWithHttpInfo(String songID) throws ApiException {
        com.squareup.okhttp.Call call = deleteSongValidateBeforeCall(songID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina una canción (asynchronously)
     * Elimina información y fichero de  la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSongAsync(String songID, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSongValidateBeforeCall(songID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteSongFile
     * @param songID ID de la canción (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSongFileCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs/{songID}/file"
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
    private com.squareup.okhttp.Call deleteSongFileValidateBeforeCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling deleteSongFile(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteSongFileCall(songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina el archivo de audio de una canción
     * Elimina el fichero de audio de una canción identificada por songID 
     * @param songID ID de la canción (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSongFile(String songID) throws ApiException {
        deleteSongFileWithHttpInfo(songID);
    }

    /**
     * elimina el archivo de audio de una canción
     * Elimina el fichero de audio de una canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSongFileWithHttpInfo(String songID) throws ApiException {
        com.squareup.okhttp.Call call = deleteSongFileValidateBeforeCall(songID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina el archivo de audio de una canción (asynchronously)
     * Elimina el fichero de audio de una canción identificada por songID 
     * @param songID ID de la canción (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSongFileAsync(String songID, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSongFileValidateBeforeCall(songID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteSongImage
     * @param songID ID de la canción (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSongImageCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs/{songID}/image"
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
    private com.squareup.okhttp.Call deleteSongImageValidateBeforeCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling deleteSongImage(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteSongImageCall(songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * elimina la carátula de una canción
     * Elimina la carátula de una canción identificada por songID 
     * @param songID ID de la canción (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSongImage(String songID) throws ApiException {
        deleteSongImageWithHttpInfo(songID);
    }

    /**
     * elimina la carátula de una canción
     * Elimina la carátula de una canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSongImageWithHttpInfo(String songID) throws ApiException {
        com.squareup.okhttp.Call call = deleteSongImageValidateBeforeCall(songID, null, null);
        return apiClient.execute(call);
    }

    /**
     * elimina la carátula de una canción (asynchronously)
     * Elimina la carátula de una canción identificada por songID 
     * @param songID ID de la canción (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSongImageAsync(String songID, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSongImageValidateBeforeCall(songID, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateSong
     * @param songID ID de la canción (required)
     * @param songItem Song item to update (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateSongCall(String songID, SongItemNew songItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = songItem;

        // create path and map variables
        String localVarPath = "/songs/{songID}"
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
    private com.squareup.okhttp.Call updateSongValidateBeforeCall(String songID, SongItemNew songItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling updateSong(Async)");
        }
        

        com.squareup.okhttp.Call call = updateSongCall(songID, songItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * actualiza la información de una canción
     * Un admin actualiza la información de una canción.
     * @param songID ID de la canción (required)
     * @param songItem Song item to update (optional)
     * @return SongItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SongItem updateSong(String songID, SongItemNew songItem) throws ApiException {
        ApiResponse<SongItem> resp = updateSongWithHttpInfo(songID, songItem);
        return resp.getData();
    }

    /**
     * actualiza la información de una canción
     * Un admin actualiza la información de una canción.
     * @param songID ID de la canción (required)
     * @param songItem Song item to update (optional)
     * @return ApiResponse&lt;SongItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SongItem> updateSongWithHttpInfo(String songID, SongItemNew songItem) throws ApiException {
        com.squareup.okhttp.Call call = updateSongValidateBeforeCall(songID, songItem, null, null);
        Type localVarReturnType = new TypeToken<SongItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * actualiza la información de una canción (asynchronously)
     * Un admin actualiza la información de una canción.
     * @param songID ID de la canción (required)
     * @param songItem Song item to update (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSongAsync(String songID, SongItemNew songItem, final ApiCallback<SongItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateSongValidateBeforeCall(songID, songItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SongItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for uploadAlbumImage
     * @param albumID ID del álbum (required)
     * @param albumImage Album image to update (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadAlbumImageCall(String albumID, File albumImage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/albums/{albumID}/image"
            .replaceAll("\\{" + "albumID" + "\\}", apiClient.escapeString(albumID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (albumImage != null)
        localVarFormParams.put("albumImage", albumImage);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call uploadAlbumImageValidateBeforeCall(String albumID, File albumImage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'albumID' is set
        if (albumID == null) {
            throw new ApiException("Missing the required parameter 'albumID' when calling uploadAlbumImage(Async)");
        }
        
        // verify the required parameter 'albumImage' is set
        if (albumImage == null) {
            throw new ApiException("Missing the required parameter 'albumImage' when calling uploadAlbumImage(Async)");
        }
        

        com.squareup.okhttp.Call call = uploadAlbumImageCall(albumID, albumImage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * carga la carátula de un álbum
     * Un admin carga la carátula de un álbum con identificador albumID.
     * @param albumID ID del álbum (required)
     * @param albumImage Album image to update (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void uploadAlbumImage(String albumID, File albumImage) throws ApiException {
        uploadAlbumImageWithHttpInfo(albumID, albumImage);
    }

    /**
     * carga la carátula de un álbum
     * Un admin carga la carátula de un álbum con identificador albumID.
     * @param albumID ID del álbum (required)
     * @param albumImage Album image to update (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> uploadAlbumImageWithHttpInfo(String albumID, File albumImage) throws ApiException {
        com.squareup.okhttp.Call call = uploadAlbumImageValidateBeforeCall(albumID, albumImage, null, null);
        return apiClient.execute(call);
    }

    /**
     * carga la carátula de un álbum (asynchronously)
     * Un admin carga la carátula de un álbum con identificador albumID.
     * @param albumID ID del álbum (required)
     * @param albumImage Album image to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadAlbumImageAsync(String albumID, File albumImage, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uploadAlbumImageValidateBeforeCall(albumID, albumImage, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for uploadAuthorImage
     * @param authorID ID del autor (required)
     * @param authorImage Image item to update (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadAuthorImageCall(String authorID, File authorImage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authors/{authorID}/image"
            .replaceAll("\\{" + "authorID" + "\\}", apiClient.escapeString(authorID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (authorImage != null)
        localVarFormParams.put("authorImage", authorImage);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call uploadAuthorImageValidateBeforeCall(String authorID, File authorImage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorID' is set
        if (authorID == null) {
            throw new ApiException("Missing the required parameter 'authorID' when calling uploadAuthorImage(Async)");
        }
        
        // verify the required parameter 'authorImage' is set
        if (authorImage == null) {
            throw new ApiException("Missing the required parameter 'authorImage' when calling uploadAuthorImage(Async)");
        }
        

        com.squareup.okhttp.Call call = uploadAuthorImageCall(authorID, authorImage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * carga la imagen e un autor
     * Un admin carga la imagen de un autor con identificador authorID.
     * @param authorID ID del autor (required)
     * @param authorImage Image item to update (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void uploadAuthorImage(String authorID, File authorImage) throws ApiException {
        uploadAuthorImageWithHttpInfo(authorID, authorImage);
    }

    /**
     * carga la imagen e un autor
     * Un admin carga la imagen de un autor con identificador authorID.
     * @param authorID ID del autor (required)
     * @param authorImage Image item to update (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> uploadAuthorImageWithHttpInfo(String authorID, File authorImage) throws ApiException {
        com.squareup.okhttp.Call call = uploadAuthorImageValidateBeforeCall(authorID, authorImage, null, null);
        return apiClient.execute(call);
    }

    /**
     * carga la imagen e un autor (asynchronously)
     * Un admin carga la imagen de un autor con identificador authorID.
     * @param authorID ID del autor (required)
     * @param authorImage Image item to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadAuthorImageAsync(String authorID, File authorImage, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uploadAuthorImageValidateBeforeCall(authorID, authorImage, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for uploadSongFile
     * @param songID ID de la canción (required)
     * @param songFile Song item to update (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadSongFileCall(String songID, File songFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs/{songID}/file"
            .replaceAll("\\{" + "songID" + "\\}", apiClient.escapeString(songID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (songFile != null)
        localVarFormParams.put("songFile", songFile);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call uploadSongFileValidateBeforeCall(String songID, File songFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling uploadSongFile(Async)");
        }
        
        // verify the required parameter 'songFile' is set
        if (songFile == null) {
            throw new ApiException("Missing the required parameter 'songFile' when calling uploadSongFile(Async)");
        }
        

        com.squareup.okhttp.Call call = uploadSongFileCall(songID, songFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * carga el archivo de audio de una canción
     * Un admin carga el archivo de audio de una canción con identificador songID.
     * @param songID ID de la canción (required)
     * @param songFile Song item to update (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void uploadSongFile(String songID, File songFile) throws ApiException {
        uploadSongFileWithHttpInfo(songID, songFile);
    }

    /**
     * carga el archivo de audio de una canción
     * Un admin carga el archivo de audio de una canción con identificador songID.
     * @param songID ID de la canción (required)
     * @param songFile Song item to update (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> uploadSongFileWithHttpInfo(String songID, File songFile) throws ApiException {
        com.squareup.okhttp.Call call = uploadSongFileValidateBeforeCall(songID, songFile, null, null);
        return apiClient.execute(call);
    }

    /**
     * carga el archivo de audio de una canción (asynchronously)
     * Un admin carga el archivo de audio de una canción con identificador songID.
     * @param songID ID de la canción (required)
     * @param songFile Song item to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadSongFileAsync(String songID, File songFile, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uploadSongFileValidateBeforeCall(songID, songFile, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for uploadSongImage
     * @param songID ID de la canción (required)
     * @param songImage Image item to update (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadSongImageCall(String songID, File songImage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs/{songID}/image"
            .replaceAll("\\{" + "songID" + "\\}", apiClient.escapeString(songID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (songImage != null)
        localVarFormParams.put("songImage", songImage);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call uploadSongImageValidateBeforeCall(String songID, File songImage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling uploadSongImage(Async)");
        }
        
        // verify the required parameter 'songImage' is set
        if (songImage == null) {
            throw new ApiException("Missing the required parameter 'songImage' when calling uploadSongImage(Async)");
        }
        

        com.squareup.okhttp.Call call = uploadSongImageCall(songID, songImage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * carga la carátula de una canción
     * Un admin carga la carátula de una canción con identificador songID.
     * @param songID ID de la canción (required)
     * @param songImage Image item to update (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void uploadSongImage(String songID, File songImage) throws ApiException {
        uploadSongImageWithHttpInfo(songID, songImage);
    }

    /**
     * carga la carátula de una canción
     * Un admin carga la carátula de una canción con identificador songID.
     * @param songID ID de la canción (required)
     * @param songImage Image item to update (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> uploadSongImageWithHttpInfo(String songID, File songImage) throws ApiException {
        com.squareup.okhttp.Call call = uploadSongImageValidateBeforeCall(songID, songImage, null, null);
        return apiClient.execute(call);
    }

    /**
     * carga la carátula de una canción (asynchronously)
     * Un admin carga la carátula de una canción con identificador songID.
     * @param songID ID de la canción (required)
     * @param songImage Image item to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadSongImageAsync(String songID, File songImage, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = uploadSongImageValidateBeforeCall(songID, songImage, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
