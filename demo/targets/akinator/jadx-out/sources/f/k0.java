package f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f55231e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f55232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55233b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55234c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.l f55235d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ k0 auto$default(a aVar, int i10, int i11, kv.l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                lVar = new j0(0);
            }
            return aVar.auto(i10, i11, lVar);
        }

        public final k0 auto(int i10, int i11) {
            return auto$default(this, i10, i11, null, 4, null);
        }

        public final k0 dark(int i10) {
            return new k0(i10, i10, 2, new a1.o(29), null);
        }

        public final k0 light(int i10, int i11) {
            return new k0(i10, i11, 1, new a1.o(28), null);
        }

        public final k0 auto(int i10, int i11, kv.l detectDarkMode) {
            kotlin.jvm.internal.e0.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new k0(i10, i11, 0, detectDarkMode, null);
        }
    }

    public k0(int i10, int i11, int i12, kv.l lVar, kotlin.jvm.internal.u uVar) {
        this.f55232a = i10;
        this.f55233b = i11;
        this.f55234c = i12;
        this.f55235d = lVar;
    }

    public static final k0 auto(int i10, int i11) {
        return f55231e.auto(i10, i11);
    }

    public static final k0 dark(int i10) {
        return f55231e.dark(i10);
    }

    public static final k0 light(int i10, int i11) {
        return f55231e.light(i10, i11);
    }

    public final int getDarkScrim$activity_release() {
        return this.f55233b;
    }

    public final kv.l getDetectDarkMode$activity_release() {
        return this.f55235d;
    }

    public final int getNightMode$activity_release() {
        return this.f55234c;
    }

    public final int getScrim$activity_release(boolean z10) {
        return z10 ? this.f55233b : this.f55232a;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z10) {
        if (this.f55234c == 0) {
            return 0;
        }
        return z10 ? this.f55233b : this.f55232a;
    }

    public static final k0 auto(int i10, int i11, kv.l lVar) {
        return f55231e.auto(i10, i11, lVar);
    }
}
