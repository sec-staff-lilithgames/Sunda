package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 extends p0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(b0 root) {
        super(root);
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
    }

    @Override // p0.a
    public final void a() {
        ((b0) getRoot()).removeAll$ui_release();
    }

    @Override // p0.a, p0.d
    public /* bridge */ /* synthetic */ void apply(kv.p pVar, Object obj) {
        super.apply(pVar, obj);
    }

    @Override // p0.a, p0.d
    public void insertTopDown(int i10, b0 instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
    }

    @Override // p0.a, p0.d
    public void move(int i10, int i11, int i12) {
        ((b0) getCurrent()).move$ui_release(i10, i11, i12);
    }

    @Override // p0.a, p0.d
    public /* bridge */ /* synthetic */ void onBeginChanges() {
        super.onBeginChanges();
    }

    @Override // p0.a, p0.d
    public void onEndChanges() {
        super.onEndChanges();
        s1 owner$ui_release = ((b0) getRoot()).getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }

    @Override // p0.a, p0.d
    public void remove(int i10, int i11) {
        ((b0) getCurrent()).removeAt$ui_release(i10, i11);
    }

    @Override // p0.a, p0.d
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    @Override // p0.a, p0.d
    public void insertBottomUp(int i10, b0 instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        ((b0) getCurrent()).insertAt$ui_release(i10, instance);
    }
}
