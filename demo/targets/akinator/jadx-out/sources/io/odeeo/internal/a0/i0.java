package io.odeeo.internal.a0;

import android.net.Uri;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.p0.m;
import io.odeeo.internal.u0.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends io.odeeo.internal.a0.a {

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.p0.m f62354g;

    /* renamed from: h, reason: collision with root package name */
    public final i.a f62355h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.b.t f62356i;

    /* renamed from: j, reason: collision with root package name */
    public final long f62357j;

    /* renamed from: k, reason: collision with root package name */
    public final io.odeeo.internal.p0.v f62358k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f62359l;

    /* renamed from: m, reason: collision with root package name */
    public final y0 f62360m;

    /* renamed from: n, reason: collision with root package name */
    public final io.odeeo.internal.b.z f62361n;

    /* renamed from: o, reason: collision with root package name */
    public io.odeeo.internal.p0.b0 f62362o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final i.a f62363a;

        /* renamed from: b, reason: collision with root package name */
        public io.odeeo.internal.p0.v f62364b = new io.odeeo.internal.p0.r();

        /* renamed from: c, reason: collision with root package name */
        public boolean f62365c = true;

        /* renamed from: d, reason: collision with root package name */
        public Object f62366d;

        /* renamed from: e, reason: collision with root package name */
        public String f62367e;

        public b(i.a aVar) {
            this.f62363a = (i.a) io.odeeo.internal.q0.a.checkNotNull(aVar);
        }

        public i0 createMediaSource(z.k kVar, long j10) {
            return new i0(this.f62367e, kVar, this.f62363a, j10, this.f62364b, this.f62365c, this.f62366d);
        }

        public b setLoadErrorHandlingPolicy(io.odeeo.internal.p0.v vVar) {
            if (vVar == null) {
                vVar = new io.odeeo.internal.p0.r();
            }
            this.f62364b = vVar;
            return this;
        }

        public b setTag(Object obj) {
            this.f62366d = obj;
            return this;
        }

        public b setTrackId(String str) {
            this.f62367e = str;
            return this;
        }

        public b setTreatLoadErrorsAsEndOfStream(boolean z10) {
            this.f62365c = z10;
            return this;
        }
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public r createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        return new h0(this.f62354g, this.f62355h, this.f62362o, this.f62356i, this.f62357j, this.f62358k, b(aVar), this.f62359l);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public io.odeeo.internal.b.z getMediaItem() {
        return this.f62361n;
    }

    @Override // io.odeeo.internal.a0.a
    public void prepareSourceInternal(io.odeeo.internal.p0.b0 b0Var) {
        this.f62362o = b0Var;
        a(this.f62360m);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void releasePeriod(r rVar) {
        ((h0) rVar).release();
    }

    public i0(String str, z.k kVar, i.a aVar, long j10, io.odeeo.internal.p0.v vVar, boolean z10, Object obj) {
        this.f62355h = aVar;
        this.f62357j = j10;
        this.f62358k = vVar;
        this.f62359l = z10;
        io.odeeo.internal.b.z zVarBuild = new z.c().setUri(Uri.EMPTY).setMediaId(kVar.f63185a.toString()).setSubtitleConfigurations(h1.of(kVar)).setTag(obj).build();
        this.f62361n = zVarBuild;
        this.f62356i = new t.b().setId(str).setSampleMimeType((String) io.odeeo.internal.t0.o.firstNonNull(kVar.f63186b, "text/x-unknown")).setLanguage(kVar.f63187c).setSelectionFlags(kVar.f63188d).setRoleFlags(kVar.f63189e).setLabel(kVar.f63190f).build();
        this.f62354g = new m.b().setUri(kVar.f63185a).setFlags(1).build();
        this.f62360m = new g0(j10, true, false, false, (Object) null, zVarBuild);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // io.odeeo.internal.a0.a
    public void releaseSourceInternal() {
    }
}
