package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.lf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3327lf implements T8 {

    /* renamed from: a, reason: collision with root package name */
    private final J3 f37170a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f37171b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f37172c;

    public C3327lf(J3 storage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        this.f37170a = storage;
        this.f37171b = new ConcurrentHashMap<>();
        this.f37172c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.T8
    public void a(int i10, String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        this.f37171b.put(identifier, Integer.valueOf(i10));
        this.f37170a.a(identifier, i10);
    }

    @Override // com.ironsource.T8
    public Long b(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        Long l9 = this.f37172c.get(identifier);
        if (l9 != null) {
            return l9;
        }
        Long lA = this.f37170a.a(identifier);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.f37172c.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.ironsource.T8
    public int a(String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        Integer num = this.f37171b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.f37170a.c(identifier);
        if (numC != null) {
            int iIntValue = numC.intValue();
            this.f37171b.put(identifier, Integer.valueOf(iIntValue));
            return iIntValue;
        }
        this.f37171b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.T8
    public void a(long j10, String identifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(identifier, "identifier");
        this.f37172c.put(identifier, Long.valueOf(j10));
        this.f37170a.b(identifier, j10);
    }
}
