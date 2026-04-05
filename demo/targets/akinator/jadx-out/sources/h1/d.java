package h1;

import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f58540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kv.l lVar) {
        super(3);
        this.f58540e = lVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-1741761824);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(null, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        e1.v vVarOnFocusEvent = i.onFocusEvent(e1.t.f53496b, new c(this.f58540e, (j2) objRememberedValue));
        wVar.endReplaceableGroup();
        return vVarOnFocusEvent;
    }
}
