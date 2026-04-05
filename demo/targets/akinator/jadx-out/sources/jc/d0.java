package jc;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f69270a;

    public d0(f0 f0Var) {
        this.f69270a = f0Var;
    }

    @Override // jc.b0
    public void addAbstractTypeResolver(a aVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69289n = f0Var.f69289n.with(f0Var.f69289n.f69326c.withAbstractTypeResolver(aVar));
    }

    @Override // jc.b0
    public void addBeanDeserializerModifier(mc.i iVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69289n = f0Var.f69289n.with(f0Var.f69289n.f69326c.withDeserializerModifier(iVar));
    }

    @Override // jc.b0
    public void addBeanSerializerModifier(zc.h hVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69287l = f0Var.f69287l.withSerializerModifier(hVar);
    }

    @Override // jc.b0
    public void addDeserializationProblemHandler(mc.q qVar) {
        this.f69270a.addHandler(qVar);
    }

    @Override // jc.b0
    public void addDeserializers(mc.t tVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69289n = f0Var.f69289n.with(f0Var.f69289n.f69326c.withAdditionalDeserializers(tVar));
    }

    @Override // jc.b0
    public void addKeyDeserializers(mc.u uVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69289n = f0Var.f69289n.with(f0Var.f69289n.f69326c.withAdditionalKeyDeserializers(uVar));
    }

    @Override // jc.b0
    public void addKeySerializers(zc.t tVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69287l = f0Var.f69287l.withAdditionalKeySerializers(tVar);
    }

    @Override // jc.b0
    public void addSerializers(zc.t tVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69287l = f0Var.f69287l.withAdditionalSerializers(tVar);
    }

    @Override // jc.b0
    public void addTypeModifier(cd.t tVar) {
        f0 f0Var = this.f69270a;
        f0Var.setTypeFactory(f0Var.f69279c.withModifier(tVar));
    }

    @Override // jc.b0
    public void addValueInstantiators(mc.e0 e0Var) {
        f0 f0Var = this.f69270a;
        f0Var.f69289n = f0Var.f69289n.with(f0Var.f69289n.f69326c.withValueInstantiators(e0Var));
    }

    @Override // jc.b0
    public void appendAnnotationIntrospector(c cVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69288m = (j) f0Var.f69288m.withAppendedAnnotationIntrospector(cVar);
        f0Var.f69285j = (s0) f0Var.f69285j.withAppendedAnnotationIntrospector(cVar);
    }

    @Override // jc.b0
    public lc.c0 configOverride(Class<?> cls) {
        return this.f69270a.configOverride(cls);
    }

    @Override // jc.b0
    public ub.p0 getMapperVersion() {
        return this.f69270a.version();
    }

    @Override // jc.b0
    public <C extends ub.a0> C getOwner() {
        return this.f69270a;
    }

    @Override // jc.b0
    public cd.s getTypeFactory() {
        return this.f69270a.f69279c;
    }

    @Override // jc.b0
    public void insertAnnotationIntrospector(c cVar) {
        f0 f0Var = this.f69270a;
        f0Var.f69288m = (j) f0Var.f69288m.withInsertedAnnotationIntrospector(cVar);
        f0Var.f69285j = (s0) f0Var.f69285j.withInsertedAnnotationIntrospector(cVar);
    }

    @Override // jc.b0
    public boolean isEnabled(y yVar) {
        return this.f69270a.isEnabled(yVar);
    }

    @Override // jc.b0
    public void registerSubtypes(Class<?>... clsArr) {
        this.f69270a.registerSubtypes(clsArr);
    }

    @Override // jc.b0
    public void setClassIntrospector(rc.f0 f0Var) {
        f0 f0Var2 = this.f69270a;
        f0Var2.f69288m = (j) f0Var2.f69288m.with(f0Var);
        f0Var2.f69285j = (s0) f0Var2.f69285j.with(f0Var);
    }

    @Override // jc.b0
    public void setMixInAnnotations(Class<?> cls, Class<?> cls2) {
        this.f69270a.addMixIn(cls, cls2);
    }

    @Override // jc.b0
    public void setNamingStrategy(o0 o0Var) {
        this.f69270a.setPropertyNamingStrategy(o0Var);
    }

    @Override // jc.b0
    public boolean isEnabled(l lVar) {
        return this.f69270a.isEnabled(lVar);
    }

    @Override // jc.b0
    public void registerSubtypes(wc.c... cVarArr) {
        this.f69270a.registerSubtypes(cVarArr);
    }

    @Override // jc.b0
    public boolean isEnabled(t0 t0Var) {
        return this.f69270a.isEnabled(t0Var);
    }

    @Override // jc.b0
    public void registerSubtypes(Collection<Class<?>> collection) {
        this.f69270a.registerSubtypes(collection);
    }

    @Override // jc.b0
    public boolean isEnabled(ub.j jVar) {
        return this.f69270a.isEnabled(jVar);
    }

    @Override // jc.b0
    public boolean isEnabled(ub.r rVar) {
        return this.f69270a.isEnabled(rVar);
    }

    @Override // jc.b0
    public boolean isEnabled(ub.n nVar) {
        return this.f69270a.isEnabled(nVar);
    }
}
