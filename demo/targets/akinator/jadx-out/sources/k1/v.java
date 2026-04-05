package k1;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f70096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c0 c0Var) {
        super(1);
        this.f70096e = c0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }

    public final Double invoke(double d10) {
        c0 c0Var = this.f70096e;
        return Double.valueOf(h.response(d10, c0Var.getA(), c0Var.getB(), c0Var.getC(), c0Var.getD(), c0Var.getE(), c0Var.getF(), c0Var.getGamma()));
    }
}
