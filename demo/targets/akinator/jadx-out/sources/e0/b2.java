package e0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v5 f52981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(v5 v5Var) {
        super(1);
        this.f52981e = v5Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return tu.x0.f87415a;
    }

    public final void invoke(float f10) {
        ((kv.l) this.f52981e.getValue()).invoke(Float.valueOf(f10));
    }
}
