package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q4 implements InterfaceC3442s7 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f35240a;

    public Q4(Boolean bool) {
        this.f35240a = bool;
    }

    @Override // com.ironsource.InterfaceC3442s7
    public Object a() {
        Boolean bool = this.f35240a;
        if (bool != null) {
            return tu.z.m7131constructorimpl(bool);
        }
        int i10 = tu.z.f87419c;
        return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("enabled flag is not provided or invalid")));
    }
}
