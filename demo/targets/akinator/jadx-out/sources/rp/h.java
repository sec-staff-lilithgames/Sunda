package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.z0;
import io.bidmachine.media3.common.util.a1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84639a;

    /* renamed from: c, reason: collision with root package name */
    public final String f84641c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84642d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84643e;

    /* renamed from: f, reason: collision with root package name */
    public String f84644f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f84645g;

    /* renamed from: i, reason: collision with root package name */
    public int f84647i;

    /* renamed from: j, reason: collision with root package name */
    public int f84648j;

    /* renamed from: k, reason: collision with root package name */
    public long f84649k;

    /* renamed from: l, reason: collision with root package name */
    public io.bidmachine.media3.common.b f84650l;

    /* renamed from: m, reason: collision with root package name */
    public int f84651m;

    /* renamed from: n, reason: collision with root package name */
    public int f84652n;

    /* renamed from: h, reason: collision with root package name */
    public int f84646h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f84655q = C.TIME_UNSET;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f84640b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f84653o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f84654p = -1;

    public h(String str, int i10, int i11, String str2) {
        this.f84639a = new io.bidmachine.media3.common.util.m0(new byte[i11]);
        this.f84641c = str;
        this.f84642d = i10;
        this.f84643e = str2;
    }

    public final boolean a(io.bidmachine.media3.common.util.m0 m0Var, byte[] bArr, int i10) {
        int iMin = Math.min(m0Var.bytesLeft(), i10 - this.f84647i);
        m0Var.readBytes(bArr, this.f84647i, iMin);
        int i11 = this.f84647i + iMin;
        this.f84647i = i11;
        return i11 == i10;
    }

    public final void b(ko.x xVar) {
        int i10 = xVar.f71795b;
        String str = xVar.f71794a;
        int i11 = xVar.f71796c;
        if (i10 == -2147483647 || i11 == -1) {
            return;
        }
        io.bidmachine.media3.common.b bVar = this.f84650l;
        if (bVar != null && i11 == bVar.E && i10 == bVar.F && Objects.equals(str, bVar.f60665o)) {
            return;
        }
        io.bidmachine.media3.common.b bVar2 = this.f84650l;
        io.bidmachine.media3.common.b bVarBuild = (bVar2 == null ? new gn.w() : bVar2.buildUpon()).setId(this.f84644f).setContainerMimeType(this.f84643e).setSampleMimeType(str).setChannelCount(i11).setSampleRate(xVar.f71795b).setLanguage(this.f84641c).setRoleFlags(this.f84642d).build();
        this.f84650l = bVarBuild;
        this.f84645g.format(bVarBuild);
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) throws z0 {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84645g);
        while (m0Var.bytesLeft() > 0) {
            int i10 = this.f84646h;
            io.bidmachine.media3.common.util.m0 m0Var2 = this.f84639a;
            switch (i10) {
                case 0:
                    while (true) {
                        if (m0Var.bytesLeft() > 0) {
                            int i11 = this.f84648j << 8;
                            this.f84648j = i11;
                            int unsignedByte = i11 | m0Var.readUnsignedByte();
                            this.f84648j = unsignedByte;
                            int frameType = ko.y.getFrameType(unsignedByte);
                            this.f84652n = frameType;
                            if (frameType != 0) {
                                byte[] data = m0Var2.getData();
                                int i12 = this.f84648j;
                                data[0] = (byte) ((i12 >> 24) & 255);
                                data[1] = (byte) ((i12 >> 16) & 255);
                                data[2] = (byte) ((i12 >> 8) & 255);
                                data[3] = (byte) (i12 & 255);
                                this.f84647i = 4;
                                this.f84648j = 0;
                                int i13 = this.f84652n;
                                if (i13 != 3 && i13 != 4) {
                                    if (i13 != 1) {
                                        this.f84646h = 2;
                                        break;
                                    } else {
                                        this.f84646h = 1;
                                        break;
                                    }
                                } else {
                                    this.f84646h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(m0Var, m0Var2.getData(), 18)) {
                        break;
                    } else {
                        byte[] data2 = m0Var2.getData();
                        if (this.f84650l == null) {
                            io.bidmachine.media3.common.b dtsFormat = ko.y.parseDtsFormat(data2, this.f84644f, this.f84641c, this.f84642d, this.f84643e, null);
                            this.f84650l = dtsFormat;
                            this.f84645g.format(dtsFormat);
                        }
                        this.f84651m = ko.y.getDtsFrameSize(data2);
                        this.f84649k = rh.w.checkedCast(a1.sampleCountToDurationUs(ko.y.parseDtsAudioSampleCount(data2), this.f84650l.F));
                        m0Var2.setPosition(0);
                        this.f84645g.sampleData(m0Var2, 18);
                        this.f84646h = 6;
                        break;
                    }
                case 2:
                    if (!a(m0Var, m0Var2.getData(), 7)) {
                        break;
                    } else {
                        this.f84653o = ko.y.parseDtsHdHeaderSize(m0Var2.getData());
                        this.f84646h = 3;
                        break;
                    }
                case 3:
                    if (!a(m0Var, m0Var2.getData(), this.f84653o)) {
                        break;
                    } else {
                        ko.x dtsHdHeader = ko.y.parseDtsHdHeader(m0Var2.getData());
                        b(dtsHdHeader);
                        this.f84651m = dtsHdHeader.f71797d;
                        long j10 = dtsHdHeader.f71798e;
                        this.f84649k = j10 != C.TIME_UNSET ? j10 : 0L;
                        m0Var2.setPosition(0);
                        this.f84645g.sampleData(m0Var2, this.f84653o);
                        this.f84646h = 6;
                        break;
                    }
                case 4:
                    if (!a(m0Var, m0Var2.getData(), 6)) {
                        break;
                    } else {
                        int dtsUhdHeaderSize = ko.y.parseDtsUhdHeaderSize(m0Var2.getData());
                        this.f84654p = dtsUhdHeaderSize;
                        int i14 = this.f84647i;
                        if (i14 > dtsUhdHeaderSize) {
                            int i15 = i14 - dtsUhdHeaderSize;
                            this.f84647i = i14 - i15;
                            m0Var.setPosition(m0Var.getPosition() - i15);
                        }
                        this.f84646h = 5;
                        break;
                    }
                case 5:
                    if (!a(m0Var, m0Var2.getData(), this.f84654p)) {
                        break;
                    } else {
                        ko.x dtsUhdHeader = ko.y.parseDtsUhdHeader(m0Var2.getData(), this.f84640b);
                        if (this.f84652n == 3) {
                            b(dtsUhdHeader);
                        }
                        this.f84651m = dtsUhdHeader.f71797d;
                        long j11 = dtsUhdHeader.f71798e;
                        this.f84649k = j11 != C.TIME_UNSET ? j11 : 0L;
                        m0Var2.setPosition(0);
                        this.f84645g.sampleData(m0Var2, this.f84654p);
                        this.f84646h = 6;
                        break;
                    }
                case 6:
                    int iMin = Math.min(m0Var.bytesLeft(), this.f84651m - this.f84647i);
                    this.f84645g.sampleData(m0Var, iMin);
                    int i16 = this.f84647i + iMin;
                    this.f84647i = i16;
                    if (i16 == this.f84651m) {
                        io.bidmachine.media3.common.util.a.checkState(this.f84655q != C.TIME_UNSET);
                        this.f84645g.sampleMetadata(this.f84655q, this.f84652n == 4 ? 0 : 1, this.f84651m, 0, null);
                        this.f84655q += this.f84649k;
                        this.f84646h = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84644f = m0Var.getFormatId();
        this.f84645g = c0Var.track(m0Var.getTrackId(), 1);
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84655q = j10;
    }

    @Override // rp.j
    public void seek() {
        this.f84646h = 0;
        this.f84647i = 0;
        this.f84648j = 0;
        this.f84655q = C.TIME_UNSET;
        this.f84640b.set(0);
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
    }
}
