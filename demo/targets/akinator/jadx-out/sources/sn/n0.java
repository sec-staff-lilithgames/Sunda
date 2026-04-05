package sn;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.G5;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import io.bidmachine.media3.common.util.a1;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import ln.m;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final ln.h f86027a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86028b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86029c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f86030d;

    public n0(String str, ln.h hVar) {
        this(str, false, hVar);
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.f86030d) {
            this.f86030d.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        io.bidmachine.media3.common.util.a.checkNotNull(str);
        synchronized (this.f86030d) {
            this.f86030d.remove(str);
        }
    }

    @Override // sn.p0
    public byte[] executeProvisionRequest(UUID uuid, h0 h0Var) throws q0 {
        return y.executePost(this.f86027a.createDataSource(), h0Var.getDefaultUrl() + "&signedRequest=" + a1.fromUtf8Bytes(h0Var.getData()), null, Collections.EMPTY_MAP);
    }

    public void setKeyRequestProperty(String str, String str2) {
        io.bidmachine.media3.common.util.a.checkNotNull(str);
        io.bidmachine.media3.common.util.a.checkNotNull(str2);
        synchronized (this.f86030d) {
            this.f86030d.put(str, str2);
        }
    }

    public n0(String str, boolean z10, ln.h hVar) {
        io.bidmachine.media3.common.util.a.checkArgument((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f86027a = hVar;
        this.f86028b = str;
        this.f86029c = z10;
        this.f86030d = new HashMap();
    }

    @Override // sn.p0
    public byte[] executeKeyRequest(UUID uuid, b0 b0Var) throws q0 {
        String str;
        String licenseServerUrl = b0Var.getLicenseServerUrl();
        if (this.f86029c || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.f86028b;
        }
        if (!TextUtils.isEmpty(licenseServerUrl)) {
            HashMap map = new HashMap();
            UUID uuid2 = gn.l.f57988e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (gn.l.f57986c.equals(uuid)) {
                str = G5.L;
            } else {
                str = "application/octet-stream";
            }
            map.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f86030d) {
                map.putAll(this.f86030d);
            }
            return y.executePost(this.f86027a.createDataSource(), licenseServerUrl, b0Var.getData(), map);
        }
        m.a aVar = new m.a();
        Uri uri = Uri.EMPTY;
        throw new q0(aVar.setUri(uri).build(), uri, m5.of(), 0L, new IllegalStateException(wHkgq.owhuWrJSpZ));
    }
}
