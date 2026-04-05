package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z {
    public static void a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        w wVar = new w(u.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put("description", str2);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "description", str2);
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
    }

    public static void a(Throwable th2, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        w wVar = new w(u.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        String string2 = th2.getClass().toString();
        try {
            jSONObject.put("exception_name", string2);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", string2);
        }
        String message = th2.getMessage();
        try {
            jSONObject.put("description", message);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "description", message);
        }
        try {
            jSONObject.put("stack_trace", string);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
    }
}
