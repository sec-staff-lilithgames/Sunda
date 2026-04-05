package oq;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public View f79795i;

    /* renamed from: j, reason: collision with root package name */
    public br.i f79796j;

    /* renamed from: k, reason: collision with root package name */
    public Runnable f79797k;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f79798l;

    /* renamed from: m, reason: collision with root package name */
    public a f79799m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79800n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f79801o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f79802p;

    /* renamed from: q, reason: collision with root package name */
    public int f79803q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, zu.d dVar) {
        super(dVar);
        this.f79802p = xVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f79801o = obj;
        this.f79803q |= Integer.MIN_VALUE;
        return this.f79802p.b(null, null, false, false, null, null, this);
    }
}
