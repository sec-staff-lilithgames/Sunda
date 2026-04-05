package zc;

import jc.u0;
import jc.w;
import lc.z;
import rc.d0;
import tb.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u extends d {
    @Override // rc.h0, jc.g
    public boolean isVirtual() {
        return true;
    }

    @Override // zc.d, zc.p
    public void serializeAsElement(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        Object attribute = u0Var.getAttribute(((ad.a) this).f4250v);
        if (attribute == null) {
            w wVar = this.f97769o;
            if (wVar != null) {
                wVar.serialize(null, oVar, u0Var);
                return;
            } else {
                oVar.writeNull();
                return;
            }
        }
        w wVarB = this.f97768n;
        if (wVarB == null) {
            Class<?> cls = attribute.getClass();
            ad.t tVar = this.f97771q;
            w wVarSerializerFor = tVar.serializerFor(cls);
            wVarB = wVarSerializerFor == null ? b(tVar, cls, u0Var) : wVarSerializerFor;
        }
        Object obj2 = this.f97773s;
        if (obj2 != null) {
            if (c0.f86696e == obj2) {
                if (wVarB.isEmpty(u0Var, attribute)) {
                    serializeAsPlaceholder(obj, oVar, u0Var);
                    return;
                }
            } else if (obj2.equals(attribute)) {
                serializeAsPlaceholder(obj, oVar, u0Var);
                return;
            }
        }
        if (attribute == obj && c(oVar, u0Var, wVarB)) {
            return;
        }
        wc.j jVar = this.f97770p;
        if (jVar == null) {
            wVarB.serialize(attribute, oVar, u0Var);
        } else {
            wVarB.serializeWithType(attribute, oVar, u0Var, jVar);
        }
    }

    @Override // zc.d, zc.p
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        Object attribute = u0Var.getAttribute(((ad.a) this).f4250v);
        cc.q qVar = this.f97759e;
        if (attribute == null) {
            if (this.f97769o != null) {
                oVar.writeFieldName(qVar);
                this.f97769o.serialize(null, oVar, u0Var);
                return;
            }
            return;
        }
        w wVarB = this.f97768n;
        if (wVarB == null) {
            Class<?> cls = attribute.getClass();
            ad.t tVar = this.f97771q;
            w wVarSerializerFor = tVar.serializerFor(cls);
            wVarB = wVarSerializerFor == null ? b(tVar, cls, u0Var) : wVarSerializerFor;
        }
        Object obj2 = this.f97773s;
        if (obj2 != null) {
            if (c0.f86696e == obj2) {
                if (wVarB.isEmpty(u0Var, attribute)) {
                    return;
                }
            } else if (obj2.equals(attribute)) {
                return;
            }
        }
        if (attribute == obj && c(oVar, u0Var, wVarB)) {
            return;
        }
        oVar.writeFieldName(qVar);
        wc.j jVar = this.f97770p;
        if (jVar == null) {
            wVarB.serialize(attribute, oVar, u0Var);
        } else {
            wVarB.serializeWithType(attribute, oVar, u0Var, jVar);
        }
    }

    public abstract u withConfig(z zVar, rc.e eVar, d0 d0Var, jc.o oVar);
}
