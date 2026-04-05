package com.iab.omid.library.appodeal.walking;

import com.iab.omid.library.appodeal.walking.async.b;
import com.iab.omid.library.appodeal.walking.async.d;
import com.iab.omid.library.appodeal.walking.async.e;
import com.iab.omid.library.appodeal.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0176b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f30473a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.walking.async.c f30474b;

    public b(com.iab.omid.library.appodeal.walking.async.c cVar) {
        this.f30474b = cVar;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0176b
    public JSONObject a() {
        return this.f30473a;
    }

    public void b() {
        this.f30474b.b(new d(this));
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0176b
    public void a(JSONObject jSONObject) {
        this.f30473a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30474b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30474b.b(new e(this, hashSet, jSONObject, j10));
    }
}
