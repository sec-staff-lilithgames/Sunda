package rc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final lc.z f84258a;

    /* renamed from: b, reason: collision with root package name */
    public final a f84259b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84260c;

    /* renamed from: d, reason: collision with root package name */
    public final jc.o f84261d;

    /* renamed from: e, reason: collision with root package name */
    public final e f84262e;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f84263f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.c f84264g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84265h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84266i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84267j;

    /* renamed from: k, reason: collision with root package name */
    public LinkedHashMap f84268k;

    /* renamed from: l, reason: collision with root package name */
    public List f84269l;

    /* renamed from: m, reason: collision with root package name */
    public d1 f84270m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap f84271n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedList f84272o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedList f84273p;

    /* renamed from: q, reason: collision with root package name */
    public LinkedList f84274q;

    /* renamed from: r, reason: collision with root package name */
    public LinkedList f84275r;

    /* renamed from: s, reason: collision with root package name */
    public LinkedList f84276s;

    /* renamed from: t, reason: collision with root package name */
    public LinkedList f84277t;

    /* renamed from: u, reason: collision with root package name */
    public HashSet f84278u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashMap f84279v;

    /* renamed from: w, reason: collision with root package name */
    public tb.t f84280w;

    public u0(lc.z zVar, boolean z10, jc.o oVar, e eVar, a aVar) {
        this.f84258a = zVar;
        this.f84260c = z10;
        this.f84261d = oVar;
        this.f84262e = eVar;
        this.f84266i = oVar.isRecordType();
        if (zVar.isAnnotationProcessingEnabled()) {
            this.f84265h = true;
            this.f84264g = zVar.getAnnotationIntrospector();
        } else {
            this.f84265h = false;
            this.f84264g = jc.c.nopInstance();
        }
        this.f84263f = zVar.getDefaultVisibilityChecker(oVar.getRawClass(), eVar);
        this.f84259b = aVar;
    }

    public static boolean i(List list, a1 a1Var) {
        q constructorParameter = a1Var.getConstructorParameter();
        if (list != null && constructorParameter != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a1 a1Var2 = (a1) list.get(i10);
                if (a1Var2 != null && a1Var2.getConstructorParameter() == constructorParameter) {
                    list.set(i10, a1Var);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(LinkedList linkedList) {
        do {
            l lVar = (l) linkedList.get(0);
            l lVar2 = (l) linkedList.get(1);
            if (lVar instanceof i) {
                if (!(lVar2 instanceof m)) {
                    return false;
                }
                linkedList.remove(0);
            } else {
                if (!(lVar instanceof m) || !(lVar2 instanceof i)) {
                    return false;
                }
                linkedList.remove(1);
            }
        } while (linkedList.size() > 1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf A[EDGE_INSN: B:77:0x00cf->B:57:0x00cf BREAK  A[LOOP:1: B:42:0x009c->B:78:0x009c]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(rc.d1 r10, java.util.List r11, java.util.LinkedHashMap r12, boolean r13) {
        /*
            r9 = this;
            lc.z r0 = r9.f84258a
            lc.l r1 = r0.getConstructorDetector()
            java.util.Iterator r11 = r11.iterator()
        La:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r11.next()
            rc.c1 r2 = (rc.c1) r2
            boolean r3 = r2.isAnnotated()
            if (r3 != 0) goto L1d
            goto La
        L1d:
            r11.remove()
            tb.m r3 = r2.creatorMode()
            int r3 = r3.ordinal()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto Ld0
            r6 = 2
            if (r3 == r6) goto Lcf
            int r3 = r2.paramCount()
            if (r3 != r5) goto L59
            lc.k r3 = r1.singleArgMode()
            int r3 = r3.ordinal()
            if (r3 == 0) goto Ld0
            if (r3 == r5) goto Lcf
            r6 = 3
            if (r3 == r6) goto L45
            goto L59
        L45:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            rc.r r11 = r2.creator()
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r12 = "Single-argument constructor (%s) is annotated but no 'mode' defined; `ConstructorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r10.<init>(r11)
            throw r10
        L59:
            r2.introspectParamNames(r0)
            boolean r3 = r2.hasExplicitNames()
            if (r3 == 0) goto L64
            goto Lcf
        L64:
            java.util.LinkedList r3 = r9.f84277t
            if (r3 == 0) goto L6f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L6f
            goto Ld0
        L6f:
            int r3 = r2.paramCount()
            if (r3 != r5) goto Lca
            jc.n0 r3 = r2.implicitName(r4)
            if (r3 == 0) goto Lbb
            java.lang.String r6 = r3.getSimpleName()
            java.lang.Object r6 = r12.get(r6)
            rc.a1 r6 = (rc.a1) r6
            if (r6 == 0) goto L94
            boolean r3 = r6.anyVisible()
            if (r3 == 0) goto Lbb
            boolean r3 = r6.anyIgnorals()
            if (r3 != 0) goto Lbb
            goto Lcf
        L94:
            java.util.Collection r6 = r12.values()
            java.util.Iterator r6 = r6.iterator()
        L9c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lbb
            java.lang.Object r7 = r6.next()
            rc.a1 r7 = (rc.a1) r7
            boolean r8 = r7.anyVisible()
            if (r8 == 0) goto L9c
            boolean r8 = r7.anyIgnorals()
            if (r8 != 0) goto L9c
            boolean r7 = r7.hasExplicitName(r3)
            if (r7 == 0) goto L9c
            goto Lcf
        Lbb:
            jc.c r3 = r9.f84264g
            if (r3 == 0) goto Ld0
            rc.q r6 = r2.param(r4)
            tb.c r3 = r3.findInjectableValue(r6)
            if (r3 == 0) goto Ld0
            goto Lcf
        Lca:
            boolean r4 = r2.hasNameOrInjectForAllParams(r0)
            goto Ld0
        Lcf:
            r4 = r5
        Ld0:
            if (r4 == 0) goto Ldb
            if (r13 != 0) goto La
            java.lang.String r3 = "explicit"
            r10.setPropertiesBased(r0, r2, r3)
            goto La
        Ldb:
            r10.addExplicitDelegating(r2)
            goto La
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.u0.a(rc.d1, java.util.List, java.util.LinkedHashMap, boolean):void");
    }

    public final String b(String str) {
        jc.n0 n0Var;
        HashMap map = this.f84271n;
        return (map == null || (n0Var = (jc.n0) map.get(jc.n0.construct(str, null))) == null) ? str : n0Var.getSimpleName();
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            arrayList.add(new c1(rVar, this.f84265h ? this.f84264g.findCreatorAnnotation(this.f84258a, rVar) : null));
        }
        return arrayList;
    }

    public final void d(String str) {
        if (this.f84260c || str == null) {
            return;
        }
        if (this.f84278u == null) {
            this.f84278u = new HashSet();
        }
        this.f84278u.add(str);
    }

    public final void e(tb.c cVar, l lVar) {
        if (cVar == null) {
            return;
        }
        Object id2 = cVar.getId();
        if (this.f84279v == null) {
            this.f84279v = new LinkedHashMap();
        }
        l lVar2 = (l) this.f84279v.put(id2, lVar);
        if (lVar2 == null || lVar2.getClass() != lVar.getClass()) {
            return;
        }
        l("Duplicate injectable value with id '%s' (of type %s)", id2, dd.i.classNameOf(id2));
        throw null;
    }

    public final a1 f(LinkedHashMap linkedHashMap, String str) {
        a1 a1Var = (a1) linkedHashMap.get(str);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1(this.f84258a, this.f84264g, this.f84260c, jc.n0.construct(str));
        linkedHashMap.put(str, a1Var2);
        return a1Var2;
    }

    public final a1 g(LinkedHashMap linkedHashMap, jc.n0 n0Var) {
        String simpleName = n0Var.getSimpleName();
        a1 a1Var = (a1) linkedHashMap.get(simpleName);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1(this.f84258a, this.f84264g, this.f84260c, n0Var);
        linkedHashMap.put(simpleName, a1Var2);
        return a1Var2;
    }

    public jc.c getAnnotationIntrospector() {
        return this.f84264g;
    }

    @Deprecated
    public l getAnyGetter() {
        return getAnyGetterMethod();
    }

    public l getAnyGetterField() {
        if (!this.f84267j) {
            k();
        }
        LinkedList linkedList = this.f84273p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return (l) this.f84273p.getFirst();
        }
        l("Multiple 'any-getter' fields defined (%s vs %s)", this.f84273p.get(0), this.f84273p.get(1));
        throw null;
    }

    public l getAnyGetterMethod() {
        if (!this.f84267j) {
            k();
        }
        LinkedList linkedList = this.f84272o;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return (l) this.f84272o.getFirst();
        }
        l("Multiple 'any-getter' methods defined (%s vs %s)", this.f84272o.get(0), this.f84272o.get(1));
        throw null;
    }

    public l getAnySetterField() {
        if (!this.f84267j) {
            k();
        }
        LinkedList linkedList = this.f84275r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return (l) this.f84275r.getFirst();
        }
        l("Multiple 'any-setter' fields defined (%s vs %s)", this.f84275r.get(0), this.f84275r.get(1));
        throw null;
    }

    public m getAnySetterMethod() {
        if (!this.f84267j) {
            k();
        }
        LinkedList linkedList = this.f84274q;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return (m) this.f84274q.getFirst();
        }
        l("Multiple 'any-setter' methods defined (%s vs %s)", this.f84274q.get(0), this.f84274q.get(1));
        throw null;
    }

    public e getClassDef() {
        return this.f84262e;
    }

    public lc.z getConfig() {
        return this.f84258a;
    }

    public tb.t getFormatOverrides() {
        if (this.f84280w == null) {
            jc.c cVar = this.f84264g;
            tb.t tVarFindFormat = cVar != null ? cVar.findFormat(this.f84262e) : null;
            tb.t defaultPropertyFormat = this.f84258a.getDefaultPropertyFormat(this.f84261d.getRawClass());
            if (defaultPropertyFormat != null) {
                tVarFindFormat = tVarFindFormat == null ? defaultPropertyFormat : tVarFindFormat.withOverrides(defaultPropertyFormat);
            }
            if (tVarFindFormat == null) {
                tVarFindFormat = tb.t.empty();
            }
            this.f84280w = tVarFindFormat;
        }
        return this.f84280w;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this.f84278u;
    }

    public Map<Object, l> getInjectables() {
        if (!this.f84267j) {
            k();
        }
        return this.f84279v;
    }

    public l getJsonKeyAccessor() {
        if (!this.f84267j) {
            k();
        }
        LinkedList linkedList = this.f84276s;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1 || j(this.f84276s)) {
            return (l) this.f84276s.get(0);
        }
        l("Multiple 'as-key' properties defined (%s vs %s)", this.f84276s.get(0), this.f84276s.get(1));
        throw null;
    }

    public l getJsonValueAccessor() {
        if (!this.f84267j) {
            k();
        }
        LinkedList linkedList = this.f84277t;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1 || j(this.f84277t)) {
            return (l) this.f84277t.get(0);
        }
        l("Multiple 'as-value' properties defined (%s vs %s)", this.f84277t.get(0), this.f84277t.get(1));
        throw null;
    }

    public t0 getObjectIdInfo() {
        jc.c cVar = this.f84264g;
        e eVar = this.f84262e;
        t0 t0VarFindObjectIdInfo = cVar.findObjectIdInfo(eVar);
        return t0VarFindObjectIdInfo != null ? cVar.findObjectReferenceInfo(eVar, t0VarFindObjectIdInfo) : t0VarFindObjectIdInfo;
    }

    public d1 getPotentialCreators() {
        if (!this.f84267j) {
            k();
        }
        return this.f84270m;
    }

    public List<d0> getProperties() {
        if (!this.f84267j) {
            k();
        }
        return new ArrayList(this.f84268k.values());
    }

    public jc.o getType() {
        return this.f84261d;
    }

    public final void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f84263f.isCreatorVisible(((c1) it.next()).creator())) {
                it.remove();
            }
        }
    }

    public boolean isRecordType() {
        return this.f84266i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x0484, code lost:
    
        if (r3.hasNameOrInjectForAllParams(r4) == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04c1, code lost:
    
        if (r7.anyIgnorals() != false) goto L270;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0a3e  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0a4a  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [rc.a1] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r27v0, types: [rc.u0] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 2700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.u0.k():void");
    }

    public final void l(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f84262e + ": " + str);
    }
}
