package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x9 implements b9 {

    /* renamed from: a, reason: collision with root package name */
    public static final x9 f76762a = new x9();

    @Override // nh.b9
    public h9 keyStrength() {
        return h9.f76325c;
    }

    @Override // nh.b9
    public void setValue(aa aaVar, z9 z9Var, Object obj) {
        ca caVar = z9Var.f76821b;
        z9Var.f76821b = new da(aaVar.f76095k, obj, z9Var);
        caVar.clear();
    }

    @Override // nh.b9
    public h9 valueStrength() {
        return h9.f76325c;
    }

    @Override // nh.b9
    public z9 copy(aa aaVar, z9 z9Var, z9 z9Var2) {
        Object key = z9Var.getKey();
        if (key == null) {
            return null;
        }
        int i10 = e9.f76213i;
        if (z9Var.getValue() == null) {
            return null;
        }
        z9 z9VarNewEntry = newEntry(aaVar, key, z9Var.f76711a, z9Var2);
        z9VarNewEntry.f76821b = z9Var.f76821b.copyFor(aaVar.f76095k, z9VarNewEntry);
        return z9VarNewEntry;
    }

    @Override // nh.b9
    public z9 newEntry(aa aaVar, Object obj, int i10, z9 z9Var) {
        return z9Var == null ? new z9(aaVar.f76094j, obj, i10) : new y9(aaVar.f76094j, obj, i10, z9Var);
    }

    @Override // nh.b9
    public aa newSegment(fa faVar, int i10) {
        return new aa(faVar, i10);
    }
}
