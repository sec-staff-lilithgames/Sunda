package com.bytedance.sdk.component.xyk.jpo;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.hx;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends hx implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final HandlerThread f19033jd;

    public jd(HandlerThread handlerThread, hx.jpo jpoVar) {
        super(handlerThread.getLooper(), jpoVar);
        this.f19033jd = handlerThread;
    }

    public void jd() {
        HandlerThread handlerThread = this.f19033jd;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.xyk.jpo.wqx
    public void jpo() {
        removeCallbacksAndMessages(null);
        WeakReference<hx.jpo> weakReference = this.jpo;
        if (weakReference != null) {
            weakReference.clear();
            this.jpo = null;
        }
    }

    public void jpo(hx.jpo jpoVar) {
        this.jpo = new WeakReference<>(jpoVar);
    }
}
