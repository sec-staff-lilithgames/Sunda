package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.b;
import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0192b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f31009a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.async.c f31010b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.f31010b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0192b
    public JSONObject a() {
        return this.f31009a;
    }

    public void b() {
        this.f31010b.b(new d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0192b
    public void a(JSONObject jSONObject) {
        this.f31009a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31010b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31010b.b(new e(this, hashSet, jSONObject, j10));
    }
}
