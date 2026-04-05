package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public p2[] f5885a;

    @Override // androidx.datastore.preferences.protobuf.p2
    public boolean isSupported(Class<?> cls) {
        for (p2 p2Var : this.f5885a) {
            if (p2Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.p2
    public o2 messageInfoFor(Class<?> cls) {
        for (p2 p2Var : this.f5885a) {
            if (p2Var.isSupported(cls)) {
                return p2Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
