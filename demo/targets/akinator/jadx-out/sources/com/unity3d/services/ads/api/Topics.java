package com.unity3d.services.ads.api;

import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Topics {
    private static final TopicsService topicsService = (TopicsService) Utilities.getService(TopicsService.class);

    @WebViewExposed
    public static void checkAvailability(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(topicsService.checkAvailability());
    }

    @WebViewExposed
    public static void getTopics(String str, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        topicsService.getTopics(str, bool.booleanValue());
        webViewCallback.invoke(new Object[0]);
    }
}
