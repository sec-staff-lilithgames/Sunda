package ek;

import android.util.Log;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final ik.o f54650a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f54651b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f54652c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f54653d;

    /* renamed from: e, reason: collision with root package name */
    public final k4.n f54654e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f54655f;

    /* renamed from: g, reason: collision with root package name */
    public final zu.m f54656g;

    /* renamed from: h, reason: collision with root package name */
    public t0 f54657h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54658i;

    /* renamed from: j, reason: collision with root package name */
    public p1 f54659j;

    /* renamed from: k, reason: collision with root package name */
    public String f54660k;

    public static final boolean access$isColdStart(v1 v1Var, t0 t0Var) {
        v1Var.getClass();
        Map<String, k0> processDataMap = t0Var.getProcessDataMap();
        if (processDataMap == null) {
            Log.d("FirebaseSessions", "No process data map");
            return true;
        }
        boolean zIsColdStart = v1Var.f54655f.isColdStart(processDataMap);
        if (zIsColdStart) {
            Log.d("FirebaseSessions", "Cold app start detected");
        }
        return zIsColdStart;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$notifySubscribers(ek.v1 r4, java.lang.String r5, ek.p1 r6, zu.d r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof ek.u1
            if (r0 == 0) goto L16
            r0 = r7
            ek.u1 r0 = (ek.u1) r0
            int r1 = r0.f54648m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f54648m = r1
            goto L1b
        L16:
            ek.u1 r0 = new ek.u1
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f54646k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f54648m
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            ek.p1 r6 = r0.f54645j
            java.lang.String r5 = r0.f54644i
            tu.a0.throwOnFailure(r7)
            goto L58
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            tu.a0.throwOnFailure(r7)
            r4.f54659j = r6
            java.lang.String r7 = r4.f54660k
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r5)
            if (r7 == 0) goto L47
            goto Lbf
        L47:
            r4.f54660k = r5
            fk.d r4 = fk.d.f55729a
            r0.f54644i = r5
            r0.f54645j = r6
            r0.f54648m = r3
            java.lang.Object r7 = r4.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r4 = r7.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L64:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lbf
            java.lang.Object r7 = r4.next()
            fk.g r7 = (fk.g) r7
            fk.f r0 = new fk.f
            r0.<init>(r5)
            r7.onSessionChanged(r0)
            int r0 = r6.ordinal()
            java.lang.String r1 = "Notified "
            if (r0 == 0) goto La1
            if (r0 != r3) goto L9b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            fk.e r7 = r7.getSessionSubscriberName()
            r0.append(r7)
            java.lang.String r7 = " of new fallback session "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = r0.toString()
            goto Lb9
        L9b:
            tu.t r4 = new tu.t
            r4.<init>()
            throw r4
        La1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            fk.e r7 = r7.getSessionSubscriberName()
            r0.append(r7)
            java.lang.String r7 = " of new session "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = r0.toString()
        Lb9:
            java.lang.String r0 = "FirebaseSessions"
            android.util.Log.d(r0, r7)
            goto L64
        Lbf:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.v1.access$notifySubscribers(ek.v1, java.lang.String, ek.p1, zu.d):java.lang.Object");
    }

    public final boolean a(t0 t0Var) {
        Map<String, k0> processDataMap = t0Var.getProcessDataMap();
        m0 m0Var = this.f54655f;
        if (processDataMap == null) {
            Log.d("FirebaseSessions", "No process data for " + m0Var.getMyProcessName());
            return true;
        }
        boolean zIsMyProcessStale = m0Var.isMyProcessStale(processDataMap);
        if (zIsMyProcessStale) {
            Log.d("FirebaseSessions", "Process " + m0Var.getMyProcessName() + " is stale");
        }
        return zIsMyProcessStale;
    }

    @Override // ek.l1
    public void appBackground() {
        this.f54658i = false;
        if (this.f54657h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f54655f.getMyProcessName());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f54656g), null, null, new r1(this, null), 3, null);
    }

    @Override // ek.l1
    public void appForeground() {
        this.f54658i = true;
        if (this.f54657h == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        t0 localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        Log.d("FirebaseSessions", "App foregrounded on " + this.f54655f.getMyProcessName());
        if (b(localSessionData$com_google_firebase_firebase_sessions) || a(localSessionData$com_google_firebase_firebase_sessions)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f54656g), null, null, new t1(this, localSessionData$com_google_firebase_firebase_sessions, null), 3, null);
        }
    }

    public final boolean b(t0 t0Var) {
        y1 backgroundTime = t0Var.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d("FirebaseSessions", "Session " + t0Var.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        boolean z10 = tv.f.m7183compareToLRDsOJo(((a2) this.f54653d).currentTime().m3836minus5sfh64U(backgroundTime), this.f54650a.m4272getSessionRestartTimeoutUwyO8pc()) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + t0Var.getSessionDetails().getSessionId() + " is expired");
        }
        return z10;
    }

    public final t0 getLocalSessionData$com_google_firebase_firebase_sessions() {
        t0 t0Var = this.f54657h;
        if (t0Var != null) {
            return t0Var;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("localSessionData");
        return null;
    }

    public final p1 getPreviousNotificationType$com_google_firebase_firebase_sessions() {
        return this.f54659j;
    }

    @Override // ek.l1
    public boolean isInForeground() {
        return this.f54658i;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(t0 t0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t0Var, "<set-?>");
        this.f54657h = t0Var;
    }

    public final void setPreviousNotificationType$com_google_firebase_firebase_sessions(p1 p1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(p1Var, "<set-?>");
        this.f54659j = p1Var;
    }

    public v1(ik.o oVar, f1 sessionGenerator, a1 sessionFirelogPublisher, z1 timeProvider, k4.n sessionDataStore, m0 processDataManager, @ai.a zu.m backgroundDispatcher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(oVar, PtLatqAYjEFT.sdKlDRaHLIleT);
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionFirelogPublisher, "sessionFirelogPublisher");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProvider, "timeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDataStore, "sessionDataStore");
        kotlin.jvm.internal.e0.checkNotNullParameter(processDataManager, "processDataManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f54650a = oVar;
        this.f54651b = sessionGenerator;
        this.f54652c = sessionFirelogPublisher;
        this.f54653d = timeProvider;
        this.f54654e = sessionDataStore;
        this.f54655f = processDataManager;
        this.f54656g = backgroundDispatcher;
        this.f54659j = p1.f54609b;
        this.f54660k = "";
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new o1(this, null), 3, null);
    }
}
