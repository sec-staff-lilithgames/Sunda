package ad;

import java.io.Serializable;
import java.util.Map;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f0 extends zc.d implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public final dd.a0 f4262v;

    public f0(zc.d dVar, dd.a0 a0Var) {
        super(dVar);
        this.f4262v = a0Var;
    }

    @Override // zc.d
    public final void a(yc.v vVar, jc.t tVar) {
        jc.t tVar2 = tVar.get("properties");
        if (tVar2 != null) {
            for (Map.Entry<String, jc.t> entry : tVar2.properties()) {
                String key = entry.getKey();
                dd.a0 a0Var = this.f4262v;
                if (a0Var != null) {
                    key = a0Var.transform(key);
                }
                vVar.set(key, entry.getValue());
            }
        }
    }

    @Override // zc.d
    public void assignSerializer(jc.w wVar) {
        if (wVar != null) {
            boolean zIsUnwrappingSerializer = wVar.isUnwrappingSerializer();
            dd.a0 a0VarChainedTransformer = this.f4262v;
            if (zIsUnwrappingSerializer && (wVar instanceof g0)) {
                a0VarChainedTransformer = dd.a0.chainedTransformer(a0VarChainedTransformer, ((g0) wVar).f4263m);
            }
            wVar = wVar.unwrappingSerializer(a0VarChainedTransformer);
        }
        super.assignSerializer(wVar);
    }

    @Override // zc.d
    public final jc.w b(t tVar, Class cls, u0 u0Var) {
        jc.o oVar = this.f97763i;
        jc.w wVarFindValueSerializer = oVar != null ? u0Var.findValueSerializer(u0Var.constructSpecializedType(oVar, cls), this) : u0Var.findValueSerializer((Class<?>) cls, this);
        boolean zIsUnwrappingSerializer = wVarFindValueSerializer.isUnwrappingSerializer();
        dd.a0 a0VarChainedTransformer = this.f4262v;
        if (zIsUnwrappingSerializer && (wVarFindValueSerializer instanceof g0)) {
            a0VarChainedTransformer = dd.a0.chainedTransformer(a0VarChainedTransformer, ((g0) wVarFindValueSerializer).f4263m);
        }
        jc.w wVarUnwrappingSerializer = wVarFindValueSerializer.unwrappingSerializer(a0VarChainedTransformer);
        this.f97771q = this.f97771q.newWith(cls, wVarUnwrappingSerializer);
        return wVarUnwrappingSerializer;
    }

    @Override // zc.d, zc.p, rc.h0, jc.g
    public void depositSchemaProperty(uc.m mVar, u0 u0Var) throws jc.r {
        jc.w wVarUnwrappingSerializer = u0Var.findValueSerializer(getType(), this).unwrappingSerializer(this.f4262v);
        if (wVarUnwrappingSerializer.isUnwrappingSerializer()) {
            wVarUnwrappingSerializer.acceptJsonFormatVisitor(new e0(u0Var), getType());
        } else {
            super.depositSchemaProperty(mVar, u0Var);
        }
    }

    @Override // zc.d
    public boolean isUnwrapping() {
        return true;
    }

    @Override // zc.d, zc.p
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        Object obj2 = get(obj);
        if (obj2 == null) {
            return;
        }
        jc.w wVarB = this.f97768n;
        if (wVarB == null) {
            Class<?> cls = obj2.getClass();
            t tVar = this.f97771q;
            jc.w wVarSerializerFor = tVar.serializerFor(cls);
            wVarB = wVarSerializerFor == null ? b(tVar, cls, u0Var) : wVarSerializerFor;
        }
        Object obj3 = this.f97773s;
        if (obj3 != null) {
            if (tb.c0.f86696e == obj3) {
                if (wVarB.isEmpty(u0Var, obj2)) {
                    return;
                }
            } else if (obj3.equals(obj2)) {
                return;
            }
        }
        if (obj2 == obj && c(oVar, u0Var, wVarB)) {
            return;
        }
        if (!wVarB.isUnwrappingSerializer()) {
            oVar.writeFieldName(this.f97759e);
        }
        wc.j jVar = this.f97770p;
        if (jVar == null) {
            wVarB.serialize(obj2, oVar, u0Var);
        } else {
            wVarB.serializeWithType(obj2, oVar, u0Var, jVar);
        }
    }

    @Override // zc.d
    public f0 rename(dd.a0 a0Var) {
        return new f0(this, dd.a0.chainedTransformer(a0Var, this.f4262v), new cc.q(a0Var.transform(this.f97759e.getValue())));
    }

    public f0(f0 f0Var, dd.a0 a0Var, cc.q qVar) {
        super(f0Var, qVar);
        this.f4262v = a0Var;
    }
}
