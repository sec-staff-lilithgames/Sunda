package m0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface t1 {
    Map<Long, s> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j10);

    void notifySelectableChange(long j10);

    /* renamed from: notifySelectionUpdate-5iVPX68, reason: not valid java name */
    boolean mo5570notifySelectionUpdate5iVPX68(x1.d0 d0Var, long j10, long j11, boolean z10, b0 b0Var);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j10);

    /* renamed from: notifySelectionUpdateStart-d-4ec7I, reason: not valid java name */
    void mo5571notifySelectionUpdateStartd4ec7I(x1.d0 d0Var, long j10, b0 b0Var);

    r subscribe(r rVar);

    void unsubscribe(r rVar);
}
