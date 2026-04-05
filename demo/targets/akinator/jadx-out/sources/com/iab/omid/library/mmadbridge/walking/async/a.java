package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f31135c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f31136d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f31137e;

    public a(b.InterfaceC0196b interfaceC0196b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0196b);
        this.f31135c = new HashSet<>(hashSet);
        this.f31136d = jSONObject;
        this.f31137e = j10;
    }
}
