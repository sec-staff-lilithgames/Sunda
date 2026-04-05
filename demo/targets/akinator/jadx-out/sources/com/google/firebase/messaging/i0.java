package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final long f29816d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f29817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29818b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29819c;

    public i0(String str, String str2, long j10) {
        this.f29817a = str;
        this.f29818b = str2;
        this.f29819c = j10;
    }

    public static String a(long j10, String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put(C3191e4.i.W, str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static i0 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new i0(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new i0(jSONObject.getString("token"), jSONObject.getString(C3191e4.i.W), jSONObject.getLong("timestamp"));
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
            return null;
        }
    }
}
