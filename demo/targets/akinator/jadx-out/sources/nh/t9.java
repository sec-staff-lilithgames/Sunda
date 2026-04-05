package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t9 implements b9 {

    /* renamed from: a, reason: collision with root package name */
    public static final t9 f76661a = new t9();

    @Override // nh.b9
    public h9 keyStrength() {
        return h9.f76325c;
    }

    @Override // nh.b9
    public void setValue(w9 w9Var, v9 v9Var, Object obj) {
        v9Var.f76712b = obj;
    }

    @Override // nh.b9
    public h9 valueStrength() {
        return h9.f76324b;
    }

    @Override // nh.b9
    public v9 copy(w9 w9Var, v9 v9Var, v9 v9Var2) {
        Object key = v9Var.getKey();
        if (key == null) {
            return null;
        }
        v9 v9VarNewEntry = newEntry(w9Var, key, v9Var.f76711a, v9Var2);
        v9VarNewEntry.f76712b = v9Var.f76712b;
        return v9VarNewEntry;
    }

    @Override // nh.b9
    public v9 newEntry(w9 w9Var, Object obj, int i10, v9 v9Var) {
        return v9Var == null ? new v9(w9Var.f76738j, obj, i10) : new u9(w9Var.f76738j, obj, i10, v9Var);
    }

    @Override // nh.b9
    public w9 newSegment(fa faVar, int i10) {
        return new w9(faVar, i10);
    }
}
