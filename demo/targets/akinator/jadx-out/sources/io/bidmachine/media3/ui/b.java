package io.bidmachine.media3.ui;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f61686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AspectRatioFrameLayout f61687c;

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f61687c = aspectRatioFrameLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f61686b = false;
        int i10 = AspectRatioFrameLayout.f61630f;
        this.f61687c.getClass();
    }

    public void scheduleUpdate(float f10, float f11, boolean z10) {
        if (this.f61686b) {
            return;
        }
        this.f61686b = true;
        this.f61687c.post(this);
    }
}
