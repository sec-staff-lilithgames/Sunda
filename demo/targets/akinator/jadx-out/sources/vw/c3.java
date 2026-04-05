package vw;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c3 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f89724a = new ArrayList();

    public void add(uw.k kVar) {
        this.f89724a.add(kVar);
    }

    @Override // vw.q0
    public void decorate(yw.h0 h0Var) {
        decorate(h0Var, null);
    }

    public void set(uw.k kVar) {
        if (kVar != null) {
            add(kVar);
        }
    }

    @Override // vw.q0
    public void decorate(yw.h0 h0Var, q0 q0Var) {
        if (q0Var != null) {
            q0Var.decorate(h0Var);
        }
        yw.u namespaces = h0Var.getNamespaces();
        Iterator it = this.f89724a.iterator();
        while (it.hasNext()) {
            uw.k kVar = (uw.k) it.next();
            namespaces.setReference(kVar.reference(), kVar.prefix());
        }
    }
}
