package po;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.u0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.e1;
import ko.f0;
import ko.g0;
import ko.h0;
import ko.i0;
import ko.j0;
import ko.k0;
import ko.v0;
import ko.x0;
import ko.y0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements z {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f81597a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f81598b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81599c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f81600d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f81601e;

    /* renamed from: f, reason: collision with root package name */
    public e1 f81602f;

    /* renamed from: g, reason: collision with root package name */
    public int f81603g;

    /* renamed from: h, reason: collision with root package name */
    public u0 f81604h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f81605i;

    /* renamed from: j, reason: collision with root package name */
    public int f81606j;

    /* renamed from: k, reason: collision with root package name */
    public int f81607k;

    /* renamed from: l, reason: collision with root package name */
    public b f81608l;

    /* renamed from: m, reason: collision with root package name */
    public int f81609m;

    /* renamed from: n, reason: collision with root package name */
    public long f81610n;

    public c() {
        this(0);
    }

    public final void a() {
        ((e1) a1.castNonNull(this.f81602f)).sampleMetadata((this.f81610n * 1000000) / ((k0) a1.castNonNull(this.f81605i)).f71693e, 1, this.f81609m, 0, null);
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        this.f81601e = c0Var;
        this.f81602f = c0Var.track(0, 1);
        c0Var.endTracks();
    }

    @Override // ko.z
    public int read(a0 a0Var, v0 v0Var) throws IOException {
        y0 x0Var;
        boolean z10;
        long j10;
        boolean zCheckAndReadFrameHeader;
        int i10 = this.f81603g;
        if (i10 == 0) {
            this.f81604h = i0.readId3Metadata(a0Var, !this.f81599c);
            this.f81603g = 1;
            return 0;
        }
        byte[] bArr = this.f81597a;
        if (i10 == 1) {
            a0Var.peekFully(bArr, 0, bArr.length);
            a0Var.resetPeekPosition();
            this.f81603g = 2;
            return 0;
        }
        if (i10 == 2) {
            i0.readStreamMarker(a0Var);
            this.f81603g = 3;
            return 0;
        }
        if (i10 == 3) {
            h0 h0Var = new h0(this.f81605i);
            boolean metadataBlock = false;
            while (!metadataBlock) {
                metadataBlock = i0.readMetadataBlock(a0Var, h0Var);
                this.f81605i = (k0) a1.castNonNull(h0Var.f71662a);
            }
            io.bidmachine.media3.common.util.a.checkNotNull(this.f81605i);
            this.f81606j = Math.max(this.f81605i.f71691c, 6);
            ((e1) a1.castNonNull(this.f81602f)).format(this.f81605i.getFormat(bArr, this.f81604h).buildUpon().setContainerMimeType(MimeTypes.AUDIO_FLAC).build());
            ((e1) a1.castNonNull(this.f81602f)).durationUs(this.f81605i.getDurationUs());
            this.f81603g = 4;
            return 0;
        }
        if (i10 == 4) {
            this.f81607k = i0.getFrameStartMarker(a0Var);
            c0 c0Var = (c0) a1.castNonNull(this.f81601e);
            long position = a0Var.getPosition();
            long length = a0Var.getLength();
            io.bidmachine.media3.common.util.a.checkNotNull(this.f81605i);
            k0 k0Var = this.f81605i;
            if (k0Var.f71699k != null) {
                x0Var = new j0(k0Var, position);
            } else if (length == -1 || k0Var.f71698j <= 0) {
                x0Var = new x0(k0Var.getDurationUs());
            } else {
                b bVar = new b(k0Var, this.f81607k, position, length);
                this.f81608l = bVar;
                x0Var = bVar.getSeekMap();
            }
            c0Var.seekMap(x0Var);
            this.f81603g = 5;
            return 0;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        io.bidmachine.media3.common.util.a.checkNotNull(this.f81602f);
        io.bidmachine.media3.common.util.a.checkNotNull(this.f81605i);
        b bVar2 = this.f81608l;
        if (bVar2 != null && bVar2.isSeeking()) {
            return this.f81608l.handlePendingSeek(a0Var, v0Var);
        }
        if (this.f81610n == -1) {
            this.f81610n = g0.getFirstSampleNumber(a0Var, this.f81605i);
            return 0;
        }
        m0 m0Var = this.f81598b;
        int iLimit = m0Var.limit();
        if (iLimit < 32768) {
            int i11 = a0Var.read(m0Var.getData(), iLimit, 32768 - iLimit);
            z10 = i11 == -1;
            if (!z10) {
                m0Var.setLimit(iLimit + i11);
            } else if (m0Var.bytesLeft() == 0) {
                a();
                return -1;
            }
        } else {
            z10 = false;
        }
        int position2 = m0Var.getPosition();
        int i12 = this.f81609m;
        int i13 = this.f81606j;
        if (i12 < i13) {
            m0Var.skipBytes(Math.min(i13 - i12, m0Var.bytesLeft()));
        }
        io.bidmachine.media3.common.util.a.checkNotNull(this.f81605i);
        int position3 = m0Var.getPosition();
        while (true) {
            int iLimit2 = m0Var.limit() - 16;
            f0 f0Var = this.f81600d;
            if (position3 <= iLimit2) {
                m0Var.setPosition(position3);
                if (g0.checkAndReadFrameHeader(m0Var, this.f81605i, this.f81607k, f0Var)) {
                    m0Var.setPosition(position3);
                    j10 = f0Var.f71637a;
                    break;
                }
                position3++;
            } else {
                if (z10) {
                    while (position3 <= m0Var.limit() - this.f81606j) {
                        m0Var.setPosition(position3);
                        try {
                            zCheckAndReadFrameHeader = g0.checkAndReadFrameHeader(m0Var, this.f81605i, this.f81607k, f0Var);
                        } catch (IndexOutOfBoundsException unused) {
                            zCheckAndReadFrameHeader = false;
                        }
                        if (m0Var.getPosition() > m0Var.limit()) {
                            zCheckAndReadFrameHeader = false;
                        }
                        if (zCheckAndReadFrameHeader) {
                            m0Var.setPosition(position3);
                            j10 = f0Var.f71637a;
                            break;
                        }
                        position3++;
                    }
                    m0Var.setPosition(m0Var.limit());
                } else {
                    m0Var.setPosition(position3);
                }
                j10 = -1;
            }
        }
        int position4 = m0Var.getPosition() - position2;
        m0Var.setPosition(position2);
        this.f81602f.sampleData(m0Var, position4);
        this.f81609m += position4;
        if (j10 != -1) {
            a();
            this.f81609m = 0;
            this.f81610n = j10;
        }
        int length2 = m0Var.getData().length - m0Var.limit();
        if (m0Var.bytesLeft() < 16 && length2 < 16) {
            int iBytesLeft = m0Var.bytesLeft();
            System.arraycopy(m0Var.getData(), m0Var.getPosition(), m0Var.getData(), 0, iBytesLeft);
            m0Var.setPosition(0);
            m0Var.setLimit(iBytesLeft);
        }
        return 0;
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f81603g = 0;
        } else {
            b bVar = this.f81608l;
            if (bVar != null) {
                bVar.setSeekTargetUs(j11);
            }
        }
        this.f81610n = j11 != 0 ? -1L : 0L;
        this.f81609m = 0;
        this.f81598b.reset(0);
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        i0.peekId3Metadata(a0Var, false);
        return i0.checkAndPeekStreamMarker(a0Var);
    }

    public c(int i10) {
        this.f81597a = new byte[42];
        this.f81598b = new m0(new byte[32768], 0);
        this.f81599c = (i10 & 1) != 0;
        this.f81600d = new f0();
        this.f81603g = 0;
    }

    @Override // ko.z
    public void release() {
    }
}
