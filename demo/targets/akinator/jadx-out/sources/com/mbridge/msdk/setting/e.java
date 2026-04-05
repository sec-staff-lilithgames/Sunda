package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f42696a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f42697b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final e f42698a = new e();
    }

    public static e a() {
        return b.f42698a;
    }

    public void b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f42697b == null) {
                this.f42697b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f42697b.put(next, fVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private e() {
        this.f42696a = 6;
        this.f42697b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        if (TextUtils.isEmpty(str) || (map = this.f42697b) == null || !map.containsKey(str) || (fVar = this.f42697b.get(str)) == null) {
            return 0;
        }
        int i10 = fVar.b() ? 1 : fVar.a() >= this.f42696a ? 2 : 0;
        fVar.a(false);
        return i10;
    }
}
