package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final e1.v f91363a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f91364b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f91365c;

    public h1(e1.v modifier, d0 coordinates, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinates, "coordinates");
        this.f91363a = modifier;
        this.f91364b = coordinates;
        this.f91365c = obj;
    }

    public final d0 getCoordinates() {
        return this.f91364b;
    }

    public final Object getExtra() {
        return this.f91365c;
    }

    public final e1.v getModifier() {
        return this.f91363a;
    }

    public /* synthetic */ h1(e1.v vVar, d0 d0Var, Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this(vVar, d0Var, (i10 & 4) != 0 ? null : obj);
    }
}
