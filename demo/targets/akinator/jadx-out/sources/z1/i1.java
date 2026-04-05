package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 implements kv.a, t1, y1.e {

    /* renamed from: g, reason: collision with root package name */
    public static final h1 f97317g;

    /* renamed from: h, reason: collision with root package name */
    public static final g1 f97318h;

    /* renamed from: b, reason: collision with root package name */
    public k1 f97319b;

    /* renamed from: c, reason: collision with root package name */
    public final y1.b f97320c;

    /* renamed from: e, reason: collision with root package name */
    public final r0.c f97321e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97322f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final y1.e getDetachedModifierLocalReadScope() {
            return i1.f97318h;
        }

        public final kv.l getOnReadValuesChanged() {
            return i1.f97317g;
        }
    }

    static {
        new a(null);
        f97317g = h1.f97314e;
        f97318h = new g1();
    }

    public i1(k1 provider, y1.b modifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        this.f97319b = provider;
        this.f97320c = modifier;
        this.f97321e = new r0.c(new y1.a[16], 0);
    }

    public final void attach() {
        this.f97322f = true;
        notifyConsumerOfChanges();
    }

    public final void attachDelayed() {
        this.f97322f = true;
        invalidateConsumer();
    }

    public final void detach() {
        this.f97320c.onModifierLocalsUpdated(f97318h);
        this.f97322f = false;
    }

    @Override // y1.e
    public <T> T getCurrent(y1.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        this.f97321e.add(aVar);
        y1.d dVarFindModifierLocalProvider = this.f97319b.findModifierLocalProvider(aVar);
        return dVarFindModifierLocalProvider == null ? (T) aVar.getDefaultFactory$ui_release().invoke() : (T) dVarFindModifierLocalProvider.getValue();
    }

    public final y1.b getModifier() {
        return this.f97320c;
    }

    public final k1 getProvider() {
        return this.f97319b;
    }

    public final void invalidateConsumer() {
        s1 owner$ui_release = this.f97319b.getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.registerOnEndApplyChangesListener(this);
        }
    }

    public final void invalidateConsumersOf(y1.a local) {
        s1 owner$ui_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(local, "local");
        if (!this.f97321e.contains(local) || (owner$ui_release = this.f97319b.getLayoutNode().getOwner$ui_release()) == null) {
            return;
        }
        owner$ui_release.registerOnEndApplyChangesListener(this);
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m8033invoke();
        return tu.x0.f87415a;
    }

    public final boolean isAttached() {
        return this.f97322f;
    }

    @Override // z1.t1
    public boolean isValid() {
        return this.f97322f;
    }

    public final void notifyConsumerOfChanges() {
        if (this.f97322f) {
            this.f97321e.clear();
            p0.requireOwner(this.f97319b.getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, f97317g, new j1(this));
        }
    }

    public final void setProvider(k1 k1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(k1Var, "<set-?>");
        this.f97319b = k1Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m8033invoke() {
        notifyConsumerOfChanges();
    }
}
