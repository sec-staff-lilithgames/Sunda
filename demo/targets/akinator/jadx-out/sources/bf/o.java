package bf;

import android.content.Context;
import com.google.android.exoplayer2.n1;
import com.google.android.exoplayer2.t1;
import com.google.android.exoplayer2.u1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import mh.v2;
import nh.b5;
import qf.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f9359a;

    /* renamed from: b, reason: collision with root package name */
    public qf.o f9360b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f9361c;

    /* renamed from: d, reason: collision with root package name */
    public qf.o0 f9362d;

    /* renamed from: e, reason: collision with root package name */
    public long f9363e;

    /* renamed from: f, reason: collision with root package name */
    public long f9364f;

    /* renamed from: g, reason: collision with root package name */
    public long f9365g;

    /* renamed from: h, reason: collision with root package name */
    public float f9366h;

    /* renamed from: i, reason: collision with root package name */
    public float f9367i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9368j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ee.u f9369a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f9370b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f9371c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f9372d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public qf.o f9373e;

        /* renamed from: f, reason: collision with root package name */
        public de.u f9374f;

        /* renamed from: g, reason: collision with root package name */
        public qf.o0 f9375g;

        public a(ee.u uVar) {
            this.f9369a = uVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final mh.v2 a(int r7) {
            /*
                r6 = this;
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                java.util.HashMap r1 = r6.f9370b
                boolean r0 = r1.containsKey(r0)
                if (r0 == 0) goto L17
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Object r7 = r1.get(r7)
                mh.v2 r7 = (mh.v2) r7
                return r7
            L17:
                qf.o r0 = r6.f9373e
                java.lang.Object r0 = com.google.android.exoplayer2.util.a.checkNotNull(r0)
                qf.o r0 = (qf.o) r0
                java.lang.Class<bf.c0> r2 = bf.c0.class
                r3 = 0
                if (r7 == 0) goto L6a
                r4 = 1
                if (r7 == r4) goto L59
                r5 = 2
                if (r7 == r5) goto L48
                r5 = 3
                if (r7 == r5) goto L38
                r2 = 4
                if (r7 == r2) goto L31
                goto L7b
            L31:
                ao.q r2 = new ao.q     // Catch: java.lang.ClassNotFoundException -> L7b
                r2.<init>(r4, r6, r0)     // Catch: java.lang.ClassNotFoundException -> L7b
            L36:
                r3 = r2
                goto L7b
            L38:
                java.lang.String r0 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r0 = r0.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L7b
                ao.p r2 = new ao.p     // Catch: java.lang.ClassNotFoundException -> L7b
                r2.<init>(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L7b
                goto L36
            L48:
                java.lang.String r4 = "com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory"
                java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r2 = r4.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L7b
                bf.n r4 = new bf.n     // Catch: java.lang.ClassNotFoundException -> L7b
                r4.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
            L57:
                r3 = r4
                goto L7b
            L59:
                java.lang.String r5 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r2 = r5.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L7b
                bf.n r5 = new bf.n     // Catch: java.lang.ClassNotFoundException -> L7b
                r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                r3 = r5
                goto L7b
            L6a:
                java.lang.String r4 = "com.google.android.exoplayer2.source.dash.DashMediaSource$Factory"
                java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L7b
                java.lang.Class r2 = r4.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L7b
                bf.n r4 = new bf.n     // Catch: java.lang.ClassNotFoundException -> L7b
                r5 = 0
                r4.<init>()     // Catch: java.lang.ClassNotFoundException -> L7b
                goto L57
            L7b:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                r1.put(r0, r3)
                if (r3 == 0) goto L8d
                java.util.HashSet r0 = r6.f9371c
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r0.add(r7)
            L8d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.o.a.a(int):mh.v2");
        }

        public c0 getMediaSourceFactory(int i10) {
            Integer numValueOf = Integer.valueOf(i10);
            HashMap map = this.f9372d;
            c0 c0Var = (c0) map.get(numValueOf);
            if (c0Var != null) {
                return c0Var;
            }
            v2 v2VarA = a(i10);
            if (v2VarA == null) {
                return null;
            }
            c0 c0Var2 = (c0) v2VarA.get();
            de.u uVar = this.f9374f;
            if (uVar != null) {
                c0Var2.setDrmSessionManagerProvider(uVar);
            }
            qf.o0 o0Var = this.f9375g;
            if (o0Var != null) {
                c0Var2.setLoadErrorHandlingPolicy(o0Var);
            }
            map.put(Integer.valueOf(i10), c0Var2);
            return c0Var2;
        }

        public int[] getSupportedTypes() {
            a(0);
            a(1);
            a(2);
            a(3);
            a(4);
            return rh.w.toArray(this.f9371c);
        }

        public void setCmcdConfigurationFactory(qf.i iVar) {
            Iterator it = this.f9372d.values().iterator();
            while (it.hasNext()) {
                ((c0) it.next()).setCmcdConfigurationFactory(iVar);
            }
        }

        public void setDataSourceFactory(qf.o oVar) {
            if (oVar != this.f9373e) {
                this.f9373e = oVar;
                this.f9370b.clear();
                this.f9372d.clear();
            }
        }

        public void setDrmSessionManagerProvider(de.u uVar) {
            this.f9374f = uVar;
            Iterator it = this.f9372d.values().iterator();
            while (it.hasNext()) {
                ((c0) it.next()).setDrmSessionManagerProvider(uVar);
            }
        }

        public void setLoadErrorHandlingPolicy(qf.o0 o0Var) {
            this.f9375g = o0Var;
            Iterator it = this.f9372d.values().iterator();
            while (it.hasNext()) {
                ((c0) it.next()).setLoadErrorHandlingPolicy(o0Var);
            }
        }
    }

    public o(Context context) {
        this(new y.a(context));
    }

    public static c0 a(Class cls, qf.o oVar) {
        try {
            return (c0) cls.getConstructor(qf.o.class).newInstance(oVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // bf.l0, bf.c0
    public f0 createMediaSource(u1 u1Var) {
        com.google.android.exoplayer2.o1 o1Var = u1Var.f28113c;
        com.google.android.exoplayer2.n1 n1Var = u1Var.f28114e;
        com.google.android.exoplayer2.util.a.checkNotNull(o1Var);
        com.google.android.exoplayer2.o1 o1Var2 = u1Var.f28113c;
        String scheme = o1Var2.f27860b.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((c0) com.google.android.exoplayer2.util.a.checkNotNull(this.f9361c)).createMediaSource(u1Var);
        }
        int iInferContentTypeForUriAndMimeType = com.google.android.exoplayer2.util.n1.inferContentTypeForUriAndMimeType(o1Var2.f27860b, o1Var2.f27861c);
        c0 mediaSourceFactory = this.f9359a.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
        com.google.android.exoplayer2.util.a.checkStateNotNull(mediaSourceFactory, "No suitable media source factory found for content type: " + iInferContentTypeForUriAndMimeType);
        n1.a aVarBuildUpon = n1Var.buildUpon();
        if (n1Var.f27819b == C.TIME_UNSET) {
            aVarBuildUpon.setTargetOffsetMs(this.f9363e);
        }
        if (n1Var.f27822f == -3.4028235E38f) {
            aVarBuildUpon.setMinPlaybackSpeed(this.f9366h);
        }
        if (n1Var.f27823g == -3.4028235E38f) {
            aVarBuildUpon.setMaxPlaybackSpeed(this.f9367i);
        }
        if (n1Var.f27820c == C.TIME_UNSET) {
            aVarBuildUpon.setMinOffsetMs(this.f9364f);
        }
        if (n1Var.f27821e == C.TIME_UNSET) {
            aVarBuildUpon.setMaxOffsetMs(this.f9365g);
        }
        com.google.android.exoplayer2.n1 n1VarBuild = aVarBuildUpon.build();
        if (!n1VarBuild.equals(n1Var)) {
            u1Var = u1Var.buildUpon().setLiveConfiguration(n1VarBuild).build();
        }
        f0 f0VarCreateMediaSource = mediaSourceFactory.createMediaSource(u1Var);
        com.google.android.exoplayer2.o1 o1Var3 = u1Var.f28113c;
        b5 b5Var = ((com.google.android.exoplayer2.o1) com.google.android.exoplayer2.util.n1.castNonNull(o1Var3)).f27866i;
        if (!b5Var.isEmpty()) {
            f0[] f0VarArr = new f0[b5Var.size() + 1];
            f0VarArr[0] = f0VarCreateMediaSource;
            for (int i10 = 0; i10 < b5Var.size(); i10++) {
                if (this.f9368j) {
                    u0 u0Var = new u0(this.f9360b, new m(new com.google.android.exoplayer2.y0().setSampleMimeType(((t1) b5Var.get(i10)).f28048c).setLanguage(((t1) b5Var.get(i10)).f28049e).setSelectionFlags(((t1) b5Var.get(i10)).f28050f).setRoleFlags(((t1) b5Var.get(i10)).f28051g).setLabel(((t1) b5Var.get(i10)).f28052h).setId(((t1) b5Var.get(i10)).f28053i).build()));
                    qf.o0 o0Var = this.f9362d;
                    if (o0Var != null) {
                        u0Var.setLoadErrorHandlingPolicy(o0Var);
                    }
                    f0VarArr[i10 + 1] = u0Var.createMediaSource(u1.fromUri(((t1) b5Var.get(i10)).f28047b.toString()));
                } else {
                    j1 j1Var = new j1(this.f9360b);
                    qf.o0 o0Var2 = this.f9362d;
                    if (o0Var2 != null) {
                        j1Var.setLoadErrorHandlingPolicy(o0Var2);
                    }
                    f0VarArr[i10 + 1] = j1Var.createMediaSource((t1) b5Var.get(i10), C.TIME_UNSET);
                }
            }
            f0VarCreateMediaSource = new n0(f0VarArr);
        }
        f0 eVar = f0VarCreateMediaSource;
        com.google.android.exoplayer2.k1 k1Var = u1Var.f28116g;
        long j10 = k1Var.f27548b;
        long j11 = k1Var.f27549c;
        if (j10 != 0 || j11 != Long.MIN_VALUE || k1Var.f27551f) {
            eVar = new e(eVar, com.google.android.exoplayer2.util.n1.msToUs(j10), com.google.android.exoplayer2.util.n1.msToUs(j11), !k1Var.f27552g, k1Var.f27550e, k1Var.f27551f);
        }
        com.google.android.exoplayer2.util.a.checkNotNull(o1Var3);
        if (o1Var3.f27863f == null) {
            return eVar;
        }
        com.google.android.exoplayer2.util.f0.w("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return eVar;
    }

    public o experimentalUseProgressiveMediaSourceForSubtitles(boolean z10) {
        this.f9368j = z10;
        return this;
    }

    @Override // bf.l0, bf.c0
    public int[] getSupportedTypes() {
        return this.f9359a.getSupportedTypes();
    }

    public o setDataSourceFactory(qf.o oVar) {
        this.f9360b = oVar;
        this.f9359a.setDataSourceFactory(oVar);
        return this;
    }

    public o setLiveMaxOffsetMs(long j10) {
        this.f9365g = j10;
        return this;
    }

    public o setLiveMaxSpeed(float f10) {
        this.f9367i = f10;
        return this;
    }

    public o setLiveMinOffsetMs(long j10) {
        this.f9364f = j10;
        return this;
    }

    public o setLiveMinSpeed(float f10) {
        this.f9366h = f10;
        return this;
    }

    public o setLiveTargetOffsetMs(long j10) {
        this.f9363e = j10;
        return this;
    }

    public o setLocalAdInsertionComponents(cf.c cVar, com.google.android.exoplayer2.ui.b bVar) {
        if (com.google.android.exoplayer2.util.a.checkNotNull(cVar) != null) {
            throw new ClassCastException();
        }
        return this;
    }

    public o setServerSideAdInsertionMediaSourceFactory(c0 c0Var) {
        this.f9361c = c0Var;
        return this;
    }

    public o(Context context, ee.u uVar) {
        this(new y.a(context), uVar);
    }

    @Override // bf.l0, bf.c0
    public o setCmcdConfigurationFactory(qf.i iVar) {
        if (com.google.android.exoplayer2.util.a.checkNotNull(iVar) != null) {
            throw new ClassCastException();
        }
        this.f9359a.setCmcdConfigurationFactory(null);
        return this;
    }

    @Override // bf.l0, bf.c0
    public o setDrmSessionManagerProvider(de.u uVar) {
        this.f9359a.setDrmSessionManagerProvider((de.u) com.google.android.exoplayer2.util.a.checkNotNull(uVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // bf.l0, bf.c0
    public o setLoadErrorHandlingPolicy(qf.o0 o0Var) {
        this.f9362d = (qf.o0) com.google.android.exoplayer2.util.a.checkNotNull(o0Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f9359a.setLoadErrorHandlingPolicy(o0Var);
        return this;
    }

    public o(qf.o oVar) {
        this(oVar, new ee.m());
    }

    public o(qf.o oVar, ee.u uVar) {
        this.f9360b = oVar;
        a aVar = new a(uVar);
        this.f9359a = aVar;
        aVar.setDataSourceFactory(oVar);
        this.f9363e = C.TIME_UNSET;
        this.f9364f = C.TIME_UNSET;
        this.f9365g = C.TIME_UNSET;
        this.f9366h = -3.4028235E38f;
        this.f9367i = -3.4028235E38f;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements ee.p {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.z0 f9376a;

        public b(com.google.android.exoplayer2.z0 z0Var) {
            this.f9376a = z0Var;
        }

        @Override // ee.p
        public void init(ee.s sVar) {
            ee.l0 l0VarTrack = sVar.track(0, 3);
            sVar.seekMap(new ee.h0(C.TIME_UNSET));
            sVar.endTracks();
            com.google.android.exoplayer2.z0 z0Var = this.f9376a;
            l0VarTrack.format(z0Var.buildUpon().setSampleMimeType("text/x-unknown").setCodecs(z0Var.f28802n).build());
        }

        @Override // ee.p
        public int read(ee.q qVar, ee.f0 f0Var) throws IOException {
            return qVar.skip(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // ee.p
        public boolean sniff(ee.q qVar) {
            return true;
        }

        @Override // ee.p
        public void release() {
        }

        @Override // ee.p
        public void seek(long j10, long j11) {
        }
    }

    public o clearLocalAdInsertionComponents() {
        return this;
    }

    @Deprecated
    public o setAdViewProvider(com.google.android.exoplayer2.ui.b bVar) {
        return this;
    }

    @Deprecated
    public o setAdsLoaderProvider(cf.c cVar) {
        return this;
    }
}
