package oe;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y implements ee.p {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f79307a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f79308b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f79309c;

    /* renamed from: d, reason: collision with root package name */
    public final x f79310d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79311e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f79312f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f79313g;

    /* renamed from: h, reason: collision with root package name */
    public long f79314h;

    /* renamed from: i, reason: collision with root package name */
    public w f79315i;

    /* renamed from: j, reason: collision with root package name */
    public ee.s f79316j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79317k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f79318a;

        /* renamed from: b, reason: collision with root package name */
        public final h1 f79319b;

        /* renamed from: c, reason: collision with root package name */
        public final u0 f79320c = new u0(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        public boolean f79321d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f79322e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f79323f;

        /* renamed from: g, reason: collision with root package name */
        public long f79324g;

        public a(j jVar, h1 h1Var) {
            this.f79318a = jVar;
            this.f79319b = h1Var;
        }

        public void consume(v0 v0Var) throws h2 {
            u0 u0Var = this.f79320c;
            v0Var.readBytes(u0Var.f28575a, 0, 3);
            u0Var.setPosition(0);
            u0Var.skipBits(8);
            this.f79321d = u0Var.readBit();
            this.f79322e = u0Var.readBit();
            u0Var.skipBits(6);
            v0Var.readBytes(u0Var.f28575a, 0, u0Var.readBits(8));
            u0Var.setPosition(0);
            this.f79324g = 0L;
            if (this.f79321d) {
                u0Var.skipBits(4);
                u0Var.skipBits(1);
                u0Var.skipBits(1);
                long bits = (u0Var.readBits(3) << 30) | (u0Var.readBits(15) << 15) | u0Var.readBits(15);
                u0Var.skipBits(1);
                boolean z10 = this.f79323f;
                h1 h1Var = this.f79319b;
                if (!z10 && this.f79322e) {
                    u0Var.skipBits(4);
                    u0Var.skipBits(1);
                    u0Var.skipBits(1);
                    u0Var.skipBits(1);
                    h1Var.adjustTsTimestamp(u0Var.readBits(15) | (u0Var.readBits(3) << 30) | (u0Var.readBits(15) << 15));
                    this.f79323f = true;
                }
                this.f79324g = h1Var.adjustTsTimestamp(bits);
            }
            long j10 = this.f79324g;
            j jVar = this.f79318a;
            jVar.packetStarted(j10, 4);
            jVar.consume(v0Var);
            jVar.packetFinished();
        }

        public void seek() {
            this.f79323f = false;
            this.f79318a.seek();
        }
    }

    public y() {
        this(new h1(0L));
    }

    @Override // ee.p
    public void init(ee.s sVar) {
        this.f79316j = sVar;
    }

    @Override // ee.p
    public int read(ee.q qVar, ee.f0 f0Var) throws IOException {
        j kVar;
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79316j);
        long length = qVar.getLength();
        x xVar = this.f79310d;
        if (length != -1 && !xVar.isDurationReadFinished()) {
            return xVar.readDuration(qVar, f0Var);
        }
        if (!this.f79317k) {
            this.f79317k = true;
            if (xVar.getDurationUs() != C.TIME_UNSET) {
                w wVar = new w(xVar.getScrTimestampAdjuster(), xVar.getDurationUs(), length);
                this.f79315i = wVar;
                this.f79316j.seekMap(wVar.getSeekMap());
            } else {
                this.f79316j.seekMap(new ee.h0(xVar.getDurationUs()));
            }
        }
        w wVar2 = this.f79315i;
        if (wVar2 != null && wVar2.isSeeking()) {
            return this.f79315i.handlePendingSeek(qVar, f0Var);
        }
        qVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - qVar.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        v0 v0Var = this.f79309c;
        if (!qVar.peekFully(v0Var.getData(), 0, 4, true)) {
            return -1;
        }
        v0Var.setPosition(0);
        int i10 = v0Var.readInt();
        if (i10 == 441) {
            return -1;
        }
        if (i10 == 442) {
            qVar.peekFully(v0Var.getData(), 0, 10);
            v0Var.setPosition(9);
            qVar.skipFully((v0Var.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i10 == 443) {
            qVar.peekFully(v0Var.getData(), 0, 2);
            v0Var.setPosition(0);
            qVar.skipFully(v0Var.readUnsignedShort() + 6);
            return 0;
        }
        if (((i10 & (-256)) >> 8) != 1) {
            qVar.skipFully(1);
            return 0;
        }
        int i11 = i10 & 255;
        SparseArray sparseArray = this.f79308b;
        a aVar = (a) sparseArray.get(i11);
        if (!this.f79311e) {
            if (aVar == null) {
                if (i11 == 189) {
                    kVar = new b();
                    this.f79312f = true;
                    this.f79314h = qVar.getPosition();
                } else if ((i10 & 224) == 192) {
                    kVar = new r();
                    this.f79312f = true;
                    this.f79314h = qVar.getPosition();
                } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    kVar = new k();
                    this.f79313g = true;
                    this.f79314h = qVar.getPosition();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.createTracks(this.f79316j, new i0(i11, NotificationCompat.FLAG_LOCAL_ONLY));
                    aVar = new a(kVar, this.f79307a);
                    sparseArray.put(i11, aVar);
                }
            }
            if (qVar.getPosition() > ((this.f79312f && this.f79313g) ? this.f79314h + 8192 : 1048576L)) {
                this.f79311e = true;
                this.f79316j.endTracks();
            }
        }
        qVar.peekFully(v0Var.getData(), 0, 2);
        v0Var.setPosition(0);
        int unsignedShort = v0Var.readUnsignedShort() + 6;
        if (aVar == null) {
            qVar.skipFully(unsignedShort);
            return 0;
        }
        v0Var.reset(unsignedShort);
        qVar.readFully(v0Var.getData(), 0, unsignedShort);
        v0Var.setPosition(6);
        aVar.consume(v0Var);
        v0Var.setLimit(v0Var.capacity());
        return 0;
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        h1 h1Var = this.f79307a;
        int i10 = 0;
        boolean z10 = h1Var.getTimestampOffsetUs() == C.TIME_UNSET;
        if (!z10) {
            long firstSampleTimestampUs = h1Var.getFirstSampleTimestampUs();
            z10 = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j11) ? false : true;
        }
        if (z10) {
            h1Var.reset(j11);
        }
        w wVar = this.f79315i;
        if (wVar != null) {
            wVar.setSeekTargetUs(j11);
        }
        while (true) {
            SparseArray sparseArray = this.f79308b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((a) sparseArray.valueAt(i10)).seek();
            i10++;
        }
    }

    @Override // ee.p
    public boolean sniff(ee.q qVar) throws IOException {
        byte[] bArr = new byte[14];
        qVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.advancePeekPosition(bArr[13] & 7);
        qVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public y(h1 h1Var) {
        this.f79307a = h1Var;
        this.f79309c = new v0(4096);
        this.f79308b = new SparseArray();
        this.f79310d = new x();
    }

    @Override // ee.p
    public void release() {
    }
}
