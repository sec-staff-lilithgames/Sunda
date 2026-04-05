package rc;

import com.ironsource.C3191e4;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;
import jc.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a1 extends d0 implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public static final c.a f84106o = c.a.managed("");

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84107c;

    /* renamed from: e, reason: collision with root package name */
    public final lc.z f84108e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.c f84109f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.n0 f84110g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.n0 f84111h;

    /* renamed from: i, reason: collision with root package name */
    public a f84112i;

    /* renamed from: j, reason: collision with root package name */
    public a f84113j;

    /* renamed from: k, reason: collision with root package name */
    public a f84114k;

    /* renamed from: l, reason: collision with root package name */
    public a f84115l;

    /* renamed from: m, reason: collision with root package name */
    public transient jc.m0 f84116m;

    /* renamed from: n, reason: collision with root package name */
    public transient c.a f84117n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f84118a;

        /* renamed from: b, reason: collision with root package name */
        public final a f84119b;

        /* renamed from: c, reason: collision with root package name */
        public final jc.n0 f84120c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f84121d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f84122e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f84123f;

        public a(Object obj, a aVar, jc.n0 n0Var, boolean z10, boolean z11, boolean z12) {
            this.f84118a = obj;
            this.f84119b = aVar;
            jc.n0 n0Var2 = (n0Var == null || n0Var.isEmpty()) ? null : n0Var;
            this.f84120c = n0Var2;
            if (z10) {
                if (n0Var2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!n0Var.hasSimpleName()) {
                    z10 = false;
                }
            }
            this.f84121d = z10;
            this.f84122e = z11;
            this.f84123f = z12;
        }

        public final a a(a aVar) {
            a aVar2 = this.f84119b;
            return aVar2 == null ? withNext(aVar) : withNext(aVar2.a(aVar));
        }

        public String toString() {
            String str = this.f84118a.toString() + "[visible=" + this.f84122e + ",ignore=" + this.f84123f + ",explicitName=" + this.f84121d + C3191e4.i.f36531e;
            a aVar = this.f84119b;
            if (aVar == null) {
                return str;
            }
            StringBuilder sbT = a.b.t(str, ", ");
            sbT.append(aVar.toString());
            return sbT.toString();
        }

        public a trimByVisibility() {
            a aVar = this.f84119b;
            if (aVar == null) {
                return this;
            }
            a aVarTrimByVisibility = aVar.trimByVisibility();
            if (this.f84120c != null) {
                return aVarTrimByVisibility.f84120c == null ? withNext(null) : withNext(aVarTrimByVisibility);
            }
            if (aVarTrimByVisibility.f84120c != null) {
                return aVarTrimByVisibility;
            }
            boolean z10 = aVarTrimByVisibility.f84122e;
            boolean z11 = this.f84122e;
            return z11 == z10 ? withNext(aVarTrimByVisibility) : z11 ? withNext(null) : aVarTrimByVisibility;
        }

        public a withNext(a aVar) {
            if (aVar == this.f84119b) {
                return this;
            }
            return new a(this.f84118a, aVar, this.f84120c, this.f84121d, this.f84122e, this.f84123f);
        }

        public a withValue(Object obj) {
            if (obj == this.f84118a) {
                return this;
            }
            return new a(obj, this.f84119b, this.f84120c, this.f84121d, this.f84122e, this.f84123f);
        }

        public a withoutIgnored() {
            a aVarWithoutIgnored;
            boolean z10 = this.f84123f;
            a aVar = this.f84119b;
            if (!z10) {
                return (aVar == null || (aVarWithoutIgnored = aVar.withoutIgnored()) == aVar) ? this : withNext(aVarWithoutIgnored);
            }
            if (aVar == null) {
                return null;
            }
            return aVar.withoutIgnored();
        }

        public a withoutNext() {
            if (this.f84119b == null) {
                return this;
            }
            return new a(this.f84118a, null, this.f84120c, this.f84121d, this.f84122e, this.f84123f);
        }

        public a withoutNonVisible() {
            a aVar = this.f84119b;
            a aVarWithoutNonVisible = aVar == null ? null : aVar.withoutNonVisible();
            return this.f84122e ? withNext(aVarWithoutNonVisible) : aVarWithoutNonVisible;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        public a f84124b;

        public b(a aVar) {
            this.f84124b = aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f84124b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public l next() {
            a aVar = this.f84124b;
            if (aVar == null) {
                throw new NoSuchElementException();
            }
            l lVar = (l) aVar.f84118a;
            this.f84124b = aVar.f84119b;
            return lVar;
        }
    }

    public a1(lc.z zVar, jc.c cVar, boolean z10, jc.n0 n0Var) {
        this(zVar, cVar, z10, n0Var, n0Var);
    }

    public static boolean a(a aVar) {
        while (aVar != null) {
            if (aVar.f84120c != null && aVar.f84121d) {
                return true;
            }
            aVar = aVar.f84119b;
        }
        return false;
    }

    public static boolean b(a aVar) {
        while (aVar != null) {
            jc.n0 n0Var = aVar.f84120c;
            if (n0Var != null && n0Var.hasSimpleName()) {
                return true;
            }
            aVar = aVar.f84119b;
        }
        return false;
    }

    public static boolean c(a aVar) {
        jc.n0 n0Var;
        while (aVar != null) {
            if (!aVar.f84123f && (n0Var = aVar.f84120c) != null && n0Var.hasSimpleName()) {
                return true;
            }
            aVar = aVar.f84119b;
        }
        return false;
    }

    public static boolean d(a aVar) {
        while (aVar != null) {
            if (aVar.f84123f) {
                return true;
            }
            aVar = aVar.f84119b;
        }
        return false;
    }

    public static boolean e(a aVar) {
        while (aVar != null) {
            if (aVar.f84122e) {
                return true;
            }
            aVar = aVar.f84119b;
        }
        return false;
    }

    public static a f(a aVar, a0 a0Var) {
        l lVar = (l) ((l) aVar.f84118a).withAnnotations(a0Var);
        a aVar2 = aVar.f84119b;
        if (aVar2 != null) {
            aVar = aVar.withNext(f(aVar2, a0Var));
        }
        return aVar.withValue(lVar);
    }

    public static Set h(a aVar, Set set) {
        while (aVar != null) {
            jc.n0 n0Var = aVar.f84120c;
            if (aVar.f84121d && n0Var != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(n0Var);
            }
            aVar = aVar.f84119b;
        }
        return set;
    }

    public static a0 i(a aVar) {
        a0 allAnnotations = ((l) aVar.f84118a).getAllAnnotations();
        a aVar2 = aVar.f84119b;
        return aVar2 != null ? a0.merge(allAnnotations, i(aVar2)) : allAnnotations;
    }

    public static int j(m mVar) {
        String name = mVar.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public static boolean k(a aVar, jc.n0 n0Var) {
        while (aVar != null) {
            if (aVar.f84121d && n0Var.equals(aVar.f84120c)) {
                return true;
            }
            aVar = aVar.f84119b;
        }
        return false;
    }

    public static a0 l(int i10, a... aVarArr) {
        a0 a0VarI = i(aVarArr[i10]);
        do {
            i10++;
            if (i10 >= aVarArr.length) {
                return a0VarI;
            }
        } while (aVarArr[i10] == null);
        return a0.merge(a0VarI, l(i10, aVarArr));
    }

    public void addAll(a1 a1Var) {
        a aVarA = this.f84112i;
        a aVar = a1Var.f84112i;
        if (aVarA == null) {
            aVarA = aVar;
        } else if (aVar != null) {
            aVarA = aVarA.a(aVar);
        }
        this.f84112i = aVarA;
        a aVarA2 = this.f84113j;
        a aVar2 = a1Var.f84113j;
        if (aVarA2 == null) {
            aVarA2 = aVar2;
        } else if (aVar2 != null) {
            aVarA2 = aVarA2.a(aVar2);
        }
        this.f84113j = aVarA2;
        a aVarA3 = this.f84114k;
        a aVar3 = a1Var.f84114k;
        if (aVarA3 == null) {
            aVarA3 = aVar3;
        } else if (aVar3 != null) {
            aVarA3 = aVarA3.a(aVar3);
        }
        this.f84114k = aVarA3;
        a aVarA4 = this.f84115l;
        a aVar4 = a1Var.f84115l;
        if (aVarA4 == null) {
            aVarA4 = aVar4;
        } else if (aVar4 != null) {
            aVarA4 = aVarA4.a(aVar4);
        }
        this.f84115l = aVarA4;
    }

    public void addCtor(q qVar, jc.n0 n0Var, boolean z10, boolean z11, boolean z12) {
        this.f84113j = new a(qVar, this.f84113j, n0Var, z10, z11, z12);
    }

    public void addField(i iVar, jc.n0 n0Var, boolean z10, boolean z11, boolean z12) {
        this.f84112i = new a(iVar, this.f84112i, n0Var, z10, z11, z12);
    }

    public void addGetter(m mVar, jc.n0 n0Var, boolean z10, boolean z11, boolean z12) {
        this.f84114k = new a(mVar, this.f84114k, n0Var, z10, z11, z12);
    }

    public void addSetter(m mVar, jc.n0 n0Var, boolean z10, boolean z11, boolean z12) {
        this.f84115l = new a(mVar, this.f84115l, n0Var, z10, z11, z12);
    }

    public boolean anyExplicitsWithoutIgnoral() {
        if (c(this.f84112i) || c(this.f84114k) || c(this.f84115l)) {
            return true;
        }
        for (a aVar = this.f84113j; aVar != null; aVar = aVar.f84119b) {
            if (!aVar.f84123f && aVar.f84120c != null && aVar.f84121d) {
                return true;
            }
        }
        return false;
    }

    public boolean anyIgnorals() {
        return d(this.f84112i) || d(this.f84114k) || d(this.f84115l) || d(this.f84113j);
    }

    public boolean anyVisible() {
        return e(this.f84112i) || e(this.f84114k) || e(this.f84115l) || e(this.f84113j);
    }

    @Override // rc.d0
    public boolean couldDeserialize() {
        if (this.f84113j != null || this.f84115l != null) {
            return true;
        }
        a aVar = this.f84112i;
        return aVar != null && e(aVar);
    }

    @Override // rc.d0
    public boolean couldSerialize() {
        return (this.f84114k == null && this.f84112i == null) ? false : true;
    }

    public Collection<a1> explode(Collection<jc.n0> collection) {
        HashMap map = new HashMap();
        g(collection, map, this.f84112i);
        g(collection, map, this.f84114k);
        g(collection, map, this.f84115l);
        g(collection, map, this.f84113j);
        return map.values();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[PHI: r1
      0x0022: PHI (r1v19 java.lang.Object) = 
      (r1v12 java.lang.Object)
      (r1v15 java.lang.Object)
      (r1v18 java.lang.Object)
      (r1v28 java.lang.Object)
      (r1v31 java.lang.Object)
      (r1v34 java.lang.Object)
     binds: [B:47:0x0089, B:41:0x0078, B:35:0x0067, B:23:0x0044, B:17:0x0033, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[PHI: r0
      0x0057: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v6 java.lang.Object) binds: [B:53:0x009a, B:29:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tb.k0 findAccess() {
        /*
            r4 = this;
            rc.z0 r0 = new rc.z0
            r0.<init>(r4)
            jc.c r1 = r4.f84109f
            r2 = 0
            if (r1 != 0) goto Lc
            goto L9d
        Lc:
            boolean r1 = r4.f84107c
            tb.k0 r3 = tb.k0.f86732b
            if (r1 == 0) goto L59
            rc.a1$a r1 = r4.f84114k
            if (r1 == 0) goto L25
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r1 = r0.withMember(r1)
            if (r1 == 0) goto L25
            if (r1 == r3) goto L25
        L22:
            r2 = r1
            goto L9d
        L25:
            rc.a1$a r1 = r4.f84112i
            if (r1 == 0) goto L36
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r1 = r0.withMember(r1)
            if (r1 == 0) goto L36
            if (r1 == r3) goto L36
            goto L22
        L36:
            rc.a1$a r1 = r4.f84113j
            if (r1 == 0) goto L47
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r1 = r0.withMember(r1)
            if (r1 == 0) goto L47
            if (r1 == r3) goto L47
            goto L22
        L47:
            rc.a1$a r1 = r4.f84115l
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r0 = r0.withMember(r1)
            if (r0 == 0) goto L9d
            if (r0 == r3) goto L9d
        L57:
            r2 = r0
            goto L9d
        L59:
            rc.a1$a r1 = r4.f84113j
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r1 = r0.withMember(r1)
            if (r1 == 0) goto L6a
            if (r1 == r3) goto L6a
            goto L22
        L6a:
            rc.a1$a r1 = r4.f84115l
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r1 = r0.withMember(r1)
            if (r1 == 0) goto L7b
            if (r1 == r3) goto L7b
            goto L22
        L7b:
            rc.a1$a r1 = r4.f84112i
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r1 = r0.withMember(r1)
            if (r1 == 0) goto L8c
            if (r1 == r3) goto L8c
            goto L22
        L8c:
            rc.a1$a r1 = r4.f84114k
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r1.f84118a
            rc.l r1 = (rc.l) r1
            java.lang.Object r0 = r0.withMember(r1)
            if (r0 == 0) goto L9d
            if (r0 == r3) goto L9d
            goto L57
        L9d:
            tb.k0 r2 = (tb.k0) r2
            lc.z r0 = r4.f84108e
            jc.y r1 = jc.y.INVERSE_READ_WRITE_ACCESS
            boolean r0 = r0.isEnabled(r1)
            if (r0 == 0) goto Lb3
            tb.k0 r0 = tb.k0.f86734e
            tb.k0 r1 = tb.k0.f86733c
            if (r2 != r1) goto Lb0
            return r0
        Lb0:
            if (r2 != r0) goto Lb3
            return r1
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.a1.findAccess():tb.k0");
    }

    @Override // rc.d0
    public List<jc.n0> findAliases() {
        List<jc.n0> listFindPropertyAliases;
        l primaryMember = getPrimaryMember();
        return (primaryMember == null || (listFindPropertyAliases = this.f84109f.findPropertyAliases(primaryMember)) == null) ? Collections.EMPTY_LIST : listFindPropertyAliases;
    }

    public Set<jc.n0> findExplicitNames() {
        Set<jc.n0> setH = h(this.f84113j, h(this.f84115l, h(this.f84114k, h(this.f84112i, null))));
        return setH == null ? Collections.EMPTY_SET : setH;
    }

    @Override // rc.d0
    public tb.d0 findInclusion() {
        l accessor = getAccessor();
        jc.c cVar = this.f84109f;
        tb.d0 d0VarFindPropertyInclusion = cVar == null ? null : cVar.findPropertyInclusion(accessor);
        return d0VarFindPropertyInclusion == null ? tb.d0.empty() : d0VarFindPropertyInclusion;
    }

    @Override // rc.d0
    public t0 findObjectIdInfo() {
        return (t0) n(new y0(this));
    }

    @Override // rc.d0
    public c.a findReferenceType() {
        c.a aVar = this.f84117n;
        c.a aVar2 = f84106o;
        if (aVar != null) {
            if (aVar == aVar2) {
                return null;
            }
            return aVar;
        }
        c.a aVar3 = (c.a) n(new w0(this));
        if (aVar3 != null) {
            aVar2 = aVar3;
        }
        this.f84117n = aVar2;
        return aVar3;
    }

    @Override // rc.d0
    public Class<?>[] findViews() {
        return (Class[]) n(new v0(this));
    }

    public final void g(Collection collection, HashMap map, a aVar) {
        for (a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f84119b) {
            jc.n0 n0Var = aVar2.f84120c;
            if (aVar2.f84121d && n0Var != null) {
                a1 a1Var = (a1) map.get(n0Var);
                if (a1Var == null) {
                    a1Var = new a1(this.f84108e, this.f84109f, this.f84107c, this.f84111h, n0Var);
                    map.put(n0Var, a1Var);
                }
                if (aVar == this.f84112i) {
                    a1Var.f84112i = aVar2.withNext(a1Var.f84112i);
                } else if (aVar == this.f84114k) {
                    a1Var.f84114k = aVar2.withNext(a1Var.f84114k);
                } else if (aVar == this.f84115l) {
                    a1Var.f84115l = aVar2.withNext(a1Var.f84115l);
                } else {
                    if (aVar != this.f84113j) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                    }
                    a1Var.f84113j = aVar2.withNext(a1Var.f84113j);
                }
            } else if (aVar2.f84122e) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + dd.i.name(this.f84110g) + "): found multiple explicit names: " + collection + ", but also implicit accessor: " + aVar2);
            }
        }
    }

    @Override // rc.d0
    public q getConstructorParameter() {
        a aVar = this.f84113j;
        if (aVar == null) {
            return null;
        }
        while (!(((q) aVar.f84118a).getOwner() instanceof g)) {
            aVar = aVar.f84119b;
            if (aVar == null) {
                return (q) this.f84113j.f84118a;
            }
        }
        return (q) aVar.f84118a;
    }

    @Override // rc.d0
    public Iterator<q> getConstructorParameters() {
        a aVar = this.f84113j;
        return aVar == null ? dd.i.emptyIterator() : new b(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    @Override // rc.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rc.i getField() {
        /*
            r6 = this;
            rc.a1$a r0 = r6.f84112i
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r1 = r0.f84118a
            rc.i r1 = (rc.i) r1
            rc.a1$a r0 = r0.f84119b
        Lc:
            if (r0 == 0) goto L6a
            java.lang.Object r2 = r0.f84118a
            rc.i r2 = (rc.i) r2
            java.lang.Class r3 = r1.getDeclaringClass()
            java.lang.Class r4 = r2.getDeclaringClass()
            if (r3 == r4) goto L2a
            boolean r5 = r3.isAssignableFrom(r4)
            if (r5 == 0) goto L23
            goto L36
        L23:
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L2a
            goto L37
        L2a:
            boolean r3 = r1.isStatic()
            boolean r4 = r2.isStatic()
            if (r3 == r4) goto L3a
            if (r3 == 0) goto L37
        L36:
            r1 = r2
        L37:
            rc.a1$a r0 = r0.f84119b
            goto Lc
        L3a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Multiple fields representing property \""
            r3.<init>(r4)
            java.lang.String r4 = r6.getName()
            r3.append(r4)
            java.lang.String r4 = "\": "
            r3.append(r4)
            java.lang.String r1 = r1.getFullName()
            r3.append(r1)
            java.lang.String r1 = " vs "
            r3.append(r1)
            java.lang.String r1 = r2.getFullName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.a1.getField():rc.i");
    }

    @Override // rc.d0
    public jc.n0 getFullName() {
        return this.f84110g;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    @Override // rc.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rc.m getGetter() {
        /*
            r7 = this;
            rc.a1$a r0 = r7.f84114k
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            rc.a1$a r1 = r0.f84119b
            if (r1 != 0) goto Lf
            java.lang.Object r0 = r0.f84118a
            rc.m r0 = (rc.m) r0
            return r0
        Lf:
            java.lang.Object r2 = r0.f84118a
            if (r1 == 0) goto L71
            java.lang.Object r3 = r1.f84118a
            rc.m r2 = (rc.m) r2
            java.lang.Class r4 = r2.getDeclaringClass()
            rc.m r3 = (rc.m) r3
            java.lang.Class r5 = r3.getDeclaringClass()
            if (r4 == r5) goto L31
            boolean r6 = r4.isAssignableFrom(r5)
            if (r6 == 0) goto L2a
            goto L3d
        L2a:
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L31
            goto L3e
        L31:
            int r4 = j(r3)
            int r5 = j(r2)
            if (r4 == r5) goto L41
            if (r4 >= r5) goto L3e
        L3d:
            r0 = r1
        L3e:
            rc.a1$a r1 = r1.f84119b
            goto Lf
        L41:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Conflicting getter definitions for property \""
            r1.<init>(r4)
            java.lang.String r4 = r7.getName()
            r1.append(r4)
            java.lang.String r4 = "\": "
            r1.append(r4)
            java.lang.String r2 = r2.getFullName()
            r1.append(r2)
            java.lang.String r2 = " vs "
            r1.append(r2)
            java.lang.String r2 = r3.getFullName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L71:
            rc.a1$a r0 = r0.withoutNext()
            r7.f84114k = r0
            rc.m r2 = (rc.m) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.a1.getGetter():rc.m");
    }

    @Override // rc.d0
    public String getInternalName() {
        return this.f84111h.getSimpleName();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4 A[PHI: r0 r6
      0x00a4: PHI (r0v4 jc.m0) = (r0v3 jc.m0), (r0v12 jc.m0) binds: [B:39:0x007c, B:48:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v2 boolean) = (r6v1 boolean), (r6v4 boolean) binds: [B:39:0x007c, B:48:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae A[PHI: r1 r3
      0x00ae: PHI (r1v9 tb.e1) = (r1v2 tb.e1), (r1v2 tb.e1), (r1v2 tb.e1), (r1v1 tb.e1) binds: [B:69:0x00e4, B:70:0x00e6, B:72:0x00ec, B:54:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r3v9 tb.e1) = (r3v3 tb.e1), (r3v3 tb.e1), (r3v3 tb.e1), (r3v2 tb.e1) binds: [B:69:0x00e4, B:70:0x00e6, B:72:0x00ec, B:54:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    @Override // rc.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.m0 getMetadata() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.a1.getMetadata():jc.m0");
    }

    @Override // rc.d0, dd.b0
    public String getName() {
        jc.n0 n0Var = this.f84110g;
        if (n0Var == null) {
            return null;
        }
        return n0Var.getSimpleName();
    }

    @Override // rc.d0
    public l getPrimaryMember() {
        if (this.f84107c) {
            return getAccessor();
        }
        l mutator = getMutator();
        return mutator == null ? getAccessor() : mutator;
    }

    @Override // rc.d0
    public jc.o getPrimaryType() {
        if (this.f84107c) {
            rc.b getter = getGetter();
            return (getter == null && (getter = getField()) == null) ? cd.s.unknownType() : getter.getType();
        }
        rc.b constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            m setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        return (constructorParameter == null && (constructorParameter = getGetter()) == null) ? cd.s.unknownType() : constructorParameter.getType();
    }

    @Override // rc.d0
    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    @Override // rc.d0
    public m getSetter() {
        Object obj;
        a aVar = this.f84115l;
        if (aVar == null) {
            return null;
        }
        a aVar2 = aVar.f84119b;
        if (aVar2 == null) {
            return (m) aVar.f84118a;
        }
        while (true) {
            Object obj2 = aVar.f84118a;
            if (aVar2 == null) {
                this.f84115l = aVar.withoutNext();
                return (m) obj2;
            }
            a aVar3 = aVar2.f84119b;
            Object obj3 = aVar2.f84118a;
            m mVarM = m((m) obj2, (m) obj3);
            if (mVarM != obj2) {
                if (mVarM != obj3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj2);
                    arrayList.add(obj3);
                    while (true) {
                        obj = aVar.f84118a;
                        if (aVar3 == null) {
                            break;
                        }
                        Object obj4 = aVar3.f84118a;
                        m mVarM2 = m((m) obj, (m) obj4);
                        if (mVarM2 != obj) {
                            if (mVarM2 == obj4) {
                                arrayList.clear();
                                aVar = aVar3;
                            } else {
                                arrayList.add(obj4);
                            }
                        }
                        aVar3 = aVar3.f84119b;
                    }
                    if (arrayList.isEmpty()) {
                        this.f84115l = aVar.withoutNext();
                        return (m) obj;
                    }
                    throw new IllegalArgumentException(a.b.m("Conflicting setter definitions for property \"", getName(), "\": ", (String) arrayList.stream().map(new nh.w0(23)).collect(Collectors.joining(" vs "))));
                }
                aVar = aVar2;
            }
            aVar2 = aVar3;
        }
    }

    @Override // rc.d0
    public jc.n0 getWrapperName() {
        jc.c cVar;
        l primaryMember = getPrimaryMember();
        if (primaryMember == null || (cVar = this.f84109f) == null) {
            return null;
        }
        return cVar.findWrapperName(primaryMember);
    }

    @Override // rc.d0
    public boolean hasConstructorParameter() {
        return this.f84113j != null;
    }

    public boolean hasExplicitName(jc.n0 n0Var) {
        return k(this.f84112i, n0Var) || k(this.f84114k, n0Var) || k(this.f84115l, n0Var) || k(this.f84113j, n0Var);
    }

    @Override // rc.d0
    public boolean hasField() {
        return this.f84112i != null;
    }

    public boolean hasFieldOrGetter(l lVar) {
        Member member = lVar.getMember();
        for (a aVar = this.f84112i; aVar != null; aVar = aVar.f84119b) {
            if (((l) aVar.f84118a).getMember() == member) {
                return true;
            }
        }
        Member member2 = lVar.getMember();
        for (a aVar2 = this.f84114k; aVar2 != null; aVar2 = aVar2.f84119b) {
            if (((l) aVar2.f84118a).getMember() == member2) {
                return true;
            }
        }
        return false;
    }

    @Override // rc.d0
    public boolean hasGetter() {
        return this.f84114k != null;
    }

    @Override // rc.d0
    public boolean hasName(jc.n0 n0Var) {
        return this.f84110g.equals(n0Var);
    }

    @Override // rc.d0
    public boolean hasSetter() {
        return this.f84115l != null;
    }

    @Override // rc.d0
    public boolean isExplicitlyIncluded() {
        return b(this.f84112i) || b(this.f84114k) || b(this.f84115l) || a(this.f84113j);
    }

    @Override // rc.d0
    public boolean isExplicitlyNamed() {
        return a(this.f84112i) || a(this.f84114k) || a(this.f84115l) || a(this.f84113j);
    }

    @Override // rc.d0
    public boolean isTypeId() {
        Boolean bool = (Boolean) n(new x0(this));
        return bool != null && bool.booleanValue();
    }

    public final m m(m mVar, m mVar2) {
        Class<?> declaringClass = mVar.getDeclaringClass();
        Class<?> declaringClass2 = mVar2.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (!declaringClass.isAssignableFrom(declaringClass2)) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
        }
        String name = mVar2.getName();
        char c10 = 2;
        char c11 = (!name.startsWith("set") || name.length() <= 3) ? (char) 2 : (char) 1;
        String name2 = mVar.getName();
        if (name2.startsWith("set") && name2.length() > 3) {
            c10 = 1;
        }
        if (c11 != c10) {
            return c11 < c10 ? mVar2 : mVar;
        }
        jc.c cVar = this.f84109f;
        if (cVar == null) {
            return null;
        }
        return cVar.resolveSetterConflict(this.f84108e, mVar, mVar2);
    }

    public void mergeAnnotations(boolean z10) {
        if (z10) {
            a aVar = this.f84114k;
            if (aVar != null) {
                this.f84114k = f(this.f84114k, l(0, aVar, this.f84112i, this.f84113j, this.f84115l));
                return;
            }
            a aVar2 = this.f84112i;
            if (aVar2 != null) {
                this.f84112i = f(this.f84112i, l(0, aVar2, this.f84113j, this.f84115l));
                return;
            }
            return;
        }
        a aVar3 = this.f84113j;
        if (aVar3 != null) {
            this.f84113j = f(this.f84113j, l(0, aVar3, this.f84115l, this.f84112i, this.f84114k));
            return;
        }
        a aVar4 = this.f84115l;
        if (aVar4 != null) {
            this.f84115l = f(this.f84115l, l(0, aVar4, this.f84112i, this.f84114k));
            return;
        }
        a aVar5 = this.f84112i;
        if (aVar5 != null) {
            this.f84112i = f(this.f84112i, l(0, aVar5, this.f84114k));
        }
    }

    public final Object n(b1 b1Var) {
        a aVar;
        a aVar2;
        if (this.f84109f != null) {
            if (this.f84107c) {
                a aVar3 = this.f84114k;
                if (aVar3 != null) {
                    objWithMember = b1Var.withMember((l) aVar3.f84118a);
                }
            } else {
                a aVar4 = this.f84113j;
                objWithMember = aVar4 != null ? b1Var.withMember((l) aVar4.f84118a) : null;
                if (objWithMember == null && (aVar = this.f84115l) != null) {
                    objWithMember = b1Var.withMember((l) aVar.f84118a);
                }
            }
            if (objWithMember == null && (aVar2 = this.f84112i) != null) {
                return b1Var.withMember((l) aVar2.f84118a);
            }
        }
        return objWithMember;
    }

    public void removeConstructors() {
        this.f84113j = null;
    }

    public void removeFields() {
        this.f84112i = null;
    }

    public void removeIgnored() {
        a aVarWithoutIgnored = this.f84112i;
        if (aVarWithoutIgnored != null) {
            aVarWithoutIgnored = aVarWithoutIgnored.withoutIgnored();
        }
        this.f84112i = aVarWithoutIgnored;
        a aVarWithoutIgnored2 = this.f84114k;
        if (aVarWithoutIgnored2 != null) {
            aVarWithoutIgnored2 = aVarWithoutIgnored2.withoutIgnored();
        }
        this.f84114k = aVarWithoutIgnored2;
        a aVarWithoutIgnored3 = this.f84115l;
        if (aVarWithoutIgnored3 != null) {
            aVarWithoutIgnored3 = aVarWithoutIgnored3.withoutIgnored();
        }
        this.f84115l = aVarWithoutIgnored3;
        a aVarWithoutIgnored4 = this.f84113j;
        if (aVarWithoutIgnored4 != null) {
            aVarWithoutIgnored4 = aVarWithoutIgnored4.withoutIgnored();
        }
        this.f84113j = aVarWithoutIgnored4;
    }

    public tb.k0 removeNonVisible(boolean z10, u0 u0Var) {
        tb.k0 k0VarFindAccess = findAccess();
        if (k0VarFindAccess == null) {
            k0VarFindAccess = tb.k0.f86732b;
        }
        int iOrdinal = k0VarFindAccess.ordinal();
        boolean z11 = this.f84107c;
        if (iOrdinal == 1) {
            if (u0Var != null) {
                u0Var.d(getName());
                Iterator<jc.n0> it = findExplicitNames().iterator();
                while (it.hasNext()) {
                    u0Var.d(it.next().getSimpleName());
                }
            }
            this.f84115l = null;
            this.f84113j = null;
            if (!z11) {
                this.f84112i = null;
            }
        } else if (iOrdinal == 2) {
            this.f84114k = null;
            if (z11) {
                this.f84112i = null;
                return k0VarFindAccess;
            }
        } else if (iOrdinal != 3) {
            a aVarWithoutNonVisible = this.f84114k;
            if (aVarWithoutNonVisible != null) {
                aVarWithoutNonVisible = aVarWithoutNonVisible.withoutNonVisible();
            }
            this.f84114k = aVarWithoutNonVisible;
            a aVarWithoutNonVisible2 = this.f84113j;
            if (aVarWithoutNonVisible2 != null) {
                aVarWithoutNonVisible2 = aVarWithoutNonVisible2.withoutNonVisible();
            }
            this.f84113j = aVarWithoutNonVisible2;
            if (!z10 || this.f84114k == null) {
                a aVarWithoutNonVisible3 = this.f84112i;
                if (aVarWithoutNonVisible3 != null) {
                    aVarWithoutNonVisible3 = aVarWithoutNonVisible3.withoutNonVisible();
                }
                this.f84112i = aVarWithoutNonVisible3;
                a aVarWithoutNonVisible4 = this.f84115l;
                if (aVarWithoutNonVisible4 != null) {
                    aVarWithoutNonVisible4 = aVarWithoutNonVisible4.withoutNonVisible();
                }
                this.f84115l = aVarWithoutNonVisible4;
                return k0VarFindAccess;
            }
        }
        return k0VarFindAccess;
    }

    public String toString() {
        return "[Property '" + this.f84110g + "'; ctors: " + this.f84113j + ", field(s): " + this.f84112i + ", getter(s): " + this.f84114k + ", setter(s): " + this.f84115l + C3191e4.i.f36531e;
    }

    public void trimByVisibility() {
        a aVarTrimByVisibility = this.f84112i;
        if (aVarTrimByVisibility != null) {
            aVarTrimByVisibility = aVarTrimByVisibility.trimByVisibility();
        }
        this.f84112i = aVarTrimByVisibility;
        a aVarTrimByVisibility2 = this.f84114k;
        if (aVarTrimByVisibility2 != null) {
            aVarTrimByVisibility2 = aVarTrimByVisibility2.trimByVisibility();
        }
        this.f84114k = aVarTrimByVisibility2;
        a aVarTrimByVisibility3 = this.f84115l;
        if (aVarTrimByVisibility3 != null) {
            aVarTrimByVisibility3 = aVarTrimByVisibility3.trimByVisibility();
        }
        this.f84115l = aVarTrimByVisibility3;
        a aVarTrimByVisibility4 = this.f84113j;
        if (aVarTrimByVisibility4 != null) {
            aVarTrimByVisibility4 = aVarTrimByVisibility4.trimByVisibility();
        }
        this.f84113j = aVarTrimByVisibility4;
    }

    public a1(lc.z zVar, jc.c cVar, boolean z10, jc.n0 n0Var, jc.n0 n0Var2) {
        this.f84108e = zVar;
        this.f84109f = cVar;
        this.f84111h = n0Var;
        this.f84110g = n0Var2;
        this.f84107c = z10;
    }

    @Override // java.lang.Comparable
    public int compareTo(a1 a1Var) {
        if (this.f84113j != null) {
            if (a1Var.f84113j == null) {
                return -1;
            }
        } else if (a1Var.f84113j != null) {
            return 1;
        }
        return getName().compareTo(a1Var.getName());
    }

    @Override // rc.d0
    public a1 withName(jc.n0 n0Var) {
        return new a1(this, n0Var);
    }

    @Override // rc.d0
    public a1 withSimpleName(String str) {
        jc.n0 n0Var = this.f84110g;
        jc.n0 n0VarWithSimpleName = n0Var.withSimpleName(str);
        return n0VarWithSimpleName == n0Var ? this : new a1(this, n0VarWithSimpleName);
    }

    public a1(a1 a1Var, jc.n0 n0Var) {
        this.f84108e = a1Var.f84108e;
        this.f84109f = a1Var.f84109f;
        this.f84111h = a1Var.f84111h;
        this.f84110g = n0Var;
        this.f84112i = a1Var.f84112i;
        this.f84113j = a1Var.f84113j;
        this.f84114k = a1Var.f84114k;
        this.f84115l = a1Var.f84115l;
        this.f84107c = a1Var.f84107c;
    }
}
