package com.bytedance.sdk.openadsdk.tu;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements cm {

    /* renamed from: jd, reason: collision with root package name */
    private cm f21492jd;
    Handler jpo = null;

    public my(cm cmVar) {
        this.f21492jd = cmVar;
    }

    private Context xyk() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public Handler cm() {
        cm cmVar = this.f21492jd;
        if (cmVar != null && cmVar.qk() != null) {
            return this.f21492jd.cm();
        }
        Handler handler = new Handler(jpo("pag_strategy", -1).getLooper());
        this.jpo = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public Context jd() {
        cm cmVar = this.f21492jd;
        return (cmVar == null || cmVar.jd() == null) ? xyk() : this.f21492jd.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public JSONObject jj() {
        cm cmVar = this.f21492jd;
        if (cmVar != null) {
            return cmVar.jj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public ExecutorService jpo() {
        cm cmVar = this.f21492jd;
        return (cmVar == null || cmVar.jpo() == null) ? Executors.newCachedThreadPool() : this.f21492jd.jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public String my() {
        cm cmVar = this.f21492jd;
        if (cmVar != null) {
            return cmVar.my();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public Map<String, String> qk() {
        cm cmVar = this.f21492jd;
        return (cmVar == null || cmVar.qk() == null) ? new HashMap() : this.f21492jd.qk();
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public String wqx() {
        cm cmVar = this.f21492jd;
        return (cmVar == null || TextUtils.isEmpty(cmVar.wqx())) ? AbstractJsonLexerKt.NULL : this.f21492jd.wqx();
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public JSONObject jpo(JSONObject jSONObject) {
        cm cmVar = this.f21492jd;
        return cmVar != null ? cmVar.jpo(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.tu.cm
    public HandlerThread jpo(String str, int i10) {
        HandlerThread handlerThreadJpo;
        cm cmVar = this.f21492jd;
        if (cmVar != null && (handlerThreadJpo = cmVar.jpo(str, i10)) != null) {
            return handlerThreadJpo;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
