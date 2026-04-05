package oq;

import android.view.View;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public View f79755i;

    /* renamed from: j, reason: collision with root package name */
    public a f79756j;

    /* renamed from: k, reason: collision with root package name */
    public br.i f79757k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f79758l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f79759m;

    /* renamed from: n, reason: collision with root package name */
    public int f79760n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x xVar, zu.d dVar) {
        super(dVar);
        this.f79759m = xVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f79758l = obj;
        this.f79760n |= Integer.MIN_VALUE;
        return this.f79759m.a((View) null, (a) null, (br.i) null, false, (zu.d<? super x0>) this);
    }
}
