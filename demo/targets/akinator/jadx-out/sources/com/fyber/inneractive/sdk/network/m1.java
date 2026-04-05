package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f24256a;

    public m1(n1 n1Var) {
        this.f24256a = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String string;
        n1 n1Var = this.f24256a;
        t0 t0Var = (t0) com.fyber.inneractive.sdk.util.v.a(n1Var.f24258b);
        Thread thread = (Thread) com.fyber.inneractive.sdk.util.v.a(this.f24256a.f24257a);
        if (t0Var == null || t0Var.f24287f == i1.DONE || t0Var.f24287f == i1.RESOLVED) {
            return;
        }
        boolean zV = t0Var.v();
        IAlog.a("%s : NetworkWatchdogHolder : should report: %s", IAlog.a(n1.class), Boolean.valueOf(zV));
        if (zV) {
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                Exception exc = new Exception();
                exc.setStackTrace(stackTrace);
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                string = stringWriter.getBuffer().toString();
            } else {
                string = "";
            }
            String strR = t0Var.r();
            InneractiveAdRequest inneractiveAdRequest = t0Var instanceof q0 ? ((q0) t0Var).f24267p : null;
            com.fyber.inneractive.sdk.response.e eVar = t0Var instanceof f1 ? ((f1) t0Var).f24223s : null;
            u uVar = u.NETWORK_REQUEST_PASSED_ALLOWED_TIME;
            JSONArray jSONArrayB = t0Var.k() != null ? t0Var.k().b() : null;
            w wVar = new w(eVar);
            wVar.f24326c = uVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", strR);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", strR);
            }
            try {
                jSONObject.put("stack_trace", string);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
            }
            Integer numValueOf = Integer.valueOf(n1Var.f24259c);
            try {
                jSONObject.put("total_time", numValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "total_time", numValueOf);
            }
            wVar.f24329f.put(jSONObject);
            wVar.a((String) null);
        }
        IAlog.a("%s : NetworkWatchdogHolder should cancel by timeout: %d", IAlog.a(n1Var), Integer.valueOf(n1Var.f24259c));
        t0Var.d();
    }
}
