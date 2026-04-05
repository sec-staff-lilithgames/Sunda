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
public final class e extends f0 implements q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f68758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f68759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2.m f68760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.l f68761h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z10, boolean z11, e2.m mVar, kv.l lVar) {
        super(3);
        this.f68758e = z10;
        this.f68759f = z11;
        this.f68760g = mVar;
        this.f68761h = lVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(290332169);
        boolean z10 = this.f68758e;
        f2.a aVarToggleableState = f2.b.ToggleableState(z10);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = f0.p.MutableInteractionSource();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        v vVarComposed$default = e1.o.composed$default(composed, null, new o(aVarToggleableState, this.f68759f, this.f68760g, (f0.q) objRememberedValue, (s2) wVar.consume(v2.getLocalIndication()), new d(z10, this.f68761h)), 1, null);
        wVar.endReplaceableGroup();
        return vVarComposed$default;
    }
}
