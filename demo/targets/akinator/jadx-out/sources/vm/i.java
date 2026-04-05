package vm;

import android.media.MediaPlayer;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89313b;

    public i(VastView vastView) {
        this.f89313b = vastView;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        VastView vastView = this.f89313b;
        io.bidmachine.iab.vast.e.d(vastView.f60424b, "onVideoSizeChanged", new Object[0]);
        vastView.E = i10;
        vastView.F = i11;
        vastView.s();
    }
}
