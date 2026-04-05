package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w1 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public final b2[] f26519a;

    public w1(b2... b2VarArr) {
        this.f26519a = b2VarArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(Class cls) {
        for (b2 b2Var : this.f26519a) {
            if (b2Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final r2 b(Class cls) {
        for (b2 b2Var : this.f26519a) {
            if (b2Var.a(cls)) {
                return b2Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
