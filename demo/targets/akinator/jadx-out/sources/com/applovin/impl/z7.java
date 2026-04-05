package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3434s;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f16374a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f16375b;

    /* renamed from: c, reason: collision with root package name */
    private a f16376c;

    /* renamed from: d, reason: collision with root package name */
    private String f16377d;

    /* renamed from: e, reason: collision with root package name */
    private int f16378e;

    /* renamed from: f, reason: collision with root package name */
    private int f16379f;

    /* renamed from: g, reason: collision with root package name */
    private long f16380g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        Progressive,
        Streaming
    }

    private z7() {
    }

    public static z7 a(m8 m8Var, com.applovin.impl.sdk.k kVar) {
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = m8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            z7 z7Var = new z7();
            z7Var.f16374a = uri;
            z7Var.f16375b = uri;
            z7Var.f16380g = a(m8Var);
            z7Var.f16376c = a((String) m8Var.a().get(C3434s.f38306g));
            z7Var.f16379f = StringUtils.parseInt((String) m8Var.a().get("height"));
            z7Var.f16378e = StringUtils.parseInt((String) m8Var.a().get("width"));
            z7Var.f16377d = ((String) m8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return z7Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th2);
            }
            kVar.E().a("VastVideoFile", th2);
            return null;
        }
    }

    public long b() {
        return this.f16380g;
    }

    public String c() {
        return this.f16377d;
    }

    public Uri d() {
        return this.f16374a;
    }

    public Uri e() {
        return this.f16375b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        if (this.f16378e != z7Var.f16378e || this.f16379f != z7Var.f16379f || this.f16380g != z7Var.f16380g) {
            return false;
        }
        Uri uri = this.f16374a;
        if (uri == null ? z7Var.f16374a != null : !uri.equals(z7Var.f16374a)) {
            return false;
        }
        Uri uri2 = this.f16375b;
        if (uri2 == null ? z7Var.f16375b != null : !uri2.equals(z7Var.f16375b)) {
            return false;
        }
        if (this.f16376c != z7Var.f16376c) {
            return false;
        }
        String str = this.f16377d;
        String str2 = z7Var.f16377d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f16374a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f16375b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f16376c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f16377d;
        return Long.valueOf(this.f16380g).hashCode() + ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f16378e) * 31) + this.f16379f) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastVideoFile{sourceVideoUri=");
        sb2.append(this.f16374a);
        sb2.append(", videoUri=");
        sb2.append(this.f16375b);
        sb2.append(", deliveryType=");
        sb2.append(this.f16376c);
        sb2.append(", fileType='");
        sb2.append(this.f16377d);
        sb2.append("', width=");
        sb2.append(this.f16378e);
        sb2.append(", height=");
        sb2.append(this.f16379f);
        sb2.append(", bitrate=");
        return e3.g.n(sb2, this.f16380g, AbstractJsonLexerKt.END_OBJ);
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(m8 m8Var) {
        Map mapA = m8Var.a();
        long j10 = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        if (j10 != 0) {
            return j10;
        }
        return (StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("minBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f16375b = uri;
    }

    public static z7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        int i12 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        z7 z7Var = new z7();
        z7Var.f16374a = uri;
        z7Var.f16375b = uri2;
        z7Var.f16376c = aVarValueOf;
        z7Var.f16377d = string2;
        z7Var.f16378e = i10;
        z7Var.f16379f = i11;
        z7Var.f16380g = i12;
        return z7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f16374a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f16375b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f16376c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f16377d);
        JsonUtils.putInt(jSONObject, "width", this.f16378e);
        JsonUtils.putInt(jSONObject, "height", this.f16379f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f16380g);
        return jSONObject;
    }
}
