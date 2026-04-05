package com.iab.omid.library.unity3d.walking;

import com.iab.omid.library.unity3d.walking.async.b;
import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC0203b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f31389a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.walking.async.c f31390b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.f31390b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0203b
    public JSONObject a() {
        return this.f31389a;
    }

    public void b() {
        this.f31390b.b(new d(this));
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0203b
    public void a(JSONObject jSONObject) {
        this.f31389a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31390b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f31390b.b(new e(this, hashSet, jSONObject, j10));
    }
}
