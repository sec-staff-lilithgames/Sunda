package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f31515c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f31516d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f31517e;

    public a(b.InterfaceC0207b interfaceC0207b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0207b);
        this.f31515c = new HashSet<>(hashSet);
        this.f31516d = jSONObject;
        this.f31517e = j10;
    }
}
