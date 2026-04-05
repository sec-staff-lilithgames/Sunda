package nq;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f77182b;

    public e(f fVar) {
        this.f77182b = fVar;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        f fVar = this.f77182b;
        fVar.l(fVar.p());
    }
}
