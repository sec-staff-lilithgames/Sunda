package com.bytedance.sdk.openadsdk.core.zz;

import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: jd, reason: collision with root package name */
    private static int f21049jd;
    private static volatile cm wqx;
    private final List<my> jpo = new ArrayList();

    public static cm jpo() {
        if (wqx == null) {
            synchronized (cm.class) {
                try {
                    if (wqx == null) {
                        wqx = new cm();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return wqx;
    }

    public my jd() {
        my myVarRemove;
        if (wqx() > 0 && (myVarRemove = this.jpo.remove(0)) != null) {
            return myVarRemove;
        }
        return null;
    }

    public int wqx() {
        return this.jpo.size();
    }

    public void wqx(my myVar) {
        if (myVar == null || myVar.getWebView() == null) {
            return;
        }
        if (myVar.getParent() != null) {
            ((ViewGroup) myVar.getParent()).removeView(myVar);
        }
        try {
            myVar.removeAllViews();
            myVar.qk();
            myVar.setWebChromeClient(null);
            myVar.setWebViewClient(null);
            myVar.setDownloadListener(null);
            myVar.setDefaultTextEncodingName(C.UTF8_NAME);
            myVar.setAllowFileAccess(false);
            myVar.setJavaScriptEnabled(true);
            myVar.setCacheMode(-1);
            myVar.setDatabaseEnabled(true);
            myVar.setSupportZoom(false);
            myVar.getWebView().setLayerType(0, null);
            myVar.setBackgroundColor(0);
            myVar.getWebView().setHorizontalScrollBarEnabled(false);
            myVar.getWebView().setHorizontalScrollbarOverlay(false);
            myVar.getWebView().setVerticalScrollBarEnabled(false);
            myVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(myVar);
            myVar.oya();
            myVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void jd(my myVar) {
        if (myVar != null) {
            if (this.jpo.size() >= f21049jd) {
                myVar.hna();
            } else {
                if (this.jpo.contains(myVar)) {
                    return;
                }
                wqx(myVar);
                this.jpo.add(myVar);
            }
        }
    }

    public void jpo(my myVar) {
        if (myVar != null) {
            jd(myVar);
        }
    }
}
