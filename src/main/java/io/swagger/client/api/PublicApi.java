

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
import io.swagger.client.model.AlbumItem;
import io.swagger.client.model.AuthorItem;
import java.io.File;
import io.swagger.client.model.LoginItem;
import io.swagger.client.model.PlaylistItem;
import io.swagger.client.model.ProfileItem;
import io.swagger.client.model.SignUpItem;
import io.swagger.client.model.SongItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicApi {
    private ApiClient apiClient;

    public PublicApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAccount
     * @param signupItem Datos de la nueva cuenta (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAccountCall(SignUpItem signupItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = signupItem;

        // create path and map variables
        String localVarPath = "/signup";

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
    private com.squareup.okhttp.Call createAccountValidateBeforeCall(SignUpItem signupItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createAccountCall(signupItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * crea cuenta de usuario
     * Crea una cuenta de usuario
     * @param signupItem Datos de la nueva cuenta (optional)
     * @return AccountItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountItem createAccount(SignUpItem signupItem) throws ApiException {
        ApiResponse<AccountItem> resp = createAccountWithHttpInfo(signupItem);
        return resp.getData();
    }

    /**
     * crea cuenta de usuario
     * Crea una cuenta de usuario
     * @param signupItem Datos de la nueva cuenta (optional)
     * @return ApiResponse&lt;AccountItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountItem> createAccountWithHttpInfo(SignUpItem signupItem) throws ApiException {
        com.squareup.okhttp.Call call = createAccountValidateBeforeCall(signupItem, null, null);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * crea cuenta de usuario (asynchronously)
     * Crea una cuenta de usuario
     * @param signupItem Datos de la nueva cuenta (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountAsync(SignUpItem signupItem, final ApiCallback<AccountItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccountValidateBeforeCall(signupItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAlbum
     * @param albumID ID del álbum (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAlbumCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAlbumValidateBeforeCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'albumID' is set
        if (albumID == null) {
            throw new ApiException("Missing the required parameter 'albumID' when calling getAlbum(Async)");
        }
        

        com.squareup.okhttp.Call call = getAlbumCall(albumID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene un álbum
     * Obtiene los datos del álbum identificada por albumID 
     * @param albumID ID del álbum (required)
     * @return AlbumItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AlbumItem getAlbum(String albumID) throws ApiException {
        ApiResponse<AlbumItem> resp = getAlbumWithHttpInfo(albumID);
        return resp.getData();
    }

    /**
     * obtiene un álbum
     * Obtiene los datos del álbum identificada por albumID 
     * @param albumID ID del álbum (required)
     * @return ApiResponse&lt;AlbumItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AlbumItem> getAlbumWithHttpInfo(String albumID) throws ApiException {
        com.squareup.okhttp.Call call = getAlbumValidateBeforeCall(albumID, null, null);
        Type localVarReturnType = new TypeToken<AlbumItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene un álbum (asynchronously)
     * Obtiene los datos del álbum identificada por albumID 
     * @param albumID ID del álbum (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlbumAsync(String albumID, final ApiCallback<AlbumItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlbumValidateBeforeCall(albumID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AlbumItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAlbumImage
     * @param albumID ID del álbum (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAlbumImageCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/albums/{albumID}/image"
            .replaceAll("\\{" + "albumID" + "\\}", apiClient.escapeString(albumID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/png"
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
    private com.squareup.okhttp.Call getAlbumImageValidateBeforeCall(String albumID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'albumID' is set
        if (albumID == null) {
            throw new ApiException("Missing the required parameter 'albumID' when calling getAlbumImage(Async)");
        }
        

        com.squareup.okhttp.Call call = getAlbumImageCall(albumID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene la carátula de un álbum
     * Obtiene la carátula de un álbum identificado por albumID 
     * @param albumID ID del álbum (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getAlbumImage(String albumID) throws ApiException {
        ApiResponse<File> resp = getAlbumImageWithHttpInfo(albumID);
        return resp.getData();
    }

    /**
     * obtiene la carátula de un álbum
     * Obtiene la carátula de un álbum identificado por albumID 
     * @param albumID ID del álbum (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getAlbumImageWithHttpInfo(String albumID) throws ApiException {
        com.squareup.okhttp.Call call = getAlbumImageValidateBeforeCall(albumID, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene la carátula de un álbum (asynchronously)
     * Obtiene la carátula de un álbum identificado por albumID 
     * @param albumID ID del álbum (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAlbumImageAsync(String albumID, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAlbumImageValidateBeforeCall(albumID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAuthor
     * @param authorID ID del autor (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAuthorCall(String authorID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authors/{authorID}"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAuthorValidateBeforeCall(String authorID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorID' is set
        if (authorID == null) {
            throw new ApiException("Missing the required parameter 'authorID' when calling getAuthor(Async)");
        }
        

        com.squareup.okhttp.Call call = getAuthorCall(authorID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene un perfil de autor identificado por authorID
     * Obtiene un perfil de autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @return AuthorItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AuthorItem getAuthor(String authorID) throws ApiException {
        ApiResponse<AuthorItem> resp = getAuthorWithHttpInfo(authorID);
        return resp.getData();
    }

    /**
     * obtiene un perfil de autor identificado por authorID
     * Obtiene un perfil de autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @return ApiResponse&lt;AuthorItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AuthorItem> getAuthorWithHttpInfo(String authorID) throws ApiException {
        com.squareup.okhttp.Call call = getAuthorValidateBeforeCall(authorID, null, null);
        Type localVarReturnType = new TypeToken<AuthorItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene un perfil de autor identificado por authorID (asynchronously)
     * Obtiene un perfil de autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAuthorAsync(String authorID, final ApiCallback<AuthorItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAuthorValidateBeforeCall(authorID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AuthorItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAuthorImage
     * @param authorID ID del autor (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAuthorImageCall(String authorID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authors/{authorID}/image"
            .replaceAll("\\{" + "authorID" + "\\}", apiClient.escapeString(authorID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/png"
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
    private com.squareup.okhttp.Call getAuthorImageValidateBeforeCall(String authorID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorID' is set
        if (authorID == null) {
            throw new ApiException("Missing the required parameter 'authorID' when calling getAuthorImage(Async)");
        }
        

        com.squareup.okhttp.Call call = getAuthorImageCall(authorID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene la imagen de un autor
     * Obtiene la imagen de un autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getAuthorImage(String authorID) throws ApiException {
        ApiResponse<File> resp = getAuthorImageWithHttpInfo(authorID);
        return resp.getData();
    }

    /**
     * obtiene la imagen de un autor
     * Obtiene la imagen de un autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getAuthorImageWithHttpInfo(String authorID) throws ApiException {
        com.squareup.okhttp.Call call = getAuthorImageValidateBeforeCall(authorID, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene la imagen de un autor (asynchronously)
     * Obtiene la imagen de un autor identificado por authorID 
     * @param authorID ID del autor (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAuthorImageAsync(String authorID, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAuthorImageValidateBeforeCall(authorID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPlaylist
     * @param playlistID ID de la playlist (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPlaylistCall(String playlistID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPlaylistValidateBeforeCall(String playlistID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'playlistID' is set
        if (playlistID == null) {
            throw new ApiException("Missing the required parameter 'playlistID' when calling getPlaylist(Async)");
        }
        

        com.squareup.okhttp.Call call = getPlaylistCall(playlistID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene una playlist
     * Obtiene los datos de la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @return PlaylistItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaylistItem getPlaylist(String playlistID) throws ApiException {
        ApiResponse<PlaylistItem> resp = getPlaylistWithHttpInfo(playlistID);
        return resp.getData();
    }

    /**
     * obtiene una playlist
     * Obtiene los datos de la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @return ApiResponse&lt;PlaylistItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaylistItem> getPlaylistWithHttpInfo(String playlistID) throws ApiException {
        com.squareup.okhttp.Call call = getPlaylistValidateBeforeCall(playlistID, null, null);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene una playlist (asynchronously)
     * Obtiene los datos de la playlist identificada por playlistID 
     * @param playlistID ID de la playlist (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlaylistAsync(String playlistID, final ApiCallback<PlaylistItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPlaylistValidateBeforeCall(playlistID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlaylistItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProfile
     * @param profileID ID del perfil (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProfileCall(String profileID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/profiles/{profileID}"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProfileValidateBeforeCall(String profileID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'profileID' is set
        if (profileID == null) {
            throw new ApiException("Missing the required parameter 'profileID' when calling getProfile(Async)");
        }
        

        com.squareup.okhttp.Call call = getProfileCall(profileID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene un perfil de usuario identificado por profileID
     * Obtiene un perfil de usuario identificado por profileID. 
     * @param profileID ID del perfil (required)
     * @return ProfileItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProfileItem getProfile(String profileID) throws ApiException {
        ApiResponse<ProfileItem> resp = getProfileWithHttpInfo(profileID);
        return resp.getData();
    }

    /**
     * obtiene un perfil de usuario identificado por profileID
     * Obtiene un perfil de usuario identificado por profileID. 
     * @param profileID ID del perfil (required)
     * @return ApiResponse&lt;ProfileItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProfileItem> getProfileWithHttpInfo(String profileID) throws ApiException {
        com.squareup.okhttp.Call call = getProfileValidateBeforeCall(profileID, null, null);
        Type localVarReturnType = new TypeToken<ProfileItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene un perfil de usuario identificado por profileID (asynchronously)
     * Obtiene un perfil de usuario identificado por profileID. 
     * @param profileID ID del perfil (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProfileAsync(String profileID, final ApiCallback<ProfileItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProfileValidateBeforeCall(profileID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProfileItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSong
     * @param songID ID de la canción (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSongCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSongValidateBeforeCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling getSong(Async)");
        }
        

        com.squareup.okhttp.Call call = getSongCall(songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene información de una canción
     * Obtiene los datos de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return SongItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SongItem getSong(String songID) throws ApiException {
        ApiResponse<SongItem> resp = getSongWithHttpInfo(songID);
        return resp.getData();
    }

    /**
     * obtiene información de una canción
     * Obtiene los datos de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return ApiResponse&lt;SongItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SongItem> getSongWithHttpInfo(String songID) throws ApiException {
        com.squareup.okhttp.Call call = getSongValidateBeforeCall(songID, null, null);
        Type localVarReturnType = new TypeToken<SongItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene información de una canción (asynchronously)
     * Obtiene los datos de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSongAsync(String songID, final ApiCallback<SongItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSongValidateBeforeCall(songID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SongItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSongFile
     * @param songID ID de la canción (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSongFileCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs/{songID}/file"
            .replaceAll("\\{" + "songID" + "\\}", apiClient.escapeString(songID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.mp3"
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
    private com.squareup.okhttp.Call getSongFileValidateBeforeCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling getSongFile(Async)");
        }
        

        com.squareup.okhttp.Call call = getSongFileCall(songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene el archivo de audio de una canción
     * Obtiene el archivo de audio de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getSongFile(String songID) throws ApiException {
        ApiResponse<File> resp = getSongFileWithHttpInfo(songID);
        return resp.getData();
    }

    /**
     * obtiene el archivo de audio de una canción
     * Obtiene el archivo de audio de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getSongFileWithHttpInfo(String songID) throws ApiException {
        com.squareup.okhttp.Call call = getSongFileValidateBeforeCall(songID, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene el archivo de audio de una canción (asynchronously)
     * Obtiene el archivo de audio de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSongFileAsync(String songID, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSongFileValidateBeforeCall(songID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSongImage
     * @param songID ID de la canción (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSongImageCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs/{songID}/image"
            .replaceAll("\\{" + "songID" + "\\}", apiClient.escapeString(songID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/png"
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
    private com.squareup.okhttp.Call getSongImageValidateBeforeCall(String songID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'songID' is set
        if (songID == null) {
            throw new ApiException("Missing the required parameter 'songID' when calling getSongImage(Async)");
        }
        

        com.squareup.okhttp.Call call = getSongImageCall(songID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * obtiene la carátula de una canción
     * Obtiene la carátula de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getSongImage(String songID) throws ApiException {
        ApiResponse<File> resp = getSongImageWithHttpInfo(songID);
        return resp.getData();
    }

    /**
     * obtiene la carátula de una canción
     * Obtiene la carátula de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getSongImageWithHttpInfo(String songID) throws ApiException {
        com.squareup.okhttp.Call call = getSongImageValidateBeforeCall(songID, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * obtiene la carátula de una canción (asynchronously)
     * Obtiene la carátula de la canción identificada por songID 
     * @param songID ID de la canción (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSongImageAsync(String songID, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSongImageValidateBeforeCall(songID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for login
     * @param loginItem Credenciales (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loginCall(LoginItem loginItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = loginItem;

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
    private com.squareup.okhttp.Call loginValidateBeforeCall(LoginItem loginItem, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = loginCall(loginItem, progressListener, progressRequestListener);
        return call;

    }

    /**
     * inicia sesión de usuario
     * Inicia sesión de usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param loginItem Credenciales (optional)
     * @return AccountItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountItem login(LoginItem loginItem) throws ApiException {
        ApiResponse<AccountItem> resp = loginWithHttpInfo(loginItem);
        return resp.getData();
    }

    /**
     * inicia sesión de usuario
     * Inicia sesión de usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param loginItem Credenciales (optional)
     * @return ApiResponse&lt;AccountItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountItem> loginWithHttpInfo(LoginItem loginItem) throws ApiException {
        com.squareup.okhttp.Call call = loginValidateBeforeCall(loginItem, null, null);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * inicia sesión de usuario (asynchronously)
     * Inicia sesión de usuario. El campo \&quot;friends\&quot; de los amigos de un usuario está siempre vacío (valor NULL)
     * @param loginItem Credenciales (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loginAsync(LoginItem loginItem, final ApiCallback<AccountItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = loginValidateBeforeCall(loginItem, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchAlbum
     * @param name nombre del álbum (optional)
     * @param author autor del álbum (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchAlbumCall(String name, String author, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/albums";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (author != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("author", author));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call searchAlbumValidateBeforeCall(String name, String author, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchAlbumCall(name, author, skip, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * busca álbunes con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve álbunes que se ajusten a ellos 
     * @param name nombre del álbum (optional)
     * @param author autor del álbum (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return List&lt;AlbumItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AlbumItem> searchAlbum(String name, String author, Integer skip, Integer limit) throws ApiException {
        ApiResponse<List<AlbumItem>> resp = searchAlbumWithHttpInfo(name, author, skip, limit);
        return resp.getData();
    }

    /**
     * busca álbunes con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve álbunes que se ajusten a ellos 
     * @param name nombre del álbum (optional)
     * @param author autor del álbum (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return ApiResponse&lt;List&lt;AlbumItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AlbumItem>> searchAlbumWithHttpInfo(String name, String author, Integer skip, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchAlbumValidateBeforeCall(name, author, skip, limit, null, null);
        Type localVarReturnType = new TypeToken<List<AlbumItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * busca álbunes con ciertos parámetros (asynchronously)
     * Al pasarle ciertos parámetros devuelve álbunes que se ajusten a ellos 
     * @param name nombre del álbum (optional)
     * @param author autor del álbum (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAlbumAsync(String name, String author, Integer skip, Integer limit, final ApiCallback<List<AlbumItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchAlbumValidateBeforeCall(name, author, skip, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AlbumItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchAuthors
     * @param name nombre del autor (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchAuthorsCall(String name, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/authors";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call searchAuthorsValidateBeforeCall(String name, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchAuthorsCall(name, skip, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * busca autores con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve autores que se ajusten a ellos 
     * @param name nombre del autor (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return List&lt;AuthorItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuthorItem> searchAuthors(String name, Integer skip, Integer limit) throws ApiException {
        ApiResponse<List<AuthorItem>> resp = searchAuthorsWithHttpInfo(name, skip, limit);
        return resp.getData();
    }

    /**
     * busca autores con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve autores que se ajusten a ellos 
     * @param name nombre del autor (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return ApiResponse&lt;List&lt;AuthorItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuthorItem>> searchAuthorsWithHttpInfo(String name, Integer skip, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchAuthorsValidateBeforeCall(name, skip, limit, null, null);
        Type localVarReturnType = new TypeToken<List<AuthorItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * busca autores con ciertos parámetros (asynchronously)
     * Al pasarle ciertos parámetros devuelve autores que se ajusten a ellos 
     * @param name nombre del autor (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAuthorsAsync(String name, Integer skip, Integer limit, final ApiCallback<List<AuthorItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchAuthorsValidateBeforeCall(name, skip, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuthorItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchPlaylist
     * @param name nombre de la lista (optional)
     * @param owner propietario de la lista (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchPlaylistCall(String name, String owner, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/playlists";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (owner != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("owner", owner));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call searchPlaylistValidateBeforeCall(String name, String owner, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchPlaylistCall(name, owner, skip, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * busca listas de reproducción con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve listas de reproducción que se ajusten a ellos 
     * @param name nombre de la lista (optional)
     * @param owner propietario de la lista (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return List&lt;PlaylistItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PlaylistItem> searchPlaylist(String name, String owner, Integer skip, Integer limit) throws ApiException {
        ApiResponse<List<PlaylistItem>> resp = searchPlaylistWithHttpInfo(name, owner, skip, limit);
        return resp.getData();
    }

    /**
     * busca listas de reproducción con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve listas de reproducción que se ajusten a ellos 
     * @param name nombre de la lista (optional)
     * @param owner propietario de la lista (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return ApiResponse&lt;List&lt;PlaylistItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PlaylistItem>> searchPlaylistWithHttpInfo(String name, String owner, Integer skip, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchPlaylistValidateBeforeCall(name, owner, skip, limit, null, null);
        Type localVarReturnType = new TypeToken<List<PlaylistItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * busca listas de reproducción con ciertos parámetros (asynchronously)
     * Al pasarle ciertos parámetros devuelve listas de reproducción que se ajusten a ellos 
     * @param name nombre de la lista (optional)
     * @param owner propietario de la lista (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchPlaylistAsync(String name, String owner, Integer skip, Integer limit, final ApiCallback<List<PlaylistItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchPlaylistValidateBeforeCall(name, owner, skip, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PlaylistItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchProfiles
     * @param name nombre del usuario (optional)
     * @param username username del usuario (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchProfilesCall(String name, String username, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/profiles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("username", username));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call searchProfilesValidateBeforeCall(String name, String username, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchProfilesCall(name, username, skip, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * busca usuarios con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve usuarios que se ajusten a ellos. 
     * @param name nombre del usuario (optional)
     * @param username username del usuario (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return List&lt;ProfileItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ProfileItem> searchProfiles(String name, String username, Integer skip, Integer limit) throws ApiException {
        ApiResponse<List<ProfileItem>> resp = searchProfilesWithHttpInfo(name, username, skip, limit);
        return resp.getData();
    }

    /**
     * busca usuarios con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve usuarios que se ajusten a ellos. 
     * @param name nombre del usuario (optional)
     * @param username username del usuario (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return ApiResponse&lt;List&lt;ProfileItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ProfileItem>> searchProfilesWithHttpInfo(String name, String username, Integer skip, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchProfilesValidateBeforeCall(name, username, skip, limit, null, null);
        Type localVarReturnType = new TypeToken<List<ProfileItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * busca usuarios con ciertos parámetros (asynchronously)
     * Al pasarle ciertos parámetros devuelve usuarios que se ajusten a ellos. 
     * @param name nombre del usuario (optional)
     * @param username username del usuario (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchProfilesAsync(String name, String username, Integer skip, Integer limit, final ApiCallback<List<ProfileItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchProfilesValidateBeforeCall(name, username, skip, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ProfileItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchSong
     * @param name nombre de la canción (optional)
     * @param author autor de la canción (optional)
     * @param genre genero de la canción (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchSongCall(String name, String author, String genre, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/songs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (author != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("author", author));
        if (genre != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("genre", genre));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skip", skip));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

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
    private com.squareup.okhttp.Call searchSongValidateBeforeCall(String name, String author, String genre, Integer skip, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchSongCall(name, author, genre, skip, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * busca canciones con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve cancionese que se ajusten a ellos 
     * @param name nombre de la canción (optional)
     * @param author autor de la canción (optional)
     * @param genre genero de la canción (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return List&lt;SongItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SongItem> searchSong(String name, String author, String genre, Integer skip, Integer limit) throws ApiException {
        ApiResponse<List<SongItem>> resp = searchSongWithHttpInfo(name, author, genre, skip, limit);
        return resp.getData();
    }

    /**
     * busca canciones con ciertos parámetros
     * Al pasarle ciertos parámetros devuelve cancionese que se ajusten a ellos 
     * @param name nombre de la canción (optional)
     * @param author autor de la canción (optional)
     * @param genre genero de la canción (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @return ApiResponse&lt;List&lt;SongItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SongItem>> searchSongWithHttpInfo(String name, String author, String genre, Integer skip, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = searchSongValidateBeforeCall(name, author, genre, skip, limit, null, null);
        Type localVarReturnType = new TypeToken<List<SongItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * busca canciones con ciertos parámetros (asynchronously)
     * Al pasarle ciertos parámetros devuelve cancionese que se ajusten a ellos 
     * @param name nombre de la canción (optional)
     * @param author autor de la canción (optional)
     * @param genre genero de la canción (optional)
     * @param skip number of records to skip for pagination (optional)
     * @param limit maximum number of records to return (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchSongAsync(String name, String author, String genre, Integer skip, Integer limit, final ApiCallback<List<SongItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchSongValidateBeforeCall(name, author, genre, skip, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SongItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
