package com.ironsource;

import com.ironsource.Ad;
import com.ironsource.C3434s;
import com.ironsource.InterfaceC3543y6;
import com.ironsource.U2;
import com.ironsource.Za;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3126ab extends C3326le {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.ab$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35964a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f35964a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3126ab(C3326le sdkConfig) {
        super(sdkConfig);
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, Ad.b> mapA;
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        Ad.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(adUnitId)) ? false : true;
    }

    public final InterfaceC3543y6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        return new InterfaceC3543y6.a(a(adFormat, adUnitId));
    }

    public final List<C3566zc> c(LevelPlay.AdFormat adFormat) {
        Map<String, Ad.b> mapA;
        Set<String> setKeySet;
        List<C3566zc> listDistinct;
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        Ad.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (setKeySet = mapA.keySet()) != null) {
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List listFlatten = uu.q0.flatten(arrayList);
            if (listFlatten != null && (listDistinct = uu.y0.distinct(listFlatten)) != null) {
                return listDistinct;
            }
        }
        return uu.p0.emptyList();
    }

    public final List<C3566zc> d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, Ad.b> mapA;
        Ad.b bVar;
        List<String> listA;
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        Ad.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (bVar = mapA.get(adUnitId)) == null || (listA = bVar.a()) == null) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            C3566zc c3566zc = g().e().a().get((String) it.next());
            if (c3566zc != null) {
                arrayList.add(c3566zc);
            }
        }
        return arrayList;
    }

    public final List<LevelPlayAdSize> h() {
        List<String> listA = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float i() {
        return g().a().c().b().b();
    }

    public final boolean j() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        return aVarA != null && aVarA.b();
    }

    public final boolean k() {
        return g().a().b().d();
    }

    public final C3381od b(C3514wb tools) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        return new C3381od(tools, g().a().a());
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C3434s.d dVarB;
        Long lD;
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        C3434s c3434s = g().a().a().get(adFormat);
        long jLongValue = (c3434s == null || (dVarB = c3434s.b()) == null || (lD = dVarB.d()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    public final Za.a a(String adUnitId) {
        long jD;
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        U2 u2C = g().a().c();
        U2.b bVar = u2C.a().get(adUnitId);
        int iC = bVar != null ? bVar.c() : u2C.b().c();
        boolean zE = bVar != null ? bVar.e() : u2C.b().e();
        if (bVar != null) {
            jD = bVar.d();
        } else {
            jD = u2C.b().d();
        }
        return new Za.a(zE, iC, jD);
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, Ad.b> mapA;
        Set<String> setKeySet;
        List<String> list;
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        Ad.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null || (list = uu.y0.toList(setKeySet)) == null) ? uu.p0.emptyList() : list;
    }

    public final C3325ld c(LevelPlay.AdFormat adFormat, String str) {
        C3325ld c3325ldA;
        K9 k9A;
        String str2;
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        int i10 = a.f35964a[adFormat.ordinal()];
        if (i10 == 1) {
            Zd zdF = d().c().f();
            if (zdF == null || (c3325ldA = zdF.a(str)) == null) {
                return null;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3325ldA, "getRewardedVideoPlacement(placementName)");
            return new C3325ld(c3325ldA.b(), c3325ldA.c(), c3325ldA.d(), c3325ldA.f(), c3325ldA.e(), c3325ldA.a());
        }
        if (i10 == 2) {
            F9 f9D = d().c().d();
            if (f9D == null || (k9A = f9D.a(str)) == null) {
                return null;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(k9A, "getInterstitialPlacement(placementName)");
            return new C3325ld(k9A);
        }
        if (i10 == 3) {
            V2 v2C = d().c().c();
            if (v2C != null) {
                C3262i3 c3262i3A = v2C.a(str);
                if (c3262i3A == null) {
                    c3262i3A = v2C.i();
                    str2 = "config.defaultBannerPlacement";
                } else {
                    str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
                }
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3262i3A, str2);
                return new C3325ld(c3262i3A);
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        if (i10 == 4) {
            Rb rbE = d().c().e();
            if (rbE != null && str != null) {
                C3163cc c3163ccA = rbE.a(str);
                if (c3163ccA == null) {
                    c3163ccA = rbE.e();
                }
                if (c3163ccA != null) {
                    return new C3325ld(c3163ccA);
                }
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        throw new tu.t();
    }

    public final C3452t0 a(C3514wb tools) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        return new C3452t0(tools, g().a().a());
    }

    private final InterfaceC3543y6.c a(LevelPlay.AdFormat adFormat, String str) {
        C3434s.d dVarB;
        C3533xd c3533xdG;
        Map<String, C3434s.d> mapA;
        C3434s.d dVar;
        C3533xd c3533xdG2;
        boolean z10 = adFormat == LevelPlay.AdFormat.REWARDED;
        C3434s c3434s = g().a().a().get(adFormat);
        InterfaceC3543y6.c cVarA = null;
        InterfaceC3543y6.c cVarA2 = (c3434s == null || (mapA = c3434s.a()) == null || (dVar = mapA.get(str)) == null || (c3533xdG2 = dVar.g()) == null) ? null : c3533xdG2.a();
        if (c3434s != null && (dVarB = c3434s.b()) != null && (c3533xdG = dVarB.g()) != null) {
            cVarA = c3533xdG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        if (cVarA2 != null) {
            return cVarA2;
        }
        if (z10) {
            return InterfaceC3543y6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC3543y6.c.SINGLE;
    }

    public final Jd c(C3514wb tools) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        C3434s c3434s = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Jd(tools, c3434s != null ? c3434s.a() : null, c3434s != null ? c3434s.c() : null);
    }
}
