package n0;

import g2.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f75091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f75092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f75093g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(c2 c2Var, kv.p pVar, int i10) {
        super(2);
        this.f75091e = c2Var;
        this.f75092f = pVar;
        this.f75093g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        n1.ProvideTextStyle(this.f75091e, this.f75092f, wVar, this.f75093g | 1);
    }
}
