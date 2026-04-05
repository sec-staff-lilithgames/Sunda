package com.bytedance.sdk.component.jd.jpo.jpo.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.oya;
import com.bytedance.sdk.component.jd.jpo.prr;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends oya {
    public static int jpo = -1;

    /* renamed from: cm, reason: collision with root package name */
    int f18583cm;

    /* renamed from: jd, reason: collision with root package name */
    HttpURLConnection f18584jd;
    String my;
    Cif wqx;

    public xyk(HttpURLConnection httpURLConnection, Cif cif) {
        this.f18583cm = jpo;
        this.f18584jd = httpURLConnection;
        this.wqx = cif;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            jj().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public boolean cm() {
        return wqx() >= 200 && wqx() < 300;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public long jd() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public prr jj() {
        zz zzVar;
        com.bytedance.sdk.component.wqx.jpo.jpo jpoVar;
        com.bytedance.sdk.component.wqx.jpo.jpo jpoVar2;
        Cif cif = this.wqx;
        if (cif != null && (jpoVar2 = cif.f18559jd) != null) {
            jpoVar2.ju();
        }
        try {
            try {
                zzVar = new zz(this.f18584jd);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.f18584jd;
                zzVar = new zz(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th2) {
            th2.getMessage();
            zzVar = null;
        }
        Cif cif2 = this.wqx;
        if (cif2 != null && (jpoVar = cif2.f18559jd) != null) {
            jpoVar.au();
        }
        return zzVar;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public long jpo() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public String my() throws IOException {
        return !TextUtils.isEmpty(this.my) ? this.my : this.f18584jd.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public com.bytedance.sdk.component.jd.jpo.jj qk() {
        if (this.f18584jd == null) {
            return new com.bytedance.sdk.component.jd.jpo.jj(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f18584jd.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || wqx() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.jd.jpo.jj((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public int wqx() {
        try {
            return this.f18584jd.getResponseCode();
        } catch (Exception unused) {
            return this.f18583cm;
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.oya
    public com.bytedance.sdk.component.jd.jpo.yd xyk() {
        if (zz() == null || zz().f18559jd == null) {
            return null;
        }
        return new com.bytedance.sdk.component.jd.jpo.yd(zz().f18559jd);
    }

    public Cif zz() {
        return this.wqx;
    }

    public xyk(int i10, String str, Cif cif) {
        this.my = str;
        this.wqx = cif;
        this.f18583cm = i10;
    }
}
