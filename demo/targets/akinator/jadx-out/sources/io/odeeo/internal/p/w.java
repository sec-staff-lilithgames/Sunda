package io.odeeo.internal.p;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.v;
import io.odeeo.internal.p.d0;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements io.odeeo.internal.g.h {

    /* renamed from: l, reason: collision with root package name */
    public static final io.odeeo.internal.g.l f65553l = new bt.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.q0.e0 f65554a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f65555b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65556c;

    /* renamed from: d, reason: collision with root package name */
    public final v f65557d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65558e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65559f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f65560g;

    /* renamed from: h, reason: collision with root package name */
    public long f65561h;

    /* renamed from: i, reason: collision with root package name */
    public u f65562i;

    /* renamed from: j, reason: collision with root package name */
    public io.odeeo.internal.g.j f65563j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f65564k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f65565a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.q0.e0 f65566b;

        /* renamed from: c, reason: collision with root package name */
        public final io.odeeo.internal.q0.w f65567c = new io.odeeo.internal.q0.w(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        public boolean f65568d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f65569e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f65570f;

        /* renamed from: g, reason: collision with root package name */
        public int f65571g;

        /* renamed from: h, reason: collision with root package name */
        public long f65572h;

        public a(j jVar, io.odeeo.internal.q0.e0 e0Var) {
            this.f65565a = jVar;
            this.f65566b = e0Var;
        }

        public final void a() {
            this.f65567c.skipBits(8);
            this.f65568d = this.f65567c.readBit();
            this.f65569e = this.f65567c.readBit();
            this.f65567c.skipBits(6);
            this.f65571g = this.f65567c.readBits(8);
        }

        public final void b() {
            this.f65572h = 0L;
            if (this.f65568d) {
                this.f65567c.skipBits(4);
                this.f65567c.skipBits(1);
                this.f65567c.skipBits(1);
                long bits = (this.f65567c.readBits(3) << 30) | (this.f65567c.readBits(15) << 15) | this.f65567c.readBits(15);
                this.f65567c.skipBits(1);
                if (!this.f65570f && this.f65569e) {
                    this.f65567c.skipBits(4);
                    this.f65567c.skipBits(1);
                    this.f65567c.skipBits(1);
                    this.f65567c.skipBits(1);
                    this.f65566b.adjustTsTimestamp((this.f65567c.readBits(3) << 30) | (this.f65567c.readBits(15) << 15) | this.f65567c.readBits(15));
                    this.f65570f = true;
                }
                this.f65572h = this.f65566b.adjustTsTimestamp(bits);
            }
        }

        public void consume(io.odeeo.internal.q0.x xVar) throws g0 {
            xVar.readBytes(this.f65567c.f65964a, 0, 3);
            this.f65567c.setPosition(0);
            a();
            xVar.readBytes(this.f65567c.f65964a, 0, this.f65571g);
            this.f65567c.setPosition(0);
            b();
            this.f65565a.packetStarted(this.f65572h, 4);
            this.f65565a.consume(xVar);
            this.f65565a.packetFinished();
        }

        public void seek() {
            this.f65570f = false;
            this.f65565a.seek();
        }
    }

    public w() {
        this(new io.odeeo.internal.q0.e0(0L));
    }

    public static /* synthetic */ io.odeeo.internal.g.h[] a() {
        return new io.odeeo.internal.g.h[]{new w()};
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        this.f65563j = jVar;
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        j kVar;
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65563j);
        long length = iVar.getLength();
        if (length != -1 && !this.f65557d.isDurationReadFinished()) {
            return this.f65557d.readDuration(iVar, uVar);
        }
        a(length);
        u uVar2 = this.f65562i;
        if (uVar2 != null && uVar2.isSeeking()) {
            return this.f65562i.handlePendingSeek(iVar, uVar);
        }
        iVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - iVar.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !iVar.peekFully(this.f65556c.getData(), 0, 4, true)) {
            return -1;
        }
        this.f65556c.setPosition(0);
        int i10 = this.f65556c.readInt();
        if (i10 == 441) {
            return -1;
        }
        if (i10 == 442) {
            iVar.peekFully(this.f65556c.getData(), 0, 10);
            this.f65556c.setPosition(9);
            iVar.skipFully((this.f65556c.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i10 == 443) {
            iVar.peekFully(this.f65556c.getData(), 0, 2);
            this.f65556c.setPosition(0);
            iVar.skipFully(this.f65556c.readUnsignedShort() + 6);
            return 0;
        }
        if (((i10 & (-256)) >> 8) != 1) {
            iVar.skipFully(1);
            return 0;
        }
        int i11 = i10 & 255;
        a aVar = this.f65555b.get(i11);
        if (!this.f65558e) {
            if (aVar == null) {
                if (i11 == 189) {
                    kVar = new b();
                    this.f65559f = true;
                    this.f65561h = iVar.getPosition();
                } else if ((i10 & 224) == 192) {
                    kVar = new q();
                    this.f65559f = true;
                    this.f65561h = iVar.getPosition();
                } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    kVar = new k();
                    this.f65560g = true;
                    this.f65561h = iVar.getPosition();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.createTracks(this.f65563j, new d0.d(i11, NotificationCompat.FLAG_LOCAL_ONLY));
                    aVar = new a(kVar, this.f65554a);
                    this.f65555b.put(i11, aVar);
                }
            }
            if (iVar.getPosition() > ((this.f65559f && this.f65560g) ? this.f65561h + 8192 : 1048576L)) {
                this.f65558e = true;
                this.f65563j.endTracks();
            }
        }
        iVar.peekFully(this.f65556c.getData(), 0, 2);
        this.f65556c.setPosition(0);
        int unsignedShort = this.f65556c.readUnsignedShort() + 6;
        if (aVar == null) {
            iVar.skipFully(unsignedShort);
        } else {
            this.f65556c.reset(unsignedShort);
            iVar.readFully(this.f65556c.getData(), 0, unsignedShort);
            this.f65556c.setPosition(6);
            aVar.consume(this.f65556c);
            io.odeeo.internal.q0.x xVar = this.f65556c;
            xVar.setLimit(xVar.capacity());
        }
        return 0;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f65554a.getTimestampOffsetUs() == C.TIME_UNSET;
        if (z11) {
            z10 = z11;
        } else {
            long firstSampleTimestampUs = this.f65554a.getFirstSampleTimestampUs();
            if (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j11) {
                z10 = false;
            }
        }
        if (z10) {
            this.f65554a.reset(j11);
        }
        u uVar = this.f65562i;
        if (uVar != null) {
            uVar.setSeekTargetUs(j11);
        }
        for (int i10 = 0; i10 < this.f65555b.size(); i10++) {
            this.f65555b.valueAt(i10).seek();
        }
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(io.odeeo.internal.g.i iVar) throws IOException {
        byte[] bArr = new byte[14];
        iVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iVar.advancePeekPosition(bArr[13] & 7);
        iVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public w(io.odeeo.internal.q0.e0 e0Var) {
        this.f65554a = e0Var;
        this.f65556c = new io.odeeo.internal.q0.x(4096);
        this.f65555b = new SparseArray<>();
        this.f65557d = new v();
    }

    @RequiresNonNull({"output"})
    public final void a(long j10) {
        if (this.f65564k) {
            return;
        }
        this.f65564k = true;
        if (this.f65557d.getDurationUs() == C.TIME_UNSET) {
            this.f65563j.seekMap(new v.b(this.f65557d.getDurationUs()));
            return;
        }
        u uVar = new u(this.f65557d.getScrTimestampAdjuster(), this.f65557d.getDurationUs(), j10);
        this.f65562i = uVar;
        this.f65563j.seekMap(uVar.getSeekMap());
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }
}
