package com.bytedance.sdk.openadsdk.core.p000if.jpo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.utils.va;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jd {

    /* renamed from: cm, reason: collision with root package name */
    protected double f20404cm;

    /* renamed from: jd, reason: collision with root package name */
    protected final Context f20405jd;

    /* renamed from: jj, reason: collision with root package name */
    public jpo f20406jj;
    public int jpo;
    public int my;
    protected int wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public int f20407jd;
        public int jpo;
        public boolean wqx;
    }

    public jd(Context context, int i10, int i11) {
        this.wqx = 0;
        this.f20404cm = 0.0d;
        if (i11 > 0 && i10 > 0) {
            this.f20404cm = i10 / i11;
        }
        float fXyk = va.xyk(context);
        if (fXyk != 0.0f && i10 > 0) {
            this.wqx = (int) (i10 / fXyk);
        }
        this.f20405jd = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.p000if.jpo jpo(String str, File file, List<wqx> list);

    public void jpo(Exception exc, int i10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i10);
            com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public String jpo(String str, List<wqx> list) throws JSONException {
        int i10 = this.jpo;
        String strCm = null;
        if (i10 >= 5) {
            return null;
        }
        this.jpo = i10 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
            jdVarWqx.jd(str);
            com.bytedance.sdk.component.qk.jd jdVarJpo = jdVarWqx.jpo();
            strCm = jdVarJpo.cm();
            jdVarJpo.jpo();
            return strCm;
        } catch (Exception e10) {
            jpo(e10, 0);
            if (!list.isEmpty()) {
                wqx.jd((dt) null, list, com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strCm;
        }
    }
}
