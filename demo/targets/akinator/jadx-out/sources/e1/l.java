package e1;

import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import h1.p0;
import h1.t0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class l extends f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public static final l f53480e = new l(3);

    @Override // kv.q
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return invoke((p0) null, (p0.w) obj2, ((Number) obj3).intValue());
        }
        throw new ClassCastException();
    }

    public final t0 invoke(p0 p0Var, p0.w wVar, int i10) {
        e0.checkNotNullParameter(p0Var, SUvoXnn.AdYoHfEaHbcTLwM);
        wVar.startReplaceableGroup(945678692);
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(p0Var);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new t0(p0Var.getFocusRequester());
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        t0 t0Var = (t0) objRememberedValue;
        wVar.endReplaceableGroup();
        return t0Var;
    }
}
