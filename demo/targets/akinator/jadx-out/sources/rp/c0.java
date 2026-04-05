package rp;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import gn.z0;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import java.util.List;
import ko.v0;
import ko.x0;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements ko.z {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f84554a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f84555b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84556c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f84557d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84558e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84559f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84560g;

    /* renamed from: h, reason: collision with root package name */
    public long f84561h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f84562i;

    /* renamed from: j, reason: collision with root package name */
    public ko.c0 f84563j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84564k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f84565a;

        /* renamed from: b, reason: collision with root package name */
        public final u0 f84566b;

        /* renamed from: c, reason: collision with root package name */
        public final io.bidmachine.media3.common.util.l0 f84567c = new io.bidmachine.media3.common.util.l0(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        public boolean f84568d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f84569e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f84570f;

        /* renamed from: g, reason: collision with root package name */
        public long f84571g;

        public a(j jVar, u0 u0Var) {
            this.f84565a = jVar;
            this.f84566b = u0Var;
        }

        public void consume(io.bidmachine.media3.common.util.m0 m0Var) throws z0 {
            io.bidmachine.media3.common.util.l0 l0Var = this.f84567c;
            m0Var.readBytes(l0Var.f60741a, 0, 3);
            l0Var.setPosition(0);
            l0Var.skipBits(8);
            this.f84568d = l0Var.readBit();
            this.f84569e = l0Var.readBit();
            l0Var.skipBits(6);
            m0Var.readBytes(l0Var.f60741a, 0, l0Var.readBits(8));
            l0Var.setPosition(0);
            this.f84571g = 0L;
            if (this.f84568d) {
                l0Var.skipBits(4);
                l0Var.skipBits(1);
                l0Var.skipBits(1);
                long bits = (l0Var.readBits(3) << 30) | (l0Var.readBits(15) << 15) | l0Var.readBits(15);
                l0Var.skipBits(1);
                boolean z10 = this.f84570f;
                u0 u0Var = this.f84566b;
                if (!z10 && this.f84569e) {
                    l0Var.skipBits(4);
                    l0Var.skipBits(1);
                    l0Var.skipBits(1);
                    l0Var.skipBits(1);
                    u0Var.adjustTsTimestamp((l0Var.readBits(3) << 30) | (l0Var.readBits(15) << 15) | l0Var.readBits(15));
                    this.f84570f = true;
                }
                this.f84571g = u0Var.adjustTsTimestamp(bits);
            }
            long j10 = this.f84571g;
            j jVar = this.f84565a;
            jVar.packetStarted(j10, 4);
            jVar.consume(m0Var);
            jVar.packetFinished(false);
        }

        public void seek() {
            this.f84570f = false;
            this.f84565a.seek();
        }
    }

    public c0() {
        this(new u0(0L));
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
        this.f84563j = c0Var;
    }

    @Override // ko.z
    public int read(ko.a0 a0Var, v0 v0Var) throws IOException {
        j kVar;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84563j);
        long length = a0Var.getLength();
        b0 b0Var = this.f84557d;
        if (length != -1 && !b0Var.isDurationReadFinished()) {
            return b0Var.readDuration(a0Var, v0Var);
        }
        if (!this.f84564k) {
            this.f84564k = true;
            if (b0Var.getDurationUs() != C.TIME_UNSET) {
                a0 a0Var2 = new a0(b0Var.getScrTimestampAdjuster(), b0Var.getDurationUs(), length);
                this.f84562i = a0Var2;
                this.f84563j.seekMap(a0Var2.getSeekMap());
            } else {
                this.f84563j.seekMap(new x0(b0Var.getDurationUs()));
            }
        }
        a0 a0Var3 = this.f84562i;
        if (a0Var3 != null && a0Var3.isSeeking()) {
            return this.f84562i.handlePendingSeek(a0Var, v0Var);
        }
        a0Var.resetPeekPosition();
        long peekPosition = length != -1 ? length - a0Var.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        io.bidmachine.media3.common.util.m0 m0Var = this.f84556c;
        if (!a0Var.peekFully(m0Var.getData(), 0, 4, true)) {
            return -1;
        }
        m0Var.setPosition(0);
        int i10 = m0Var.readInt();
        if (i10 == 441) {
            return -1;
        }
        if (i10 == 442) {
            a0Var.peekFully(m0Var.getData(), 0, 10);
            m0Var.setPosition(9);
            a0Var.skipFully((m0Var.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i10 == 443) {
            a0Var.peekFully(m0Var.getData(), 0, 2);
            m0Var.setPosition(0);
            a0Var.skipFully(m0Var.readUnsignedShort() + 6);
            return 0;
        }
        if (((i10 & (-256)) >> 8) != 1) {
            a0Var.skipFully(1);
            return 0;
        }
        int i11 = i10 & 255;
        SparseArray sparseArray = this.f84555b;
        a aVar = (a) sparseArray.get(i11);
        if (!this.f84558e) {
            if (aVar == null) {
                if (i11 == 189) {
                    kVar = new b("video/mp2p");
                    this.f84559f = true;
                    this.f84561h = a0Var.getPosition();
                } else if ((i10 & 224) == 192) {
                    kVar = new r("video/mp2p");
                    this.f84559f = true;
                    this.f84561h = a0Var.getPosition();
                } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    kVar = new k("video/mp2p");
                    this.f84560g = true;
                    this.f84561h = a0Var.getPosition();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.createTracks(this.f84563j, new m0(i11, NotificationCompat.FLAG_LOCAL_ONLY));
                    aVar = new a(kVar, this.f84554a);
                    sparseArray.put(i11, aVar);
                }
            }
            if (a0Var.getPosition() > ((this.f84559f && this.f84560g) ? this.f84561h + 8192 : 1048576L)) {
                this.f84558e = true;
                this.f84563j.endTracks();
            }
        }
        a0Var.peekFully(m0Var.getData(), 0, 2);
        m0Var.setPosition(0);
        int unsignedShort = m0Var.readUnsignedShort() + 6;
        if (aVar == null) {
            a0Var.skipFully(unsignedShort);
            return 0;
        }
        m0Var.reset(unsignedShort);
        a0Var.readFully(m0Var.getData(), 0, unsignedShort);
        m0Var.setPosition(6);
        aVar.consume(m0Var);
        m0Var.setLimit(m0Var.capacity());
        return 0;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        u0 u0Var = this.f84554a;
        int i10 = 0;
        boolean z10 = u0Var.getTimestampOffsetUs() == C.TIME_UNSET;
        if (!z10) {
            long firstSampleTimestampUs = u0Var.getFirstSampleTimestampUs();
            z10 = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j11) ? false : true;
        }
        if (z10) {
            u0Var.reset(j11);
        }
        a0 a0Var = this.f84562i;
        if (a0Var != null) {
            a0Var.setSeekTargetUs(j11);
        }
        while (true) {
            SparseArray sparseArray = this.f84555b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((a) sparseArray.valueAt(i10)).seek();
            i10++;
        }
    }

    @Override // ko.z
    public boolean sniff(ko.a0 a0Var) throws IOException {
        byte[] bArr = new byte[14];
        a0Var.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        a0Var.advancePeekPosition(bArr[13] & 7);
        a0Var.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public c0(u0 u0Var) {
        this.f84554a = u0Var;
        this.f84556c = new io.bidmachine.media3.common.util.m0(4096);
        this.f84555b = new SparseArray();
        this.f84557d = new b0();
    }

    @Override // ko.z
    public void release() {
    }
}
