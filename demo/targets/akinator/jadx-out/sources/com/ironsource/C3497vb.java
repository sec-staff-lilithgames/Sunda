package com.ironsource;

import android.content.Context;
import com.ironsource.D0;
import com.ironsource.D9;
import com.ironsource.L8;
import com.ironsource.Mb;
import com.ironsource.N7;
import com.ironsource.Td;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3497vb {

    /* renamed from: a, reason: collision with root package name */
    public static final C3497vb f39119a = new C3497vb();

    /* renamed from: b, reason: collision with root package name */
    private static final C3514wb f39120b = new C3514wb();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.vb$a */
    public static final class a implements InterfaceC3432re {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f39121a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f39122b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3317l5 f39123c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f39124d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C3317l5 c3317l5, LevelPlayInitListener levelPlayInitListener) {
            this.f39121a = levelPlayInitRequest;
            this.f39122b = context;
            this.f39123c = c3317l5;
            this.f39124d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3326le sdkConfig) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "sdkConfig");
            C3497vb.f39120b.a(new com.applovin.impl.y8(this.f39121a, sdkConfig, this.f39122b, this.f39123c, this.f39124d, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest initRequest, C3326le sdkConfig, Context context, C3317l5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "$initRequest");
            kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
            kotlin.jvm.internal.e0.checkNotNullParameter(initDuration, "$initDuration");
            C3497vb.f39119a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3364ne error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            C3497vb.f39120b.a(new lh(this.f39124d, 9, this.f39123c, error));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C3317l5 initDuration, C3364ne error) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullParameter(initDuration, "$initDuration");
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
            C3497vb.f39119a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.vb$b */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3126ab f39125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3317l5 f39126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f39127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f39128d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3126ab c3126ab, C3317l5 c3317l5, long j10, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f39125a = c3126ab;
            this.f39126b = c3317l5;
            this.f39127c = j10;
            this.f39128d = levelPlayInitListener;
        }

        public final void a() throws JSONException {
            C3497vb.f39119a.a(this.f39125a, this.f39126b, this.f39127c, this.f39128d);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() throws JSONException {
            a();
            return tu.x0.f87415a;
        }
    }

    private C3497vb() {
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog ironLog = IronLog.API;
        String appKey = levelPlayInitRequest.getAppKey();
        String userId = levelPlayInitRequest.getUserId();
        List<LevelPlay.AdFormat> legacyAdFormats = levelPlayInitRequest.getLegacyAdFormats();
        String simpleName = context.getClass().getSimpleName();
        StringBuilder sbB = b3.h.b("LevelPlay.init() appkey: ", appKey, ", userId: ", userId, ", legacyAdFormats: ");
        sbB.append(legacyAdFormats);
        sbB.append(", context: ");
        sbB.append(simpleName);
        ironLog.info(sbB.toString());
        C3317l5 c3317l5 = new C3317l5();
        C3514wb c3514wb = f39120b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ae.f33847a.a(context, new C3466te(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), uu.k0.toMutableList(c3514wb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c3317l5, levelPlayInitListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "$initRequest");
        f39119a.c(context, initRequest, levelPlayInitListener);
    }

    public final void b(LevelPlaySegment segment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.r.m().a(a(segment));
    }

    public final void b(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.r.m().b(new C3198eb(listener));
    }

    public static /* synthetic */ void a(C3497vb c3497vb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            levelPlayInitListener = null;
        }
        c3497vb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "initRequest");
        f39120b.d(new lh(context, initRequest, levelPlayInitListener));
    }

    public final void a(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.r.m().a(new C3198eb(listener));
    }

    private final C3161ca a(LevelPlaySegment levelPlaySegment) {
        C3161ca c3161ca = new C3161ca();
        c3161ca.a(levelPlaySegment.getLevel());
        c3161ca.a(levelPlaySegment.getIapTotal());
        c3161ca.a(levelPlaySegment.isPaying());
        c3161ca.a(levelPlaySegment.getUserCreationDate());
        c3161ca.a(levelPlaySegment.getSegmentName());
        for (tu.v vVar : levelPlaySegment.getCustoms$mediationsdk_release()) {
            c3161ca.a((String) vVar.getFirst(), (String) vVar.getSecond());
        }
        return c3161ca;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C3326le c3326le, Context context, C3317l5 c3317l5, LevelPlayInitListener levelPlayInitListener) {
        Mb.b bVar = Mb.f34856s;
        L8.a aVarD = bVar.a().D();
        C3126ab c3126ab = new C3126ab(c3326le);
        if (c3126ab.k()) {
            f39120b.a(context);
        }
        N7.a aVarA = bVar.a().a();
        C3514wb c3514wb = f39120b;
        c3126ab.b(c3514wb).a(aVarA);
        c3126ab.a(c3514wb).a(bVar.a().l());
        c3126ab.c(c3514wb).a(bVar.a().v());
        C3497vb c3497vb = f39119a;
        c3497vb.a(levelPlayInitRequest, c3126ab);
        long jE = bVar.d().g().e();
        c3497vb.a(jE, new b(c3126ab, c3317l5, jE, levelPlayInitListener));
        aVarD.a(c3126ab);
        if (c3326le.a().e()) {
            new Fd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j10, kv.a aVar) {
        if (!Mb.f34856s.d().e().c() && j10 > 0) {
            f39120b.a(aVar, j10);
        } else {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3126ab c3126ab, C3317l5 c3317l5, long j10, LevelPlayInitListener levelPlayInitListener) throws JSONException {
        Mb.f34856s.a().D().d();
        long jA = C3317l5.a(c3317l5);
        C3514wb c3514wb = f39120b;
        c3514wb.a(jA, c3126ab.f(), j10);
        c3514wb.e(new gi(25, levelPlayInitListener, c3126ab));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, C3126ab levelPlayConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, C3126ab c3126ab) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && c3126ab.d().c().f() != null) {
            Td.a aVar = Td.f35501z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            Td tdA = aVar.a(new C3205f0(aVar2, C3561z7.f39356a.a(), "", null, null, null, 56, null), c3126ab, true);
            List<C3566zc> listC = c3126ab.c(adFormat);
            D0.b bVar = D0.b.MEDIATION;
            new C3550yd(new V0(new C3350n0(aVar2, bVar), tdA, bVar), adFormat, listC, tdA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && c3126ab.d().c().d() != null) {
            D9.a aVar3 = D9.f34173z;
            IronSource.a aVar4 = IronSource.a.f37252c;
            D9 d9A = aVar3.a(new C3205f0(aVar4, C3561z7.f39356a.a(), "", null, null, null, 56, null), c3126ab, true);
            List<C3566zc> listC2 = c3126ab.c(adFormat2);
            D0.b bVar2 = D0.b.MEDIATION;
            new C3550yd(new V0(new C3350n0(aVar4, bVar2), d9A, bVar2), adFormat2, listC2, d9A).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || c3126ab.d().c().c() == null) {
            return;
        }
        N2 n2A = N2.f35028z.a(new K2(), c3126ab, true);
        List<C3566zc> listC3 = c3126ab.c(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        D0.b bVar3 = D0.b.MEDIATION;
        new C3550yd(new V0(new C3350n0(aVar5, bVar3), n2A, bVar3), adFormat3, listC3, n2A).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitListener levelPlayInitListener, C3317l5 c3317l5, C3364ne c3364ne) throws JSONException {
        long jA = C3317l5.a(c3317l5);
        C3514wb c3514wb = f39120b;
        c3514wb.a(c3364ne, jA);
        c3514wb.e(new gi(24, c3364ne, levelPlayInitListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3364ne error, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(error));
        }
    }

    public final void a(String key, String value) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.r.m().a(key, arrayList);
    }
}
