package ao;

import android.content.Context;
import android.net.Uri;
import ao.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.i0;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource$Factory;
import io.bidmachine.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ln.n;
import mh.v2;
import nh.b5;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f7784a;

    /* renamed from: b, reason: collision with root package name */
    public ln.h f7785b;

    /* renamed from: c, reason: collision with root package name */
    public hp.q f7786c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f7787d;

    /* renamed from: e, reason: collision with root package name */
    public go.t f7788e;

    /* renamed from: f, reason: collision with root package name */
    public long f7789f;

    /* renamed from: g, reason: collision with root package name */
    public long f7790g;

    /* renamed from: h, reason: collision with root package name */
    public long f7791h;

    /* renamed from: i, reason: collision with root package name */
    public float f7792i;

    /* renamed from: j, reason: collision with root package name */
    public float f7793j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7794k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ko.e0 f7795a;

        /* renamed from: d, reason: collision with root package name */
        public ln.h f7798d;

        /* renamed from: f, reason: collision with root package name */
        public hp.q f7800f;

        /* renamed from: g, reason: collision with root package name */
        public int f7801g;

        /* renamed from: h, reason: collision with root package name */
        public sn.w f7802h;

        /* renamed from: i, reason: collision with root package name */
        public go.t f7803i;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f7796b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f7797c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public boolean f7799e = true;

        public a(ko.e0 e0Var, hp.q qVar) {
            this.f7795a = e0Var;
            this.f7800f = qVar;
        }

        public final v2 a(int i10) {
            v2 pVar;
            Integer numValueOf = Integer.valueOf(i10);
            HashMap map = this.f7796b;
            v2 v2Var = (v2) map.get(numValueOf);
            if (v2Var != null) {
                return v2Var;
            }
            final ln.h hVar = (ln.h) io.bidmachine.media3.common.util.a.checkNotNull(this.f7798d);
            final int i11 = 0;
            if (i10 != 0) {
                final int i12 = 1;
                if (i10 != 1) {
                    final int i13 = 2;
                    if (i10 == 2) {
                        final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(j0.class);
                        pVar = new v2() { // from class: ao.o
                            @Override // mh.v2
                            public final Object get() {
                                switch (i13) {
                                }
                                return r.a(clsAsSubclass, hVar);
                            }
                        };
                    } else if (i10 == 3) {
                        pVar = new p(Class.forName("io.bidmachine.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(j0.class), 0);
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException(a.b.e(i10, "Unrecognized contentType: "));
                        }
                        pVar = new q(0, this, hVar);
                    }
                } else {
                    final Class<? extends U> clsAsSubclass2 = Class.forName("io.bidmachine.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(j0.class);
                    pVar = new v2() { // from class: ao.o
                        @Override // mh.v2
                        public final Object get() {
                            switch (i12) {
                            }
                            return r.a(clsAsSubclass2, hVar);
                        }
                    };
                }
            } else {
                final Class clsAsSubclass3 = DashMediaSource$Factory.class.asSubclass(j0.class);
                pVar = new v2() { // from class: ao.o
                    @Override // mh.v2
                    public final Object get() {
                        switch (i11) {
                        }
                        return r.a(clsAsSubclass3, hVar);
                    }
                };
            }
            map.put(Integer.valueOf(i10), pVar);
            return pVar;
        }

        public j0 getMediaSourceFactory(int i10) throws ClassNotFoundException {
            Integer numValueOf = Integer.valueOf(i10);
            HashMap map = this.f7797c;
            j0 j0Var = (j0) map.get(numValueOf);
            if (j0Var != null) {
                return j0Var;
            }
            j0 j0Var2 = (j0) a(i10).get();
            sn.w wVar = this.f7802h;
            if (wVar != null) {
                j0Var2.setDrmSessionManagerProvider(wVar);
            }
            go.t tVar = this.f7803i;
            if (tVar != null) {
                j0Var2.setLoadErrorHandlingPolicy(tVar);
            }
            j0Var2.setSubtitleParserFactory(this.f7800f);
            j0Var2.experimentalParseSubtitlesDuringExtraction(this.f7799e);
            j0Var2.experimentalSetCodecsToParseWithinGopSampleDependencies(this.f7801g);
            map.put(Integer.valueOf(i10), j0Var2);
            return j0Var2;
        }

        public int[] getSupportedTypes() {
            try {
                a(0);
            } catch (ClassNotFoundException unused) {
            }
            try {
                a(1);
            } catch (ClassNotFoundException unused2) {
            }
            try {
                a(2);
            } catch (ClassNotFoundException unused3) {
            }
            try {
                a(3);
            } catch (ClassNotFoundException unused4) {
            }
            try {
                a(4);
            } catch (ClassNotFoundException unused5) {
            }
            return rh.w.toArray(this.f7796b.keySet());
        }

        public void setCmcdConfigurationFactory(go.g gVar) {
            Iterator it = this.f7797c.values().iterator();
            while (it.hasNext()) {
                ((j0) it.next()).setCmcdConfigurationFactory(gVar);
            }
        }

        public void setCodecsToParseWithinGopSampleDependencies(int i10) {
            this.f7801g = i10;
            this.f7795a.experimentalSetCodecsToParseWithinGopSampleDependencies(i10);
        }

        public void setDataSourceFactory(ln.h hVar) {
            if (hVar != this.f7798d) {
                this.f7798d = hVar;
                this.f7796b.clear();
                this.f7797c.clear();
            }
        }

        public void setDrmSessionManagerProvider(sn.w wVar) {
            this.f7802h = wVar;
            Iterator it = this.f7797c.values().iterator();
            while (it.hasNext()) {
                ((j0) it.next()).setDrmSessionManagerProvider(wVar);
            }
        }

        public void setJpegExtractorFlags(int i10) {
            ko.e0 e0Var = this.f7795a;
            if (e0Var instanceof ko.u) {
                ((ko.u) e0Var).setJpegExtractorFlags(i10);
            }
        }

        public void setLoadErrorHandlingPolicy(go.t tVar) {
            this.f7803i = tVar;
            Iterator it = this.f7797c.values().iterator();
            while (it.hasNext()) {
                ((j0) it.next()).setLoadErrorHandlingPolicy(tVar);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z10) {
            this.f7799e = z10;
            this.f7795a.experimentalSetTextTrackTranscodingEnabled(z10);
            Iterator it = this.f7797c.values().iterator();
            while (it.hasNext()) {
                ((j0) it.next()).experimentalParseSubtitlesDuringExtraction(z10);
            }
        }

        public void setSubtitleParserFactory(hp.q qVar) {
            this.f7800f = qVar;
            this.f7795a.setSubtitleParserFactory(qVar);
            Iterator it = this.f7797c.values().iterator();
            while (it.hasNext()) {
                ((j0) it.next()).setSubtitleParserFactory(qVar);
            }
        }
    }

    public r(Context context) {
        this(new n.a(context));
    }

    public static j0 a(Class cls, ln.h hVar) {
        try {
            return (j0) cls.getConstructor(ln.h.class).newInstance(hVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ao.u0, ao.j0
    public m0 createMediaSource(gn.p0 p0Var) {
        gn.j0 j0Var = p0Var.f58053b;
        gn.i0 i0Var = p0Var.f58054c;
        io.bidmachine.media3.common.util.a.checkNotNull(j0Var);
        gn.j0 j0Var2 = p0Var.f58053b;
        Uri uri = j0Var2.f57963a;
        long j10 = j0Var2.f57971i;
        String str = j0Var2.f57964b;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((j0) io.bidmachine.media3.common.util.a.checkNotNull(this.f7787d)).createMediaSource(p0Var);
        }
        if (Objects.equals(str, "application/x-image-uri")) {
            long jMsToUs = io.bidmachine.media3.common.util.a1.msToUs(j10);
            if (io.bidmachine.media3.common.util.a.checkNotNull(null) == null) {
                return new w(jMsToUs, null).createMediaSource(p0Var);
            }
            throw new ClassCastException();
        }
        int iInferContentTypeForUriAndMimeType = io.bidmachine.media3.common.util.a1.inferContentTypeForUriAndMimeType(j0Var2.f57963a, str);
        a aVar = this.f7784a;
        if (j10 != C.TIME_UNSET) {
            aVar.setJpegExtractorFlags(1);
        }
        try {
            j0 mediaSourceFactory = aVar.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
            i0.a aVarBuildUpon = i0Var.buildUpon();
            if (i0Var.f57944a == C.TIME_UNSET) {
                aVarBuildUpon.setTargetOffsetMs(this.f7789f);
            }
            if (i0Var.f57947d == -3.4028235E38f) {
                aVarBuildUpon.setMinPlaybackSpeed(this.f7792i);
            }
            if (i0Var.f57948e == -3.4028235E38f) {
                aVarBuildUpon.setMaxPlaybackSpeed(this.f7793j);
            }
            if (i0Var.f57945b == C.TIME_UNSET) {
                aVarBuildUpon.setMinOffsetMs(this.f7790g);
            }
            if (i0Var.f57946c == C.TIME_UNSET) {
                aVarBuildUpon.setMaxOffsetMs(this.f7791h);
            }
            gn.i0 i0VarBuild = aVarBuildUpon.build();
            if (!i0VarBuild.equals(i0Var)) {
                p0Var = p0Var.buildUpon().setLiveConfiguration(i0VarBuild).build();
            }
            m0 m0VarCreateMediaSource = mediaSourceFactory.createMediaSource(p0Var);
            gn.j0 j0Var3 = p0Var.f58053b;
            b5 b5Var = ((gn.j0) io.bidmachine.media3.common.util.a1.castNonNull(j0Var3)).f57969g;
            if (!b5Var.isEmpty()) {
                m0[] m0VarArr = new m0[b5Var.size() + 1];
                m0VarArr[0] = m0VarCreateMediaSource;
                for (int i10 = 0; i10 < b5Var.size(); i10++) {
                    if (this.f7794k) {
                        io.bidmachine.media3.common.b bVarBuild = new gn.w().setSampleMimeType(((gn.o0) b5Var.get(i10)).f58039b).setLanguage(((gn.o0) b5Var.get(i10)).f58040c).setSelectionFlags(((gn.o0) b5Var.get(i10)).f58041d).setRoleFlags(((gn.o0) b5Var.get(i10)).f58042e).setLabel(((gn.o0) b5Var.get(i10)).f58043f).setId(((gn.o0) b5Var.get(i10)).f58044g).build();
                        g1 g1Var = new g1(this.f7785b, new n(0, this, bVarBuild));
                        if (this.f7786c.supportsFormat(bVarBuild)) {
                            bVarBuild = bVarBuild.buildUpon().setSampleMimeType("application/x-media3-cues").setCodecs(bVarBuild.f60665o).setCueReplacementBehavior(this.f7786c.getCueReplacementBehavior(bVarBuild)).build();
                        }
                        g1Var.f7679g = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(bVarBuild);
                        go.t tVar = this.f7788e;
                        if (tVar != null) {
                            g1Var.setLoadErrorHandlingPolicy(tVar);
                        }
                        m0VarArr[i10 + 1] = g1Var.createMediaSource(gn.p0.fromUri(((gn.o0) b5Var.get(i10)).f58038a.toString()));
                    } else {
                        w1 w1Var = new w1(this.f7785b);
                        go.t tVar2 = this.f7788e;
                        if (tVar2 != null) {
                            w1Var.setLoadErrorHandlingPolicy(tVar2);
                        }
                        m0VarArr[i10 + 1] = w1Var.createMediaSource((gn.o0) b5Var.get(i10), C.TIME_UNSET);
                    }
                }
                m0VarCreateMediaSource = new w0(m0VarArr);
            }
            gn.f0 f0Var = p0Var.f58056e;
            long j11 = f0Var.f57866b;
            boolean z10 = f0Var.f57870f;
            long j12 = f0Var.f57868d;
            if (j11 != 0 || j12 != Long.MIN_VALUE || z10) {
                m0VarCreateMediaSource = new f.a(m0VarCreateMediaSource).setStartPositionUs(f0Var.f57866b).setEndPositionUs(j12).setEnableInitialDiscontinuity(!f0Var.f57871g).setAllowDynamicClippingUpdates(f0Var.f57869e).setRelativeToDefaultPosition(z10).build();
            }
            io.bidmachine.media3.common.util.a.checkNotNull(j0Var3);
            if (j0Var3.f57966d == null) {
                return m0VarCreateMediaSource;
            }
            io.bidmachine.media3.common.util.b0.w("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return m0VarCreateMediaSource;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ao.u0, ao.j0
    public int[] getSupportedTypes() {
        return this.f7784a.getSupportedTypes();
    }

    public r setDataSourceFactory(ln.h hVar) {
        this.f7785b = hVar;
        this.f7784a.setDataSourceFactory(hVar);
        return this;
    }

    public r setLiveMaxOffsetMs(long j10) {
        this.f7791h = j10;
        return this;
    }

    public r setLiveMaxSpeed(float f10) {
        this.f7793j = f10;
        return this;
    }

    public r setLiveMinOffsetMs(long j10) {
        this.f7790g = j10;
        return this;
    }

    public r setLiveMinSpeed(float f10) {
        this.f7792i = f10;
        return this;
    }

    public r setLiveTargetOffsetMs(long j10) {
        this.f7789f = j10;
        return this;
    }

    public r setLocalAdInsertionComponents(bo.a aVar, gn.c cVar) {
        if (io.bidmachine.media3.common.util.a.checkNotNull(aVar) != null) {
            throw new ClassCastException();
        }
        return this;
    }

    public r setServerSideAdInsertionMediaSourceFactory(j0 j0Var) {
        this.f7787d = j0Var;
        return this;
    }

    public r(Context context, ko.e0 e0Var) {
        this(new n.a(context), e0Var);
    }

    @Override // ao.u0, ao.j0
    @Deprecated
    public r experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.f7794k = z10;
        this.f7784a.setParseSubtitlesDuringExtraction(z10);
        return this;
    }

    @Override // ao.u0, ao.j0
    public r experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        this.f7784a.setCodecsToParseWithinGopSampleDependencies(i10);
        return this;
    }

    @Override // ao.u0, ao.j0
    public r setCmcdConfigurationFactory(go.g gVar) {
        if (io.bidmachine.media3.common.util.a.checkNotNull(gVar) != null) {
            throw new ClassCastException();
        }
        this.f7784a.setCmcdConfigurationFactory(null);
        return this;
    }

    @Override // ao.u0, ao.j0
    public r setDrmSessionManagerProvider(sn.w wVar) {
        this.f7784a.setDrmSessionManagerProvider((sn.w) io.bidmachine.media3.common.util.a.checkNotNull(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // ao.u0, ao.j0
    public r setLoadErrorHandlingPolicy(go.t tVar) {
        this.f7788e = (go.t) io.bidmachine.media3.common.util.a.checkNotNull(tVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f7784a.setLoadErrorHandlingPolicy(tVar);
        return this;
    }

    @Override // ao.u0, ao.j0
    public r setSubtitleParserFactory(hp.q qVar) {
        this.f7786c = (hp.q) io.bidmachine.media3.common.util.a.checkNotNull(qVar);
        this.f7784a.setSubtitleParserFactory(qVar);
        return this;
    }

    public r(ln.h hVar) {
        this(hVar, new ko.u());
    }

    public r(ln.h hVar, ko.e0 e0Var) {
        this.f7785b = hVar;
        hp.e eVar = new hp.e();
        this.f7786c = eVar;
        a aVar = new a(e0Var, eVar);
        this.f7784a = aVar;
        aVar.setDataSourceFactory(hVar);
        this.f7789f = C.TIME_UNSET;
        this.f7790g = C.TIME_UNSET;
        this.f7791h = C.TIME_UNSET;
        this.f7792i = -3.4028235E38f;
        this.f7793j = -3.4028235E38f;
        this.f7794k = true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements ko.z {

        /* renamed from: a, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f7804a;

        public b(io.bidmachine.media3.common.b bVar) {
            this.f7804a = bVar;
        }

        @Override // ko.z
        public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
            return super.getSniffFailureDetails();
        }

        @Override // ko.z
        @SideEffectFree
        public /* bridge */ /* synthetic */ ko.z getUnderlyingImplementation() {
            return super.getUnderlyingImplementation();
        }

        @Override // ko.z
        public void init(ko.c0 c0Var) {
            ko.e1 e1VarTrack = c0Var.track(0, 3);
            c0Var.seekMap(new ko.x0(C.TIME_UNSET));
            c0Var.endTracks();
            io.bidmachine.media3.common.b bVar = this.f7804a;
            e1VarTrack.format(bVar.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(bVar.f60665o).build());
        }

        @Override // ko.z
        public int read(ko.a0 a0Var, ko.v0 v0Var) throws IOException {
            return a0Var.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // ko.z
        public boolean sniff(ko.a0 a0Var) {
            return true;
        }

        @Override // ko.z
        public void release() {
        }

        @Override // ko.z
        public void seek(long j10, long j11) {
        }
    }

    public r clearLocalAdInsertionComponents() {
        return this;
    }

    @Deprecated
    public r setAdViewProvider(gn.c cVar) {
        return this;
    }

    @Deprecated
    public r setAdsLoaderProvider(bo.a aVar) {
        return this;
    }

    public r setExternalImageLoader(u uVar) {
        return this;
    }
}
