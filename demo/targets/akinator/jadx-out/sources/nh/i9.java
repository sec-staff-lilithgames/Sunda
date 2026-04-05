package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i9 implements b9 {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f76357a = new i9();

    @Override // nh.b9
    public h9 keyStrength() {
        return h9.f76324b;
    }

    @Override // nh.b9
    public void setValue(l9 l9Var, k9 k9Var, Object obj) {
        k9Var.f76420c = obj;
    }

    @Override // nh.b9
    public h9 valueStrength() {
        return h9.f76324b;
    }

    @Override // nh.b9
    public k9 copy(l9 l9Var, k9 k9Var, k9 k9Var2) {
        k9 k9VarNewEntry = newEntry(l9Var, k9Var.f76689a, k9Var.f76690b, k9Var2);
        k9VarNewEntry.f76420c = k9Var.f76420c;
        return k9VarNewEntry;
    }

    @Override // nh.b9
    public k9 newEntry(l9 l9Var, Object obj, int i10, k9 k9Var) {
        return k9Var == null ? new k9(obj, i10) : new j9(obj, i10, k9Var);
    }

    @Override // nh.b9
    public l9 newSegment(fa faVar, int i10) {
        return new l9(faVar, i10);
    }
}
