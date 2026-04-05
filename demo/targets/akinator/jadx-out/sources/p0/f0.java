package p0;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f0 {
    public abstract void composeInitial$runtime(y0 y0Var, kv.p pVar);

    public abstract z.o1 composeInitialPaused$runtime(y0 y0Var, p4 p4Var, kv.p pVar);

    public abstract void deletedMovableContent$runtime(i2 i2Var);

    public abstract boolean getCollectingCallByInformation$runtime();

    public abstract boolean getCollectingParameterInformation$runtime();

    public abstract boolean getCollectingSourceInformation$runtime();

    public abstract long getCompositeKeyHashCode$runtime();

    public abstract e0 getComposition$runtime();

    public z2 getCompositionLocalScope$runtime() {
        return g0.f80219a;
    }

    public abstract zu.m getEffectCoroutineContext();

    public r0 getObserverHolder$runtime() {
        return null;
    }

    public abstract zu.m getRecomposeCoroutineContext$runtime();

    public abstract void insertMovableContent$runtime(i2 i2Var);

    public abstract void invalidate$runtime(y0 y0Var);

    public abstract void invalidateScope$runtime(k3 k3Var);

    public abstract void movableContentStateReleased$runtime(i2 i2Var, h2 h2Var, d dVar);

    public h2 movableContentStateResolve$runtime(i2 i2Var) {
        return null;
    }

    public abstract z.o1 recomposePaused$runtime(y0 y0Var, p4 p4Var, z.o1 o1Var);

    public abstract void registerComposition$runtime(y0 y0Var);

    public abstract void reportPausedScope$runtime(k3 k3Var);

    public abstract void reportRemovedComposition$runtime(y0 y0Var);

    public abstract void unregisterComposition$runtime(y0 y0Var);

    public void doneComposing$runtime() {
    }

    public void startComposing$runtime() {
    }

    public void recordInspectionTable$runtime(Set<d1.e> set) {
    }

    public void registerComposer$runtime(w wVar) {
    }

    public void unregisterComposer$runtime(w wVar) {
    }
}
