package com.ironsource;

import com.ironsource.C3518wf;
import com.ironsource.D0;
import com.ironsource.InterfaceC3543y6;
import com.ironsource.Za;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3350n0 extends C3514wb {

    /* renamed from: b, reason: collision with root package name */
    private final IronSource.a f37913b;

    /* renamed from: c, reason: collision with root package name */
    private final C3518wf.b f37914c;

    /* renamed from: d, reason: collision with root package name */
    private final E5 f37915d;

    /* renamed from: e, reason: collision with root package name */
    private final L8 f37916e;

    /* renamed from: f, reason: collision with root package name */
    private final long f37917f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.n0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37918a = new a();

        private a() {
        }

        public static final C3350n0 a(IronSource.a adFormat, D0.b level) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
            kotlin.jvm.internal.e0.checkNotNullParameter(level, "level");
            return new C3350n0(adFormat, level);
        }
    }

    public C3350n0(IronSource.a adFormat, D0.b level) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(level, "level");
        this.f37916e = Mb.f34856s.d().e();
        this.f37917f = TimeUnit.HOURS.toMillis(1L);
        this.f37913b = adFormat;
        this.f37915d = new E5(adFormat, level, null, null, 12, null);
        C3518wf.b bVarB = C3518wf.b(adFormat);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bVarB, "createLogFactory(adFormat)");
        this.f37914c = bVarB;
    }

    public static /* synthetic */ String a(C3350n0 c3350n0, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3350n0.a(str, str2);
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    public final IronSource.a d() {
        return this.f37913b;
    }

    public final E5 e() {
        return this.f37915d;
    }

    public final int f() {
        return Mb.f34856s.d().s().a(this.f37913b);
    }

    public final boolean g() {
        return Mb.f34856s.d().e().c();
    }

    public final String a(String str, String str2) {
        String strA = this.f37914c.a(str, str2);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bVarD, "getInstance()");
        return bVarD;
    }

    public final C3325ld c(String placementName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        C3126ab c3126abA = this.f37916e.a();
        if (c3126abA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C3325ld c3325ldC = c3126abA.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c3325ldC != null) {
            return c3325ldC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Za.a d(String adUnitId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        C3126ab c3126abA = this.f37916e.a();
        if (c3126abA != null) {
            return c3126abA.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final C3325ld a(String placementName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        C3126ab c3126abA = this.f37916e.a();
        if (c3126abA != null) {
            C3325ld c3325ldC = c3126abA.c(LevelPlay.AdFormat.BANNER, placementName);
            if (c3325ldC != null) {
                return c3325ldC;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final InterfaceC3543y6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        C3126ab c3126abA = this.f37916e.a();
        if (c3126abA != null) {
            return c3126abA.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        C3126ab c3126abA = this.f37916e.a();
        return c3126abA != null ? c3126abA.b(adFormat) : this.f37917f;
    }

    public C3350n0(C3350n0 adTools, D0.b level) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(level, "level");
        this.f37916e = Mb.f34856s.d().e();
        this.f37917f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = adTools.f37913b;
        this.f37913b = aVar;
        this.f37914c = adTools.f37914c;
        this.f37915d = new E5(aVar, level, adTools.f37915d.c(), null, 8, null);
    }

    public final C3325ld a(LevelPlay.AdFormat adFormat, String str) {
        C3126ab c3126abA;
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (c3126abA = this.f37916e.a()) == null) {
            return null;
        }
        return c3126abA.c(adFormat, str);
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.l.a(data, size);
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adSize, "adSize");
        return new C3294k0().b(adSize);
    }
}
