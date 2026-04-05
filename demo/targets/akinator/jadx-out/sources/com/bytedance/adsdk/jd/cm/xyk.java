package com.bytedance.adsdk.jd.cm;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.jd.Cif;
import com.ironsource.G5;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: jd, reason: collision with root package name */
    private final jj f17230jd;
    private final qk jpo;

    public xyk(qk qkVar, jj jjVar) {
        this.jpo = qkVar;
        this.f17230jd = jjVar;
    }

    private com.bytedance.adsdk.jd.qk jd(Context context, String str, String str2) {
        qk qkVar;
        Pair<wqx, InputStream> pairJpo;
        if (str2 == null || (qkVar = this.jpo) == null || (pairJpo = qkVar.jpo(str)) == null) {
            return null;
        }
        wqx wqxVar = (wqx) pairJpo.first;
        InputStream inputStream = (InputStream) pairJpo.second;
        Cif<com.bytedance.adsdk.jd.qk> cifJpo = wqxVar == wqx.ZIP ? com.bytedance.adsdk.jd.xyk.jpo(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.jd.xyk.jd(inputStream, str2);
        if (cifJpo.jpo() != null) {
            return cifJpo.jpo();
        }
        return null;
    }

    private Cif<com.bytedance.adsdk.jd.qk> wqx(Context context, String str, String str2) throws IOException {
        Closeable closeable = null;
        try {
            try {
                cm cmVarJpo = this.f17230jd.jpo(str);
                if (!cmVarJpo.jpo()) {
                    Cif<com.bytedance.adsdk.jd.qk> cif = new Cif<>(new IllegalArgumentException(cmVarJpo.cm()));
                    try {
                        cmVarJpo.close();
                    } catch (IOException unused) {
                    }
                    return cif;
                }
                Cif<com.bytedance.adsdk.jd.qk> cifJpo = jpo(context, str, cmVarJpo.jd(), cmVarJpo.wqx(), str2);
                cifJpo.jpo();
                try {
                    cmVarJpo.close();
                } catch (IOException unused2) {
                }
                return cifJpo;
            } finally {
            }
        } catch (Exception e10) {
            Cif<com.bytedance.adsdk.jd.qk> cif2 = new Cif<>(e10);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused3) {
                }
            }
            return cif2;
        }
    }

    public Cif<com.bytedance.adsdk.jd.qk> jpo(Context context, String str, String str2) {
        com.bytedance.adsdk.jd.qk qkVarJd = jd(context, str, str2);
        return qkVarJd != null ? new Cif<>(qkVarJd) : wqx(context, str, str2);
    }

    private Cif<com.bytedance.adsdk.jd.qk> jpo(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        Cif<com.bytedance.adsdk.jd.qk> cifJpo;
        wqx wqxVar;
        qk qkVar;
        if (str2 == null) {
            str2 = G5.L;
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            wqxVar = wqx.JSON;
            cifJpo = jpo(str, inputStream, str3);
        } else {
            wqx wqxVar2 = wqx.ZIP;
            cifJpo = jpo(context, str, inputStream, str3);
            wqxVar = wqxVar2;
        }
        if (str3 != null && cifJpo.jpo() != null && (qkVar = this.jpo) != null) {
            qkVar.jpo(str, wqxVar);
        }
        return cifJpo;
    }

    private Cif<com.bytedance.adsdk.jd.qk> jpo(Context context, String str, InputStream inputStream, String str2) throws IOException {
        qk qkVar;
        if (str2 != null && (qkVar = this.jpo) != null) {
            return com.bytedance.adsdk.jd.xyk.jpo(context, new ZipInputStream(new FileInputStream(qkVar.jpo(str, inputStream, wqx.ZIP))), str);
        }
        return com.bytedance.adsdk.jd.xyk.jpo(context, new ZipInputStream(inputStream), (String) null);
    }

    private Cif<com.bytedance.adsdk.jd.qk> jpo(String str, InputStream inputStream, String str2) throws IOException {
        qk qkVar;
        if (str2 != null && (qkVar = this.jpo) != null) {
            return com.bytedance.adsdk.jd.xyk.jd(new FileInputStream(qkVar.jpo(str, inputStream, wqx.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.jd.xyk.jd(inputStream, (String) null);
    }
}
