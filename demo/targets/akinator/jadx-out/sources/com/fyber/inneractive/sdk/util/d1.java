package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f26771a;

    public d1(Looper looper, com.fyber.inneractive.sdk.network.f fVar) {
        super(looper);
        this.f26771a = new WeakReference(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20, types: [org.json.JSONObject] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        String strL;
        super.handleMessage(message);
        e1 e1Var = (e1) v.a(this.f26771a);
        if (e1Var != null) {
            com.fyber.inneractive.sdk.network.f fVar = (com.fyber.inneractive.sdk.network.f) e1Var;
            int i10 = message.what;
            if (i10 == 12312329 || i10 == 20150330) {
                if (fVar.f24218f && fVar.f24213a.size() > 0) {
                    while (true) {
                        string = null;
                        if (fVar.f24213a.size() <= 0) {
                            break;
                        }
                        try {
                            string = (JSONObject) fVar.f24213a.poll();
                        } catch (Throwable unused) {
                        }
                        if (string != null) {
                            fVar.f24214b.put(string);
                        }
                    }
                    if (fVar.f24214b.length() > 0) {
                        JSONArray jSONArray = fVar.f24214b;
                        int i11 = com.fyber.inneractive.sdk.config.k.f23321a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (TextUtils.isEmpty(property)) {
                            strL = DtbConstants.HTTPS + IAConfigManager.O.f23214i.f23327f;
                        } else {
                            strL = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(property).matches() ? a.b.l(DtbConstants.HTTPS, property, "/simpleM2M/Event") : a.b.l(DtbConstants.HTTPS, property, ".inner-active.mobi/simpleM2M/Event");
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            string = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (string != null) {
                            IAConfigManager.O.f23224s.a(new com.fyber.inneractive.sdk.network.x0(new com.fyber.inneractive.sdk.network.e(strL, jSONArray, jCurrentTimeMillis), strL, string));
                        }
                        fVar.f24214b = new JSONArray();
                    }
                }
                d1 d1Var = fVar.f24216d;
                if (d1Var != null) {
                    d1Var.removeMessages(12312329);
                    long j10 = fVar.f24217e * 1000;
                    d1 d1Var2 = fVar.f24216d;
                    if (d1Var2 != null) {
                        d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j10));
                    }
                }
            }
        }
    }
}
