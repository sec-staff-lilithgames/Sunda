package com.mbridge.msdk.video.module.request;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.setting.h;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.request.a, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        if (com.google.android.gms.internal.play_billing.a.f(h.b()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String strB = j0.b(jSONObject.toString());
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                eVar.a("dvi", strB);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
