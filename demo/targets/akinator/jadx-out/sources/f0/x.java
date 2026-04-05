package f0;

import kotlin.jvm.internal.e0;
import p0.j2;
import p0.k1;
import p0.o5;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {
    public static final v5 collectIsPressedAsState(o oVar, p0.w wVar, int i10) {
        e0.checkNotNullParameter(oVar, "<this>");
        wVar.startReplaceableGroup(-1692965168);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        j2 j2Var = (j2) objRememberedValue;
        k1.LaunchedEffect(oVar, new w(oVar, j2Var, null), wVar, i10 & 14);
        wVar.endReplaceableGroup();
        return j2Var;
    }
}
