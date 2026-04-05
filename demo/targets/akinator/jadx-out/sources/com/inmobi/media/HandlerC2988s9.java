package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC2988s9 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2988s9(C3039v9 videoView) {
        super(Looper.getMainLooper());
        kotlin.jvm.internal.e0.checkNotNullParameter(videoView, "videoView");
        this.f33368a = new WeakReference(videoView);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        InterfaceC2955q9 playbackEventListener;
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        C3039v9 c3039v9 = (C3039v9) this.f33368a.get();
        if (c3039v9 != null && msg.what == 1) {
            int duration = c3039v9.getDuration();
            int currentPosition = c3039v9.getCurrentPosition();
            if (duration != -1 && currentPosition != 0) {
                Object tag = c3039v9.getTag();
                C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
                if (c2887m9 != null) {
                    Object obj = c2887m9.f33155t.get("didCompleteQ1");
                    kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        c2887m9.f33155t.put("didCompleteQ1", Boolean.TRUE);
                        InterfaceC2971r9 quartileCompletedListener = c3039v9.getQuartileCompletedListener();
                        kotlin.jvm.internal.e0.checkNotNull(quartileCompletedListener);
                        ((J8) quartileCompletedListener).a((byte) 0);
                    }
                    Object obj2 = c2887m9.f33155t.get("didCompleteQ2");
                    kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj2).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        c2887m9.f33155t.put("didCompleteQ2", Boolean.TRUE);
                        InterfaceC2971r9 quartileCompletedListener2 = c3039v9.getQuartileCompletedListener();
                        if (quartileCompletedListener2 != null) {
                            ((J8) quartileCompletedListener2).a((byte) 1);
                        }
                    }
                    Object obj3 = c2887m9.f33155t.get("didCompleteQ3");
                    kotlin.jvm.internal.e0.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj3).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        c2887m9.f33155t.put("didCompleteQ3", Boolean.TRUE);
                        InterfaceC2971r9 quartileCompletedListener3 = c3039v9.getQuartileCompletedListener();
                        if (quartileCompletedListener3 != null) {
                            ((J8) quartileCompletedListener3).a((byte) 2);
                        }
                    }
                    if ((currentPosition / duration) * 100 > c2887m9.D) {
                        Object obj4 = c2887m9.f33155t.get("didQ4Fire");
                        kotlin.jvm.internal.e0.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        if (!((Boolean) obj4).booleanValue() && (playbackEventListener = c3039v9.getPlaybackEventListener()) != null) {
                            ((K8) playbackEventListener).a((byte) 5);
                        }
                    }
                }
            }
            sendEmptyMessageDelayed(1, 1000L);
        }
        super.handleMessage(msg);
    }
}
