package lc;

import dd.h0;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import jc.n0;
import jc.o0;
import rc.a;
import rc.e1;
import rc.i1;
import rc.j1;
import tb.f0;
import tb.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a0 extends z {

    /* renamed from: m, reason: collision with root package name */
    public static final i f73074m = i.empty();

    /* renamed from: n, reason: collision with root package name */
    public static final long f73075n = jc.y.collectLongDefaults();

    /* renamed from: o, reason: collision with root package name */
    public static final long f73076o = (((jc.y.AUTO_DETECT_FIELDS.getLongMask() | jc.y.AUTO_DETECT_GETTERS.getLongMask()) | jc.y.AUTO_DETECT_IS_GETTERS.getLongMask()) | jc.y.AUTO_DETECT_SETTERS.getLongMask()) | jc.y.AUTO_DETECT_CREATORS.getLongMask();

    /* renamed from: e, reason: collision with root package name */
    public final e1 f73077e;

    /* renamed from: f, reason: collision with root package name */
    public final wc.f f73078f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f73079g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f73080h;

    /* renamed from: i, reason: collision with root package name */
    public final n f73081i;

    /* renamed from: j, reason: collision with root package name */
    public final h0 f73082j;

    /* renamed from: k, reason: collision with root package name */
    public final j f73083k;

    /* renamed from: l, reason: collision with root package name */
    public final q f73084l;

    public a0(a aVar, wc.f fVar, e1 e1Var, h0 h0Var, j jVar, q qVar) {
        super(aVar, f73075n);
        this.f73077e = e1Var;
        this.f73078f = fVar;
        this.f73082j = h0Var;
        this.f73079g = null;
        this.f73080h = null;
        this.f73081i = n.getEmpty();
        this.f73083k = jVar;
        this.f73084l = qVar;
    }

    public abstract a0 a(q qVar);

    public abstract a0 b(a aVar);

    public abstract a0 c(long j10);

    @Override // lc.z, rc.e0
    public rc.e0 copy() {
        throw new UnsupportedOperationException();
    }

    @Override // lc.z
    public final i findConfigOverride(Class<?> cls) {
        return this.f73083k.findOverride(cls);
    }

    @Override // lc.z, rc.e0
    public final Class<?> findMixInClassFor(Class<?> cls) {
        return this.f73077e.findMixInClassFor(cls);
    }

    @Override // lc.z
    public n0 findRootName(jc.o oVar) {
        n0 n0Var = this.f73079g;
        return n0Var != null ? n0Var : this.f73082j.findRootName(oVar, this);
    }

    @Override // lc.z
    public final Class<?> getActiveView() {
        return this.f73080h;
    }

    @Override // lc.z
    public final n getAttributes() {
        return this.f73081i;
    }

    @Override // lc.z
    public final i getConfigOverride(Class<?> cls) {
        i iVarFindOverride = this.f73083k.findOverride(cls);
        return iVarFindOverride == null ? f73074m : iVarFindOverride;
    }

    @Override // lc.z
    public final q getDatatypeFeatures() {
        return this.f73084l;
    }

    @Override // lc.z
    public final tb.d0 getDefaultInclusion(Class<?> cls, Class<?> cls2) {
        tb.d0 includeAsProperty = getConfigOverride(cls2).getIncludeAsProperty();
        tb.d0 defaultPropertyInclusion = getDefaultPropertyInclusion(cls);
        return defaultPropertyInclusion == null ? includeAsProperty : defaultPropertyInclusion.withOverrides(includeAsProperty);
    }

    @Override // lc.z
    public Boolean getDefaultMergeable() {
        return this.f73083k.getDefaultMergeable();
    }

    @Override // lc.z
    public final tb.t getDefaultPropertyFormat(Class<?> cls) {
        return this.f73083k.findFormatDefaults(cls);
    }

    @Override // lc.z
    public final tb.z getDefaultPropertyIgnorals(Class<?> cls) {
        tb.z ignorals;
        i iVarFindOverride = this.f73083k.findOverride(cls);
        if (iVarFindOverride == null || (ignorals = iVarFindOverride.getIgnorals()) == null) {
            return null;
        }
        return ignorals;
    }

    @Override // lc.z
    public final tb.d0 getDefaultPropertyInclusion() {
        return this.f73083k.getDefaultInclusion();
    }

    @Override // lc.z
    public final f0 getDefaultPropertyInclusions(Class<?> cls, rc.e eVar) {
        jc.c annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPropertyInclusionByName(this, eVar);
    }

    @Override // lc.z
    public final q0 getDefaultSetterInfo() {
        return this.f73083k.getDefaultSetterInfo();
    }

    @Override // lc.z
    public final j1 getDefaultVisibilityChecker() {
        j1 defaultVisibility = this.f73083k.getDefaultVisibility();
        long j10 = this.f73175b;
        long j11 = f73076o;
        if ((j10 & j11) == j11) {
            return defaultVisibility;
        }
        boolean zIsEnabled = isEnabled(jc.y.AUTO_DETECT_FIELDS);
        tb.i iVar = tb.i.f86729f;
        if (!zIsEnabled) {
            defaultVisibility = defaultVisibility.withFieldVisibility(iVar);
        }
        if (!isEnabled(jc.y.AUTO_DETECT_GETTERS)) {
            defaultVisibility = defaultVisibility.withGetterVisibility(iVar);
        }
        if (!isEnabled(jc.y.AUTO_DETECT_IS_GETTERS)) {
            defaultVisibility = defaultVisibility.withIsGetterVisibility(iVar);
        }
        if (!isEnabled(jc.y.AUTO_DETECT_SETTERS)) {
            defaultVisibility = defaultVisibility.withSetterVisibility(iVar);
        }
        return !isEnabled(jc.y.AUTO_DETECT_CREATORS) ? defaultVisibility.withCreatorVisibility(iVar) : defaultVisibility;
    }

    public final n0 getFullRootName() {
        return this.f73079g;
    }

    @Deprecated
    public final String getRootName() {
        n0 n0Var = this.f73079g;
        if (n0Var == null) {
            return null;
        }
        return n0Var.getSimpleName();
    }

    @Override // lc.z
    public final wc.f getSubtypeResolver() {
        return this.f73078f;
    }

    public final int mixInCount() {
        return this.f73077e.localSize();
    }

    public abstract a0 with(n nVar);

    public abstract a0 with(wc.f fVar);

    public final a0 withAppendedAnnotationIntrospector(jc.c cVar) {
        return b(this.f73176c.withAppendedAnnotationIntrospector(cVar));
    }

    public a0 withAttribute(Object obj, Object obj2) {
        return with(getAttributes().withSharedAttribute(obj, obj2));
    }

    public a0 withAttributes(Map<?, ?> map) {
        return with(getAttributes().withSharedAttributes(map));
    }

    public final a0 withFeatures(o... oVarArr) {
        return a(this.f73084l.withFeatures(oVarArr));
    }

    public final a0 withInsertedAnnotationIntrospector(jc.c cVar) {
        return b(this.f73176c.withInsertedAnnotationIntrospector(cVar));
    }

    public a0 withRootName(String str) {
        return str == null ? withRootName((n0) null) : withRootName(n0.construct(str));
    }

    public abstract a0 withRootName(n0 n0Var);

    public abstract a0 withView(Class<?> cls);

    public a0 withoutAttribute(Object obj) {
        return with(getAttributes().withoutSharedAttribute(obj));
    }

    public final a0 withoutFeatures(o... oVarArr) {
        return a(this.f73084l.withoutFeatures(oVarArr));
    }

    @Override // lc.z
    public Boolean getDefaultMergeable(Class<?> cls) {
        Boolean mergeable;
        j jVar = this.f73083k;
        i iVarFindOverride = jVar.findOverride(cls);
        return (iVarFindOverride == null || (mergeable = iVarFindOverride.getMergeable()) == null) ? jVar.getDefaultMergeable() : mergeable;
    }

    @Override // lc.z
    public final tb.d0 getDefaultPropertyInclusion(Class<?> cls) {
        tb.d0 include = getConfigOverride(cls).getInclude();
        tb.d0 defaultPropertyInclusion = getDefaultPropertyInclusion();
        return defaultPropertyInclusion == null ? include : defaultPropertyInclusion.withOverrides(include);
    }

    public final a0 without(o oVar) {
        return a(this.f73084l.without(oVar));
    }

    @Override // lc.z
    public n0 findRootName(Class<?> cls) {
        n0 n0Var = this.f73079g;
        return n0Var != null ? n0Var : this.f73082j.findRootName(cls, this);
    }

    @Override // lc.z
    public final tb.z getDefaultPropertyIgnorals(Class<?> cls, rc.e eVar) {
        jc.c annotationIntrospector = getAnnotationIntrospector();
        return tb.z.merge(annotationIntrospector == null ? null : annotationIntrospector.findPropertyIgnoralByName(this, eVar), getDefaultPropertyIgnorals(cls));
    }

    public final a0 with(o oVar) {
        return a(this.f73084l.with(oVar));
    }

    @Override // lc.z
    public final a0 without(jc.y... yVarArr) {
        long j10 = this.f73175b;
        long j11 = j10;
        for (jc.y yVar : yVarArr) {
            j11 &= ~yVar.getLongMask();
        }
        return j11 == j10 ? this : c(j11);
    }

    @Override // lc.z
    public final a0 with(jc.y... yVarArr) {
        long j10 = this.f73175b;
        long longMask = j10;
        for (jc.y yVar : yVarArr) {
            longMask |= yVar.getLongMask();
        }
        return longMask == j10 ? this : c(longMask);
    }

    @Override // lc.z
    public final a0 with(jc.y yVar, boolean z10) {
        long longMask;
        long j10 = this.f73175b;
        if (z10) {
            longMask = yVar.getLongMask() | j10;
        } else {
            longMask = (~yVar.getLongMask()) & j10;
        }
        return longMask == j10 ? this : c(longMask);
    }

    public a0(a0 a0Var, wc.f fVar, e1 e1Var, h0 h0Var, j jVar) {
        super(a0Var, a0Var.f73176c.copy());
        this.f73077e = e1Var;
        this.f73078f = fVar;
        this.f73082j = h0Var;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = jVar;
        this.f73084l = a0Var.f73084l;
    }

    public final a0 with(o oVar, boolean z10) {
        q qVar = this.f73084l;
        return a(z10 ? qVar.with(oVar) : qVar.without(oVar));
    }

    @Override // lc.z
    public final j1 getDefaultVisibilityChecker(Class<?> cls, rc.e eVar) {
        j1 defaultVisibilityChecker;
        if (dd.i.isJDKClass(cls)) {
            defaultVisibilityChecker = i1.allPublicInstance();
        } else {
            defaultVisibilityChecker = getDefaultVisibilityChecker();
            if (dd.i.isRecordType(cls) && isEnabled(jc.y.AUTO_DETECT_CREATORS)) {
                defaultVisibilityChecker = defaultVisibilityChecker.withCreatorVisibility(tb.i.f86730g);
            }
        }
        jc.c annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            defaultVisibilityChecker = annotationIntrospector.findAutoDetectVisibility(eVar, defaultVisibilityChecker);
        }
        i iVarFindOverride = this.f73083k.findOverride(cls);
        return iVarFindOverride != null ? defaultVisibilityChecker.withOverrides(iVarFindOverride.getVisibility()) : defaultVisibilityChecker;
    }

    public final a0 with(jc.c cVar) {
        return b(this.f73176c.withAnnotationIntrospector(cVar));
    }

    public final a0 with(rc.f0 f0Var) {
        return b(this.f73176c.withClassIntrospector(f0Var));
    }

    public final a0 with(cd.s sVar) {
        return b(this.f73176c.withTypeFactory(sVar));
    }

    public final a0 with(wc.i iVar) {
        return b(this.f73176c.withTypeResolverBuilder(iVar));
    }

    public final a0 with(o0 o0Var) {
        return b(this.f73176c.withPropertyNamingStrategy(o0Var));
    }

    public a0(a0 a0Var) {
        super(a0Var);
        this.f73077e = a0Var.f73077e;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public final a0 with(jc.m mVar) {
        return b(this.f73176c.withEnumNamingStrategy(mVar));
    }

    public final a0 with(a.AbstractC0776a abstractC0776a) {
        return b(this.f73176c.withAccessorNaming(abstractC0776a));
    }

    public final a0 with(v vVar) {
        return b(this.f73176c.withHandlerInstantiator(vVar));
    }

    public a0 with(b bVar) {
        Objects.requireNonNull(bVar);
        return b(this.f73176c.with(bVar));
    }

    public final a0 with(ub.b bVar) {
        return b(this.f73176c.with(bVar));
    }

    public a0 with(DateFormat dateFormat) {
        return b(this.f73176c.withDateFormat(dateFormat));
    }

    public final a0 with(Locale locale) {
        return b(this.f73176c.with(locale));
    }

    public final a0 with(TimeZone timeZone) {
        return b(this.f73176c.with(timeZone));
    }

    public a0(a0 a0Var, a aVar) {
        super(a0Var, aVar);
        this.f73077e = a0Var.f73077e;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public a0(a0 a0Var, long j10) {
        super(a0Var, j10);
        this.f73077e = a0Var.f73077e;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public a0(a0 a0Var, wc.f fVar) {
        super(a0Var);
        this.f73077e = a0Var.f73077e;
        this.f73078f = fVar;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public a0(a0 a0Var, n0 n0Var) {
        super(a0Var);
        this.f73077e = a0Var.f73077e;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = n0Var;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public a0(a0 a0Var, Class cls) {
        super(a0Var);
        this.f73077e = a0Var.f73077e;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = cls;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public a0(a0 a0Var, e1 e1Var) {
        super(a0Var);
        this.f73077e = e1Var;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public a0(a0 a0Var, n nVar) {
        super(a0Var);
        this.f73077e = a0Var.f73077e;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = nVar;
        this.f73083k = a0Var.f73083k;
        this.f73084l = a0Var.f73084l;
    }

    public a0(a0 a0Var, q qVar) {
        super(a0Var);
        this.f73077e = a0Var.f73077e;
        this.f73078f = a0Var.f73078f;
        this.f73082j = a0Var.f73082j;
        this.f73079g = a0Var.f73079g;
        this.f73080h = a0Var.f73080h;
        this.f73081i = a0Var.f73081i;
        this.f73083k = a0Var.f73083k;
        this.f73084l = qVar;
    }
}
