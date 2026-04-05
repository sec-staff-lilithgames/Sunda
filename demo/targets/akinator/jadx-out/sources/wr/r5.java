package wr;

import wr.k5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r5 implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k4 f91115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k4 f91116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5 f91117c;

    public r5(k4 k4Var, k4 k4Var2, m5 m5Var) {
        this.f91115a = k4Var;
        this.f91116b = k4Var2;
        this.f91117c = m5Var;
    }

    @Override // wr.m5
    public k5.a startCall(k5 k5Var, e4 e4Var) {
        return new q5(this, this.f91117c.startCall(new p5(this, k5Var), e4Var));
    }
}
