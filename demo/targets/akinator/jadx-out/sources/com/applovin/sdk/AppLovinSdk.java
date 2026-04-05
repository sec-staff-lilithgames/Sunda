package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t3;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final k coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private AppLovinSdk(k kVar) {
        this.coreSdk = kVar;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (instanceLock) {
            try {
                if (instance == null) {
                    k kVar = new k(new AppLovinSdkSettings(context), context);
                    AppLovinSdk appLovinSdk2 = new AppLovinSdk(kVar);
                    kVar.a(appLovinSdk2);
                    instance = appLovinSdk2;
                }
                appLovinSdk = instance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return appLovinSdk;
    }

    private static String getVersion() {
        return "13.4.0";
    }

    private static int getVersionCode() {
        return 13040099;
    }

    public k a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.k();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayB = t3.b(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayB.length());
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayB, i10, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.t();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.w();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.G();
    }

    public String getSdkKey() {
        return this.coreSdk.j0();
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.k0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.o0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    public boolean isInitialized() {
        return this.coreSdk.C0();
    }

    public void processDeepLink(Uri uri) {
        this.coreSdk.a(uri);
    }

    public void reinitialize(Boolean bool, Boolean bool2) {
        if (this.coreSdk.E0()) {
            this.coreSdk.T0();
        }
        this.coreSdk.S0();
        if (bool != null) {
            this.coreSdk.O();
            if (o.a()) {
                this.coreSdk.O().d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.O();
            if (o.a()) {
                this.coreSdk.O().d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent("dns", CollectionUtils.map("value", bool2.toString()));
        }
    }

    public void showCreativeDebugger() {
        this.coreSdk.X0();
    }

    public void showMediationDebugger() {
        this.coreSdk.Y0();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.D0() + AbstractJsonLexerKt.END_OBJ;
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }
}
