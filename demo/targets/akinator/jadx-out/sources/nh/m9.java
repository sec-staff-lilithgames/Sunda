package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m9 implements b9 {

    /* renamed from: a, reason: collision with root package name */
    public static final m9 f76475a = new m9();

    @Override // nh.b9
    public h9 keyStrength() {
        return h9.f76324b;
    }

    @Override // nh.b9
    public void setValue(p9 p9Var, o9 o9Var, Object obj) {
        ca caVar = o9Var.f76529c;
        o9Var.f76529c = new da(p9Var.f76556j, obj, o9Var);
        caVar.clear();
    }

    @Override // nh.b9
    public h9 valueStrength() {
        return h9.f76325c;
    }

    @Override // nh.b9
    public o9 copy(p9 p9Var, o9 o9Var, o9 o9Var2) {
        int i10 = e9.f76213i;
        if (o9Var.getValue() == null) {
            return null;
        }
        o9 o9VarNewEntry = newEntry(p9Var, o9Var.f76689a, o9Var.f76690b, o9Var2);
        o9VarNewEntry.f76529c = o9Var.f76529c.copyFor(p9Var.f76556j, o9VarNewEntry);
        return o9VarNewEntry;
    }

    @Override // nh.b9
    public o9 newEntry(p9 p9Var, Object obj, int i10, o9 o9Var) {
        return o9Var == null ? new o9(obj, i10) : new n9(obj, i10, o9Var);
    }

    @Override // nh.b9
    public p9 newSegment(fa faVar, int i10) {
        return new p9(faVar, i10);
    }
}
