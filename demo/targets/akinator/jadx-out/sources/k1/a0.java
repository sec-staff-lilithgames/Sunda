package k1;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f70012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar) {
        super(1);
        this.f70012e = zVar;
    }

    public final Double invoke(double d10) {
        return (Double) this.f70012e.getEotfOrig$ui_graphics_release().invoke(Double.valueOf(qv.v.coerceIn(d10, r0.f70103e, r0.f70104f)));
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).doubleValue());
    }
}
