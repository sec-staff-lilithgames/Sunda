package p0;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z implements w {
    public int B;
    public int C;
    public boolean D;
    public final a0 E;
    public final ArrayList F;
    public boolean G;
    public boolean H;
    public r4 I;
    public s4 J;
    public v4 K;
    public boolean L;
    public z2 M;
    public q0.a N;
    public final q0.b O;
    public p0.b P;
    public q0.c Q;
    public final d1.g R;
    public final zu.m S;
    public boolean T;
    public long U;
    public h0 V;

    /* renamed from: a, reason: collision with root package name */
    public final d f80616a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f80617b;

    /* renamed from: c, reason: collision with root package name */
    public final s4 f80618c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f80619d;

    /* renamed from: e, reason: collision with root package name */
    public final q0.a f80620e;

    /* renamed from: f, reason: collision with root package name */
    public final q0.a f80621f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f80622g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f80623h;

    /* renamed from: j, reason: collision with root package name */
    public x2 f80625j;

    /* renamed from: k, reason: collision with root package name */
    public int f80626k;

    /* renamed from: l, reason: collision with root package name */
    public int f80627l;

    /* renamed from: m, reason: collision with root package name */
    public int f80628m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f80630o;

    /* renamed from: p, reason: collision with root package name */
    public z.h0 f80631p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f80632q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f80633r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f80634s;

    /* renamed from: w, reason: collision with root package name */
    public z.j0 f80638w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f80639x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f80641z;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f80624i = u5.m5841constructorimpl$default(null, 1, null);

    /* renamed from: n, reason: collision with root package name */
    public final r1 f80629n = new r1();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f80635t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final r1 f80636u = new r1();

    /* renamed from: v, reason: collision with root package name */
    public z2 f80637v = z0.z.persistentCompositionLocalHashMapOf();

    /* renamed from: y, reason: collision with root package name */
    public final r1 f80640y = new r1();
    public int A = -1;

    public z(d dVar, f0 f0Var, s4 s4Var, Set<j4> set, q0.a aVar, q0.a aVar2, r0 r0Var, j0 j0Var) {
        this.f80616a = dVar;
        this.f80617b = f0Var;
        this.f80618c = s4Var;
        this.f80619d = set;
        this.f80620e = aVar;
        this.f80621f = aVar2;
        this.f80622g = r0Var;
        this.f80623h = j0Var;
        this.D = f0Var.getCollectingSourceInformation$runtime() || f0Var.getCollectingCallByInformation$runtime();
        this.E = new a0(this);
        this.F = u5.m5841constructorimpl$default(null, 1, null);
        r4 r4VarOpenReader = s4Var.openReader();
        r4VarOpenReader.close();
        this.I = r4VarOpenReader;
        s4 s4Var2 = new s4();
        if (f0Var.getCollectingSourceInformation$runtime()) {
            s4Var2.collectSourceInformation();
        }
        if (f0Var.getCollectingCallByInformation$runtime()) {
            s4Var2.collectCalledByInformation();
        }
        this.J = s4Var2;
        v4 v4VarOpenWriter = s4Var2.openWriter();
        v4VarOpenWriter.close(true);
        this.K = v4VarOpenWriter;
        this.O = new q0.b(this, aVar);
        r4 r4VarOpenReader2 = this.J.openReader();
        try {
            p0.b bVarAnchor = r4VarOpenReader2.anchor(0);
            r4VarOpenReader2.close();
            this.P = bVarAnchor;
            this.Q = new q0.c();
            this.R = new d1.g(this);
            zu.m effectCoroutineContext = f0Var.getEffectCoroutineContext();
            zu.m errorContext$runtime = getErrorContext$runtime();
            this.S = effectCoroutineContext.plus(errorContext$runtime == null ? zu.n.f98854b : errorContext$runtime);
        } catch (Throwable th2) {
            r4VarOpenReader2.close();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p0.i2 u(p0.z r13, int r14) {
        /*
            p0.r4 r0 = r13.I
            int r0 = r0.groupKey(r14)
            p0.r4 r1 = r13.I
            java.lang.Object r1 = r1.groupObjectKey(r14)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L90
            boolean r0 = r1 instanceof p0.f2
            if (r0 == 0) goto L90
            p0.r4 r0 = r13.I
            boolean r0 = r0.containsMark(r14)
            if (r0 == 0) goto L2e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            v(r13, r0, r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2e
            r12 = r0
            goto L2f
        L2e:
            r12 = r3
        L2f:
            p0.r4 r0 = r13.I
            java.lang.Object r0 = r0.groupObjectKey(r14)
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>"
            kotlin.jvm.internal.e0.checkNotNull(r0, r1)
            r5 = r0
            p0.f2 r5 = (p0.f2) r5
            p0.r4 r0 = r13.I
            r1 = 0
            java.lang.Object r6 = r0.groupGet(r14, r1)
            p0.r4 r0 = r13.I
            p0.b r9 = r0.anchor(r14)
            p0.r4 r0 = r13.I
            int r0 = r0.groupSize(r14)
            int r0 = r0 + r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = r13.f80635t
            int r2 = p0.d0.access$findInsertLocation(r1, r14)
        L5c:
            int r3 = r1.size()
            if (r2 >= r3) goto L80
            java.lang.Object r3 = r1.get(r2)
            p0.s1 r3 = (p0.s1) r3
            int r4 = r3.getLocation()
            if (r4 >= r0) goto L80
            p0.k3 r4 = r3.getScope()
            java.lang.Object r3 = r3.getInstances()
            tu.v r3 = tu.e0.to(r4, r3)
            r10.add(r3)
            int r2 = r2 + 1
            goto L5c
        L80:
            p0.i2 r4 = new p0.i2
            p0.j0 r7 = r13.getComposition()
            p0.s4 r8 = r13.f80618c
            p0.z2 r11 = r13.e(r14)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.u(p0.z, int):p0.i2");
    }

    public static final void v(z zVar, ArrayList arrayList, int i10) {
        int iGroupSize = zVar.I.groupSize(i10) + i10;
        int iGroupSize2 = i10 + 1;
        while (iGroupSize2 < iGroupSize) {
            if (zVar.I.hasMark(iGroupSize2)) {
                i2 i2VarU = u(zVar, iGroupSize2);
                if (i2VarU != null) {
                    arrayList.add(i2VarU);
                }
            } else if (zVar.I.containsMark(iGroupSize2)) {
                v(zVar, arrayList, iGroupSize2);
            }
            iGroupSize2 += zVar.I.groupSize(iGroupSize2);
        }
    }

    public static final int w(z zVar, int i10, int i11, boolean z10, int i12) {
        r4 r4Var = zVar.I;
        f0 f0Var = zVar.f80617b;
        q0.b bVar = zVar.O;
        if (r4Var.hasMark(i11)) {
            int iGroupKey = r4Var.groupKey(i11);
            Object objGroupObjectKey = r4Var.groupObjectKey(i11);
            if (iGroupKey == 126665345 && (objGroupObjectKey instanceof f2)) {
                i2 i2VarU = u(zVar, i11);
                if (i2VarU != null) {
                    f0Var.deletedMovableContent$runtime(i2VarU);
                    bVar.recordSlotEditing();
                    bVar.releaseMovableGroupAtCurrent(zVar.getComposition(), f0Var, i2VarU);
                }
                if (!z10 || i11 == i10) {
                    return r4Var.nodeCount(i11);
                }
                bVar.endNodeMovementAndDeleteNode(i12, i11);
                return 0;
            }
            if (iGroupKey == 206 && kotlin.jvm.internal.e0.areEqual(objGroupObjectKey, d0.getReference())) {
                Object objGroupGet = r4Var.groupGet(i11, 0);
                a aVar = objGroupGet instanceof a ? (a) objGroupGet : null;
                if (aVar != null) {
                    for (z zVar2 : aVar.getRef().getComposers()) {
                        q0.b bVar2 = zVar2.O;
                        s4 s4Var = zVar2.f80618c;
                        if (s4Var.containsMark()) {
                            zVar2.getComposition().updateMovingInvalidations$runtime();
                            q0.a aVar2 = new q0.a();
                            zVar2.N = aVar2;
                            r4 r4VarOpenReader = s4Var.openReader();
                            try {
                                zVar2.I = r4VarOpenReader;
                                q0.a changeList = bVar2.getChangeList();
                                try {
                                    bVar2.setChangeList(aVar2);
                                    zVar2.t(0);
                                    bVar2.releaseMovableContent();
                                } finally {
                                }
                            } finally {
                                r4VarOpenReader.close();
                            }
                        }
                        f0Var.reportRemovedComposition$runtime(zVar2.getComposition());
                    }
                }
                return r4Var.nodeCount(i11);
            }
            if (!r4Var.isNode(i11)) {
                return r4Var.nodeCount(i11);
            }
        } else if (r4Var.containsMark(i11)) {
            int iGroupSize = r4Var.groupSize(i11) + i11;
            int iW = 0;
            for (int iGroupSize2 = i11 + 1; iGroupSize2 < iGroupSize; iGroupSize2 += r4Var.groupSize(iGroupSize2)) {
                boolean zIsNode = r4Var.isNode(iGroupSize2);
                if (zIsNode) {
                    bVar.endNodeMovement();
                    bVar.moveDown(r4Var.node(iGroupSize2));
                }
                iW += w(zVar, i10, iGroupSize2, zIsNode || z10, zIsNode ? 0 : i12 + iW);
                if (zIsNode) {
                    bVar.endNodeMovement();
                    bVar.moveUp();
                }
            }
            if (!r4Var.isNode(i11)) {
                return iW;
            }
        } else if (!r4Var.isNode(i11)) {
            return r4Var.nodeCount(i11);
        }
        return 1;
    }

    public final void A() {
        this.f80628m = 0;
        this.I = this.f80618c.openReader();
        o1 o1Var = p1.f80389b;
        x(100, null, null, o1Var.m5819getGroupULZAiWs());
        f0 f0Var = this.f80617b;
        f0Var.startComposing$runtime();
        z2 compositionLocalScope$runtime = f0Var.getCompositionLocalScope$runtime();
        this.f80640y.push(d0.access$asInt(this.f80639x));
        this.f80639x = changed(compositionLocalScope$runtime);
        this.M = null;
        if (!this.f80632q) {
            this.f80632q = f0Var.getCollectingParameterInformation$runtime();
        }
        if (!this.D) {
            this.D = f0Var.getCollectingSourceInformation$runtime();
        }
        if (this.D) {
            l0 localCompositionErrorContext = d1.h.getLocalCompositionErrorContext();
            kotlin.jvm.internal.e0.checkNotNull(localCompositionErrorContext, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new x5(getErrorContext$runtime()));
        }
        this.f80637v = compositionLocalScope$runtime;
        Set<d1.e> set = (Set) q0.read(compositionLocalScope$runtime, d1.p.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            f0Var.recordInspectionTable$runtime(set);
        }
        x(Long.hashCode(f0Var.getCompositeKeyHashCode$runtime()), null, null, o1Var.m5819getGroupULZAiWs());
    }

    public final void B(int i10, int i11) {
        if (D(i10) != i11) {
            if (i10 < 0) {
                z.h0 h0Var = this.f80631p;
                if (h0Var == null) {
                    h0Var = new z.h0(0, 1, null);
                    this.f80631p = h0Var;
                }
                h0Var.set(i10, i11);
                return;
            }
            int[] iArr = this.f80630o;
            if (iArr == null) {
                int[] iArr2 = new int[this.I.getSize()];
                uu.f0.fill$default(iArr2, -1, 0, 0, 6, (Object) null);
                this.f80630o = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    public final void C(int i10, int i11) {
        int iD = D(i10);
        if (iD != i11) {
            int i12 = i11 - iD;
            ArrayList arrayList = this.f80624i;
            int iM5844getSizeimpl = u5.m5844getSizeimpl(arrayList) - 1;
            while (i10 != -1) {
                int iD2 = D(i10) + i12;
                B(i10, iD2);
                int i13 = iM5844getSizeimpl;
                while (true) {
                    if (-1 < i13) {
                        x2 x2Var = (x2) u5.m5849peekimpl(arrayList, i13);
                        if (x2Var != null && x2Var.updateNodeCount(i10, iD2)) {
                            iM5844getSizeimpl = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.I.getParent();
                } else if (this.I.isNode(i10)) {
                    return;
                } else {
                    i10 = this.I.parent(i10);
                }
            }
        }
    }

    public final int D(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f80630o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.I.nodeCount(i10) : i11;
        }
        z.h0 h0Var = this.f80631p;
        if (h0Var == null || !h0Var.containsKey(i10)) {
            return 0;
        }
        return h0Var.get(i10);
    }

    public final void a() {
        b();
        u5.m5839clearimpl(this.f80624i);
        this.f80629n.clear();
        this.f80636u.clear();
        this.f80640y.clear();
        this.f80638w = null;
        this.Q.clear();
        this.U = 0;
        this.B = 0;
        this.f80634s = false;
        this.T = false;
        this.f80641z = false;
        this.G = false;
        this.f80633r = false;
        this.A = -1;
        if (!this.I.getClosed()) {
            this.I.close();
        }
        if (this.K.getClosed()) {
            return;
        }
        l();
    }

    @Override // p0.w
    public <V, T> void apply(V v10, kv.p pVar) {
        if (getInserting()) {
            this.Q.updateNode(v10, pVar);
        } else {
            this.O.updateNode(v10, pVar);
        }
    }

    public final void b() {
        this.f80625j = null;
        this.f80626k = 0;
        this.f80627l = 0;
        this.U = 0L;
        this.f80634s = false;
        this.O.resetTransientState();
        u5.m5839clearimpl(this.F);
        this.f80630o = null;
        this.f80631p = null;
    }

    @Override // p0.w
    public f0 buildContext() {
        y(206, d0.getReference());
        if (getInserting()) {
            v4.markGroup$default(this.K, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        a aVar = objNextSlot instanceof a ? (a) objNextSlot : null;
        if (aVar == null) {
            long compositeKeyHashCode = getCompositeKeyHashCode();
            boolean z10 = this.f80632q;
            boolean z11 = this.D;
            j0 composition = getComposition();
            if (composition == null) {
                composition = null;
            }
            aVar = new a(new b(compositeKeyHashCode, z10, z11, composition != null ? composition.getObserverHolder$runtime() : null));
            updateValue(aVar);
        }
        aVar.getRef().updateCompositionLocalScope(d());
        i(false);
        return aVar.getRef();
    }

    public final void c() {
        if (!this.K.getClosed()) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        l();
    }

    public final <T> T cache(boolean z10, kv.a aVar) {
        T t10 = (T) nextSlotForCache();
        if (t10 != v.f80515a.getEmpty() && !z10) {
            return t10;
        }
        T t11 = (T) aVar.invoke();
        updateCachedValue(t11);
        return t11;
    }

    @Override // p0.w
    public boolean changed(Object obj) {
        if (kotlin.jvm.internal.e0.areEqual(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // p0.w
    public boolean changedInstance(Object obj) {
        if (nextSlot() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    public final void changesApplied$runtime() {
        this.f80638w = null;
    }

    @Override // p0.w
    public void collectParameterInformation() {
        this.f80632q = true;
        this.D = true;
        this.f80618c.collectSourceInformation();
        this.J.collectSourceInformation();
        this.K.updateToTableMaps();
    }

    /* renamed from: composeContent--ZbOJvo$runtime, reason: not valid java name */
    public final void m5857composeContentZbOJvo$runtime(z.u0 u0Var, kv.p pVar, p4 p4Var) {
        if (!this.f80620e.isEmpty()) {
            d0.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        g(u0Var, pVar);
    }

    @Override // p0.w
    public <T> T consume(l0 l0Var) {
        return (T) q0.read(d(), l0Var);
    }

    @Override // p0.w
    public <T> void createNode(kv.a aVar) {
        if (!this.f80634s) {
            d0.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f80634s = false;
        if (!getInserting()) {
            d0.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.f80629n.peek();
        v4 v4Var = this.K;
        p0.b bVarAnchor = v4Var.anchor(v4Var.getParent());
        this.f80627l++;
        this.Q.createAndInsertNode(aVar, iPeek, bVarAnchor);
    }

    public final z2 d() {
        z2 z2Var = this.M;
        return z2Var != null ? z2Var : e(this.I.getParent());
    }

    public final void deactivate$runtime() {
        u5.m5839clearimpl(this.F);
        this.f80635t.clear();
        this.f80620e.clear();
        this.f80638w = null;
    }

    @Override // p0.w
    public void deactivateToEndGroup(boolean z10) {
        if (this.f80627l != 0) {
            d0.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z10) {
            this.f80627l = this.I.getParentNodes();
            this.I.skipToGroupEnd();
            return;
        }
        int currentGroup = this.I.getCurrentGroup();
        int currentEnd = this.I.getCurrentEnd();
        this.O.deactivateCurrentGroup();
        d0.access$removeRange(this.f80635t, currentGroup, currentEnd);
        this.I.skipToGroupEnd();
    }

    @Override // p0.w
    public void disableReusing() {
        this.f80641z = false;
    }

    @Override // p0.w
    public void disableSourceInformation() {
        this.D = false;
    }

    public final void dispose$runtime() {
        z0.j0 j0Var = z0.j0.f97136a;
        Object objBeginSection = j0Var.beginSection("Compose:Composer.dispose");
        try {
            this.f80617b.unregisterComposer$runtime(this);
            deactivate$runtime();
            getApplier().clear();
            this.H = true;
        } finally {
            j0Var.endSection(objBeginSection);
        }
    }

    public final z2 e(int i10) {
        z2 z2Var;
        if (getInserting() && this.L) {
            int parent = this.K.getParent();
            while (parent > 0) {
                if (this.K.groupKey(parent) == 202 && kotlin.jvm.internal.e0.areEqual(this.K.groupObjectKey(parent), d0.getCompositionLocalMap())) {
                    Object objGroupAux = this.K.groupAux(parent);
                    kotlin.jvm.internal.e0.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    z2 z2Var2 = (z2) objGroupAux;
                    this.M = z2Var2;
                    return z2Var2;
                }
                parent = this.K.parent(parent);
            }
        }
        if (this.I.getSize() > 0) {
            while (i10 > 0) {
                if (this.I.groupKey(i10) == 202 && kotlin.jvm.internal.e0.areEqual(this.I.groupObjectKey(i10), d0.getCompositionLocalMap())) {
                    z.j0 j0Var = this.f80638w;
                    if (j0Var == null || (z2Var = (z2) j0Var.get(i10)) == null) {
                        Object objGroupAux2 = this.I.groupAux(i10);
                        kotlin.jvm.internal.e0.checkNotNull(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        z2Var = (z2) objGroupAux2;
                    }
                    this.M = z2Var;
                    return z2Var;
                }
                i10 = this.I.parent(i10);
            }
        }
        z2 z2Var3 = this.f80637v;
        this.M = z2Var3;
        return z2Var3;
    }

    @Override // p0.w
    public void enableReusing() {
        this.f80641z = this.A >= 0;
    }

    @Override // p0.w
    public void endDefaults() {
        i(false);
        k3 currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // p0.w
    public void endMovableGroup() {
        i(false);
    }

    @Override // p0.w
    public void endNode() {
        i(true);
    }

    @Override // p0.w
    public void endProvider() {
        i(false);
        i(false);
        this.f80639x = d0.access$asBool(this.f80640y.pop());
        this.M = null;
    }

    @Override // p0.w
    public void endProviders() {
        i(false);
        i(false);
        this.f80639x = d0.access$asBool(this.f80640y.pop());
        this.M = null;
    }

    @Override // p0.w
    public void endReplaceGroup() {
        i(false);
    }

    @Override // p0.w
    public void endReplaceableGroup() {
        i(false);
    }

    @Override // p0.w
    public o4 endRestartGroup() {
        p0.b bVarAnchor;
        ArrayList arrayList = this.F;
        k3 k3Var = null;
        k3 k3Var2 = u5.m5847isNotEmptyimpl(arrayList) ? (k3) u5.m5850popimpl(arrayList) : null;
        if (k3Var2 != null) {
            k3Var2.setRequiresRecompose(false);
            this.f80622g.current();
            kv.l lVarEnd = k3Var2.end(this.C);
            q0.b bVar = this.O;
            if (lVarEnd != null) {
                bVar.endCompositionScope(lVarEnd, getComposition());
            }
            if (k3Var2.getResuming()) {
                k3Var2.setResuming(false);
                bVar.endResumingScope(k3Var2);
                k3Var2.setReusing(false);
                if (k3Var2.getResetReusing()) {
                    k3Var2.setResetReusing(false);
                    this.f80641z = false;
                }
            }
        }
        if (k3Var2 != null && !k3Var2.getSkipped$runtime() && (k3Var2.getUsed() || this.f80632q)) {
            if (k3Var2.getAnchor() == null) {
                if (getInserting()) {
                    v4 v4Var = this.K;
                    bVarAnchor = v4Var.anchor(v4Var.getParent());
                } else {
                    r4 r4Var = this.I;
                    bVarAnchor = r4Var.anchor(r4Var.getParent());
                }
                k3Var2.setAnchor(bVarAnchor);
            }
            k3Var2.setDefaultsInvalid(false);
            k3Var = k3Var2;
        }
        i(false);
        return k3Var;
    }

    @Override // p0.w
    public void endReusableGroup() {
        if (this.f80641z && this.I.getParent() == this.A) {
            this.A = -1;
            this.f80641z = false;
        }
        i(false);
    }

    public final void endReuseFromRoot() {
        if (this.G || this.A != 100) {
            a3.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.A = -1;
        this.f80641z = false;
    }

    @Override // p0.w
    public void endToMarker(int i10) {
        if (i10 < 0) {
            int i11 = -i10;
            v4 v4Var = this.K;
            while (true) {
                int parent = v4Var.getParent();
                if (parent <= i11) {
                    return;
                } else {
                    i(v4Var.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                v4 v4Var2 = this.K;
                while (getInserting()) {
                    i(v4Var2.isNode(v4Var2.getParent()));
                }
            }
            r4 r4Var = this.I;
            while (true) {
                int parent2 = r4Var.getParent();
                if (parent2 <= i10) {
                    return;
                } else {
                    i(r4Var.isNode(parent2));
                }
            }
        }
    }

    public final List f() {
        if (!this.D) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(d1.b.buildTrace$default(this.K, null, 0, null, 7, null));
        arrayList.addAll(d1.b.buildTrace(this.I));
        arrayList.addAll(parentStackTrace());
        return arrayList;
    }

    public final boolean forceRecomposeScopes$runtime() {
        if (this.f80632q) {
            return false;
        }
        this.f80632q = true;
        this.f80633r = true;
        return true;
    }

    public final void g(z.u0 u0Var, kv.p pVar) {
        ArrayList arrayList = this.f80635t;
        if (this.G) {
            d0.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        this.f80622g.current();
        z0.j0 j0Var = z0.j0.f97136a;
        Object objBeginSection = j0Var.beginSection("Compose:recompose");
        try {
            this.C = Long.hashCode(b1.y.currentSnapshot().getSnapshotId());
            this.f80638w = null;
            m5859updateComposerInvalidationsRY85e9Y(u0Var);
            this.f80626k = 0;
            this.G = true;
            try {
                A();
                Object objNextSlot = nextSlot();
                if (objNextSlot != pVar && pVar != null) {
                    updateValue(pVar);
                }
                a0 a0Var = this.E;
                r0.c cVarDerivedStateObservers = z4.derivedStateObservers();
                try {
                    cVarDerivedStateObservers.add(a0Var);
                    if (pVar != null) {
                        y(200, d0.getInvocation());
                        z0.v.invokeComposable(this, pVar);
                        i(false);
                    } else if ((!this.f80633r && !this.f80639x) || objNextSlot == null || kotlin.jvm.internal.e0.areEqual(objNextSlot, v.f80515a.getEmpty())) {
                        skipCurrentGroup();
                    } else {
                        y(200, d0.getInvocation());
                        z0.v.invokeComposable(this, (kv.p) kotlin.jvm.internal.h1.beforeCheckcastToFunctionOfArity(objNextSlot, 2));
                        i(false);
                    }
                    cVarDerivedStateObservers.removeAt(cVarDerivedStateObservers.getSize() - 1);
                    j();
                    this.G = false;
                    arrayList.clear();
                    c();
                } catch (Throwable th2) {
                    cVarDerivedStateObservers.removeAt(cVarDerivedStateObservers.getSize() - 1);
                    throw th2;
                }
            } finally {
            }
        } finally {
            j0Var.endSection(objBeginSection);
        }
    }

    @Override // p0.w
    public d getApplier() {
        return this.f80616a;
    }

    @Override // p0.w
    public zu.m getApplyCoroutineContext() {
        return this.S;
    }

    public final boolean getAreChildrenComposing$runtime() {
        return this.B > 0;
    }

    public final int getChangeCount$runtime() {
        return this.f80620e.getSize();
    }

    @Override // p0.w
    public long getCompositeKeyHashCode() {
        return this.U;
    }

    @Override // p0.w
    public d1.e getCompositionData() {
        h0 h0Var = this.V;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(getComposition());
        this.V = h0Var2;
        return h0Var2;
    }

    @Override // p0.w
    public /* bridge */ /* synthetic */ int getCompoundKeyHash() {
        return super.getCompoundKeyHash();
    }

    @Override // p0.w
    public p0 getCurrentCompositionLocalMap() {
        return d();
    }

    @Override // p0.w
    public int getCurrentMarker() {
        return getInserting() ? -this.K.getParent() : this.I.getParent();
    }

    public final k3 getCurrentRecomposeScope$runtime() {
        if (this.B != 0) {
            return null;
        }
        ArrayList arrayList = this.F;
        if (u5.m5847isNotEmptyimpl(arrayList)) {
            return (k3) u5.m5848peekimpl(arrayList);
        }
        return null;
    }

    @Override // p0.w
    public boolean getDefaultsInvalid() {
        k3 currentRecomposeScope$runtime;
        return !getSkipping() || this.f80639x || ((currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && currentRecomposeScope$runtime.getDefaultsInvalid());
    }

    public final q0.a getDeferredChanges$runtime() {
        return this.N;
    }

    public final d1.g getErrorContext$runtime() {
        if (this.D) {
            return this.R;
        }
        return null;
    }

    public final boolean getHasInvalidations() {
        return !this.f80635t.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime() {
        return this.f80620e.isNotEmpty();
    }

    public final s4 getInsertTable$runtime() {
        return this.J;
    }

    @Override // p0.w
    public boolean getInserting() {
        return this.T;
    }

    public final r4 getReader$runtime() {
        return this.I;
    }

    @Override // p0.w
    public i3 getRecomposeScope() {
        return getCurrentRecomposeScope$runtime();
    }

    @Override // p0.w
    public Object getRecomposeScopeIdentity() {
        k3 currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            return currentRecomposeScope$runtime.getAnchor();
        }
        return null;
    }

    @Override // p0.w
    public boolean getSkipping() {
        k3 currentRecomposeScope$runtime;
        return (getInserting() || this.f80641z || this.f80639x || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || currentRecomposeScope$runtime.getRequiresRecompose() || this.f80633r) ? false : true;
    }

    public final void h(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        h(this.I.parent(i10), i11);
        if (this.I.isNode(i10)) {
            this.O.moveDown(this.I.node(i10));
        }
    }

    public final void i(boolean z10) {
        long jRotateRight;
        long j10;
        r1 r1Var;
        int remainingSlots;
        r1 r1Var2;
        List<v1> list;
        List<v1> list2;
        Set set;
        long jRotateRight2;
        long j11;
        r1 r1Var3 = this.f80629n;
        int iPeek2 = r1Var3.peek2() - 1;
        boolean inserting = getInserting();
        v vVar = v.f80515a;
        if (inserting) {
            int parent = this.K.getParent();
            int iGroupKey = this.K.groupKey(parent);
            Object objGroupObjectKey = this.K.groupObjectKey(parent);
            Object objGroupAux = this.K.groupAux(parent);
            if (objGroupObjectKey != null) {
                int iOrdinal = objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ 0, 3);
                j11 = iOrdinal;
            } else if (objGroupAux == null || iGroupKey != 207 || kotlin.jvm.internal.e0.areEqual(objGroupAux, vVar.getEmpty())) {
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ iPeek2, 3);
                j11 = iGroupKey;
            } else {
                this.U = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ iPeek2, 3) ^ objGroupAux.hashCode(), 3);
            }
            this.U = Long.rotateRight(jRotateRight2 ^ j11, 3);
        } else {
            int parent2 = this.I.getParent();
            int iGroupKey2 = this.I.groupKey(parent2);
            Object objGroupObjectKey2 = this.I.groupObjectKey(parent2);
            Object objGroupAux2 = this.I.groupAux(parent2);
            if (objGroupObjectKey2 != null) {
                int iOrdinal2 = objGroupObjectKey2 instanceof Enum ? ((Enum) objGroupObjectKey2).ordinal() : objGroupObjectKey2.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ 0, 3);
                j10 = iOrdinal2;
            } else if (objGroupAux2 == null || iGroupKey2 != 207 || kotlin.jvm.internal.e0.areEqual(objGroupAux2, vVar.getEmpty())) {
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ iPeek2, 3);
                j10 = iGroupKey2;
            } else {
                this.U = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ iPeek2, 3) ^ objGroupAux2.hashCode(), 3);
            }
            this.U = Long.rotateRight(jRotateRight ^ j10, 3);
        }
        int i10 = this.f80627l;
        x2 x2Var = this.f80625j;
        ArrayList arrayList = this.f80635t;
        q0.b bVar = this.O;
        if (x2Var == null || x2Var.getKeyInfos().size() <= 0) {
            r1Var = r1Var3;
        } else {
            List<v1> keyInfos = x2Var.getKeyInfos();
            List<v1> used = x2Var.getUsed();
            Set setFastToSet = b1.d.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int iUpdatedNodeCountOf = 0;
            int i11 = 0;
            int i12 = 0;
            while (i11 < size2) {
                v1 v1Var = keyInfos.get(i11);
                if (setFastToSet.contains(v1Var)) {
                    r1Var2 = r1Var3;
                    list = keyInfos;
                    if (!linkedHashSet.contains(v1Var)) {
                        if (i12 < size) {
                            v1 v1Var2 = used.get(i12);
                            if (v1Var2 != v1Var) {
                                int iNodePositionOf = x2Var.nodePositionOf(v1Var2);
                                linkedHashSet.add(v1Var2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = x2Var.updatedNodeCountOf(v1Var2);
                                    list2 = used;
                                    set = setFastToSet;
                                    bVar.moveNode(x2Var.getStartIndex() + iNodePositionOf, x2Var.getStartIndex() + iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                    x2Var.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list2 = used;
                                    set = setFastToSet;
                                }
                            } else {
                                list2 = used;
                                set = setFastToSet;
                                i11++;
                            }
                            i12++;
                            iUpdatedNodeCountOf += x2Var.updatedNodeCountOf(v1Var2);
                            keyInfos = list;
                            r1Var3 = r1Var2;
                            used = list2;
                            setFastToSet = set;
                        }
                    }
                    keyInfos = list;
                    r1Var3 = r1Var2;
                } else {
                    r1Var2 = r1Var3;
                    list = keyInfos;
                    bVar.removeNode(x2Var.getStartIndex() + x2Var.nodePositionOf(v1Var), v1Var.getNodes());
                    x2Var.updateNodeCount(v1Var.getLocation(), 0);
                    bVar.moveReaderRelativeTo(v1Var.getLocation());
                    this.I.reposition(v1Var.getLocation());
                    t(this.I.getCurrentGroup());
                    bVar.removeCurrentGroup();
                    this.I.skipGroup();
                    d0.access$removeRange(arrayList, v1Var.getLocation(), this.I.groupSize(v1Var.getLocation()) + v1Var.getLocation());
                }
                i11++;
                keyInfos = list;
                r1Var3 = r1Var2;
            }
            r1Var = r1Var3;
            bVar.endNodeMovement();
            if (keyInfos.size() > 0) {
                bVar.moveReaderRelativeTo(this.I.getGroupEnd());
                this.I.skipToGroupEnd();
            }
        }
        boolean inserting2 = getInserting();
        if (!inserting2 && (remainingSlots = this.I.getRemainingSlots()) > 0) {
            bVar.trimValues(remainingSlots);
        }
        int i13 = this.f80626k;
        while (!this.I.isGroupEnd()) {
            int currentGroup = this.I.getCurrentGroup();
            t(this.I.getCurrentGroup());
            bVar.removeCurrentGroup();
            bVar.removeNode(i13, this.I.skipGroup());
            d0.access$removeRange(arrayList, currentGroup, this.I.getCurrentGroup());
        }
        if (inserting2) {
            if (z10) {
                this.Q.endNodeInsert();
                i10 = 1;
            }
            this.I.endEmpty();
            int parent3 = this.K.getParent();
            this.K.endGroup();
            if (!this.I.getInEmpty()) {
                int i14 = (-2) - parent3;
                this.K.endInsert();
                this.K.close(true);
                p0.b bVar2 = this.P;
                if (this.Q.isEmpty()) {
                    bVar.insertSlots(bVar2, this.J);
                } else {
                    bVar.insertSlots(bVar2, this.J, this.Q);
                    this.Q = new q0.c();
                }
                this.T = false;
                if (!this.f80618c.isEmpty()) {
                    B(i14, 0);
                    C(i14, i10);
                }
            }
        } else {
            if (z10) {
                bVar.moveUp();
            }
            bVar.endCurrentGroup();
            int parent4 = this.I.getParent();
            if (i10 != D(parent4)) {
                C(parent4, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.I.endGroup();
            bVar.endNodeMovement();
        }
        x2 x2Var2 = (x2) u5.m5850popimpl(this.f80624i);
        if (x2Var2 != null && !inserting2) {
            x2Var2.setGroupIndex(x2Var2.getGroupIndex() + 1);
        }
        this.f80625j = x2Var2;
        this.f80626k = r1Var.pop() + i10;
        this.f80628m = r1Var.pop();
        this.f80627l = r1Var.pop() + i10;
    }

    @Override // p0.w
    public void insertMovableContent(f2 f2Var, Object obj) {
        kotlin.jvm.internal.e0.checkNotNull(f2Var, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        n(f2Var, d(), obj, false);
    }

    @Override // p0.w
    public void insertMovableContentReferences(List<tu.v> list) {
        try {
            m(list);
            b();
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }

    public final boolean isComposing$runtime() {
        return this.G;
    }

    public final boolean isDisposed$runtime() {
        return this.H;
    }

    public final void j() {
        i(false);
        this.f80617b.doneComposing$runtime();
        i(false);
        q0.b bVar = this.O;
        bVar.endRoot();
        bVar.finalizeComposition();
        if (!u5.m5846isEmptyimpl(this.f80624i)) {
            d0.composeImmediateRuntimeError("Start/end imbalance");
        }
        b();
        this.I.close();
        this.f80633r = false;
        this.f80639x = d0.access$asBool(this.f80640y.pop());
    }

    @Override // p0.w
    public Object joinKey(Object obj, Object obj2) {
        Object objC = d0.c(this.I.getGroupObjectKey(), obj, obj2);
        return objC == null ? new u1(obj, obj2) : objC;
    }

    public final void k(boolean z10, x2 x2Var) {
        u5.m5851pushimpl(this.f80624i, this.f80625j);
        this.f80625j = x2Var;
        int i10 = this.f80627l;
        r1 r1Var = this.f80629n;
        r1Var.push(i10);
        r1Var.push(this.f80628m);
        r1Var.push(this.f80626k);
        if (z10) {
            this.f80626k = 0;
        }
        this.f80627l = 0;
        this.f80628m = 0;
    }

    public final void l() {
        s4 s4Var = new s4();
        if (this.D) {
            s4Var.collectSourceInformation();
        }
        if (this.f80617b.getCollectingCallByInformation$runtime()) {
            s4Var.collectCalledByInformation();
        }
        this.J = s4Var;
        v4 v4VarOpenWriter = s4Var.openWriter();
        v4VarOpenWriter.close(true);
        this.K = v4VarOpenWriter;
    }

    public final void m(List list) {
        s4 slotTable$runtime;
        p0.b anchor$runtime;
        r4 r4Var;
        z.j0 j0Var;
        int[] iArr;
        q0.a aVar;
        boolean z10;
        s4 s4Var;
        f0 f0Var;
        int i10;
        s4 slotTable$runtime2;
        r4 r4Var2;
        q0.a aVar2;
        z zVar = this;
        List list2 = list;
        s4 s4Var2 = zVar.f80618c;
        f0 f0Var2 = zVar.f80617b;
        q0.a aVar3 = zVar.f80621f;
        q0.b bVar = zVar.O;
        q0.a changeList = bVar.getChangeList();
        try {
            bVar.setChangeList(aVar3);
            bVar.resetSlots();
            int size = list2.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                tu.v vVar = (tu.v) list2.get(i12);
                i2 i2Var = (i2) vVar.component1();
                i2 i2Var2 = (i2) vVar.component2();
                p0.b anchor$runtime2 = i2Var.getAnchor$runtime();
                int iAnchorIndex = i2Var.getSlotTable$runtime().anchorIndex(anchor$runtime2);
                z0.w wVar = new z0.w(i11, 1, null);
                bVar.determineMovableContentNodeIndex(wVar, anchor$runtime2);
                if (i2Var2 == null) {
                    if (kotlin.jvm.internal.e0.areEqual(i2Var.getSlotTable$runtime(), zVar.J)) {
                        zVar.c();
                    }
                    r4 r4VarOpenReader = i2Var.getSlotTable$runtime().openReader();
                    try {
                        r4VarOpenReader.reposition(iAnchorIndex);
                        bVar.moveReaderToAbsolute(iAnchorIndex);
                        aVar2 = new q0.a();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        r4Var2 = r4VarOpenReader;
                        try {
                            zVar = this;
                            try {
                                zVar.p(null, null, null, uu.p0.emptyList(), new y(0, this, aVar2, r4VarOpenReader, i2Var));
                                bVar.includeOperationsIn(aVar2, wVar);
                                r4Var2.close();
                                s4Var = s4Var2;
                                f0Var = f0Var2;
                                i10 = size;
                            } catch (Throwable th3) {
                                th = th3;
                                r4Var2.close();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r4Var2 = r4VarOpenReader;
                        r4Var2.close();
                        throw th;
                    }
                } else {
                    h2 h2VarMovableContentStateResolve$runtime = f0Var2.movableContentStateResolve$runtime(i2Var2);
                    if (h2VarMovableContentStateResolve$runtime == null || (slotTable$runtime = h2VarMovableContentStateResolve$runtime.getSlotTable$runtime()) == null) {
                        slotTable$runtime = i2Var2.getSlotTable$runtime();
                    }
                    if (h2VarMovableContentStateResolve$runtime == null || (slotTable$runtime2 = h2VarMovableContentStateResolve$runtime.getSlotTable$runtime()) == null || (anchor$runtime = slotTable$runtime2.anchor(i11)) == null) {
                        anchor$runtime = i2Var2.getAnchor$runtime();
                    }
                    List<? extends Object> listAccess$collectNodesFrom = d0.access$collectNodesFrom(slotTable$runtime, anchor$runtime);
                    if (!listAccess$collectNodesFrom.isEmpty()) {
                        bVar.copyNodesToNewAnchorLocation(listAccess$collectNodesFrom, wVar);
                        if (kotlin.jvm.internal.e0.areEqual(i2Var.getSlotTable$runtime(), s4Var2)) {
                            int iAnchorIndex2 = s4Var2.anchorIndex(anchor$runtime2);
                            zVar.B(iAnchorIndex2, zVar.D(iAnchorIndex2) + listAccess$collectNodesFrom.size());
                        }
                    }
                    bVar.copySlotTableToAnchorLocation(h2VarMovableContentStateResolve$runtime, f0Var2, i2Var2, i2Var);
                    r4 r4VarOpenReader2 = slotTable$runtime.openReader();
                    try {
                        r4 r4Var3 = zVar.I;
                        int[] iArr2 = zVar.f80630o;
                        z.j0 j0Var2 = zVar.f80638w;
                        zVar.f80630o = null;
                        zVar.f80638w = null;
                        try {
                            zVar.I = r4VarOpenReader2;
                            int iAnchorIndex3 = slotTable$runtime.anchorIndex(anchor$runtime);
                            r4VarOpenReader2.reposition(iAnchorIndex3);
                            bVar.moveReaderToAbsolute(iAnchorIndex3);
                            q0.a aVar4 = new q0.a();
                            q0.a changeList2 = bVar.getChangeList();
                            try {
                                bVar.setChangeList(aVar4);
                                boolean implicitRootStart = bVar.getImplicitRootStart();
                                try {
                                    bVar.setImplicitRootStart(false);
                                    i2Var2.transferPendingInvalidations$runtime();
                                    y0 composition$runtime = i2Var2.getComposition$runtime();
                                    try {
                                        y0 composition$runtime2 = i2Var.getComposition$runtime();
                                        Integer numValueOf = Integer.valueOf(r4VarOpenReader2.getCurrentGroup());
                                        try {
                                            r4Var = r4VarOpenReader2;
                                            iArr = iArr2;
                                            s4Var = s4Var2;
                                            f0Var = f0Var2;
                                            j0Var = j0Var2;
                                            aVar = changeList2;
                                            i10 = size;
                                            z10 = implicitRootStart;
                                            try {
                                                zVar.p(composition$runtime, composition$runtime2, numValueOf, i2Var2.getInvalidations$runtime(), new androidx.lifecycle.x0(18, zVar, i2Var));
                                                try {
                                                    bVar.setImplicitRootStart(z10);
                                                    try {
                                                        bVar.setChangeList(aVar);
                                                        bVar.includeOperationsIn(aVar4, wVar);
                                                        try {
                                                            zVar.I = r4Var3;
                                                            zVar.f80630o = iArr;
                                                            zVar.f80638w = j0Var;
                                                            r4Var.close();
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            r4Var.close();
                                                            throw th;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        zVar.I = r4Var3;
                                                        zVar.f80630o = iArr;
                                                        zVar.f80638w = j0Var;
                                                        throw th;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    bVar.setChangeList(aVar);
                                                    throw th;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                bVar.setImplicitRootStart(z10);
                                                throw th;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            aVar = changeList2;
                                            r4Var = r4VarOpenReader2;
                                            iArr = iArr2;
                                            j0Var = j0Var2;
                                            z10 = implicitRootStart;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        aVar = changeList2;
                                        z10 = implicitRootStart;
                                        r4Var = r4VarOpenReader2;
                                        iArr = iArr2;
                                        j0Var = j0Var2;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    j0Var = j0Var2;
                                    aVar = changeList2;
                                    z10 = implicitRootStart;
                                    r4Var = r4VarOpenReader2;
                                    iArr = iArr2;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                j0Var = j0Var2;
                                aVar = changeList2;
                                r4Var = r4VarOpenReader2;
                                iArr = iArr2;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            j0Var = j0Var2;
                            r4Var = r4VarOpenReader2;
                            iArr = iArr2;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        r4Var = r4VarOpenReader2;
                    }
                }
                bVar.skipToEndOfCurrentGroup();
                i12++;
                list2 = list;
                s4Var2 = s4Var;
                f0Var2 = f0Var;
                size = i10;
                i11 = 0;
            }
            bVar.endMovableContentPlacement();
            bVar.moveReaderToAbsolute(0);
            bVar.setChangeList(changeList);
        } catch (Throwable th16) {
            bVar.setChangeList(changeList);
            throw th16;
        }
    }

    public final void n(f2 f2Var, z2 z2Var, Object obj, boolean z10) {
        startMovableGroup(126665345, f2Var);
        nextSlot();
        updateValue(obj);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.U = 126665345;
            if (getInserting()) {
                v4.markGroup$default(this.K, 0, 1, null);
            }
            boolean z11 = (getInserting() || kotlin.jvm.internal.e0.areEqual(this.I.getGroupAux(), z2Var)) ? false : true;
            if (z11) {
                r(z2Var);
            }
            x(202, d0.getCompositionLocalMap(), z2Var, p1.f80389b.m5819getGroupULZAiWs());
            this.M = null;
            if (!getInserting() || z10) {
                boolean z12 = this.f80639x;
                this.f80639x = z11;
                z0.v.invokeComposable(this, z0.u.composableLambdaInstance(316014703, true, new b0(f2Var, obj)));
                this.f80639x = z12;
            } else {
                this.L = true;
                v4 v4Var = this.K;
                this.f80617b.insertMovableContent$runtime(new i2(f2Var, obj, getComposition(), this.J, v4Var.anchor(v4Var.parent(v4Var.getParent())), uu.p0.emptyList(), d(), null));
            }
        } catch (Throwable th2) {
            try {
                throw d1.d.attachComposeStackTrace(th2, new x(this, 0));
            } finally {
                i(false);
                this.M = null;
                this.U = compositeKeyHashCode;
                endMovableGroup();
            }
        }
    }

    public final Object nextSlot() {
        boolean inserting = getInserting();
        v vVar = v.f80515a;
        if (!inserting) {
            Object next = this.I.next();
            return (!this.f80641z || (next instanceof n4)) ? next : vVar.getEmpty();
        }
        if (this.f80634s) {
            d0.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
        return vVar.getEmpty();
    }

    public final Object nextSlotForCache() {
        boolean inserting = getInserting();
        v vVar = v.f80515a;
        if (!inserting) {
            Object next = this.I.next();
            return (!this.f80641z || (next instanceof n4)) ? next instanceof k4 ? ((k4) next).getWrapped() : next : vVar.getEmpty();
        }
        if (this.f80634s) {
            d0.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
        return vVar.getEmpty();
    }

    public final int o(int i10) {
        int iParent = this.I.parent(i10) + 1;
        int i11 = 0;
        while (iParent < i10) {
            if (!this.I.hasObjectKey(iParent)) {
                i11++;
            }
            iParent += this.I.groupSize(iParent);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0025, B:11:0x002f, B:10:0x002b, B:14:0x0036, B:16:0x003c, B:18:0x0042), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(p0.y0 r7, p0.y0 r8, java.lang.Integer r9, java.util.List r10, kv.a r11) {
        /*
            r6 = this;
            boolean r0 = r6.G
            int r1 = r6.f80626k
            r2 = 1
            r6.G = r2     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r6.f80626k = r2     // Catch: java.lang.Throwable -> L29
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L29
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L29
        L11:
            if (r2 >= r3) goto L32
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L29
            tu.v r4 = (tu.v) r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r4.component1()     // Catch: java.lang.Throwable -> L29
            p0.k3 r5 = (p0.k3) r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.component2()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            r6.tryImminentInvalidation$runtime(r5, r4)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            r4 = 0
            r6.tryImminentInvalidation$runtime(r5, r4)     // Catch: java.lang.Throwable -> L29
        L2f:
            int r2 = r2 + 1
            goto L11
        L32:
            if (r7 == 0) goto L42
            if (r9 == 0) goto L3b
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L29
            goto L3c
        L3b:
            r9 = -1
        L3c:
            java.lang.Object r7 = r7.delegateInvalidations(r8, r9, r11)     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L46
        L42:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L29
        L46:
            r6.G = r0
            r6.f80626k = r1
            return r7
        L4b:
            r6.G = r0
            r6.f80626k = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.p(p0.y0, p0.y0, java.lang.Integer, java.util.List, kv.a):java.lang.Object");
    }

    public final int parentKey$runtime() {
        if (getInserting()) {
            v4 v4Var = this.K;
            return v4Var.groupKey(v4Var.getParent());
        }
        r4 r4Var = this.I;
        return r4Var.groupKey(r4Var.getParent());
    }

    public final List<d1.c> parentStackTrace() {
        f0 f0Var = this.f80617b;
        e0 composition$runtime = f0Var.getComposition$runtime();
        j0 j0Var = composition$runtime instanceof j0 ? (j0) composition$runtime : null;
        if (j0Var == null) {
            return uu.p0.emptyList();
        }
        Integer numFindSubcompositionContextGroup = d1.b.findSubcompositionContextGroup(j0Var.getSlotTable$runtime(), f0Var);
        if (numFindSubcompositionContextGroup == null) {
            return uu.p0.emptyList();
        }
        r4 r4VarOpenReader = j0Var.getSlotTable$runtime().openReader();
        try {
            return d1.b.traceForGroup(r4VarOpenReader, numFindSubcompositionContextGroup.intValue(), 0);
        } finally {
            r4VarOpenReader.close();
        }
    }

    public final void prepareCompose$runtime(kv.a aVar) {
        if (this.G) {
            d0.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.G = true;
        try {
            aVar.invoke();
        } finally {
            this.G = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r5 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.q():void");
    }

    public final void r(z2 z2Var) {
        z.j0 j0Var = this.f80638w;
        if (j0Var == null) {
            j0Var = new z.j0(0, 1, null);
            this.f80638w = j0Var;
        }
        j0Var.set(this.I.getCurrentGroup(), z2Var);
    }

    /* renamed from: recompose-aFTiNEg$runtime, reason: not valid java name */
    public final boolean m5858recomposeaFTiNEg$runtime(z.u0 u0Var, p4 p4Var) {
        q0.a aVar = this.f80620e;
        if (!aVar.isEmpty()) {
            d0.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (r0.h.m6009getSizeimpl(u0Var) <= 0 && this.f80635t.isEmpty() && !this.f80633r) {
            return false;
        }
        g(u0Var, null);
        return aVar.isNotEmpty();
    }

    @Override // p0.w
    public void recordSideEffect(kv.a aVar) {
        this.O.sideEffect(aVar);
    }

    @Override // p0.w
    public void recordUsed(i3 i3Var) {
        k3 k3Var = i3Var instanceof k3 ? (k3) i3Var : null;
        if (k3Var != null) {
            k3Var.setUsed(true);
        }
    }

    @Override // p0.w
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    public final void s(int i10, int i11, int i12) {
        r4 r4Var = this.I;
        int iAccess$nearestCommonRootOf = d0.access$nearestCommonRootOf(r4Var, i10, i11, i12);
        while (i10 > 0 && i10 != iAccess$nearestCommonRootOf) {
            if (r4Var.isNode(i10)) {
                this.O.moveUp();
            }
            i10 = r4Var.parent(i10);
        }
        h(i11, iAccess$nearestCommonRootOf);
    }

    public final void setDeferredChanges$runtime(q0.a aVar) {
        this.N = aVar;
    }

    public final void setInsertTable$runtime(s4 s4Var) {
        this.J = s4Var;
    }

    public final void setReader$runtime(r4 r4Var) {
        this.I = r4Var;
    }

    @Override // p0.w
    public boolean shouldExecute(boolean z10, int i10) {
        return ((i10 & 1) == 0 && (getInserting() || this.f80641z)) || z10 || !getSkipping();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    @Override // p0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void skipCurrentGroup() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.skipCurrentGroup():void");
    }

    @Override // p0.w
    public void skipToGroupEnd() {
        if (this.f80627l != 0) {
            d0.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        k3 currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            currentRecomposeScope$runtime.scopeSkipped();
        }
        if (!this.f80635t.isEmpty()) {
            q();
        } else {
            this.f80627l = this.I.getParentNodes();
            this.I.skipToGroupEnd();
        }
    }

    @Override // p0.w
    public void sourceInformation(String str) {
        if (getInserting() && this.D) {
            this.K.recordGroupSourceInformation(str);
        }
    }

    @Override // p0.w
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.D) {
            this.K.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // p0.w
    public void sourceInformationMarkerStart(int i10, String str) {
        if (getInserting() && this.D) {
            this.K.recordGrouplessCallSourceInformationStart(i10, str);
        }
    }

    public final List<d1.c> stackTraceForValue$runtime(Object obj) {
        List<d1.c> listEmptyList;
        if (!this.D) {
            return uu.p0.emptyList();
        }
        aw.f fVar = new aw.f(obj, 29);
        s4 s4Var = this.f80618c;
        d1.r rVarFindLocation = d1.b.findLocation(s4Var, fVar);
        if (rVarFindLocation != null) {
            int iComponent1 = rVarFindLocation.component1();
            Integer numComponent2 = rVarFindLocation.component2();
            if (this.D) {
                r4 r4VarOpenReader = s4Var.openReader();
                try {
                    List<d1.c> listTraceForGroup = d1.b.traceForGroup(r4VarOpenReader, iComponent1, numComponent2);
                    r4VarOpenReader.close();
                    listEmptyList = listTraceForGroup;
                } catch (Throwable th2) {
                    r4VarOpenReader.close();
                    throw th2;
                }
            } else {
                listEmptyList = uu.p0.emptyList();
            }
            List<d1.c> listPlus = uu.y0.plus((Collection) listEmptyList, (Iterable) parentStackTrace());
            if (listPlus != null) {
                return listPlus;
            }
        }
        return uu.p0.emptyList();
    }

    public final int stacksSize$runtime() {
        return u5.m5844getSizeimpl(this.f80624i) + u5.m5844getSizeimpl(this.F) + this.f80636u.f80424b + this.f80640y.f80424b + this.f80629n.f80424b;
    }

    @Override // p0.w
    public void startDefaults() {
        x(-127, null, null, p1.f80389b.m5819getGroupULZAiWs());
    }

    @Override // p0.w
    public void startMovableGroup(int i10, Object obj) {
        x(i10, obj, null, p1.f80389b.m5819getGroupULZAiWs());
    }

    @Override // p0.w
    public void startNode() {
        x(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, null, p1.f80389b.m5820getNodeULZAiWs());
        this.f80634s = true;
    }

    @Override // p0.w
    public void startProvider(h3 h3Var) {
        b6 b6Var;
        z2 z2VarD = d();
        y(201, d0.getProvider());
        Object objRememberedValue = rememberedValue();
        if (kotlin.jvm.internal.e0.areEqual(objRememberedValue, v.f80515a.getEmpty())) {
            b6Var = null;
        } else {
            kotlin.jvm.internal.e0.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            b6Var = (b6) objRememberedValue;
        }
        l0 compositionLocal = h3Var.getCompositionLocal();
        kotlin.jvm.internal.e0.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        kotlin.jvm.internal.e0.checkNotNull(h3Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        b6 b6VarUpdatedStateOf$runtime = compositionLocal.updatedStateOf$runtime(h3Var, b6Var);
        boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(b6VarUpdatedStateOf$runtime, b6Var);
        if (!zAreEqual) {
            updateRememberedValue(b6VarUpdatedStateOf$runtime);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (getInserting()) {
            if (h3Var.getCanOverride() || !q0.contains(z2VarD, compositionLocal)) {
                z2VarD = z2VarD.putValue(compositionLocal, b6VarUpdatedStateOf$runtime);
            }
            this.L = true;
        } else {
            r4 r4Var = this.I;
            Object objGroupAux = r4Var.groupAux(r4Var.getCurrentGroup());
            kotlin.jvm.internal.e0.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            z2 z2Var = (z2) objGroupAux;
            if (!(getSkipping() && zAreEqual) && (h3Var.getCanOverride() || !q0.contains(z2VarD, compositionLocal))) {
                z2VarD = z2VarD.putValue(compositionLocal, b6VarUpdatedStateOf$runtime);
            } else if ((zAreEqual && !this.f80639x) || !this.f80639x) {
                z2VarD = z2Var;
            }
            if (!this.f80641z && z2Var == z2VarD) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !getInserting()) {
            r(z2VarD);
        }
        this.f80640y.push(d0.access$asInt(this.f80639x));
        this.f80639x = z11;
        this.M = z2VarD;
        x(202, d0.getCompositionLocalMap(), z2VarD, p1.f80389b.m5819getGroupULZAiWs());
    }

    @Override // p0.w
    public void startProviders(h3[] h3VarArr) {
        z2 z2VarBuild;
        z2 z2VarD = d();
        y(201, d0.getProvider());
        boolean z10 = true;
        boolean z11 = false;
        if (getInserting()) {
            z2 z2VarUpdateCompositionMap$default = q0.updateCompositionMap$default(h3VarArr, z2VarD, null, 4, null);
            y2 y2VarBuilder = z2VarD.builder();
            y2VarBuilder.putAll(z2VarUpdateCompositionMap$default);
            z2VarBuild = y2VarBuilder.build();
            y(204, d0.getProviderMaps());
            nextSlot();
            updateValue(z2VarBuild);
            nextSlot();
            updateValue(z2VarUpdateCompositionMap$default);
            i(false);
            this.L = true;
        } else {
            Object objGroupGet = this.I.groupGet(0);
            kotlin.jvm.internal.e0.checkNotNull(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            z2 z2Var = (z2) objGroupGet;
            Object objGroupGet2 = this.I.groupGet(1);
            kotlin.jvm.internal.e0.checkNotNull(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            z2 z2Var2 = (z2) objGroupGet2;
            z2 z2VarUpdateCompositionMap = q0.updateCompositionMap(h3VarArr, z2VarD, z2Var2);
            if (getSkipping() && !this.f80641z && kotlin.jvm.internal.e0.areEqual(z2Var2, z2VarUpdateCompositionMap)) {
                this.f80627l = this.I.skipGroup() + this.f80627l;
                z2VarBuild = z2Var;
            } else {
                y2 y2VarBuilder2 = z2VarD.builder();
                y2VarBuilder2.putAll(z2VarUpdateCompositionMap);
                z2VarBuild = y2VarBuilder2.build();
                y(204, d0.getProviderMaps());
                nextSlot();
                updateValue(z2VarBuild);
                nextSlot();
                updateValue(z2VarUpdateCompositionMap);
                i(false);
                if (!this.f80641z && kotlin.jvm.internal.e0.areEqual(z2VarBuild, z2Var)) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        if (z11 && !getInserting()) {
            r(z2VarBuild);
        }
        this.f80640y.push(d0.access$asInt(this.f80639x));
        this.f80639x = z11;
        this.M = z2VarBuild;
        x(202, d0.getCompositionLocalMap(), z2VarBuild, p1.f80389b.m5819getGroupULZAiWs());
    }

    @Override // p0.w
    public void startReplaceGroup(int i10) {
        if (this.f80625j != null) {
            x(i10, null, null, p1.f80389b.m5819getGroupULZAiWs());
            return;
        }
        if (this.f80634s) {
            d0.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
        this.U = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ i10, 3) ^ this.f80628m;
        this.f80628m++;
        r4 r4Var = this.I;
        boolean inserting = getInserting();
        v vVar = v.f80515a;
        if (inserting) {
            r4Var.beginEmpty();
            this.K.startGroup(i10, vVar.getEmpty());
            k(false, null);
            return;
        }
        if (r4Var.getGroupKey() == i10 && !r4Var.getHasObjectKey()) {
            r4Var.startGroup();
            k(false, null);
            return;
        }
        if (!r4Var.isGroupEnd()) {
            int i11 = this.f80626k;
            int currentGroup = r4Var.getCurrentGroup();
            t(this.I.getCurrentGroup());
            q0.b bVar = this.O;
            bVar.removeCurrentGroup();
            bVar.removeNode(i11, r4Var.skipGroup());
            d0.access$removeRange(this.f80635t, currentGroup, r4Var.getCurrentGroup());
        }
        r4Var.beginEmpty();
        this.T = true;
        this.M = null;
        if (this.K.getClosed()) {
            v4 v4VarOpenWriter = this.J.openWriter();
            this.K = v4VarOpenWriter;
            v4VarOpenWriter.skipToGroupEnd();
            this.L = false;
            this.M = null;
        }
        v4 v4Var = this.K;
        v4Var.beginInsert();
        int currentGroup2 = v4Var.getCurrentGroup();
        v4Var.startGroup(i10, vVar.getEmpty());
        this.P = v4Var.anchor(currentGroup2);
        k(false, null);
    }

    @Override // p0.w
    public void startReplaceableGroup(int i10) {
        x(i10, null, null, p1.f80389b.m5819getGroupULZAiWs());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    @Override // p0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p0.w startRestartGroup(int r6) {
        /*
            r5 = this;
            r5.startReplaceGroup(r6)
            boolean r6 = r5.getInserting()
            p0.r0 r0 = r5.f80622g
            java.util.ArrayList r1 = r5.F
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r6 == 0) goto L2a
            p0.k3 r6 = new p0.k3
            p0.j0 r3 = r5.getComposition()
            kotlin.jvm.internal.e0.checkNotNull(r3, r2)
            r6.<init>(r3)
            p0.u5.m5851pushimpl(r1, r6)
            r5.updateValue(r6)
            int r1 = r5.C
            r6.start(r1)
            r0.current()
            return r5
        L2a:
            p0.r4 r6 = r5.I
            int r6 = r6.getParent()
            java.util.ArrayList r3 = r5.f80635t
            p0.s1 r6 = p0.d0.access$removeLocation(r3, r6)
            p0.r4 r3 = r5.I
            java.lang.Object r3 = r3.next()
            p0.v r4 = p0.v.f80515a
            java.lang.Object r4 = r4.getEmpty()
            boolean r4 = kotlin.jvm.internal.e0.areEqual(r3, r4)
            if (r4 == 0) goto L58
            p0.k3 r3 = new p0.k3
            p0.j0 r4 = r5.getComposition()
            kotlin.jvm.internal.e0.checkNotNull(r4, r2)
            r3.<init>(r4)
            r5.updateValue(r3)
            goto L5f
        L58:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.e0.checkNotNull(r3, r2)
            p0.k3 r3 = (p0.k3) r3
        L5f:
            r2 = 0
            r4 = 1
            if (r6 != 0) goto L71
            boolean r6 = r3.getForcedRecompose()
            if (r6 == 0) goto L6c
            r3.setForcedRecompose(r2)
        L6c:
            if (r6 == 0) goto L6f
            goto L71
        L6f:
            r6 = r2
            goto L72
        L71:
            r6 = r4
        L72:
            r3.setRequiresRecompose(r6)
            p0.u5.m5851pushimpl(r1, r3)
            int r6 = r5.C
            r3.start(r6)
            r0.current()
            boolean r6 = r3.getPaused()
            if (r6 == 0) goto La0
            r3.setPaused(r2)
            r3.setResuming(r4)
            q0.b r6 = r5.O
            r6.startResumingScope(r3)
            boolean r6 = r5.f80641z
            if (r6 != 0) goto La0
            boolean r6 = r3.getReusing()
            if (r6 == 0) goto La0
            r5.f80641z = r4
            r3.setResetReusing(r4)
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.startRestartGroup(int):p0.w");
    }

    @Override // p0.w
    public void startReusableGroup(int i10, Object obj) {
        if (!getInserting() && this.I.getGroupKey() == i10 && !kotlin.jvm.internal.e0.areEqual(this.I.getGroupAux(), obj) && this.A < 0) {
            this.A = this.I.getCurrentGroup();
            this.f80641z = true;
        }
        x(i10, null, obj, p1.f80389b.m5819getGroupULZAiWs());
    }

    @Override // p0.w
    public void startReusableNode() {
        x(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, null, p1.f80389b.m5821getReusableNodeULZAiWs());
        this.f80634s = true;
    }

    public final void startReuseFromRoot() {
        this.A = 100;
        this.f80641z = true;
    }

    public final void t(int i10) {
        boolean zIsNode = this.I.isNode(i10);
        q0.b bVar = this.O;
        if (zIsNode) {
            bVar.endNodeMovement();
            bVar.moveDown(this.I.node(i10));
        }
        w(this, i10, i10, zIsNode, 0);
        bVar.endNodeMovement();
        if (zIsNode) {
            bVar.moveUp();
        }
    }

    public final boolean tryImminentInvalidation$runtime(k3 k3Var, Object obj) {
        p0.b anchor = k3Var.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.I.getTable$runtime());
        if (!this.G || indexFor < this.I.getCurrentGroup()) {
            return false;
        }
        d0.access$insertIfMissing(this.f80635t, indexFor, k3Var, obj);
        return true;
    }

    public final void updateCachedValue(Object obj) {
        int i10;
        int i11;
        if (obj instanceof j4) {
            j4 j4Var = (j4) obj;
            p0.b bVarAnchor = null;
            if (getInserting()) {
                if (d0.isAfterFirstChild(this.K)) {
                    int currentGroup = this.K.getCurrentGroup() - 1;
                    int iParent = this.K.parent(currentGroup);
                    while (true) {
                        int i12 = iParent;
                        i11 = currentGroup;
                        currentGroup = i12;
                        if (currentGroup == this.K.getParent() || currentGroup < 0) {
                            break;
                        } else {
                            iParent = this.K.parent(currentGroup);
                        }
                    }
                    bVarAnchor = this.K.anchor(i11);
                }
            } else if (d0.isAfterFirstChild(this.I)) {
                int currentGroup2 = this.I.getCurrentGroup() - 1;
                int iParent2 = this.I.parent(currentGroup2);
                while (true) {
                    int i13 = iParent2;
                    i10 = currentGroup2;
                    currentGroup2 = i13;
                    if (currentGroup2 == this.I.getParent() || currentGroup2 < 0) {
                        break;
                    } else {
                        iParent2 = this.I.parent(currentGroup2);
                    }
                }
                bVarAnchor = this.I.anchor(i10);
            }
            k4 k4Var = new k4(j4Var, bVarAnchor);
            if (getInserting()) {
                this.O.remember(k4Var);
            }
            this.f80619d.add(obj);
            obj = k4Var;
        }
        updateValue(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5859updateComposerInvalidationsRY85e9Y(z.u0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.f80635t
            int r3 = uu.p0.getLastIndex(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L3b
            java.lang.Object r4 = r2.get(r3)
            p0.s1 r4 = (p0.s1) r4
            p0.k3 r5 = r4.getScope()
            p0.b r5 = r5.getAnchor()
            if (r5 == 0) goto L35
            boolean r6 = r5.getValid()
            if (r6 == 0) goto L35
            int r6 = r4.getLocation()
            int r7 = r5.getLocation$runtime()
            if (r6 == r7) goto L38
            int r5 = r5.getLocation$runtime()
            r4.setLocation(r5)
            goto L38
        L35:
            r2.remove(r3)
        L38:
            int r3 = r3 + (-1)
            goto La
        L3b:
            java.lang.Object[] r3 = r1.f96866b
            java.lang.Object[] r4 = r1.f96867c
            long[] r1 = r1.f96865a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9c
            r7 = 0
        L47:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L97
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L61:
            if (r12 >= r10) goto L95
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L91
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.e0.checkNotNull(r14, r15)
            p0.k3 r14 = (p0.k3) r14
            p0.b r15 = r14.getAnchor()
            if (r15 == 0) goto L91
            int r15 = r15.getLocation$runtime()
            p0.c2 r6 = p0.c2.f80169c
            if (r13 != r6) goto L89
            r13 = 0
        L89:
            p0.s1 r6 = new p0.s1
            r6.<init>(r14, r15, r13)
            r2.add(r6)
        L91:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L61
        L95:
            if (r10 != r11) goto L9c
        L97:
            if (r7 == r5) goto L9c
            int r7 = r7 + 1
            goto L47
        L9c:
            java.util.Comparator r1 = p0.d0.access$getInvalidationLocationAscending$p()
            uu.u0.sortWith(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.m5859updateComposerInvalidationsRY85e9Y(z.u0):void");
    }

    @Override // p0.w
    public void updateRememberedValue(Object obj) {
        updateCachedValue(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.K.update(obj);
            return;
        }
        boolean hadNext = this.I.getHadNext();
        q0.b bVar = this.O;
        if (!hadNext) {
            r4 r4Var = this.I;
            bVar.appendValue(r4Var.anchor(r4Var.getParent()), obj);
            return;
        }
        int groupSlotIndex = this.I.getGroupSlotIndex() - 1;
        if (!bVar.getPastParent()) {
            bVar.updateValue(obj, groupSlotIndex);
        } else {
            r4 r4Var2 = this.I;
            bVar.updateAnchoredValue(obj, r4Var2.anchor(r4Var2.getParent()), groupSlotIndex);
        }
    }

    @Override // p0.w
    public void useNode() {
        if (!this.f80634s) {
            d0.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f80634s = false;
        if (getInserting()) {
            d0.composeImmediateRuntimeError("useNode() called while inserting");
        }
        r4 r4Var = this.I;
        this.O.moveDown(r4Var.node(r4Var.getParent()));
    }

    public final void verifyConsistent$runtime() {
        this.J.verifyWellFormed();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z.x(int, java.lang.Object, java.lang.Object, int):void");
    }

    public final void y(int i10, Object obj) {
        x(i10, obj, null, p1.f80389b.m5819getGroupULZAiWs());
    }

    public final void z(Object obj, boolean z10) {
        if (z10) {
            this.I.startNode();
            return;
        }
        if (obj != null && this.I.getGroupAux() != obj) {
            this.O.updateAuxData(obj);
        }
        this.I.startGroup();
    }

    @Override // p0.w
    public j0 getComposition() {
        return this.f80623h;
    }

    @Override // p0.w
    public boolean changed(char c10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && c10 == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c10));
        return true;
    }

    @Override // p0.w
    public boolean changed(byte b10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && b10 == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b10));
        return true;
    }

    @Override // p0.w
    public boolean changed(short s10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && s10 == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s10));
        return true;
    }

    @Override // p0.w
    public boolean changed(boolean z10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && z10 == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z10));
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements n4 {

        /* renamed from: b, reason: collision with root package name */
        public final b f80642b;

        public a(b bVar) {
            this.f80642b = bVar;
        }

        public final b getRef() {
            return this.f80642b;
        }

        @Override // p0.n4, p0.j4
        public void onAbandoned() {
            this.f80642b.dispose();
        }

        @Override // p0.n4, p0.j4
        public void onForgotten() {
            this.f80642b.dispose();
        }

        @Override // p0.n4, p0.j4
        public void onRemembered() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends f0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f80643a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f80644b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f80645c;

        /* renamed from: d, reason: collision with root package name */
        public final r0 f80646d;

        /* renamed from: e, reason: collision with root package name */
        public Set f80647e;

        /* renamed from: f, reason: collision with root package name */
        public final LinkedHashSet f80648f = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name */
        public final j2 f80649g = z4.mutableStateOf(z0.z.persistentCompositionLocalHashMapOf(), z4.referentialEqualityPolicy());

        public b(long j10, boolean z10, boolean z11, r0 r0Var) {
            this.f80643a = j10;
            this.f80644b = z10;
            this.f80645c = z11;
            this.f80646d = r0Var;
        }

        @Override // p0.f0
        public void composeInitial$runtime(y0 y0Var, kv.p pVar) {
            z.this.f80617b.composeInitial$runtime(y0Var, pVar);
        }

        @Override // p0.f0
        public z.o1 composeInitialPaused$runtime(y0 y0Var, p4 p4Var, kv.p pVar) {
            return z.this.f80617b.composeInitialPaused$runtime(y0Var, p4Var, pVar);
        }

        @Override // p0.f0
        public void deletedMovableContent$runtime(i2 i2Var) {
            z.this.f80617b.deletedMovableContent$runtime(i2Var);
        }

        public final void dispose() {
            LinkedHashSet<z> linkedHashSet = this.f80648f;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            Set set = this.f80647e;
            if (set != null) {
                for (z zVar : linkedHashSet) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(zVar.f80618c);
                    }
                }
            }
            linkedHashSet.clear();
        }

        @Override // p0.f0
        public void doneComposing$runtime() {
            z zVar = z.this;
            zVar.B--;
        }

        @Override // p0.f0
        public boolean getCollectingCallByInformation$runtime() {
            return z.this.f80617b.getCollectingCallByInformation$runtime();
        }

        @Override // p0.f0
        public boolean getCollectingParameterInformation$runtime() {
            return this.f80644b;
        }

        @Override // p0.f0
        public boolean getCollectingSourceInformation$runtime() {
            return this.f80645c;
        }

        public final Set<z> getComposers() {
            return this.f80648f;
        }

        @Override // p0.f0
        public long getCompositeKeyHashCode$runtime() {
            return this.f80643a;
        }

        @Override // p0.f0
        public e0 getComposition$runtime() {
            return z.this.getComposition();
        }

        @Override // p0.f0
        public z2 getCompositionLocalScope$runtime() {
            return (z2) this.f80649g.getValue();
        }

        @Override // p0.f0
        public zu.m getEffectCoroutineContext() {
            return z.this.f80617b.getEffectCoroutineContext();
        }

        public final Set<Set<d1.e>> getInspectionTables() {
            return this.f80647e;
        }

        @Override // p0.f0
        public r0 getObserverHolder$runtime() {
            return this.f80646d;
        }

        @Override // p0.f0
        public zu.m getRecomposeCoroutineContext$runtime() {
            return k0.getRecomposeCoroutineContext(z.this.getComposition());
        }

        @Override // p0.f0
        public void insertMovableContent$runtime(i2 i2Var) {
            z.this.f80617b.insertMovableContent$runtime(i2Var);
        }

        @Override // p0.f0
        public void invalidate$runtime(y0 y0Var) {
            z zVar = z.this;
            zVar.f80617b.invalidate$runtime(zVar.getComposition());
            zVar.f80617b.invalidate$runtime(y0Var);
        }

        @Override // p0.f0
        public void invalidateScope$runtime(k3 k3Var) {
            z.this.f80617b.invalidateScope$runtime(k3Var);
        }

        @Override // p0.f0
        public void movableContentStateReleased$runtime(i2 i2Var, h2 h2Var, d dVar) {
            z.this.f80617b.movableContentStateReleased$runtime(i2Var, h2Var, dVar);
        }

        @Override // p0.f0
        public h2 movableContentStateResolve$runtime(i2 i2Var) {
            return z.this.f80617b.movableContentStateResolve$runtime(i2Var);
        }

        @Override // p0.f0
        public z.o1 recomposePaused$runtime(y0 y0Var, p4 p4Var, z.o1 o1Var) {
            return z.this.f80617b.recomposePaused$runtime(y0Var, p4Var, o1Var);
        }

        @Override // p0.f0
        public void recordInspectionTable$runtime(Set<d1.e> set) {
            Set hashSet = this.f80647e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f80647e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // p0.f0
        public void registerComposer$runtime(w wVar) {
            kotlin.jvm.internal.e0.checkNotNull(wVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime((z) wVar);
            this.f80648f.add(wVar);
        }

        @Override // p0.f0
        public void registerComposition$runtime(y0 y0Var) {
            z.this.f80617b.registerComposition$runtime(y0Var);
        }

        @Override // p0.f0
        public void reportPausedScope$runtime(k3 k3Var) {
            z.this.f80617b.reportPausedScope$runtime(k3Var);
        }

        @Override // p0.f0
        public void reportRemovedComposition$runtime(y0 y0Var) {
            z.this.f80617b.reportRemovedComposition$runtime(y0Var);
        }

        public final void setInspectionTables(Set<Set<d1.e>> set) {
            this.f80647e = set;
        }

        @Override // p0.f0
        public void startComposing$runtime() {
            z.this.B++;
        }

        @Override // p0.f0
        public void unregisterComposer$runtime(w wVar) {
            Set<Set> set = this.f80647e;
            if (set != null) {
                for (Set set2 : set) {
                    kotlin.jvm.internal.e0.checkNotNull(wVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((z) wVar).f80618c);
                }
            }
            kotlin.jvm.internal.h1.asMutableCollection(this.f80648f).remove(wVar);
        }

        @Override // p0.f0
        public void unregisterComposition$runtime(y0 y0Var) {
            z.this.f80617b.unregisterComposition$runtime(y0Var);
        }

        public final void updateCompositionLocalScope(z2 z2Var) {
            this.f80649g.setValue(z2Var);
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime$annotations() {
        }
    }

    public static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    public static /* synthetic */ void getInserting$annotations() {
    }

    public static /* synthetic */ void getSkipping$annotations() {
    }

    @Override // p0.w
    public boolean changed(float f10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && f10 == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f10));
        return true;
    }

    @Override // p0.w
    public boolean changed(long j10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && j10 == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j10));
        return true;
    }

    @Override // p0.w
    public boolean changed(double d10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && d10 == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d10));
        return true;
    }

    @Override // p0.w
    public boolean changed(int i10) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && i10 == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i10));
        return true;
    }
}
