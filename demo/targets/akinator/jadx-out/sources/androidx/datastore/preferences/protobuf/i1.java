package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f5898a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5899b;

    /* renamed from: c, reason: collision with root package name */
    public final r2 f5900c;

    /* renamed from: d, reason: collision with root package name */
    public final h1 f5901d;

    public i1(r2 r2Var, Object obj, r2 r2Var2, h1 h1Var) {
        if (r2Var == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (h1Var.getLiteType() == r4.f5981g && r2Var2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f5898a = r2Var;
        this.f5899b = obj;
        this.f5900c = r2Var2;
        this.f5901d = h1Var;
    }

    public final void a(Object obj) {
        if (this.f5901d.getLiteJavaType() != s4.ENUM) {
            return;
        }
        ((Integer) obj).getClass();
        throw null;
    }

    public r2 getContainingTypeDefaultInstance() {
        return this.f5898a;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public Object getDefaultValue() {
        return this.f5899b;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public r4 getLiteType() {
        return this.f5901d.getLiteType();
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public r2 getMessageDefaultInstance() {
        return this.f5900c;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public int getNumber() {
        return this.f5901d.getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public boolean isRepeated() {
        return this.f5901d.f5891e;
    }
}
