package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0180b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f30602a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f30603b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f30603b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0180b
    public JSONObject a() {
        return this.f30602a;
    }

    public void b() {
        this.f30603b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0180b
    public void a(JSONObject jSONObject) {
        this.f30602a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30603b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f30603b.b(new e(this, hashSet, jSONObject, j10));
    }
}
