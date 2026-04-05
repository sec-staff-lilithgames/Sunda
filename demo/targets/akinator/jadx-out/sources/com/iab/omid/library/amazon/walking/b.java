package com.iab.omid.library.amazon.walking;

import com.iab.omid.library.amazon.walking.async.b;
import com.iab.omid.library.amazon.walking.async.d;
import com.iab.omid.library.amazon.walking.async.e;
import com.iab.omid.library.amazon.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0168b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f30202a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.amazon.walking.async.c f30203b;

    public b(com.iab.omid.library.amazon.walking.async.c cVar) {
        this.f30203b = cVar;
    }

    @Override // com.iab.omid.library.amazon.walking.async.b.InterfaceC0168b
    public JSONObject a() {
        return this.f30202a;
    }

    public void b() {
        this.f30203b.b(new d(this));
    }

    @Override // com.iab.omid.library.amazon.walking.async.b.InterfaceC0168b
    public void a(JSONObject jSONObject) {
        this.f30202a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30203b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30203b.b(new e(this, hashSet, jSONObject, j10));
    }
}
