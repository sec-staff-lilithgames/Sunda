package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.l;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f50582a;

    /* renamed from: b, reason: collision with root package name */
    private final int f50583b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50584c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final AdSize banner() {
            return new AdSize(320, 50, l.f37554a, null);
        }

        public final AdSize large() {
            return new AdSize(320, 90, l.f37555b, null);
        }

        public final AdSize leaderboard() {
            return new AdSize(728, 90, l.f37557d, null);
        }

        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, l.f37560g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i10, int i11, String str, u uVar) {
        this(i10, i11, str);
    }

    public static final AdSize banner() {
        return Companion.banner();
    }

    public static final AdSize large() {
        return Companion.large();
    }

    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f50583b;
    }

    public final String getSizeDescription() {
        return this.f50584c;
    }

    public final int getWidth() {
        return this.f50582a;
    }

    private AdSize(int i10, int i11, String str) {
        this.f50582a = i10;
        this.f50583b = i11;
        this.f50584c = str;
    }
}
