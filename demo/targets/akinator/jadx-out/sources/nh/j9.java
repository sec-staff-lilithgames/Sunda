package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j9 extends k9 {

    /* renamed from: d, reason: collision with root package name */
    public final k9 f76393d;

    public j9(Object obj, int i10, k9 k9Var) {
        super(obj, i10);
        this.f76393d = k9Var;
    }

    @Override // nh.u8, nh.a9
    public k9 getNext() {
        return this.f76393d;
    }
}
