package jc;

import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c0 implements ub.q0 {
    public Iterable<? extends c0> getDependencies() {
        return Collections.EMPTY_LIST;
    }

    public abstract String getModuleName();

    public Object getTypeId() {
        return getClass().getName();
    }

    public abstract void setupModule(b0 b0Var);

    @Override // ub.q0
    public abstract ub.p0 version();
}
