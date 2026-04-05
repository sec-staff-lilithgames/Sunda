package com.unity3d.mediation;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f50671a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0548a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50672a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f50672a = iArr;
        }
    }

    private a() {
    }

    public static final IronSource.a a(LevelPlay.AdFormat adFormat) {
        e0.checkNotNullParameter(adFormat, "<this>");
        int i10 = C0548a.f50672a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.BANNER;
        }
        if (i10 == 2) {
            return IronSource.a.f37252c;
        }
        if (i10 == 3) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new t();
    }
}
