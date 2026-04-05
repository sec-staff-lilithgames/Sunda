package oc;

import java.io.IOException;
import java.util.EnumMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends j implements mc.k, mc.w {

    /* renamed from: j, reason: collision with root package name */
    public final Class f78909j;

    /* renamed from: k, reason: collision with root package name */
    public final jc.x f78910k;

    /* renamed from: l, reason: collision with root package name */
    public final jc.q f78911l;

    /* renamed from: m, reason: collision with root package name */
    public final wc.g f78912m;

    /* renamed from: n, reason: collision with root package name */
    public final mc.c0 f78913n;

    /* renamed from: o, reason: collision with root package name */
    public jc.q f78914o;

    /* renamed from: p, reason: collision with root package name */
    public nc.a0 f78915p;

    public n(jc.o oVar, mc.c0 c0Var, jc.x xVar, jc.q qVar, wc.g gVar, mc.v vVar) {
        super(oVar, vVar, (Boolean) null);
        this.f78909j = oVar.getKeyType().getRawClass();
        this.f78910k = xVar;
        this.f78911l = qVar;
        this.f78912m = gVar;
        this.f78913n = c0Var;
    }

    public final EnumMap W(jc.k kVar) {
        mc.c0 c0Var = this.f78913n;
        if (c0Var == null) {
            return new EnumMap(this.f78909j);
        }
        try {
            try {
                return !c0Var.canCreateUsingDefault() ? (EnumMap) kVar.handleMissingInstantiator(handledType(), getValueInstantiator(), null, "no default constructor found", new Object[0]) : (EnumMap) c0Var.createUsingDefault(kVar);
            } catch (IOException e10) {
                e = e10;
                return (EnumMap) dd.i.throwAsMappingException(kVar, e);
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public EnumMap<?, ?> _deserializeUsingProperties(ub.u uVar, jc.k kVar) throws IOException {
        Object objDeserialize;
        nc.a0 a0Var = this.f78915p;
        nc.h0 h0VarStartBuilding = a0Var.startBuilding(uVar, kVar, null);
        String strNextFieldName = uVar.isExpectedStartObjectToken() ? uVar.nextFieldName() : uVar.hasToken(ub.z.FIELD_NAME) ? uVar.currentName() : null;
        while (true) {
            jc.o oVar = this.f78873f;
            if (strNextFieldName == null) {
                try {
                    return (EnumMap) a0Var.build(kVar, h0VarStartBuilding);
                } catch (Exception e10) {
                    j.V(kVar, e10, oVar.getRawClass(), strNextFieldName);
                    throw null;
                }
            }
            ub.z zVarNextToken = uVar.nextToken();
            mc.z zVarFindCreatorProperty = a0Var.findCreatorProperty(strNextFieldName);
            if (zVarFindCreatorProperty == null) {
                Enum r62 = (Enum) this.f78910k.deserializeKey(strNextFieldName, kVar);
                if (r62 != null) {
                    try {
                        ub.z zVar = ub.z.VALUE_NULL;
                        boolean z10 = this.f78875h;
                        if (zVarNextToken != zVar) {
                            jc.q qVar = this.f78911l;
                            wc.g gVar = this.f78912m;
                            objDeserialize = gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar);
                        } else if (!z10) {
                            objDeserialize = null;
                        }
                        if (objDeserialize != null || (objDeserialize = this.f78874g.getNullValue(kVar)) != null || !z10) {
                            h0VarStartBuilding.bufferMapProperty(r62, objDeserialize);
                        }
                    } catch (Exception e11) {
                        j.V(kVar, e11, oVar.getRawClass(), strNextFieldName);
                        throw null;
                    }
                } else {
                    if (!kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) kVar.handleWeirdStringValue(this.f78909j, strNextFieldName, "value not one of declared Enum instance names for %s", oVar.getKeyType());
                    }
                    uVar.nextToken();
                    uVar.skipChildren();
                }
            } else if (h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, zVarFindCreatorProperty.deserialize(uVar, kVar))) {
                uVar.nextToken();
                try {
                    return deserialize(uVar, kVar, (EnumMap) a0Var.build(kVar, h0VarStartBuilding));
                } catch (Exception e12) {
                    j.V(kVar, e12, oVar.getRawClass(), strNextFieldName);
                    throw null;
                }
            }
            strNextFieldName = uVar.nextFieldName();
        }
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.o oVar = this.f78873f;
        jc.x xVarFindKeyDeserializer = this.f78910k;
        if (xVarFindKeyDeserializer == null) {
            xVarFindKeyDeserializer = kVar.findKeyDeserializer(oVar.getKeyType(), gVar);
        }
        jc.o contentType = oVar.getContentType();
        jc.q qVar = this.f78911l;
        jc.q qVarFindContextualValueDeserializer = qVar == null ? kVar.findContextualValueDeserializer(contentType, gVar) : kVar.handleSecondaryContextualization(qVar, gVar, contentType);
        wc.g gVarForProperty = this.f78912m;
        if (gVarForProperty != null) {
            gVarForProperty = gVarForProperty.forProperty(gVar);
        }
        return withResolved(xVarFindKeyDeserializer, qVarFindContextualValueDeserializer, gVarForProperty, s0.P(kVar, gVar, qVarFindContextualValueDeserializer));
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromObject(uVar, kVar);
    }

    @Override // oc.j
    public jc.q getContentDeserializer() {
        return this.f78911l;
    }

    @Override // oc.j, jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return W(kVar);
    }

    @Override // oc.s0, mc.d0
    public mc.c0 getValueInstantiator() {
        return this.f78913n;
    }

    @Override // jc.q
    public boolean isCachable() {
        return this.f78911l == null && this.f78910k == null && this.f78912m == null;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12141e;
    }

    @Override // mc.w
    public void resolve(jc.k kVar) throws jc.r {
        mc.c0 c0Var = this.f78913n;
        if (c0Var != null) {
            boolean zCanCreateUsingDelegate = c0Var.canCreateUsingDelegate();
            jc.o oVar = this.f78873f;
            if (zCanCreateUsingDelegate) {
                jc.o delegateType = c0Var.getDelegateType(kVar.getConfig());
                if (delegateType == null) {
                    kVar.reportBadDefinition(oVar, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", oVar, c0Var.getClass().getName()));
                }
                this.f78914o = kVar.findContextualValueDeserializer(delegateType, null);
                return;
            }
            if (!c0Var.canCreateUsingArrayDelegate()) {
                if (c0Var.canCreateFromObjectWith()) {
                    this.f78915p = nc.a0.construct(kVar, c0Var, c0Var.getFromObjectArguments(kVar.getConfig()), kVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
            } else {
                jc.o arrayDelegateType = c0Var.getArrayDelegateType(kVar.getConfig());
                if (arrayDelegateType == null) {
                    kVar.reportBadDefinition(oVar, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", oVar, c0Var.getClass().getName()));
                }
                this.f78914o = kVar.findContextualValueDeserializer(arrayDelegateType, null);
            }
        }
    }

    public n withResolved(jc.x xVar, jc.q qVar, wc.g gVar, mc.v vVar) {
        return (xVar == this.f78910k && vVar == this.f78874g && qVar == this.f78911l && gVar == this.f78912m) ? this : new n(this, xVar, qVar, gVar, vVar);
    }

    @Override // jc.q
    public EnumMap<?, ?> deserialize(ub.u uVar, jc.k kVar) throws IOException {
        if (this.f78915p != null) {
            return _deserializeUsingProperties(uVar, kVar);
        }
        jc.q qVar = this.f78914o;
        if (qVar != null) {
            return (EnumMap) this.f78913n.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar));
        }
        int iCurrentTokenId = uVar.currentTokenId();
        if (iCurrentTokenId != 1 && iCurrentTokenId != 2) {
            if (iCurrentTokenId == 3) {
                return (EnumMap) n(uVar, kVar);
            }
            if (iCurrentTokenId != 5) {
                if (iCurrentTokenId != 6) {
                    return (EnumMap) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                }
                return (EnumMap) p(uVar, kVar);
            }
        }
        return deserialize(uVar, kVar, W(kVar));
    }

    public n(n nVar, jc.x xVar, jc.q qVar, wc.g gVar, mc.v vVar) {
        super(nVar, vVar, nVar.f78876i);
        this.f78909j = nVar.f78909j;
        this.f78910k = xVar;
        this.f78911l = qVar;
        this.f78912m = gVar;
        this.f78913n = nVar.f78913n;
        this.f78914o = nVar.f78914o;
        this.f78915p = nVar.f78915p;
    }

    @Override // jc.q
    public EnumMap<?, ?> deserialize(ub.u uVar, jc.k kVar, EnumMap enumMap) throws IOException {
        String strCurrentName;
        Object objDeserializeWithType;
        uVar.assignCurrentValue(enumMap);
        if (uVar.isExpectedStartObjectToken()) {
            strCurrentName = uVar.nextFieldName();
        } else {
            ub.z zVarCurrentToken = uVar.currentToken();
            ub.z zVar = ub.z.FIELD_NAME;
            if (zVarCurrentToken != zVar) {
                if (zVarCurrentToken != ub.z.END_OBJECT) {
                    kVar.reportWrongTokenException(this, zVar, (String) null, new Object[0]);
                }
                return enumMap;
            }
            strCurrentName = uVar.currentName();
        }
        while (strCurrentName != null) {
            Enum r22 = (Enum) this.f78910k.deserializeKey(strCurrentName, kVar);
            ub.z zVarNextToken = uVar.nextToken();
            if (r22 == null) {
                if (!kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) kVar.handleWeirdStringValue(this.f78909j, strCurrentName, "value not one of declared Enum instance names for %s", this.f78873f.getKeyType());
                }
                uVar.skipChildren();
            } else {
                try {
                    ub.z zVar2 = ub.z.VALUE_NULL;
                    boolean z10 = this.f78875h;
                    if (zVarNextToken != zVar2) {
                        jc.q qVar = this.f78911l;
                        wc.g gVar = this.f78912m;
                        if (gVar == null) {
                            objDeserializeWithType = qVar.deserialize(uVar, kVar);
                        } else {
                            objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
                        }
                    } else if (!z10) {
                        objDeserializeWithType = null;
                    }
                    if (objDeserializeWithType != null || (objDeserializeWithType = this.f78874g.getNullValue(kVar)) != null || !z10) {
                        enumMap.put((EnumMap) r22, (Enum) objDeserializeWithType);
                    }
                } catch (Exception e10) {
                    j.V(kVar, e10, enumMap, strCurrentName);
                    throw null;
                }
            }
            strCurrentName = uVar.nextFieldName();
        }
        return enumMap;
    }

    @Deprecated
    public n(jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar) {
        this(oVar, null, xVar, qVar, gVar, null);
    }
}
