package vw;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s0 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final f3 f90081a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f90082b;

    public s0(t0 t0Var, v4 v4Var) throws Exception {
        r0 r0Var = new r0(t0Var, uw.c.f88806b);
        this.f90082b = r0Var;
        this.f90081a = new f3(r0Var, v4Var);
    }

    @Override // vw.h4
    public j getCaller(l0 l0Var) {
        return this.f90081a.getCaller(l0Var);
    }

    @Override // vw.h4
    public w1 getCommit() {
        return this.f90081a.getCommit();
    }

    @Override // vw.h4
    public w1 getComplete() {
        return this.f90081a.getComplete();
    }

    @Override // vw.h4
    public q0 getDecorator() {
        return this.f90081a.getDecorator();
    }

    @Override // vw.h4
    public d2 getInstantiator() {
        return this.f90081a.getInstantiator();
    }

    @Override // vw.h4
    public String getName() {
        return this.f90082b.getName();
    }

    @Override // vw.h4
    public uw.m getOrder() {
        return this.f90081a.getOrder();
    }

    @Override // vw.h4
    public l3 getParameters() {
        return this.f90081a.getParameters();
    }

    @Override // vw.h4
    public w1 getPersist() {
        return this.f90081a.getPersist();
    }

    @Override // vw.h4
    public w1 getReplace() {
        return this.f90081a.getReplace();
    }

    @Override // vw.h4
    public w1 getResolve() {
        return this.f90081a.getResolve();
    }

    @Override // vw.h4
    public uw.s getRevision() {
        return this.f90081a.getRevision();
    }

    @Override // vw.h4
    public k4 getSection() {
        return this.f90081a.getSection();
    }

    @Override // vw.h4
    public o4 getSignature() {
        return this.f90081a.getSignature();
    }

    @Override // vw.h4
    public List<o4> getSignatures() {
        return this.f90081a.getSignatures();
    }

    @Override // vw.h4
    public i2 getText() {
        return this.f90081a.getText();
    }

    @Override // vw.h4
    public Class getType() {
        return this.f90081a.getType();
    }

    @Override // vw.h4
    public w1 getValidate() {
        return this.f90081a.getValidate();
    }

    @Override // vw.h4
    public i2 getVersion() {
        return this.f90081a.getVersion();
    }

    @Override // vw.h4
    public boolean isEmpty() {
        return this.f90081a.isEmpty();
    }

    @Override // vw.h4
    public boolean isPrimitive() {
        return this.f90081a.isPrimitive();
    }

    @Override // vw.h4, vw.r3
    public boolean isStrict() {
        return this.f90081a.isStrict();
    }
}
