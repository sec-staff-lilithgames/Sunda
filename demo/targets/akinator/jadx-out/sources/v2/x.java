package v2;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f88937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f88938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, int i10) {
        super(2);
        this.f88937e = a0Var;
        this.f88938f = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        this.f88937e.Content(wVar, this.f88938f | 1);
    }
}
