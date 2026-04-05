package yp;

import android.view.View;
import io.bidmachine.nativead.view.VideoPlayerActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoPlayerActivity f94787b;

    public o(VideoPlayerActivity videoPlayerActivity) {
        this.f94787b = videoPlayerActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10 = VideoPlayerActivity.f61961f;
        VideoPlayerActivity videoPlayerActivity = this.f94787b;
        if (videoPlayerActivity.f61964e != null) {
            videoPlayerActivity.f61964e.videoPlayerActivityClosed(videoPlayerActivity.f61963c.isPlaying() ? videoPlayerActivity.f61963c.getCurrentPosition() : 0, false);
        }
        videoPlayerActivity.runOnUiThread(new p(videoPlayerActivity));
        videoPlayerActivity.finish();
    }
}
