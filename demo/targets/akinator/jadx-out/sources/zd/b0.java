package zd;

import bf.d0;
import com.google.android.exoplayer2.m3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b0 {
    boolean belongsToSession(b bVar, String str);

    void finishAllSessions(b bVar);

    String getActiveSessionId();

    String getSessionForMediaPeriodId(m3 m3Var, d0 d0Var);

    void setListener(a0 a0Var);

    void updateSessions(b bVar);

    void updateSessionsWithDiscontinuity(b bVar, int i10);

    void updateSessionsWithTimelineChange(b bVar);
}
