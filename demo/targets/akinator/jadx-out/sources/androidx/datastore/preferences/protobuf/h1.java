package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f5889b;

    /* renamed from: c, reason: collision with root package name */
    public final r4 f5890c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5891e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5892f;

    public h1(int i10, r4 r4Var, boolean z10, boolean z11) {
        this.f5889b = i10;
        this.f5890c = r4Var;
        this.f5891e = z10;
        this.f5892f = z11;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public n1 getEnumType() {
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public s4 getLiteJavaType() {
        return this.f5890c.getJavaType();
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public r4 getLiteType() {
        return this.f5890c;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public int getNumber() {
        return this.f5889b;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public q2 internalMergeFrom(q2 q2Var, r2 r2Var) {
        return ((e1) q2Var).mergeFrom((f1) r2Var);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public boolean isPacked() {
        return this.f5892f;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public boolean isRepeated() {
        return this.f5891e;
    }

    @Override // java.lang.Comparable
    public int compareTo(h1 h1Var) {
        return this.f5889b - h1Var.f5889b;
    }
}
