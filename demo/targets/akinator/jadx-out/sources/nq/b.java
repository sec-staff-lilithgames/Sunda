package nq;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements MediaPlayer.OnCompletionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f77179b;

    public b(f fVar) {
        this.f77179b = fVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f77179b.c();
    }
}
