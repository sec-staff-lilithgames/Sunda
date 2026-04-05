package com.bytedance.sdk.component.adexpress.my;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    private WeakReference<jd> jpo;

    public wqx(jd jdVar) {
        this.jpo = new WeakReference<>(jdVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<jd> weakReference = this.jpo;
        return (weakReference == null || weakReference.get() == null) ? "" : this.jpo.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<jd> weakReference = this.jpo;
        return (weakReference == null || weakReference.get() == null) ? "" : this.jpo.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<jd> weakReference = this.jpo;
        return (weakReference == null || weakReference.get() == null) ? "" : this.jpo.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<jd> weakReference = this.jpo;
        return (weakReference == null || weakReference.get() == null) ? "" : this.jpo.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<jd> weakReference = this.jpo;
        return (weakReference == null || weakReference.get() == null) ? "" : this.jpo.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().initRenderFinish();
    }

    public void jpo(jd jdVar) {
        this.jpo = new WeakReference<>(jdVar);
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().jpo(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<jd> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().videoFrameChanged(str);
    }
}
