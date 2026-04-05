package io.bidmachine.iab.vast;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f60487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f60488c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f60489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f60490f;

    public i(Context context, t tVar, u uVar, String str) {
        this.f60490f = tVar;
        this.f60487b = str;
        this.f60488c = uVar;
        this.f60489e = context;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        BufferedReader bufferedReader;
        u uVar = this.f60488c;
        t tVar = this.f60490f;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new URL(this.f60487b).openStream()));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    stringBuffer.append(line);
                    stringBuffer.append(System.getProperty("line.separator"));
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            bufferedReader.close();
            tVar.loadVideoWithData(this.f60489e, stringBuffer.toString(), uVar);
        } catch (Exception e11) {
            e = e11;
            bufferedReader2 = bufferedReader;
            e.e("VastRequest", e);
            tVar.sendVastSpecError(w.f60554b);
            tVar.e(qm.b.throwable("Exception during loading xml by url", e), uVar);
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }
}
