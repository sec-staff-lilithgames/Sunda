package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hx extends Handler {
    protected WeakReference<jpo> jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(Message message);
    }

    public hx(jpo jpoVar) {
        if (jpoVar != null) {
            this.jpo = new WeakReference<>(jpoVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        jpo jpoVar;
        WeakReference<jpo> weakReference = this.jpo;
        if (weakReference == null || (jpoVar = weakReference.get()) == null || message == null) {
            return;
        }
        jpoVar.jpo(message);
    }

    public hx(Looper looper, jpo jpoVar) {
        super(looper);
        if (jpoVar != null) {
            this.jpo = new WeakReference<>(jpoVar);
        }
    }
}
