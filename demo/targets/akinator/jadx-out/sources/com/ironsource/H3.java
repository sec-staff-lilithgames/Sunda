package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H3 implements InterfaceC3425r7 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f34565a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f34566b;

    /* renamed from: c, reason: collision with root package name */
    private final P3 f34567c;

    public H3(Boolean bool, Integer num, P3 p32) {
        this.f34565a = bool;
        this.f34566b = num;
        this.f34567c = p32;
    }

    private final Object a(P3 p32) {
        return new I3(this.f34565a, this.f34566b, p32).a();
    }

    @Override // com.ironsource.InterfaceC3425r7
    public Object b() {
        Integer num;
        P3 p32 = P3.Second;
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(a(p32));
        if (thM7134exceptionOrNullimpl != null) {
            return tu.z.m7131constructorimpl(tu.a0.createFailure(thM7134exceptionOrNullimpl));
        }
        return tu.z.m7131constructorimpl((!kotlin.jvm.internal.e0.areEqual(this.f34565a, Boolean.TRUE) || (num = this.f34566b) == null) ? null : new Yc(p32.a(num), null, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.ironsource.InterfaceC3425r7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c() {
        /*
            r3 = this;
            com.ironsource.P3 r0 = r3.f34567c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Throwable r0 = tu.z.m7134exceptionOrNullimpl(r0)
            if (r0 == 0) goto L15
            java.lang.Object r0 = tu.a0.createFailure(r0)
            java.lang.Object r0 = tu.z.m7131constructorimpl(r0)
            return r0
        L15:
            java.lang.Boolean r0 = r3.f34565a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r1)
            if (r0 == 0) goto L31
            java.lang.Integer r0 = r3.f34566b
            if (r0 == 0) goto L31
            int r0 = r0.intValue()
            com.ironsource.P3 r1 = r3.f34567c
            if (r1 == 0) goto L31
            com.ironsource.kf r2 = new com.ironsource.kf
            r2.<init>(r0, r1)
            goto L32
        L31:
            r2 = 0
        L32:
            java.lang.Object r0 = tu.z.m7131constructorimpl(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.H3.c():java.lang.Object");
    }

    public final Boolean d() {
        return this.f34565a;
    }

    public final Integer e() {
        return this.f34566b;
    }

    public final P3 f() {
        return this.f34567c;
    }

    @Override // com.ironsource.InterfaceC3425r7
    public Object a() {
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(new Q4(this.f34565a).a());
        if (thM7134exceptionOrNullimpl != null) {
            return tu.z.m7131constructorimpl(tu.a0.createFailure(thM7134exceptionOrNullimpl));
        }
        Boolean bool = this.f34565a;
        return tu.z.m7131constructorimpl(bool != null ? new P4(bool.booleanValue()) : null);
    }

    public /* synthetic */ H3(Boolean bool, Integer num, P3 p32, int i10, kotlin.jvm.internal.u uVar) {
        this(bool, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : p32);
    }
}
