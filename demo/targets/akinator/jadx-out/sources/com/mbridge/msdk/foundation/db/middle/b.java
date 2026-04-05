package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f40483a;

    /* renamed from: b, reason: collision with root package name */
    private k f40484b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a f40486b;

        public a(boolean z10, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f40485a = z10;
            this.f40486b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f40485a || b.this.f40484b == null) {
                return;
            }
            for (String str : this.f40486b.a()) {
                b.this.f40484b.a(str, b.this.f40483a.a(str));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    public static class C0267b {

        /* renamed from: a, reason: collision with root package name */
        private static b f40488a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f40483a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.m().d()));
            this.f40484b = kVarA;
            a(kVarA.a(), false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f40483a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z10, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f40483a.a());
    }

    public static b a() {
        return C0267b.f40488a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f40483a.a(str);
        if (jSONObjectA != null || (kVar = this.f40484b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f40483a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
