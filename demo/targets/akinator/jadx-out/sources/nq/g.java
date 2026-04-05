package nq;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f77187b;

    public g(i iVar) {
        this.f77187b = iVar;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.f77187b.setVideoAspectRatio(i10 / i11);
    }
}
