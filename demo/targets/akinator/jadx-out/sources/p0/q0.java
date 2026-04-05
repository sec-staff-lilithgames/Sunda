package p0;

import z0.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q0 {
    public static final <T> boolean contains(z2 z2Var, l0 l0Var) {
        kotlin.jvm.internal.e0.checkNotNull(l0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return z2Var.containsKey(l0Var);
    }

    public static final z2 mutate(z2 z2Var, kv.l lVar) {
        y2 y2VarBuilder = z2Var.builder();
        lVar.invoke(y2VarBuilder);
        return y2VarBuilder.build();
    }

    public static final <T> T read(z2 z2Var, l0 l0Var) {
        kotlin.jvm.internal.e0.checkNotNull(l0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object defaultValueHolder$runtime = z2Var.get((Object) l0Var);
        if (defaultValueHolder$runtime == null) {
            defaultValueHolder$runtime = l0Var.getDefaultValueHolder$runtime();
        }
        return (T) ((b6) defaultValueHolder$runtime).readValue(z2Var);
    }

    public static final z2 updateCompositionMap(h3[] h3VarArr, z2 z2Var, z2 z2Var2) {
        y.a aVarBuilder = z0.z.persistentCompositionLocalHashMapOf().builder();
        for (h3 h3Var : h3VarArr) {
            l0 compositionLocal = h3Var.getCompositionLocal();
            kotlin.jvm.internal.e0.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            g3 g3Var = (g3) compositionLocal;
            if (h3Var.getCanOverride() || !contains(z2Var, g3Var)) {
                b6 b6Var = (b6) z2Var2.get((Object) g3Var);
                kotlin.jvm.internal.e0.checkNotNull(h3Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarBuilder.put(g3Var, g3Var.updatedStateOf$runtime(h3Var, b6Var));
            }
        }
        return aVarBuilder.build();
    }

    public static /* synthetic */ z2 updateCompositionMap$default(h3[] h3VarArr, z2 z2Var, z2 z2Var2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z2Var2 = z0.z.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(h3VarArr, z2Var, z2Var2);
    }
}
