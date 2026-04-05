package i0;

import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f59317e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar) {
        super(3);
        this.f59317e = mVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((v) obj, (w) obj2, ((Number) obj3).intValue());
    }

    public final v invoke(v composed, w wVar, int i10) {
        e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-852052847);
        e eVarRememberDefaultBringIntoViewParent = t.rememberDefaultBringIntoViewParent(wVar, 0);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(eVarRememberDefaultBringIntoViewParent);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new s(eVarRememberDefaultBringIntoViewParent);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        s sVar = (s) objRememberedValue;
        sVar.setResponder(this.f59317e);
        wVar.endReplaceableGroup();
        return sVar;
    }
}
