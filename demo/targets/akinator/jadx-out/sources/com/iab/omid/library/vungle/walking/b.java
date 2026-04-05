package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.async.b;
import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0207b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f31524a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.async.c f31525b;

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.f31525b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0207b
    public JSONObject a() {
        return this.f31524a;
    }

    public void b() {
        this.f31525b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0207b
    public void a(JSONObject jSONObject) {
        this.f31524a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31525b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31525b.b(new e(this, hashSet, jSONObject, j10));
    }
}
