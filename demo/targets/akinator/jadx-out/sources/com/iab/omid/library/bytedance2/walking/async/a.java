package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f30593c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f30594d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f30595e;

    public a(b.InterfaceC0180b interfaceC0180b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0180b);
        this.f30593c = new HashSet<>(hashSet);
        this.f30594d = jSONObject;
        this.f30595e = j10;
    }
}
