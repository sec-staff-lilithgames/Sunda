package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I3 implements InterfaceC3442s7 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f34649a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f34650b;

    /* renamed from: c, reason: collision with root package name */
    private final P3 f34651c;

    public I3(Boolean bool, Integer num, P3 p32) {
        this.f34649a = bool;
        this.f34650b = num;
        this.f34651c = p32;
    }

    @Override // com.ironsource.InterfaceC3442s7
    public Object a() {
        Boolean bool = this.f34649a;
        if (bool == null) {
            int i10 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(Boolean.FALSE);
        }
        Integer num = this.f34650b;
        if (num == null || num.intValue() <= 0) {
            int i12 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("limit flag is not provided or invalid")));
        }
        if (this.f34651c == null) {
            int i13 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("unit flag is not provided or invalid")));
        }
        int i14 = tu.z.f87419c;
        return tu.z.m7131constructorimpl(Boolean.TRUE);
    }
}
