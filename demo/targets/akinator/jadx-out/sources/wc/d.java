package wc;

import java.io.Serializable;
import jc.o;
import jc.r;
import lc.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d implements Serializable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a extends d implements Serializable {
        @Override // wc.d
        public e validateBaseType(z zVar, o oVar) {
            return e.f90539e;
        }

        @Override // wc.d
        public e validateSubClassName(z zVar, o oVar, String str) throws r {
            return e.f90539e;
        }

        @Override // wc.d
        public e validateSubType(z zVar, o oVar, o oVar2) throws r {
            return e.f90539e;
        }
    }

    public abstract e validateBaseType(z zVar, o oVar);

    public abstract e validateSubClassName(z zVar, o oVar, String str) throws r;

    public abstract e validateSubType(z zVar, o oVar, o oVar2) throws r;
}
