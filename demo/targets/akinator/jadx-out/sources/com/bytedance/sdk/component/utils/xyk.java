package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {
    private static HandlerThread jpo;

    public static void jpo(HandlerThread handlerThread) {
        jpo = handlerThread;
    }

    public static HandlerThread jpo(String str) {
        return jpo(str, 0);
    }

    public static HandlerThread jpo(String str, int i10) {
        if (com.bytedance.sdk.component.xyk.zz.sCrashHappened) {
            return jpo;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i10) { // from class: com.bytedance.sdk.component.utils.xyk.1
                boolean jpo = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.jpo) {
                        return;
                    }
                    this.jpo = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th2) {
            nmd.jpo("HandlerThreadUtils", "new handlerThread error", th2);
            return jpo;
        }
    }
}
