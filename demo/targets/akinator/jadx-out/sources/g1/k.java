package g1;

import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f56675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kv.l lVar) {
        super(3);
        this.f56675e = lVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-1689569019);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new d();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        v vVarThen = composed.then(new h((d) objRememberedValue, this.f56675e));
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
