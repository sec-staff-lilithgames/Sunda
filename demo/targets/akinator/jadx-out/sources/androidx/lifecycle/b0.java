package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements v5.f {
    @Override // v5.f
    public void onRecreated(v5.j owner) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        if (!(owner instanceof n3)) {
            throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
        }
        m3 viewModelStore = ((n3) owner).getViewModelStore();
        v5.h savedStateRegistry = owner.getSavedStateRegistry();
        Iterator<String> it = viewModelStore.keys().iterator();
        while (it.hasNext()) {
            g3 g3Var = viewModelStore.get(it.next());
            if (g3Var != null) {
                d0.attachHandleIfNeeded(g3Var, savedStateRegistry, owner.getLifecycle());
            }
        }
        if (viewModelStore.keys().isEmpty()) {
            return;
        }
        savedStateRegistry.runOnNextRecreation(b0.class);
    }
}
