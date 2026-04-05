package vw;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c extends s1 {
    public c(l0 l0Var, xw.f fVar) {
        super(l0Var, fVar, null);
    }

    public a2 getInstance(yw.p pVar) throws Exception {
        yw.k0 position = pVar.getPosition();
        xw.g gVarA = a(pVar);
        xw.f fVar = this.f90086d;
        if (gVarA == null) {
            throw new y0("Array length required for %s at %s", fVar, position);
        }
        Class type = gVarA.getType();
        Class type2 = getType();
        if (!type2.isArray()) {
            throw new c2("The %s not an array for %s", type2, fVar);
        }
        Class<?> componentType = type2.getComponentType();
        if (componentType.isAssignableFrom(type)) {
            return new d(gVarA);
        }
        throw new c2("Array of type %s cannot hold %s for %s", componentType, type, fVar);
    }

    @Override // vw.s1
    public Object getInstance() throws Exception {
        Class type = getType();
        if (type.isArray()) {
            Class<?> componentType = type.getComponentType();
            if (componentType != null) {
                return Array.newInstance(componentType, 0);
            }
            return null;
        }
        throw new c2("The %s not an array for %s", type, this.f90086d);
    }
}
