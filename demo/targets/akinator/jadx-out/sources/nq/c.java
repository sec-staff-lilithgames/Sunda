package nq;

import android.media.MediaPlayer;
import br.h0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements MediaPlayer.OnErrorListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f77180b;

    public c(f fVar) {
        this.f77180b = fVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        lq.d dVar;
        f fVar = this.f77180b;
        h0 h0Var = new h0(o2.i(i10, i11, "MediaPlayer - onError (what - ", ", extra - ", ")"));
        if (fVar.f73606j) {
            fVar.k(h0Var);
            return true;
        }
        if (fVar.f73602f.get() || (dVar = fVar.f73604h) == null) {
            return true;
        }
        dVar.b(fVar, h0Var);
        return true;
    }
}
