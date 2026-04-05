package oc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f1 extends j implements mc.k {

    /* renamed from: j, reason: collision with root package name */
    public final jc.q f78860j;

    /* renamed from: k, reason: collision with root package name */
    public final mc.c0 f78861k;

    /* renamed from: l, reason: collision with root package name */
    public final jc.q f78862l;

    public f1(jc.o oVar, jc.q qVar, mc.c0 c0Var) {
        this(oVar, c0Var, null, qVar, qVar, null);
    }

    public static Collection W(Object obj) {
        if (obj != null) {
            if (obj.getClass() == ArrayList.class) {
                return (ArrayList) obj;
            }
            if (obj.getClass() == HashSet.class) {
                return (HashSet) obj;
            }
        }
        return (Collection) obj;
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.q qVar;
        jc.q qVarHandleSecondaryContextualization;
        jc.q qVarFindContextualValueDeserializer;
        mc.c0 c0Var = this.f78861k;
        if (c0Var == null) {
            qVar = null;
        } else {
            if (c0Var.getArrayDelegateCreator() != null) {
                qVarFindContextualValueDeserializer = kVar.findContextualValueDeserializer(c0Var.getArrayDelegateType(kVar.getConfig()), gVar);
            } else {
                if (c0Var.getDelegateCreator() != null) {
                    qVarFindContextualValueDeserializer = kVar.findContextualValueDeserializer(c0Var.getDelegateType(kVar.getConfig()), gVar);
                }
                qVar = null;
            }
            qVar = qVarFindContextualValueDeserializer;
        }
        jc.o contentType = this.f78873f.getContentType();
        jc.q qVar2 = this.f78860j;
        if (qVar2 == null) {
            qVarHandleSecondaryContextualization = s0.Q(kVar, gVar, qVar2);
            if (qVarHandleSecondaryContextualization == null) {
                qVarHandleSecondaryContextualization = kVar.findContextualValueDeserializer(contentType, gVar);
            }
        } else {
            qVarHandleSecondaryContextualization = kVar.handleSecondaryContextualization(qVar2, gVar, contentType);
        }
        Boolean boolR = s0.R(kVar, gVar, Collection.class, tb.q.f86754b);
        mc.v vVarP = s0.P(kVar, gVar, qVarHandleSecondaryContextualization);
        jc.q qVar3 = dd.i.isJacksonStdImpl(qVarHandleSecondaryContextualization) ? null : qVarHandleSecondaryContextualization;
        return (Objects.equals(this.f78876i, boolR) && this.f78874g == vVarP && qVar2 == qVar3 && this.f78862l == qVar) ? this : new f1(this.f78873f, this.f78861k, qVar, qVar3, vVarP, boolR);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromArray(uVar, kVar);
    }

    @Override // oc.j
    public jc.q getContentDeserializer() {
        return this.f78860j;
    }

    @Override // oc.s0, mc.d0
    public mc.c0 getValueInstantiator() {
        return this.f78861k;
    }

    @Override // jc.q
    public boolean isCachable() {
        return this.f78860j == null && this.f78862l == null;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12140c;
    }

    public f1(jc.o oVar, mc.c0 c0Var, jc.q qVar, jc.q qVar2, mc.v vVar, Boolean bool) {
        super(oVar, vVar, bool);
        this.f78860j = qVar2;
        this.f78861k = c0Var;
        this.f78862l = qVar;
    }

    @Override // jc.q
    public Collection<String> deserialize(ub.u uVar, jc.k kVar) throws IOException {
        mc.c0 c0Var = this.f78861k;
        jc.q qVar = this.f78862l;
        if (qVar != null) {
            return W(c0Var.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar)));
        }
        return deserialize(uVar, kVar, W(c0Var.createUsingDefault(kVar)));
    }

    @Override // jc.q
    public Collection<String> deserialize(ub.u uVar, jc.k kVar, Collection<String> collection) throws IOException {
        String str;
        lc.c cVarFindCoercionFromBlankString;
        boolean zIsExpectedStartArrayToken = uVar.isExpectedStartArrayToken();
        String strK = null;
        jc.q qVar = this.f78860j;
        boolean z10 = this.f78875h;
        mc.v vVar = this.f78874g;
        if (!zIsExpectedStartArrayToken) {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = this.f78876i;
            if (bool2 != bool && (bool2 != null || !kVar.isEnabled(jc.l.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                if (uVar.hasToken(ub.z.VALUE_STRING)) {
                    return (Collection) p(uVar, kVar);
                }
                return W(kVar.handleUnexpectedToken(this.f78873f, uVar));
            }
            if (uVar.currentToken() != ub.z.VALUE_NULL) {
                if (uVar.hasToken(ub.z.VALUE_STRING)) {
                    String text = uVar.getText();
                    boolean zIsEmpty = text.isEmpty();
                    lc.c cVar = lc.c.f73085b;
                    if (zIsEmpty) {
                        lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73109h);
                        if (cVarFindCoercionAction != cVar) {
                            return W(o(kVar, cVarFindCoercionAction, handledType()));
                        }
                    } else if (s0.r(text) && (cVarFindCoercionFromBlankString = kVar.findCoercionFromBlankString(logicalType(), handledType(), cVar)) != cVar) {
                        return W(o(kVar, cVarFindCoercionFromBlankString, handledType()));
                    }
                }
                try {
                    strK = qVar == null ? K(uVar, kVar, vVar) : (String) qVar.deserialize(uVar, kVar);
                } catch (Exception e10) {
                    throw jc.r.wrapWithPath(e10, collection, collection.size());
                }
            } else if (!z10) {
            }
            if (strK != null || (strK = (String) vVar.getNullValue(kVar)) != null || !z10) {
                collection.add(strK);
                return collection;
            }
        } else if (qVar != null) {
            while (true) {
                try {
                    if (uVar.nextTextValue() == null) {
                        ub.z zVarCurrentToken = uVar.currentToken();
                        if (zVarCurrentToken == ub.z.END_ARRAY) {
                            break;
                        }
                        if (zVarCurrentToken != ub.z.VALUE_NULL) {
                            str = (String) qVar.deserialize(uVar, kVar);
                        } else if (!z10) {
                            str = null;
                        }
                    } else {
                        str = (String) qVar.deserialize(uVar, kVar);
                    }
                    if (str != null || (str = (String) vVar.getNullValue(kVar)) != null || !z10) {
                        collection.add(str);
                    }
                } catch (Exception e11) {
                    throw jc.r.wrapWithPath(e11, collection, collection.size());
                }
            }
        } else {
            while (true) {
                try {
                    String strNextTextValue = uVar.nextTextValue();
                    if (strNextTextValue != null) {
                        collection.add(strNextTextValue);
                    } else {
                        ub.z zVarCurrentToken2 = uVar.currentToken();
                        if (zVarCurrentToken2 == ub.z.END_ARRAY) {
                            break;
                        }
                        if (zVarCurrentToken2 != ub.z.VALUE_NULL) {
                            strNextTextValue = K(uVar, kVar, vVar);
                        } else if (z10) {
                        }
                        if (strNextTextValue != null || (strNextTextValue = (String) vVar.getNullValue(kVar)) != null || !z10) {
                            collection.add(strNextTextValue);
                        }
                    }
                } catch (Exception e12) {
                    throw jc.r.wrapWithPath(e12, collection, collection.size());
                }
            }
        }
        return collection;
    }
}
