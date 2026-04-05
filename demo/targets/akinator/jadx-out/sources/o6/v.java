package o6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ v f77975a = new v();

    public static /* synthetic */ w create$default(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return vVar.create(z10);
    }

    public final w create() {
        return create$default(this, false, 1, null);
    }

    public final w create(boolean z10) {
        x xVar = new x();
        return z10 ? new y(xVar) : xVar;
    }
}
