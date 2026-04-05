package q0;

import java.util.ArrayList;
import java.util.List;
import p0.h2;
import p0.i2;
import p0.k3;
import p0.k4;
import p0.r1;
import p0.r4;
import p0.s4;
import p0.u5;
import p0.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final p0.z f82324a;

    /* renamed from: b, reason: collision with root package name */
    public q0.a f82325b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f82326c;

    /* renamed from: f, reason: collision with root package name */
    public int f82329f;

    /* renamed from: g, reason: collision with root package name */
    public int f82330g;

    /* renamed from: l, reason: collision with root package name */
    public int f82335l;

    /* renamed from: d, reason: collision with root package name */
    public final r1 f82327d = new r1();

    /* renamed from: e, reason: collision with root package name */
    public boolean f82328e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f82331h = u5.m5841constructorimpl$default(null, 1, null);

    /* renamed from: i, reason: collision with root package name */
    public int f82332i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f82333j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f82334k = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public b(p0.z zVar, q0.a aVar) {
        this.f82324a = zVar;
        this.f82325b = aVar;
    }

    public static /* synthetic */ void includeOperationsIn$default(b bVar, q0.a aVar, z0.w wVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            wVar = null;
        }
        bVar.includeOperationsIn(aVar, wVar);
    }

    public final void a() {
        int i10 = this.f82330g;
        if (i10 > 0) {
            this.f82325b.pushUps(i10);
            this.f82330g = 0;
        }
        ArrayList arrayList = this.f82331h;
        if (u5.m5847isNotEmptyimpl(arrayList)) {
            this.f82325b.pushDowns(u5.m5852toArrayimpl(arrayList));
            u5.m5839clearimpl(arrayList);
        }
    }

    public final void appendValue(p0.b bVar, Object obj) {
        this.f82325b.pushAppendValue(bVar, obj);
    }

    public final void b() {
        int i10 = this.f82335l;
        if (i10 > 0) {
            int i11 = this.f82332i;
            if (i11 >= 0) {
                a();
                this.f82325b.pushRemoveNode(i11, i10);
                this.f82332i = -1;
            } else {
                int i12 = this.f82334k;
                int i13 = this.f82333j;
                a();
                this.f82325b.pushMoveNode(i12, i13, i10);
                this.f82333j = -1;
                this.f82334k = -1;
            }
            this.f82335l = 0;
        }
    }

    public final void c(boolean z10) {
        p0.z zVar = this.f82324a;
        int parent = z10 ? zVar.getReader$runtime().getParent() : zVar.getReader$runtime().getCurrentGroup();
        int i10 = parent - this.f82329f;
        if (i10 < 0) {
            p0.d0.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i10 > 0) {
            this.f82325b.pushAdvanceSlotsBy(i10);
            this.f82329f = parent;
        }
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, z0.w wVar) {
        this.f82325b.pushCopyNodesToNewAnchorLocation(list, wVar);
    }

    public final void copySlotTableToAnchorLocation(h2 h2Var, p0.f0 f0Var, i2 i2Var, i2 i2Var2) {
        this.f82325b.pushCopySlotTableToAnchorLocation(h2Var, f0Var, i2Var, i2Var2);
    }

    public final void deactivateCurrentGroup() {
        c(false);
        this.f82325b.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(z0.w wVar, p0.b bVar) {
        a();
        this.f82325b.pushDetermineMovableContentNodeIndex(wVar, bVar);
    }

    public final void endCompositionScope(kv.l lVar, p0.e0 e0Var) {
        this.f82325b.pushEndCompositionScope(lVar, e0Var);
    }

    public final void endCurrentGroup() {
        int parent = this.f82324a.getReader$runtime().getParent();
        r1 r1Var = this.f82327d;
        if (r1Var.peekOr(-1) > parent) {
            p0.d0.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (r1Var.peekOr(-1) == parent) {
            c(false);
            r1Var.pop();
            this.f82325b.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        this.f82325b.pushEndMovableContentPlacement();
        this.f82329f = 0;
    }

    public final void endNodeMovement() {
        b();
    }

    public final void endNodeMovementAndDeleteNode(int i10, int i11) {
        endNodeMovement();
        a();
        p0.z zVar = this.f82324a;
        int iNodeCount = zVar.getReader$runtime().isNode(i11) ? 1 : zVar.getReader$runtime().nodeCount(i11);
        if (iNodeCount > 0) {
            removeNode(i10, iNodeCount);
        }
    }

    public final void endResumingScope(k3 k3Var) {
        this.f82325b.pushEndResumingScope(k3Var);
    }

    public final void endRoot() {
        if (this.f82326c) {
            c(false);
            c(false);
            this.f82325b.pushEndCurrentGroup();
            this.f82326c = false;
        }
    }

    public final void finalizeComposition() {
        a();
        if (this.f82327d.f80424b == 0) {
            return;
        }
        p0.d0.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    public final q0.a getChangeList() {
        return this.f82325b;
    }

    public final boolean getImplicitRootStart() {
        return this.f82328e;
    }

    public final boolean getPastParent() {
        return this.f82324a.getReader$runtime().getParent() - this.f82329f < 0;
    }

    public final void includeOperationsIn(q0.a aVar, z0.w wVar) {
        this.f82325b.pushExecuteOperationsIn(aVar, wVar);
    }

    public final void insertSlots(p0.b bVar, s4 s4Var) {
        a();
        c(false);
        recordSlotEditing();
        b();
        this.f82325b.pushInsertSlots(bVar, s4Var);
    }

    public final void moveCurrentGroup(int i10) {
        c(false);
        recordSlotEditing();
        this.f82325b.pushMoveCurrentGroup(i10);
    }

    public final void moveDown(Object obj) {
        b();
        u5.m5851pushimpl(this.f82331h, obj);
    }

    public final void moveNode(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f82335l;
            if (i13 > 0 && this.f82333j == i10 - i13 && this.f82334k == i11 - i13) {
                this.f82335l = i13 + i12;
                return;
            }
            b();
            this.f82333j = i10;
            this.f82334k = i11;
            this.f82335l = i12;
        }
    }

    public final void moveReaderRelativeTo(int i10) {
        this.f82329f = (i10 - this.f82324a.getReader$runtime().getCurrentGroup()) + this.f82329f;
    }

    public final void moveReaderToAbsolute(int i10) {
        this.f82329f = i10;
    }

    public final void moveUp() {
        b();
        ArrayList arrayList = this.f82331h;
        if (u5.m5847isNotEmptyimpl(arrayList)) {
            u5.m5850popimpl(arrayList);
        } else {
            this.f82330g++;
        }
    }

    public final void recordSlotEditing() {
        p0.z zVar = this.f82324a;
        if (zVar.getReader$runtime().getSize() > 0) {
            r4 reader$runtime = zVar.getReader$runtime();
            int parent = reader$runtime.getParent();
            r1 r1Var = this.f82327d;
            if (r1Var.peekOr(-2) != parent) {
                if (!this.f82326c && this.f82328e) {
                    c(false);
                    this.f82325b.pushEnsureRootStarted();
                    this.f82326c = true;
                }
                if (parent > 0) {
                    p0.b bVarAnchor = reader$runtime.anchor(parent);
                    r1Var.push(parent);
                    c(false);
                    this.f82325b.pushEnsureGroupStarted(bVarAnchor);
                    this.f82326c = true;
                }
            }
        }
    }

    public final void releaseMovableContent() {
        a();
        if (this.f82326c) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void releaseMovableGroupAtCurrent(y0 y0Var, p0.f0 f0Var, i2 i2Var) {
        this.f82325b.pushReleaseMovableGroupAtCurrent(y0Var, f0Var, i2Var);
    }

    public final void remember(k4 k4Var) {
        this.f82325b.pushRemember(k4Var);
    }

    public final void rememberPausingScope(k3 k3Var) {
        this.f82325b.pushRememberPausingScope(k3Var);
    }

    public final void removeCurrentGroup() {
        c(false);
        recordSlotEditing();
        this.f82325b.pushRemoveCurrentGroup();
        this.f82329f = this.f82324a.getReader$runtime().getGroupSize() + this.f82329f;
    }

    public final void removeNode(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                p0.d0.composeImmediateRuntimeError("Invalid remove index " + i10);
            }
            if (this.f82332i == i10) {
                this.f82335l += i11;
                return;
            }
            b();
            this.f82332i = i10;
            this.f82335l = i11;
        }
    }

    public final void resetSlots() {
        this.f82325b.pushResetSlots();
    }

    public final void resetTransientState() {
        this.f82326c = false;
        this.f82327d.clear();
        this.f82329f = 0;
        this.f82328e = true;
        this.f82330g = 0;
        u5.m5839clearimpl(this.f82331h);
        this.f82332i = -1;
        this.f82333j = -1;
        this.f82334k = -1;
        this.f82335l = 0;
    }

    public final void setChangeList(q0.a aVar) {
        this.f82325b = aVar;
    }

    public final void setImplicitRootStart(boolean z10) {
        this.f82328e = z10;
    }

    public final void sideEffect(kv.a aVar) {
        this.f82325b.pushSideEffect(aVar);
    }

    public final void skipToEndOfCurrentGroup() {
        this.f82325b.pushSkipToEndOfCurrentGroup();
    }

    public final void startResumingScope(k3 k3Var) {
        this.f82325b.pushStartResumingScope(k3Var);
    }

    public final void trimValues(int i10) {
        if (i10 > 0) {
            c(false);
            recordSlotEditing();
            this.f82325b.pushTrimValues(i10);
        }
    }

    public final void updateAnchoredValue(Object obj, p0.b bVar, int i10) {
        this.f82325b.pushUpdateAnchoredValue(obj, bVar, i10);
    }

    public final void updateAuxData(Object obj) {
        c(false);
        this.f82325b.pushUpdateAuxData(obj);
    }

    public final <T, V> void updateNode(V v10, kv.p pVar) {
        a();
        this.f82325b.pushUpdateNode(v10, pVar);
    }

    public final void updateValue(Object obj, int i10) {
        c(true);
        this.f82325b.pushUpdateValue(obj, i10);
    }

    public final void useNode(Object obj) {
        a();
        this.f82325b.pushUseNode(obj);
    }

    public final void withChangeList(q0.a aVar, kv.a aVar2) {
        q0.a changeList = getChangeList();
        try {
            setChangeList(aVar);
            aVar2.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            setChangeList(changeList);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public final void withoutImplicitRootStart(kv.a aVar) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            setImplicitRootStart(implicitRootStart);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public final void insertSlots(p0.b bVar, s4 s4Var, c cVar) {
        a();
        c(false);
        recordSlotEditing();
        b();
        this.f82325b.pushInsertSlots(bVar, s4Var, cVar);
    }
}
