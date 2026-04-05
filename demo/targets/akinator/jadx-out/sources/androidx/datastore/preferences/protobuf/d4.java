package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d4 extends b4 {
    @Override // androidx.datastore.preferences.protobuf.b4
    public final c4 a(Object obj) {
        f1 f1Var = (f1) obj;
        c4 c4Var = f1Var.unknownFields;
        if (c4Var != c4.getDefaultInstance()) {
            return c4Var;
        }
        c4 c4VarB = c4.b();
        f1Var.unknownFields = c4VarB;
        return c4VarB;
    }

    @Override // androidx.datastore.preferences.protobuf.b4
    public final void c(Object obj, Object obj2) {
        ((f1) obj).unknownFields = (c4) obj2;
    }
}
