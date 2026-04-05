package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z6 implements InterfaceC3122a7 {

    /* renamed from: a, reason: collision with root package name */
    private final long f35849a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3176d7 f35850b;

    public Z6(long j10, EnumC3176d7 recoveryStrategy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.f35849a = j10;
        this.f35850b = recoveryStrategy;
    }

    @Override // com.ironsource.InterfaceC3122a7
    public long a() {
        return this.f35849a;
    }

    @Override // com.ironsource.InterfaceC3122a7
    public EnumC3176d7 b() {
        return this.f35850b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z6(C3158c7 feature) {
        this(feature.a(), feature.c());
        kotlin.jvm.internal.e0.checkNotNullParameter(feature, "feature");
    }
}
