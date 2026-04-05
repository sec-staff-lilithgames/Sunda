package io.odeeo.internal.f;

import android.net.Uri;
import io.odeeo.internal.b.z;
import io.odeeo.internal.f.c;
import io.odeeo.internal.p0.q;
import io.odeeo.internal.p0.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.u0.q3;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f63903a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public z.f f63904b;

    /* renamed from: c, reason: collision with root package name */
    public h f63905c;

    /* renamed from: d, reason: collision with root package name */
    public t.b f63906d;

    /* renamed from: e, reason: collision with root package name */
    public String f63907e;

    public final h a(z.f fVar) {
        t.b userAgent = this.f63906d;
        if (userAgent == null) {
            userAgent = new q.b().setUserAgent(this.f63907e);
        }
        Uri uri = fVar.f63147c;
        p pVar = new p(uri == null ? null : uri.toString(), fVar.f63152h, userAgent);
        q3<Map.Entry<String, String>> it = fVar.f63149e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            pVar.setKeyRequestProperty(next.getKey(), next.getValue());
        }
        c cVarBuild = new c.b().setUuidAndExoMediaDrmProvider(fVar.f63145a, o.f63939d).setMultiSession(fVar.f63150f).setPlayClearSamplesWithoutKeys(fVar.f63151g).setUseDrmSessionsForClearContent(io.odeeo.internal.w0.d.toArray(fVar.f63154j)).build(pVar);
        cVarBuild.setMode(0, fVar.getKeySetId());
        return cVarBuild;
    }

    @Override // io.odeeo.internal.f.i
    public h get(z zVar) {
        h hVar;
        io.odeeo.internal.q0.a.checkNotNull(zVar.f63110b);
        z.f fVar = zVar.f63110b.f63178c;
        if (fVar == null || g0.f65861a < 18) {
            return h.f63923a;
        }
        synchronized (this.f63903a) {
            try {
                if (!g0.areEqual(fVar, this.f63904b)) {
                    this.f63904b = fVar;
                    this.f63905c = a(fVar);
                }
                hVar = (h) io.odeeo.internal.q0.a.checkNotNull(this.f63905c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public void setDrmHttpDataSourceFactory(t.b bVar) {
        this.f63906d = bVar;
    }

    public void setDrmUserAgent(String str) {
        this.f63907e = str;
    }
}
