package n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends p0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l root) {
        super(root);
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
    }

    public static b b(l lVar) {
        if (lVar instanceof b) {
            return (b) lVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // p0.a
    public final void a() {
        b bVarB = b((l) getRoot());
        bVarB.remove(0, bVarB.getNumChildren());
    }

    @Override // p0.a, p0.d
    public /* bridge */ /* synthetic */ void apply(kv.p pVar, Object obj) {
        super.apply(pVar, obj);
    }

    @Override // p0.a, p0.d
    public void insertBottomUp(int i10, l instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
    }

    @Override // p0.a, p0.d
    public void move(int i10, int i11, int i12) {
        b((l) getCurrent()).move(i10, i11, i12);
    }

    @Override // p0.a, p0.d
    public /* bridge */ /* synthetic */ void onBeginChanges() {
        super.onBeginChanges();
    }

    @Override // p0.a, p0.d
    public /* bridge */ /* synthetic */ void onEndChanges() {
        super.onEndChanges();
    }

    @Override // p0.a, p0.d
    public void remove(int i10, int i11) {
        b((l) getCurrent()).remove(i10, i11);
    }

    @Override // p0.a, p0.d
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    @Override // p0.a, p0.d
    public void insertTopDown(int i10, l instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        b((l) getCurrent()).insertAt(i10, instance);
    }
}
