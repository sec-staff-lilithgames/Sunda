package z0;

import p0.y2;
import p0.z2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z {
    public static final y persistentCompositionLocalHashMapOf() {
        return y.f97240i.getEmpty();
    }

    public static final z2 persistentCompositionLocalHashMapOf(tu.v... vVarArr) {
        y2 y2VarBuilder = y.f97240i.getEmpty().builder();
        p1.putAll(y2VarBuilder, vVarArr);
        return y2VarBuilder.build();
    }
}
