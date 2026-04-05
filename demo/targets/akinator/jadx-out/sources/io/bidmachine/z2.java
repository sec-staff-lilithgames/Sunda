package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z2 implements InitializationParams {

    /* renamed from: a, reason: collision with root package name */
    public final c4 f62073a;

    /* renamed from: b, reason: collision with root package name */
    public final up.d f62074b;

    public z2(TargetingParams targetingParams, f4 f4Var) {
        this.f62073a = new c4(f4Var, targetingParams);
        this.f62074b = f4Var;
    }

    @Override // io.bidmachine.GeneralParams
    public up.d getDataRestrictions() {
        return this.f62074b;
    }

    @Override // io.bidmachine.GeneralParams
    public up.p getTargetingInfo() {
        return this.f62073a;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return n1.a().f61937t;
    }
}
