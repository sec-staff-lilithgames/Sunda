package com.unity3d.services.ads.api;

import com.unity3d.services.ads.token.TokenError;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Token {
    private static final TokenStorage tokenStorage = (TokenStorage) Utilities.getService(TokenStorage.class);

    @WebViewExposed
    public static void appendTokens(JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            tokenStorage.appendTokens(jSONArray);
            webViewCallback.invoke(new Object[0]);
        } catch (JSONException e10) {
            webViewCallback.error(TokenError.JSON_EXCEPTION, e10.getMessage());
        }
    }

    @WebViewExposed
    public static void createTokens(JSONArray jSONArray, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            tokenStorage.createTokens(jSONArray);
            webViewCallback.invoke(new Object[0]);
        } catch (JSONException e10) {
            webViewCallback.error(TokenError.JSON_EXCEPTION, e10.getMessage());
        }
    }

    @WebViewExposed
    public static void deleteTokens(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        tokenStorage.deleteTokens();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getNativeGeneratedToken(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        tokenStorage.getNativeGeneratedToken();
        webViewCallback.invoke(new Object[0]);
    }
}
