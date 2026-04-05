package vw;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f89862a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final l3 f89863b = new l3();

    /* renamed from: c, reason: collision with root package name */
    public final o4 f89864c;

    /* renamed from: d, reason: collision with root package name */
    public final v4 f89865d;

    public h0(t0 t0Var, v4 v4Var) throws Exception {
        this.f89865d = v4Var;
        Constructor[] constructors = t0Var.getConstructors();
        if (!t0Var.isInstantiable()) {
            throw new g0("Can not construct inner %s", t0Var);
        }
        for (Constructor constructor : constructors) {
            if (!t0Var.isPrimitive()) {
                r4 r4Var = new r4(constructor, this.f89863b, this.f89865d);
                if (r4Var.isValid()) {
                    for (o4 o4Var : r4Var.getSignatures()) {
                        if (o4Var.size() == 0) {
                            this.f89864c = o4Var;
                        }
                        this.f89862a.add(o4Var);
                    }
                }
            }
        }
    }

    public l3 getParameters() {
        return this.f89863b;
    }

    public o4 getSignature() {
        return this.f89864c;
    }

    public List<o4> getSignatures() {
        return new ArrayList(this.f89862a);
    }
}
