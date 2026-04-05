package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f4 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final z.i0 f80211a = new z.i0(0, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public final z.t0 f80212b = new z.t0(0, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public Object f80213c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public f4(Object obj) {
        this.f80213c = obj;
    }

    @Override // p0.d
    public void apply(kv.p pVar, Object obj) {
        this.f80211a.add(7);
        z.t0 t0Var = this.f80212b;
        t0Var.add(pVar);
        t0Var.add(obj);
    }

    @Override // p0.d
    public void clear() {
        this.f80211a.add(4);
    }

    @Override // p0.d
    public void down(Object obj) {
        this.f80211a.add(1);
        this.f80212b.add(obj);
    }

    @Override // p0.d
    public Object getCurrent() {
        return this.f80213c;
    }

    @Override // p0.d
    public void insertBottomUp(int i10, Object obj) {
        z.i0 i0Var = this.f80211a;
        i0Var.add(5);
        i0Var.add(i10);
        this.f80212b.add(obj);
    }

    @Override // p0.d
    public void insertTopDown(int i10, Object obj) {
        z.i0 i0Var = this.f80211a;
        i0Var.add(6);
        i0Var.add(i10);
        this.f80212b.add(obj);
    }

    @Override // p0.d
    public void move(int i10, int i11, int i12) {
        z.i0 i0Var = this.f80211a;
        i0Var.add(3);
        i0Var.add(i10);
        i0Var.add(i11);
        i0Var.add(i12);
    }

    @Override // p0.d
    public /* bridge */ /* synthetic */ void onBeginChanges() {
        super.onBeginChanges();
    }

    @Override // p0.d
    public /* bridge */ /* synthetic */ void onEndChanges() {
        super.onEndChanges();
    }

    public final void playTo(d dVar, z0.c0 c0Var) {
        Exception exc;
        int i10;
        int i11;
        z.i0 i0Var = this.f80211a;
        int i12 = i0Var.f96886b;
        boolean z10 = true;
        z.t0 t0Var = new z.t0(0, 1, null);
        dVar.onBeginChanges();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            z.t0 t0Var2 = this.f80212b;
            if (i14 >= i12) {
                if (i13 != t0Var2.getSize()) {
                    z10 = false;
                }
                if (!z10) {
                    d0.composeImmediateRuntimeError("Applier operation size mismatch");
                }
                t0Var2.clear();
                i0Var.clear();
                dVar.onEndChanges();
                return;
            }
            int i15 = i14 + 1;
            try {
                try {
                    switch (i0Var.get(i14)) {
                        case 0:
                            dVar.up();
                            i14 = i15;
                        case 1:
                            int i16 = i13 + 1;
                            dVar.down(t0Var2.get(i13));
                            i13 = i16;
                            i14 = i15;
                        case 2:
                            int i17 = i14 + 2;
                            i14 += 3;
                            dVar.remove(i0Var.get(i15), i0Var.get(i17));
                        case 3:
                            int i18 = i14 + 2;
                            try {
                                int i19 = i14 + 3;
                                try {
                                    i14 += 4;
                                    dVar.move(i0Var.get(i15), i0Var.get(i18), i0Var.get(i19));
                                } catch (Exception e10) {
                                    exc = e10;
                                    i10 = i19;
                                    break;
                                }
                            } catch (Exception e11) {
                                exc = e11;
                                i10 = i18;
                                break;
                            }
                        case 4:
                            dVar.clear();
                            i14 = i15;
                        case 5:
                            i14 += 2;
                            i11 = i13 + 1;
                            dVar.insertBottomUp(i0Var.get(i15), t0Var2.get(i13));
                            i13 = i11;
                        case 6:
                            i14 += 2;
                            try {
                                i11 = i13 + 1;
                                dVar.insertTopDown(i0Var.get(i15), t0Var2.get(i13));
                                i13 = i11;
                            } catch (Exception e12) {
                                i10 = i14;
                                exc = e12;
                                break;
                            }
                        case 7:
                            int i20 = i13 + 1;
                            Object obj = t0Var2.get(i13);
                            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            i13 += 2;
                            dVar.apply((kv.p) kotlin.jvm.internal.h1.beforeCheckcastToFunctionOfArity(obj, 2), t0Var2.get(i20));
                            i14 = i15;
                        case 8:
                            t0Var.add(dVar.getCurrent());
                            dVar.reuse();
                            i14 = i15;
                        default:
                            i14 = i15;
                    }
                } catch (Exception e13) {
                    exc = e13;
                    i10 = i15;
                }
            } catch (Throwable th2) {
                dVar.onEndChanges();
                throw th2;
            }
            i10 = i14;
            exc = e12;
            throw new s(t0Var2, t0Var, i0Var, i10, exc);
        }
    }

    @Override // p0.d
    public void remove(int i10, int i11) {
        z.i0 i0Var = this.f80211a;
        i0Var.add(2);
        i0Var.add(i10);
        i0Var.add(i11);
    }

    @Override // p0.d
    public void reuse() {
        this.f80211a.add(8);
    }

    public void setCurrent(Object obj) {
        this.f80213c = obj;
    }

    @Override // p0.d
    public void up() {
        this.f80211a.add(0);
    }
}
