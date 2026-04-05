package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC2904n9 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33159a;

    public HandlerC2904n9(C2921o9 controller) {
        kotlin.jvm.internal.e0.checkNotNullParameter(controller, "controller");
        this.f33159a = new WeakReference(controller);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        C3039v9 c3039v9;
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        if (msg.what != 2) {
            super.handleMessage(msg);
            return;
        }
        C2921o9 c2921o9 = (C2921o9) this.f33159a.get();
        if (c2921o9 != null) {
            C3039v9 c3039v92 = c2921o9.f33195d;
            if (c3039v92 != null) {
                int currentPosition = c3039v92.getCurrentPosition();
                int duration = c3039v92.getDuration();
                if (duration != 0) {
                    c2921o9.f33199h.setProgress((currentPosition * 100) / duration);
                }
            }
            if (c2921o9.f33196e && (c3039v9 = c2921o9.f33195d) != null && c3039v9.isPlaying()) {
                Message messageObtainMessage = obtainMessage(2);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                sendMessageDelayed(messageObtainMessage, 200L);
            }
        }
    }
}
