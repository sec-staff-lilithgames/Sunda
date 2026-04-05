package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f50449a;

    /* renamed from: b, reason: collision with root package name */
    private final int f50450b;

    /* renamed from: c, reason: collision with root package name */
    private final int f50451c;

    /* renamed from: d, reason: collision with root package name */
    private String f50452d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f50453e;

    /* renamed from: f, reason: collision with root package name */
    private PglSSCallBack f50454f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f50455a;

        /* renamed from: b, reason: collision with root package name */
        private int f50456b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f50457c = 0;

        /* renamed from: d, reason: collision with root package name */
        private String f50458d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f50455a)) {
                return null;
            }
            return new PglSSConfig(this.f50455a, this.f50456b, this.f50457c, this.f50458d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f50458d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f50455a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f50457c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f50456b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f50452d;
    }

    public String getAppId() {
        return this.f50449a;
    }

    public PglSSCallBack getCallBack() {
        return this.f50454f;
    }

    public int getCollectMode() {
        return this.f50451c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f50453e;
    }

    public int getOVRegionType() {
        return this.f50450b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f50454f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f50453e = map;
    }

    private PglSSConfig(String str, int i10, int i11, String str2) {
        this.f50449a = str;
        this.f50450b = i10;
        this.f50451c = i11;
        this.f50452d = str2;
    }
}
