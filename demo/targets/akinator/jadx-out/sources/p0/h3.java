package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f80234a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80235b;

    /* renamed from: c, reason: collision with root package name */
    public final y4 f80236c;

    /* renamed from: d, reason: collision with root package name */
    public final j2 f80237d;

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f80238e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f80239f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f80240g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f80241h = true;

    public h3(l0 l0Var, Object obj, boolean z10, y4 y4Var, j2 j2Var, kv.l lVar, boolean z11) {
        this.f80234a = l0Var;
        this.f80235b = z10;
        this.f80236c = y4Var;
        this.f80237d = j2Var;
        this.f80238e = lVar;
        this.f80239f = z11;
        this.f80240g = obj;
    }

    public final boolean getCanOverride() {
        return this.f80241h;
    }

    public final l0 getCompositionLocal() {
        return this.f80234a;
    }

    public final kv.l getCompute$runtime() {
        return this.f80238e;
    }

    public final Object getEffectiveValue$runtime() {
        if (this.f80235b) {
            return null;
        }
        j2 j2Var = this.f80237d;
        if (j2Var != null) {
            return j2Var.getValue();
        }
        Object obj = this.f80240g;
        if (obj != null) {
            return obj;
        }
        d0.composeRuntimeError("Unexpected form of a provided value");
        throw new tu.k();
    }

    public final y4 getMutationPolicy$runtime() {
        return this.f80236c;
    }

    public final j2 getState$runtime() {
        return this.f80237d;
    }

    public final Object getValue() {
        return this.f80240g;
    }

    public final h3 ifNotAlreadyProvided$runtime() {
        this.f80241h = false;
        return this;
    }

    public final boolean isDynamic$runtime() {
        return this.f80239f;
    }

    public final boolean isStatic$runtime() {
        return (this.f80235b || getValue() != null) && !this.f80239f;
    }

    public static /* synthetic */ void getEffectiveValue$runtime$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
