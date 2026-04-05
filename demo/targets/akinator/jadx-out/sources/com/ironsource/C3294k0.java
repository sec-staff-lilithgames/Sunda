package com.ironsource;

import android.content.Context;
import com.ironsource.C3518wf;
import com.ironsource.D0;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3294k0 extends C3514wb {

    /* renamed from: b, reason: collision with root package name */
    private final E5 f37048b;

    /* renamed from: c, reason: collision with root package name */
    private final C3518wf.b f37049c;

    /* renamed from: d, reason: collision with root package name */
    private final L8 f37050d;

    public C3294k0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.f37048b = new E5(aVar, D0.b.MEDIATION, null, null, 12, null);
        C3518wf.b bVarB = C3518wf.b(aVar);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bVarB, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f37049c = bVarB;
        this.f37050d = Mb.f34856s.d().e();
    }

    public static /* synthetic */ String a(C3294k0 c3294k0, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3294k0.a(str, str2);
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        return kotlin.jvm.internal.e0.areEqual(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f37555b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.e0.areEqual(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f37556c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : kotlin.jvm.internal.e0.areEqual(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(com.ironsource.mediationsdk.l.f37558e, 0, 0) : kotlin.jvm.internal.e0.areEqual(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(com.ironsource.mediationsdk.l.f37554a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final List<LevelPlayAdSize> b() {
        C3126ab c3126abA = this.f37050d.a();
        if (c3126abA != null) {
            return c3126abA.h();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final boolean d() {
        return Mb.f34856s.d().e().c();
    }

    public final String a(String str, String str2) {
        String strA = this.f37049c.a(str, str2);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final int a(int i10) {
        return com.ironsource.mediationsdk.l.a(i10);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeB = b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeB.setAdaptive(true);
        com.ironsource.mediationsdk.o.f37639a.a(iSBannerSizeB, new Y7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return iSBannerSizeB;
    }

    public final Integer b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Float fC = c();
        if (fC != null) {
            return Integer.valueOf(mv.d.roundToInt(fC.floatValue() * C3192e5.f36568a.a(context)));
        }
        return null;
    }

    public final ISBannerSize b(LevelPlayAdSize size) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        boolean zIsAdaptive = size.isAdaptive();
        if (zIsAdaptive) {
            return a(size);
        }
        if (zIsAdaptive) {
            throw new tu.t();
        }
        return c(size);
    }

    private final Float c() {
        C3126ab c3126abA = this.f37050d.a();
        Float fValueOf = c3126abA != null ? Float.valueOf(c3126abA.i()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.f37048b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
