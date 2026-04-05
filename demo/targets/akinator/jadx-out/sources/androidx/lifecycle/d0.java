package androidx.lifecycle;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(v5.h hVar, k0 k0Var) throws NoSuchMethodException, SecurityException {
        j0 currentState = k0Var.getCurrentState();
        if (currentState == j0.f6615c || currentState.isAtLeast(j0.f6617f)) {
            hVar.runOnNextRecreation(b0.class);
        } else {
            k0Var.addObserver(new c0(hVar, k0Var));
        }
    }

    public static final void attachHandleIfNeeded(g3 viewModel, v5.h registry, k0 lifecycle) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModel, "viewModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(registry, "registry");
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycle, "lifecycle");
        o2 o2Var = (o2) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (o2Var == null || o2Var.isAttached()) {
            return;
        }
        o2Var.attachToLifecycle(registry, lifecycle);
        a(registry, lifecycle);
    }

    public static final o2 create(v5.h registry, k0 lifecycle, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.e0.checkNotNullParameter(registry, "registry");
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.e0.checkNotNull(str);
        o2 o2Var = new o2(str, m2.f6667c.createHandle(registry.consumeRestoredStateForKey(str), bundle));
        o2Var.attachToLifecycle(registry, lifecycle);
        a(registry, lifecycle);
        return o2Var;
    }
}
