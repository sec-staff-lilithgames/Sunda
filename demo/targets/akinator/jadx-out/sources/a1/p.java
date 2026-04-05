package a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.p f3414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.l f3415b;

    public p(kv.p pVar, kv.l lVar) {
        this.f3414a = pVar;
        this.f3415b = lVar;
    }

    @Override // a1.m
    public Object restore(Object obj) {
        return this.f3415b.invoke(obj);
    }

    @Override // a1.m
    public Object save(r rVar, Object obj) {
        return this.f3414a.invoke(rVar, obj);
    }
}
