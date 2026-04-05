package com.bytedance.sdk.openadsdk.core.ju.zz;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.bytedance.adsdk.ugeno.cm.jj;
import com.bytedance.adsdk.ugeno.core.Cif;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.hna;
import com.bytedance.adsdk.ugeno.core.ju;
import com.bytedance.adsdk.ugeno.core.prr;
import com.bytedance.adsdk.ugeno.jd.wqx;
import com.bytedance.sdk.openadsdk.core.ju.qk.cm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo implements hna, prr {

    /* renamed from: jd, reason: collision with root package name */
    private Cif f20568jd;
    private Context jpo;
    private wqx wqx;

    public jpo(Context context) {
        this.jpo = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, cm cmVar) {
        this.f20568jd = new Cif(this.jpo);
        jpo();
        this.f20568jd.jpo((prr) this);
        this.f20568jd.jpo((hna) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (cmVar != null) {
                cmVar.jpo(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "template or data is null");
                return;
            }
            return;
        }
        try {
            wqx<View> wqxVarJpo = this.f20568jd.jpo(jSONObject, jSONObject2, jSONObject3);
            this.wqx = wqxVarJpo;
            if (wqxVarJpo != null) {
                cmVar.jpo(wqxVarJpo);
            } else if (cmVar != null) {
                cmVar.jpo(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (cmVar != null) {
                cmVar.jpo(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (cmVar != null) {
                cmVar.jpo(139, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (cmVar != null) {
                cmVar.jpo(138, "ugen render error");
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.prr
    public void jpo(au auVar, prr.jd jdVar, prr.jpo jpoVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.hna
    public void jpo(wqx wqxVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.prr
    public void jpo(wqx wqxVar, String str, jj.jpo jpoVar) {
    }

    public void jpo(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final cm cmVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jd(jSONObject, jSONObject2, jSONObject3, cmVar);
        } else {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ju.zz.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.jd(jSONObject, jSONObject2, jSONObject3, cmVar);
                }
            });
        }
    }

    private void jpo() {
        ju juVar = new ju();
        juVar.jpo(this.jpo);
        this.f20568jd.jpo(OIPXcgrVyyxoLF.mbTIIfWKNpgAxW, juVar);
    }
}
