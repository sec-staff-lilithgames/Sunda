package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC2828j1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2828j1(Looper looper) {
        super(looper);
        kotlin.jvm.internal.e0.checkNotNullParameter(looper, "looper");
        this.f32953a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        if (C2879m1.f33068c) {
            return;
        }
        int i10 = msg.what;
        if (i10 == 1001 && this.f32953a) {
            this.f32953a = false;
            C2879m1.a(C2879m1.f33066a, false);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(C2879m1.b(), "access$getTAG$p(...)");
        } else {
            if (i10 != 1002 || this.f32953a) {
                return;
            }
            this.f32953a = true;
            C2879m1.a(C2879m1.f33066a, true);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(C2879m1.b(), "access$getTAG$p(...)");
        }
    }
}
