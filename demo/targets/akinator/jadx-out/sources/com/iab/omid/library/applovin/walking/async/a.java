package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f30328c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f30329d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f30330e;

    public a(b.InterfaceC0172b interfaceC0172b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0172b);
        this.f30328c = new HashSet<>(hashSet);
        this.f30329d = jSONObject;
        this.f30330e = j10;
    }
}
