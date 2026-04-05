package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class r0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final uw.c f90059a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f90060b;

    public r0(t0 t0Var, uw.c cVar) {
        this.f90060b = t0Var;
        this.f90059a = cVar;
    }

    @Override // vw.t0
    public uw.c getAccess() {
        return this.f90060b.getAccess();
    }

    @Override // vw.t0
    public Annotation[] getAnnotations() {
        return this.f90060b.getAnnotations();
    }

    @Override // vw.t0
    public Constructor[] getConstructors() {
        return this.f90060b.getConstructors();
    }

    @Override // vw.t0
    public List<u1> getFields() {
        return this.f90060b.getFields();
    }

    @Override // vw.t0
    public List<p2> getMethods() {
        return this.f90060b.getMethods();
    }

    @Override // vw.t0
    public String getName() {
        return this.f90060b.getName();
    }

    @Override // vw.t0
    public uw.k getNamespace() {
        return this.f90060b.getNamespace();
    }

    @Override // vw.t0
    public uw.l getNamespaceList() {
        return this.f90060b.getNamespaceList();
    }

    @Override // vw.t0
    public uw.m getOrder() {
        return this.f90060b.getOrder();
    }

    @Override // vw.t0
    public uw.c getOverride() {
        return this.f90059a;
    }

    @Override // vw.t0
    public uw.o getRoot() {
        return this.f90060b.getRoot();
    }

    @Override // vw.t0
    public Class getSuper() {
        return this.f90060b.getSuper();
    }

    @Override // vw.t0
    public Class getType() {
        return this.f90060b.getType();
    }

    @Override // vw.t0
    public boolean isInstantiable() {
        return this.f90060b.isInstantiable();
    }

    @Override // vw.t0
    public boolean isPrimitive() {
        return this.f90060b.isPrimitive();
    }

    @Override // vw.t0
    public boolean isRequired() {
        return this.f90060b.isRequired();
    }

    @Override // vw.t0
    public boolean isStrict() {
        return this.f90060b.isStrict();
    }

    public String toString() {
        return this.f90060b.toString();
    }
}
