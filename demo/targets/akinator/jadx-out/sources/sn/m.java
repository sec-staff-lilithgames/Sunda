package sn;

import android.net.Uri;
import java.util.Map;
import nh.ej;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f86016a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public gn.h0 f86017b;

    /* renamed from: c, reason: collision with root package name */
    public l f86018c;

    /* renamed from: d, reason: collision with root package name */
    public ln.h f86019d;

    /* renamed from: e, reason: collision with root package name */
    public String f86020e;

    /* renamed from: f, reason: collision with root package name */
    public go.t f86021f;

    public final l a(gn.h0 h0Var) {
        ln.h userAgent = this.f86019d;
        if (userAgent == null) {
            userAgent = new ln.o().setUserAgent(this.f86020e);
        }
        Uri uri = h0Var.f57913b;
        n0 n0Var = new n0(uri == null ? null : uri.toString(), h0Var.f57917f, userAgent);
        ej it = h0Var.f57914c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n0Var.setKeyRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        e useDrmSessionsForClearContent = new e().setUuidAndExoMediaDrmProvider(h0Var.f57912a, m0.f86022d).setMultiSession(h0Var.f57915d).setPlayClearSamplesWithoutKeys(h0Var.f57916e).setUseDrmSessionsForClearContent(rh.w.toArray(h0Var.f57918g));
        go.t tVar = this.f86021f;
        if (tVar != null) {
            useDrmSessionsForClearContent.setLoadErrorHandlingPolicy(tVar);
        }
        l lVarBuild = useDrmSessionsForClearContent.build(n0Var);
        lVarBuild.setMode(0, h0Var.getKeySetId());
        return lVarBuild;
    }

    @Override // sn.w
    public v get(gn.p0 p0Var) {
        v vVar;
        io.bidmachine.media3.common.util.a.checkNotNull(p0Var.f58053b);
        gn.h0 h0Var = p0Var.f58053b.f57965c;
        if (h0Var == null) {
            return v.f86044a;
        }
        synchronized (this.f86016a) {
            try {
                if (!h0Var.equals(this.f86017b)) {
                    this.f86017b = h0Var;
                    this.f86018c = a(h0Var);
                }
                vVar = (v) io.bidmachine.media3.common.util.a.checkNotNull(this.f86018c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public void setDrmHttpDataSourceFactory(ln.h hVar) {
        this.f86019d = hVar;
    }

    public void setDrmLoadErrorHandlingPolicy(go.t tVar) {
        this.f86021f = tVar;
    }

    @Deprecated
    public void setDrmUserAgent(String str) {
        this.f86020e = str;
    }
}
