package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.async.b;
import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0196b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f31144a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f31145b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f31145b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0196b
    public JSONObject a() {
        return this.f31144a;
    }

    public void b() {
        this.f31145b.b(new d(this));
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0196b
    public void a(JSONObject jSONObject) {
        this.f31144a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31145b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31145b.b(new e(this, hashSet, jSONObject, j10));
    }
}
