package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.wqx.jpo;
import com.bytedance.sdk.openadsdk.utils.cm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGVideoMediaView extends PAGMediaView implements jpo.InterfaceC0135jpo {

    /* renamed from: cm, reason: collision with root package name */
    private dt f19470cm;

    /* renamed from: jd, reason: collision with root package name */
    private jj f19471jd;
    private final com.bytedance.sdk.openadsdk.jpo.jd.jpo wqx;

    public PAGVideoMediaView(Context context, View view, com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar) {
        super(context);
        jpo(view);
        this.wqx = jpoVar;
    }

    private boolean jd() {
        jj jjVar = this.f19471jd;
        if (jjVar != null) {
            return jjVar.au();
        }
        return false;
    }

    private void jpo(View view) {
        if (view instanceof jj) {
            jj jjVar = (jj) view;
            this.f19471jd = jjVar;
            addView(jjVar, -1, -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        jj jjVar = this.f19471jd;
        if (jjVar != null) {
            jjVar.hna();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo.InterfaceC0135jpo
    public long getVideoProgress() {
        jj jjVar = this.f19471jd;
        if (jjVar == null || jjVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.f19471jd.getNativeVideoController().jj();
    }

    public void handleInterruptVideo() {
        if (jd()) {
            return;
        }
        jpo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm.jpo(this, this.f19470cm);
    }

    public void setMaterialMeta(dt dtVar) {
        this.f19470cm = dtVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof jpo) {
            ((jpo) onClickListener).jpo((jpo.InterfaceC0135jpo) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.jpo.jd.jpo jpoVar = this.wqx;
        if (jpoVar == null) {
            return;
        }
        jpoVar.jpo(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void jpo() {
        jj jjVar = this.f19471jd;
        if (jjVar != null) {
            jjVar.prr();
        }
    }
}
