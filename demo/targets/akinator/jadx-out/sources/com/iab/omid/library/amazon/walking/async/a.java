package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f30193c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f30194d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f30195e;

    public a(b.InterfaceC0168b interfaceC0168b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0168b);
        this.f30193c = new HashSet<>(hashSet);
        this.f30194d = jSONObject;
        this.f30195e = j10;
    }
}
