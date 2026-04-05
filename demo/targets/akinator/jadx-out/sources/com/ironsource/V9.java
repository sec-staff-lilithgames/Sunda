package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class V9 {

    /* renamed from: a, reason: collision with root package name */
    U6 f35641a = new U6();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC3449se f35642b;

        public a(EnumC3449se enumC3449se) {
            this.f35642b = enumC3449se;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            V9.this.f35641a.a(Q6.f35261g0, new JSONArray().put(this.f35642b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.f35641a.a("md", (Object) jSONObject);
    }

    public void b(JSONObject jSONObject) {
        this.f35641a.a(Q6.f35256e1, (Object) jSONObject);
    }

    public void c(String str) {
        this.f35641a.a(Q6.J0, str);
    }

    public void d(String str) {
        this.f35641a.a(Q6.L0, str);
    }

    public void e(String str) {
        this.f35641a.a(com.ironsource.mediationsdk.metadata.a.f37603i, str);
    }

    public void f(String str) {
        this.f35641a.a(Q6.Z0, str);
    }

    public void g(String str) {
        this.f35641a.a(Q6.A, str);
    }

    public void h(String str) {
        this.f35641a.a(Q6.f35250c1, str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35641a.a(Q6.f35255e0, str);
    }

    public void a(boolean z10) {
        this.f35641a.a(Q6.Q0, Boolean.valueOf(z10));
    }

    public void b(boolean z10) {
        this.f35641a.a("gpi", Boolean.valueOf(z10));
    }

    public void c(int i10) {
        this.f35641a.a(Q6.f35258f0, Integer.valueOf(i10));
    }

    public void a(Context context) {
        this.f35641a.a(context);
    }

    public void b(int i10) {
        if (i10 >= 0) {
            this.f35641a.a(Q6.S0, Integer.valueOf(i10));
        }
    }

    public void a(Boolean bool) {
        this.f35641a.a(Q6.T0, bool);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35641a.a(Q6.C1, str);
    }

    public void a(EnumC3449se enumC3449se) {
        new Thread(new a(enumC3449se)).start();
    }

    public void b(Context context) {
        B7 b7I = Mb.U().i();
        ActivityManager.MemoryInfo memoryInfoN = b7I.n(context);
        this.f35641a.a(Q6.f35308w, b7I.c(memoryInfoN));
        this.f35641a.a(Q6.f35311x, b7I.b(memoryInfoN));
    }

    public void a(U7 u72) {
        try {
            HashMap map = new HashMap();
            map.put(Q6.E, u72.a());
            map.put(Q6.D, u72.b());
            map.put(Q6.V, u72.c());
            this.f35641a.a(map);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f35641a.a("abt", str);
    }

    public void a(int i10) {
        this.f35641a.a(Q6.f35267i0, Integer.valueOf(i10));
    }
}
