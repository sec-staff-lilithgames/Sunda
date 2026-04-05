package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final b1.l0 f97447a;

    /* renamed from: b, reason: collision with root package name */
    public final x1 f97448b;

    /* renamed from: c, reason: collision with root package name */
    public final v1 f97449c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f97450d;

    public y1(kv.l onChangedExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f97447a = new b1.l0(onChangedExecutor);
        this.f97448b = x1.f97445e;
        this.f97449c = v1.f97427e;
        this.f97450d = w1.f97436e;
    }

    public final void clear$ui_release(Object target) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        this.f97447a.clear(target);
    }

    public final void clearInvalidObservations$ui_release() {
        this.f97447a.clearIf(u1.f97423e);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(b0 node, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.f97450d, block);
    }

    public final void observeLayoutSnapshotReads$ui_release(b0 node, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.f97449c, block);
    }

    public final void observeMeasureSnapshotReads$ui_release(b0 node, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.f97448b, block);
    }

    public final <T extends t1> void observeReads$ui_release(T target, kv.l onChanged, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.e0.checkNotNullParameter(onChanged, "onChanged");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        this.f97447a.observeReads(target, onChanged, block);
    }

    public final void startObserving$ui_release() {
        this.f97447a.start();
    }

    public final void stopObserving$ui_release() {
        b1.l0 l0Var = this.f97447a;
        l0Var.stop();
        l0Var.clear();
    }
}
