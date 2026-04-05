package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p {
    public static final /* synthetic */ <T, E extends d> void ComposeNode(kv.a aVar, kv.l lVar, w wVar, int i10) {
        d applier = wVar.getApplier();
        kotlin.jvm.internal.e0.reifiedOperationMarker(3, "E");
        if (applier == null) {
            invalidApplier();
        }
        wVar.startNode();
        if (wVar.getInserting()) {
            wVar.createNode(aVar);
        } else {
            wVar.useNode();
        }
        lVar.invoke(a6.m5779boximpl(a6.m5780constructorimpl(wVar)));
        wVar.endNode();
    }

    public static final /* synthetic */ <T, E extends d> void ReusableComposeNode(kv.a aVar, kv.l lVar, w wVar, int i10) {
        d applier = wVar.getApplier();
        kotlin.jvm.internal.e0.reifiedOperationMarker(3, "E");
        if (applier == null) {
            invalidApplier();
        }
        wVar.startReusableNode();
        if (wVar.getInserting()) {
            wVar.createNode(aVar);
        } else {
            wVar.useNode();
        }
        lVar.invoke(a6.m5779boximpl(a6.m5780constructorimpl(wVar)));
        wVar.endNode();
    }

    public static final void ReusableContent(Object obj, kv.p pVar, w wVar, int i10) {
        wVar.startReusableGroup(207, obj);
        pVar.invoke(wVar, Integer.valueOf((i10 >> 3) & 14));
        wVar.endReusableGroup();
    }

    public static final void ReusableContentHost(boolean z10, kv.p pVar, w wVar, int i10) {
        wVar.startReusableGroup(207, Boolean.valueOf(z10));
        boolean zChanged = wVar.changed(z10);
        if (z10) {
            pVar.invoke(wVar, Integer.valueOf((i10 >> 3) & 14));
        } else {
            wVar.deactivateToEndGroup(zChanged);
        }
        wVar.endReusableGroup();
    }

    public static final w getCurrentComposer(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-554250212, i10, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:180)");
        }
        throw new tu.u("Implemented as an intrinsic");
    }

    public static final int getCurrentCompositeKeyHash(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int compoundKeyHash = wVar.getCompoundKeyHash();
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final long getCurrentCompositeKeyHashCode(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-168259424, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long compositeKeyHashCode = wVar.getCompositeKeyHashCode();
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return compositeKeyHashCode;
    }

    public static final f0 getCurrentCompositionContext(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(1645225943, i10, -1, "androidx.compose.runtime.<get-currentCompositionContext> (Composables.kt:195)");
        }
        y0 composition = wVar.getComposition();
        kotlin.jvm.internal.e0.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        f0 parent = ((j0) composition).getParent();
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return parent;
    }

    public static final n0 getCurrentCompositionLocalContext(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-43352356, i10, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:220)");
        }
        n0 n0Var = new n0(wVar.buildContext().getCompositionLocalScope$runtime());
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return n0Var;
    }

    public static final i3 getCurrentRecomposeScope(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        i3 recomposeScope = wVar.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        wVar.recordUsed(recomposeScope);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final <T> T key(Object[] objArr, kv.p pVar, w wVar, int i10) {
        return (T) pVar.invoke(wVar, Integer.valueOf((i10 >> 3) & 14));
    }

    public static final <T> T remember(Object obj, kv.a aVar, w wVar, int i10) {
        boolean zChanged = wVar.changed(obj);
        T t10 = (T) wVar.rememberedValue();
        if (!zChanged && t10 != v.f80515a.getEmpty()) {
            return t10;
        }
        T t11 = (T) aVar.invoke();
        wVar.updateRememberedValue(t11);
        return t11;
    }

    public static final f0 rememberCompositionContext(w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        f0 f0VarBuildContext = wVar.buildContext();
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        return f0VarBuildContext;
    }

    public static final <T> T remember(Object obj, Object obj2, kv.a aVar, w wVar, int i10) {
        boolean zChanged = wVar.changed(obj) | wVar.changed(obj2);
        T t10 = (T) wVar.rememberedValue();
        if (!zChanged && t10 != v.f80515a.getEmpty()) {
            return t10;
        }
        T t11 = (T) aVar.invoke();
        wVar.updateRememberedValue(t11);
        return t11;
    }

    public static final /* synthetic */ <T, E extends d> void ComposeNode(kv.a aVar, kv.l lVar, kv.p pVar, w wVar, int i10) {
        d applier = wVar.getApplier();
        kotlin.jvm.internal.e0.reifiedOperationMarker(3, "E");
        if (applier == null) {
            invalidApplier();
        }
        wVar.startNode();
        if (wVar.getInserting()) {
            wVar.createNode(aVar);
        } else {
            wVar.useNode();
        }
        lVar.invoke(a6.m5779boximpl(a6.m5780constructorimpl(wVar)));
        pVar.invoke(wVar, Integer.valueOf((i10 >> 6) & 14));
        wVar.endNode();
    }

    public static final /* synthetic */ <T, E extends d> void ReusableComposeNode(kv.a aVar, kv.l lVar, kv.p pVar, w wVar, int i10) {
        d applier = wVar.getApplier();
        kotlin.jvm.internal.e0.reifiedOperationMarker(3, "E");
        if (applier == null) {
            invalidApplier();
        }
        wVar.startReusableNode();
        if (wVar.getInserting()) {
            wVar.createNode(aVar);
        } else {
            wVar.useNode();
        }
        lVar.invoke(a6.m5779boximpl(a6.m5780constructorimpl(wVar)));
        pVar.invoke(wVar, Integer.valueOf((i10 >> 6) & 14));
        wVar.endNode();
    }

    public static final <T> T remember(Object obj, Object obj2, Object obj3, kv.a aVar, w wVar, int i10) {
        boolean zChanged = wVar.changed(obj) | wVar.changed(obj2) | wVar.changed(obj3);
        T t10 = (T) wVar.rememberedValue();
        if (!zChanged && t10 != v.f80515a.getEmpty()) {
            return t10;
        }
        T t11 = (T) aVar.invoke();
        wVar.updateRememberedValue(t11);
        return t11;
    }

    public static final /* synthetic */ <T, E extends d> void ComposeNode(kv.a aVar, kv.l lVar, kv.q qVar, kv.p pVar, w wVar, int i10) {
        d applier = wVar.getApplier();
        kotlin.jvm.internal.e0.reifiedOperationMarker(3, "E");
        if (applier == null) {
            invalidApplier();
        }
        wVar.startNode();
        if (wVar.getInserting()) {
            wVar.createNode(aVar);
        } else {
            wVar.useNode();
        }
        lVar.invoke(a6.m5779boximpl(a6.m5780constructorimpl(wVar)));
        a.b.y((i10 >> 3) & 112, qVar, q4.m5830boximpl(q4.m5831constructorimpl(wVar)), wVar, 2058660585);
        pVar.invoke(wVar, Integer.valueOf((i10 >> 9) & 14));
        wVar.endReplaceableGroup();
        wVar.endNode();
    }

    public static final /* synthetic */ <T, E extends d> void ReusableComposeNode(kv.a aVar, kv.l lVar, kv.q qVar, kv.p pVar, w wVar, int i10) {
        d applier = wVar.getApplier();
        kotlin.jvm.internal.e0.reifiedOperationMarker(3, "E");
        if (applier == null) {
            invalidApplier();
        }
        wVar.startReusableNode();
        if (wVar.getInserting()) {
            wVar.createNode(aVar);
        } else {
            wVar.useNode();
        }
        lVar.invoke(a6.m5779boximpl(a6.m5780constructorimpl(wVar)));
        a.b.y((i10 >> 3) & 112, qVar, q4.m5830boximpl(q4.m5831constructorimpl(wVar)), wVar, 2058660585);
        pVar.invoke(wVar, Integer.valueOf((i10 >> 9) & 14));
        wVar.endReplaceableGroup();
        wVar.endNode();
    }

    @tu.f
    public static /* synthetic */ void getCurrentCompositeKeyHash$annotations() {
    }

    public static /* synthetic */ void getCurrentCompositionContext$annotations() {
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    public static final <T> T remember(Object[] objArr, kv.a aVar, w wVar, int i10) {
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= wVar.changed(obj);
        }
        T t10 = (T) wVar.rememberedValue();
        if (!zChanged && t10 != v.f80515a.getEmpty()) {
            return t10;
        }
        T t11 = (T) aVar.invoke();
        wVar.updateRememberedValue(t11);
        return t11;
    }

    public static final <T> T remember(kv.a aVar, w wVar, int i10) {
        T t10 = (T) wVar.rememberedValue();
        if (t10 != v.f80515a.getEmpty()) {
            return t10;
        }
        T t11 = (T) aVar.invoke();
        wVar.updateRememberedValue(t11);
        return t11;
    }
}
