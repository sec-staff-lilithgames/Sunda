package rp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.z0;
import java.util.Collections;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f84851a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84852b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84853c;

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84854d;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l0 f84855e;

    /* renamed from: f, reason: collision with root package name */
    public e1 f84856f;

    /* renamed from: g, reason: collision with root package name */
    public String f84857g;

    /* renamed from: h, reason: collision with root package name */
    public io.bidmachine.media3.common.b f84858h;

    /* renamed from: i, reason: collision with root package name */
    public int f84859i;

    /* renamed from: j, reason: collision with root package name */
    public int f84860j;

    /* renamed from: k, reason: collision with root package name */
    public int f84861k;

    /* renamed from: l, reason: collision with root package name */
    public int f84862l;

    /* renamed from: m, reason: collision with root package name */
    public long f84863m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f84864n;

    /* renamed from: o, reason: collision with root package name */
    public int f84865o;

    /* renamed from: p, reason: collision with root package name */
    public int f84866p;

    /* renamed from: q, reason: collision with root package name */
    public int f84867q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f84868r;

    /* renamed from: s, reason: collision with root package name */
    public long f84869s;

    /* renamed from: t, reason: collision with root package name */
    public int f84870t;

    /* renamed from: u, reason: collision with root package name */
    public long f84871u;

    /* renamed from: v, reason: collision with root package name */
    public int f84872v;

    /* renamed from: w, reason: collision with root package name */
    public String f84873w;

    public q(String str, int i10, String str2) {
        this.f84851a = str;
        this.f84852b = i10;
        this.f84853c = str2;
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(1024);
        this.f84854d = m0Var;
        this.f84855e = new io.bidmachine.media3.common.util.l0(m0Var.getData());
        this.f84863m = C.TIME_UNSET;
    }

    @Override // rp.j
    public void consume(io.bidmachine.media3.common.util.m0 m0Var) throws z0 {
        int bits;
        boolean bit;
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f84856f);
        while (m0Var.bytesLeft() > 0) {
            int i10 = this.f84859i;
            if (i10 != 0) {
                if (i10 != 1) {
                    io.bidmachine.media3.common.util.m0 m0Var2 = this.f84854d;
                    io.bidmachine.media3.common.util.l0 l0Var = this.f84855e;
                    if (i10 == 2) {
                        int unsignedByte = ((this.f84862l & (-225)) << 8) | m0Var.readUnsignedByte();
                        this.f84861k = unsignedByte;
                        if (unsignedByte > m0Var2.getData().length) {
                            m0Var2.reset(this.f84861k);
                            l0Var.reset(m0Var2.getData());
                        }
                        this.f84860j = 0;
                        this.f84859i = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(m0Var.bytesLeft(), this.f84861k - this.f84860j);
                        m0Var.readBytes(l0Var.f60741a, this.f84860j, iMin);
                        int i11 = this.f84860j + iMin;
                        this.f84860j = i11;
                        if (i11 == this.f84861k) {
                            l0Var.setPosition(0);
                            if (l0Var.readBit()) {
                                if (this.f84864n) {
                                }
                                this.f84859i = 0;
                            } else {
                                this.f84864n = true;
                                int bits2 = l0Var.readBits(1);
                                int bits3 = bits2 == 1 ? l0Var.readBits(1) : 0;
                                this.f84865o = bits3;
                                if (bits3 != 0) {
                                    throw z0.createForMalformedContainer(null, null);
                                }
                                if (bits2 == 1) {
                                    l0Var.readBits((l0Var.readBits(2) + 1) * 8);
                                }
                                if (!l0Var.readBit()) {
                                    throw z0.createForMalformedContainer(null, null);
                                }
                                this.f84866p = l0Var.readBits(6);
                                int bits4 = l0Var.readBits(4);
                                int bits5 = l0Var.readBits(3);
                                if (bits4 != 0 || bits5 != 0) {
                                    throw z0.createForMalformedContainer(null, null);
                                }
                                if (bits2 == 0) {
                                    int position = l0Var.getPosition();
                                    int iBitsLeft = l0Var.bitsLeft();
                                    ko.a audioSpecificConfig = ko.b.parseAudioSpecificConfig(l0Var, true);
                                    this.f84873w = audioSpecificConfig.f71600c;
                                    this.f84870t = audioSpecificConfig.f71598a;
                                    this.f84872v = audioSpecificConfig.f71599b;
                                    int iBitsLeft2 = iBitsLeft - l0Var.bitsLeft();
                                    l0Var.setPosition(position);
                                    byte[] bArr = new byte[(iBitsLeft2 + 7) / 8];
                                    l0Var.readBits(bArr, 0, iBitsLeft2);
                                    io.bidmachine.media3.common.b bVarBuild = new gn.w().setId(this.f84857g).setContainerMimeType(this.f84853c).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(this.f84873w).setChannelCount(this.f84872v).setSampleRate(this.f84870t).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.f84851a).setRoleFlags(this.f84852b).build();
                                    if (!bVarBuild.equals(this.f84858h)) {
                                        this.f84858h = bVarBuild;
                                        this.f84871u = 1024000000 / bVarBuild.F;
                                        this.f84856f.format(bVarBuild);
                                    }
                                } else {
                                    int iBitsLeft3 = l0Var.bitsLeft();
                                    ko.a audioSpecificConfig2 = ko.b.parseAudioSpecificConfig(l0Var, true);
                                    this.f84873w = audioSpecificConfig2.f71600c;
                                    this.f84870t = audioSpecificConfig2.f71598a;
                                    this.f84872v = audioSpecificConfig2.f71599b;
                                    l0Var.skipBits(l0Var.readBits((l0Var.readBits(2) + 1) * 8) - (iBitsLeft3 - l0Var.bitsLeft()));
                                }
                                int bits6 = l0Var.readBits(3);
                                this.f84867q = bits6;
                                if (bits6 == 0) {
                                    l0Var.skipBits(8);
                                } else if (bits6 == 1) {
                                    l0Var.skipBits(9);
                                } else if (bits6 == 3 || bits6 == 4 || bits6 == 5) {
                                    l0Var.skipBits(6);
                                } else {
                                    if (bits6 != 6 && bits6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    l0Var.skipBits(1);
                                }
                                boolean bit2 = l0Var.readBit();
                                this.f84868r = bit2;
                                this.f84869s = 0L;
                                if (bit2) {
                                    if (bits2 == 1) {
                                        this.f84869s = l0Var.readBits((l0Var.readBits(2) + 1) * 8);
                                    } else {
                                        do {
                                            bit = l0Var.readBit();
                                            this.f84869s = (this.f84869s << 8) + l0Var.readBits(8);
                                        } while (bit);
                                    }
                                }
                                if (l0Var.readBit()) {
                                    l0Var.skipBits(8);
                                }
                            }
                            if (this.f84865o != 0) {
                                throw z0.createForMalformedContainer(null, null);
                            }
                            if (this.f84866p != 0) {
                                throw z0.createForMalformedContainer(null, null);
                            }
                            if (this.f84867q != 0) {
                                throw z0.createForMalformedContainer(null, null);
                            }
                            int i12 = 0;
                            do {
                                bits = l0Var.readBits(8);
                                i12 += bits;
                            } while (bits == 255);
                            int position2 = l0Var.getPosition();
                            if ((position2 & 7) == 0) {
                                m0Var2.setPosition(position2 >> 3);
                            } else {
                                l0Var.readBits(m0Var2.getData(), 0, i12 * 8);
                                m0Var2.setPosition(0);
                            }
                            this.f84856f.sampleData(m0Var2, i12);
                            io.bidmachine.media3.common.util.a.checkState(this.f84863m != C.TIME_UNSET);
                            this.f84856f.sampleMetadata(this.f84863m, 1, i12, 0, null);
                            this.f84863m += this.f84871u;
                            if (this.f84868r) {
                                l0Var.skipBits((int) this.f84869s);
                            }
                            this.f84859i = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int unsignedByte2 = m0Var.readUnsignedByte();
                    if ((unsignedByte2 & 224) == 224) {
                        this.f84862l = unsignedByte2;
                        this.f84859i = 2;
                    } else if (unsignedByte2 != 86) {
                        this.f84859i = 0;
                    }
                }
            } else if (m0Var.readUnsignedByte() == 86) {
                this.f84859i = 1;
            }
        }
    }

    @Override // rp.j
    public void createTracks(ko.c0 c0Var, m0 m0Var) {
        m0Var.generateNewId();
        this.f84856f = c0Var.track(m0Var.getTrackId(), 1);
        this.f84857g = m0Var.getFormatId();
    }

    @Override // rp.j
    public void packetStarted(long j10, int i10) {
        this.f84863m = j10;
    }

    @Override // rp.j
    public void seek() {
        this.f84859i = 0;
        this.f84863m = C.TIME_UNSET;
        this.f84864n = false;
    }

    @Override // rp.j
    public void packetFinished(boolean z10) {
    }
}
