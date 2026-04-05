package io.bidmachine.iab.vast.activity;

import android.media.MediaPlayer;
import io.bidmachine.iab.vast.t;
import java.util.Iterator;
import um.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements MediaPlayer.OnPreparedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f60476b;

    public d(VastView vastView) {
        this.f60476b = vastView;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        VastView vastView = this.f60476b;
        String str = vastView.f60424b;
        io.bidmachine.iab.vast.e.d(str, "MediaPlayer - onPrepared", new Object[0]);
        if (vastView.f60453w.f60466l) {
            return;
        }
        vastView.o(io.bidmachine.iab.vast.a.f60390b);
        vastView.o(io.bidmachine.iab.vast.a.f60401n);
        if (vastView.isLoaded()) {
            Iterator it = vastView.Q.iterator();
            while (it.hasNext()) {
                ((s) it.next()).toggleShow();
            }
        }
        vastView.setLoadingViewVisibility(false);
        vastView.L = true;
        if (!vastView.f60453w.f60463i) {
            mediaPlayer.start();
            vastView.V.clear();
            vastView.W = 0;
            vastView.f60423a0 = 0.0f;
            vm.d dVar = vastView.S;
            vastView.removeCallbacks(dVar);
            dVar.run();
        }
        vastView.C();
        int i10 = vastView.f60453w.f60460f;
        if (i10 > 0) {
            mediaPlayer.seekTo(i10);
            vastView.o(io.bidmachine.iab.vast.a.f60400m);
            io.bidmachine.iab.vast.f fVar = vastView.f60455y;
            if (fVar != null) {
                fVar.onVideoResumed();
            }
        }
        if (!vastView.f60453w.f60469o) {
            vastView.A();
        }
        if (vastView.f60453w.f60467m) {
            return;
        }
        io.bidmachine.iab.vast.e.d(str, "handleImpressions", new Object[0]);
        t tVar = vastView.f60452v;
        if (tVar != null) {
            vastView.f60453w.f60467m = true;
            vastView.g(tVar.getVastAd().getImpressionUrlList());
        }
        if (vastView.f60452v.shouldPreloadCompanion()) {
            vastView.k(false);
        }
    }
}
