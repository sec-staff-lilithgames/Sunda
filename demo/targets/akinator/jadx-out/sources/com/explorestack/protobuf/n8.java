package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n8 implements i9 {

    /* renamed from: a, reason: collision with root package name */
    public i9[] f22404a;

    @Override // com.explorestack.protobuf.i9
    public boolean isSupported(Class<?> cls) {
        for (i9 i9Var : this.f22404a) {
            if (i9Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.explorestack.protobuf.i9
    public h9 messageInfoFor(Class<?> cls) {
        for (i9 i9Var : this.f22404a) {
            if (i9Var.isSupported(cls)) {
                return i9Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
