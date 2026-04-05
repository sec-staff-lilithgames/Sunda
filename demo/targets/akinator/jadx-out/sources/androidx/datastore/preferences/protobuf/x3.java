package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x3 implements o2 {

    /* renamed from: a, reason: collision with root package name */
    public final c3 f6116a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6117b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f6118c;

    /* renamed from: d, reason: collision with root package name */
    public final x0[] f6119d;

    /* renamed from: e, reason: collision with root package name */
    public final r2 f6120e;

    public x3(c3 c3Var, boolean z10, int[] iArr, x0[] x0VarArr, Object obj) {
        this.f6116a = c3Var;
        this.f6117b = z10;
        this.f6118c = iArr;
        this.f6119d = x0VarArr;
        t1.a(obj, "defaultInstance");
        this.f6120e = (r2) obj;
    }

    public static w3 newBuilder() {
        return new w3();
    }

    public int[] getCheckInitialized() {
        return this.f6118c;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public r2 getDefaultInstance() {
        return this.f6120e;
    }

    public x0[] getFields() {
        return this.f6119d;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public c3 getSyntax() {
        return this.f6116a;
    }

    @Override // androidx.datastore.preferences.protobuf.o2
    public boolean isMessageSetWireFormat() {
        return this.f6117b;
    }

    public static w3 newBuilder(int i10) {
        return new w3(i10);
    }
}
