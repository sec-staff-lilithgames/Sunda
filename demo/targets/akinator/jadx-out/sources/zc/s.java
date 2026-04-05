package zc;

import jc.s0;
import jc.u0;
import jc.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s {
    @Deprecated
    public abstract w createKeySerializer(s0 s0Var, jc.o oVar, w wVar) throws jc.r;

    public w createKeySerializer(u0 u0Var, jc.o oVar, w wVar) throws jc.r {
        return createKeySerializer(u0Var.getConfig(), oVar, wVar);
    }

    public abstract w createSerializer(u0 u0Var, jc.o oVar) throws jc.r;

    public abstract wc.j createTypeSerializer(s0 s0Var, jc.o oVar) throws jc.r;

    public abstract s withAdditionalKeySerializers(t tVar);

    public abstract s withAdditionalSerializers(t tVar);

    public abstract s withSerializerModifier(h hVar);
}
