package vw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o extends s1 {
    public o(l0 l0Var, xw.f fVar) {
        super(l0Var, fVar, null);
    }

    public Class getConversion(Class cls) throws Exception {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return ArrayList.class;
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return HashSet.class;
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return TreeSet.class;
        }
        throw new c2("Cannot instantiate %s for %s", cls, this.f90086d);
    }

    @Override // vw.s1
    public Object getInstance() throws Exception {
        Class type = getType();
        Class conversion = !s1.isInstantiable(type) ? getConversion(type) : type;
        if (Collection.class.isAssignableFrom(conversion)) {
            return conversion.newInstance();
        }
        throw new c2("Invalid collection %s for %s", type, this.f90086d);
    }

    public a2 getInstance(yw.p pVar) throws Exception {
        xw.g gVarA = a(pVar);
        Class type = getType();
        if (gVarA != null) {
            return getInstance(gVarA);
        }
        if (!s1.isInstantiable(type)) {
            type = getConversion(type);
        }
        if (Collection.class.isAssignableFrom(type)) {
            return this.f90083a.getInstance(type);
        }
        throw new c2("Invalid collection %s for %s", type, this.f90086d);
    }

    public a2 getInstance(xw.g gVar) throws Exception {
        Class type = gVar.getType();
        if (!s1.isInstantiable(type)) {
            type = getConversion(type);
        }
        if (Collection.class.isAssignableFrom(type)) {
            return new m0(this.f90083a, gVar, type);
        }
        throw new c2("Invalid collection %s for %s", type, this.f90086d);
    }
}
