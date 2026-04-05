package mc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jc.m0;
import jc.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final jc.j f74182a;

    /* renamed from: b, reason: collision with root package name */
    public final jc.k f74183b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.d f74184c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f74185d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public z[] f74186e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f74187f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f74188g;

    /* renamed from: h, reason: collision with root package name */
    public HashSet f74189h;

    /* renamed from: i, reason: collision with root package name */
    public HashSet f74190i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f74191j;

    /* renamed from: k, reason: collision with root package name */
    public nc.w f74192k;

    /* renamed from: l, reason: collision with root package name */
    public x f74193l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f74194m;

    /* renamed from: n, reason: collision with root package name */
    public rc.m f74195n;

    /* renamed from: o, reason: collision with root package name */
    public kc.h f74196o;

    public g(jc.d dVar, jc.k kVar) {
        this.f74184c = dVar;
        this.f74183b = kVar;
        this.f74182a = kVar.getConfig();
    }

    public final Map a(Collection collection) {
        Iterator it = collection.iterator();
        HashMap map = null;
        while (it.hasNext()) {
            z zVar = (z) it.next();
            List<n0> listFindAliases = zVar.findAliases(this.f74182a);
            if (listFindAliases != null && !listFindAliases.isEmpty()) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(zVar.getName(), listFindAliases);
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public void addBackReferenceProperty(String str, z zVar) throws jc.i {
        if (this.f74188g == null) {
            this.f74188g = new HashMap(4);
        }
        jc.j jVar = this.f74182a;
        if (jVar.canOverrideAccessModifiers()) {
            try {
                zVar.fixAccess(jVar);
            } catch (IllegalArgumentException e10) {
                c(e10);
            }
        }
        this.f74188g.put(str, zVar);
    }

    public void addCreatorProperty(z zVar) {
        addProperty(zVar);
    }

    public void addIgnorable(String str) {
        if (this.f74189h == null) {
            this.f74189h = new HashSet();
        }
        this.f74189h.add(str);
    }

    public void addIncludable(String str) {
        if (this.f74190i == null) {
            this.f74190i = new HashSet();
        }
        this.f74190i.add(str);
    }

    public void addInjectable(n0 n0Var, jc.o oVar, dd.b bVar, rc.l lVar, Object obj) throws jc.i {
        if (this.f74187f == null) {
            this.f74187f = new ArrayList();
        }
        jc.j jVar = this.f74182a;
        if (jVar.canOverrideAccessModifiers()) {
            try {
                lVar.fixAccess(jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e10) {
                c(e10);
            }
        }
        this.f74187f.add(new nc.n0(n0Var, oVar, lVar, obj));
    }

    public void addOrReplaceProperty(z zVar, boolean z10) {
        z[] zVarArr;
        z zVar2 = (z) this.f74185d.put(zVar.getName(), zVar);
        if (zVar2 == null || (zVarArr = this.f74186e) == null) {
            return;
        }
        int length = zVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            z[] zVarArr2 = this.f74186e;
            if (zVarArr2[i10] == zVar2) {
                zVarArr2[i10] = zVar;
            }
        }
    }

    public void addProperty(z zVar) {
        z zVar2 = (z) this.f74185d.put(zVar.getName(), zVar);
        if (zVar2 == null || zVar2 == zVar) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + zVar.getName() + "' for " + this.f74184c.getType());
    }

    public final void b(Collection collection) throws jc.i {
        jc.j jVar = this.f74182a;
        if (jVar.canOverrideAccessModifiers()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ((z) it.next()).fixAccess(jVar);
                } catch (IllegalArgumentException e10) {
                    c(e10);
                }
            }
        }
        x xVar = this.f74193l;
        if (xVar != null) {
            try {
                xVar.fixAccess(jVar);
            } catch (IllegalArgumentException e11) {
                c(e11);
            }
        }
        rc.m mVar = this.f74195n;
        if (mVar != null) {
            try {
                mVar.fixAccess(jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e12) {
                c(e12);
            }
        }
    }

    public jc.q build() throws jc.i {
        Collection collectionValues = this.f74185d.values();
        b(collectionValues);
        Map mapA = a(collectionValues);
        Boolean feature = this.f74184c.findExpectedFormat().getFeature(tb.q.f86755c);
        jc.j jVar = this.f74182a;
        nc.c cVarConstruct = nc.c.construct(jVar, collectionValues, mapA, feature == null ? jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : feature.booleanValue());
        cVarConstruct.assignIndexes();
        boolean zIsEnabled = jVar.isEnabled(jc.y.DEFAULT_VIEW_INCLUSION);
        boolean z10 = !zIsEnabled;
        if (zIsEnabled) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((z) it.next()).hasViews()) {
                    z10 = true;
                    break;
                }
            }
        }
        boolean z11 = z10;
        if (this.f74192k != null) {
            cVarConstruct = cVarConstruct.withProperty(new nc.y(this.f74192k, m0.f69371j));
        }
        return new e(this, this.f74184c, cVarConstruct, this.f74188g, this.f74189h, this.f74194m, this.f74190i, z11);
    }

    public a buildAbstract() {
        return new a(this, this.f74184c, this.f74188g, this.f74185d);
    }

    public jc.q buildBuilderBased(jc.o oVar, String str) throws jc.i {
        rc.m mVar = this.f74195n;
        jc.k kVar = this.f74183b;
        jc.d dVar = this.f74184c;
        if (mVar != null) {
            Class<?> rawReturnType = mVar.getRawReturnType();
            Class<?> rawClass = oVar.getRawClass();
            if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                jc.o type = dVar.getType();
                String fullName = this.f74195n.getFullName();
                String classDescription = dd.i.getClassDescription(rawReturnType);
                String typeDescription = dd.i.getTypeDescription(oVar);
                StringBuilder sbB = b3.h.b("Build method `", fullName, "` has wrong return type (", classDescription, "), not compatible with POJO type (");
                sbB.append(typeDescription);
                sbB.append(")");
                kVar.reportBadDefinition(type, sbB.toString());
            }
        } else if (!str.isEmpty()) {
            kVar.reportBadDefinition(dVar.getType(), e3.g.l("Builder class ", dd.i.getTypeDescription(dVar.getType()), " does not have build method (name: '", str, "')"));
        }
        Collection collectionValues = this.f74185d.values();
        b(collectionValues);
        Map mapA = a(collectionValues);
        Boolean feature = dVar.findExpectedFormat().getFeature(tb.q.f86755c);
        jc.j jVar = this.f74182a;
        nc.c cVarConstruct = nc.c.construct(jVar, collectionValues, mapA, feature == null ? jVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : feature.booleanValue());
        cVarConstruct.assignIndexes();
        boolean zIsEnabled = jVar.isEnabled(jc.y.DEFAULT_VIEW_INCLUSION);
        boolean z10 = !zIsEnabled;
        if (zIsEnabled) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((z) it.next()).hasViews()) {
                    z10 = true;
                    break;
                }
            }
        }
        boolean z11 = z10;
        if (this.f74192k != null) {
            cVarConstruct = cVarConstruct.withProperty(new nc.y(this.f74192k, m0.f69371j));
        }
        return new j(this, this.f74184c, oVar, cVarConstruct, this.f74188g, this.f74189h, this.f74194m, this.f74190i, z11);
    }

    public final void c(IllegalArgumentException illegalArgumentException) throws jc.i {
        try {
            this.f74183b.reportBadTypeDefinition(this.f74184c, illegalArgumentException.getMessage(), new Object[0]);
        } catch (jc.i e10) {
            if (e10.getCause() == null) {
                e10.initCause(illegalArgumentException);
            }
            throw e10;
        }
    }

    public z findProperty(n0 n0Var) {
        return (z) this.f74185d.get(n0Var.getSimpleName());
    }

    public x getAnySetter() {
        return this.f74193l;
    }

    public rc.m getBuildMethod() {
        return this.f74195n;
    }

    public kc.h getBuilderConfig() {
        return this.f74196o;
    }

    public List<nc.n0> getInjectables() {
        return this.f74187f;
    }

    public nc.w getObjectIdReader() {
        return this.f74192k;
    }

    public Iterator<z> getProperties() {
        return this.f74185d.values().iterator();
    }

    public c0 getValueInstantiator() {
        return this.f74191j;
    }

    public boolean hasIgnorable(String str) {
        return dd.r.shouldIgnore(str, this.f74189h, this.f74190i);
    }

    public boolean hasProperty(n0 n0Var) {
        return findProperty(n0Var) != null;
    }

    public z removeProperty(n0 n0Var) {
        return (z) this.f74185d.remove(n0Var.getSimpleName());
    }

    public void setAnySetter(x xVar) {
        if (this.f74193l != null && xVar != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.f74193l = xVar;
    }

    public void setIgnoreUnknownProperties(boolean z10) {
        this.f74194m = z10;
    }

    public void setObjectIdReader(nc.w wVar) {
        this.f74192k = wVar;
    }

    public void setPOJOBuilder(rc.m mVar, kc.h hVar) {
        this.f74195n = mVar;
        this.f74196o = hVar;
    }

    public void setValueInstantiator(c0 c0Var) {
        this.f74191j = c0Var;
        this.f74186e = c0Var.getFromObjectArguments(this.f74182a);
    }
}
