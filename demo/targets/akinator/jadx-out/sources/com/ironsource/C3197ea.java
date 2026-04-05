package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.C3460t8;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3197ea {

    /* renamed from: b, reason: collision with root package name */
    private static final String f36602b = "ea";

    /* renamed from: c, reason: collision with root package name */
    private static final String f36603c = "supersonic_shared_preferen";

    /* renamed from: d, reason: collision with root package name */
    private static final String f36604d = "version";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36605e = "back_button_state";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36606f = "search_keys";

    /* renamed from: g, reason: collision with root package name */
    private static final String f36607g = "^\\d+_\\d+$";

    /* renamed from: h, reason: collision with root package name */
    private static C3197ea f36608h;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f36609a;

    private C3197ea(Context context) {
        this.f36609a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized C3197ea a(Context context) {
        try {
            if (f36608h == null) {
                f36608h = new C3197ea(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f36608h;
    }

    public static synchronized C3197ea e() {
        return f36608h;
    }

    public C3460t8.a b() throws NumberFormatException {
        int i10 = Integer.parseInt(this.f36609a.getString(f36605e, "2"));
        return i10 == 0 ? C3460t8.a.None : i10 == 1 ? C3460t8.a.Device : i10 == 2 ? C3460t8.a.Controller : C3460t8.a.Controller;
    }

    public void c(String str) {
        SharedPreferences.Editor editorEdit = this.f36609a.edit();
        editorEdit.putString(f36605e, str);
        editorEdit.apply();
    }

    public List<String> d() {
        String string = this.f36609a.getString(f36606f, null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C3237ge c3237ge = new C3237ge(string);
            if (c3237ge.a(C3191e4.h.R)) {
                try {
                    arrayList.addAll(c3237ge.a((JSONArray) c3237ge.b(C3191e4.h.R)));
                    return arrayList;
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        SharedPreferences.Editor editorEdit = this.f36609a.edit();
        editorEdit.putString(f36606f, str);
        editorEdit.apply();
    }

    public void a(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f36609a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public String c() {
        return this.f36609a.getString("version", Y1.f35726f);
    }

    public String a(String str) {
        String string = this.f36609a.getString(str, null);
        return string != null ? string : "{}";
    }

    private boolean b(String str) {
        return str.matches(f36607g);
    }

    public boolean a(String str, String str2, String str3) throws JSONException {
        String string = this.f36609a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor editorEdit = this.f36609a.edit();
            editorEdit.putString("ssaUserData", jSONObject.toString());
            editorEdit.apply();
            return true;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public void d(String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f36609a.edit();
        editorEdit.putString("version", str);
        editorEdit.apply();
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = (String[]) this.f36609a.getAll().keySet().toArray(new String[0]);
        SharedPreferences.Editor editorEdit = this.f36609a.edit();
        for (String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
        return arrayList;
    }
}
