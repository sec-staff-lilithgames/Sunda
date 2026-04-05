package com.ironsource;

import android.app.Activity;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.ironsource.C3300k6;
import com.ironsource.C3350n0;
import com.ironsource.D0;
import com.ironsource.InterfaceC3259i0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import h2.rl.UeklptUrP;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3162cb implements InterfaceC3282j6 {

    /* renamed from: n, reason: collision with root package name */
    public static final a f36160n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final String f36161o = "Fullscreen Ad Internal";

    /* renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f36162a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36163b;

    /* renamed from: c, reason: collision with root package name */
    private final b f36164c;

    /* renamed from: d, reason: collision with root package name */
    private final C3350n0 f36165d;

    /* renamed from: e, reason: collision with root package name */
    private final C3265i6 f36166e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3503w0 f36167f;

    /* renamed from: g, reason: collision with root package name */
    private final L7 f36168g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3456t4 f36169h;

    /* renamed from: i, reason: collision with root package name */
    private final tu.o f36170i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3180db f36171j;

    /* renamed from: k, reason: collision with root package name */
    private final UUID f36172k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC3441s6 f36173l;

    /* renamed from: m, reason: collision with root package name */
    private C3317l5 f36174m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.cb$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final boolean a(String placementName, LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
            kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
            C3350n0 c3350n0A = C3350n0.a.a(com.unity3d.mediation.a.a(adFormat), D0.b.MEDIATION);
            if (!c3350n0A.g()) {
                c3350n0A.e().a().a(placementName, "SDK is not initialized", false);
                return false;
            }
            O3 o3A = Mb.f34856s.d().p().a(placementName, adFormat);
            boolean zD = o3A.d();
            c3350n0A.e().a().a(placementName, o3A.e(), zD);
            return zD;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.cb$b */
    public interface b {
        Double getBidFloor();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.cb$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final C3350n0 f36175a;

        /* renamed from: b, reason: collision with root package name */
        private final C3265i6 f36176b;

        /* renamed from: c, reason: collision with root package name */
        private final L7 f36177c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3456t4 f36178d;

        /* renamed from: e, reason: collision with root package name */
        private final C3561z7 f36179e;

        /* renamed from: f, reason: collision with root package name */
        private final b f36180f;

        public c(C3350n0 adTools, C3265i6 adControllerFactory, L7 provider, InterfaceC3456t4 currentTimeProvider, C3561z7 idFactory, b config) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.e0.checkNotNullParameter(adControllerFactory, "adControllerFactory");
            kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
            kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            kotlin.jvm.internal.e0.checkNotNullParameter(idFactory, "idFactory");
            kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
            this.f36175a = adTools;
            this.f36176b = adControllerFactory;
            this.f36177c = provider;
            this.f36178d = currentTimeProvider;
            this.f36179e = idFactory;
            this.f36180f = config;
        }

        public final C3265i6 a() {
            return this.f36176b;
        }

        public final C3350n0 b() {
            return this.f36175a;
        }

        public final b c() {
            return this.f36180f;
        }

        public final InterfaceC3456t4 d() {
            return this.f36178d;
        }

        public final C3561z7 e() {
            return this.f36179e;
        }

        public final L7 f() {
            return this.f36177c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.cb$d */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.a {
        public d() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3247h6 invoke() {
            return C3162cb.this.b();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.cb$e */
    public static final class e implements InterfaceC3475u6 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3205f0 f36183b;

        public e(C3205f0 c3205f0) {
            this.f36183b = c3205f0;
        }

        @Override // com.ironsource.InterfaceC3475u6
        public C3458t6 a(boolean z10, InterfaceC3509w6 listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            AbstractC3486v0 abstractC3486v0A = C3162cb.this.g().a(z10, this.f36183b);
            return new C3458t6(Mb.f34856s.c(), new V0(C3162cb.this.f(), abstractC3486v0A, D0.b.MEDIATION), abstractC3486v0A, listener, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3162cb(LevelPlay.AdFormat adFormat, String adUnitId, b config, C3350n0 adTools, C3265i6 fullscreenAdControllerFactory, InterfaceC3503w0 adUnitDataFactory, L7 mediationServicesProvider, InterfaceC3456t4 currentTimeProvider, C3561z7 idFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, OcvDtWCQ.nqkXRUCGCJ);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAdControllerFactory, "fullscreenAdControllerFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitDataFactory, "adUnitDataFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(mediationServicesProvider, "mediationServicesProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(idFactory, "idFactory");
        this.f36162a = adFormat;
        this.f36163b = adUnitId;
        this.f36164c = config;
        this.f36165d = adTools;
        this.f36166e = fullscreenAdControllerFactory;
        this.f36167f = adUnitDataFactory;
        this.f36168g = mediationServicesProvider;
        this.f36169h = currentTimeProvider;
        this.f36170i = tu.q.lazy(new d());
        UUID uuidA = idFactory.a();
        this.f36172k = uuidA;
        this.f36173l = new C3300k6(this, null, 2, 0 == true ? 1 : 0);
        adTools.e().a(new C3349n(com.unity3d.mediation.a.a(adFormat), uuidA, adUnitId));
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3162cb this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f36165d.e().f().a();
        this$0.f36173l.loadAd();
    }

    public final C3247h6 c() {
        return (C3247h6) this.f36170i.getValue();
    }

    public final LevelPlay.AdFormat d() {
        return this.f36162a;
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void onAdClicked() {
        this.f36165d.d(new uh(this, 1));
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void onAdClosed() {
        this.f36165d.d(new uh(this, 0));
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f36165d.d(new wh(this, adInfo, 3));
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f36165d.d(new wh(this, adInfo, 2));
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f36165d.d(new vh(this, error, 3));
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f36165d.d(new wh(this, adInfo, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3162cb this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        this$0.f36173l.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3162cb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f36173l.onAdLoaded(adInfo);
    }

    private final void p() {
        Double bidFloor = this.f36164c.getBidFloor();
        if (bidFloor != null) {
            this.f36165d.e().f().a(bidFloor.doubleValue());
        }
    }

    public final void a(InterfaceC3180db interfaceC3180db) {
        this.f36171j = interfaceC3180db;
    }

    public final UUID e() {
        return this.f36172k;
    }

    public final C3350n0 f() {
        return this.f36165d;
    }

    public final InterfaceC3503w0 g() {
        return this.f36167f;
    }

    public final String h() {
        return this.f36163b;
    }

    public final b i() {
        return this.f36164c;
    }

    public final InterfaceC3456t4 j() {
        return this.f36169h;
    }

    public final InterfaceC3180db k() {
        return this.f36171j;
    }

    public final L7 l() {
        return this.f36168g;
    }

    public final boolean m() {
        InterfaceC3259i0 interfaceC3259i0C = this.f36173l.c();
        this.f36165d.e().e().a(Boolean.valueOf(interfaceC3259i0C.a()), interfaceC3259i0C instanceof InterfaceC3259i0.a ? ((InterfaceC3259i0.a) interfaceC3259i0C).c() : null);
        return interfaceC3259i0C.a();
    }

    public final void n() {
        this.f36174m = new C3317l5();
        this.f36165d.d(new uh(this, 2));
    }

    public final void o() {
        a(new C3391p6(this, this.f36169h));
        c().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3162cb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f36173l.onAdDisplayed(adInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3162cb this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f36173l.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3162cb this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f36173l.onAdClosed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3162cb this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f36173l.a();
    }

    public final void a(InterfaceC3441s6 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        this.f36173l = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3162cb this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        this$0.f36173l.a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3162cb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        this$0.f36173l.onAdInfoChanged(adInfo);
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f36165d.d(new lh(activity, 4, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Activity activity, C3162cb this$0, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "$activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        ContextProvider.getInstance().updateActivity(activity);
        this$0.f36165d.e().h().d();
        this$0.f36173l.a(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3247h6 b() {
        C3325ld c3325ld = null;
        C3205f0 c3205f0 = new C3205f0(com.unity3d.mediation.a.a(this.f36162a), this.f36172k, this.f36163b, c3325ld, this.f36168g.A().a(), this.f36164c.getBidFloor(), 8, null);
        e eVar = new e(c3205f0);
        E5 e5E = this.f36165d.e();
        C3350n0 c3350n0 = this.f36165d;
        e5E.a(new B0(c3350n0, c3205f0, c3350n0.b(this.f36162a, this.f36163b).b().b()));
        return this.f36166e.a(this, this.f36165d, c3205f0, eVar);
    }

    public final void a(C3300k6.a status) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        this.f36173l = new C3300k6(this, status);
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void a(LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f36165d.d(new vh(this, error, 0));
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void a() {
        this.f36165d.d(new uh(this, 3));
    }

    @Override // com.ironsource.InterfaceC3282j6
    public void a(LevelPlayReward reward) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f36165d, "onAdRewarded adInfo: " + this.f36173l.b() + " reward: " + reward, (String) null, 2, (Object) null));
        this.f36165d.e(new gi(13, this, reward));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3162cb this$0, LevelPlayReward reward) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(reward, "$reward");
        InterfaceC3180db interfaceC3180db = this$0.f36171j;
        if (interfaceC3180db != null) {
            interfaceC3180db.onAdRewarded(reward, this$0.f36173l.b());
        }
    }

    public final void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f36165d, "onAdLoaded adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f36165d.d(new com.google.android.exoplayer2.audio.y(this, C3317l5.a(this.f36174m), 1));
        this.f36165d.e(new wh(this, adInfo, 0));
    }

    public /* synthetic */ C3162cb(LevelPlay.AdFormat adFormat, String str, b bVar, C3350n0 c3350n0, C3265i6 c3265i6, InterfaceC3503w0 interfaceC3503w0, L7 l72, InterfaceC3456t4 interfaceC3456t4, C3561z7 c3561z7, int i10, kotlin.jvm.internal.u uVar) {
        this(adFormat, str, bVar, c3350n0, c3265i6, interfaceC3503w0, (i10 & 64) != 0 ? Mb.f34856s.d() : l72, interfaceC3456t4, c3561z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3162cb c3162cb, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c3162cb, UeklptUrP.vulsBDkEnacphaH);
        c3162cb.f36165d.e().f().a(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3162cb this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC3180db interfaceC3180db = this$0.f36171j;
        if (interfaceC3180db != null) {
            interfaceC3180db.onAdLoaded(adInfo);
        }
    }

    public static /* synthetic */ void a(C3162cb c3162cb, LevelPlayAdError levelPlayAdError, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3162cb.a(levelPlayAdError, j10);
    }

    public final void a(LevelPlayAdError levelPlayAdError, long j10) {
        IronLog.INTERNAL.verbose(C3350n0.a(this.f36165d, "onAdLoadFailed error: " + levelPlayAdError, (String) null, 2, (Object) null));
        this.f36165d.d(new com.applovin.impl.f9(this, j10, levelPlayAdError, 1));
        this.f36165d.e(new vh(this, levelPlayAdError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3162cb this$0, long j10, LevelPlayAdError levelPlayAdError) {
        String errorMessage;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Vc vcF = this$0.f36165d.e().f();
        int errorCode = levelPlayAdError != null ? levelPlayAdError.getErrorCode() : 0;
        if (levelPlayAdError == null || (errorMessage = levelPlayAdError.getErrorMessage()) == null) {
            errorMessage = "";
        }
        vcF.a(j10, errorCode, errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError levelPlayAdError, C3162cb this$0) {
        InterfaceC3180db interfaceC3180db;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (levelPlayAdError == null || (interfaceC3180db = this$0.f36171j) == null) {
            return;
        }
        interfaceC3180db.onAdLoadFailed(levelPlayAdError);
    }

    public final void a(LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        IronLog.INTERNAL.verbose(C3350n0.a(this.f36165d, "onAdDisplayFailed error: " + error + ", adInfo: " + adInfo, (String) null, 2, (Object) null));
        this.f36165d.d(new vh(this, error, 2));
        this.f36165d.e(new lh(this, 3, error, adInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3162cb this$0, LevelPlayAdError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        this$0.f36165d.e().h().a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3162cb this$0, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC3180db interfaceC3180db = this$0.f36171j;
        if (interfaceC3180db != null) {
            interfaceC3180db.onAdDisplayFailed(error, adInfo);
        }
    }

    public final void a(String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        this.f36165d.e().h().f("Fullscreen Ad Internal - " + message);
    }
}
