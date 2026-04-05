package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3205f0 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f36664a;

    /* renamed from: b, reason: collision with root package name */
    private final UUID f36665b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36666c;

    /* renamed from: d, reason: collision with root package name */
    private C3325ld f36667d;

    /* renamed from: e, reason: collision with root package name */
    private final Hf f36668e;

    /* renamed from: f, reason: collision with root package name */
    private final Double f36669f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.f0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36670a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.f37252c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f36670a = iArr;
        }
    }

    public C3205f0(IronSource.a adFormat, UUID adId, String adUnitId, C3325ld c3325ld, Hf hf2, Double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        this.f36664a = adFormat;
        this.f36665b = adId;
        this.f36666c = adUnitId;
        this.f36667d = c3325ld;
        this.f36668e = hf2;
        this.f36669f = d10;
    }

    public final IronSource.a a() {
        return this.f36664a;
    }

    public final UUID b() {
        return this.f36665b;
    }

    public final String c() {
        return this.f36666c;
    }

    public final Double d() {
        return this.f36669f;
    }

    public final LevelPlay.AdFormat e() {
        int i10 = a.f36670a[this.f36664a.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i10 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new tu.t();
    }

    public final C3325ld f() {
        return this.f36667d;
    }

    public final Hf g() {
        return this.f36668e;
    }

    public final void a(C3325ld c3325ld) {
        this.f36667d = c3325ld;
    }

    public /* synthetic */ C3205f0(IronSource.a aVar, UUID uuid, String str, C3325ld c3325ld, Hf hf2, Double d10, int i10, kotlin.jvm.internal.u uVar) {
        this(aVar, uuid, str, (i10 & 8) != 0 ? null : c3325ld, (i10 & 16) != 0 ? null : hf2, (i10 & 32) != 0 ? null : d10);
    }
}
