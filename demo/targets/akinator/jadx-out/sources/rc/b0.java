package rc;

import b0.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 extends jc.d {

    /* renamed from: j, reason: collision with root package name */
    public static final Class[] f84125j = new Class[0];

    /* renamed from: b, reason: collision with root package name */
    public final u0 f84126b;

    /* renamed from: c, reason: collision with root package name */
    public final lc.z f84127c;

    /* renamed from: d, reason: collision with root package name */
    public final jc.c f84128d;

    /* renamed from: e, reason: collision with root package name */
    public final e f84129e;

    /* renamed from: f, reason: collision with root package name */
    public Class[] f84130f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84131g;

    /* renamed from: h, reason: collision with root package name */
    public List f84132h;

    /* renamed from: i, reason: collision with root package name */
    public final t0 f84133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lc.z zVar, jc.o oVar, e eVar) {
        super(oVar);
        List list = Collections.EMPTY_LIST;
        this.f84126b = null;
        this.f84127c = zVar;
        if (zVar == null) {
            this.f84128d = null;
        } else {
            this.f84128d = zVar.getAnnotationIntrospector();
        }
        this.f84129e = eVar;
        this.f84132h = list;
    }

    public static b0 forDeserialization(u0 u0Var) {
        return new b0(u0Var);
    }

    public static b0 forOtherUse(lc.z zVar, jc.o oVar, e eVar) {
        List list = Collections.EMPTY_LIST;
        return new b0(zVar, oVar, eVar);
    }

    public static b0 forSerialization(u0 u0Var) {
        return new b0(u0Var);
    }

    public final dd.m a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof dd.m) {
            return (dd.m) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class<?> cls = (Class) obj;
        if (cls == dd.l.class || dd.i.isBogusClass(cls)) {
            return null;
        }
        if (!dd.m.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(e2.k(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        lc.z zVar = this.f84127c;
        lc.v handlerInstantiator = zVar.getHandlerInstantiator();
        dd.m mVarConverterInstance = handlerInstantiator != null ? handlerInstantiator.converterInstance(zVar, this.f84129e, cls) : null;
        return mVarConverterInstance == null ? (dd.m) dd.i.createInstance(cls, zVar.canOverrideAccessModifiers()) : mVarConverterInstance;
    }

    public boolean addProperty(d0 d0Var) {
        if (hasProperty(d0Var.getFullName())) {
            return false;
        }
        b().add(d0Var);
        return true;
    }

    public final List b() {
        if (this.f84132h == null) {
            this.f84132h = this.f84126b.getProperties();
        }
        return this.f84132h;
    }

    @Override // jc.d
    public l findAnyGetter() throws IllegalArgumentException {
        u0 u0Var = this.f84126b;
        if (u0Var == null) {
            return null;
        }
        l anyGetterMethod = u0Var.getAnyGetterMethod();
        if (anyGetterMethod != null) {
            if (Map.class.isAssignableFrom(anyGetterMethod.getRawType())) {
                return anyGetterMethod;
            }
            throw new IllegalArgumentException(a.b.l("Invalid 'any-getter' annotation on method ", anyGetterMethod.getName(), "(): return type is not instance of java.util.Map"));
        }
        l anyGetterField = u0Var.getAnyGetterField();
        if (anyGetterField == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(anyGetterField.getRawType())) {
            return anyGetterField;
        }
        throw new IllegalArgumentException(a.b.l("Invalid 'any-getter' annotation on field '", anyGetterField.getName(), "': type is not instance of java.util.Map"));
    }

    @Override // jc.d
    public l findAnySetterAccessor() throws IllegalArgumentException {
        u0 u0Var = this.f84126b;
        if (u0Var == null) {
            return null;
        }
        m anySetterMethod = u0Var.getAnySetterMethod();
        if (anySetterMethod != null) {
            Class<?> rawParameterType = anySetterMethod.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return anySetterMethod;
            }
            throw new IllegalArgumentException(a.b.m("Invalid 'any-setter' annotation on method '", anySetterMethod.getName(), "()': first argument not of type String or Object, but ", rawParameterType.getName()));
        }
        l anySetterField = u0Var.getAnySetterField();
        if (anySetterField == null) {
            return null;
        }
        Class<?> rawType = anySetterField.getRawType();
        if (Map.class.isAssignableFrom(rawType) || jc.t.class.isAssignableFrom(rawType)) {
            return anySetterField;
        }
        throw new IllegalArgumentException(a.b.l("Invalid 'any-setter' annotation on field '", anySetterField.getName(), "': type is not instance of `java.util.Map` or `JsonNode`"));
    }

    @Override // jc.d
    public List<d0> findBackReferences() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (d0 d0Var : b()) {
            c.a aVarFindReferenceType = d0Var.findReferenceType();
            if (aVarFindReferenceType != null && aVarFindReferenceType.isBackReference()) {
                String name = aVarFindReferenceType.getName();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(name);
                } else if (!hashSet.add(name)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + dd.i.name(name));
                }
                arrayList.add(d0Var);
            }
        }
        return arrayList;
    }

    @Override // jc.d
    public String findClassDescription() {
        jc.c cVar = this.f84128d;
        if (cVar == null) {
            return null;
        }
        return cVar.findClassDescription(this.f84129e);
    }

    @Override // jc.d
    public g findDefaultConstructor() {
        return this.f84129e.getDefaultConstructor();
    }

    @Override // jc.d
    public Class<?>[] findDefaultViews() {
        if (!this.f84131g) {
            this.f84131g = true;
            jc.c cVar = this.f84128d;
            Class<?>[] clsArrFindViews = cVar == null ? null : cVar.findViews(this.f84129e);
            if (clsArrFindViews == null && !this.f84127c.isEnabled(jc.y.DEFAULT_VIEW_INCLUSION)) {
                clsArrFindViews = f84125j;
            }
            this.f84130f = clsArrFindViews;
        }
        return this.f84130f;
    }

    @Override // jc.d
    public dd.m findDeserializationConverter() {
        jc.c cVar = this.f84128d;
        if (cVar == null) {
            return null;
        }
        return a(cVar.findDeserializationConverter(this.f84129e));
    }

    @Override // jc.d
    public tb.t findExpectedFormat() {
        u0 u0Var = this.f84126b;
        return u0Var == null ? tb.t.empty() : u0Var.getFormatOverrides();
    }

    @Override // jc.d
    public Map<Object, l> findInjectables() {
        u0 u0Var = this.f84126b;
        return u0Var != null ? u0Var.getInjectables() : Collections.EMPTY_MAP;
    }

    @Override // jc.d
    public l findJsonKeyAccessor() {
        u0 u0Var = this.f84126b;
        if (u0Var == null) {
            return null;
        }
        return u0Var.getJsonKeyAccessor();
    }

    @Override // jc.d
    public l findJsonValueAccessor() {
        u0 u0Var = this.f84126b;
        if (u0Var == null) {
            return null;
        }
        return u0Var.getJsonValueAccessor();
    }

    @Override // jc.d
    public m findMethod(String str, Class<?>[] clsArr) {
        return this.f84129e.findMethod(str, clsArr);
    }

    @Override // jc.d
    public Class<?> findPOJOBuilder() {
        jc.c cVar = this.f84128d;
        if (cVar == null) {
            return null;
        }
        return cVar.findPOJOBuilder(this.f84129e);
    }

    @Override // jc.d
    public kc.h findPOJOBuilderConfig() {
        jc.c cVar = this.f84128d;
        if (cVar == null) {
            return null;
        }
        return cVar.findPOJOBuilderConfig(this.f84129e);
    }

    @Override // jc.d
    public List<d0> findProperties() {
        return b();
    }

    public d0 findProperty(jc.n0 n0Var) {
        for (d0 d0Var : b()) {
            if (d0Var.hasName(n0Var)) {
                return d0Var;
            }
        }
        return null;
    }

    @Override // jc.d
    public tb.d0 findPropertyInclusion(tb.d0 d0Var) {
        tb.d0 d0VarFindPropertyInclusion;
        jc.c cVar = this.f84128d;
        return (cVar == null || (d0VarFindPropertyInclusion = cVar.findPropertyInclusion(this.f84129e)) == null) ? d0Var : d0Var == null ? d0VarFindPropertyInclusion : d0Var.withOverrides(d0VarFindPropertyInclusion);
    }

    @Override // jc.d
    public dd.m findSerializationConverter() {
        jc.c cVar = this.f84128d;
        if (cVar == null) {
            return null;
        }
        return a(cVar.findSerializationConverter(this.f84129e));
    }

    @Override // jc.d
    public dd.b getClassAnnotations() {
        return this.f84129e.getAnnotations();
    }

    @Override // jc.d
    public e getClassInfo() {
        return this.f84129e;
    }

    @Override // jc.d
    public List<g> getConstructors() {
        return this.f84129e.getConstructors();
    }

    @Override // jc.d
    public List<c> getConstructorsWithMode() {
        List<g> constructors = this.f84129e.getConstructors();
        if (constructors.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (g gVar : constructors) {
            tb.m mVarFindCreatorAnnotation = this.f84128d.findCreatorAnnotation(this.f84127c, gVar);
            if (mVarFindCreatorAnnotation != tb.m.f86751f) {
                arrayList.add(c.of(gVar, mVarFindCreatorAnnotation));
            }
        }
        return arrayList;
    }

    @Override // jc.d
    public List<m> getFactoryMethods() {
        Class<?> rawParameterType;
        List<m> factoryMethods = this.f84129e.getFactoryMethods();
        if (factoryMethods.isEmpty()) {
            return factoryMethods;
        }
        ArrayList arrayList = null;
        for (m mVar : factoryMethods) {
            if (getBeanClass().isAssignableFrom(mVar.getRawReturnType())) {
                tb.m mVarFindCreatorAnnotation = this.f84128d.findCreatorAnnotation(this.f84127c, mVar);
                if (mVarFindCreatorAnnotation == null || mVarFindCreatorAnnotation == tb.m.f86751f) {
                    String name = mVar.getName();
                    if ((!"valueOf".equals(name) || mVar.getParameterCount() != 1) && (!"fromString".equals(name) || mVar.getParameterCount() != 1 || ((rawParameterType = mVar.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType)))) {
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(mVar);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @Override // jc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<rc.c> getFactoryMethodsWithMode() {
        /*
            r8 = this;
            rc.e r0 = r8.f84129e
            java.util.List r0 = r0.getFactoryMethods()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        Lf:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L15:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r0.next()
            rc.m r3 = (rc.m) r3
            java.lang.Class r4 = r3.getRawReturnType()
            java.lang.Class r5 = r8.getBeanClass()
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 != 0) goto L31
        L2f:
            r3 = r1
            goto L80
        L31:
            jc.c r4 = r8.f84128d
            lc.z r5 = r8.f84127c
            tb.m r4 = r4.findCreatorAnnotation(r5, r3)
            if (r4 == 0) goto L45
            tb.m r5 = tb.m.f86751f
            if (r4 != r5) goto L40
            goto L2f
        L40:
            rc.c r3 = rc.c.of(r3, r4)
            goto L80
        L45:
            java.lang.String r5 = r3.getName()
            java.lang.String r6 = "valueOf"
            boolean r6 = r6.equals(r5)
            r7 = 1
            if (r6 == 0) goto L5d
            int r6 = r3.getParameterCount()
            if (r6 != r7) goto L5d
            rc.c r3 = rc.c.of(r3, r4)
            goto L80
        L5d:
            java.lang.String r6 = "fromString"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L2f
            int r5 = r3.getParameterCount()
            if (r5 != r7) goto L2f
            r5 = 0
            java.lang.Class r5 = r3.getRawParameterType(r5)
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 == r6) goto L7c
            java.lang.Class<java.lang.CharSequence> r6 = java.lang.CharSequence.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L2f
        L7c:
            rc.c r3 = rc.c.of(r3, r4)
        L80:
            if (r3 == 0) goto L15
            if (r2 != 0) goto L89
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L89:
            r2.add(r3)
            goto L15
        L8d:
            if (r2 != 0) goto L92
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.b0.getFactoryMethodsWithMode():java.util.List");
    }

    @Override // jc.d
    public Set<String> getIgnoredPropertyNames() {
        u0 u0Var = this.f84126b;
        Set<String> ignoredPropertyNames = u0Var == null ? null : u0Var.getIgnoredPropertyNames();
        return ignoredPropertyNames == null ? Collections.EMPTY_SET : ignoredPropertyNames;
    }

    @Override // jc.d
    public t0 getObjectIdInfo() {
        return this.f84133i;
    }

    @Override // jc.d
    public d1 getPotentialCreators() {
        u0 u0Var = this.f84126b;
        return u0Var == null ? new d1() : u0Var.getPotentialCreators();
    }

    @Override // jc.d
    public boolean hasKnownClassAnnotations() {
        return this.f84129e.hasAnnotations();
    }

    public boolean hasProperty(jc.n0 n0Var) {
        return findProperty(n0Var) != null;
    }

    @Override // jc.d
    public Object instantiateBean(boolean z10) {
        e eVar = this.f84129e;
        g defaultConstructor = eVar.getDefaultConstructor();
        if (defaultConstructor == null) {
            return null;
        }
        if (z10) {
            defaultConstructor.fixAccess(this.f84127c.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return defaultConstructor.call();
        } catch (Exception e10) {
            e = e10;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            dd.i.throwIfError(e);
            dd.i.throwIfRTE(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + eVar.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + dd.i.exceptionMessage(e), e);
        }
    }

    public boolean removeProperty(String str) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            if (((d0) it.next()).getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b0(u0 u0Var) {
        jc.o type = u0Var.getType();
        e classDef = u0Var.getClassDef();
        super(type);
        this.f84126b = u0Var;
        lc.z config = u0Var.getConfig();
        this.f84127c = config;
        if (config == null) {
            this.f84128d = null;
        } else {
            this.f84128d = config.getAnnotationIntrospector();
        }
        this.f84129e = classDef;
        this.f84133i = u0Var.getObjectIdInfo();
    }
}
