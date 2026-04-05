package tn;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import ao.b2;
import ao.g0;
import ao.m1;
import ao.q1;
import ao.r0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.u0;
import gn.v1;
import gn.x0;
import gn.z0;
import go.y;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;
import io.bidmachine.media3.exoplayer.v0;
import io.bidmachine.media3.exoplayer.w0;
import io.bidmachine.media3.exoplayer.y1;
import j1.o2;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ko.c0;
import ko.d1;
import ko.e1;
import ko.y0;
import ln.x;
import nh.b5;
import nh.i7;
import nh.x4;
import on.z;
import tn.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements go.u, y, q1, c0, m1 {

    /* renamed from: a0, reason: collision with root package name */
    public static final Set f87278a0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final SparseIntArray A;
    public a B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public io.bidmachine.media3.common.b H;
    public io.bidmachine.media3.common.b I;
    public boolean J;
    public b2 K;
    public Set L;
    public int[] M;
    public int N;
    public boolean O;
    public boolean[] P;
    public boolean[] Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public DrmInitData Y;
    public j Z;

    /* renamed from: b, reason: collision with root package name */
    public final String f87279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87280c;

    /* renamed from: e, reason: collision with root package name */
    public final q f87281e;

    /* renamed from: f, reason: collision with root package name */
    public final g f87282f;

    /* renamed from: g, reason: collision with root package name */
    public final go.c f87283g;

    /* renamed from: h, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f87284h;

    /* renamed from: i, reason: collision with root package name */
    public final sn.v f87285i;

    /* renamed from: j, reason: collision with root package name */
    public final sn.q f87286j;

    /* renamed from: k, reason: collision with root package name */
    public final go.t f87287k;

    /* renamed from: m, reason: collision with root package name */
    public final r0 f87289m;

    /* renamed from: n, reason: collision with root package name */
    public final int f87290n;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f87292p;

    /* renamed from: q, reason: collision with root package name */
    public final List f87293q;

    /* renamed from: r, reason: collision with root package name */
    public final p f87294r;

    /* renamed from: s, reason: collision with root package name */
    public final p f87295s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f87296t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f87297u;

    /* renamed from: v, reason: collision with root package name */
    public final Map f87298v;

    /* renamed from: w, reason: collision with root package name */
    public co.e f87299w;

    /* renamed from: x, reason: collision with root package name */
    public s[] f87300x;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f87302z;

    /* renamed from: l, reason: collision with root package name */
    public final go.w f87288l = new go.w("Loader:HlsSampleStreamWrapper");

    /* renamed from: o, reason: collision with root package name */
    public final g.b f87291o = new g.b();

    /* renamed from: y, reason: collision with root package name */
    public int[] f87301y = new int[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements e1 {

        /* renamed from: g, reason: collision with root package name */
        public static final io.bidmachine.media3.common.b f87303g = new gn.w().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();

        /* renamed from: h, reason: collision with root package name */
        public static final io.bidmachine.media3.common.b f87304h = new gn.w().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();

        /* renamed from: a, reason: collision with root package name */
        public final vo.b f87305a = new vo.b();

        /* renamed from: b, reason: collision with root package name */
        public final e1 f87306b;

        /* renamed from: c, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f87307c;

        /* renamed from: d, reason: collision with root package name */
        public io.bidmachine.media3.common.b f87308d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f87309e;

        /* renamed from: f, reason: collision with root package name */
        public int f87310f;

        public a(e1 e1Var, int i10) {
            this.f87306b = e1Var;
            if (i10 == 1) {
                this.f87307c = f87303g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException(a.b.e(i10, "Unknown metadataType: "));
                }
                this.f87307c = f87304h;
            }
            this.f87309e = new byte[0];
            this.f87310f = 0;
        }

        @Override // ko.e1
        public /* bridge */ /* synthetic */ void durationUs(long j10) {
            super.durationUs(j10);
        }

        @Override // ko.e1
        public void format(io.bidmachine.media3.common.b bVar) {
            this.f87308d = bVar;
            this.f87306b.format(this.f87307c);
        }

        @Override // ko.e1
        public /* bridge */ /* synthetic */ int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
            return super.sampleData(oVar, i10, z10);
        }

        @Override // ko.e1
        public void sampleMetadata(long j10, int i10, int i11, int i12, d1 d1Var) {
            io.bidmachine.media3.common.util.a.checkNotNull(this.f87308d);
            int i13 = this.f87310f - i12;
            m0 m0Var = new m0(Arrays.copyOfRange(this.f87309e, i13 - i11, i13));
            byte[] bArr = this.f87309e;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.f87310f = i12;
            String str = this.f87308d.f60665o;
            io.bidmachine.media3.common.b bVar = this.f87307c;
            if (!Objects.equals(str, bVar.f60665o)) {
                if (!MimeTypes.APPLICATION_EMSG.equals(this.f87308d.f60665o)) {
                    b0.w("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f87308d.f60665o);
                    return;
                }
                vo.a aVarDecode = this.f87305a.decode(m0Var);
                io.bidmachine.media3.common.b wrappedMetadataFormat = aVarDecode.getWrappedMetadataFormat();
                if (wrappedMetadataFormat == null || !Objects.equals(bVar.f60665o, wrappedMetadataFormat.f60665o)) {
                    b0.w("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + bVar.f60665o + " but actual wrapped format: " + aVarDecode.getWrappedMetadataFormat());
                    return;
                }
                m0Var = new m0((byte[]) io.bidmachine.media3.common.util.a.checkNotNull(aVarDecode.getWrappedMetadataBytes()));
            }
            int iBytesLeft = m0Var.bytesLeft();
            this.f87306b.sampleData(m0Var, iBytesLeft);
            this.f87306b.sampleMetadata(j10, i10, iBytesLeft, 0, d1Var);
        }

        @Override // ko.e1
        public /* bridge */ /* synthetic */ void sampleData(m0 m0Var, int i10) {
            super.sampleData(m0Var, i10);
        }

        @Override // ko.e1
        public int sampleData(gn.o oVar, int i10, boolean z10, int i11) throws IOException {
            int i12 = this.f87310f + i10;
            byte[] bArr = this.f87309e;
            if (bArr.length < i12) {
                this.f87309e = Arrays.copyOf(bArr, (i12 / 2) + i12);
            }
            int i13 = oVar.read(this.f87309e, this.f87310f, i10);
            if (i13 != -1) {
                this.f87310f += i13;
                return i13;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // ko.e1
        public void sampleData(m0 m0Var, int i10, int i11) {
            int i12 = this.f87310f + i10;
            byte[] bArr = this.f87309e;
            if (bArr.length < i12) {
                this.f87309e = Arrays.copyOf(bArr, (i12 / 2) + i12);
            }
            m0Var.readBytes(this.f87309e, this.f87310f, i10);
            this.f87310f += i10;
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [tn.p] */
    /* JADX WARN: Type inference failed for: r1v9, types: [tn.p] */
    public r(String str, int i10, q qVar, g gVar, Map<String, DrmInitData> map, go.c cVar, long j10, io.bidmachine.media3.common.b bVar, sn.v vVar, sn.q qVar2, go.t tVar, r0 r0Var, int i11) {
        this.f87279b = str;
        this.f87280c = i10;
        this.f87281e = qVar;
        this.f87282f = gVar;
        this.f87298v = map;
        this.f87283g = cVar;
        this.f87284h = bVar;
        this.f87285i = vVar;
        this.f87286j = qVar2;
        this.f87287k = tVar;
        this.f87289m = r0Var;
        this.f87290n = i11;
        Set set = f87278a0;
        this.f87302z = new HashSet(set.size());
        this.A = new SparseIntArray(set.size());
        this.f87300x = new s[0];
        this.Q = new boolean[0];
        this.P = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f87292p = arrayList;
        this.f87293q = Collections.unmodifiableList(arrayList);
        this.f87297u = new ArrayList();
        final int i12 = 0;
        this.f87294r = new Runnable(this) { // from class: tn.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f87277c;

            {
                this.f87277c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i13 = i12;
                r rVar = this.f87277c;
                switch (i13) {
                    case 0:
                        Set set2 = r.f87278a0;
                        rVar.i();
                        break;
                    default:
                        rVar.E = true;
                        rVar.i();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.f87295s = new Runnable(this) { // from class: tn.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f87277c;

            {
                this.f87277c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i132 = i13;
                r rVar = this.f87277c;
                switch (i132) {
                    case 0:
                        Set set2 = r.f87278a0;
                        rVar.i();
                        break;
                    default:
                        rVar.E = true;
                        rVar.i();
                        break;
                }
            }
        };
        this.f87296t = a1.createHandlerForCurrentLooper();
        this.R = j10;
        this.S = j10;
    }

    public static ko.v b(int i10, int i11) {
        b0.w("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new ko.v();
    }

    public static io.bidmachine.media3.common.b d(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.common.b bVar2, boolean z10) {
        String codecsCorrespondingToMimeType;
        if (bVar == null) {
            return bVar2;
        }
        String str = bVar.f60661k;
        String mediaMimeType = bVar2.f60665o;
        int trackType = x0.getTrackType(mediaMimeType);
        if (a1.getCodecCountOfType(str, trackType) == 1) {
            codecsCorrespondingToMimeType = a1.getCodecsOfType(str, trackType);
            mediaMimeType = x0.getMediaMimeType(codecsCorrespondingToMimeType);
        } else {
            codecsCorrespondingToMimeType = x0.getCodecsCorrespondingToMimeType(str, mediaMimeType);
        }
        gn.w codecs = bVar2.buildUpon().setId(bVar.f60651a).setLabel(bVar.f60652b).setLabels(bVar.f60653c).setLanguage(bVar.f60654d).setSelectionFlags(bVar.f60655e).setRoleFlags(bVar.f60656f).setAverageBitrate(z10 ? bVar.f60658h : -1).setPeakBitrate(z10 ? bVar.f60659i : -1).setCodecs(codecsCorrespondingToMimeType);
        if (trackType == 2) {
            codecs.setWidth(bVar.f60672v).setHeight(bVar.f60673w).setFrameRate(bVar.f60674x);
        }
        if (mediaMimeType != null) {
            codecs.setSampleMimeType(mediaMimeType);
        }
        int i10 = bVar.E;
        if (i10 != -1 && trackType == 1) {
            codecs.setChannelCount(i10);
        }
        u0 u0VarCopyWithAppendedEntriesFrom = bVar.f60662l;
        if (u0VarCopyWithAppendedEntriesFrom != null) {
            u0 u0Var = bVar2.f60662l;
            if (u0Var != null) {
                u0VarCopyWithAppendedEntriesFrom = u0Var.copyWithAppendedEntriesFrom(u0VarCopyWithAppendedEntriesFrom);
            }
            codecs.setMetadata(u0VarCopyWithAppendedEntriesFrom);
        }
        return codecs.build();
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void a() {
        io.bidmachine.media3.common.util.a.checkState(this.F);
        io.bidmachine.media3.common.util.a.checkNotNull(this.K);
        io.bidmachine.media3.common.util.a.checkNotNull(this.L);
    }

    public int bindSampleQueueToSampleStream(int i10) {
        a();
        io.bidmachine.media3.common.util.a.checkNotNull(this.M);
        int i11 = this.M[i10];
        if (i11 == -1) {
            return this.L.contains(this.K.get(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.P;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public final b2 c(v1[] v1VarArr) {
        for (int i10 = 0; i10 < v1VarArr.length; i10++) {
            v1 v1Var = v1VarArr[i10];
            io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[v1Var.f58205a];
            for (int i11 = 0; i11 < v1Var.f58205a; i11++) {
                io.bidmachine.media3.common.b format = v1Var.getFormat(i11);
                bVarArr[i11] = format.copyWithCryptoType(this.f87285i.getCryptoType(format));
            }
            v1VarArr[i10] = new v1(v1Var.f58206b, bVarArr);
        }
        return new b2(v1VarArr);
    }

    @Override // ao.q1
    public boolean continueLoading(w0 w0Var) {
        long jMax;
        List<j> list;
        if (!this.V) {
            go.w wVar = this.f87288l;
            if (!wVar.isLoading() && !wVar.hasFatalError()) {
                if (h()) {
                    list = Collections.EMPTY_LIST;
                    jMax = this.S;
                    for (s sVar : this.f87300x) {
                        sVar.setStartTimeUs(this.S);
                    }
                } else {
                    j jVarF = f();
                    jMax = jVarF.isLoadCompleted() ? jVarF.f12424h : Math.max(this.R, jVarF.f12423g);
                    list = this.f87293q;
                }
                List<j> list2 = list;
                long j10 = jMax;
                g.b bVar = this.f87291o;
                bVar.clear();
                this.f87282f.getNextChunk(w0Var, j10, list2, this.F || !list2.isEmpty(), this.f87291o);
                boolean z10 = bVar.f87208b;
                co.e eVar = bVar.f87207a;
                Uri uri = bVar.f87209c;
                if (z10) {
                    this.S = C.TIME_UNSET;
                    this.V = true;
                    return true;
                }
                if (eVar != null) {
                    if (eVar instanceof j) {
                        j jVar = (j) eVar;
                        this.Z = jVar;
                        this.H = jVar.f12420d;
                        this.S = C.TIME_UNSET;
                        this.f87292p.add(jVar);
                        x4 x4VarBuilder = b5.builder();
                        for (s sVar2 : this.f87300x) {
                            x4VarBuilder.add((Object) Integer.valueOf(sVar2.getWriteIndex()));
                        }
                        jVar.init(this, x4VarBuilder.build());
                        for (s sVar3 : this.f87300x) {
                            sVar3.setSourceChunk(jVar);
                            if (jVar.f87221n) {
                                sVar3.splice();
                            }
                        }
                    }
                    this.f87299w = eVar;
                    wVar.startLoading(eVar, this, this.f87287k.getMinimumLoadableRetryCount(eVar.f12419c));
                    return true;
                }
                if (uri != null) {
                    ((l) this.f87281e).onPlaylistRefreshRequired(uri);
                    return false;
                }
            }
        }
        return false;
    }

    public void continuePreparing() {
        if (this.F) {
            return;
        }
        continueLoading(new v0().setPlaybackPositionUs(this.R).build());
    }

    public void discardBuffer(long j10, boolean z10) throws Throwable {
        if (!this.E || h()) {
            return;
        }
        int length = this.f87300x.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f87300x[i10].discardTo(j10, z10, this.P[i10]);
        }
    }

    public final void e(int i10) {
        ArrayList arrayList;
        io.bidmachine.media3.common.util.a.checkState(!this.f87288l.isLoading());
        loop0: while (true) {
            arrayList = this.f87292p;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            int i11 = i10;
            while (true) {
                if (i11 >= arrayList.size()) {
                    j jVar = (j) arrayList.get(i10);
                    for (int i12 = 0; i12 < this.f87300x.length; i12++) {
                        if (this.f87300x[i12].getReadIndex() > jVar.getFirstSampleIndex(i12)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((j) arrayList.get(i11)).f87221n) {
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j10 = f().f12424h;
        j jVar2 = (j) arrayList.get(i10);
        a1.removeRange(arrayList, i10, arrayList.size());
        for (int i13 = 0; i13 < this.f87300x.length; i13++) {
            this.f87300x[i13].discardUpstreamSamples(jVar2.getFirstSampleIndex(i13));
        }
        if (arrayList.isEmpty()) {
            this.S = this.R;
        } else {
            ((j) i7.getLast(arrayList)).invalidateExtractor();
        }
        this.V = false;
        this.f87289m.upstreamDiscarded(this.C, jVar2.f12423g, j10);
    }

    @Override // ko.c0
    public void endTracks() {
        this.W = true;
        this.f87296t.post(this.f87295s);
    }

    public final j f() {
        return (j) o2.e(1, this.f87292p);
    }

    public long getAdjustedSeekPositionUs(long j10, y1 y1Var) {
        return this.f87282f.getAdjustedSeekPositionUs(j10, y1Var);
    }

    @Override // ao.q1
    public long getBufferedPositionUs() {
        if (this.V) {
            return Long.MIN_VALUE;
        }
        if (h()) {
            return this.S;
        }
        long jMax = this.R;
        j jVarF = f();
        if (!jVarF.isLoadCompleted()) {
            ArrayList arrayList = this.f87292p;
            jVarF = arrayList.size() > 1 ? (j) o2.e(2, arrayList) : null;
        }
        if (jVarF != null) {
            jMax = Math.max(jMax, jVarF.f12424h);
        }
        if (this.E) {
            for (s sVar : this.f87300x) {
                jMax = Math.max(jMax, sVar.getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    @Override // ao.q1
    public long getNextLoadPositionUs() {
        if (h()) {
            return this.S;
        }
        if (this.V) {
            return Long.MIN_VALUE;
        }
        return f().f12424h;
    }

    public int getPrimaryTrackGroupIndex() {
        return this.N;
    }

    public b2 getTrackGroups() {
        a();
        return this.K;
    }

    public final boolean h() {
        return this.S != C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        int i10;
        if (!this.J && this.M == null && this.E) {
            int i11 = 0;
            for (s sVar : this.f87300x) {
                if (sVar.getUpstreamFormat() == null) {
                    return;
                }
            }
            b2 b2Var = this.K;
            if (b2Var != null) {
                int i12 = b2Var.f7552a;
                int[] iArr = new int[i12];
                this.M = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        s[] sVarArr = this.f87300x;
                        if (i14 < sVarArr.length) {
                            io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkStateNotNull(sVarArr[i14].getUpstreamFormat());
                            io.bidmachine.media3.common.b format = this.K.get(i13).getFormat(0);
                            String str = bVar.f60665o;
                            String str2 = format.f60665o;
                            int trackType = x0.getTrackType(str);
                            if (trackType != 3) {
                                if (trackType == x0.getTrackType(str2)) {
                                    break;
                                } else {
                                    i14++;
                                }
                            } else if (Objects.equals(str, str2) && (!(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || bVar.J == format.J)) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                    this.M[i13] = i14;
                }
                Iterator it = this.f87297u.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).bindSampleQueue();
                }
                return;
            }
            int length = this.f87300x.length;
            int i15 = 0;
            int i16 = -1;
            int i17 = -2;
            while (true) {
                int i18 = 1;
                if (i15 >= length) {
                    break;
                }
                String str3 = ((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f87300x[i15].getUpstreamFormat())).f60665o;
                if (x0.isVideo(str3)) {
                    i18 = 2;
                } else if (!x0.isAudio(str3)) {
                    i18 = x0.isText(str3) ? 3 : -2;
                }
                if (g(i18) > g(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            v1 trackGroup = this.f87282f.getTrackGroup();
            int i19 = trackGroup.f58205a;
            this.N = -1;
            this.M = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.M[i20] = i20;
            }
            v1[] v1VarArr = new v1[length];
            int i21 = 0;
            while (i21 < length) {
                io.bidmachine.media3.common.b bVar2 = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f87300x[i21].getUpstreamFormat());
                String str4 = this.f87279b;
                io.bidmachine.media3.common.b bVar3 = this.f87284h;
                if (i21 == i16) {
                    io.bidmachine.media3.common.b[] bVarArr = new io.bidmachine.media3.common.b[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        io.bidmachine.media3.common.b format2 = trackGroup.getFormat(i22);
                        if (i17 == 1 && bVar3 != null) {
                            format2 = format2.withManifestFormatInfo(bVar3);
                        }
                        bVarArr[i22] = i19 == 1 ? bVar2.withManifestFormatInfo(format2) : d(format2, bVar2, true);
                    }
                    v1VarArr[i21] = new v1(str4, bVarArr);
                    this.N = i21;
                    i10 = 0;
                } else {
                    if (i17 != 2 || !x0.isAudio(bVar2.f60665o)) {
                        bVar3 = null;
                    }
                    StringBuilder sbT = a.b.t(str4, ":muxed:");
                    sbT.append(i21 < i16 ? i21 : i21 - 1);
                    i10 = 0;
                    v1VarArr[i21] = new v1(sbT.toString(), d(bVar3, bVar2, false));
                }
                i21++;
                i11 = i10;
            }
            int i23 = i11;
            this.K = c(v1VarArr);
            io.bidmachine.media3.common.util.a.checkState(this.L == null ? 1 : i23);
            this.L = Collections.EMPTY_SET;
            this.F = true;
            ((l) this.f87281e).onPrepared();
        }
    }

    @Override // ao.q1
    public boolean isLoading() {
        return this.f87288l.isLoading();
    }

    public boolean isReady(int i10) {
        return !h() && this.f87300x[i10].isReady(this.V);
    }

    public boolean isVideoSampleStream() {
        return this.C == 2;
    }

    public final void j() {
        for (s sVar : this.f87300x) {
            sVar.reset(this.T);
        }
        this.T = false;
    }

    public void maybeThrowError(int i10) throws IOException {
        maybeThrowError();
        this.f87300x[i10].maybeThrowError();
    }

    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.V && !this.F) {
            throw z0.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // go.y
    public void onLoaderReleased() {
        for (s sVar : this.f87300x) {
            sVar.release();
        }
    }

    public void onNewExtractor() {
        this.f87302z.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPlaylistError(android.net.Uri r6, go.s r7, boolean r8) {
        /*
            r5 = this;
            tn.g r0 = r5.f87282f
            boolean r1 = r0.obtainsChunksForPlaylist(r6)
            r2 = 1
            if (r1 != 0) goto La
            return r2
        La:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L29
            fo.l r8 = r0.getTrackSelection()
            go.q r8 = fo.s.createFallbackOptions(r8)
            go.t r1 = r5.f87287k
            go.r r7 = r1.getFallbackSelectionFor(r8, r7)
            if (r7 == 0) goto L29
            int r8 = r7.f58364a
            r1 = 2
            if (r8 != r1) goto L29
            long r7 = r7.f58365b
            goto L2a
        L29:
            r7 = r3
        L2a:
            boolean r6 = r0.onPlaylistError(r6, r7)
            if (r6 == 0) goto L35
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 == 0) goto L35
            return r2
        L35:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.r.onPlaylistError(android.net.Uri, go.s, boolean):boolean");
    }

    public void onPlaylistUpdated() {
        ArrayList arrayList = this.f87292p;
        if (arrayList.isEmpty()) {
            return;
        }
        j jVar = (j) i7.getLast(arrayList);
        int chunkPublicationState = this.f87282f.getChunkPublicationState(jVar);
        if (chunkPublicationState == 1) {
            jVar.publish();
            return;
        }
        if (chunkPublicationState == 0) {
            this.f87296t.post(new z(15, this, jVar));
        } else {
            if (chunkPublicationState != 2 || this.V) {
                return;
            }
            go.w wVar = this.f87288l;
            if (wVar.isLoading()) {
                wVar.cancelLoading();
            }
        }
    }

    @Override // ao.m1
    public void onUpstreamFormatChanged(io.bidmachine.media3.common.b bVar) {
        this.f87296t.post(this.f87294r);
    }

    public void prepareWithMultivariantPlaylistInfo(v1[] v1VarArr, int i10, int... iArr) {
        this.K = c(v1VarArr);
        this.L = new HashSet();
        for (int i11 : iArr) {
            this.L.add(this.K.get(i11));
        }
        this.N = i10;
        q qVar = this.f87281e;
        Objects.requireNonNull(qVar);
        this.f87296t.post(new on.w(qVar, 15));
        this.F = true;
    }

    public int readData(int i10, io.bidmachine.media3.exoplayer.r0 r0Var, nn.g gVar, int i11) {
        if (h()) {
            return -3;
        }
        ArrayList arrayList = this.f87292p;
        int i12 = 0;
        if (!arrayList.isEmpty()) {
            int i13 = 0;
            loop0: while (i13 < arrayList.size() - 1) {
                int i14 = ((j) arrayList.get(i13)).f87218k;
                int length = this.f87300x.length;
                for (int i15 = 0; i15 < length; i15++) {
                    if (this.P[i15] && this.f87300x[i15].peekSourceId() == i14) {
                        break loop0;
                    }
                }
                i13++;
            }
            a1.removeRange(arrayList, 0, i13);
            j jVar = (j) arrayList.get(0);
            io.bidmachine.media3.common.b bVar = jVar.f12420d;
            if (!bVar.equals(this.I)) {
                this.f87289m.downstreamFormatChanged(this.f87280c, bVar, jVar.f12421e, jVar.f12422f, jVar.f12423g);
            }
            this.I = bVar;
        }
        if (!arrayList.isEmpty() && !((j) arrayList.get(0)).isPublished()) {
            return -3;
        }
        int i16 = this.f87300x[i10].read(r0Var, gVar, i11, this.V);
        if (i16 == -5) {
            io.bidmachine.media3.common.b bVarWithManifestFormatInfo = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(r0Var.f61543b);
            if (i10 == this.D) {
                int iCheckedCast = rh.w.checkedCast(this.f87300x[i10].peekSourceId());
                while (i12 < arrayList.size() && ((j) arrayList.get(i12)).f87218k != iCheckedCast) {
                    i12++;
                }
                bVarWithManifestFormatInfo = bVarWithManifestFormatInfo.withManifestFormatInfo(i12 < arrayList.size() ? ((j) arrayList.get(i12)).f12420d : (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.H));
            }
            r0Var.f61543b = bVarWithManifestFormatInfo;
        }
        return i16;
    }

    @Override // ao.q1
    public void reevaluateBuffer(long j10) {
        go.w wVar = this.f87288l;
        if (wVar.hasFatalError() || h()) {
            return;
        }
        boolean zIsLoading = wVar.isLoading();
        g gVar = this.f87282f;
        List<? extends co.p> list = this.f87293q;
        if (zIsLoading) {
            io.bidmachine.media3.common.util.a.checkNotNull(this.f87299w);
            if (gVar.shouldCancelLoad(j10, this.f87299w, list)) {
                wVar.cancelLoading();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && gVar.getChunkPublicationState((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            e(size);
        }
        int preferredQueueSize = gVar.getPreferredQueueSize(j10, list);
        if (preferredQueueSize < this.f87292p.size()) {
            e(preferredQueueSize);
        }
    }

    public void release() {
        if (this.F) {
            for (s sVar : this.f87300x) {
                sVar.preRelease();
            }
        }
        this.f87282f.reset();
        this.f87288l.release(this);
        this.f87296t.removeCallbacksAndMessages(null);
        this.J = true;
        this.f87297u.clear();
    }

    public boolean seekToUs(long j10, boolean z10) {
        j jVar;
        boolean z11;
        this.R = j10;
        if (h()) {
            this.S = j10;
            return true;
        }
        boolean zHasIndependentSegments = this.f87282f.hasIndependentSegments();
        ArrayList arrayList = this.f87292p;
        if (zHasIndependentSegments) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jVar = (j) arrayList.get(i10);
                if (jVar.f12423g == j10) {
                    break;
                }
            }
            jVar = null;
        } else {
            jVar = null;
        }
        if (this.E && !z10) {
            int length = this.f87300x.length;
            for (int i11 = 0; i11 < length; i11++) {
                s sVar = this.f87300x[i11];
                if (!(jVar != null ? sVar.seekTo(jVar.getFirstSampleIndex(i11)) : sVar.seekTo(j10, false)) && (this.Q[i11] || !this.O)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.S = j10;
        this.V = false;
        arrayList.clear();
        go.w wVar = this.f87288l;
        if (!wVar.isLoading()) {
            wVar.clearFatalError();
            j();
            return true;
        }
        if (this.E) {
            for (s sVar2 : this.f87300x) {
                sVar2.discardToEnd();
            }
        }
        wVar.cancelLoading();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean selectTracks(fo.l[] r17, boolean[] r18, ao.o1[] r19, boolean[] r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.r.selectTracks(fo.l[], boolean[], ao.o1[], boolean[], long, boolean):boolean");
    }

    public void setDrmInitData(DrmInitData drmInitData) {
        if (Objects.equals(this.Y, drmInitData)) {
            return;
        }
        this.Y = drmInitData;
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f87300x;
            if (i10 >= sVarArr.length) {
                return;
            }
            if (this.Q[i10]) {
                sVarArr[i10].setDrmInitData(drmInitData);
            }
            i10++;
        }
    }

    public void setIsPrimaryTimestampSource(boolean z10) {
        this.f87282f.setIsPrimaryTimestampSource(z10);
    }

    public void setSampleOffsetUs(long j10) {
        if (this.X != j10) {
            this.X = j10;
            for (s sVar : this.f87300x) {
                sVar.setSampleOffsetUs(j10);
            }
        }
    }

    public int skipData(int i10, long j10) throws Throwable {
        if (h()) {
            return 0;
        }
        s sVar = this.f87300x[i10];
        int skipCount = sVar.getSkipCount(j10, this.V);
        j jVar = (j) i7.getLast(this.f87292p, null);
        if (jVar != null && !jVar.isPublished()) {
            skipCount = Math.min(skipCount, jVar.getFirstSampleIndex(i10) - sVar.getReadIndex());
        }
        sVar.skip(skipCount);
        return skipCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [tn.s[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tn.s[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ko.e1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ao.n1, java.lang.Object, tn.s] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ko.v] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // ko.c0
    public e1 track(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        Set set = f87278a0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f87302z;
        SparseIntArray sparseIntArray = this.A;
        ?? sVar = 0;
        sVar = 0;
        if (zContains) {
            io.bidmachine.media3.common.util.a.checkArgument(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.f87301y[i12] = i10;
                }
                sVar = this.f87301y[i12] == i10 ? this.f87300x[i12] : b(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.f87300x;
                if (i13 >= r12.length) {
                    break;
                }
                if (this.f87301y[i13] == i10) {
                    sVar = r12[i13];
                    break;
                }
                i13++;
            }
        }
        if (sVar == 0) {
            if (this.W) {
                return b(i10, i11);
            }
            int length = this.f87300x.length;
            boolean z10 = i11 == 1 || i11 == 2;
            sVar = new s(this.f87283g, this.f87285i, this.f87286j, this.f87298v);
            sVar.setStartTimeUs(this.R);
            if (z10) {
                sVar.setDrmInitData(this.Y);
            }
            sVar.setSampleOffsetUs(this.X);
            j jVar = this.Z;
            if (jVar != null) {
                sVar.setSourceChunk(jVar);
            }
            sVar.setUpstreamFormatChangeListener(this);
            int i14 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f87301y, i14);
            this.f87301y = iArrCopyOf;
            iArrCopyOf[length] = i10;
            this.f87300x = (s[]) a1.nullSafeArrayAppend(this.f87300x, sVar);
            boolean[] zArrCopyOf = Arrays.copyOf(this.Q, i14);
            this.Q = zArrCopyOf;
            zArrCopyOf[length] = z10;
            this.O |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (g(i11) > g(this.C)) {
                this.D = length;
                this.C = i11;
            }
            this.P = Arrays.copyOf(this.P, i14);
        }
        if (i11 != 5) {
            return sVar;
        }
        if (this.B == null) {
            this.B = new a(sVar, this.f87290n);
        }
        return this.B;
    }

    public void unbindSampleQueue(int i10) {
        a();
        io.bidmachine.media3.common.util.a.checkNotNull(this.M);
        int i11 = this.M[i10];
        io.bidmachine.media3.common.util.a.checkState(this.P[i11]);
        this.P[i11] = false;
    }

    @Override // go.u
    public void onLoadCanceled(co.e eVar, long j10, long j11, boolean z10) {
        this.f87299w = null;
        ao.b0 b0Var = new ao.b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, eVar.bytesLoaded());
        this.f87287k.onLoadTaskConcluded(eVar.f12417a);
        this.f87289m.loadCanceled(b0Var, eVar.f12419c, this.f87280c, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h);
        if (z10) {
            return;
        }
        if (h() || this.G == 0) {
            j();
        }
        if (this.G > 0) {
            ((l) this.f87281e).onContinueLoadingRequested((q1) this);
        }
    }

    @Override // go.u
    public void onLoadCompleted(co.e eVar, long j10, long j11) {
        this.f87299w = null;
        this.f87282f.onChunkLoadCompleted(eVar);
        ao.b0 b0Var = new ao.b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, eVar.bytesLoaded());
        this.f87287k.onLoadTaskConcluded(eVar.f12417a);
        this.f87289m.loadCompleted(b0Var, eVar.f12419c, this.f87280c, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h);
        if (this.F) {
            ((l) this.f87281e).onContinueLoadingRequested((q1) this);
        } else {
            continueLoading(new v0().setPlaybackPositionUs(this.R).build());
        }
    }

    @Override // go.u
    public go.v onLoadError(co.e eVar, long j10, long j11, IOException iOException, int i10) {
        go.v vVarCreateRetryAction;
        int i11;
        boolean z10 = eVar instanceof j;
        if (z10 && !((j) eVar).isPublished() && (iOException instanceof x) && ((i11 = ((x) iOException).f73534e) == 410 || i11 == 404)) {
            return go.w.f58370d;
        }
        long jBytesLoaded = eVar.bytesLoaded();
        ao.b0 b0Var = new ao.b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, jBytesLoaded);
        go.s sVar = new go.s(b0Var, new g0(eVar.f12419c, this.f87280c, eVar.f12420d, eVar.f12421e, eVar.f12422f, a1.usToMs(eVar.f12423g), a1.usToMs(eVar.f12424h)), iOException, i10);
        g gVar = this.f87282f;
        go.q qVarCreateFallbackOptions = fo.s.createFallbackOptions(gVar.getTrackSelection());
        go.t tVar = this.f87287k;
        go.r fallbackSelectionFor = tVar.getFallbackSelectionFor(qVarCreateFallbackOptions, sVar);
        boolean zMaybeExcludeTrack = (fallbackSelectionFor == null || fallbackSelectionFor.f58364a != 2) ? false : gVar.maybeExcludeTrack(eVar, fallbackSelectionFor.f58365b);
        if (zMaybeExcludeTrack) {
            if (z10 && jBytesLoaded == 0) {
                ArrayList arrayList = this.f87292p;
                io.bidmachine.media3.common.util.a.checkState(((j) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (arrayList.isEmpty()) {
                    this.S = this.R;
                } else {
                    ((j) i7.getLast(arrayList)).invalidateExtractor();
                }
            }
            vVarCreateRetryAction = go.w.f58371e;
        } else {
            long retryDelayMsFor = tVar.getRetryDelayMsFor(sVar);
            vVarCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? go.w.createRetryAction(false, retryDelayMsFor) : go.w.f58372f;
        }
        go.v vVar = vVarCreateRetryAction;
        boolean zIsRetry = vVar.isRetry();
        this.f87289m.loadError(b0Var, eVar.f12419c, this.f87280c, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f87299w = null;
            tVar.onLoadTaskConcluded(eVar.f12417a);
        }
        if (zMaybeExcludeTrack) {
            if (!this.F) {
                continueLoading(new v0().setPlaybackPositionUs(this.R).build());
                return vVar;
            }
            ((l) this.f87281e).onContinueLoadingRequested((q1) this);
        }
        return vVar;
    }

    @Override // go.u
    public void onLoadStarted(co.e eVar, long j10, long j11, int i10) {
        this.f87289m.loadStarted(i10 == 0 ? new ao.b0(eVar.f12417a, eVar.f12418b, j10) : new ao.b0(eVar.f12417a, eVar.f12418b, eVar.getUri(), eVar.getResponseHeaders(), j10, j11, eVar.bytesLoaded()), eVar.f12419c, this.f87280c, eVar.f12420d, eVar.f12421e, eVar.f12422f, eVar.f12423g, eVar.f12424h, i10);
    }

    public void maybeThrowError() throws IOException {
        this.f87288l.maybeThrowError();
        this.f87282f.maybeThrowError();
    }

    @Override // ko.c0
    public void seekMap(y0 y0Var) {
    }
}
