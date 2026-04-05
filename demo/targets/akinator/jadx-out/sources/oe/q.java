package oe;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f79244a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f79245b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f79246c;

    /* renamed from: d, reason: collision with root package name */
    public ee.l0 f79247d;

    /* renamed from: e, reason: collision with root package name */
    public String f79248e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f79249f;

    /* renamed from: g, reason: collision with root package name */
    public int f79250g;

    /* renamed from: h, reason: collision with root package name */
    public int f79251h;

    /* renamed from: i, reason: collision with root package name */
    public int f79252i;

    /* renamed from: j, reason: collision with root package name */
    public int f79253j;

    /* renamed from: k, reason: collision with root package name */
    public long f79254k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79255l;

    /* renamed from: m, reason: collision with root package name */
    public int f79256m;

    /* renamed from: n, reason: collision with root package name */
    public int f79257n;

    /* renamed from: o, reason: collision with root package name */
    public int f79258o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f79259p;

    /* renamed from: q, reason: collision with root package name */
    public long f79260q;

    /* renamed from: r, reason: collision with root package name */
    public int f79261r;

    /* renamed from: s, reason: collision with root package name */
    public long f79262s;

    /* renamed from: t, reason: collision with root package name */
    public int f79263t;

    /* renamed from: u, reason: collision with root package name */
    public String f79264u;

    public q(String str) {
        this.f79244a = str;
        v0 v0Var = new v0(1024);
        this.f79245b = v0Var;
        this.f79246c = new u0(v0Var.getData());
        this.f79254k = C.TIME_UNSET;
    }

    @Override // oe.j
    public void consume(v0 v0Var) throws h2 {
        int bits;
        boolean bit;
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f79247d);
        while (v0Var.bytesLeft() > 0) {
            int i10 = this.f79250g;
            if (i10 != 0) {
                if (i10 != 1) {
                    v0 v0Var2 = this.f79245b;
                    u0 u0Var = this.f79246c;
                    if (i10 == 2) {
                        int unsignedByte = ((this.f79253j & (-225)) << 8) | v0Var.readUnsignedByte();
                        this.f79252i = unsignedByte;
                        if (unsignedByte > v0Var2.getData().length) {
                            v0Var2.reset(this.f79252i);
                            u0Var.reset(v0Var2.getData());
                        }
                        this.f79251h = 0;
                        this.f79250g = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(v0Var.bytesLeft(), this.f79252i - this.f79251h);
                        v0Var.readBytes(u0Var.f28575a, this.f79251h, iMin);
                        int i11 = this.f79251h + iMin;
                        this.f79251h = i11;
                        if (i11 == this.f79252i) {
                            u0Var.setPosition(0);
                            if (u0Var.readBit()) {
                                if (this.f79255l) {
                                }
                                this.f79250g = 0;
                            } else {
                                this.f79255l = true;
                                int bits2 = u0Var.readBits(1);
                                int bits3 = bits2 == 1 ? u0Var.readBits(1) : 0;
                                this.f79256m = bits3;
                                if (bits3 != 0) {
                                    throw h2.createForMalformedContainer(null, null);
                                }
                                if (bits2 == 1) {
                                    u0Var.readBits((u0Var.readBits(2) + 1) * 8);
                                }
                                if (!u0Var.readBit()) {
                                    throw h2.createForMalformedContainer(null, null);
                                }
                                this.f79257n = u0Var.readBits(6);
                                int bits4 = u0Var.readBits(4);
                                int bits5 = u0Var.readBits(3);
                                if (bits4 != 0 || bits5 != 0) {
                                    throw h2.createForMalformedContainer(null, null);
                                }
                                if (bits2 == 0) {
                                    int position = u0Var.getPosition();
                                    int iBitsLeft = u0Var.bitsLeft();
                                    com.google.android.exoplayer2.audio.a audioSpecificConfig = com.google.android.exoplayer2.audio.b.parseAudioSpecificConfig(u0Var, true);
                                    this.f79264u = audioSpecificConfig.f27045c;
                                    this.f79261r = audioSpecificConfig.f27043a;
                                    this.f79263t = audioSpecificConfig.f27044b;
                                    int iBitsLeft2 = iBitsLeft - u0Var.bitsLeft();
                                    u0Var.setPosition(position);
                                    byte[] bArr = new byte[(iBitsLeft2 + 7) / 8];
                                    u0Var.readBits(bArr, 0, iBitsLeft2);
                                    z0 z0VarBuild = new y0().setId(this.f79248e).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(this.f79264u).setChannelCount(this.f79263t).setSampleRate(this.f79261r).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.f79244a).build();
                                    if (!z0VarBuild.equals(this.f79249f)) {
                                        this.f79249f = z0VarBuild;
                                        this.f79262s = 1024000000 / z0VarBuild.B;
                                        this.f79247d.format(z0VarBuild);
                                    }
                                } else {
                                    int iBitsLeft3 = u0Var.bitsLeft();
                                    com.google.android.exoplayer2.audio.a audioSpecificConfig2 = com.google.android.exoplayer2.audio.b.parseAudioSpecificConfig(u0Var, true);
                                    this.f79264u = audioSpecificConfig2.f27045c;
                                    this.f79261r = audioSpecificConfig2.f27043a;
                                    this.f79263t = audioSpecificConfig2.f27044b;
                                    u0Var.skipBits(u0Var.readBits((u0Var.readBits(2) + 1) * 8) - (iBitsLeft3 - u0Var.bitsLeft()));
                                }
                                int bits6 = u0Var.readBits(3);
                                this.f79258o = bits6;
                                if (bits6 == 0) {
                                    u0Var.skipBits(8);
                                } else if (bits6 == 1) {
                                    u0Var.skipBits(9);
                                } else if (bits6 == 3 || bits6 == 4 || bits6 == 5) {
                                    u0Var.skipBits(6);
                                } else {
                                    if (bits6 != 6 && bits6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    u0Var.skipBits(1);
                                }
                                boolean bit2 = u0Var.readBit();
                                this.f79259p = bit2;
                                this.f79260q = 0L;
                                if (bit2) {
                                    if (bits2 == 1) {
                                        this.f79260q = u0Var.readBits((u0Var.readBits(2) + 1) * 8);
                                    } else {
                                        do {
                                            bit = u0Var.readBit();
                                            this.f79260q = (this.f79260q << 8) + u0Var.readBits(8);
                                        } while (bit);
                                    }
                                }
                                if (u0Var.readBit()) {
                                    u0Var.skipBits(8);
                                }
                            }
                            if (this.f79256m != 0) {
                                throw h2.createForMalformedContainer(null, null);
                            }
                            if (this.f79257n != 0) {
                                throw h2.createForMalformedContainer(null, null);
                            }
                            if (this.f79258o != 0) {
                                throw h2.createForMalformedContainer(null, null);
                            }
                            int i12 = 0;
                            do {
                                bits = u0Var.readBits(8);
                                i12 += bits;
                            } while (bits == 255);
                            int position2 = u0Var.getPosition();
                            if ((position2 & 7) == 0) {
                                v0Var2.setPosition(position2 >> 3);
                            } else {
                                u0Var.readBits(v0Var2.getData(), 0, i12 * 8);
                                v0Var2.setPosition(0);
                            }
                            this.f79247d.sampleData(v0Var2, i12);
                            long j10 = this.f79254k;
                            if (j10 != C.TIME_UNSET) {
                                this.f79247d.sampleMetadata(j10, 1, i12, 0, null);
                                this.f79254k += this.f79262s;
                            }
                            if (this.f79259p) {
                                u0Var.skipBits((int) this.f79260q);
                            }
                            this.f79250g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int unsignedByte2 = v0Var.readUnsignedByte();
                    if ((unsignedByte2 & 224) == 224) {
                        this.f79253j = unsignedByte2;
                        this.f79250g = 2;
                    } else if (unsignedByte2 != 86) {
                        this.f79250g = 0;
                    }
                }
            } else if (v0Var.readUnsignedByte() == 86) {
                this.f79250g = 1;
            }
        }
    }

    @Override // oe.j
    public void createTracks(ee.s sVar, i0 i0Var) {
        i0Var.generateNewId();
        this.f79247d = sVar.track(i0Var.getTrackId(), 1);
        this.f79248e = i0Var.getFormatId();
    }

    @Override // oe.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f79254k = j10;
        }
    }

    @Override // oe.j
    public void seek() {
        this.f79250g = 0;
        this.f79254k = C.TIME_UNSET;
        this.f79255l = false;
    }

    @Override // oe.j
    public void packetFinished() {
    }
}
