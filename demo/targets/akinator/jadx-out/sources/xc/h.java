package xc;

import dd.k0;
import java.io.IOException;
import jc.y;
import tb.v0;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends a {

    /* renamed from: k, reason: collision with root package name */
    public final v0 f91902k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f91903l;

    /* renamed from: m, reason: collision with root package name */
    public final String f91904m;

    @Deprecated
    public h(jc.o oVar, wc.h hVar, String str, boolean z10, jc.o oVar2) {
        this(oVar, hVar, str, z10, oVar2, v0.f86787b);
    }

    @Override // xc.a, wc.g
    public Object deserializeTypedFromAny(ub.u uVar, jc.k kVar) throws IOException {
        return uVar.hasToken(z.START_ARRAY) ? super.deserializeTypedFromArray(uVar, kVar) : deserializeTypedFromObject(uVar, kVar);
    }

    @Override // xc.a, wc.g
    public Object deserializeTypedFromObject(ub.u uVar, jc.k kVar) throws IOException {
        String valueAsString;
        Object typeId;
        if (uVar.canReadTypeId() && (typeId = uVar.getTypeId()) != null) {
            return a(uVar, kVar, typeId);
        }
        z zVarCurrentToken = uVar.currentToken();
        z zVar = z.START_OBJECT;
        String str = this.f91904m;
        k0 k0VarBufferForInputBuffering = null;
        if (zVarCurrentToken == zVar) {
            zVarCurrentToken = uVar.nextToken();
        } else if (zVarCurrentToken != z.FIELD_NAME) {
            return f(uVar, kVar, null, str);
        }
        boolean zIsEnabled = kVar.isEnabled(y.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (zVarCurrentToken == z.FIELD_NAME) {
            String strCurrentName = uVar.currentName();
            uVar.nextToken();
            String str2 = this.f91929g;
            if ((strCurrentName.equals(str2) || (zIsEnabled && strCurrentName.equalsIgnoreCase(str2))) && (valueAsString = uVar.getValueAsString()) != null) {
                return e(uVar, kVar, k0VarBufferForInputBuffering, valueAsString);
            }
            if (k0VarBufferForInputBuffering == null) {
                k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
            }
            k0VarBufferForInputBuffering.writeFieldName(strCurrentName);
            k0VarBufferForInputBuffering.copyCurrentStructure(uVar);
            zVarCurrentToken = uVar.nextToken();
        }
        return f(uVar, kVar, k0VarBufferForInputBuffering, str);
    }

    public final Object e(ub.u uVar, jc.k kVar, k0 k0Var, String str) throws IOException {
        jc.q qVarC = c(str, kVar);
        if (this.f91930h) {
            if (k0Var == null) {
                k0Var = kVar.bufferForInputBuffering(uVar);
            }
            k0Var.writeFieldName(uVar.currentName());
            k0Var.writeString(str);
        }
        if (k0Var != null) {
            uVar.clearCurrentToken();
            uVar = ic.o.createFlattened(false, k0Var.asParser(uVar), uVar);
        }
        if (uVar.currentToken() != z.END_OBJECT) {
            uVar.nextToken();
        }
        return qVarC.deserialize(uVar, kVar);
    }

    public final Object f(ub.u uVar, jc.k kVar, k0 k0Var, String str) throws IOException {
        boolean zHasDefaultImpl = hasDefaultImpl();
        jc.o oVarHandleMissingTypeId = this.f91926c;
        if (!zHasDefaultImpl) {
            Object objDeserializeIfNatural = wc.g.deserializeIfNatural(uVar, kVar, oVarHandleMissingTypeId);
            if (objDeserializeIfNatural != null) {
                return objDeserializeIfNatural;
            }
            if (uVar.isExpectedStartArrayToken()) {
                return super.deserializeTypedFromAny(uVar, kVar);
            }
            if (uVar.hasToken(z.VALUE_STRING) && kVar.isEnabled(jc.l.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && uVar.getText().trim().isEmpty()) {
                return null;
            }
        }
        jc.q qVarB = b(kVar);
        if (qVarB == null) {
            if (this.f91903l) {
                oVarHandleMissingTypeId = kVar.handleMissingTypeId(oVarHandleMissingTypeId, this.f91925b, str);
            }
            if (oVarHandleMissingTypeId == null) {
                return null;
            }
            qVarB = kVar.findContextualValueDeserializer(oVarHandleMissingTypeId, this.f91927e);
        }
        if (k0Var != null) {
            k0Var.writeEndObject();
            uVar = k0Var.asParser(uVar);
            uVar.nextToken();
        }
        return qVarB.deserialize(uVar, kVar);
    }

    @Override // xc.a, xc.s, wc.g
    public wc.g forProperty(jc.g gVar) {
        return gVar == this.f91927e ? this : new h(this, gVar);
    }

    @Override // xc.a, xc.s, wc.g
    public v0 getTypeInclusion() {
        return this.f91902k;
    }

    @Deprecated
    public h(jc.o oVar, wc.h hVar, String str, boolean z10, jc.o oVar2, v0 v0Var) {
        this(oVar, hVar, str, z10, oVar2, v0Var, true);
    }

    public h(h hVar, jc.g gVar) {
        String strL;
        super(hVar, gVar);
        jc.g gVar2 = this.f91927e;
        if (gVar2 == null) {
            strL = a.b.l("missing type id property '", this.f91929g, "'");
        } else {
            strL = e3.g.l("missing type id property '", this.f91929g, "' (for POJO property '", gVar2.getName(), "')");
        }
        this.f91904m = strL;
        this.f91902k = hVar.f91902k;
        this.f91903l = hVar.f91903l;
    }

    public h(jc.o oVar, wc.h hVar, String str, boolean z10, jc.o oVar2, v0 v0Var, boolean z11) {
        String strL;
        super(oVar, hVar, str, z10, oVar2);
        jc.g gVar = this.f91927e;
        if (gVar == null) {
            strL = a.b.l("missing type id property '", this.f91929g, "'");
        } else {
            strL = e3.g.l("missing type id property '", this.f91929g, "' (for POJO property '", gVar.getName(), "')");
        }
        this.f91904m = strL;
        this.f91902k = v0Var;
        this.f91903l = z11;
    }
}
