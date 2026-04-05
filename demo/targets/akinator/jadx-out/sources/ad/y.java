package ad;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y implements zc.c, zc.o {
    public static y filterOutAll() {
        return w.f4307c;
    }

    public static y filterOutAllExcept(Set<String> set) {
        return new w(set);
    }

    public static zc.o from(zc.c cVar) {
        return new v(cVar);
    }

    public static y serializeAll() {
        return x.f4309c;
    }

    public static y serializeAllExcept(Set<String> set) {
        return new x(set);
    }

    public abstract boolean a(zc.d dVar);

    public abstract boolean b(zc.p pVar);

    @Override // zc.c
    @Deprecated
    public void depositSchemaProperty(zc.d dVar, yc.v vVar, u0 u0Var) throws jc.r {
        if (a(dVar)) {
            dVar.depositSchemaProperty(vVar, u0Var);
        }
    }

    @Override // zc.o
    public void serializeAsElement(Object obj, ub.o oVar, u0 u0Var, zc.p pVar) throws Exception {
        pVar.serializeAsElement(obj, oVar, u0Var);
    }

    @Override // zc.c
    @Deprecated
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var, zc.d dVar) throws Exception {
        if (a(dVar)) {
            dVar.serializeAsField(obj, oVar, u0Var);
        } else {
            if (oVar.canOmitFields()) {
                return;
            }
            dVar.serializeAsOmittedField(obj, oVar, u0Var);
        }
    }

    public static y filterOutAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new w(hashSet);
    }

    @Deprecated
    public static y serializeAll(Set<String> set) {
        return new w(set);
    }

    public static y serializeAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new x(hashSet);
    }

    @Override // zc.c
    @Deprecated
    public void depositSchemaProperty(zc.d dVar, uc.m mVar, u0 u0Var) throws jc.r {
        if (a(dVar)) {
            dVar.depositSchemaProperty(mVar, u0Var);
        }
    }

    @Override // zc.o
    @Deprecated
    public void depositSchemaProperty(zc.p pVar, yc.v vVar, u0 u0Var) throws jc.r {
        if (b(pVar)) {
            pVar.depositSchemaProperty(vVar, u0Var);
        }
    }

    @Override // zc.o
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var, zc.p pVar) throws Exception {
        if (b(pVar)) {
            pVar.serializeAsField(obj, oVar, u0Var);
        } else if (!oVar.canOmitFields()) {
            pVar.serializeAsOmittedField(obj, oVar, u0Var);
        } else if (pVar instanceof zc.a) {
            ((zc.a) pVar).getAndFilter(obj, oVar, u0Var, this);
        }
    }

    @Override // zc.o
    public void depositSchemaProperty(zc.p pVar, uc.m mVar, u0 u0Var) throws jc.r {
        if (b(pVar)) {
            pVar.depositSchemaProperty(mVar, u0Var);
        }
    }
}
