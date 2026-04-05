package i0;

import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import p0.k1;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f59315e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar) {
        super(3);
        this.f59315e = fVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-992853993);
        e eVarRememberDefaultBringIntoViewParent = t.rememberDefaultBringIntoViewParent(wVar, 0);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(eVarRememberDefaultBringIntoViewParent);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new l(eVarRememberDefaultBringIntoViewParent);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        l lVar = (l) objRememberedValue;
        f fVar = this.f59315e;
        if (fVar instanceof h) {
            k1.DisposableEffect(fVar, new j(fVar, lVar), wVar, 0);
        }
        wVar.endReplaceableGroup();
        return lVar;
    }
}
