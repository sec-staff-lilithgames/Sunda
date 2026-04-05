package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f30464c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f30465d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f30466e;

    public a(b.InterfaceC0176b interfaceC0176b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0176b);
        this.f30464c = new HashSet<>(hashSet);
        this.f30465d = jSONObject;
        this.f30466e = j10;
    }
}
