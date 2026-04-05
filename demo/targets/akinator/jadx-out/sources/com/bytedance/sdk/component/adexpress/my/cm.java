package com.bytedance.sdk.component.adexpress.my;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.jpo.nmd;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    private WeakReference<nmd> jpo;

    public cm(nmd nmdVar) {
        this.jpo = new WeakReference<>(nmdVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<nmd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().invokeMethod(str);
    }

    public void jpo(nmd nmdVar) {
        this.jpo = new WeakReference<>(nmdVar);
    }
}
