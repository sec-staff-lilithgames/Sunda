package mc;

import j1.o2;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import jc.n0;
import mc.c0;
import nc.i0;
import rc.t0;
import tb.f1;
import tb.i1;
import tb.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends jc.q implements k, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final jc.o f74141b;

    /* renamed from: c, reason: collision with root package name */
    public final nc.w f74142c;

    /* renamed from: e, reason: collision with root package name */
    public final Map f74143e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Map f74144f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f74145g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f74146h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f74147i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f74148j;

    public a(g gVar, jc.d dVar, Map<String, z> map, Map<String, z> map2) {
        jc.o type = dVar.getType();
        this.f74141b = type;
        this.f74142c = gVar.getObjectIdReader();
        this.f74143e = map;
        this.f74144f = map2;
        Class<?> rawClass = type.getRawClass();
        this.f74145g = rawClass.isAssignableFrom(String.class);
        boolean z10 = true;
        this.f74146h = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this.f74147i = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z10 = false;
        }
        this.f74148j = z10;
    }

    public static a constructForNonPOJO(jc.d dVar) {
        return new a(dVar);
    }

    public final Object b(ub.u uVar, jc.k kVar) throws IOException {
        nc.w wVar = this.f74142c;
        Object objectReference = wVar.readObjectReference(uVar, kVar);
        i0 i0VarFindObjectId = kVar.findObjectId(objectReference, wVar.f75968e, wVar.f75969f);
        Object objResolve = i0VarFindObjectId.resolve();
        if (objResolve != null) {
            return objResolve;
        }
        throw new a0(uVar, o2.k(objectReference, "Could not resolve Object Id [", "] -- unresolved forward-reference?"), uVar.currentLocation(), i0VarFindObjectId);
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        rc.l member;
        t0 t0VarFindObjectIdInfo;
        f1 f1VarObjectIdGeneratorInstance;
        jc.o type;
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        Map map = this.f74144f;
        if (gVar == null || annotationIntrospector == null || (member = gVar.getMember()) == null || (t0VarFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) == null) {
            return map == null ? this : new a(this, this.f74142c);
        }
        j1 j1VarObjectIdResolverInstance = kVar.objectIdResolverInstance(member, t0VarFindObjectIdInfo);
        t0 t0VarFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, t0VarFindObjectIdInfo);
        Class<? extends f1> generatorType = t0VarFindObjectReferenceInfo.getGeneratorType();
        if (generatorType == i1.class) {
            n0 propertyName = t0VarFindObjectReferenceInfo.getPropertyName();
            zVar = map != null ? (z) map.get(propertyName.getSimpleName()) : null;
            if (zVar == null) {
                kVar.reportBadDefinition(this.f74141b, a.b.m("Invalid Object Id definition for ", dd.i.nameOf(handledType()), ": cannot find property with name ", dd.i.name(propertyName)));
            }
            type = zVar.getType();
            f1VarObjectIdGeneratorInstance = new nc.b0(t0VarFindObjectReferenceInfo.getScope());
        } else {
            j1VarObjectIdResolverInstance = kVar.objectIdResolverInstance(member, t0VarFindObjectReferenceInfo);
            jc.o oVar = kVar.getTypeFactory().findTypeParameters(kVar.constructType((Class<?>) generatorType), f1.class)[0];
            f1VarObjectIdGeneratorInstance = kVar.objectIdGeneratorInstance(member, t0VarFindObjectReferenceInfo);
            type = oVar;
        }
        return new a(this, nc.w.construct(type, t0VarFindObjectReferenceInfo.getPropertyName(), f1VarObjectIdGeneratorInstance, kVar.findRootValueDeserializer(type), zVar, j1VarObjectIdResolverInstance));
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        jc.o oVar = this.f74141b;
        return kVar.handleMissingInstantiator(oVar.getRawClass(), new c0.a(oVar), uVar, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    @Override // jc.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserializeWithType(ub.u r4, jc.k r5, wc.g r6) throws java.io.IOException {
        /*
            r3 = this;
            nc.w r0 = r3.f74142c
            if (r0 == 0) goto L36
            ub.z r1 = r4.currentToken()
            if (r1 == 0) goto L36
            boolean r2 = r1.isScalarValue()
            if (r2 == 0) goto L15
            java.lang.Object r4 = r3.b(r4, r5)
            return r4
        L15:
            ub.z r2 = ub.z.START_OBJECT
            if (r1 != r2) goto L1d
            ub.z r1 = r4.nextToken()
        L1d:
            ub.z r2 = ub.z.FIELD_NAME
            if (r1 != r2) goto L36
            boolean r1 = r0.maySerializeAsObject()
            if (r1 == 0) goto L36
            java.lang.String r1 = r4.currentName()
            boolean r0 = r0.isValidReferencePropertyName(r1, r4)
            if (r0 == 0) goto L36
            java.lang.Object r4 = r3.b(r4, r5)
            return r4
        L36:
            int r0 = r4.currentTokenId()
            boolean r1 = r3.f74146h
            switch(r0) {
                case 6: goto L64;
                case 7: goto L57;
                case 8: goto L4a;
                case 9: goto L45;
                case 10: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L6d
        L40:
            if (r1 == 0) goto L6d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L6e
        L45:
            if (r1 == 0) goto L6d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L6e
        L4a:
            boolean r0 = r3.f74148j
            if (r0 == 0) goto L6d
            double r0 = r4.getDoubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L6e
        L57:
            boolean r0 = r3.f74147i
            if (r0 == 0) goto L6d
            int r0 = r4.getIntValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L6e
        L64:
            boolean r0 = r3.f74145g
            if (r0 == 0) goto L6d
            java.lang.String r0 = r4.getText()
            goto L6e
        L6d:
            r0 = 0
        L6e:
            if (r0 == 0) goto L71
            return r0
        L71:
            java.lang.Object r4 = r6.deserializeTypedFromObject(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.a.deserializeWithType(ub.u, jc.k, wc.g):java.lang.Object");
    }

    @Override // jc.q
    public z findBackReference(String str) {
        Map map = this.f74143e;
        if (map == null) {
            return null;
        }
        return (z) map.get(str);
    }

    @Override // jc.q
    public nc.w getObjectIdReader() {
        return this.f74142c;
    }

    @Override // jc.q
    public Class<?> handledType() {
        return this.f74141b.getRawClass();
    }

    @Override // jc.q
    public boolean isCachable() {
        return true;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12142f;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return null;
    }

    @Deprecated
    public a(g gVar, jc.d dVar, Map<String, z> map) {
        this(gVar, dVar, map, null);
    }

    public a(jc.d dVar) {
        jc.o type = dVar.getType();
        this.f74141b = type;
        this.f74142c = null;
        this.f74143e = null;
        Class<?> rawClass = type.getRawClass();
        this.f74145g = rawClass.isAssignableFrom(String.class);
        boolean z10 = true;
        this.f74146h = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this.f74147i = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z10 = false;
        }
        this.f74148j = z10;
    }

    public a(a aVar, nc.w wVar) {
        this.f74141b = aVar.f74141b;
        this.f74143e = aVar.f74143e;
        this.f74145g = aVar.f74145g;
        this.f74146h = aVar.f74146h;
        this.f74147i = aVar.f74147i;
        this.f74148j = aVar.f74148j;
        this.f74142c = wVar;
        this.f74144f = null;
    }
}
