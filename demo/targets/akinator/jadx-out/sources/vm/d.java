package vm;

import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89308b;

    public d(VastView vastView) {
        this.f89308b = vastView;
    }

    @Override // java.lang.Runnable
    public void run() {
        VastView vastView = this.f89308b;
        String str = vastView.f60424b;
        try {
            if (vastView.isPlaybackStarted() && vastView.f60446p.isPlaying()) {
                int duration = vastView.f60446p.getDuration();
                int currentPosition = vastView.f60446p.getCurrentPosition();
                if (currentPosition > 0) {
                    float f10 = (currentPosition * 100.0f) / duration;
                    vastView.T.a(duration, currentPosition, f10);
                    vastView.U.a(duration, currentPosition, f10);
                    vastView.f60425b0.a(duration, currentPosition, f10);
                    if (f10 > 105.0f) {
                        io.bidmachine.iab.vast.e.e(str, "Playback tracking: video hang detected", new Object[0]);
                        VastView.v(vastView);
                    }
                }
            }
        } catch (Exception e10) {
            io.bidmachine.iab.vast.e.e(str, "Playback tracking exception: %s", e10.getMessage());
        }
        vastView.postDelayed(this, 16L);
    }
}
