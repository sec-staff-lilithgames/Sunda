package com.google.android.exoplayer2.ui;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f28175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AspectRatioFrameLayout f28176c;

    public d(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f28176c = aspectRatioFrameLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f28175b = false;
        int i10 = AspectRatioFrameLayout.f28132f;
        this.f28176c.getClass();
    }

    public void scheduleUpdate(float f10, float f11, boolean z10) {
        if (this.f28175b) {
            return;
        }
        this.f28175b = true;
        this.f28176c.post(this);
    }
}
