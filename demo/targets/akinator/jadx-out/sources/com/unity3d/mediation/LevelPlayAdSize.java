package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C3188e1;
import com.ironsource.C3294k0;
import com.ironsource.mediationsdk.l;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayAdSize {

    /* renamed from: f, reason: collision with root package name */
    private static final int f50650f = 320;

    /* renamed from: g, reason: collision with root package name */
    private static final int f50651g = 50;

    /* renamed from: h, reason: collision with root package name */
    private static final int f50652h = 320;

    /* renamed from: i, reason: collision with root package name */
    private static final int f50653i = 90;

    /* renamed from: m, reason: collision with root package name */
    private static final int f50657m = 90;

    /* renamed from: a, reason: collision with root package name */
    private int f50658a;

    /* renamed from: b, reason: collision with root package name */
    private int f50659b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50660c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f50661d;

    /* renamed from: e, reason: collision with root package name */
    private final LevelPlayAdSize f50662e;
    public static final Companion Companion = new Companion(null);
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, l.f37554a, false, null, 16, null);

    /* renamed from: j, reason: collision with root package name */
    private static final int f50654j = 300;

    /* renamed from: k, reason: collision with root package name */
    private static final int f50655k = 250;
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(f50654j, f50655k, l.f37560g, false, null, 16, null);

    /* renamed from: l, reason: collision with root package name */
    private static final int f50656l = 728;
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f50656l, 90, l.f37557d, false, null, 16, null);
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, l.f37555b, false, null, 16, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        public final LevelPlayAdSize createAdSize$mediationsdk_release(String adSize) {
            e0.checkNotNullParameter(adSize, "adSize");
            int iHashCode = adSize.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && adSize.equals(l.f37554a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(l.f37557d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(l.f37555b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(l.f37560g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context) {
            e0.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        public final LevelPlayAdSize createCustomSize(int i10, int i11) {
            return new LevelPlayAdSize(i10, i11, l.f37559f, false, null, 16, null);
        }

        private Companion() {
        }

        public final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
            e0.checkNotNullParameter(context, "context");
            return new C3188e1(new C3294k0()).a(context, num);
        }
    }

    public LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize) {
        this.f50658a = i10;
        this.f50659b = i11;
        this.f50660c = str;
        this.f50661d = z10;
        this.f50662e = levelPlayAdSize;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    public static final LevelPlayAdSize createCustomSize(int i10, int i11) {
        return Companion.createCustomSize(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e0.areEqual(LevelPlayAdSize.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.f50658a == levelPlayAdSize.f50658a && this.f50659b == levelPlayAdSize.f50659b && e0.areEqual(this.f50660c, levelPlayAdSize.f50660c);
    }

    public final String getDescription() {
        return String.valueOf(this.f50660c);
    }

    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f50662e;
    }

    public final int getHeight() {
        return this.f50659b;
    }

    public final int getWidth() {
        return this.f50658a;
    }

    public int hashCode() {
        int i10 = ((this.f50658a * 31) + this.f50659b) * 31;
        String str = this.f50660c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.f50661d;
    }

    public String toString() {
        return this.f50660c + " " + this.f50658a + "x" + this.f50659b;
    }

    public static final LevelPlayAdSize createAdaptiveAdSize(Context context, Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public /* synthetic */ LevelPlayAdSize(int i10, int i11, String str, boolean z10, LevelPlayAdSize levelPlayAdSize, int i12, u uVar) {
        this(i10, i11, (i12 & 4) != 0 ? null : str, z10, (i12 & 16) != 0 ? null : levelPlayAdSize);
    }
}
