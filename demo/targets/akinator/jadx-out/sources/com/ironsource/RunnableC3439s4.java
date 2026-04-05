package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC3439s4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f38367a;

    public RunnableC3439s4(JSONObject stringToSend) {
        kotlin.jvm.internal.e0.checkNotNullParameter(stringToSend, "stringToSend");
        this.f38367a = stringToSend;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException, IOException {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection uRLConnectionOpenConnection = new URL(C3422r4.d().f38281h).openConnection();
            kotlin.jvm.internal.e0.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(C3271ic.f36944b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", G5.L);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(this.f38367a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
            Log.i("MSG", httpURLConnection.getResponseMessage());
            httpURLConnection.disconnect();
            ironLog.verbose("sent crash report for type " + this.f38367a.get("crashType") + " and date " + this.f38367a.get("crashDate"));
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
