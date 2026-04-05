package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p extends s0 implements mc.k {

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f78927f;

    /* renamed from: g, reason: collision with root package name */
    public final rc.m f78928g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.q f78929h;

    /* renamed from: i, reason: collision with root package name */
    public final mc.c0 f78930i;

    /* renamed from: j, reason: collision with root package name */
    public final mc.z[] f78931j;

    /* renamed from: k, reason: collision with root package name */
    public final Enum f78932k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f78933l;

    /* renamed from: m, reason: collision with root package name */
    public volatile transient nc.a0 f78934m;

    @Deprecated
    public p(Class<?> cls, rc.m mVar, jc.o oVar, mc.c0 c0Var, mc.z[] zVarArr) {
        this(cls, mVar, oVar, c0Var, zVarArr, null);
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.o oVar;
        return (this.f78929h == null && (oVar = this.f78927f) != null && this.f78931j == null) ? new p(this, kVar.findContextualValueDeserializer(oVar, gVar)) : this;
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        String valueAsString;
        Object objDeserialize;
        Enum r22;
        jc.q qVar = this.f78929h;
        if (qVar != null) {
            objDeserialize = qVar.deserialize(uVar, kVar);
        } else {
            if (!this.f78933l) {
                uVar.skipChildren();
                try {
                    return this.f78928g.call();
                } catch (Exception e10) {
                    return kVar.handleInstantiationProblem(this.f78945b, null, dd.i.throwRootCauseIfIOE(e10));
                }
            }
            if (this.f78931j != null) {
                if (uVar.isExpectedStartObjectToken()) {
                    nc.a0 a0VarConstruct = this.f78934m;
                    if (a0VarConstruct == null) {
                        a0VarConstruct = nc.a0.construct(kVar, this.f78930i, this.f78931j, kVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                        this.f78934m = a0VarConstruct;
                    }
                    uVar.nextToken();
                    nc.h0 h0VarStartBuilding = a0VarConstruct.startBuilding(uVar, kVar, null);
                    ub.z zVarCurrentToken = uVar.currentToken();
                    while (zVarCurrentToken == ub.z.FIELD_NAME) {
                        String strCurrentName = uVar.currentName();
                        uVar.nextToken();
                        mc.z zVarFindCreatorProperty = a0VarConstruct.findCreatorProperty(strCurrentName);
                        if (!h0VarStartBuilding.readIdProperty(strCurrentName) || zVarFindCreatorProperty != null) {
                            if (zVarFindCreatorProperty != null) {
                                try {
                                    h0VarStartBuilding.assignParameter(zVarFindCreatorProperty, zVarFindCreatorProperty.deserialize(uVar, kVar));
                                } catch (Exception e11) {
                                    Class<?> clsHandledType = handledType();
                                    String name = zVarFindCreatorProperty.getName();
                                    Throwable rootCause = dd.i.getRootCause(e11);
                                    dd.i.throwIfError(rootCause);
                                    if (kVar != null && !kVar.isEnabled(jc.l.WRAP_EXCEPTIONS)) {
                                        z = false;
                                    }
                                    if (rootCause instanceof IOException) {
                                        if (!z || !(rootCause instanceof ub.h)) {
                                            throw ((IOException) rootCause);
                                        }
                                    } else if (!z) {
                                        dd.i.throwIfRTE(rootCause);
                                    }
                                    throw jc.r.wrapWithPath(rootCause, clsHandledType, name);
                                }
                            } else {
                                uVar.skipChildren();
                            }
                        }
                        zVarCurrentToken = uVar.nextToken();
                    }
                    return a0VarConstruct.build(kVar, h0VarStartBuilding);
                }
                if (!this.f78930i.canCreateFromString()) {
                    jc.o valueType = getValueType(kVar);
                    ub.z zVarCurrentToken2 = uVar.currentToken();
                    return kVar.reportInputMismatch(valueType, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects Object Value, got %s (`JsonToken.%s`)", dd.i.getTypeDescription(valueType), this.f78928g, ub.z.valueDescFor(zVarCurrentToken2), zVarCurrentToken2.name());
                }
            }
            ub.z zVarCurrentToken3 = uVar.currentToken();
            z = zVarCurrentToken3 == ub.z.START_ARRAY && kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (z) {
                zVarCurrentToken3 = uVar.nextToken();
            }
            if (zVarCurrentToken3 == ub.z.START_OBJECT) {
                valueAsString = kVar.extractScalarFromObject(uVar, this, this.f78945b);
            } else {
                if (zVarCurrentToken3 == null || !zVarCurrentToken3.isScalarValue()) {
                    jc.o valueType2 = getValueType(kVar);
                    return kVar.reportInputMismatch(valueType2, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects String Value, got %s (`JsonToken.%s`)", dd.i.getTypeDescription(valueType2), this.f78928g, ub.z.valueDescFor(zVarCurrentToken3), zVarCurrentToken3.name());
                }
                valueAsString = uVar.getValueAsString();
            }
            if (z && uVar.nextToken() != ub.z.END_ARRAY) {
                T(kVar);
            }
            objDeserialize = valueAsString;
        }
        try {
            return this.f78928g.callOnWith(this.f78945b, objDeserialize);
        } catch (Exception e12) {
            Throwable thThrowRootCauseIfIOE = dd.i.throwRootCauseIfIOE(e12);
            if (thThrowRootCauseIfIOE instanceof IllegalArgumentException) {
                if (kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE) && (r22 = this.f78932k) != null) {
                    return r22;
                }
                if (kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return null;
                }
            }
            return kVar.handleInstantiationProblem(this.f78945b, objDeserialize, thThrowRootCauseIfIOE);
        }
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromAny(uVar, kVar);
    }

    @Override // oc.s0, mc.d0
    public mc.c0 getValueInstantiator() {
        return this.f78930i;
    }

    @Override // jc.q
    public boolean isCachable() {
        return true;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12147k;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.FALSE;
    }

    public p(Class<?> cls, rc.m mVar, jc.o oVar, mc.c0 c0Var, mc.z[] zVarArr, dd.n nVar) {
        super(cls);
        this.f78928g = mVar;
        this.f78933l = true;
        this.f78927f = (oVar.hasRawClass(String.class) || oVar.hasRawClass(CharSequence.class)) ? null : oVar;
        this.f78929h = null;
        this.f78930i = c0Var;
        this.f78931j = zVarArr;
        this.f78932k = nVar != null ? nVar.getDefaultValue() : null;
    }

    public p(Class<?> cls, rc.m mVar) {
        super(cls);
        this.f78928g = mVar;
        this.f78933l = false;
        this.f78927f = null;
        this.f78929h = null;
        this.f78930i = null;
        this.f78931j = null;
        this.f78932k = null;
    }

    public p(p pVar, jc.q qVar) {
        super(pVar.f78945b);
        this.f78927f = pVar.f78927f;
        this.f78928g = pVar.f78928g;
        this.f78933l = pVar.f78933l;
        this.f78930i = pVar.f78930i;
        this.f78931j = pVar.f78931j;
        this.f78932k = pVar.f78932k;
        this.f78929h = qVar;
    }
}
