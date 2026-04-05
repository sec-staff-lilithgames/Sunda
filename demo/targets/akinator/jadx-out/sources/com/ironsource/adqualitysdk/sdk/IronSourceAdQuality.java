package com.ironsource.adqualitysdk.sdk;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.i.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class IronSourceAdQuality {
    public static final String TAG = "ISAdQuality Agent SDK";
    public static final String VERSION = "9.0.2";

    public static IronSourceAdQuality getInstance() {
        return q.m3297();
    }

    public static String getSDKVersion() {
        return "9.0.2";
    }

    public abstract void changeUserId(String str);

    public abstract void initialize(Context context, String str);

    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z10);

    public abstract void shutdown();
}
