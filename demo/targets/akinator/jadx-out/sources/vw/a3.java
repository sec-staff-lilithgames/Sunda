package vw;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a3 extends LinkedHashMap implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final t0 f89684b;

    public a3(t0 t0Var) {
        this.f89684b = t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a3 getModels() throws Exception {
        t0 t0Var = this.f89684b;
        a3 a3Var = new a3(t0Var);
        for (K k10 : keySet()) {
            z2 z2VarBuild = (z2) get(k10);
            if (z2VarBuild != null) {
                z2VarBuild = z2VarBuild.build();
            }
            if (a3Var.containsKey(k10)) {
                throw new m3("Path with name '%s' is a duplicate in %s ", k10, t0Var);
            }
            a3Var.put(k10, z2VarBuild);
        }
        return a3Var;
    }

    @Override // java.lang.Iterable
    public Iterator<z2> iterator() {
        return values().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x2 lookup(String str, int i10) {
        z2 z2Var = (z2) get(str);
        if (z2Var != null) {
            return z2Var.lookup(i10);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void register(String str, x2 x2Var) {
        z2 z2Var = (z2) get(str);
        if (z2Var == null) {
            z2Var = new z2();
            put(str, z2Var);
        }
        z2Var.register(x2Var);
    }
}
