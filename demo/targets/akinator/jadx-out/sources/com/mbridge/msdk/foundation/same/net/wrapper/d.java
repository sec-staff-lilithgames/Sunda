package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.p0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40870a = "d";

    private void a(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar.f40802b.f40827d == 204) {
            a(new JSONObject());
        } else {
            b(eVar);
        }
    }

    private void b(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        JSONObject jSONObject = eVar.f40803c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int iOptInt = jSONObject.optInt("status", -9999);
        if (iOptInt == -9999) {
            a(eVar.f40803c);
            return;
        }
        if (iOptInt == 1 || iOptInt == 200) {
            a(eVar.f40803c.optJSONObject("data"));
            return;
        }
        String strOptString = eVar.f40803c.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = "error message is null";
        }
        a(strOptString);
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        p0.b(f40870a, "errorCode = " + aVar.f40804a);
        a(com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(eVar);
        if (eVar.f40802b == null) {
            b(eVar);
        } else {
            a(eVar);
        }
    }
}
