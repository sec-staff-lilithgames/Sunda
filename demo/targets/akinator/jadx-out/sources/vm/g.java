package vm;

import android.media.MediaPlayer;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements MediaPlayer.OnCompletionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89311b;

    public g(VastView vastView) {
        this.f89311b = vastView;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        VastView vastView = this.f89311b;
        io.bidmachine.iab.vast.e.d(vastView.f60424b, "MediaPlayer - onCompletion", new Object[0]);
        VastView.v(vastView);
    }
}
