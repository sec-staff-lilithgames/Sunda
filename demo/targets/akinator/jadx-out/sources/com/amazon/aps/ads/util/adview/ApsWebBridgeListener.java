package com.amazon.aps.ads.util.adview;

import android.webkit.ValueCallback;
import com.amazon.device.ads.DTBAdMRAIDController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface ApsWebBridgeListener {
    void evaluateApsJavascript(String str, ValueCallback<String> valueCallback);

    DTBAdMRAIDController getApsMraidHandler();
}
