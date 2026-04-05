package jc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final rc.l f69369a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69370b;

    public l0(rc.l lVar, boolean z10) {
        this.f69369a = lVar;
        this.f69370b = z10;
    }

    public static l0 createForDefaults(rc.l lVar) {
        return new l0(lVar, true);
    }

    public static l0 createForPropertyOverride(rc.l lVar) {
        return new l0(lVar, false);
    }

    public static l0 createForTypeOverride(rc.l lVar) {
        return new l0(lVar, false);
    }
}
