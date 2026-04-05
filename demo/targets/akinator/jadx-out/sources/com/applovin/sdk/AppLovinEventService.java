package com.applovin.sdk;

import android.content.Intent;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface AppLovinEventService {
    void trackCheckout(String str, Map<String, String> map);

    void trackEvent(String str);

    void trackEvent(String str, Map<String, ?> map);

    void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2);

    void trackInAppPurchase(Intent intent, Map<String, String> map);
}
