package p0;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import p0.k3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f80177a;

    /* renamed from: b, reason: collision with root package name */
    public static final p2 f80178b = new p2(IronSourceConstants.EVENTS_PROVIDER);

    /* renamed from: c, reason: collision with root package name */
    public static final p2 f80179c = new p2(IronSourceConstants.EVENTS_PROVIDER);

    /* renamed from: d, reason: collision with root package name */
    public static final p2 f80180d = new p2("compositionLocalMap");

    /* renamed from: e, reason: collision with root package name */
    public static final p2 f80181e = new p2("providerValues");

    /* renamed from: f, reason: collision with root package name */
    public static final p2 f80182f = new p2("providers");

    /* renamed from: g, reason: collision with root package name */
    public static final p2 f80183g = new p2("reference");

    /* renamed from: h, reason: collision with root package name */
    public static final ni.a f80184h = new ni.a(5);

    public static final void a(r4 r4Var, ArrayList arrayList, int i10) {
        if (r4Var.isNode(i10)) {
            arrayList.add(r4Var.node(i10));
            return;
        }
        int iGroupSize = i10 + 1;
        int iGroupSize2 = r4Var.groupSize(i10) + i10;
        while (iGroupSize < iGroupSize2) {
            a(r4Var, arrayList, iGroupSize);
            iGroupSize += r4Var.groupSize(iGroupSize);
        }
    }

    public static final boolean access$asBool(int i10) {
        return i10 != 0;
    }

    public static final List access$collectNodesFrom(s4 s4Var, b bVar) {
        ArrayList arrayList = new ArrayList();
        r4 r4VarOpenReader = s4Var.openReader();
        try {
            a(r4VarOpenReader, arrayList, s4Var.anchorIndex(bVar));
            return arrayList;
        } finally {
            r4VarOpenReader.close();
        }
    }

    public static final int access$findInsertLocation(List list, int i10) {
        int iB = b(i10, list);
        return iB < 0 ? -(iB + 1) : iB;
    }

    public static final s1 access$firstInRange(List list, int i10, int i11) {
        int iB = b(i10, list);
        if (iB < 0) {
            iB = -(iB + 1);
        }
        if (iB >= list.size()) {
            return null;
        }
        s1 s1Var = (s1) list.get(iB);
        if (s1Var.getLocation() < i11) {
            return s1Var;
        }
        return null;
    }

    public static final Object access$getJoinedKey(v1 v1Var) {
        return v1Var.getObjectKey() != null ? new u1(Integer.valueOf(v1Var.getKey()), v1Var.getObjectKey()) : Integer.valueOf(v1Var.getKey());
    }

    public static final int access$getNextGroup(v4 v4Var) {
        return v4Var.groupSize(v4Var.getCurrentGroup()) + v4Var.getCurrentGroup();
    }

    public static final void access$insertIfMissing(List list, int i10, k3 k3Var, Object obj) {
        int iB = b(i10, list);
        if (iB < 0) {
            int i11 = -(iB + 1);
            if (!(obj instanceof d1)) {
                obj = null;
            }
            list.add(i11, new s1(k3Var, i10, obj));
            return;
        }
        s1 s1Var = (s1) list.get(iB);
        if (!(obj instanceof d1)) {
            s1Var.setInstances(null);
            return;
        }
        Object instances = s1Var.getInstances();
        if (instances == null) {
            s1Var.setInstances(obj);
        } else if (instances instanceof z.v0) {
            ((z.v0) instances).add(obj);
        } else {
            s1Var.setInstances(z.p1.mutableScatterSetOf(instances, obj));
        }
    }

    public static final int access$nearestCommonRootOf(r4 r4Var, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (r4Var.parent(i10) == i11) {
                return i11;
            }
            if (r4Var.parent(i11) != i10) {
                if (r4Var.parent(i10) == r4Var.parent(i11)) {
                    return r4Var.parent(i10);
                }
                int iParent = i10;
                int i13 = 0;
                while (iParent > 0 && iParent != i12) {
                    iParent = r4Var.parent(iParent);
                    i13++;
                }
                int iParent2 = i11;
                int i14 = 0;
                while (iParent2 > 0 && iParent2 != i12) {
                    iParent2 = r4Var.parent(iParent2);
                    i14++;
                }
                int i15 = i13 - i14;
                for (int i16 = 0; i16 < i15; i16++) {
                    i10 = r4Var.parent(i10);
                }
                int i17 = i14 - i13;
                for (int i18 = 0; i18 < i17; i18++) {
                    i11 = r4Var.parent(i11);
                }
                while (i10 != i11) {
                    i10 = r4Var.parent(i10);
                    i11 = r4Var.parent(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    public static final s1 access$removeLocation(List list, int i10) {
        int iB = b(i10, list);
        if (iB >= 0) {
            return (s1) list.remove(iB);
        }
        return null;
    }

    public static final void access$removeRange(List list, int i10, int i11) {
        int iB = b(i10, list);
        if (iB < 0) {
            iB = -(iB + 1);
        }
        while (iB < list.size() && ((s1) list.get(iB)).getLocation() < i11) {
        }
    }

    public static final int b(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iCompare = kotlin.jvm.internal.e0.compare(((s1) list.get(i12)).getLocation(), i10);
            if (iCompare < 0) {
                i11 = i12 + 1;
            } else {
                if (iCompare <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final Object c(Object obj, Object obj2, Object obj3) {
        u1 u1Var = obj instanceof u1 ? (u1) obj : null;
        if (u1Var == null) {
            return null;
        }
        if (kotlin.jvm.internal.e0.areEqual(u1Var.getLeft(), obj2) && kotlin.jvm.internal.e0.areEqual(u1Var.getRight(), obj3)) {
            return obj;
        }
        Object objC = c(u1Var.getLeft(), obj2, obj3);
        return objC == null ? c(u1Var.getRight(), obj2, obj3) : objC;
    }

    public static final <T> T cache(w wVar, boolean z10, kv.a aVar) {
        T t10 = (T) wVar.rememberedValue();
        if (!z10 && t10 != v.f80515a.getEmpty()) {
            return t10;
        }
        T t11 = (T) aVar.invoke();
        wVar.updateRememberedValue(t11);
        return t11;
    }

    public static final void composeImmediateRuntimeError(String str) {
        throw new t(a.b.l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void composeRuntimeError(String str) {
        throw new t(a.b.l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void d(v4 v4Var, int i10, Object obj) {
        Object objClear = v4Var.clear(i10);
        if (obj == objClear) {
            return;
        }
        composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + objClear + ')');
    }

    public static final void deactivateCurrentGroup(v4 v4Var, i4 i4Var) {
        v4Var.forAllDataInRememberOrder(v4Var.getCurrentGroup(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(3, i4Var, v4Var));
    }

    public static final void debugRuntimeCheck(boolean z10, kv.a aVar) {
    }

    public static final h2 extractMovableContentAtCurrent(y0 y0Var, i2 i2Var, v4 v4Var, d dVar) {
        s4 s4Var = new s4();
        if (v4Var.getCollectingSourceInformation()) {
            s4Var.collectSourceInformation();
        }
        if (v4Var.getCollectingCalledInformation()) {
            s4Var.collectCalledByInformation();
        }
        int currentGroup = v4Var.getCurrentGroup();
        if (dVar != null && v4Var.nodeCount(currentGroup) > 0) {
            int parent = v4Var.getParent();
            while (parent > 0 && !v4Var.isNode(parent)) {
                parent = v4Var.parent(parent);
            }
            if (parent >= 0 && v4Var.isNode(parent)) {
                Object objNode = v4Var.node(parent);
                int i10 = parent + 1;
                int iGroupSize = v4Var.groupSize(parent) + parent;
                int iNodeCount = 0;
                while (i10 < iGroupSize) {
                    int iGroupSize2 = v4Var.groupSize(i10) + i10;
                    if (iGroupSize2 > currentGroup) {
                        break;
                    }
                    iNodeCount += v4Var.isNode(i10) ? 1 : v4Var.nodeCount(i10);
                    i10 = iGroupSize2;
                }
                int iNodeCount2 = v4Var.isNode(currentGroup) ? 1 : v4Var.nodeCount(currentGroup);
                dVar.down(objNode);
                dVar.remove(iNodeCount, iNodeCount2);
                dVar.up();
            }
        }
        v4 v4VarOpenWriter = s4Var.openWriter();
        try {
            v4VarOpenWriter.beginInsert();
            v4VarOpenWriter.startGroup(126665345, i2Var.getContent$runtime());
            v4.markGroup$default(v4VarOpenWriter, 0, 1, null);
            v4VarOpenWriter.update(i2Var.getParameter$runtime());
            List<b> listMoveTo = v4Var.moveTo(i2Var.getAnchor$runtime(), 1, v4VarOpenWriter);
            v4VarOpenWriter.skipGroup();
            v4VarOpenWriter.endGroup();
            v4VarOpenWriter.endInsert();
            v4VarOpenWriter.close(true);
            h2 h2Var = new h2(s4Var);
            k3.a aVar = k3.f80299h;
            if (!aVar.hasAnchoredRecomposeScopes$runtime(s4Var, listMoveTo)) {
                return h2Var;
            }
            c0 c0Var = new c0(y0Var, i2Var);
            v4VarOpenWriter = s4Var.openWriter();
            try {
                aVar.adoptAnchoredScopes$runtime(v4VarOpenWriter, listMoveTo, c0Var);
                v4VarOpenWriter.close(true);
                return h2Var;
            } finally {
            }
        } finally {
        }
    }

    public static final boolean getComposeStackTraceEnabled() {
        return f80177a;
    }

    public static final Object getCompositionLocalMap() {
        return f80180d;
    }

    public static final Object getInvocation() {
        return f80178b;
    }

    public static final Object getProvider() {
        return f80179c;
    }

    public static final Object getProviderMaps() {
        return f80182f;
    }

    public static final Object getProviderValues() {
        return f80181e;
    }

    public static final Object getReference() {
        return f80183g;
    }

    public static final boolean isAfterFirstChild(v4 v4Var) {
        return v4Var.getCurrentGroup() > v4Var.getParent() + 1;
    }

    public static final boolean isTraceInProgress() {
        return false;
    }

    public static final void removeCurrentGroup(v4 v4Var, i4 i4Var) {
        v4Var.forAllDataInRememberOrder(v4Var.getCurrentGroup(), new a1.a(i4Var, 9));
        v4Var.removeGroup();
    }

    public static final void runtimeCheck(boolean z10, kv.a aVar) {
        if (z10) {
            return;
        }
        composeImmediateRuntimeError((String) aVar.invoke());
    }

    public static final void setComposeStackTraceEnabled(boolean z10) {
        f80177a = z10;
    }

    public static final void sourceInformation(w wVar, String str) {
        wVar.sourceInformation(str);
    }

    public static final void sourceInformationMarkerEnd(w wVar) {
        wVar.sourceInformationMarkerEnd();
    }

    public static final void sourceInformationMarkerStart(w wVar, int i10, String str) {
        wVar.sourceInformationMarkerStart(i10, str);
    }

    public static final <R> void withAfterAnchorInfo(v4 v4Var, b bVar, kv.p pVar) {
        int iAnchorIndex;
        int slotsSize;
        if (bVar == null || !bVar.getValid()) {
            iAnchorIndex = -1;
            slotsSize = -1;
        } else {
            iAnchorIndex = v4Var.anchorIndex(bVar);
            slotsSize = v4Var.getSlotsSize() - v4Var.slotsEndAllIndex$runtime(iAnchorIndex);
        }
        pVar.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final void debugRuntimeCheck(boolean z10) {
    }

    public static final boolean isAfterFirstChild(r4 r4Var) {
        return r4Var.getCurrentGroup() > r4Var.getParent() + 1;
    }

    public static final void runtimeCheck(boolean z10) {
        if (z10) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    public static final void traceEventStart(int i10, int i11, int i12, String str) {
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final void traceEventEnd() {
    }

    public static final int access$asInt(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final /* synthetic */ void access$setCompositionTracer$p(v0 v0Var) {
    }
}
