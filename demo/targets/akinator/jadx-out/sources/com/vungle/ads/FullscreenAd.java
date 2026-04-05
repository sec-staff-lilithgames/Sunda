package com.vungle.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface FullscreenAd extends Ad {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void play$default(FullscreenAd fullscreenAd, Context context, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
            }
            if ((i10 & 1) != 0) {
                context = null;
            }
            fullscreenAd.play(context);
        }
    }

    void play(Context context);
}
