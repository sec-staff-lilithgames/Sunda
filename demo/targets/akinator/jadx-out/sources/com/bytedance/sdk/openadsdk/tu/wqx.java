package com.bytedance.sdk.openadsdk.tu;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3271ic;
import com.ironsource.G5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private jpo f21493cm;

    /* renamed from: jd, reason: collision with root package name */
    private jd f21494jd;
    private cm wqx;
    private final String jpo = "StrategyCenter";
    private int my = 0;

    /* renamed from: jj, reason: collision with root package name */
    private Runnable f21495jj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tu.wqx.2
        @Override // java.lang.Runnable
        public void run() {
            wqx.this.jd();
        }
    };

    public wqx(cm cmVar) {
        this.f21494jd = null;
        my myVar = new my(cmVar);
        this.wqx = myVar;
        String strWqx = myVar.wqx();
        if (!TextUtils.isEmpty(strWqx) && !strWqx.startsWith("pag")) {
            strWqx = "pag_".concat(strWqx);
        }
        this.f21494jd = new jd(this.wqx.jd(), strWqx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd() {
        cm cmVar = this.wqx;
        if (cmVar == null || cmVar.my() == null || this.wqx.jj() == null) {
            return;
        }
        this.wqx.jpo().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tu.wqx.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                wqx.this.my++;
                try {
                    if (wqx.this.f21493cm != null) {
                        wqx.this.f21493cm.jpo();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(wqx.this.wqx.my()).openConnection();
                    if (wqx.this.wqx.qk() != null && wqx.this.wqx.qk().size() > 0) {
                        for (Map.Entry<String, String> entry : wqx.this.wqx.qk().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod(C3271ic.f36944b);
                    httpURLConnection.setRequestProperty("Content-Type", G5.L);
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(wqx.this.wqx.jj().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectJpo = wqx.this.wqx.jpo(new JSONObject(stringBuffer.toString()));
                                wqx.this.f21494jd.jpo();
                                wqx.this.f21494jd.jpo(jSONObjectJpo);
                                if (wqx.this.f21493cm != null) {
                                    wqx.this.f21493cm.jd();
                                }
                            } else if (wqx.this.f21493cm != null) {
                                wqx.this.f21493cm.jpo(responseCode, httpURLConnection.getResponseMessage());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = null;
                    }
                } catch (Throwable th4) {
                    Log.e("StrategyCenter", th4.getMessage() == null ? "error " : th4.getMessage());
                    if (wqx.this.f21493cm != null) {
                        wqx.this.f21493cm.jpo(-1, th4.getMessage());
                    }
                }
                wqx.this.f21494jd.jpo("local_last_update_time", System.currentTimeMillis());
                wqx.this.jpo();
            }
        });
    }

    public void jpo(jpo jpoVar) {
        this.f21493cm = jpoVar;
    }

    public void jpo() {
        if (this.wqx != null) {
            int i10 = 3600000;
            int iJpo = this.f21494jd.jpo("req_interval", 3600000);
            long j10 = 0;
            long jJd = this.f21494jd.jd("local_last_update_time", 0L);
            if (iJpo >= 600000 && iJpo <= 86400000) {
                i10 = iJpo;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jJd;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j11 = i10;
                if (jCurrentTimeMillis <= j11) {
                    j10 = j11 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j10)));
            this.wqx.cm().removeCallbacks(this.f21495jj);
            if (this.my > 24) {
                return;
            }
            this.wqx.cm().postDelayed(this.f21495jj, j10);
        }
    }

    public int jpo(String str, int i10) {
        jd jdVar = this.f21494jd;
        return jdVar == null ? i10 : jdVar.jpo(str, i10);
    }

    public String jpo(String str, String str2) {
        jd jdVar = this.f21494jd;
        return jdVar == null ? str2 : jdVar.jpo(str, str2);
    }

    public boolean jpo(String str, boolean z10) {
        jd jdVar = this.f21494jd;
        return jdVar == null ? z10 : jdVar.jpo(str, z10);
    }
}
