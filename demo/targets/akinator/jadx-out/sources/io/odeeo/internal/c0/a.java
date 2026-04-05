package io.odeeo.internal.c0;

import android.net.Uri;
import io.odeeo.internal.a0.n;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p0.a0;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.p0.m;
import io.odeeo.internal.p0.w;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements w.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f63298a = n.getNewId();

    /* renamed from: b, reason: collision with root package name */
    public final m f63299b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63300c;

    /* renamed from: d, reason: collision with root package name */
    public final t f63301d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63302e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f63303f;

    /* renamed from: g, reason: collision with root package name */
    public final long f63304g;

    /* renamed from: h, reason: collision with root package name */
    public final long f63305h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f63306i;

    public a(i iVar, m mVar, int i10, t tVar, int i11, Object obj, long j10, long j11) {
        this.f63306i = new a0(iVar);
        this.f63299b = (m) io.odeeo.internal.q0.a.checkNotNull(mVar);
        this.f63300c = i10;
        this.f63301d = tVar;
        this.f63302e = i11;
        this.f63303f = obj;
        this.f63304g = j10;
        this.f63305h = j11;
    }

    public final long bytesLoaded() {
        return this.f63306i.getBytesRead();
    }

    @Override // io.odeeo.internal.p0.w.e
    public abstract /* synthetic */ void cancelLoad();

    public final long getDurationUs() {
        return this.f63305h - this.f63304g;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.f63306i.getLastResponseHeaders();
    }

    public final Uri getUri() {
        return this.f63306i.getLastOpenedUri();
    }

    @Override // io.odeeo.internal.p0.w.e
    public abstract /* synthetic */ void load() throws IOException;
}
