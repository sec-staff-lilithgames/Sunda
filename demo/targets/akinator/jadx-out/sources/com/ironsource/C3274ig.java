package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ig, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3274ig {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3456t4 f36953a;

    public C3274ig(InterfaceC3456t4 currentTimeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f36953a = currentTimeProvider;
    }

    public final boolean a(long j10, long j11) {
        long jA = this.f36953a.a();
        return j11 <= 0 || j10 <= 0 || jA < j10 || jA - j10 > j11;
    }
}
