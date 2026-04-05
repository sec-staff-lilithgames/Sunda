package com.iab.omid.library.fyber.walking;

import com.iab.omid.library.fyber.walking.async.b;
import com.iab.omid.library.fyber.walking.async.d;
import com.iab.omid.library.fyber.walking.async.e;
import com.iab.omid.library.fyber.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0184b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f30738a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.walking.async.c f30739b;

    public b(com.iab.omid.library.fyber.walking.async.c cVar) {
        this.f30739b = cVar;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0184b
    public JSONObject a() {
        return this.f30738a;
    }

    public void b() {
        this.f30739b.b(new d(this));
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0184b
    public void a(JSONObject jSONObject) {
        this.f30738a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30739b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30739b.b(new e(this, hashSet, jSONObject, j10));
    }
}
