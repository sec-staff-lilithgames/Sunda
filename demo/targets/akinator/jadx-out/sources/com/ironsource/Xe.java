package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Xe {

    /* renamed from: a, reason: collision with root package name */
    private final N f35709a;

    public Xe(N n9) {
        this.f35709a = n9;
    }

    public final N a() {
        return this.f35709a;
    }

    public abstract EnumC3202ef b();

    public final C3468u a(Lb<Xe, C3468u> mapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
