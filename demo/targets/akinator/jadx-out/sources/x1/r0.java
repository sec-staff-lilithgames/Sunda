package x1;

import a2.r6;
import j1.o2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1.b0 f91410a;

    /* renamed from: b, reason: collision with root package name */
    public p0.f0 f91411b;

    /* renamed from: c, reason: collision with root package name */
    public int f91412c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f91413d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f91414e;

    /* renamed from: f, reason: collision with root package name */
    public final b f91415f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f91416g;

    /* renamed from: h, reason: collision with root package name */
    public final d2 f91417h;

    /* renamed from: i, reason: collision with root package name */
    public int f91418i;

    /* renamed from: j, reason: collision with root package name */
    public int f91419j;

    /* renamed from: k, reason: collision with root package name */
    public final String f91420k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements c2 {

        /* renamed from: b, reason: collision with root package name */
        public s2.x f91426b = s2.x.f85364c;

        /* renamed from: c, reason: collision with root package name */
        public float f91427c;

        /* renamed from: e, reason: collision with root package name */
        public float f91428e;

        public b() {
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        public float getDensity() {
            return this.f91427c;
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        public float getFontScale() {
            return this.f91428e;
        }

        @Override // x1.c2, x1.a1, x1.z
        public s2.x getLayoutDirection() {
            return this.f91426b;
        }

        @Override // x1.c2, x1.a1
        public /* bridge */ /* synthetic */ y0 layout(int i10, int i11, Map map, kv.l lVar) {
            return super.layout(i10, i11, map, lVar);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: roundToPx--R2X_6o */
        public /* bridge */ /* synthetic */ int mo3418roundToPxR2X_6o(long j10) {
            return super.mo3418roundToPxR2X_6o(j10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: roundToPx-0680j_4 */
        public /* bridge */ /* synthetic */ int mo3419roundToPx0680j_4(float f10) {
            return super.mo3419roundToPx0680j_4(f10);
        }

        public void setDensity(float f10) {
            this.f91427c = f10;
        }

        public void setFontScale(float f10) {
            this.f91428e = f10;
        }

        public void setLayoutDirection(s2.x xVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<set-?>");
            this.f91426b = xVar;
        }

        @Override // x1.c2
        public List<w0> subcompose(Object obj, kv.p content) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            return r0.this.subcompose(obj, content);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toDp-GaN1DYA */
        public /* bridge */ /* synthetic */ float mo3420toDpGaN1DYA(long j10) {
            return super.mo3420toDpGaN1DYA(j10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toDp-u2uoSUM */
        public /* bridge */ /* synthetic */ float mo3421toDpu2uoSUM(float f10) {
            return super.mo3421toDpu2uoSUM(f10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toDpSize-k-rfVVM */
        public /* bridge */ /* synthetic */ long mo3423toDpSizekrfVVM(long j10) {
            return super.mo3423toDpSizekrfVVM(j10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toPx--R2X_6o */
        public /* bridge */ /* synthetic */ float mo3424toPxR2X_6o(long j10) {
            return super.mo3424toPxR2X_6o(j10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toPx-0680j_4 */
        public /* bridge */ /* synthetic */ float mo3425toPx0680j_4(float f10) {
            return super.mo3425toPx0680j_4(f10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        public /* bridge */ /* synthetic */ i1.j toRect(s2.m mVar) {
            return super.toRect(mVar);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toSize-XkaWNTQ */
        public /* bridge */ /* synthetic */ long mo3426toSizeXkaWNTQ(long j10) {
            return super.mo3426toSizeXkaWNTQ(j10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toSp-0xMU5do */
        public /* bridge */ /* synthetic */ long mo3427toSp0xMU5do(float f10) {
            return super.mo3427toSp0xMU5do(f10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toSp-kPz2Gy4 */
        public /* bridge */ /* synthetic */ long mo3428toSpkPz2Gy4(float f10) {
            return super.mo3428toSpkPz2Gy4(f10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toDp-u2uoSUM */
        public /* bridge */ /* synthetic */ float mo3422toDpu2uoSUM(int i10) {
            return super.mo3422toDpu2uoSUM(i10);
        }

        @Override // x1.c2, x1.a1, x1.z, s2.e
        /* renamed from: toSp-kPz2Gy4 */
        public /* bridge */ /* synthetic */ long mo3429toSpkPz2Gy4(int i10) {
            return super.mo3429toSpkPz2Gy4(i10);
        }
    }

    public r0(z1.b0 root, e2 slotReusePolicy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
        kotlin.jvm.internal.e0.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f91410a = root;
        this.f91413d = new LinkedHashMap();
        this.f91414e = new LinkedHashMap();
        this.f91415f = new b();
        this.f91416g = new LinkedHashMap();
        this.f91417h = new d2(null, 1, null);
        this.f91420k = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(int i10, int i11, int i12) {
        z1.b0 b0Var = this.f91410a;
        b0Var.f97265m = true;
        b0Var.move$ui_release(i10, i11, i12);
        b0Var.f97265m = false;
    }

    public final void b(z1.b0 b0Var, Object obj, kv.p pVar) {
        LinkedHashMap linkedHashMap = this.f91413d;
        Object obj2 = linkedHashMap.get(b0Var);
        if (obj2 == null) {
            a aVar = new a(obj, j.f91372a.m7832getLambda1$ui_release(), null, 4, null);
            linkedHashMap.put(b0Var, aVar);
            obj2 = aVar;
        }
        a aVar2 = (a) obj2;
        p0.e0 composition = aVar2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (aVar2.getContent() != pVar || hasInvalidations || aVar2.getForceRecompose()) {
            aVar2.setContent(pVar);
            b1.m mVarCreateNonObservableSnapshot = b1.m.f8651e.createNonObservableSnapshot();
            try {
                b1.m mVarMakeCurrent = mVarCreateNonObservableSnapshot.makeCurrent();
                try {
                    z1.b0 b0Var2 = this.f91410a;
                    b0Var2.f97265m = true;
                    kv.p content = aVar2.getContent();
                    p0.e0 composition2 = aVar2.getComposition();
                    p0.f0 f0Var = this.f91411b;
                    if (f0Var == null) {
                        throw new IllegalStateException("parent composition reference not set");
                    }
                    z0.b bVarComposableLambdaInstance = z0.u.composableLambdaInstance(-34810602, true, new v0(aVar2, content));
                    if (composition2 == null || composition2.isDisposed()) {
                        composition2 = r6.createSubcomposition(b0Var, f0Var);
                    }
                    composition2.setContent(bVarComposableLambdaInstance);
                    aVar2.setComposition(composition2);
                    b0Var2.f97265m = false;
                    mVarCreateNonObservableSnapshot.restoreCurrent(mVarMakeCurrent);
                    mVarCreateNonObservableSnapshot.dispose();
                    aVar2.setForceRecompose(false);
                } catch (Throwable th2) {
                    mVarCreateNonObservableSnapshot.restoreCurrent(mVarMakeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                mVarCreateNonObservableSnapshot.dispose();
                throw th3;
            }
        }
    }

    public final z1.b0 c(Object obj) {
        LinkedHashMap linkedHashMap;
        int i10;
        if (this.f91418i != 0) {
            z1.b0 b0Var = this.f91410a;
            int size = b0Var.getFoldedChildren$ui_release().size() - this.f91419j;
            int i11 = size - this.f91418i;
            int i12 = size - 1;
            int i13 = i12;
            while (true) {
                linkedHashMap = this.f91413d;
                if (i13 < i11) {
                    i10 = -1;
                    break;
                }
                Object obj2 = linkedHashMap.get(b0Var.getFoldedChildren$ui_release().get(i13));
                kotlin.jvm.internal.e0.checkNotNull(obj2);
                if (kotlin.jvm.internal.e0.areEqual(((a) obj2).getSlotId(), obj)) {
                    i10 = i13;
                    break;
                }
                i13--;
            }
            if (i10 != -1) {
                i12 = i13;
            } else if (i12 >= i11) {
                Object obj3 = linkedHashMap.get(b0Var.getFoldedChildren$ui_release().get(i12));
                kotlin.jvm.internal.e0.checkNotNull(obj3);
                ((a) obj3).getSlotId();
                throw null;
            }
            if (i10 != -1) {
                if (i12 != i11) {
                    a(i12, i11, 1);
                }
                this.f91418i--;
                z1.b0 b0Var2 = b0Var.getFoldedChildren$ui_release().get(i11);
                Object obj4 = linkedHashMap.get(b0Var2);
                kotlin.jvm.internal.e0.checkNotNull(obj4);
                ((a) obj4).setActive(true);
                b1.m.f8651e.sendApplyNotifications();
                return b0Var2;
            }
        }
        return null;
    }

    public final x0 createMeasurePolicy(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return new t0(this, block, this.f91420k);
    }

    public final void disposeCurrentNodes() {
        z1.b0 b0Var = this.f91410a;
        b0Var.f97265m = true;
        LinkedHashMap linkedHashMap = this.f91413d;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            p0.e0 composition = ((a) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        b0Var.removeAll$ui_release();
        b0Var.f97265m = false;
        linkedHashMap.clear();
        this.f91414e.clear();
        this.f91419j = 0;
        this.f91418i = 0;
        this.f91416g.clear();
        makeSureStateIsConsistent();
    }

    public final void disposeOrReuseStartingFromIndex(int i10) {
        this.f91418i = 0;
        z1.b0 b0Var = this.f91410a;
        int size = (b0Var.getFoldedChildren$ui_release().size() - this.f91419j) - 1;
        if (i10 > size) {
            makeSureStateIsConsistent();
            return;
        }
        d2 d2Var = this.f91417h;
        d2Var.clear();
        if (i10 <= size) {
            while (true) {
                Object obj = this.f91413d.get(b0Var.getFoldedChildren$ui_release().get(i10));
                kotlin.jvm.internal.e0.checkNotNull(obj);
                d2Var.add(((a) obj).getSlotId());
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        throw null;
    }

    public final void forceRecomposeChildren() {
        Iterator it = this.f91413d.entrySet().iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).setForceRecompose(true);
        }
        z1.b0 b0Var = this.f91410a;
        if (b0Var.getMeasurePending$ui_release()) {
            return;
        }
        z1.b0.requestRemeasure$ui_release$default(b0Var, false, 1, null);
    }

    public final p0.f0 getCompositionContext() {
        return this.f91411b;
    }

    public final e2 getSlotReusePolicy() {
        return null;
    }

    public final void makeSureStateIsConsistent() {
        LinkedHashMap linkedHashMap = this.f91413d;
        int size = linkedHashMap.size();
        z1.b0 b0Var = this.f91410a;
        if (size != b0Var.getFoldedChildren$ui_release().size()) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + linkedHashMap.size() + ") and the children count on the SubcomposeLayout (" + b0Var.getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((b0Var.getFoldedChildren$ui_release().size() - this.f91418i) - this.f91419j < 0) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + b0Var.getFoldedChildren$ui_release().size() + ". Reusable children " + this.f91418i + ". Precomposed children " + this.f91419j).toString());
        }
        LinkedHashMap linkedHashMap2 = this.f91416g;
        if (linkedHashMap2.size() == this.f91419j) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f91419j + ". Map size " + linkedHashMap2.size()).toString());
    }

    public final b2 precompose(Object obj, kv.p content) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        if (!this.f91414e.containsKey(obj)) {
            LinkedHashMap linkedHashMap = this.f91416g;
            Object objC = linkedHashMap.get(obj);
            if (objC == null) {
                objC = c(obj);
                z1.b0 b0Var = this.f91410a;
                if (objC != null) {
                    a(b0Var.getFoldedChildren$ui_release().indexOf(objC), b0Var.getFoldedChildren$ui_release().size(), 1);
                    this.f91419j++;
                } else {
                    int size = b0Var.getFoldedChildren$ui_release().size();
                    z1.b0 b0Var2 = new z1.b0(true);
                    b0Var.f97265m = true;
                    b0Var.insertAt$ui_release(size, b0Var2);
                    b0Var.f97265m = false;
                    this.f91419j++;
                    objC = b0Var2;
                }
                linkedHashMap.put(obj, objC);
            }
            b((z1.b0) objC, obj, content);
        }
        return new u0(this, obj);
    }

    public final void setCompositionContext(p0.f0 f0Var) {
        this.f91411b = f0Var;
    }

    public final void setSlotReusePolicy(e2 value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        if (value != null) {
            disposeOrReuseStartingFromIndex(0);
        }
    }

    public final List<w0> subcompose(Object obj, kv.p content) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        z1.b0 b0Var = this.f91410a;
        z1.c0 layoutState$ui_release = b0Var.getLayoutState$ui_release();
        if (layoutState$ui_release != z1.c0.f97282b && layoutState$ui_release != z1.c0.f97283c) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        LinkedHashMap linkedHashMap = this.f91414e;
        Object objC = linkedHashMap.get(obj);
        if (objC == null) {
            objC = (z1.b0) this.f91416g.remove(obj);
            if (objC != null) {
                int i10 = this.f91419j;
                if (i10 <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.f91419j = i10 - 1;
            } else {
                objC = c(obj);
                if (objC == null) {
                    int i11 = this.f91412c;
                    z1.b0 b0Var2 = new z1.b0(true);
                    b0Var.f97265m = true;
                    b0Var.insertAt$ui_release(i11, b0Var2);
                    b0Var.f97265m = false;
                    objC = b0Var2;
                }
            }
            linkedHashMap.put(obj, objC);
        }
        z1.b0 b0Var3 = (z1.b0) objC;
        int iIndexOf = b0Var.getFoldedChildren$ui_release().indexOf(b0Var3);
        int i12 = this.f91412c;
        if (iIndexOf < i12) {
            throw new IllegalArgumentException(o2.k(obj, "Key ", " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
        }
        if (i12 != iIndexOf) {
            a(iIndexOf, i12, 1);
        }
        this.f91412c++;
        b(b0Var3, obj, content);
        return b0Var3.getChildren$ui_release();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f91421a;

        /* renamed from: b, reason: collision with root package name */
        public kv.p f91422b;

        /* renamed from: c, reason: collision with root package name */
        public p0.e0 f91423c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f91424d;

        /* renamed from: e, reason: collision with root package name */
        public final j2 f91425e;

        public a(Object obj, kv.p content, p0.e0 e0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
            this.f91421a = obj;
            this.f91422b = content;
            this.f91423c = e0Var;
            this.f91425e = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }

        public final boolean getActive() {
            return ((Boolean) this.f91425e.getValue()).booleanValue();
        }

        public final p0.e0 getComposition() {
            return this.f91423c;
        }

        public final kv.p getContent() {
            return this.f91422b;
        }

        public final boolean getForceRecompose() {
            return this.f91424d;
        }

        public final Object getSlotId() {
            return this.f91421a;
        }

        public final void setActive(boolean z10) {
            this.f91425e.setValue(Boolean.valueOf(z10));
        }

        public final void setComposition(p0.e0 e0Var) {
            this.f91423c = e0Var;
        }

        public final void setContent(kv.p pVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<set-?>");
            this.f91422b = pVar;
        }

        public final void setForceRecompose(boolean z10) {
            this.f91424d = z10;
        }

        public final void setSlotId(Object obj) {
            this.f91421a = obj;
        }

        public /* synthetic */ a(Object obj, kv.p pVar, p0.e0 e0Var, int i10, kotlin.jvm.internal.u uVar) {
            this(obj, pVar, (i10 & 4) != 0 ? null : e0Var);
        }
    }
}
