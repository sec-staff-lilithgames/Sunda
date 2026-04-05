package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f80314a;

    public l0(kv.a aVar, kotlin.jvm.internal.u uVar) {
        this.f80314a = new z1(aVar);
    }

    public final Object getCurrent(w wVar, int i10) {
        return wVar.consume(this);
    }

    public b6 getDefaultValueHolder$runtime() {
        return this.f80314a;
    }

    public abstract b6 updatedStateOf$runtime(h3 h3Var, b6 b6Var);

    public static /* synthetic */ void getCurrent$annotations() {
    }
}
