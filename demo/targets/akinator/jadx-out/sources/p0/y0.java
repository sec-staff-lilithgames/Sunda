package p0;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface y0 extends e0 {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(kv.p pVar);

    <R> R delegateInvalidations(y0 y0Var, int i10, kv.a aVar);

    @Override // p0.e0
    /* synthetic */ void dispose();

    void disposeUnusedMovableContent(h2 h2Var);

    p4 getAndSetShouldPauseCallback(p4 p4Var);

    @Override // p0.e0
    /* synthetic */ boolean getHasInvalidations();

    boolean getHasPendingChanges();

    void insertMovableContent(List<tu.v> list);

    void invalidateAll();

    boolean isComposing();

    @Override // p0.e0
    /* synthetic */ boolean isDisposed();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(kv.a aVar);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    @Override // p0.e0
    /* synthetic */ void setContent(kv.p pVar);

    void verifyConsistent();
}
