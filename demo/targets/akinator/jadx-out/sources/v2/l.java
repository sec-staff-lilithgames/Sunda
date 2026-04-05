package v2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f88914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.a f88915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f88916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.p f88917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88918i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f88919j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e0 e0Var, kv.a aVar, f0 f0Var, kv.p pVar, int i10, int i11) {
        super(2);
        this.f88914e = e0Var;
        this.f88915f = aVar;
        this.f88916g = f0Var;
        this.f88917h = pVar;
        this.f88918i = i10;
        this.f88919j = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        t.Popup(this.f88914e, this.f88915f, this.f88916g, this.f88917h, wVar, this.f88918i | 1, this.f88919j);
    }
}
