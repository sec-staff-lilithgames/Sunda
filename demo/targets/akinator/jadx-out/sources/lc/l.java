package lc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final l f73130f = new l(k.f73128e, false, false);

    /* renamed from: b, reason: collision with root package name */
    public final k f73131b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73132c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f73133e;

    public l(k kVar, boolean z10, boolean z11) {
        this.f73131b = kVar;
        this.f73132c = z10;
        this.f73133e = z11;
    }

    public boolean allowJDKTypeConstructors() {
        return this.f73133e;
    }

    public boolean requireCtorAnnotation() {
        return this.f73132c;
    }

    public boolean shouldIntrospectorImplicitConstructors(Class<?> cls) {
        if (this.f73132c) {
            return false;
        }
        return this.f73133e || !dd.i.isJDKClass(cls) || Throwable.class.isAssignableFrom(cls);
    }

    public boolean singleArgCreatorDefaultsToDelegating() {
        return this.f73131b == k.f73126b;
    }

    public boolean singleArgCreatorDefaultsToProperties() {
        return this.f73131b == k.f73127c;
    }

    public k singleArgMode() {
        return this.f73131b;
    }

    public l withAllowJDKTypeConstructors(boolean z10) {
        return new l(this.f73131b, this.f73132c, z10);
    }

    public l withRequireAnnotation(boolean z10) {
        return new l(this.f73131b, z10, this.f73133e);
    }

    public l withSingleArgMode(k kVar) {
        return new l(kVar, this.f73132c, this.f73133e);
    }
}
