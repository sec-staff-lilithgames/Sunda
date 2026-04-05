package com.inmobi.ads.banner;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.B5;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiBannerAudioManager {
    public static final InMobiBannerAudioManager INSTANCE = new InMobiBannerAudioManager();

    public static InMobiBanner a(ViewGroup viewGroup) {
        InMobiBanner inMobiBannerA;
        if (viewGroup instanceof InMobiBanner) {
            if (viewGroup.getVisibility() == 0 && viewGroup.isShown()) {
                return (InMobiBanner) viewGroup;
            }
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof ViewGroup) && (inMobiBannerA = a((ViewGroup) childAt)) != null) {
                return inMobiBannerA;
            }
        }
        return null;
    }

    public static final void setAudioEnabled(boolean z10) {
        B5.f31650d.set(z10);
    }

    public static final <T extends ViewGroup> void setAudioListener(T t10, AudioListener audioListener) {
        e0.checkNotNullParameter(t10, "t");
        e0.checkNotNullParameter(audioListener, "audioListener");
        INSTANCE.getClass();
        InMobiBanner inMobiBannerA = a(t10);
        if (inMobiBannerA == null || !inMobiBannerA.isAudioAd()) {
            return;
        }
        inMobiBannerA.setAudioListener(audioListener);
    }
}
