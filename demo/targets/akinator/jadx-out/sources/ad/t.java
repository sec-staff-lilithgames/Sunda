package ad;

import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4297a;

    public t(boolean z10) {
        this.f4297a = z10;
    }

    public static t emptyForProperties() {
        return o.f4288b;
    }

    public static t emptyForRootValues() {
        return o.f4289c;
    }

    public final q addSerializer(Class<?> cls, jc.w wVar) {
        return new q(wVar, newWith(cls, wVar));
    }

    public final q findAndAddKeySerializer(Class<?> cls, u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarFindKeySerializer = u0Var.findKeySerializer(cls, gVar);
        return new q(wVarFindKeySerializer, newWith(cls, wVarFindKeySerializer));
    }

    public final q findAndAddPrimarySerializer(Class<?> cls, u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarFindPrimaryPropertySerializer = u0Var.findPrimaryPropertySerializer(cls, gVar);
        return new q(wVarFindPrimaryPropertySerializer, newWith(cls, wVarFindPrimaryPropertySerializer));
    }

    public final q findAndAddRootValueSerializer(Class<?> cls, u0 u0Var) throws jc.r {
        jc.w wVarFindTypedValueSerializer = u0Var.findTypedValueSerializer(cls, false, (jc.g) null);
        return new q(wVarFindTypedValueSerializer, newWith(cls, wVarFindTypedValueSerializer));
    }

    public final q findAndAddSecondarySerializer(Class<?> cls, u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarFindContentValueSerializer = u0Var.findContentValueSerializer(cls, gVar);
        return new q(wVarFindContentValueSerializer, newWith(cls, wVarFindContentValueSerializer));
    }

    public abstract t newWith(Class<?> cls, jc.w wVar);

    public abstract jc.w serializerFor(Class<?> cls);

    public final q addSerializer(jc.o oVar, jc.w wVar) {
        return new q(wVar, newWith(oVar.getRawClass(), wVar));
    }

    public t(t tVar) {
        this.f4297a = tVar.f4297a;
    }

    public final q findAndAddPrimarySerializer(jc.o oVar, u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarFindPrimaryPropertySerializer = u0Var.findPrimaryPropertySerializer(oVar, gVar);
        return new q(wVarFindPrimaryPropertySerializer, newWith(oVar.getRawClass(), wVarFindPrimaryPropertySerializer));
    }

    public final q findAndAddRootValueSerializer(jc.o oVar, u0 u0Var) throws jc.r {
        jc.w wVarFindTypedValueSerializer = u0Var.findTypedValueSerializer(oVar, false, (jc.g) null);
        return new q(wVarFindTypedValueSerializer, newWith(oVar.getRawClass(), wVarFindTypedValueSerializer));
    }

    public final q findAndAddSecondarySerializer(jc.o oVar, u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarFindContentValueSerializer = u0Var.findContentValueSerializer(oVar, gVar);
        return new q(wVarFindContentValueSerializer, newWith(oVar.getRawClass(), wVarFindContentValueSerializer));
    }
}
