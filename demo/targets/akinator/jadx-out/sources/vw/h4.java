package vw;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface h4 extends r3 {
    j getCaller(l0 l0Var);

    w1 getCommit();

    w1 getComplete();

    q0 getDecorator();

    d2 getInstantiator();

    String getName();

    uw.m getOrder();

    l3 getParameters();

    w1 getPersist();

    w1 getReplace();

    w1 getResolve();

    uw.s getRevision();

    k4 getSection();

    o4 getSignature();

    List<o4> getSignatures();

    i2 getText();

    Class getType();

    w1 getValidate();

    i2 getVersion();

    boolean isEmpty();

    boolean isPrimitive();

    @Override // vw.r3
    boolean isStrict();
}
