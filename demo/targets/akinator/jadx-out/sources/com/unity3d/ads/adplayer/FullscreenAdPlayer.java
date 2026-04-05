package com.unity3d.ads.adplayer;

import av.e;
import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.jvm.internal.e0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, d<? super x0> dVar) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, dVar);
            return objDestroy == e.getCOROUTINE_SUSPENDED() ? objDestroy : x0.f87415a;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            e0.checkNotNullParameter(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
