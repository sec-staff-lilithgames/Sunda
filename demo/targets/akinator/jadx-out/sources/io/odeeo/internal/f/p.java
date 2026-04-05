package io.odeeo.internal.f;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.G5;
import io.odeeo.internal.f.m;
import io.odeeo.internal.p0.a0;
import io.odeeo.internal.p0.m;
import io.odeeo.internal.p0.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.u0.j1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final t.b f63943a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63944b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63945c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f63946d;

    public p(String str, t.b bVar) {
        this(str, false, bVar);
    }

    public static byte[] a(t.b bVar, String str, byte[] bArr, Map<String, String> map) throws s {
        a0 a0Var = new a0(bVar.createDataSource());
        io.odeeo.internal.p0.m mVarBuild = new m.b().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i10 = 0;
        io.odeeo.internal.p0.m mVarBuild2 = mVarBuild;
        while (true) {
            try {
                io.odeeo.internal.p0.k kVar = new io.odeeo.internal.p0.k(a0Var, mVarBuild2);
                try {
                    try {
                        return g0.toByteArray(kVar);
                    } catch (t.e e10) {
                        String strA = a(e10, i10);
                        if (strA == null) {
                            throw e10;
                        }
                        i10++;
                        mVarBuild2 = mVarBuild2.buildUpon().setUri(strA).build();
                        g0.closeQuietly(kVar);
                    }
                } finally {
                    g0.closeQuietly(kVar);
                }
            } catch (Exception e11) {
                throw new s(mVarBuild, (Uri) io.odeeo.internal.q0.a.checkNotNull(a0Var.getLastOpenedUri()), a0Var.getResponseHeaders(), a0Var.getBytesRead(), e11);
            }
        }
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.f63946d) {
            this.f63946d.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        io.odeeo.internal.q0.a.checkNotNull(str);
        synchronized (this.f63946d) {
            this.f63946d.remove(str);
        }
    }

    @Override // io.odeeo.internal.f.r
    public byte[] executeKeyRequest(UUID uuid, m.b bVar) throws s {
        String licenseServerUrl = bVar.getLicenseServerUrl();
        if (this.f63945c || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.f63944b;
        }
        if (TextUtils.isEmpty(licenseServerUrl)) {
            m.b bVar2 = new m.b();
            Uri uri = Uri.EMPTY;
            throw new s(bVar2.setUri(uri).build(), uri, j1.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = io.odeeo.internal.b.h.f62713e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : io.odeeo.internal.b.h.f62711c.equals(uuid) ? G5.L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f63946d) {
            map.putAll(this.f63946d);
        }
        return a(this.f63943a, licenseServerUrl, bVar.getData(), map);
    }

    @Override // io.odeeo.internal.f.r
    public byte[] executeProvisionRequest(UUID uuid, m.h hVar) throws s {
        return a(this.f63943a, hVar.getDefaultUrl() + "&signedRequest=" + g0.fromUtf8Bytes(hVar.getData()), null, Collections.EMPTY_MAP);
    }

    public void setKeyRequestProperty(String str, String str2) {
        io.odeeo.internal.q0.a.checkNotNull(str);
        io.odeeo.internal.q0.a.checkNotNull(str2);
        synchronized (this.f63946d) {
            this.f63946d.put(str, str2);
        }
    }

    public p(String str, boolean z10, t.b bVar) {
        io.odeeo.internal.q0.a.checkArgument((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f63943a = bVar;
        this.f63944b = str;
        this.f63945c = z10;
        this.f63946d = new HashMap();
    }

    public static String a(t.e eVar, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = eVar.f65728d;
        if ((i11 != 307 && i11 != 308) || i10 >= 5 || (map = eVar.f65730f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
