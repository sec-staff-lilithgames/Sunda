package rp;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ko.e1;
import ko.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84874a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f84875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84877d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84878e;

    /* renamed from: f, reason: collision with root package name */
    public e1 f84879f;

    /* renamed from: g, reason: collision with root package name */
    public String f84880g;

    /* renamed from: h, reason: collision with root package name */
    public int f84881h;

    /* renamed from: i, reason: collision with root package name */
    public int f84882i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84883j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84884k;

    /* renamed from: l, reason: collision with root package name */
    public long f84885l;

    /* renamed from: m, reason: collision with root package name */
    public int f84886m;

    /* renamed from: n, reason: collision with root package name */
    public long f84887n;

    public r(String str) {
        this(null, 0, str);
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84879f);
        while (m0Var.bytesLeft() > 0) {
            int i10 = this.f84881h;
            io.bidmachine.media3.common.util.m0 m0Var2 = this.f84874a;
            if (i10 == 0) {
                byte[] data = m0Var.getData();
                int position = m0Var.getPosition();
                int iLimit = m0Var.limit();
                while (true) {
                    if (position >= iLimit) {
                        m0Var.setPosition(iLimit);
                        break;
                    }
                    byte b10 = data[position];
                    boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z11 = this.f84884k && (b10 & 224) == 224;
                    this.f84884k = z10;
                    if (z11) {
                        m0Var.setPosition(position + 1);
                        this.f84884k = false;
                        m0Var2.getData()[1] = data[position];
                        this.f84882i = 2;
                        this.f84881h = 1;
                        break;
                    }
                    position++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(m0Var.bytesLeft(), 4 - this.f84882i);
                m0Var.readBytes(m0Var2.getData(), this.f84882i, iMin);
                int i11 = this.f84882i + iMin;
                this.f84882i = i11;
                if (i11 >= 4) {
                    m0Var2.setPosition(0);
                    int i12 = m0Var2.readInt();
                    r0 r0Var = this.f84875b;
                    if (r0Var.setForHeaderData(i12)) {
                        this.f84886m = r0Var.f71748c;
                        if (!this.f84883j) {
                            this.f84885l = (r0Var.f71752g * 1000000) / r0Var.f71749d;
                            this.f84879f.format(new gn.w().setId(this.f84880g).setContainerMimeType(this.f84878e).setSampleMimeType(r0Var.f71747b).setMaxInputSize(4096).setChannelCount(r0Var.f71750e).setSampleRate(r0Var.f71749d).setLanguage(this.f84876c).setRoleFlags(this.f84877d).build());
                            this.f84883j = true;
                        }
                        m0Var2.setPosition(0);
                        this.f84879f.sampleData(m0Var2, 4);
                        this.f84881h = 2;
                    } else {
                        this.f84882i = 0;
                        this.f84881h = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(m0Var.bytesLeft(), this.f84886m - this.f84882i);
                this.f84879f.sampleData(m0Var, iMin2);
                int i13 = this.f84882i + iMin2;
                this.f84882i = i13;
                if (i13 >= this.f84886m) {
                    io.bidmachine.media3.common.util.a.checkState(this.f84887n != C.TIME_UNSET);
                    this.f84879f.sampleMetadata(this.f84887n, 1, this.f84886m, 0, null);
                    this.f84887n += this.f84885l;
                    this.f84882i = 0;
                    this.f84881h = 0;
                }
            }
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84880g = m0Var.getFormatId();
        this.f84879f = c0Var.track(m0Var.getTrackId(), 1);
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84887n = j10;
    }

    @Override // rp.j
    public void seek() {
        this.f84881h = 0;
        this.f84882i = 0;
        this.f84884k = false;
        this.f84887n = C.TIME_UNSET;
    }

    public r(String str, int i10, String str2) {
        this.f84881h = 0;
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(4);
        this.f84874a = m0Var;
        m0Var.getData()[0] = -1;
        this.f84875b = new r0();
        this.f84887n = C.TIME_UNSET;
        this.f84876c = str;
        this.f84877d = i10;
        this.f84878e = str2;
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
    }
}
