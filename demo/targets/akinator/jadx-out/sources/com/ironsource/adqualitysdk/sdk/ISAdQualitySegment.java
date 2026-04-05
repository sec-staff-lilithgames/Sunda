package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.ka;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import i2.hQ.aTNDubNmpwAqdU;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ISAdQualitySegment {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final long f221;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final Map<String, String> f222;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private double f223;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f224;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final int f225;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final AtomicBoolean f226;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final String f227;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final int f228;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f235;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f236;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private double f234 = 999999.99d;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private int f237 = -1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private int f233 = -1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private AtomicBoolean f232 = null;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private long f229 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private double f231 = -1.0d;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private Map<String, String> f230 = new HashMap();

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f236, this.f237, this.f235, this.f233, this.f232, this.f231, this.f229, new HashMap(this.f230), (byte) 0);
        }

        public Builder setAge(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 <= 199) {
                this.f237 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setAge( ");
            sb2.append(i10);
            sb2.append(" ) age must be between 1-199");
            k.m3152("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f230.size() >= 5) {
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                    k.m3152("ISAdQualitySegment Builder", sb2.toString());
                    return this;
                }
                if (ka.m3170(str) && ka.m3170(str2) && ka.m3165(str, 32) && ka.m3165(str2, 32)) {
                    this.f230.put("sgct_".concat(String.valueOf(str)), str2);
                    return this;
                }
                StringBuilder sb3 = new StringBuilder("setCustomData( ");
                sb3.append(str);
                sb3.append(" , ");
                sb3.append(str2);
                sb3.append(" ) key and value must be alphanumeric and 1-32 in length");
                k.m3152("ISAdQualitySegment Builder", sb3.toString());
                return this;
            } catch (Exception e10) {
                e10.printStackTrace();
                return this;
            }
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.a.f37799b) || str.toLowerCase(locale).equals(IronSourceConstants.a.f37800c)) {
                this.f235 = str.toLowerCase(locale);
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setGender( ");
            sb2.append(str);
            sb2.append(" ) is invalid");
            k.m3152("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setInAppPurchasesTotal(double d10) {
            if (d10 >= 0.0d && d10 < this.f234) {
                this.f231 = Math.floor(d10 * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setIAPTotal( ");
            sb2.append(d10);
            sb2.append(" ) iapt must be between 0-");
            sb2.append(this.f234);
            k.m3152("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setIsPaying(boolean z10) {
            if (this.f232 == null) {
                this.f232 = new AtomicBoolean();
            }
            this.f232.set(z10);
            return this;
        }

        public Builder setLevel(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 < 999999) {
                this.f233 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setLevel( ");
            sb2.append(i10);
            sb2.append(" ) level must be between 1-999999");
            k.m3152("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (ka.m3170(str) && ka.m3165(str, 32)) {
                this.f236 = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setSegmentName( ");
            sb2.append(str);
            sb2.append(" ) segment name must be alphanumeric and 1-32 in length");
            k.m3152("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setUserCreationDate(long j10) {
            if (j10 == 0) {
                return this;
            }
            if (j10 > 0) {
                this.f229 = j10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setUserCreationDate( ");
            sb2.append(j10);
            sb2.append(aTNDubNmpwAqdU.legN);
            k.m3152("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }
    }

    public /* synthetic */ ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map map, byte b10) {
        this(str, i10, str2, i11, atomicBoolean, d10, j10, map);
    }

    public int getAge() {
        return this.f228;
    }

    public Map<String, String> getCustomData() {
        return this.f222;
    }

    public String getGender() {
        return this.f227;
    }

    public double getInAppPurchasesTotal() {
        return this.f223;
    }

    public AtomicBoolean getIsPaying() {
        return this.f226;
    }

    public int getLevel() {
        return this.f225;
    }

    public String getName() {
        return this.f224;
    }

    public long getUserCreationDate() {
        return this.f221;
    }

    private ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map<String, String> map) {
        this.f224 = str;
        this.f228 = i10;
        this.f227 = str2;
        this.f225 = i11;
        this.f226 = atomicBoolean;
        this.f223 = d10;
        this.f221 = j10;
        this.f222 = map;
    }
}
