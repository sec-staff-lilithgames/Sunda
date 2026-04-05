package j0;

import d0.s2;
import d0.v2;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.q;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends f0 implements q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.a f68814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f68815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2.m f68816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.a f68817h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f2.a aVar, boolean z10, e2.m mVar, kv.a aVar2) {
        super(3);
        this.f68814e = aVar;
        this.f68815f = z10;
        this.f68816g = mVar;
        this.f68817h = aVar2;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-1808118329);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = f0.p.MutableInteractionSource();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        v vVarComposed$default = e1.o.composed$default(composed, null, new o(this.f68814e, this.f68815f, this.f68816g, (f0.q) objRememberedValue, (s2) wVar.consume(v2.getLocalIndication()), this.f68817h), 1, null);
        wVar.endReplaceableGroup();
        return vVarComposed$default;
    }
}
