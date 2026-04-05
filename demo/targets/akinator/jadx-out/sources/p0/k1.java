package p0;

import java.util.Arrays;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f80295a = new h1();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80296b = new a();

        @Override // kv.a
        public final zu.n invoke() {
            return zu.n.f98854b;
        }
    }

    @tu.f
    public static final void DisposableEffect(kv.l lVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-904483903, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:120)");
        }
        throw new IllegalStateException("DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.");
    }

    @tu.f
    public static final void LaunchedEffect(kv.p pVar, w wVar, int i10) {
        w wVarStartRestartGroup = wVar.startRestartGroup(-805415771);
        int i11 = i10 & 1;
        if (wVarStartRestartGroup.shouldExecute(i11 != 0, i11)) {
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-805415771, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:325)");
            }
            throw new IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
        }
        wVarStartRestartGroup.skipToGroupEnd();
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d0(pVar, i10, 1));
        }
    }

    public static final void SideEffect(kv.a aVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        wVar.recordSideEffect(aVar);
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final CoroutineScope createCompositionCoroutineScope(zu.m mVar, w wVar) {
        if (mVar.get(Job.Key) == null) {
            return new l4(wVar.getApplyCoroutineContext(), mVar);
        }
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        completableJobJob$default.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return CoroutineScopeKt.CoroutineScope(completableJobJob$default);
    }

    public static final CoroutineScope rememberCoroutineScope(kv.a aVar, w wVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            aVar = a.f80296b;
        }
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = createCompositionCoroutineScope((zu.m) aVar.invoke(), wVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        return (CoroutineScope) objRememberedValue;
    }

    public static final void DisposableEffect(Object obj, kv.l lVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zChanged = wVar.changed(obj);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new f1(lVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        zu.m applyCoroutineContext = wVar.getApplyCoroutineContext();
        boolean zChanged = wVar.changed(obj);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new y1(applyCoroutineContext, pVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, kv.l lVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean zChanged = wVar.changed(obj) | wVar.changed(obj2);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new f1(lVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        zu.m applyCoroutineContext = wVar.getApplyCoroutineContext();
        boolean zChanged = wVar.changed(obj) | wVar.changed(obj2);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new y1(applyCoroutineContext, pVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, kv.l lVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:228)");
        }
        boolean zChanged = wVar.changed(obj) | wVar.changed(obj2) | wVar.changed(obj3);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new f1(lVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        zu.m applyCoroutineContext = wVar.getApplyCoroutineContext();
        boolean zChanged = wVar.changed(obj) | wVar.changed(obj2) | wVar.changed(obj3);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            objRememberedValue = new y1(applyCoroutineContext, pVar);
            wVar.updateRememberedValue(objRememberedValue);
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object[] objArr, kv.l lVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= wVar.changed(obj);
        }
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            wVar.updateRememberedValue(new f1(lVar));
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object[] objArr, kv.p pVar, w wVar, int i10) {
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:407)");
        }
        zu.m applyCoroutineContext = wVar.getApplyCoroutineContext();
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= wVar.changed(obj);
        }
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            wVar.updateRememberedValue(new y1(applyCoroutineContext, pVar));
        }
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
    }
}
