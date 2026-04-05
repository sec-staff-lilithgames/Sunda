package x2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface e {
    void addError(n nVar);

    void clear();

    n getKey();

    n getPivotCandidate(f fVar, boolean[] zArr);

    void initFromRow(e eVar);

    boolean isEmpty();

    void updateFromFinalVariable(f fVar, n nVar, boolean z10);

    void updateFromRow(f fVar, c cVar, boolean z10);

    void updateFromSystem(f fVar);
}
