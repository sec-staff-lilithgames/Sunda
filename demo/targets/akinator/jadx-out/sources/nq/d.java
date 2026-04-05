package nq;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements MediaPlayer.OnPreparedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f77181b;

    public d(f fVar) {
        this.f77181b = fVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.seekTo(1);
        this.f77181b.v();
    }
}
