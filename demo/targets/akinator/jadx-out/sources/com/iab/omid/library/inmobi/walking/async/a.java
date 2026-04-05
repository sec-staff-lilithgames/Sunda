package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f30865c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f30866d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f30867e;

    public a(b.InterfaceC0188b interfaceC0188b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0188b);
        this.f30865c = new HashSet<>(hashSet);
        this.f30866d = jSONObject;
        this.f30867e = j10;
    }
}
