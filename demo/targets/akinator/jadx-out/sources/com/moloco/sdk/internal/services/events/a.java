package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import com.moloco.sdk.ab;
import com.moloco.sdk.cb;
import com.moloco.sdk.fb;
import com.moloco.sdk.ga;
import com.moloco.sdk.ia;
import com.moloco.sdk.internal.services.a;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.p;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.la;
import com.moloco.sdk.ma;
import com.moloco.sdk.ra;
import com.moloco.sdk.ta;
import com.moloco.sdk.wa;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import tu.t;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b {

    /* renamed from: a, reason: collision with root package name */
    public final v f47009a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.b f47010b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f47011c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.f f47012d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.e f47013e;

    /* renamed from: f, reason: collision with root package name */
    public final p f47014f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.proto.b f47015g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c f47016h;

    /* renamed from: i, reason: collision with root package name */
    public final String f47017i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.services.events.a$a, reason: collision with other inner class name */
    public static final class C0389a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public a f47018i;

        /* renamed from: j, reason: collision with root package name */
        public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f47019j;

        /* renamed from: k, reason: collision with root package name */
        public la f47020k;

        /* renamed from: l, reason: collision with root package name */
        public la f47021l;

        /* renamed from: m, reason: collision with root package name */
        public la f47022m;

        /* renamed from: n, reason: collision with root package name */
        public long f47023n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f47024o;

        /* renamed from: q, reason: collision with root package name */
        public int f47026q;

        public C0389a(zu.d<? super C0389a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47024o = obj;
            this.f47026q |= Integer.MIN_VALUE;
            return a.this.a(0L, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public String f47027i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f47028j;

        /* renamed from: l, reason: collision with root package name */
        public int f47030l;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47028j = obj;
            this.f47030l |= Integer.MIN_VALUE;
            return a.this.a(0L, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) null, (String) null, this);
        }
    }

    public a(v appInfoService, com.moloco.sdk.internal.services.b networkInfoService, i0 deviceInfoService, com.moloco.sdk.internal.services.f screenInfoService, com.moloco.sdk.internal.services.usertracker.e userIdentifierService, p adDataService, com.moloco.sdk.internal.services.proto.b encoderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c userEventConfigService, String sdkVersion) {
        e0.checkNotNullParameter(appInfoService, "appInfoService");
        e0.checkNotNullParameter(networkInfoService, "networkInfoService");
        e0.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        e0.checkNotNullParameter(screenInfoService, "screenInfoService");
        e0.checkNotNullParameter(userIdentifierService, "userIdentifierService");
        e0.checkNotNullParameter(adDataService, "adDataService");
        e0.checkNotNullParameter(encoderService, "encoderService");
        e0.checkNotNullParameter(userEventConfigService, "userEventConfigService");
        e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.f47009a = appInfoService;
        this.f47010b = networkInfoService;
        this.f47011c = deviceInfoService;
        this.f47012d = screenInfoService;
        this.f47013e = userIdentifierService;
        this.f47014f = adDataService;
        this.f47015g = encoderService;
        this.f47016h = userEventConfigService;
        this.f47017i = sdkVersion;
    }

    public final v b() {
        return this.f47009a;
    }

    public final i0 c() {
        return this.f47011c;
    }

    public final com.moloco.sdk.internal.services.proto.b d() {
        return this.f47015g;
    }

    public final com.moloco.sdk.internal.services.b e() {
        return this.f47010b;
    }

    public final com.moloco.sdk.internal.services.f f() {
        return this.f47012d;
    }

    public final String g() {
        return this.f47017i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c h() {
        return this.f47016h;
    }

    public final com.moloco.sdk.internal.services.usertracker.e i() {
        return this.f47013e;
    }

    public final p a() {
        return this.f47014f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r11, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a r13, java.lang.String r14, zu.d<? super java.lang.String> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.services.events.a.b
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.services.events.a$b r0 = (com.moloco.sdk.internal.services.events.a.b) r0
            int r1 = r0.f47030l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47030l = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.events.a$b r0 = new com.moloco.sdk.internal.services.events.a$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f47028j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f47030l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r14 = r0.f47027i
            tu.a0.throwOnFailure(r15)
            goto L56
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            tu.a0.throwOnFailure(r15)
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c r15 = r10.f47016h
            boolean r15 = r15.c()
            if (r15 != 0) goto L4b
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r8 = 4
            r9 = 0
            java.lang.String r5 = "CustomUserEventBuilderServiceImpl"
            java.lang.String r6 = "Event reporting config disabled, UserAdInteractionExt not reporting"
            r7 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r4, r5, r6, r7, r8, r9)
            return r14
        L4b:
            r0.f47027i = r14
            r0.f47030l = r3
            java.lang.Object r15 = r10.a(r11, r13, r0)
            if (r15 != r1) goto L56
            return r1
        L56:
            java.lang.String r15 = (java.lang.String) r15
            android.net.Uri r11 = android.net.Uri.parse(r14)
            android.net.Uri$Builder r11 = r11.buildUpon()
            java.lang.String r12 = "user_ad_interaction_ext"
            android.net.Uri$Builder r11 = r11.appendQueryParameter(r12, r15)
            android.net.Uri r11 = r11.build()
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.a.a(long, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a r10, zu.d<? super java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.events.a.a(long, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, zu.d):java.lang.Object");
    }

    public final la a(la laVar) {
        ab abVarNewBuilder = UserIntent$UserAdInteractionExt.MolocoSDK.newBuilder();
        abVarNewBuilder.setCoreVer(this.f47017i);
        laVar.setSdk((UserIntent$UserAdInteractionExt.MolocoSDK) abVarNewBuilder.build());
        return laVar;
    }

    public final la a(la laVar, h0 h0Var) {
        ta taVarNewBuilder = UserIntent$UserAdInteractionExt.Device.newBuilder();
        taVarNewBuilder.setOsVer(h0Var.x());
        taVarNewBuilder.setModel(h0Var.v());
        taVarNewBuilder.setOs(wa.ANDROID);
        taVarNewBuilder.setScreenScale(h0Var.y());
        laVar.setDevice((UserIntent$UserAdInteractionExt.Device) taVarNewBuilder.build());
        return laVar;
    }

    public final la a(la laVar, com.moloco.sdk.internal.services.a aVar) {
        cb cbVarNewBuilder = UserIntent$UserAdInteractionExt.Network.newBuilder();
        if (aVar instanceof a.C0386a) {
            cbVarNewBuilder.setConnectionType(fb.CELLULAR);
            cbVarNewBuilder.setCarrier(((a.C0386a) aVar).a());
        } else if (e0.areEqual(aVar, a.b.f46754a)) {
            cbVarNewBuilder.setConnectionType(fb.UNKNOWN);
        } else if (e0.areEqual(aVar, a.c.f46755a)) {
            cbVarNewBuilder.setConnectionType(fb.WIFI);
        } else {
            throw new t();
        }
        laVar.setNetwork((UserIntent$UserAdInteractionExt.Network) cbVarNewBuilder.build());
        return laVar;
    }

    public final la a(la laVar, u uVar) {
        ga gaVarNewBuilder = UserIntent$UserAdInteractionExt.App.newBuilder();
        gaVarNewBuilder.setId(uVar.b());
        gaVarNewBuilder.setVer(uVar.c());
        laVar.setApp((UserIntent$UserAdInteractionExt.App) gaVarNewBuilder.build());
        return laVar;
    }

    public final la a(la laVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.internal.services.e eVar) {
        if (aVar instanceof a.e) {
            laVar.setImpInteraction((UserIntent$UserAdInteractionExt.ImpressionInteraction) UserIntent$UserAdInteractionExt.ImpressionInteraction.newBuilder().build());
            return laVar;
        }
        if (aVar instanceof a.d) {
            ra raVarNewBuilder = UserIntent$UserAdInteractionExt.ClickInteraction.newBuilder();
            a.d dVar = (a.d) aVar;
            raVarNewBuilder.setClickPos(c.a(dVar.b()));
            raVarNewBuilder.setScreenSize(c.a(eVar));
            a.g gVarD = dVar.d();
            if (gVarD != null) {
                raVarNewBuilder.setViewSize(c.a(gVarD));
            }
            a.f fVarC = dVar.c();
            if (fVarC != null) {
                raVarNewBuilder.setViewPos(c.a(fVarC));
            }
            List<a.c> listA = dVar.a();
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listA, 10));
            for (a.c cVar : listA) {
                ma maVarNewBuilder = UserIntent$UserAdInteractionExt.Button.newBuilder();
                maVarNewBuilder.setType(c.a(cVar.d()));
                maVarNewBuilder.setPos(c.a(cVar.e()));
                maVarNewBuilder.setSize(c.a(cVar.f()));
                arrayList.add((UserIntent$UserAdInteractionExt.Button) maVarNewBuilder.build());
            }
            raVarNewBuilder.addAllButtons(arrayList);
            laVar.setClickInteraction((UserIntent$UserAdInteractionExt.ClickInteraction) raVarNewBuilder.build());
            return laVar;
        }
        if (aVar instanceof a.b) {
            ia iaVarNewBuilder = UserIntent$UserAdInteractionExt.AppForegroundingInteraction.newBuilder();
            iaVarNewBuilder.setBgTsMs(((a.b) aVar).b());
            laVar.setAppForegroundingInteraction((UserIntent$UserAdInteractionExt.AppForegroundingInteraction) iaVarNewBuilder.build());
            return laVar;
        }
        if (aVar instanceof a.C0489a) {
            laVar.setAppBackgroundingInteraction((UserIntent$UserAdInteractionExt.AppBackgroundingInteraction) UserIntent$UserAdInteractionExt.AppBackgroundingInteraction.newBuilder().build());
            return laVar;
        }
        throw new t();
    }
}
