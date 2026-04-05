package io.bidmachine;

import android.content.Context;
import bp.oM.DwaEpyvxz;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class SessionManager {
    public static final String SESSION_ID_EMPTY = "";
    private static final String TAG = "SessionManager";
    private static volatile SessionManager instance;
    private volatile Context applicationContext;
    private long pauseTime;
    private long resumeTime;
    private long sessionResetAfterSec;
    private long sessionStartTime;
    private String sessionId = "";
    private final CopyOnWriteArraySet<v3> observers = new CopyOnWriteArraySet<>();

    private SessionManager() {
        startNewSession();
    }

    public static SessionManager get() {
        SessionManager sessionManager;
        SessionManager sessionManager2 = instance;
        if (sessionManager2 != null) {
            return sessionManager2;
        }
        synchronized (SessionManager.class) {
            try {
                sessionManager = instance;
                if (sessionManager == null) {
                    sessionManager = new SessionManager();
                    instance = sessionManager;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sessionManager;
    }

    private long getLastSessionDurationMs() {
        Context context = this.applicationContext;
        if (context != null) {
            return pr.m.optLong(jh.i.E(context), "last_session_duration", 0L);
        }
        nm.a.w(TAG, "Context not attached");
        return 0L;
    }

    private long getSessionDurationMs() {
        if (this.resumeTime == 0) {
            return 0L;
        }
        return nm.h.currentTimeMillis() - this.sessionStartTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onNewSessionStarted$0(Context context) {
        pr.m.putInt(jh.i.E(context), "session_count", Integer.valueOf(pr.m.optInt(jh.i.E(context), "session_count", 0) + 1));
        pr.m.putLong(jh.i.E(context), "last_session_duration", Long.valueOf(pr.m.optLong(jh.i.E(context), "current_session_duration", 0L)));
    }

    private void notifyObservers(w3 w3Var) {
        Iterator<v3> it = this.observers.iterator();
        while (it.hasNext()) {
            ((x2) it.next()).onSessionEvent(w3Var);
        }
    }

    private void onContextAttached() {
        onNewSessionStarted();
    }

    private void onNewSessionStarted() {
        nm.j.ifNotNull(this.applicationContext, new hv.t(19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCurrentSessionDuration(Context context) {
        nm.j.onBackgroundThread(new im.k(6, this, context));
    }

    public void addObserver(v3 v3Var) {
        this.observers.add(v3Var);
    }

    public synchronized void attachContext(Context context) {
        boolean z10 = this.applicationContext == null;
        this.applicationContext = context.getApplicationContext();
        if (z10) {
            onContextAttached();
        }
    }

    public int getLastSessionDurationSec() {
        return (int) (getLastSessionDurationMs() / 1000);
    }

    public int getSessionCount() {
        Context context = this.applicationContext;
        if (context != null) {
            return pr.m.optInt(jh.i.E(context), "session_count", 0);
        }
        nm.a.w(TAG, "Context not attached");
        return 0;
    }

    public int getSessionDurationSec() {
        return (int) (getSessionDurationMs() / 1000);
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void pause() {
        if (this.resumeTime == 0) {
            return;
        }
        this.pauseTime = nm.h.currentTimeMillis();
        notifyObservers(w3.f62040e);
        nm.j.ifNotNull(this.applicationContext, new u0(this, 6));
        nm.a.d(TAG, "Session paused: " + getSessionDurationSec() + " sec.");
    }

    public void removeObserver(v3 v3Var) {
        this.observers.remove(v3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resume() {
        /*
            r8 = this;
            long r0 = nm.h.currentTimeMillis()
            long r2 = r8.sessionResetAfterSec
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1f
            long r6 = r8.pauseTime
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1f
            long r4 = r0 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L1f
            r8.startNewSession()
            goto L2b
        L1f:
            io.bidmachine.w3 r2 = io.bidmachine.w3.f62039c
            r8.notifyObservers(r2)
            java.lang.String r2 = "SessionManager"
            java.lang.String r3 = "Session resumed"
            nm.a.d(r2, r3)
        L2b:
            r8.resumeTime = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.SessionManager.resume():void");
    }

    public void setSessionResetAfter(long j10) {
        this.sessionResetAfterSec = j10;
    }

    public void startNewSession() {
        this.sessionId = UUID.randomUUID().toString();
        this.sessionStartTime = nm.h.currentTimeMillis();
        this.pauseTime = 0L;
        this.resumeTime = 0L;
        onNewSessionStarted();
        notifyObservers(w3.f62038b);
        nm.a.d(TAG, "New session started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$saveCurrentSessionDuration$1(Context context) {
        pr.m.putLong(jh.i.E(context), DwaEpyvxz.oGiM, Long.valueOf(getSessionDurationMs()));
    }
}
