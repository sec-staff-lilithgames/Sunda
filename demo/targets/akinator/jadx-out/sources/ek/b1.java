package ek;

import android.util.Log;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b1 implements a1 {

    /* renamed from: f, reason: collision with root package name */
    public static final double f54464f;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f54465a;

    /* renamed from: b, reason: collision with root package name */
    public final tj.f f54466b;

    /* renamed from: c, reason: collision with root package name */
    public final ik.o f54467c;

    /* renamed from: d, reason: collision with root package name */
    public final p f54468d;

    /* renamed from: e, reason: collision with root package name */
    public final zu.m f54469e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f54464f = Math.random();
    }

    public b1(com.google.firebase.g firebaseApp, tj.f firebaseInstallations, ik.o sessionSettings, p eventGDTLogger, @ai.a zu.m backgroundDispatcher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.e0.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f54465a = firebaseApp;
        this.f54466b = firebaseInstallations;
        this.f54467c = sessionSettings;
        this.f54468d = eventGDTLogger;
        this.f54469e = backgroundDispatcher;
    }

    public static final void access$attemptLoggingSessionEvent(b1 b1Var, y0 y0Var) {
        b1Var.getClass();
        try {
            b1Var.f54468d.log(y0Var);
            Log.d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r8.updateSettings(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$shouldLogSession(ek.b1 r7, zu.d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ek.d1
            if (r0 == 0) goto L16
            r0 = r8
            ek.d1 r0 = (ek.d1) r0
            int r1 = r0.f54498l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f54498l = r1
            goto L1b
        L16:
            ek.d1 r0 = new ek.d1
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f54496j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f54498l
            r3 = 2
            r4 = 0
            java.lang.String r5 = "FirebaseSessions"
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 != r3) goto L34
            ek.b1 r7 = r0.f54495i
            tu.a0.throwOnFailure(r8)
            goto L8b
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            ek.b1 r7 = r0.f54495i
            tu.a0.throwOnFailure(r8)
            goto L52
        L42:
            tu.a0.throwOnFailure(r8)
            fk.d r8 = fk.d.f55729a
            r0.f54495i = r7
            r0.f54498l = r6
            java.lang.Object r8 = r8.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r0)
            if (r8 != r1) goto L52
            goto L8a
        L52:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L68
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L68
            goto Lb8
        L68:
            java.util.Iterator r8 = r8.iterator()
        L6c:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r8.next()
            fk.g r2 = (fk.g) r2
            boolean r2 = r2.isDataCollectionEnabled()
            if (r2 == 0) goto L6c
            ik.o r8 = r7.f54467c
            r0.f54495i = r7
            r0.f54498l = r3
            java.lang.Object r8 = r8.updateSettings(r0)
            if (r8 != r1) goto L8b
        L8a:
            return r1
        L8b:
            ik.o r8 = r7.f54467c
            boolean r8 = r8.getSessionsEnabled()
            if (r8 != 0) goto L9d
            java.lang.String r7 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = bv.b.boxBoolean(r4)
            return r7
        L9d:
            ik.o r7 = r7.f54467c
            double r7 = r7.getSamplingRate()
            double r0 = ek.b1.f54464f
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 > 0) goto Lae
            java.lang.Boolean r7 = bv.b.boxBoolean(r6)
            return r7
        Lae:
            java.lang.String r7 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = bv.b.boxBoolean(r4)
            return r7
        Lb8:
            java.lang.String r7 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r7)
            java.lang.Boolean r7 = bv.b.boxBoolean(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ek.b1.access$shouldLogSession(ek.b1, zu.d):java.lang.Object");
    }

    @Override // ek.a1
    public void mayLogSession(x0 sessionDetails) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDetails, "sessionDetails");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f54469e), null, null, new c1(this, sessionDetails, null), 3, null);
    }
}
