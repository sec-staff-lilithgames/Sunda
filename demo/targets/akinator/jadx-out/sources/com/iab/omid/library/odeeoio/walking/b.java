package com.iab.omid.library.odeeoio.walking;

import com.iab.omid.library.odeeoio.walking.a.b;
import com.iab.omid.library.odeeoio.walking.a.d;
import com.iab.omid.library.odeeoio.walking.a.e;
import com.iab.omid.library.odeeoio.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b implements b.InterfaceC0199b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f31261a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.odeeoio.walking.a.c f31262b;

    public b(com.iab.omid.library.odeeoio.walking.a.c cVar) {
        this.f31262b = cVar;
    }

    public void a() {
        this.f31262b.b(new d(this));
    }

    @Override // com.iab.omid.library.odeeoio.walking.a.b.InterfaceC0199b
    public JSONObject b() {
        return this.f31261a;
    }

    @Override // com.iab.omid.library.odeeoio.walking.a.b.InterfaceC0199b
    public void a(JSONObject jSONObject) {
        this.f31261a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31262b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31262b.b(new f(this, hashSet, jSONObject, j10));
    }
}
