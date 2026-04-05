package com.bytedance.sdk.openadsdk.core.ju.cm;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.amazon.device.ads.DtbDeviceData;
import com.bytedance.adsdk.ugeno.cm.jj;
import com.bytedance.adsdk.ugeno.core.Cif;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.hna;
import com.bytedance.adsdk.ugeno.core.prr;
import com.bytedance.adsdk.ugeno.jd.wqx;
import com.bytedance.sdk.openadsdk.core.ju.qk.cm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements hna, prr {

    /* renamed from: cm, reason: collision with root package name */
    private hna f20476cm;

    /* renamed from: jd, reason: collision with root package name */
    private wqx<View> f20477jd;
    private final Context jpo;
    private InterfaceC0121jpo wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ju.cm.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0121jpo {
        void jpo(au auVar);
    }

    public jpo(Context context) {
        this.jpo = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(JSONObject jSONObject, JSONObject jSONObject2, cm cmVar) throws JSONException {
        try {
            Cif cif = new Cif(this.jpo);
            wqx<View> wqxVarJpo = cif.jpo(jSONObject);
            this.f20477jd = wqxVarJpo;
            if (wqxVarJpo == null) {
                if (cmVar != null) {
                    cmVar.jpo(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, "ugen render fail");
                    return;
                }
                return;
            }
            View viewJu = wqxVarJpo.ju();
            if (viewJu != null) {
                viewJu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ju.cm.jpo.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            cif.jpo((prr) this);
            cif.jpo((hna) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, com.bytedance.sdk.openadsdk.core.Cif.jd());
                    jSONObject2.put("os", "Android");
                } catch (JSONException unused) {
                }
            }
            cif.jd(jSONObject2);
            if (cmVar != null) {
                cmVar.jpo(this.f20477jd);
            }
        } catch (Exception e10) {
            if (cmVar != null) {
                cmVar.jpo(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, "ugen render fail exception is" + e10.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.prr
    public void jpo(wqx wqxVar, String str, jj.jpo jpoVar) {
    }

    public void jpo(final JSONObject jSONObject, final JSONObject jSONObject2, final cm cmVar) throws JSONException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jd(jSONObject, jSONObject2, cmVar);
        } else {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ju.cm.jpo.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    jpo.this.jd(jSONObject, jSONObject2, cmVar);
                }
            });
        }
    }

    public void jpo(InterfaceC0121jpo interfaceC0121jpo) {
        this.wqx = interfaceC0121jpo;
    }

    public void jpo(hna hnaVar) {
        this.f20476cm = hnaVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.prr
    public void jpo(au auVar, prr.jd jdVar, prr.jpo jpoVar) {
        InterfaceC0121jpo interfaceC0121jpo;
        if (auVar == null) {
            return;
        }
        if ((auVar.jd() == 1 || auVar.jd() == 4) && (interfaceC0121jpo = this.wqx) != null) {
            interfaceC0121jpo.jpo(auVar);
        }
        if (jdVar == null || auVar.cm() == null) {
            return;
        }
        jdVar.jpo(auVar.cm());
    }

    @Override // com.bytedance.adsdk.ugeno.core.hna
    public void jpo(wqx wqxVar, MotionEvent motionEvent) {
        hna hnaVar = this.f20476cm;
        if (hnaVar != null) {
            hnaVar.jpo(wqxVar, motionEvent);
        }
    }
}
