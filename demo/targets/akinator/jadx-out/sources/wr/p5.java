package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p5 extends z4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k5 f91092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5 f91093b;

    public p5(r5 r5Var, k5 k5Var) {
        this.f91093b = r5Var;
        this.f91092a = k5Var;
    }

    @Override // wr.z4
    public final k5 a() {
        return this.f91092a;
    }

    @Override // wr.k5
    public k4 getMethodDescriptor() {
        return this.f91093b.f91115a;
    }

    @Override // wr.k5
    public void sendMessage(Object obj) {
        r5 r5Var = this.f91093b;
        this.f91092a.sendMessage(r5Var.f91116b.parseResponse(r5Var.f91115a.streamResponse(obj)));
    }
}
