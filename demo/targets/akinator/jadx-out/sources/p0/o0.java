package p0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o0 {
    public static final void CompositionLocalProvider(h3[] h3VarArr, kv.p pVar, w wVar, int i10) {
        w wVarStartRestartGroup = wVar.startRestartGroup(415205898);
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(415205898, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        wVarStartRestartGroup.startProviders(h3VarArr);
        pVar.invoke(wVarStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
        wVarStartRestartGroup.endProviders();
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a(h3VarArr, pVar, i10, 2));
        }
    }

    public static final <T> g3 compositionLocalOf(y4 y4Var, kv.a aVar) {
        return new i1(y4Var, aVar);
    }

    public static /* synthetic */ g3 compositionLocalOf$default(y4 y4Var, kv.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y4Var = z4.structuralEqualityPolicy();
        }
        return compositionLocalOf(y4Var, aVar);
    }

    public static final <T> g3 compositionLocalWithComputedDefaultOf(kv.l lVar) {
        return new w0(lVar);
    }

    public static final <T> g3 staticCompositionLocalOf(kv.a aVar) {
        return new w5(aVar);
    }

    public static final void CompositionLocalProvider(h3 h3Var, kv.p pVar, w wVar, int i10) {
        w wVarStartRestartGroup = wVar.startRestartGroup(-149765515);
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(-149765515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)");
        }
        wVarStartRestartGroup.startProvider(h3Var);
        pVar.invoke(wVarStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
        wVarStartRestartGroup.endProvider();
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a(h3Var, pVar, i10, 1));
        }
    }

    public static final void CompositionLocalProvider(n0 n0Var, kv.p pVar, w wVar, int i10) {
        w wVarStartRestartGroup = wVar.startRestartGroup(-1162003659);
        int i11 = (i10 & 6) == 0 ? (wVarStartRestartGroup.changed(n0Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= wVarStartRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (wVarStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1162003659, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:408)");
            }
            z2 compositionLocals$runtime = n0Var.getCompositionLocals$runtime();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime.size());
            for (Map.Entry entry : compositionLocals$runtime.entrySet()) {
                arrayList.add(((b6) entry.getValue()).toProvided((l0) entry.getKey()));
            }
            h3[] h3VarArr = (h3[]) arrayList.toArray(new h3[0]);
            CompositionLocalProvider((h3[]) Arrays.copyOf(h3VarArr, h3VarArr.length), pVar, wVarStartRestartGroup, i11 & 112);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        } else {
            wVarStartRestartGroup.skipToGroupEnd();
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a(n0Var, pVar, i10, 3));
        }
    }
}
