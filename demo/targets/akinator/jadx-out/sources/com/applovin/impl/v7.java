package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class v7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private String f16117a;

    /* renamed from: b, reason: collision with root package name */
    private String f16118b;

    /* renamed from: c, reason: collision with root package name */
    private String f16119c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16120d;

    /* renamed from: e, reason: collision with root package name */
    private long f16121e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f16122f = -1;

    private v7() {
    }

    public static v7 a(m8 m8Var, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = m8Var.d();
            if (TextUtils.isEmpty(strD)) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            v7 v7Var = new v7();
            v7Var.f16119c = strD;
            v7Var.f16117a = (String) m8Var.a().get("id");
            v7Var.f16118b = (String) m8Var.a().get(NotificationCompat.CATEGORY_EVENT);
            v7Var.f16120d = ((Boolean) kVar.a(v4.Z4)).booleanValue();
            if (p7Var != null) {
                v7Var.f16120d = JsonUtils.getBoolean(p7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(v7Var.f16120d)).booleanValue();
            }
            v7Var.f16122f = a(v7Var.b(), p7Var);
            String str = (String) m8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    v7Var.f16122f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return v7Var;
                }
                if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                    int i10 = size - 1;
                    long j10 = 0;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        String str2 = listExplode.get(i11);
                        if (StringUtils.isNumeric(str2)) {
                            int i12 = Integer.parseInt(str2);
                            if (i11 == i10) {
                                seconds = i12;
                            } else if (i11 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i12);
                            } else if (i11 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i12);
                            }
                            j10 += seconds;
                        }
                    }
                    v7Var.f16121e = j10;
                    v7Var.f16122f = -1;
                }
            }
            return v7Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastTracker", "Error occurred while initializing", th2);
            }
            kVar.E().a("VastTracker", th2);
            return null;
        }
    }

    public String b() {
        return this.f16118b;
    }

    public String c() {
        return this.f16119c;
    }

    public boolean d() {
        return this.f16120d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        if (this.f16121e != v7Var.f16121e || this.f16122f != v7Var.f16122f) {
            return false;
        }
        String str = this.f16117a;
        if (str == null ? v7Var.f16117a != null : !str.equals(v7Var.f16117a)) {
            return false;
        }
        String str2 = this.f16118b;
        if (str2 == null ? v7Var.f16118b == null : str2.equals(v7Var.f16118b)) {
            return this.f16119c.equals(v7Var.f16119c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f16117a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16118b;
        int iE = p0.o2.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f16119c);
        long j10 = this.f16121e;
        return ((iE + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f16122f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastTracker{identifier='");
        sb2.append(this.f16117a);
        sb2.append("', event='");
        sb2.append(this.f16118b);
        sb2.append("', uriString='");
        sb2.append(this.f16119c);
        sb2.append("', offsetSeconds=");
        sb2.append(this.f16121e);
        sb2.append(KGUkpTlXZlJLy.dwNqt);
        return e3.g.m(sb2, this.f16122f, AbstractJsonLexerKt.END_OBJ);
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f16121e;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f16122f;
        return (z10 && z11) || ((i11 >= 0) && (i10 >= i11));
    }

    private static int a(String str, p7 p7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(str)) {
            return -1;
        }
        if (p7Var != null) {
            return p7Var.g();
        }
        return 95;
    }

    public static v7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        v7 v7Var = new v7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        v7Var.f16119c = string;
        v7Var.f16117a = JsonUtils.getString(jSONObject, "identifier", "");
        v7Var.f16118b = JsonUtils.getString(jSONObject, NotificationCompat.CATEGORY_EVENT, "");
        v7Var.f16121e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        v7Var.f16122f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return v7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f16117a);
        JsonUtils.putString(jSONObject, NotificationCompat.CATEGORY_EVENT, this.f16118b);
        JsonUtils.putString(jSONObject, "uri_string", this.f16119c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f16121e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f16122f);
        return jSONObject;
    }
}
