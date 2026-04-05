package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class AppLovinSdkInitializationConfiguration {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Builder {
        AppLovinSdkInitializationConfiguration build();

        List<String> getAdUnitIds();

        String getMediationProvider();

        String getPluginVersion();

        String getSdkKey();

        MaxSegmentCollection getSegmentCollection();

        List<String> getTestDeviceAdvertisingIds();

        boolean isExceptionHandlerEnabled();

        Builder setAdUnitIds(List<String> list);

        Builder setExceptionHandlerEnabled(boolean z10);

        Builder setMediationProvider(String str);

        Builder setPluginVersion(String str);

        Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection);

        Builder setTestDeviceAdvertisingIds(List<String> list);
    }

    public static Builder builder(String str) {
        return builder(str, "");
    }

    public abstract List<String> getAdUnitIds();

    public abstract String getAxonEventKey();

    public abstract String getMediationProvider();

    public abstract String getPluginVersion();

    public abstract String getSdkKey();

    public abstract MaxSegmentCollection getSegmentCollection();

    public abstract List<String> getTestDeviceAdvertisingIds();

    public abstract boolean isExceptionHandlerEnabled();

    public static Builder builder(String str, String str2) {
        return new AppLovinSdkInitializationConfigurationImpl.BuilderImpl(str, str2);
    }

    @Deprecated
    public static Builder builder(String str, Context context) {
        return builder(str, "");
    }
}
