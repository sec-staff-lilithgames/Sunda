package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3128ad implements M7 {

    /* renamed from: a, reason: collision with root package name */
    private final J3 f35965a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f35966b;

    public C3128ad(J3 storage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        this.f35965a = storage;
        this.f35966b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.M7
    public Long a(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        Long l9 = this.f35966b.get(identifier);
        if (l9 != null) {
            return l9;
        }
        Long lB = this.f35965a.b(identifier);
        if (lB == null) {
            return null;
        }
        long jLongValue = lB.longValue();
        this.f35966b.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.M7
    public void a(long j10, String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        this.f35966b.put(identifier, Long.valueOf(j10));
        this.f35965a.a(identifier, j10);
    }
}
