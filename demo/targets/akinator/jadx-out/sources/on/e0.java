package on;

import ao.k0;
import gn.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface e0 {
    boolean belongsToSession(b bVar, String str);

    void finishAllSessions(b bVar);

    String getActiveSessionId();

    String getSessionForMediaPeriodId(u1 u1Var, k0 k0Var);

    void setListener(d0 d0Var);

    void updateSessions(b bVar);

    void updateSessionsWithDiscontinuity(b bVar, int i10);

    void updateSessionsWithTimelineChange(b bVar);
}
