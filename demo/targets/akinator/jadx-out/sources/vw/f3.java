package vw;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f3 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f89808a;

    /* renamed from: b, reason: collision with root package name */
    public final l f89809b;

    /* renamed from: c, reason: collision with root package name */
    public final t4 f89810c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f89811d;

    public f3(t0 t0Var, v4 v4Var) throws Exception {
        this.f89809b = new l(t0Var, v4Var);
        this.f89808a = new u4(this, t0Var, v4Var);
        this.f89811d = t0Var;
        this.f89808a.assemble(t0Var.getType());
        Iterator<E> it = v4Var.getFields(t0Var.getType(), t0Var.getOverride()).iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            Annotation annotation = i0Var.getAnnotation();
            if (annotation != null) {
                this.f89808a.process(i0Var, annotation);
            }
        }
        Iterator<E> it2 = v4Var.getMethods(t0Var.getType(), t0Var.getOverride()).iterator();
        while (it2.hasNext()) {
            i0 i0Var2 = (i0) it2.next();
            Annotation annotation2 = i0Var2.getAnnotation();
            if (annotation2 != null) {
                this.f89808a.process(i0Var2, annotation2);
            }
        }
        Class type = t0Var.getType();
        this.f89808a.commit(type);
        this.f89808a.validate(type);
        Class type2 = t0Var.getType();
        if (this.f89810c == null) {
            this.f89810c = this.f89808a.build(type2);
        }
        this.f89808a = null;
    }

    @Override // vw.h4
    public j getCaller(l0 l0Var) {
        return new j(this, l0Var);
    }

    @Override // vw.h4
    public w1 getCommit() {
        return this.f89809b.getCommit();
    }

    @Override // vw.h4
    public w1 getComplete() {
        return this.f89809b.getComplete();
    }

    @Override // vw.h4
    public q0 getDecorator() {
        return this.f89809b.getDecorator();
    }

    @Override // vw.h4
    public d2 getInstantiator() {
        return this.f89810c.getInstantiator();
    }

    @Override // vw.h4
    public String getName() {
        return this.f89811d.getName();
    }

    @Override // vw.h4
    public uw.m getOrder() {
        return this.f89809b.getOrder();
    }

    @Override // vw.h4
    public l3 getParameters() {
        return this.f89809b.getParameters();
    }

    @Override // vw.h4
    public w1 getPersist() {
        return this.f89809b.getPersist();
    }

    @Override // vw.h4
    public w1 getReplace() {
        return this.f89809b.getReplace();
    }

    @Override // vw.h4
    public w1 getResolve() {
        return this.f89809b.getResolve();
    }

    @Override // vw.h4
    public uw.s getRevision() {
        return this.f89810c.getRevision();
    }

    @Override // vw.h4
    public k4 getSection() {
        return this.f89810c.getSection();
    }

    @Override // vw.h4
    public o4 getSignature() {
        return this.f89809b.getSignature();
    }

    @Override // vw.h4
    public List<o4> getSignatures() {
        return this.f89809b.getSignatures();
    }

    @Override // vw.h4
    public i2 getText() {
        return this.f89810c.getText();
    }

    @Override // vw.h4
    public Class getType() {
        return this.f89811d.getType();
    }

    @Override // vw.h4
    public w1 getValidate() {
        return this.f89809b.getValidate();
    }

    @Override // vw.h4
    public i2 getVersion() {
        return this.f89810c.getVersion();
    }

    @Override // vw.h4
    public boolean isEmpty() {
        return this.f89809b.getRoot() == null;
    }

    @Override // vw.h4
    public boolean isPrimitive() {
        return this.f89810c.isPrimitive();
    }

    @Override // vw.h4, vw.r3
    public boolean isStrict() {
        return this.f89811d.isStrict();
    }
}
