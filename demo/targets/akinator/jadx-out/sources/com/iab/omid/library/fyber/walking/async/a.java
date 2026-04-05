package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f30729c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f30730d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f30731e;

    public a(b.InterfaceC0184b interfaceC0184b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0184b);
        this.f30729c = new HashSet<>(hashSet);
        this.f30730d = jSONObject;
        this.f30731e = j10;
    }
}
