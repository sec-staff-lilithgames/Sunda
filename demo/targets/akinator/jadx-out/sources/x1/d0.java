package x1;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d0 {
    static /* synthetic */ i1.j localBoundingBoxOf$default(d0 d0Var, d0 d0Var2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return d0Var.localBoundingBoxOf(d0Var2, z10);
    }

    int get(a aVar);

    d0 getParentCoordinates();

    d0 getParentLayoutCoordinates();

    Set<a> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo7827getSizeYbymL2g();

    boolean isAttached();

    i1.j localBoundingBoxOf(d0 d0Var, boolean z10);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo7828localPositionOfR5De75A(d0 d0Var, long j10);

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo7829localToRootMKHz9U(long j10);

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo7830localToWindowMKHz9U(long j10);

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo7831windowToLocalMKHz9U(long j10);
}
