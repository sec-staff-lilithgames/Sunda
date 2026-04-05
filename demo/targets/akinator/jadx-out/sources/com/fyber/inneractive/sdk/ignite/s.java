package com.fyber.inneractive.sdk.ignite;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.v;
import com.fyber.inneractive.sdk.flow.w;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends IIgniteServiceCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final r f23997a;

    /* renamed from: b, reason: collision with root package name */
    public final c f23998b;

    public s(e eVar, c cVar) {
        this.f23997a = eVar;
        this.f23998b = cVar;
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).optString("taskId");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        JSONObject jSONObjectOptJSONObject;
        IAlog.a("InstallCallback onError %s", str);
        if (this.f23997a != null) {
            String strA = a(str);
            String strOptString = null;
            try {
                jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            } catch (Exception unused) {
            }
            String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(PglCryptUtils.KEY_MESSAGE) : null;
            try {
                JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    strOptString = jSONObjectOptJSONObject2.optString("code");
                }
            } catch (Exception unused2) {
            }
            this.f23997a.a(strA, strOptString2, strOptString);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
        JSONObject jSONObjectOptJSONObject;
        IAlog.a("InstallCallback onProgress %s", str);
        try {
            String strA = a(str);
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(NotificationCompat.CATEGORY_PROGRESS)) == null) {
                return;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("action");
            double dOptDouble = jSONObjectOptJSONObject.optDouble("value");
            r rVar = this.f23997a;
            if (rVar != null) {
                rVar.a(strA, iOptInt, dOptDouble);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to resolve progress data", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
        String strOptString;
        IAlog.a("InstallCallback onScheduled %s", str);
        try {
            String strA = a(str);
            try {
                strOptString = new JSONObject(str).getJSONObject("application").optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
            } catch (Exception unused) {
                strOptString = null;
            }
            r rVar = this.f23997a;
            if (rVar != null) {
                rVar.a(strA, strOptString);
            }
        } catch (Exception unused2) {
            IAlog.a("Failed to resolve taskId", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
        IAlog.a("InstallCallback onStart %s", str);
        if (this.f23997a != null) {
            this.f23997a.a(a(str));
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) throws JSONException {
        IAlog.a("InstallCallback onSuccess %s", str);
        if (this.f23997a != null) {
            this.f23997a.b(a(str));
            c cVar = this.f23998b;
            if (cVar != null) {
                h hVar = cVar.f23971b;
                String str2 = cVar.f23970a.f23975a;
                hVar.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    IAConfigManager.O.f23224s.a(new z0(new f(str2), str2));
                }
                g gVar = cVar.f23970a;
                w wVar = gVar.f23976b;
                m mVar = gVar.f23977c;
                v vVar = wVar.f23925h;
                u uVar = u.IGNITE_FLOW_INSTALL_DONE;
                if (mVar == null) {
                    mVar = m.SINGLE_TAP;
                }
                vVar.a(uVar, mVar);
            }
        }
    }
}
