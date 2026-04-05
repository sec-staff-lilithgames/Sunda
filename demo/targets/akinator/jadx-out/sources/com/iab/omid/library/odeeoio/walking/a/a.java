package com.iab.omid.library.odeeoio.walking.a;

import com.iab.omid.library.odeeoio.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f31252a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f31253b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f31254c;

    public a(b.InterfaceC0199b interfaceC0199b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0199b);
        this.f31252a = new HashSet<>(hashSet);
        this.f31253b = jSONObject;
        this.f31254c = j10;
    }
}
