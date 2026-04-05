package oq;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public View f79775i;

    /* renamed from: j, reason: collision with root package name */
    public br.i f79776j;

    /* renamed from: k, reason: collision with root package name */
    public Runnable f79777k;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f79778l;

    /* renamed from: m, reason: collision with root package name */
    public a f79779m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79780n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f79781o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f79782p;

    /* renamed from: q, reason: collision with root package name */
    public int f79783q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, zu.d dVar) {
        super(dVar);
        this.f79782p = xVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f79781o = obj;
        this.f79783q |= Integer.MIN_VALUE;
        return this.f79782p.a(null, null, false, false, null, null, this);
    }
}
