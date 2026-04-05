package ik;

import ek.a2;
import ek.z1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class z implements r {

    /* renamed from: a, reason: collision with root package name */
    public final zu.m f59730a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f59731b;

    /* renamed from: c, reason: collision with root package name */
    public final k4.n f59732c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f59733d;

    public z(@ai.a zu.m backgroundDispatcher, z1 timeProvider, k4.n sessionConfigsDataStore) {
        e0.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        e0.checkNotNullParameter(timeProvider, "timeProvider");
        e0.checkNotNullParameter(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f59730a = backgroundDispatcher;
        this.f59731b = timeProvider;
        this.f59732c = sessionConfigsDataStore;
        this.f59733d = new AtomicReference();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new t(this, null), 3, null);
    }

    public final m a() throws InterruptedException {
        AtomicReference atomicReference = this.f59733d;
        if (atomicReference.get() == null) {
            Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new w(this, null), 1, null);
            while (!atomicReference.compareAndSet(null, objRunBlocking$default) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        e0.checkNotNullExpressionValue(obj, "get(...)");
        return (m) obj;
    }

    @Override // ik.r
    public boolean hasCacheExpired() {
        Long cacheUpdatedTimeSeconds = a().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = a().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || ((a2) this.f59731b).currentTime().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeConfigs$com_google_firebase_firebase_sessions(zu.d<java.lang.Object> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ik.u
            if (r0 == 0) goto L13
            r0 = r7
            ik.u r0 = (ik.u) r0
            int r1 = r0.f59723k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59723k = r1
            goto L18
        L13:
            ik.u r0 = new ik.u
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f59721i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59723k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            tu.a0.throwOnFailure(r7)     // Catch: java.io.IOException -> L29
            return r7
        L29:
            r7 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            tu.a0.throwOnFailure(r7)
            k4.n r7 = r6.f59732c     // Catch: java.io.IOException -> L29
            ik.v r2 = new ik.v     // Catch: java.io.IOException -> L29
            r4 = 0
            r5 = 2
            r2.<init>(r5, r4)     // Catch: java.io.IOException -> L29
            r0.f59723k = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r7 = r7.updateData(r2, r0)     // Catch: java.io.IOException -> L29
            if (r7 != r1) goto L48
            return r1
        L48:
            return r7
        L49:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to remove config values: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "FirebaseSessions"
            int r7 = android.util.Log.w(r0, r7)
            java.lang.Integer r7 = bv.b.boxInt(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.z.removeConfigs$com_google_firebase_firebase_sessions(zu.d):java.lang.Object");
    }

    @Override // ik.r
    public Integer sessionRestartTimeout() {
        return a().getSessionTimeoutSeconds();
    }

    @Override // ik.r
    public Double sessionSamplingRate() {
        return a().getSessionSamplingRate();
    }

    @Override // ik.r
    public Boolean sessionsEnabled() {
        return a().getSessionsEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ik.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateConfigs(ik.m r6, zu.d<? super tu.x0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ik.x
            if (r0 == 0) goto L13
            r0 = r7
            ik.x r0 = (ik.x) r0
            int r1 = r0.f59728k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59728k = r1
            goto L18
        L13:
            ik.x r0 = new ik.x
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f59726i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59728k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            tu.a0.throwOnFailure(r7)     // Catch: java.io.IOException -> L29
            goto L5a
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            tu.a0.throwOnFailure(r7)
            k4.n r7 = r5.f59732c     // Catch: java.io.IOException -> L29
            ik.y r2 = new ik.y     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L29
            r0.f59728k = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r7.updateData(r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5a
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L5a:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.z.updateConfigs(ik.m, zu.d):java.lang.Object");
    }
}
