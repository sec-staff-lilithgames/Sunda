package yp;

import io.bidmachine.nativead.view.VideoPlayerActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoPlayerActivity f94788b;

    public p(VideoPlayerActivity videoPlayerActivity) {
        this.f94788b = videoPlayerActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f94788b.getWindow().clearFlags(128);
        } catch (Exception e10) {
            nm.a.w(e10);
        }
    }
}
