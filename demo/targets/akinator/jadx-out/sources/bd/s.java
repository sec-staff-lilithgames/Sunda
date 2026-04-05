package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class s extends z0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final rc.l f9107e;

    /* renamed from: f, reason: collision with root package name */
    public final wc.j f9108f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.w f9109g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.g f9110h;

    /* renamed from: i, reason: collision with root package name */
    public final jc.o f9111i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9112j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f9113k;

    /* renamed from: l, reason: collision with root package name */
    public transient ad.t f9114l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends wc.j {

        /* renamed from: a, reason: collision with root package name */
        public final wc.j f9115a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f9116b;

        public a(wc.j jVar, Object obj) {
            this.f9115a = jVar;
            this.f9116b = obj;
        }

        @Override // wc.j
        public wc.j forProperty(jc.g gVar) {
            throw new UnsupportedOperationException();
        }

        @Override // wc.j
        public String getPropertyName() {
            return this.f9115a.getPropertyName();
        }

        @Override // wc.j
        public wc.h getTypeIdResolver() {
            return this.f9115a.getTypeIdResolver();
        }

        @Override // wc.j
        public tb.v0 getTypeInclusion() {
            return this.f9115a.getTypeInclusion();
        }

        @Override // wc.j
        @Deprecated
        public void writeCustomTypePrefixForArray(Object obj, ub.o oVar, String str) throws IOException {
            this.f9115a.writeCustomTypePrefixForArray(this.f9116b, oVar, str);
        }

        @Override // wc.j
        @Deprecated
        public void writeCustomTypePrefixForObject(Object obj, ub.o oVar, String str) throws IOException {
            this.f9115a.writeCustomTypePrefixForObject(this.f9116b, oVar, str);
        }

        @Override // wc.j
        @Deprecated
        public void writeCustomTypePrefixForScalar(Object obj, ub.o oVar, String str) throws IOException {
            this.f9115a.writeCustomTypePrefixForScalar(this.f9116b, oVar, str);
        }

        @Override // wc.j
        @Deprecated
        public void writeCustomTypeSuffixForArray(Object obj, ub.o oVar, String str) throws IOException {
            this.f9115a.writeCustomTypeSuffixForArray(this.f9116b, oVar, str);
        }

        @Override // wc.j
        @Deprecated
        public void writeCustomTypeSuffixForObject(Object obj, ub.o oVar, String str) throws IOException {
            this.f9115a.writeCustomTypeSuffixForObject(this.f9116b, oVar, str);
        }

        @Override // wc.j
        @Deprecated
        public void writeCustomTypeSuffixForScalar(Object obj, ub.o oVar, String str) throws IOException {
            this.f9115a.writeCustomTypeSuffixForScalar(this.f9116b, oVar, str);
        }

        @Override // wc.j
        public hc.c writeTypePrefix(ub.o oVar, hc.c cVar) throws IOException {
            cVar.f58727a = this.f9116b;
            return this.f9115a.writeTypePrefix(oVar, cVar);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypePrefixForArray(Object obj, ub.o oVar) throws IOException {
            this.f9115a.writeTypePrefixForArray(this.f9116b, oVar);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypePrefixForObject(Object obj, ub.o oVar) throws IOException {
            this.f9115a.writeTypePrefixForObject(this.f9116b, oVar);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypePrefixForScalar(Object obj, ub.o oVar) throws IOException {
            this.f9115a.writeTypePrefixForScalar(this.f9116b, oVar);
        }

        @Override // wc.j
        public hc.c writeTypeSuffix(ub.o oVar, hc.c cVar) throws IOException {
            return this.f9115a.writeTypeSuffix(oVar, cVar);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypeSuffixForArray(Object obj, ub.o oVar) throws IOException {
            this.f9115a.writeTypeSuffixForArray(this.f9116b, oVar);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypeSuffixForObject(Object obj, ub.o oVar) throws IOException {
            this.f9115a.writeTypeSuffixForObject(this.f9116b, oVar);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypeSuffixForScalar(Object obj, ub.o oVar) throws IOException {
            this.f9115a.writeTypeSuffixForScalar(this.f9116b, oVar);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypePrefixForArray(Object obj, ub.o oVar, Class<?> cls) throws IOException {
            this.f9115a.writeTypePrefixForArray(this.f9116b, oVar, cls);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypePrefixForObject(Object obj, ub.o oVar, Class<?> cls) throws IOException {
            this.f9115a.writeTypePrefixForObject(this.f9116b, oVar, cls);
        }

        @Override // wc.j
        @Deprecated
        public void writeTypePrefixForScalar(Object obj, ub.o oVar, Class<?> cls) throws IOException {
            this.f9115a.writeTypePrefixForScalar(this.f9116b, oVar, cls);
        }
    }

    public s(rc.l lVar, wc.j jVar, jc.w wVar, Set<String> set) {
        super(lVar.getType());
        this.f9107e = lVar;
        this.f9111i = lVar.getType();
        this.f9108f = jVar;
        this.f9109g = wVar;
        this.f9110h = null;
        this.f9112j = true;
        this.f9113k = set;
        this.f9114l = ad.t.emptyForProperties();
    }

    public static s construct(jc.s0 s0Var, rc.l lVar, wc.j jVar, jc.w wVar) {
        Set<String> setFindIgnoredForSerialization = s0Var.getAnnotationIntrospector().findPropertyIgnoralByName(s0Var, lVar).findIgnoredForSerialization();
        if (wVar != null && !setFindIgnoredForSerialization.isEmpty()) {
            wVar = wVar.withIgnoredProperties(setFindIgnoredForSerialization);
        }
        return new s(lVar, jVar, wVar, setFindIgnoredForSerialization);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        Class<?> declaringClass = this.f9107e.getDeclaringClass();
        if (declaringClass != null && dd.i.isEnumType(declaringClass)) {
            hVar.expectStringFormat(oVar);
            return;
        }
        jc.o oVar2 = this.f9111i;
        jc.w wVarFindTypedValueSerializer = this.f9109g;
        if (wVarFindTypedValueSerializer == null && (wVarFindTypedValueSerializer = hVar.getProvider().findTypedValueSerializer(oVar2, false, this.f9110h)) == null) {
            hVar.expectAnyFormat(oVar);
        } else {
            wVarFindTypedValueSerializer.acceptJsonFormatVisitor(hVar, oVar2);
        }
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        wc.j jVarForProperty = this.f9108f;
        if (jVarForProperty != null) {
            jVarForProperty = jVarForProperty.forProperty(gVar);
        }
        boolean z10 = this.f9112j;
        jc.w wVar = this.f9109g;
        if (wVar != null) {
            return f(gVar, jVarForProperty, u0Var.handlePrimaryContextualization(wVar, gVar), z10);
        }
        boolean zIsEnabled = u0Var.isEnabled(jc.y.USE_STATIC_TYPING);
        jc.o oVar = this.f9111i;
        if (!zIsEnabled && !oVar.isFinal()) {
            return gVar != this.f9110h ? f(gVar, jVarForProperty, wVar, z10) : this;
        }
        jc.w wVarFindPrimaryPropertySerializer = u0Var.findPrimaryPropertySerializer(oVar, gVar);
        if (wVarFindPrimaryPropertySerializer != null) {
            Set<String> set = this.f9113k;
            if (!set.isEmpty()) {
                wVarFindPrimaryPropertySerializer = wVarFindPrimaryPropertySerializer.withIgnoredProperties(set);
            }
        }
        Class<?> rawClass = oVar.getRawClass();
        boolean zIsJacksonStdImpl = false;
        if (!rawClass.isPrimitive() ? rawClass == String.class || rawClass == Integer.class || rawClass == Boolean.class || rawClass == Double.class : rawClass == Integer.TYPE || rawClass == Boolean.TYPE || rawClass == Double.TYPE) {
            zIsJacksonStdImpl = dd.i.isJacksonStdImpl(wVarFindPrimaryPropertySerializer);
        }
        return f(gVar, jVarForProperty, wVarFindPrimaryPropertySerializer, zIsJacksonStdImpl);
    }

    public final jc.w e(Class cls, jc.u0 u0Var) throws IllegalArgumentException, jc.r {
        jc.w wVarSerializerFor = this.f9114l.serializerFor(cls);
        if (wVarSerializerFor != null) {
            return wVarSerializerFor;
        }
        jc.o oVar = this.f9111i;
        boolean zHasGenericTypes = oVar.hasGenericTypes();
        Set<String> set = this.f9113k;
        jc.g gVar = this.f9110h;
        if (!zHasGenericTypes) {
            jc.w wVarFindPrimaryPropertySerializer = u0Var.findPrimaryPropertySerializer((Class<?>) cls, gVar);
            if (wVarFindPrimaryPropertySerializer != null && !set.isEmpty()) {
                wVarFindPrimaryPropertySerializer = wVarFindPrimaryPropertySerializer.withIgnoredProperties(set);
            }
            this.f9114l = this.f9114l.addSerializer((Class<?>) cls, wVarFindPrimaryPropertySerializer).f4292b;
            return wVarFindPrimaryPropertySerializer;
        }
        jc.o oVarConstructSpecializedType = u0Var.constructSpecializedType(oVar, cls);
        jc.w wVarFindPrimaryPropertySerializer2 = u0Var.findPrimaryPropertySerializer(oVarConstructSpecializedType, gVar);
        if (wVarFindPrimaryPropertySerializer2 != null && !set.isEmpty()) {
            wVarFindPrimaryPropertySerializer2 = wVarFindPrimaryPropertySerializer2.withIgnoredProperties(set);
        }
        this.f9114l = this.f9114l.addSerializer(oVarConstructSpecializedType, wVarFindPrimaryPropertySerializer2).f4292b;
        return wVarFindPrimaryPropertySerializer2;
    }

    public final s f(jc.g gVar, wc.j jVar, jc.w wVar, boolean z10) {
        return (this.f9110h == gVar && this.f9108f == jVar && this.f9109g == wVar && z10 == this.f9112j) ? this : new s(this, gVar, jVar, wVar, z10);
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) throws jc.r {
        uc.e eVar = this.f9109g;
        return eVar instanceof vc.c ? ((vc.c) eVar).getSchema(u0Var, null) : vc.a.getDefaultSchemaNode();
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Object obj) throws UnsupportedOperationException, IllegalArgumentException {
        Object value = this.f9107e.getValue(obj);
        if (value == null) {
            return true;
        }
        jc.w wVarE = this.f9109g;
        if (wVarE == null) {
            try {
                wVarE = e(value.getClass(), u0Var);
            } catch (jc.r e10) {
                throw new jc.q0(e10);
            }
        }
        return wVarE.isEmpty(u0Var, value);
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException, IllegalArgumentException {
        Object value;
        rc.l lVar = this.f9107e;
        try {
            value = lVar.getValue(obj);
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, obj, lVar.getName() + "()");
            value = null;
        }
        if (value == null) {
            u0Var.defaultSerializeNull(oVar);
            return;
        }
        jc.w wVarE = this.f9109g;
        if (wVarE == null) {
            wVarE = e(value.getClass(), u0Var);
        }
        wc.j jVar = this.f9108f;
        if (jVar != null) {
            wVarE.serializeWithType(value, oVar, u0Var, jVar);
        } else {
            wVarE.serialize(value, oVar, u0Var);
        }
    }

    @Override // jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException, IllegalArgumentException {
        Object value;
        rc.l lVar = this.f9107e;
        try {
            value = lVar.getValue(obj);
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, obj, lVar.getName() + "()");
            value = null;
        }
        if (value == null) {
            u0Var.defaultSerializeNull(oVar);
            return;
        }
        jc.w wVarE = this.f9109g;
        if (wVarE == null) {
            wVarE = e(value.getClass(), u0Var);
        } else if (this.f9112j) {
            hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(obj, ub.z.VALUE_STRING));
            wVarE.serialize(value, oVar, u0Var);
            jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
            return;
        }
        wVarE.serializeWithType(value, oVar, u0Var, new a(jVar, obj));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(@JsonValue serializer for method ");
        rc.l lVar = this.f9107e;
        sb2.append(lVar.getDeclaringClass());
        sb2.append("#");
        sb2.append(lVar.getName());
        sb2.append(")");
        return sb2.toString();
    }

    @Deprecated
    public s(rc.l lVar, wc.j jVar, jc.w wVar) {
        this(lVar, jVar, wVar, Collections.EMPTY_SET);
    }

    @Deprecated
    public s(rc.l lVar, jc.w wVar) {
        this(lVar, null, wVar, Collections.EMPTY_SET);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(s sVar, jc.g gVar, wc.j jVar, jc.w wVar, boolean z10) {
        Class clsHandledType = sVar.handledType();
        super(clsHandledType == null ? Object.class : clsHandledType);
        this.f9107e = sVar.f9107e;
        this.f9111i = sVar.f9111i;
        this.f9108f = jVar;
        this.f9109g = wVar;
        this.f9110h = gVar;
        this.f9112j = z10;
        this.f9113k = sVar.f9113k;
        this.f9114l = ad.t.emptyForProperties();
    }
}
