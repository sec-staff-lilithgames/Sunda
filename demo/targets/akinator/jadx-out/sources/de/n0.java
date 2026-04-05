package de;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.n1;
import com.ironsource.G5;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nh.m5;
import qf.a1;
import qf.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final qf.o f52152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52153b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52154c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f52155d;

    public n0(String str, qf.o oVar) {
        this(str, false, oVar);
    }

    public static byte[] a(qf.o oVar, String str, byte[] bArr, Map map) throws q0 {
        Map map2;
        List list;
        a1 a1Var = new a1(oVar.createDataSource());
        qf.t tVarBuild = new t.a().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i10 = 0;
        int i11 = 0;
        qf.t tVarBuild2 = tVarBuild;
        while (true) {
            try {
                qf.r rVar = new qf.r(a1Var, tVarBuild2);
                try {
                    try {
                        return n1.toByteArray(rVar);
                    } catch (qf.h0 e10) {
                        int i12 = e10.f82945e;
                        String str2 = null;
                        if ((i12 == 307 || i12 == 308) && i11 < 5 && (map2 = e10.f82946f) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i10);
                        }
                        if (str2 == null) {
                            throw e10;
                        }
                        i11++;
                        tVarBuild2 = tVarBuild2.buildUpon().setUri(str2).build();
                        n1.closeQuietly(rVar);
                    }
                } finally {
                    n1.closeQuietly(rVar);
                }
            } catch (Exception e11) {
                throw new q0(tVarBuild, (Uri) com.google.android.exoplayer2.util.a.checkNotNull(a1Var.getLastOpenedUri()), a1Var.getResponseHeaders(), a1Var.getBytesRead(), e11);
            }
        }
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.f52155d) {
            this.f52155d.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        com.google.android.exoplayer2.util.a.checkNotNull(str);
        synchronized (this.f52155d) {
            this.f52155d.remove(str);
        }
    }

    @Override // de.p0
    public byte[] executeKeyRequest(UUID uuid, a0 a0Var) throws q0 {
        String licenseServerUrl = a0Var.getLicenseServerUrl();
        if (this.f52154c || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.f52153b;
        }
        if (TextUtils.isEmpty(licenseServerUrl)) {
            t.a aVar = new t.a();
            Uri uri = Uri.EMPTY;
            throw new q0(aVar.setUri(uri).build(), uri, m5.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = com.google.android.exoplayer2.j.f27538e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : com.google.android.exoplayer2.j.f27536c.equals(uuid) ? G5.L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f52155d) {
            map.putAll(this.f52155d);
        }
        return a(this.f52152a, licenseServerUrl, a0Var.getData(), map);
    }

    @Override // de.p0
    public byte[] executeProvisionRequest(UUID uuid, g0 g0Var) throws q0 {
        return a(this.f52152a, g0Var.getDefaultUrl() + "&signedRequest=" + n1.fromUtf8Bytes(g0Var.getData()), null, Collections.EMPTY_MAP);
    }

    public void setKeyRequestProperty(String str, String str2) {
        com.google.android.exoplayer2.util.a.checkNotNull(str);
        com.google.android.exoplayer2.util.a.checkNotNull(str2);
        synchronized (this.f52155d) {
            this.f52155d.put(str, str2);
        }
    }

    public n0(String str, boolean z10, qf.o oVar) {
        com.google.android.exoplayer2.util.a.checkArgument((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f52152a = oVar;
        this.f52153b = str;
        this.f52154c = z10;
        this.f52155d = new HashMap();
    }
}
