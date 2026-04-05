package oc;

import j1.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import nc.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i extends j implements mc.k {

    /* renamed from: j, reason: collision with root package name */
    public final jc.q f78866j;

    /* renamed from: k, reason: collision with root package name */
    public final wc.g f78867k;

    /* renamed from: l, reason: collision with root package name */
    public final mc.c0 f78868l;

    /* renamed from: m, reason: collision with root package name */
    public final jc.q f78869m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f78870a;

        /* renamed from: b, reason: collision with root package name */
        public final Collection f78871b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f78872c = new ArrayList();

        public a(Class<?> cls, Collection<Object> collection) {
            this.f78870a = cls;
            this.f78871b = collection;
        }

        public void add(Object obj) {
            ArrayList arrayList = this.f78872c;
            if (arrayList.isEmpty()) {
                this.f78871b.add(obj);
            } else {
                ((h) o2.e(1, arrayList)).f78865d.add(obj);
            }
        }

        public i0.a handleUnresolvedReference(mc.a0 a0Var) {
            h hVar = new h(this, a0Var, this.f78870a);
            this.f78872c.add(hVar);
            return hVar;
        }

        public void resolveForwardReference(Object obj, Object obj2) throws IOException {
            Iterator it = this.f78872c.iterator();
            Collection collection = this.f78871b;
            while (it.hasNext()) {
                h hVar = (h) it.next();
                boolean zHasId = hVar.hasId(obj);
                ArrayList arrayList = hVar.f78865d;
                if (zHasId) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(arrayList);
                    return;
                }
                collection = arrayList;
            }
            throw new IllegalArgumentException(o2.k(obj, "Trying to resolve a forward reference with id [", "] that wasn't previously seen as unresolved."));
        }
    }

    public i(jc.o oVar, jc.q qVar, wc.g gVar, mc.c0 c0Var) {
        this(oVar, qVar, gVar, c0Var, null, null, null);
    }

    public Collection W(ub.u uVar, jc.k kVar, Collection collection) throws IOException {
        Object objDeserialize;
        Object objDeserialize2;
        uVar.assignCurrentValue(collection);
        jc.q qVar = this.f78866j;
        nc.w objectIdReader = qVar.getObjectIdReader();
        wc.g gVar = this.f78867k;
        mc.v vVar = this.f78874g;
        boolean z10 = this.f78875h;
        if (objectIdReader == null) {
            while (true) {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    break;
                }
                try {
                    if (zVarNextToken != ub.z.VALUE_NULL) {
                        objDeserialize = gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar);
                    } else if (!z10) {
                        objDeserialize = null;
                    }
                    if (objDeserialize == null && (objDeserialize = vVar.getNullValue(kVar)) == null) {
                        X(uVar, kVar, collection);
                    } else {
                        collection.add(objDeserialize);
                    }
                } catch (Exception e10) {
                    if (kVar != null && !kVar.isEnabled(jc.l.WRAP_EXCEPTIONS)) {
                        dd.i.throwIfRTE(e10);
                    }
                    throw jc.r.wrapWithPath(e10, collection, collection.size());
                }
            }
        } else {
            if (!uVar.isExpectedStartArrayToken()) {
                return Z(uVar, kVar, collection);
            }
            uVar.assignCurrentValue(collection);
            a aVar = new a(this.f78873f.getContentType().getRawClass(), collection);
            while (true) {
                ub.z zVarNextToken2 = uVar.nextToken();
                if (zVarNextToken2 == ub.z.END_ARRAY) {
                    break;
                }
                try {
                } catch (mc.a0 e11) {
                    e11.getRoid().appendReferring(aVar.handleUnresolvedReference(e11));
                } catch (Exception e12) {
                    if (kVar != null && !kVar.isEnabled(jc.l.WRAP_EXCEPTIONS)) {
                        dd.i.throwIfRTE(e12);
                    }
                    throw jc.r.wrapWithPath(e12, collection, collection.size());
                }
                if (zVarNextToken2 != ub.z.VALUE_NULL) {
                    objDeserialize2 = gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar);
                } else if (!z10) {
                    objDeserialize2 = null;
                }
                if (objDeserialize2 != null || (objDeserialize2 = vVar.getNullValue(kVar)) != null || !z10) {
                    aVar.add(objDeserialize2);
                }
            }
        }
        return collection;
    }

    public final void X(ub.u uVar, jc.k kVar, Collection collection) throws IOException {
        if (this.f78875h) {
            return;
        }
        try {
            collection.add(null);
        } catch (NullPointerException unused) {
            kVar.handleUnexpectedToken(this.f78946c, ub.z.VALUE_NULL, uVar, "`java.util.Collection` of type %s does not accept `null` values", dd.i.getTypeDescription(getValueType(kVar)));
        }
    }

    public Collection Y(jc.k kVar) {
        return (Collection) this.f78868l.createUsingDefault(kVar);
    }

    public final Collection Z(ub.u uVar, jc.k kVar, Collection collection) throws jc.r {
        Object objDeserialize;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f78876i;
        if (bool2 != bool && (bool2 != null || !kVar.isEnabled(jc.l.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) kVar.handleUnexpectedToken(this.f78873f, uVar);
        }
        try {
            if (!uVar.hasToken(ub.z.VALUE_NULL)) {
                jc.q qVar = this.f78866j;
                wc.g gVar = this.f78867k;
                objDeserialize = gVar == null ? qVar.deserialize(uVar, kVar) : qVar.deserializeWithType(uVar, kVar, gVar);
            } else {
                if (this.f78875h) {
                    return collection;
                }
                objDeserialize = null;
            }
            if (objDeserialize == null && (objDeserialize = this.f78874g.getNullValue(kVar)) == null) {
                X(uVar, kVar, collection);
                return collection;
            }
            collection.add(objDeserialize);
            return collection;
        } catch (Exception e10) {
            if (!kVar.isEnabled(jc.l.WRAP_EXCEPTIONS)) {
                dd.i.throwIfRTE(e10);
            }
            throw jc.r.wrapWithPath(e10, Object.class, collection.size());
        }
    }

    public i a0(jc.q qVar, jc.q qVar2, wc.g gVar, mc.v vVar, Boolean bool) {
        return new i(this.f78873f, qVar2, gVar, this.f78868l, qVar, vVar, bool);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromArray(uVar, kVar);
    }

    @Override // oc.j
    public jc.q getContentDeserializer() {
        return this.f78866j;
    }

    @Override // oc.s0, mc.d0
    public mc.c0 getValueInstantiator() {
        return this.f78868l;
    }

    @Override // jc.q
    public boolean isCachable() {
        return this.f78866j == null && this.f78867k == null && this.f78869m == null;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12140c;
    }

    public i(jc.o oVar, jc.q qVar, wc.g gVar, mc.c0 c0Var, jc.q qVar2, mc.v vVar, Boolean bool) {
        super(oVar, vVar, bool);
        this.f78866j = qVar;
        this.f78867k = gVar;
        this.f78868l = c0Var;
        this.f78869m = qVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // mc.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oc.i createContextual(jc.k r9, jc.g r10) throws jc.r {
        /*
            r8 = this;
            jc.o r0 = r8.f78873f
            mc.c0 r1 = r8.f78868l
            if (r1 == 0) goto L5b
            boolean r2 = r1.canCreateUsingDelegate()
            if (r2 == 0) goto L31
            jc.j r2 = r9.getConfig()
            jc.o r2 = r1.getDelegateType(r2)
            if (r2 != 0) goto L2b
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r3 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r9.reportBadDefinition(r0, r1)
        L2b:
            jc.q r1 = r9.findContextualValueDeserializer(r2, r10)
        L2f:
            r3 = r1
            goto L5d
        L31:
            boolean r2 = r1.canCreateUsingArrayDelegate()
            if (r2 == 0) goto L5b
            jc.j r2 = r9.getConfig()
            jc.o r2 = r1.getArrayDelegateType(r2)
            if (r2 != 0) goto L56
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r3 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r9.reportBadDefinition(r0, r1)
        L56:
            jc.q r1 = r9.findContextualValueDeserializer(r2, r10)
            goto L2f
        L5b:
            r1 = 0
            goto L2f
        L5d:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            tb.q r2 = tb.q.f86754b
            java.lang.Boolean r7 = oc.s0.R(r9, r10, r1, r2)
            jc.q r1 = r8.f78866j
            jc.q r2 = oc.s0.Q(r9, r10, r1)
            jc.o r0 = r0.getContentType()
            if (r2 != 0) goto L77
            jc.q r0 = r9.findContextualValueDeserializer(r0, r10)
        L75:
            r4 = r0
            goto L7c
        L77:
            jc.q r0 = r9.handleSecondaryContextualization(r2, r10, r0)
            goto L75
        L7c:
            wc.g r0 = r8.f78867k
            if (r0 == 0) goto L86
            wc.g r2 = r0.forProperty(r10)
            r5 = r2
            goto L87
        L86:
            r5 = r0
        L87:
            mc.v r6 = oc.s0.P(r9, r10, r4)
            java.lang.Boolean r9 = r8.f78876i
            boolean r9 = java.util.Objects.equals(r7, r9)
            if (r9 == 0) goto L9f
            mc.v r9 = r8.f78874g
            if (r6 != r9) goto L9f
            jc.q r9 = r8.f78869m
            if (r3 != r9) goto L9f
            if (r4 != r1) goto L9f
            if (r5 == r0) goto La1
        L9f:
            r2 = r8
            goto La2
        La1:
            return r8
        La2:
            oc.i r9 = r2.a0(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.i.createContextual(jc.k, jc.g):oc.i");
    }

    @Override // jc.q
    public Collection<Object> deserialize(ub.u uVar, jc.k kVar) throws IOException {
        lc.c cVarFindCoercionFromBlankString;
        jc.q qVar = this.f78869m;
        if (qVar != null) {
            return (Collection) this.f78868l.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar));
        }
        if (uVar.isExpectedStartArrayToken()) {
            return W(uVar, kVar, Y(kVar));
        }
        if (uVar.hasToken(ub.z.VALUE_STRING)) {
            String text = uVar.getText();
            Class<?> clsHandledType = handledType();
            boolean zIsEmpty = text.isEmpty();
            lc.c cVar = lc.c.f73085b;
            if (zIsEmpty) {
                lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), clsHandledType, lc.f.f73109h);
                if (cVarFindCoercionAction != null && cVarFindCoercionAction != cVar) {
                    return (Collection) o(kVar, cVarFindCoercionAction, clsHandledType);
                }
            } else if (s0.r(text) && (cVarFindCoercionFromBlankString = kVar.findCoercionFromBlankString(logicalType(), clsHandledType, cVar)) != cVar) {
                return (Collection) o(kVar, cVarFindCoercionFromBlankString, clsHandledType);
            }
            return Z(uVar, kVar, Y(kVar));
        }
        return Z(uVar, kVar, Y(kVar));
    }

    @Override // jc.q
    public Collection<Object> deserialize(ub.u uVar, jc.k kVar, Collection<Object> collection) throws IOException {
        if (uVar.isExpectedStartArrayToken()) {
            return W(uVar, kVar, collection);
        }
        return Z(uVar, kVar, collection);
    }
}
