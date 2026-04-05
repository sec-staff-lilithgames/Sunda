package wc;

import java.io.Serializable;
import jc.o;
import lc.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends d implements Serializable {
    @Override // wc.d
    public e validateBaseType(z zVar, o oVar) {
        return a.f90532b.isUnsafeBaseType(oVar.getRawClass()) ? e.f90538c : e.f90539e;
    }

    @Override // wc.d
    public e validateSubClassName(z zVar, o oVar, String str) {
        return e.f90539e;
    }

    @Override // wc.d
    public e validateSubType(z zVar, o oVar, o oVar2) {
        return e.f90537b;
    }
}
