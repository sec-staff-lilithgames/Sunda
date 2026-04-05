package j0;

import d0.s2;
import d0.v2;
import e1.t;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.q;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends f0 implements q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f68741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f68742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2.m f68743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.a f68744h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, boolean z11, e2.m mVar, kv.a aVar) {
        super(3);
        this.f68741e = z10;
        this.f68742f = z11;
        this.f68743g = mVar;
        this.f68744h = aVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-2124609672);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = f0.p.MutableInteractionSource();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        v vVarM4637selectableO2vRcR0 = c.m4637selectableO2vRcR0(t.f53496b, this.f68741e, (f0.q) objRememberedValue, (s2) wVar.consume(v2.getLocalIndication()), this.f68742f, this.f68743g, this.f68744h);
        wVar.endReplaceableGroup();
        return vVarM4637selectableO2vRcR0;
    }
}
