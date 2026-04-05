package com.unity3d.services.banners;

import android.content.Context;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import mv.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;
    public static final Companion Companion = new Companion(null);
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    private static final UnityBannerSize standard = new UnityBannerSize(320, 50);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final UnityBannerSize getDynamicSize(Context context) {
            e0.checkNotNullParameter(context, "context");
            int iRoundToInt = d.roundToInt(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            return iRoundToInt >= getLeaderboard().getWidth() ? getLeaderboard() : iRoundToInt >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }

        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }

        private Companion() {
        }
    }

    public UnityBannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static final UnityBannerSize getDynamicSize(Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
