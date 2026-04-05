package lc;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import jc.n0;
import jc.o0;
import rc.a;
import rc.f0;
import rc.j1;
import rc.s0;
import tb.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z implements rc.e0, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final long f73175b;

    /* renamed from: c, reason: collision with root package name */
    public final a f73176c;

    static {
        tb.d0.empty();
        tb.t.empty();
    }

    public z(a aVar, long j10) {
        this.f73176c = aVar;
        this.f73175b = j10;
    }

    public static <F extends Enum<F> & g> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            g gVar = (g) obj;
            if (gVar.enabledByDefault()) {
                mask |= gVar.getMask();
            }
        }
        return mask;
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(jc.y.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public ub.c0 compileString(String str) {
        return new cc.q(str);
    }

    public jc.o constructSpecializedType(jc.o oVar, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(oVar, cls, true);
    }

    public final jc.o constructType(Class<?> cls) {
        return getTypeFactory().constructType(cls);
    }

    @Override // rc.e0
    public abstract /* synthetic */ rc.e0 copy();

    public abstract i findConfigOverride(Class<?> cls);

    @Override // rc.e0
    public abstract /* synthetic */ Class findMixInClassFor(Class cls);

    public abstract n0 findRootName(Class<?> cls);

    public abstract n0 findRootName(jc.o oVar);

    public final a.AbstractC0776a getAccessorNaming() {
        return this.f73176c.getAccessorNaming();
    }

    public abstract Class<?> getActiveView();

    public jc.c getAnnotationIntrospector() {
        return isEnabled(jc.y.USE_ANNOTATIONS) ? this.f73176c.getAnnotationIntrospector() : s0.f84250b;
    }

    public abstract n getAttributes();

    public ub.b getBase64Variant() {
        return this.f73176c.getBase64Variant();
    }

    public b getCacheProvider() {
        return this.f73176c.getCacheProvider();
    }

    public f0 getClassIntrospector() {
        return this.f73176c.getClassIntrospector();
    }

    public abstract i getConfigOverride(Class<?> cls);

    public abstract l getConstructorDetector();

    public abstract q getDatatypeFeatures();

    public final DateFormat getDateFormat() {
        return this.f73176c.getDateFormat();
    }

    public abstract tb.d0 getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public tb.d0 getDefaultInclusion(Class<?> cls, Class<?> cls2, tb.d0 d0Var) {
        return tb.d0.mergeAll(d0Var, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public abstract Boolean getDefaultMergeable();

    public abstract Boolean getDefaultMergeable(Class<?> cls);

    public abstract tb.t getDefaultPropertyFormat(Class<?> cls);

    public abstract tb.z getDefaultPropertyIgnorals(Class<?> cls);

    public abstract tb.z getDefaultPropertyIgnorals(Class<?> cls, rc.e eVar);

    public abstract tb.d0 getDefaultPropertyInclusion();

    public abstract tb.d0 getDefaultPropertyInclusion(Class<?> cls);

    public tb.d0 getDefaultPropertyInclusion(Class<?> cls, tb.d0 d0Var) {
        tb.d0 include = getConfigOverride(cls).getInclude();
        return include != null ? include : d0Var;
    }

    public abstract tb.f0 getDefaultPropertyInclusions(Class<?> cls, rc.e eVar);

    public abstract q0 getDefaultSetterInfo();

    public final wc.i getDefaultTyper(jc.o oVar) {
        return this.f73176c.getTypeResolverBuilder();
    }

    public abstract j1 getDefaultVisibilityChecker();

    public abstract j1 getDefaultVisibilityChecker(Class<?> cls, rc.e eVar);

    public final jc.m getEnumNamingStrategy() {
        this.f73176c.getEnumNamingStrategy();
        return null;
    }

    public final v getHandlerInstantiator() {
        return this.f73176c.getHandlerInstantiator();
    }

    public final Locale getLocale() {
        return this.f73176c.getLocale();
    }

    public wc.d getPolymorphicTypeValidator() {
        wc.d polymorphicTypeValidator = this.f73176c.getPolymorphicTypeValidator();
        return (polymorphicTypeValidator == xc.m.f91908b && isEnabled(jc.y.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new wc.b() : polymorphicTypeValidator;
    }

    public final o0 getPropertyNamingStrategy() {
        return this.f73176c.getPropertyNamingStrategy();
    }

    public abstract wc.f getSubtypeResolver();

    public final TimeZone getTimeZone() {
        return this.f73176c.getTimeZone();
    }

    public final cd.s getTypeFactory() {
        return this.f73176c.getTypeFactory();
    }

    public boolean hasExplicitTimeZone() {
        return this.f73176c.hasExplicitTimeZone();
    }

    @Deprecated
    public final boolean hasMapperFeatures(int i10) {
        long j10 = i10;
        return (this.f73175b & j10) == j10;
    }

    public jc.d introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public jc.d introspectDirectClassAnnotations(Class<?> cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(jc.y.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(jc.y yVar) {
        return yVar.enabledIn(this.f73175b);
    }

    public abstract boolean isEnabled(o oVar);

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(jc.y.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public wc.h typeIdResolverInstance(rc.b bVar, Class<? extends wc.h> cls) {
        wc.h hVarTypeIdResolverInstance;
        v handlerInstantiator = getHandlerInstantiator();
        return (handlerInstantiator == null || (hVarTypeIdResolverInstance = handlerInstantiator.typeIdResolverInstance(this, bVar, cls)) == null) ? (wc.h) dd.i.createInstance(cls, canOverrideAccessModifiers()) : hVarTypeIdResolverInstance;
    }

    public wc.i typeResolverBuilderInstance(rc.b bVar, Class<? extends wc.i> cls) {
        wc.i iVarTypeResolverBuilderInstance;
        v handlerInstantiator = getHandlerInstantiator();
        return (handlerInstantiator == null || (iVarTypeResolverBuilderInstance = handlerInstantiator.typeResolverBuilderInstance(this, bVar, cls)) == null) ? (wc.i) dd.i.createInstance(cls, canOverrideAccessModifiers()) : iVarTypeResolverBuilderInstance;
    }

    public abstract boolean useRootWrapping();

    public abstract z with(jc.y yVar, boolean z10);

    public abstract z with(jc.y... yVarArr);

    public abstract z without(jc.y... yVarArr);

    public final jc.o constructType(hc.b bVar) {
        getTypeFactory();
        throw null;
    }

    public jc.d introspectClassAnnotations(jc.o oVar) {
        return getClassIntrospector().forClassAnnotations(this, oVar, this);
    }

    public final jc.d introspectDirectClassAnnotations(jc.o oVar) {
        return getClassIntrospector().forDirectClassAnnotations(this, oVar, this);
    }

    public z(a0 a0Var, long j10) {
        this.f73176c = a0Var.f73176c;
        this.f73175b = j10;
    }

    public z(a0 a0Var, a aVar) {
        this.f73176c = aVar;
        this.f73175b = a0Var.f73175b;
    }

    public z(a0 a0Var) {
        this.f73176c = a0Var.f73176c;
        this.f73175b = a0Var.f73175b;
    }
}
