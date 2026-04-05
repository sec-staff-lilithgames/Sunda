package m0;

import j1.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f73711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f73712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r2.k f73713g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f73714h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j10, boolean z10, r2.k kVar, boolean z11) {
        super(1);
        this.f73711e = j10;
        this.f73712f = z10;
        this.f73713g = kVar;
        this.f73714h = z11;
    }

    @Override // kv.l
    public final g1.l invoke(g1.d drawWithCache) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        j1.y0 y0VarCreateHandleImage = i.createHandleImage(drawWithCache, i1.o.m4252getWidthimpl(drawWithCache.m3936getSizeNHjbRc()) / 2.0f);
        j1.n0 n0VarM4872tintxETnrds$default = n0.a.m4872tintxETnrds$default(j1.n0.f68934b, this.f73711e, 0, 2, null);
        return drawWithCache.onDrawWithContent(new f(this.f73712f, this.f73713g, this.f73714h, y0VarCreateHandleImage, n0VarM4872tintxETnrds$default));
    }
}
