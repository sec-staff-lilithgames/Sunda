package de;

import android.net.Uri;
import com.google.android.exoplayer2.m1;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.n1;
import java.util.Map;
import nh.ej;
import qf.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f52141a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public m1 f52142b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.exoplayer2.drm.b f52143c;

    /* renamed from: d, reason: collision with root package name */
    public qf.o f52144d;

    /* renamed from: e, reason: collision with root package name */
    public String f52145e;

    public final com.google.android.exoplayer2.drm.b a(m1 m1Var) {
        qf.o userAgent = this.f52144d;
        if (userAgent == null) {
            userAgent = new z.a().setUserAgent(this.f52145e);
        }
        Uri uri = m1Var.f27686c;
        n0 n0Var = new n0(uri == null ? null : uri.toString(), m1Var.f27690h, userAgent);
        ej it = m1Var.f27687e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n0Var.setKeyRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        com.google.android.exoplayer2.drm.b bVarBuild = new d().setUuidAndExoMediaDrmProvider(m1Var.f27685b, com.google.android.exoplayer2.drm.f.f27433d).setMultiSession(m1Var.f27688f).setPlayClearSamplesWithoutKeys(m1Var.f27689g).setUseDrmSessionsForClearContent(rh.w.toArray(m1Var.f27691i)).build(n0Var);
        bVarBuild.setMode(0, m1Var.getKeySetId());
        return bVarBuild;
    }

    @Override // de.u
    public t get(u1 u1Var) {
        t tVar;
        com.google.android.exoplayer2.util.a.checkNotNull(u1Var.f28113c);
        m1 m1Var = u1Var.f28113c.f27862e;
        if (m1Var == null || n1.f28506a < 18) {
            return t.f52168a;
        }
        synchronized (this.f52141a) {
            try {
                if (!n1.areEqual(m1Var, this.f52142b)) {
                    this.f52142b = m1Var;
                    this.f52143c = a(m1Var);
                }
                tVar = (t) com.google.android.exoplayer2.util.a.checkNotNull(this.f52143c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    public void setDrmHttpDataSourceFactory(qf.o oVar) {
        this.f52144d = oVar;
    }

    @Deprecated
    public void setDrmUserAgent(String str) {
        this.f52145e = str;
    }
}
