package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l0 f84529a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84530b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84531c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84532d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84533e;

    /* renamed from: f, reason: collision with root package name */
    public String f84534f;

    /* renamed from: g, reason: collision with root package name */
    public e1 f84535g;

    /* renamed from: h, reason: collision with root package name */
    public int f84536h;

    /* renamed from: i, reason: collision with root package name */
    public int f84537i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84538j;

    /* renamed from: k, reason: collision with root package name */
    public long f84539k;

    /* renamed from: l, reason: collision with root package name */
    public io.bidmachine.media3.common.b f84540l;

    /* renamed from: m, reason: collision with root package name */
    public int f84541m;

    /* renamed from: n, reason: collision with root package name */
    public long f84542n;

    public b(String str) {
        this(null, 0, str);
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84535g);
        while (m0Var.bytesLeft() > 0) {
            int i10 = this.f84536h;
            io.bidmachine.media3.common.util.m0 m0Var2 = this.f84530b;
            if (i10 == 0) {
                while (true) {
                    if (m0Var.bytesLeft() <= 0) {
                        break;
                    }
                    if (this.f84538j) {
                        int unsignedByte = m0Var.readUnsignedByte();
                        if (unsignedByte == 119) {
                            this.f84538j = false;
                            this.f84536h = 1;
                            m0Var2.getData()[0] = 11;
                            m0Var2.getData()[1] = 119;
                            this.f84537i = 2;
                            break;
                        }
                        this.f84538j = unsignedByte == 11;
                    } else {
                        this.f84538j = m0Var.readUnsignedByte() == 11;
                    }
                }
            } else if (i10 == 1) {
                byte[] data = m0Var2.getData();
                int iMin = Math.min(m0Var.bytesLeft(), 128 - this.f84537i);
                m0Var.readBytes(data, this.f84537i, iMin);
                int i11 = this.f84537i + iMin;
                this.f84537i = i11;
                if (i11 == 128) {
                    io.bidmachine.media3.common.util.l0 l0Var = this.f84529a;
                    l0Var.setPosition(0);
                    ko.c ac3SyncframeInfo = ko.d.parseAc3SyncframeInfo(l0Var);
                    io.bidmachine.media3.common.b bVar = this.f84540l;
                    if (bVar == null || ac3SyncframeInfo.f71614c != bVar.E || ac3SyncframeInfo.f71613b != bVar.F || !Objects.equals(ac3SyncframeInfo.f71612a, bVar.f60665o)) {
                        gn.w containerMimeType = new gn.w().setId(this.f84534f).setContainerMimeType(this.f84533e);
                        String str = ac3SyncframeInfo.f71612a;
                        int i12 = ac3SyncframeInfo.f71617f;
                        gn.w peakBitrate = containerMimeType.setSampleMimeType(str).setChannelCount(ac3SyncframeInfo.f71614c).setSampleRate(ac3SyncframeInfo.f71613b).setLanguage(this.f84531c).setRoleFlags(this.f84532d).setPeakBitrate(i12);
                        if (MimeTypes.AUDIO_AC3.equals(ac3SyncframeInfo.f71612a)) {
                            peakBitrate.setAverageBitrate(i12);
                        }
                        io.bidmachine.media3.common.b bVarBuild = peakBitrate.build();
                        this.f84540l = bVarBuild;
                        this.f84535g.format(bVarBuild);
                    }
                    this.f84541m = ac3SyncframeInfo.f71615d;
                    this.f84539k = (ac3SyncframeInfo.f71616e * 1000000) / this.f84540l.F;
                    m0Var2.setPosition(0);
                    this.f84535g.sampleData(m0Var2, 128);
                    this.f84536h = 2;
                }
            } else if (i10 == 2) {
                int iMin2 = Math.min(m0Var.bytesLeft(), this.f84541m - this.f84537i);
                this.f84535g.sampleData(m0Var, iMin2);
                int i13 = this.f84537i + iMin2;
                this.f84537i = i13;
                if (i13 == this.f84541m) {
                    io.bidmachine.media3.common.util.a.checkState(this.f84542n != C.TIME_UNSET);
                    this.f84535g.sampleMetadata(this.f84542n, 1, this.f84541m, 0, null);
                    this.f84542n += this.f84539k;
                    this.f84536h = 0;
                }
            }
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84534f = m0Var.getFormatId();
        this.f84535g = c0Var.track(m0Var.getTrackId(), 1);
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84542n = j10;
    }

    @Override // rp.j
    public void seek() {
        this.f84536h = 0;
        this.f84537i = 0;
        this.f84538j = false;
        this.f84542n = C.TIME_UNSET;
    }

    public b(String str, int i10, String str2) {
        io.bidmachine.media3.common.util.l0 l0Var = new io.bidmachine.media3.common.util.l0(new byte[128]);
        this.f84529a = l0Var;
        this.f84530b = new io.bidmachine.media3.common.util.m0(l0Var.f60741a);
        this.f84536h = 0;
        this.f84542n = C.TIME_UNSET;
        this.f84531c = str;
        this.f84532d = i10;
        this.f84533e = str2;
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
    }
}
