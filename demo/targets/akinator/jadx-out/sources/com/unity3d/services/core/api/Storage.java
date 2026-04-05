package com.unity3d.services.core.api;

import com.unity3d.services.core.device.StorageError;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Storage {
    @WebViewExposed
    public static void clear(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else if (storage.clearStorage()) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(StorageError.COULDNT_CLEAR_STORAGE, str);
        }
    }

    @WebViewExposed
    public static void delete(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else if (storage.delete(str2)) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(StorageError.COULDNT_DELETE_VALUE, str);
        }
    }

    @WebViewExposed
    public static void get(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        Object obj = storage.get(str2);
        if (obj == null) {
            webViewCallback.error(StorageError.COULDNT_GET_VALUE, str2);
        } else {
            webViewCallback.invoke(obj);
        }
    }

    @WebViewExposed
    public static void getKeys(String str, String str2, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        List<String> keys = storage.getKeys(str2, bool.booleanValue());
        if (keys != null) {
            webViewCallback.invoke(new JSONArray((Collection) keys));
        } else {
            webViewCallback.invoke(new JSONArray());
        }
    }

    private static com.unity3d.services.core.device.Storage getStorage(String str) {
        return StorageManager.getStorage(StorageManager.StorageType.valueOf(str));
    }

    @WebViewExposed
    public static void read(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else {
            storage.readStorage();
            webViewCallback.invoke(str);
        }
    }

    @WebViewExposed
    public static void set(String str, String str2, Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) num, webViewCallback);
    }

    @WebViewExposed
    public static void write(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage == null) {
            webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str);
        } else if (storage.writeStorage()) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(StorageError.COULDNT_WRITE_STORAGE_TO_CACHE, str);
        }
    }

    @WebViewExposed
    public static void set(String str, String str2, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) bool, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, Long l9, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) l9, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, Double d10, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) d10, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, String str3, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) str3, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONObject jSONObject, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) jSONObject, webViewCallback);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(str, str2, (Object) jSONArray, webViewCallback);
    }

    public static void set(String str, String str2, Object obj, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        com.unity3d.services.core.device.Storage storage = getStorage(str);
        if (storage != null) {
            if (storage.set(str2, obj)) {
                webViewCallback.invoke(str2);
                return;
            } else {
                webViewCallback.error(StorageError.COULDNT_SET_VALUE, str2);
                return;
            }
        }
        webViewCallback.error(StorageError.COULDNT_GET_STORAGE, str, str2);
    }
}
