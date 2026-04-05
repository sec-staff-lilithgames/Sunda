package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.ironsource.C3191e4;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class W5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f32437a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f32438b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f32439c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f32440d;

    /* renamed from: e, reason: collision with root package name */
    public static JSONObject f32441e;

    /* renamed from: f, reason: collision with root package name */
    public static JSONObject f32442f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f32438b) {
            try {
                Objects.toString(f32442f);
                Objects.toString(jSONObject);
                f32442f = jSONObject;
                f32440d = true;
                Context contextD = C2925od.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = I6.f31865b;
                    I6 i6A = H6.a(contextD, "unified_id_info_store");
                    JSONObject jSONObject2 = f32442f;
                    if (jSONObject2 == null) {
                        i6A.a("publisher_provided_unified_id");
                    } else {
                        I6.a(i6A, "publisher_provided_unified_id", String.valueOf(jSONObject2), false, 4, (Object) null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f32437a) {
            if (f32439c) {
                return f32441e;
            }
            f32439c = true;
            Context contextD = C2925od.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A = H6.a(contextD, "unified_id_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("ufids", C3191e4.h.W);
                String string = i6A.f31866a.getString("ufids", null);
                if (string != null) {
                    try {
                        f32441e = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    return f32441e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f32438b) {
            if (f32440d) {
                Objects.toString(f32442f);
                return f32442f;
            }
            f32440d = true;
            Context contextD = C2925od.d();
            String string = null;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A = H6.a(contextD, rJqlArycrfkilN.jXXtNUNGsxBejag);
                kotlin.jvm.internal.e0.checkNotNullParameter("publisher_provided_unified_id", C3191e4.h.W);
                string = i6A.f31866a.getString("publisher_provided_unified_id", null);
            }
            try {
                f32442f = new JSONObject(string);
            } catch (NullPointerException | JSONException unused) {
            }
            Objects.toString(f32442f);
            return f32442f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f32437a) {
            try {
                f32441e = jSONObject;
                f32439c = true;
                Context contextD = C2925od.d();
                if (contextD != null) {
                    ConcurrentHashMap concurrentHashMap = I6.f31865b;
                    I6 i6A = H6.a(contextD, "unified_id_info_store");
                    JSONObject jSONObject2 = f32441e;
                    if (jSONObject2 == null) {
                        i6A.a("ufids");
                    } else {
                        I6.a(i6A, "ufids", String.valueOf(jSONObject2), false, 4, (Object) null);
                    }
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(contextD).edit();
                    JSONObject jSONObject3 = f32441e;
                    if (jSONObject3 == null) {
                        editorEdit.remove("InMobi_unifiedId");
                    } else {
                        editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    editorEdit.apply();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
