package oc;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 extends j implements mc.k {

    /* renamed from: j, reason: collision with root package name */
    public final jc.x f78796j;

    /* renamed from: k, reason: collision with root package name */
    public final jc.q f78797k;

    /* renamed from: l, reason: collision with root package name */
    public final wc.g f78798l;

    public b0(jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar) {
        super(oVar, (mc.v) null, (Boolean) null);
        if (oVar.containedTypeCount() != 2) {
            throw new IllegalArgumentException("Missing generic type information for " + oVar);
        }
        this.f78796j = xVar;
        this.f78797k = qVar;
        this.f78798l = gVar;
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.o oVar = this.f78873f;
        jc.x xVar = this.f78796j;
        jc.x xVarFindKeyDeserializer = xVar == null ? kVar.findKeyDeserializer(oVar.containedType(0), gVar) : xVar;
        jc.q qVar = this.f78797k;
        jc.q qVarQ = s0.Q(kVar, gVar, qVar);
        jc.o oVarContainedType = oVar.containedType(1);
        jc.q qVarFindContextualValueDeserializer = qVarQ == null ? kVar.findContextualValueDeserializer(oVarContainedType, gVar) : kVar.handleSecondaryContextualization(qVarQ, gVar, oVarContainedType);
        wc.g gVar2 = this.f78798l;
        wc.g gVarForProperty = gVar2 != null ? gVar2.forProperty(gVar) : gVar2;
        return (xVar == xVarFindKeyDeserializer && qVar == qVarFindContextualValueDeserializer && gVar2 == gVarForProperty) ? this : new b0(this, xVarFindKeyDeserializer, qVarFindContextualValueDeserializer, gVarForProperty);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromObject(uVar, kVar);
    }

    @Override // oc.j
    public jc.q getContentDeserializer() {
        return this.f78797k;
    }

    @Override // oc.j
    public jc.o getContentType() {
        return this.f78873f.containedType(1);
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12141e;
    }

    @Override // jc.q
    public Map.Entry<Object, Object> deserialize(ub.u uVar, jc.k kVar) throws IOException {
        Object objDeserializeWithType;
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == ub.z.START_OBJECT) {
            zVarCurrentToken = uVar.nextToken();
        } else if (zVarCurrentToken != ub.z.FIELD_NAME && zVarCurrentToken != ub.z.END_OBJECT) {
            if (zVarCurrentToken == ub.z.START_ARRAY) {
                return (Map.Entry) n(uVar, kVar);
            }
            return (Map.Entry) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
        }
        ub.z zVar = ub.z.FIELD_NAME;
        if (zVarCurrentToken != zVar) {
            if (zVarCurrentToken == ub.z.END_OBJECT) {
                return (Map.Entry) kVar.reportInputMismatch(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            }
            return (Map.Entry) kVar.handleUnexpectedToken(handledType(), uVar);
        }
        String strCurrentName = uVar.currentName();
        Object objDeserializeKey = this.f78796j.deserializeKey(strCurrentName, kVar);
        ub.z zVarNextToken = uVar.nextToken();
        try {
            ub.z zVar2 = ub.z.VALUE_NULL;
            jc.q qVar = this.f78797k;
            if (zVarNextToken == zVar2) {
                objDeserializeWithType = qVar.getNullValue(kVar);
            } else {
                wc.g gVar = this.f78798l;
                if (gVar == null) {
                    objDeserializeWithType = qVar.deserialize(uVar, kVar);
                } else {
                    objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
                }
            }
            ub.z zVarNextToken2 = uVar.nextToken();
            if (zVarNextToken2 == ub.z.END_OBJECT) {
                return new AbstractMap.SimpleEntry(objDeserializeKey, objDeserializeWithType);
            }
            if (zVarNextToken2 == zVar) {
                kVar.reportInputMismatch(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", uVar.currentName());
                return null;
            }
            kVar.reportInputMismatch(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + zVarNextToken2, new Object[0]);
            return null;
        } catch (Exception e10) {
            j.V(kVar, e10, Map.Entry.class, strCurrentName);
            throw null;
        }
    }

    public b0(b0 b0Var, jc.x xVar, jc.q qVar, wc.g gVar) {
        super(b0Var, b0Var.f78874g, b0Var.f78876i);
        this.f78796j = xVar;
        this.f78797k = qVar;
        this.f78798l = gVar;
    }

    @Override // jc.q
    public Map.Entry<Object, Object> deserialize(ub.u uVar, jc.k kVar, Map.Entry<Object, Object> entry) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }
}
