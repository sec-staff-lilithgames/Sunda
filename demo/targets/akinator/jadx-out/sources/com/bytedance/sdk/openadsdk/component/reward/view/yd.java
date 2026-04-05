package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz.prr;
import com.bytedance.sdk.openadsdk.utils.va;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* renamed from: jd, reason: collision with root package name */
    Handler f20054jd;

    /* renamed from: jj, reason: collision with root package name */
    private final Activity f20055jj;
    com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jpo;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f20056ju;

    /* renamed from: qk, reason: collision with root package name */
    private final dt f20057qk;
    private final String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.reward.jpo.jpo f20058yd;
    private cm zz;
    boolean wqx = false;

    /* renamed from: cm, reason: collision with root package name */
    boolean f20053cm = false;
    boolean my = false;

    public yd(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.f20058yd = jpoVar;
        this.f20055jj = jpoVar.vrc;
        this.f20057qk = jpoVar.f19914jd;
        this.xyk = jpoVar.my;
    }

    public void au() {
        cm cmVar = this.zz;
        if (cmVar == null) {
            return;
        }
        cmVar.opi();
    }

    public boolean cm() {
        return this.f20053cm;
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m448if() {
        cm cmVar = this.zz;
        if (cmVar != null) {
            return cmVar.pdm instanceof com.bytedance.sdk.component.adexpress.my.jpo;
        }
        return false;
    }

    public FrameLayout jd() {
        cm cmVar = this.zz;
        if (cmVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = cmVar.getVideoFrameLayout();
        if (this.zz.rq()) {
            prr();
        }
        return videoFrameLayout;
    }

    public void jj() {
        if (this.f20056ju) {
            return;
        }
        this.f20056ju = true;
        cm cmVar = this.zz;
        if (cmVar != null) {
            cmVar.mo446if();
        }
        Handler handler = this.f20054jd;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void jpo(AdSlot adSlot, nmd nmdVar) {
        if (this.my) {
            return;
        }
        this.my = true;
        cm cmVar = new cm(this.f20058yd, adSlot, this.xyk);
        this.zz = cmVar;
        nmdVar.jpo(cmVar, cmVar.getVideoFrameLayout());
    }

    public int ju() {
        cm cmVar = this.zz;
        if (cmVar != null) {
            return cmVar.getDynamicShowType();
        }
        return 0;
    }

    public Handler my() {
        if (this.f20054jd == null) {
            this.f20054jd = new Handler(Looper.getMainLooper());
        }
        return this.f20054jd;
    }

    public void oya() {
        cm cmVar = this.zz;
        if (cmVar == null) {
            return;
        }
        cmVar.jr();
        this.zz.yd();
    }

    public void prr() {
        if (dt.my(this.f20057qk) && this.f20057qk.kb() == 3 && this.f20057qk.wu() == 0) {
            try {
                if (this.f20057qk.ll() == 1) {
                    int iJd = va.jd(sq.jpo(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.zz.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iJd;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void qk() {
        cm cmVar = this.zz;
        if (cmVar != null) {
            cmVar.yd();
        }
    }

    public boolean wqx() {
        return this.wqx;
    }

    public void xyk() {
        cm cmVar = this.zz;
        if (cmVar != null) {
            cmVar.ju();
        }
    }

    public boolean yd() {
        cm cmVar = this.zz;
        return cmVar != null && cmVar.dt();
    }

    public boolean zz() {
        cm cmVar = this.zz;
        if (cmVar == null) {
            return false;
        }
        return cmVar.rq();
    }

    public void jd(boolean z10) {
        this.f20053cm = z10;
    }

    public cm jpo() {
        return this.zz;
    }

    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jd(dt dtVar) {
        if (dtVar.pzk() == 4) {
            return com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this.f20055jj, this.xyk);
        }
        return null;
    }

    public void jpo(boolean z10) {
        this.wqx = z10;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.zz.zz zzVar, com.bytedance.sdk.openadsdk.core.zz.xyk xykVar) {
        dt dtVar;
        if (this.zz == null || (dtVar = this.f20057qk) == null) {
            return;
        }
        this.jpo = jd(dtVar);
        zzVar.jpo(this.zz);
        zzVar.jpo(this.jpo);
        this.zz.setClickListener(zzVar);
        xykVar.jpo((View) this.zz);
        xykVar.jpo(this.jpo);
        this.zz.setClickCreativeListener(xykVar);
    }

    public void jpo(prr prrVar) {
        cm cmVar = this.zz;
        if (cmVar == null) {
            return;
        }
        cmVar.setExpressVideoListenerProxy(prrVar);
    }

    public void jpo(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        cm cmVar = this.zz;
        if (cmVar == null) {
            return;
        }
        cmVar.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public JSONObject jpo(JSONObject jSONObject) {
        cm cmVar = this.zz;
        if (cmVar != null) {
            return cmVar.jpo(jSONObject, this.f20058yd.f19914jd);
        }
        return null;
    }

    public void jpo(int i10, boolean z10) {
        cm cmVar = this.zz;
        if (cmVar != null) {
            cmVar.jpo(i10, z10, false);
        }
    }

    public void jpo(int i10, String str) throws JSONException {
        cm cmVar = this.zz;
        if (cmVar != null) {
            cmVar.jd(i10, str);
        }
    }

    public void jpo(dt dtVar) {
        cm cmVar = this.zz;
        if (cmVar != null) {
            cmVar.jpo(dtVar, dtVar.gmx(), dtVar.my(), this.f20058yd.huv, !r1.f19927tl);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.f20058yd = jpoVar;
    }
}
