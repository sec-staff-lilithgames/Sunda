package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14222a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14223b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f14228a;

        a(String str) {
            this.f14228a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14228a;
        }
    }

    public k(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f14223b = str;
        this.f14222a = kVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f14223b.substring(d().length()), 0), C.UTF8_NAME));
                this.f14222a.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return jSONObject;
                }
                this.f14222a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e10) {
                this.f14222a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14222a.O().a("AdToken", "Unable to decode token '" + this.f14223b + "' into JSON", e10);
                }
                this.f14222a.E().a("AdToken", "decodeFullAdResponseStr", e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f14222a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f14222a.O().a("AdToken", j1.o2.o(new StringBuilder("Unable to process ad response from token '"), this.f14223b, "'"), e11);
            }
            this.f14222a.E().a("AdToken", "decodeFullAdResponse", e11);
            return null;
        }
    }

    public String b() {
        return this.f14223b;
    }

    public a c() {
        return a(v4.f16064x0) != null ? a.REGULAR : a(v4.f16072y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(v4.f16064x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(v4.f16072y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.f14223b;
        String str2 = ((k) obj).f14223b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f14223b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbO = e3.g.o("AdToken{id=", StringUtils.prefixToIndex(32, this.f14223b), ", type=");
        sbO.append(c());
        sbO.append(AbstractJsonLexerKt.END_OBJ);
        return sbO.toString();
    }

    private String a(v4 v4Var) {
        for (String str : this.f14222a.c(v4Var)) {
            if (this.f14223b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
