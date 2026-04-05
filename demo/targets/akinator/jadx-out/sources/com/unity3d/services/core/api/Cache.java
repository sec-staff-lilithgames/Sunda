package com.unity3d.services.core.api;

import android.media.MediaMetadataRetriever;
import android.util.Base64;
import android.util.SparseArray;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.cache.CacheDirectoryType;
import com.unity3d.services.core.cache.CacheError;
import com.unity3d.services.core.cache.CacheThread;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequestError;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import io.ktor.http.ContentDisposition;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Cache {
    @WebViewExposed
    public static void deleteFile(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (new File(fileIdToFilename(str)).delete()) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(CacheError.FILE_IO_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void download(String str, String str2, JSONArray jSONArray, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (CacheThread.isActive()) {
            webViewCallback.error(CacheError.FILE_ALREADY_CACHING, new Object[0]);
            return;
        }
        if (!Device.isActiveNetworkConnected()) {
            webViewCallback.error(CacheError.NO_INTERNET, new Object[0]);
            return;
        }
        try {
            CacheThread.download(str, fileIdToFilename(str2), Request.getHeadersMap(jSONArray), bool.booleanValue(), SharedInstances.INSTANCE.getWebViewEventSender());
            webViewCallback.invoke(new Object[0]);
        } catch (Exception e10) {
            DeviceLog.exception("Error mapping headers for the request", e10);
            webViewCallback.error(WebRequestError.MAPPING_HEADERS_FAILED, str, str2);
        }
    }

    private static String fileIdToFilename(String str) {
        if (SdkProperties.getCacheDirectory() == null) {
            return "";
        }
        return SdkProperties.getCacheDirectory() + "/" + SdkProperties.getCacheFilePrefix() + str;
    }

    @WebViewExposed
    public static void getCacheDirectoryExists(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        File cacheDirectory = SdkProperties.getCacheDirectory();
        if (cacheDirectory == null) {
            webViewCallback.error(CacheError.CACHE_DIRECTORY_NULL, new Object[0]);
        } else {
            webViewCallback.invoke(Boolean.valueOf(cacheDirectory.exists()));
        }
    }

    @WebViewExposed
    public static void getCacheDirectoryType(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CacheDirectory cacheDirectoryObject = SdkProperties.getCacheDirectoryObject();
        if (cacheDirectoryObject == null || cacheDirectoryObject.getCacheDirectory(ClientProperties.getApplicationContext()) == null) {
            webViewCallback.error(CacheError.CACHE_DIRECTORY_NULL, new Object[0]);
            return;
        }
        if (!cacheDirectoryObject.getCacheDirectory(ClientProperties.getApplicationContext()).exists()) {
            webViewCallback.error(CacheError.CACHE_DIRECTORY_DOESNT_EXIST, new Object[0]);
            return;
        }
        CacheDirectoryType type = cacheDirectoryObject.getType();
        if (type == null) {
            webViewCallback.error(CacheError.CACHE_DIRECTORY_TYPE_NULL, new Object[0]);
        } else {
            webViewCallback.invoke(type.name());
        }
    }

    @WebViewExposed
    public static void getFileContent(String str, String str2, WebViewCallback webViewCallback) throws Throwable {
        String strEncodeToString;
        String strFileIdToFilename = fileIdToFilename(str);
        File file = new File(strFileIdToFilename);
        if (!file.exists()) {
            webViewCallback.error(CacheError.FILE_NOT_FOUND, str, strFileIdToFilename);
            return;
        }
        try {
            byte[] fileBytes = Utilities.readFileBytes(file);
            if (str2 == null) {
                webViewCallback.error(CacheError.UNSUPPORTED_ENCODING, str, strFileIdToFilename, str2);
                return;
            }
            if (str2.equals(C.UTF8_NAME)) {
                strEncodeToString = Charset.forName(C.UTF8_NAME).decode(ByteBuffer.wrap(fileBytes)).toString();
            } else {
                if (!str2.equals("Base64")) {
                    webViewCallback.error(CacheError.UNSUPPORTED_ENCODING, str, strFileIdToFilename, str2);
                    return;
                }
                strEncodeToString = Base64.encodeToString(fileBytes, 2);
            }
            webViewCallback.invoke(strEncodeToString);
        } catch (IOException e10) {
            webViewCallback.error(CacheError.FILE_IO_ERROR, str, strFileIdToFilename, e10.getMessage() + ", " + e10.getClass().getName());
        }
    }

    @WebViewExposed
    public static void getFileInfo(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            webViewCallback.invoke(getFileJson(str));
        } catch (JSONException e10) {
            DeviceLog.exception("Error creating JSON", e10);
            webViewCallback.error(CacheError.JSON_ERROR, new Object[0]);
        }
    }

    private static JSONObject getFileJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        File file = new File(fileIdToFilename(str));
        if (!file.exists()) {
            jSONObject.put("found", false);
            return jSONObject;
        }
        jSONObject.put("found", true);
        jSONObject.put(ContentDisposition.Parameters.Size, file.length());
        jSONObject.put("mtime", file.lastModified());
        return jSONObject;
    }

    @WebViewExposed
    public static void getFilePath(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (new File(fileIdToFilename(str)).exists()) {
            webViewCallback.invoke(fileIdToFilename(str));
        } else {
            webViewCallback.error(CacheError.FILE_NOT_FOUND, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFreeSpace(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Long.valueOf(Device.getFreeSpace(SdkProperties.getCacheDirectory())));
    }

    @WebViewExposed
    public static void getHash(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Utilities.Sha256(str));
    }

    @WebViewExposed
    public static void getMetaData(String str, JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            SparseArray<String> metaData = getMetaData(fileIdToFilename(str), jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < metaData.size(); i10++) {
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(metaData.keyAt(i10));
                jSONArray3.put(metaData.valueAt(i10));
                jSONArray2.put(jSONArray3);
            }
            webViewCallback.invoke(jSONArray2);
        } catch (IOException e10) {
            webViewCallback.error(CacheError.FILE_IO_ERROR, e10.getMessage());
        } catch (RuntimeException e11) {
            webViewCallback.error(CacheError.INVALID_ARGUMENT, e11.getMessage());
        } catch (JSONException e12) {
            webViewCallback.error(CacheError.JSON_ERROR, e12.getMessage());
        }
    }

    @WebViewExposed
    public static void getProgressInterval(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Integer.valueOf(CacheThread.getProgressInterval()));
    }

    @WebViewExposed
    public static void getTimeouts(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Integer.valueOf(CacheThread.getConnectTimeout()), Integer.valueOf(CacheThread.getReadTimeout()));
    }

    @WebViewExposed
    public static void getTotalSpace(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Long.valueOf(Device.getTotalSpace(SdkProperties.getCacheDirectory())));
    }

    @WebViewExposed
    public static void isCaching(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Boolean.valueOf(CacheThread.isActive()));
    }

    @WebViewExposed
    public static void recreateCacheDirectory(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (SdkProperties.getCacheDirectory().exists()) {
            webViewCallback.error(CacheError.CACHE_DIRECTORY_EXISTS, new Object[0]);
            return;
        }
        SdkProperties.setCacheDirectory(null);
        if (SdkProperties.getCacheDirectory() == null) {
            webViewCallback.error(CacheError.CACHE_DIRECTORY_NULL, new Object[0]);
        } else {
            webViewCallback.invoke(new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0062 A[EXC_TOP_SPLITTER, PHI: r7
      0x0062: PHI (r7v6 java.io.FileOutputStream) = (r7v5 java.io.FileOutputStream), (r7v7 java.io.FileOutputStream) binds: [B:30:0x0060, B:36:0x0074] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setFileContent(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.unity3d.services.core.webview.bridge.WebViewCallback r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "Error closing FileOutputStream"
            java.lang.String r2 = fileIdToFilename(r5)
            byte[] r3 = r7.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L83
            if (r6 == 0) goto L33
            int r4 = r6.length()
            if (r4 <= 0) goto L33
            java.lang.String r4 = "Base64"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L22
            r0 = 2
            byte[] r3 = android.util.Base64.decode(r7, r0)
            goto L33
        L22:
            boolean r7 = r6.equals(r0)
            if (r7 == 0) goto L29
            goto L33
        L29:
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.UNSUPPORTED_ENCODING
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r6}
            r8.error(r7, r5)
            return
        L33:
            r7 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57 java.io.FileNotFoundException -> L6b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57 java.io.FileNotFoundException -> L6b
            r0.write(r3)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r0.flush()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L53
            r0.close()     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r5 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r1, r5)
        L47:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8.invoke(r5)
            goto L77
        L4e:
            r5 = move-exception
            r7 = r0
            goto L78
        L51:
            r7 = r0
            goto L57
        L53:
            r7 = r0
            goto L6b
        L55:
            r5 = move-exception
            goto L78
        L57:
            com.unity3d.services.core.cache.CacheError r0 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r6}     // Catch: java.lang.Throwable -> L55
            r8.error(r0, r5)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L77
        L62:
            r7.close()     // Catch: java.lang.Exception -> L66
            goto L77
        L66:
            r5 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r1, r5)
            goto L77
        L6b:
            com.unity3d.services.core.cache.CacheError r0 = com.unity3d.services.core.cache.CacheError.FILE_NOT_FOUND     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r6}     // Catch: java.lang.Throwable -> L55
            r8.error(r0, r5)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L77
            goto L62
        L77:
            return
        L78:
            if (r7 == 0) goto L82
            r7.close()     // Catch: java.lang.Exception -> L7e
            goto L82
        L7e:
            r6 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r1, r6)
        L82:
            throw r5
        L83:
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.UNSUPPORTED_ENCODING
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r6}
            r8.error(r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.api.Cache.setFileContent(java.lang.String, java.lang.String, java.lang.String, com.unity3d.services.core.webview.bridge.WebViewCallback):void");
    }

    @WebViewExposed
    public static void setProgressInterval(Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CacheThread.setProgressInterval(num.intValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setTimeouts(Integer num, Integer num2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CacheThread.setConnectTimeout(num.intValue());
        CacheThread.setReadTimeout(num2.intValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void stop(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!CacheThread.isActive()) {
            webViewCallback.error(CacheError.NOT_CACHING, new Object[0]);
        } else {
            CacheThread.cancel();
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFiles(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        File cacheDirectory = SdkProperties.getCacheDirectory();
        if (cacheDirectory == null) {
            return;
        }
        DeviceLog.debug("Unity Ads cache: checking app directory for Unity Ads cached files");
        File[] fileArrListFiles = cacheDirectory.listFiles(new FilenameFilter() { // from class: com.unity3d.services.core.api.Cache.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith(SdkProperties.getCacheFilePrefix());
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            webViewCallback.invoke(new JSONArray());
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (File file : fileArrListFiles) {
                String strSubstring = file.getName().substring(SdkProperties.getCacheFilePrefix().length());
                DeviceLog.debug(rJqlArycrfkilN.lBWzZCrBxcpjD + strSubstring + ", " + file.length() + " bytes");
                jSONArray.put(getFileJson(strSubstring));
            }
            webViewCallback.invoke(jSONArray);
        } catch (JSONException e10) {
            DeviceLog.exception("Error creating JSON", e10);
            webViewCallback.error(CacheError.JSON_ERROR, new Object[0]);
        }
    }

    private static SparseArray<String> getMetaData(String str, JSONArray jSONArray) throws JSONException, IOException, RuntimeException {
        File file = new File(str);
        SparseArray<String> sparseArray = new SparseArray<>();
        if (file.exists()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                int i11 = jSONArray.getInt(i10);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i11);
                if (strExtractMetadata != null) {
                    sparseArray.put(i11, strExtractMetadata);
                }
            }
            return sparseArray;
        }
        throw new IOException("File: " + file.getAbsolutePath() + " doesn't exist");
    }
}
