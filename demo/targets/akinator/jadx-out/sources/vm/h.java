package vm;

import android.media.MediaPlayer;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements MediaPlayer.OnErrorListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89312b;

    public h(VastView vastView) {
        this.f89312b = vastView;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) throws IllegalStateException {
        qm.b bVarInternal = qm.b.internal("MediaPlayer - onError: what - " + i10 + ", extra - " + i11);
        int i12 = VastView.f60422k0;
        this.f89312b.p(bVarInternal);
        return true;
    }
}
