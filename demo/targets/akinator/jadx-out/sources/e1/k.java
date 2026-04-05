package e1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import p0.k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public static final k f53479e = new k(3);

    @Override // kv.q
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return invoke((h1.g) null, (p0.w) obj2, ((Number) obj3).intValue());
        }
        throw new ClassCastException();
    }

    public final h1.l invoke(h1.g mod, p0.w wVar, int i10) {
        e0.checkNotNullParameter(mod, "mod");
        wVar.startReplaceableGroup(-1790596922);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(mod);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new h1.l(new j(1, mod, h1.g.class, "onFocusEvent", "onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V", 0));
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        h1.l lVar = (h1.l) objRememberedValue;
        k1.SideEffect(new i(lVar), wVar, 0);
        wVar.endReplaceableGroup();
        return lVar;
    }
}
