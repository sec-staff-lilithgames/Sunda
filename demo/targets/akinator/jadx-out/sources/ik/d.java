package ik;

import ek.z1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d implements c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f59670g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f59671h;

    /* renamed from: i, reason: collision with root package name */
    public static final sv.x f59672i;

    /* renamed from: a, reason: collision with root package name */
    public final z1 f59673a;

    /* renamed from: b, reason: collision with root package name */
    public final tj.f f59674b;

    /* renamed from: c, reason: collision with root package name */
    public final ek.b f59675c;

    /* renamed from: d, reason: collision with root package name */
    public final ik.a f59676d;

    /* renamed from: e, reason: collision with root package name */
    public final r f59677e;

    /* renamed from: f, reason: collision with root package name */
    public final Mutex f59678f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final int getDefaultCacheDuration() {
            return d.f59671h;
        }

        public final sv.x getSanitizeRegex() {
            return d.f59672i;
        }
    }

    static {
        tv.e eVar = tv.f.f87433c;
        f59671h = (int) tv.f.m7198getInWholeSecondsimpl(tv.h.toDuration(24, tv.i.f87444i));
        f59672i = new sv.x("/");
    }

    public d(z1 timeProvider, tj.f firebaseInstallationsApi, ek.b appInfo, ik.a configsFetcher, r settingsCache) {
        e0.checkNotNullParameter(timeProvider, "timeProvider");
        e0.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        e0.checkNotNullParameter(appInfo, "appInfo");
        e0.checkNotNullParameter(configsFetcher, "configsFetcher");
        e0.checkNotNullParameter(settingsCache, "settingsCache");
        this.f59673a = timeProvider;
        this.f59674b = firebaseInstallationsApi;
        this.f59675c = appInfo;
        this.f59676d = configsFetcher;
        this.f59677e = settingsCache;
        this.f59678f = MutexKt.Mutex$default(false, 1, null);
    }

    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(zu.d<? super x0> dVar) {
        Object objUpdateConfigs = this.f59677e.updateConfigs(n.f59708a.getDefaultValue(), dVar);
        return objUpdateConfigs == av.e.getCOROUTINE_SUSPENDED() ? objUpdateConfigs : x0.f87415a;
    }

    @Override // ik.c0
    public Double getSamplingRate() {
        return this.f59677e.sessionSamplingRate();
    }

    @Override // ik.c0
    public Boolean getSessionEnabled() {
        return this.f59677e.sessionsEnabled();
    }

    @Override // ik.c0
    /* renamed from: getSessionRestartTimeout-FghU774 */
    public tv.f mo4271getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.f59677e.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        tv.e eVar = tv.f.f87433c;
        return tv.f.m7182boximpl(tv.h.toDuration(numSessionRestartTimeout.intValue(), tv.i.f87442g));
    }

    @Override // ik.c0
    public boolean isSettingsStale() {
        return this.f59677e.hasCacheExpired();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b5, B:48:0x00be, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:56:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b5, B:48:0x00be, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:56:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // ik.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateSettings(zu.d<? super tu.x0> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.d.updateSettings(zu.d):java.lang.Object");
    }
}
