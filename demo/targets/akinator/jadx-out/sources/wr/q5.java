package wr;

import wr.k5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q5 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k5.a f91105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5 f91106b;

    public q5(r5 r5Var, k5.a aVar) {
        this.f91106b = r5Var;
        this.f91105a = aVar;
    }

    @Override // wr.a5
    public final k5.a a() {
        return this.f91105a;
    }

    @Override // wr.k5.a
    public void onMessage(Object obj) {
        r5 r5Var = this.f91106b;
        this.f91105a.onMessage(r5Var.f91115a.parseRequest(r5Var.f91116b.streamRequest(obj)));
    }
}
