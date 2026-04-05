package jc;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b0 {
    void addAbstractTypeResolver(a aVar);

    void addBeanDeserializerModifier(mc.i iVar);

    void addBeanSerializerModifier(zc.h hVar);

    void addDeserializationProblemHandler(mc.q qVar);

    void addDeserializers(mc.t tVar);

    void addKeyDeserializers(mc.u uVar);

    void addKeySerializers(zc.t tVar);

    void addSerializers(zc.t tVar);

    void addTypeModifier(cd.t tVar);

    void addValueInstantiators(mc.e0 e0Var);

    void appendAnnotationIntrospector(c cVar);

    lc.c0 configOverride(Class<?> cls);

    ub.p0 getMapperVersion();

    <C extends ub.a0> C getOwner();

    cd.s getTypeFactory();

    void insertAnnotationIntrospector(c cVar);

    boolean isEnabled(l lVar);

    boolean isEnabled(t0 t0Var);

    boolean isEnabled(y yVar);

    boolean isEnabled(ub.j jVar);

    boolean isEnabled(ub.n nVar);

    boolean isEnabled(ub.r rVar);

    void registerSubtypes(Collection<Class<?>> collection);

    void registerSubtypes(Class<?>... clsArr);

    void registerSubtypes(wc.c... cVarArr);

    void setClassIntrospector(rc.f0 f0Var);

    void setMixInAnnotations(Class<?> cls, Class<?> cls2);

    void setNamingStrategy(o0 o0Var);
}
