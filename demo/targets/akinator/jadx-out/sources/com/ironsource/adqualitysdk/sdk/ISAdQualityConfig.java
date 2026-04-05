package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.am;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.ka;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ISAdQualityConfig {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private final Map<String, String> f183;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final String f184;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final boolean f185;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final ISAdQualityLogLevel f186;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final ISAdQualityDeviceIdType f187;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final boolean f188;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final boolean f189;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final String f190;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f191;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f192;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f193;

    public /* synthetic */ ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b10) {
        this(str, z10, z11, z12, iSAdQualityLogLevel, set, str2, z13, z14, iSAdQualityDeviceIdType, map);
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f193) {
            builder.setUserId(iSAdQualityConfig.f190);
        } else if (iSAdQualityConfig2.f193) {
            builder.setUserId(iSAdQualityConfig2.f190);
        }
        if (iSAdQualityConfig.f189) {
            builder.setTestMode(iSAdQualityConfig.f192);
        } else if (iSAdQualityConfig2.f189) {
            builder.setTestMode(iSAdQualityConfig2.f192);
        }
        if (iSAdQualityConfig.f185) {
            builder.setCoppa(iSAdQualityConfig.f188);
        } else if (iSAdQualityConfig2.f185) {
            builder.setCoppa(iSAdQualityConfig2.f188);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f186;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f186;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f191.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f191.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f184;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f184;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f187;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f187;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f183);
        map.putAll(iSAdQualityConfig.f183);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f191;
    }

    public boolean getCoppa() {
        return this.f188;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f187;
    }

    public String getInitializationSource() {
        return this.f184;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f186;
    }

    public Map<String, String> getMetaData() {
        return this.f183;
    }

    public String getUserId() {
        return this.f190;
    }

    public boolean isTestMode() {
        return this.f192;
    }

    public boolean isUserIdSet() {
        return this.f193;
    }

    private ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f190 = str;
        this.f193 = z10;
        this.f192 = z11;
        this.f189 = z12;
        this.f186 = iSAdQualityLogLevel;
        this.f191 = set;
        this.f184 = str2;
        this.f188 = z13;
        this.f185 = z14;
        this.f187 = iSAdQualityDeviceIdType;
        this.f183 = map;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f203 = null;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f200 = false;

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean f202 = false;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f204 = false;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ISAdQualityLogLevel f201 = ISAdQualityLogLevel.INFO;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f198 = new HashSet();

        /* renamed from: ﱡ, reason: contains not printable characters */
        private String f197 = null;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private boolean f196 = false;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private boolean f199 = false;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f195 = ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private final Map<String, String> f194 = new HashMap();

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f198.add(iSAdQualityInitListener);
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f203, this.f200, this.f202, this.f204, this.f201, this.f198, this.f197, this.f196, this.f199, this.f195, this.f194, (byte) 0);
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f198.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder setCoppa(boolean z10) {
            this.f196 = z10;
            this.f199 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f195 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (ka.m3165(str, 20)) {
                this.f197 = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setInitializationSource( ");
            sb2.append(str);
            sb2.append(" ) init source must have length of 1-20");
            k.m3152("ISAdQualityConfig", sb2.toString());
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f201 = iSAdQualityLogLevel;
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) throws JSONException {
            if (jSONObject != null) {
                for (int i10 = 0; i10 < jSONObject.names().length(); i10++) {
                    try {
                        String string = jSONObject.names().getString(i10);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(string);
                            sb2.append(" , ");
                            sb2.append(objOpt);
                            sb2.append(" ) value must be a string");
                            k.m3152("ISAdQualityConfig", sb2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setTestMode(boolean z10) {
            this.f202 = z10;
            this.f204 = true;
            return this;
        }

        public Builder setUserId(String str) {
            this.f203 = str;
            this.f200 = true;
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!am.m798(str)) {
                        if (am.m801(this.f194, str)) {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(str);
                            sb2.append(" , ");
                            sb2.append(str2);
                            sb2.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                            k.m3152("ISAdQualityConfig", sb2.toString());
                            return this;
                        }
                        if (!am.m799(str, str2)) {
                            StringBuilder sb3 = new StringBuilder("setMetaData( ");
                            sb3.append(str);
                            sb3.append(" , ");
                            sb3.append(str2);
                            sb3.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                            k.m3152("ISAdQualityConfig", sb3.toString());
                            return this;
                        }
                    }
                    this.f194.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }
    }
}
