package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final String f15272a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15273b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15274c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15275d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxSegmentCollection f15276e;

    /* renamed from: f, reason: collision with root package name */
    private final List f15277f;

    /* renamed from: g, reason: collision with root package name */
    private final List f15278g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15279h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f15280a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15281b;

        /* renamed from: c, reason: collision with root package name */
        private String f15282c;

        /* renamed from: d, reason: collision with root package name */
        private String f15283d;

        /* renamed from: e, reason: collision with root package name */
        private MaxSegmentCollection f15284e;

        /* renamed from: f, reason: collision with root package name */
        private List f15285f;

        /* renamed from: g, reason: collision with root package name */
        private List f15286g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f15287h;

        public BuilderImpl(String str, String str2) {
            List list = Collections.EMPTY_LIST;
            this.f15285f = list;
            this.f15286g = list;
            this.f15287h = true;
            this.f15280a = str;
            this.f15281b = str2;
            o.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f15286g;
        }

        public String getAxonEventKey() {
            return this.f15281b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getMediationProvider() {
            return this.f15282c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getPluginVersion() {
            return this.f15283d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f15280a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public MaxSegmentCollection getSegmentCollection() {
            return this.f15284e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f15285f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f15287h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            o.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        o.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f15286g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            o.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f15287h = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f15282c = str;
                return this;
            }
            o.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f15283d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f15280a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            o.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.f15284e = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            o.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || str.length() != 36) {
                    o.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f15285f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f15280a + ", axonEventKey=" + this.f15281b + ", mediationProvider=" + this.f15282c + ", pluginVersion=" + this.f15283d + ", testDeviceAdvertisingIdentifiers=" + this.f15285f + ", adUnitIdentifiers=" + this.f15286g + ", isExceptionHandlerEnabled=" + this.f15287h + ", segmentCollection=" + this.f15284e + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f15278g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getAxonEventKey() {
        return this.f15273b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getMediationProvider() {
        return this.f15274c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getPluginVersion() {
        return this.f15275d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getSdkKey() {
        return this.f15272a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public MaxSegmentCollection getSegmentCollection() {
        return this.f15276e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f15277f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f15279h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f15272a + ", axonEventKey=" + this.f15273b + ", mediationProvider=" + this.f15274c + ", pluginVersion=" + this.f15275d + ", testDeviceAdvertisingIds=" + this.f15277f + ", adUnitIdentifiers=" + this.f15278g + ", isExceptionHandlerEnabled=" + this.f15279h + ", segmentCollection=" + this.f15276e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f15272a = builderImpl.f15280a;
        this.f15273b = builderImpl.f15281b;
        this.f15274c = builderImpl.f15282c;
        this.f15275d = builderImpl.f15283d;
        this.f15276e = builderImpl.f15284e;
        this.f15277f = builderImpl.f15285f;
        this.f15278g = builderImpl.f15286g;
        this.f15279h = builderImpl.f15287h;
    }
}
