package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ir {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f2759;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2760;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private c f2761;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private int f2762;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f2763;

        public c(int i10, String str) {
            this.f2762 = i10;
            this.f2763 = str;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final int m2842() {
            return this.f2762;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final String m2843() {
            return this.f2763;
        }
    }

    public ir(String str, int i10, String str2, long j10) {
        this.f2760 = str;
        this.f2759 = j10;
        this.f2761 = new c(i10, str2);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final long m2838() {
        return this.f2759;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m2839() throws JSONException {
        return !TextUtils.isEmpty(this.f2760) ? new JSONObject(this.f2760) : new JSONObject();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2840() {
        return this.f2760;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final c m2841() {
        return this.f2761;
    }
}
