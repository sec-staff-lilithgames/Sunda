package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final InMobiBanner f32181a;

    /* JADX WARN: Illegal instructions before constructor call */
    public R1(InMobiBanner mInmobiBanner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        Looper looper = Looper.getMainLooper();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        kotlin.jvm.internal.e0.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        kotlin.jvm.internal.e0.checkNotNullParameter(looper, "looper");
        super(looper);
        this.f32181a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            this.f32181a.refreshBanner$media_release();
        } else {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("R1", "TAG");
        }
    }
}
