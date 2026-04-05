package com.bytedance.adsdk.ugeno.qk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends Handler {
    private final WeakReference<jpo> jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(Message message);
    }

    public zz(Looper looper, jpo jpoVar) {
        super(looper);
        this.jpo = new WeakReference<>(jpoVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        jpo jpoVar = this.jpo.get();
        if (jpoVar == null || message == null) {
            return;
        }
        jpoVar.jpo(message);
    }
}
