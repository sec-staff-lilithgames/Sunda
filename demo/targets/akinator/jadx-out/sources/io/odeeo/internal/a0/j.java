package io.odeeo.internal.a0;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.a0;
import io.odeeo.internal.a0.i0;
import io.odeeo.internal.a0.j;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.z;
import io.odeeo.internal.g.h;
import io.odeeo.internal.g.v;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.p0.p;
import io.odeeo.internal.p0.t;
import io.odeeo.internal.u0.h1;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements v {

    /* renamed from: b, reason: collision with root package name */
    public final i.a f62368b;

    /* renamed from: c, reason: collision with root package name */
    public final b f62369c;

    /* renamed from: d, reason: collision with root package name */
    public a f62370d;

    /* renamed from: e, reason: collision with root package name */
    public io.odeeo.internal.o0.a f62371e;

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.p0.v f62372f;

    /* renamed from: g, reason: collision with root package name */
    public long f62373g;

    /* renamed from: h, reason: collision with root package name */
    public long f62374h;

    /* renamed from: i, reason: collision with root package name */
    public long f62375i;

    /* renamed from: j, reason: collision with root package name */
    public float f62376j;

    /* renamed from: k, reason: collision with root package name */
    public float f62377k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f62378l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        io.odeeo.internal.b0.b getAdsLoader(z.b bVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final i.a f62379a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.g.l f62380b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<Integer, io.odeeo.internal.t0.b0<v>> f62381c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        public final Set<Integer> f62382d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        public final Map<Integer, v> f62383e = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        public t.b f62384f;

        /* renamed from: g, reason: collision with root package name */
        public String f62385g;

        /* renamed from: h, reason: collision with root package name */
        public io.odeeo.internal.f.h f62386h;

        /* renamed from: i, reason: collision with root package name */
        public io.odeeo.internal.f.i f62387i;

        /* renamed from: j, reason: collision with root package name */
        public io.odeeo.internal.p0.v f62388j;

        /* renamed from: k, reason: collision with root package name */
        public List<Object> f62389k;

        public b(i.a aVar, io.odeeo.internal.g.l lVar) {
            this.f62379a = aVar;
            this.f62380b = lVar;
        }

        public v getMediaSourceFactory(int i10) {
            v vVar = this.f62383e.get(Integer.valueOf(i10));
            if (vVar != null) {
                return vVar;
            }
            io.odeeo.internal.t0.b0<v> b0VarA = a(i10);
            if (b0VarA == null) {
                return null;
            }
            v vVar2 = b0VarA.get();
            t.b bVar = this.f62384f;
            if (bVar != null) {
                vVar2.setDrmHttpDataSourceFactory(bVar);
            }
            String str = this.f62385g;
            if (str != null) {
                vVar2.setDrmUserAgent(str);
            }
            io.odeeo.internal.f.h hVar = this.f62386h;
            if (hVar != null) {
                vVar2.setDrmSessionManager(hVar);
            }
            io.odeeo.internal.f.i iVar = this.f62387i;
            if (iVar != null) {
                vVar2.setDrmSessionManagerProvider(iVar);
            }
            io.odeeo.internal.p0.v vVar3 = this.f62388j;
            if (vVar3 != null) {
                vVar2.setLoadErrorHandlingPolicy(vVar3);
            }
            List<Object> list = this.f62389k;
            if (list != null) {
                vVar2.setStreamKeys(list);
            }
            this.f62383e.put(Integer.valueOf(i10), vVar2);
            return vVar2;
        }

        public int[] getSupportedTypes() {
            a();
            return io.odeeo.internal.w0.d.toArray(this.f62382d);
        }

        public void setDrmHttpDataSourceFactory(t.b bVar) {
            this.f62384f = bVar;
            Iterator<v> it = this.f62383e.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmHttpDataSourceFactory(bVar);
            }
        }

        public void setDrmSessionManager(io.odeeo.internal.f.h hVar) {
            this.f62386h = hVar;
            Iterator<v> it = this.f62383e.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManager(hVar);
            }
        }

        public void setDrmSessionManagerProvider(io.odeeo.internal.f.i iVar) {
            this.f62387i = iVar;
            Iterator<v> it = this.f62383e.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(iVar);
            }
        }

        public void setDrmUserAgent(String str) {
            this.f62385g = str;
            Iterator<v> it = this.f62383e.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmUserAgent(str);
            }
        }

        public void setLoadErrorHandlingPolicy(io.odeeo.internal.p0.v vVar) {
            this.f62388j = vVar;
            Iterator<v> it = this.f62383e.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(vVar);
            }
        }

        public void setStreamKeys(List<Object> list) {
            this.f62389k = list;
            Iterator<v> it = this.f62383e.values().iterator();
            while (it.hasNext()) {
                it.next().setStreamKeys(list);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ v b(Class cls) {
            return j.b((Class<? extends v>) cls, this.f62379a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ v c(Class cls) {
            return j.b((Class<? extends v>) cls, this.f62379a);
        }

        public final void a() {
            a(0);
            a(1);
            a(2);
            a(3);
            a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ v b() {
            return new a0.b(this.f62379a, this.f62380b);
        }

        public final io.odeeo.internal.t0.b0<v> a(int i10) {
            io.odeeo.internal.t0.b0 dVar;
            io.odeeo.internal.t0.b0 dVar2;
            if (this.f62381c.containsKey(Integer.valueOf(i10))) {
                return this.f62381c.get(Integer.valueOf(i10));
            }
            final int i11 = 2;
            if (i10 != 0) {
                final int i12 = 1;
                if (i10 != 1) {
                    final int i13 = 0;
                    if (i10 == 2) {
                        final Class<? extends U> clsAsSubclass = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(v.class);
                        dVar2 = new io.odeeo.internal.t0.b0(this) { // from class: hs.e

                            /* renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ j.b f59153c;

                            {
                                this.f59153c = this;
                            }

                            @Override // io.odeeo.internal.t0.b0
                            public final Object get() {
                                switch (i13) {
                                    case 0:
                                        return this.f59153c.c(clsAsSubclass);
                                    case 1:
                                        return this.f59153c.b(clsAsSubclass);
                                    default:
                                        return this.f59153c.a(clsAsSubclass);
                                }
                            }
                        };
                    } else if (i10 != 3) {
                        dVar = i10 != 4 ? null : new hs.d(this, i13);
                    } else {
                        dVar2 = new hs.d(Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(v.class), i12);
                    }
                } else {
                    final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(v.class);
                    dVar2 = new io.odeeo.internal.t0.b0(this) { // from class: hs.e

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ j.b f59153c;

                        {
                            this.f59153c = this;
                        }

                        @Override // io.odeeo.internal.t0.b0
                        public final Object get() {
                            switch (i12) {
                                case 0:
                                    return this.f59153c.c(clsAsSubclass2);
                                case 1:
                                    return this.f59153c.b(clsAsSubclass2);
                                default:
                                    return this.f59153c.a(clsAsSubclass2);
                            }
                        }
                    };
                }
                dVar = dVar2;
            } else {
                final Class<? extends U> clsAsSubclass3 = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(v.class);
                dVar = new io.odeeo.internal.t0.b0(this) { // from class: hs.e

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ j.b f59153c;

                    {
                        this.f59153c = this;
                    }

                    @Override // io.odeeo.internal.t0.b0
                    public final Object get() {
                        switch (i11) {
                            case 0:
                                return this.f59153c.c(clsAsSubclass3);
                            case 1:
                                return this.f59153c.b(clsAsSubclass3);
                            default:
                                return this.f59153c.a(clsAsSubclass3);
                        }
                    }
                };
            }
            this.f62381c.put(Integer.valueOf(i10), dVar);
            if (dVar != null) {
                this.f62382d.add(Integer.valueOf(i10));
            }
            return dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ v a(Class cls) {
            return j.b((Class<? extends v>) cls, this.f62379a);
        }
    }

    public j(Context context) {
        this(new p.a(context));
    }

    public final t b(io.odeeo.internal.b.z zVar, t tVar) {
        io.odeeo.internal.q0.a.checkNotNull(zVar.f63110b);
        z.b bVar = zVar.f63110b.f63179d;
        if (bVar == null) {
            return tVar;
        }
        a aVar = this.f62370d;
        io.odeeo.internal.o0.a aVar2 = this.f62371e;
        if (aVar == null || aVar2 == null) {
            io.odeeo.internal.q0.p.w("DefaultMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return tVar;
        }
        io.odeeo.internal.b0.b adsLoader = aVar.getAdsLoader(bVar);
        if (adsLoader == null) {
            io.odeeo.internal.q0.p.w("DefaultMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
            return tVar;
        }
        io.odeeo.internal.p0.m mVar = new io.odeeo.internal.p0.m(bVar.f63116a);
        Object objOf = bVar.f63117b;
        if (objOf == null) {
            objOf = h1.of((Uri) zVar.f63109a, zVar.f63110b.f63176a, bVar.f63116a);
        }
        return new io.odeeo.internal.b0.c(tVar, mVar, objOf, this, adsLoader, aVar2);
    }

    @Override // io.odeeo.internal.a0.v
    @Deprecated
    public /* bridge */ /* synthetic */ t createMediaSource(Uri uri) {
        return super.createMediaSource(uri);
    }

    public j experimentalUseProgressiveMediaSourceForSubtitles(boolean z10) {
        this.f62378l = z10;
        return this;
    }

    @Override // io.odeeo.internal.a0.v
    public int[] getSupportedTypes() {
        return this.f62369c.getSupportedTypes();
    }

    public j setAdViewProvider(io.odeeo.internal.o0.a aVar) {
        this.f62371e = aVar;
        return this;
    }

    public j setAdsLoaderProvider(a aVar) {
        this.f62370d = aVar;
        return this;
    }

    public j setLiveMaxOffsetMs(long j10) {
        this.f62375i = j10;
        return this;
    }

    public j setLiveMaxSpeed(float f10) {
        this.f62377k = f10;
        return this;
    }

    public j setLiveMinOffsetMs(long j10) {
        this.f62374h = j10;
        return this;
    }

    public j setLiveMinSpeed(float f10) {
        this.f62376j = f10;
        return this;
    }

    public j setLiveTargetOffsetMs(long j10) {
        this.f62373g = j10;
        return this;
    }

    @Override // io.odeeo.internal.a0.v
    @Deprecated
    public /* bridge */ /* synthetic */ v setStreamKeys(List list) {
        return setStreamKeys((List<Object>) list);
    }

    public j(Context context, io.odeeo.internal.g.l lVar) {
        this(new p.a(context), lVar);
    }

    @Override // io.odeeo.internal.a0.v
    public t createMediaSource(io.odeeo.internal.b.z zVar) {
        io.odeeo.internal.q0.a.checkNotNull(zVar.f63110b);
        z.h hVar = zVar.f63110b;
        int iInferContentTypeForUriAndMimeType = io.odeeo.internal.q0.g0.inferContentTypeForUriAndMimeType(hVar.f63176a, hVar.f63177b);
        v mediaSourceFactory = this.f62369c.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
        io.odeeo.internal.q0.a.checkStateNotNull(mediaSourceFactory, "No suitable media source factory found for content type: " + iInferContentTypeForUriAndMimeType);
        z.g.a aVarBuildUpon = zVar.f63112d.buildUpon();
        if (zVar.f63112d.f63166a == C.TIME_UNSET) {
            aVarBuildUpon.setTargetOffsetMs(this.f62373g);
        }
        if (zVar.f63112d.f63169d == -3.4028235E38f) {
            aVarBuildUpon.setMinPlaybackSpeed(this.f62376j);
        }
        if (zVar.f63112d.f63170e == -3.4028235E38f) {
            aVarBuildUpon.setMaxPlaybackSpeed(this.f62377k);
        }
        if (zVar.f63112d.f63167b == C.TIME_UNSET) {
            aVarBuildUpon.setMinOffsetMs(this.f62374h);
        }
        if (zVar.f63112d.f63168c == C.TIME_UNSET) {
            aVarBuildUpon.setMaxOffsetMs(this.f62375i);
        }
        z.g gVarBuild = aVarBuildUpon.build();
        if (!gVarBuild.equals(zVar.f63112d)) {
            zVar = zVar.buildUpon().setLiveConfiguration(gVarBuild).build();
        }
        t tVarCreateMediaSource = mediaSourceFactory.createMediaSource(zVar);
        h1<z.k> h1Var = ((z.h) io.odeeo.internal.q0.g0.castNonNull(zVar.f63110b)).f63182g;
        if (!h1Var.isEmpty()) {
            t[] tVarArr = new t[h1Var.size() + 1];
            tVarArr[0] = tVarCreateMediaSource;
            for (int i10 = 0; i10 < h1Var.size(); i10++) {
                if (this.f62378l) {
                    final io.odeeo.internal.b.t tVarBuild = new t.b().setSampleMimeType(h1Var.get(i10).f63186b).setLanguage(h1Var.get(i10).f63187c).setSelectionFlags(h1Var.get(i10).f63188d).setRoleFlags(h1Var.get(i10).f63189e).setLabel(h1Var.get(i10).f63190f).build();
                    tVarArr[i10 + 1] = new a0.b(this.f62368b, new io.odeeo.internal.g.l() { // from class: hs.c
                        @Override // io.odeeo.internal.g.l
                        public final h[] createExtractors() {
                            return j.a(tVarBuild);
                        }
                    }).createMediaSource(io.odeeo.internal.b.z.fromUri(h1Var.get(i10).f63185a.toString()));
                } else {
                    tVarArr[i10 + 1] = new i0.b(this.f62368b).setLoadErrorHandlingPolicy(this.f62372f).createMediaSource(h1Var.get(i10), C.TIME_UNSET);
                }
            }
            tVarCreateMediaSource = new x(tVarArr);
        }
        return b(zVar, a(zVar, tVarCreateMediaSource));
    }

    @Override // io.odeeo.internal.a0.v
    @Deprecated
    public j setDrmHttpDataSourceFactory(t.b bVar) {
        this.f62369c.setDrmHttpDataSourceFactory(bVar);
        return this;
    }

    @Override // io.odeeo.internal.a0.v
    @Deprecated
    public j setDrmSessionManager(io.odeeo.internal.f.h hVar) {
        this.f62369c.setDrmSessionManager(hVar);
        return this;
    }

    @Override // io.odeeo.internal.a0.v
    public j setDrmSessionManagerProvider(io.odeeo.internal.f.i iVar) {
        this.f62369c.setDrmSessionManagerProvider(iVar);
        return this;
    }

    @Override // io.odeeo.internal.a0.v
    @Deprecated
    public j setDrmUserAgent(String str) {
        this.f62369c.setDrmUserAgent(str);
        return this;
    }

    @Override // io.odeeo.internal.a0.v
    public j setLoadErrorHandlingPolicy(io.odeeo.internal.p0.v vVar) {
        this.f62372f = vVar;
        this.f62369c.setLoadErrorHandlingPolicy(vVar);
        return this;
    }

    @Override // io.odeeo.internal.a0.v
    @Deprecated
    public j setStreamKeys(List<Object> list) {
        this.f62369c.setStreamKeys(list);
        return this;
    }

    public j(i.a aVar) {
        this(aVar, new io.odeeo.internal.g.f());
    }

    public static /* synthetic */ io.odeeo.internal.g.h[] a(io.odeeo.internal.b.t tVar) {
        io.odeeo.internal.g.h cVar;
        io.odeeo.internal.d0.i iVar = io.odeeo.internal.d0.i.f63590a;
        if (iVar.supportsFormat(tVar)) {
            cVar = new io.odeeo.internal.d0.j(iVar.createDecoder(tVar), tVar);
        } else {
            cVar = new c(tVar);
        }
        return new io.odeeo.internal.g.h[]{cVar};
    }

    public j(i.a aVar, io.odeeo.internal.g.l lVar) {
        this.f62368b = aVar;
        this.f62369c = new b(aVar, lVar);
        this.f62373g = C.TIME_UNSET;
        this.f62374h = C.TIME_UNSET;
        this.f62375i = C.TIME_UNSET;
        this.f62376j = -3.4028235E38f;
        this.f62377k = -3.4028235E38f;
    }

    public static t a(io.odeeo.internal.b.z zVar, t tVar) {
        z.d dVar = zVar.f63114f;
        long j10 = dVar.f63134a;
        if (j10 == 0 && dVar.f63135b == Long.MIN_VALUE && !dVar.f63137d) {
            return tVar;
        }
        long jMsToUs = io.odeeo.internal.q0.g0.msToUs(j10);
        long jMsToUs2 = io.odeeo.internal.q0.g0.msToUs(zVar.f63114f.f63135b);
        z.d dVar2 = zVar.f63114f;
        return new e(tVar, jMsToUs, jMsToUs2, !dVar2.f63138e, dVar2.f63136c, dVar2.f63137d);
    }

    public static v b(Class<? extends v> cls, i.a aVar) {
        try {
            return cls.getConstructor(i.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static v b(Class<? extends v> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements io.odeeo.internal.g.h {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.b.t f62390a;

        public c(io.odeeo.internal.b.t tVar) {
            this.f62390a = tVar;
        }

        @Override // io.odeeo.internal.g.h
        public void init(io.odeeo.internal.g.j jVar) {
            io.odeeo.internal.g.x xVarTrack = jVar.track(0, 3);
            jVar.seekMap(new v.b(C.TIME_UNSET));
            jVar.endTracks();
            xVarTrack.format(this.f62390a.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(this.f62390a.f62971l).build());
        }

        @Override // io.odeeo.internal.g.h
        public int read(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
            return iVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // io.odeeo.internal.g.h
        public boolean sniff(io.odeeo.internal.g.i iVar) {
            return true;
        }

        @Override // io.odeeo.internal.g.h
        public void release() {
        }

        @Override // io.odeeo.internal.g.h
        public void seek(long j10, long j11) {
        }
    }
}
