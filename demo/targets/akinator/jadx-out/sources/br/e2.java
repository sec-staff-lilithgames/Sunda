package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f9821a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9822b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9823c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public float f9824a = 0.5f;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9825b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9826c;

        public final e2 build() {
            return new e2(this.f9824a, this.f9825b, this.f9826c);
        }

        public final a setIgnoreOverlap(boolean z10) {
            this.f9826c = z10;
            return this;
        }

        public final a setIgnoreWindowFocus(boolean z10) {
            this.f9825b = z10;
            return this;
        }

        public final a setVisibilityPercent(float f10) {
            this.f9824a = f10;
            return this;
        }
    }

    public e2() {
        this(0.0f, false, false, 7, null);
    }

    public final float getVisibilityPercent() {
        return this.f9821a;
    }

    public final boolean isIgnoreOverlap() {
        return this.f9823c;
    }

    public final boolean isIgnoreWindowFocus() {
        return this.f9822b;
    }

    public e2(float f10, boolean z10, boolean z11) {
        this.f9821a = f10;
        this.f9822b = z10;
        this.f9823c = z11;
    }

    public /* synthetic */ e2(float f10, boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 0.5f : f10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
