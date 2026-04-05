package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f31000c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f31001d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f31002e;

    public a(b.InterfaceC0192b interfaceC0192b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0192b);
        this.f31000c = new HashSet<>(hashSet);
        this.f31001d = jSONObject;
        this.f31002e = j10;
    }
}
