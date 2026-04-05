package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f31380c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f31381d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f31382e;

    public a(b.InterfaceC0203b interfaceC0203b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0203b);
        this.f31380c = new HashSet<>(hashSet);
        this.f31381d = jSONObject;
        this.f31382e = j10;
    }
}
