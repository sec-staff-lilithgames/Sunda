package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.i5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC3264i5 extends Handler {

    /* renamed from: b, reason: collision with root package name */
    private static final String f36921b = "DownloadHandler";

    /* renamed from: a, reason: collision with root package name */
    Pc f36922a;

    public HandlerC3264i5(Looper looper) {
        super(looper);
    }

    public void a(Pc pc2) {
        if (pc2 == null) {
            throw new IllegalArgumentException();
        }
        this.f36922a = pc2;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Pc pc2 = this.f36922a;
        if (pc2 == null) {
            Logger.i(f36921b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 == 1016) {
                pc2.a((C8) message.obj);
            } else {
                this.f36922a.a((C8) message.obj, new C3477u8(i10, C3310kg.a(i10)));
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            Logger.i(f36921b, "handleMessage | Got exception: " + th2.getMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a() {
        this.f36922a = null;
    }
}
