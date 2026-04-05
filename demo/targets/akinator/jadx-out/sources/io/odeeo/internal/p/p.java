package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.a;
import io.odeeo.internal.p.d0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f65490a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65491b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.w f65492c;

    /* renamed from: d, reason: collision with root package name */
    public io.odeeo.internal.g.x f65493d;

    /* renamed from: e, reason: collision with root package name */
    public String f65494e;

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.b.t f65495f;

    /* renamed from: g, reason: collision with root package name */
    public int f65496g;

    /* renamed from: h, reason: collision with root package name */
    public int f65497h;

    /* renamed from: i, reason: collision with root package name */
    public int f65498i;

    /* renamed from: j, reason: collision with root package name */
    public int f65499j;

    /* renamed from: k, reason: collision with root package name */
    public long f65500k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65501l;

    /* renamed from: m, reason: collision with root package name */
    public int f65502m;

    /* renamed from: n, reason: collision with root package name */
    public int f65503n;

    /* renamed from: o, reason: collision with root package name */
    public int f65504o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65505p;

    /* renamed from: q, reason: collision with root package name */
    public long f65506q;

    /* renamed from: r, reason: collision with root package name */
    public int f65507r;

    /* renamed from: s, reason: collision with root package name */
    public long f65508s;

    /* renamed from: t, reason: collision with root package name */
    public int f65509t;

    /* renamed from: u, reason: collision with root package name */
    public String f65510u;

    public p(String str) {
        this.f65490a = str;
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(1024);
        this.f65491b = xVar;
        this.f65492c = new io.odeeo.internal.q0.w(xVar.getData());
        this.f65500k = C.TIME_UNSET;
    }

    @RequiresNonNull({"output"})
    public final void a(io.odeeo.internal.q0.w wVar, int i10) {
        int position = wVar.getPosition();
        if ((position & 7) == 0) {
            this.f65491b.setPosition(position >> 3);
        } else {
            wVar.readBits(this.f65491b.getData(), 0, i10 * 8);
            this.f65491b.setPosition(0);
        }
        this.f65493d.sampleData(this.f65491b, i10);
        long j10 = this.f65500k;
        if (j10 != C.TIME_UNSET) {
            this.f65493d.sampleMetadata(j10, 1, i10, 0, null);
            this.f65500k += this.f65508s;
        }
    }

    @RequiresNonNull({"output"})
    public final void b(io.odeeo.internal.q0.w wVar) throws g0 {
        if (!wVar.readBit()) {
            this.f65501l = true;
            f(wVar);
        } else if (!this.f65501l) {
            return;
        }
        if (this.f65502m != 0) {
            throw g0.createForMalformedContainer(null, null);
        }
        if (this.f65503n != 0) {
            throw g0.createForMalformedContainer(null, null);
        }
        a(wVar, e(wVar));
        if (this.f65505p) {
            wVar.skipBits((int) this.f65506q);
        }
    }

    public final int c(io.odeeo.internal.q0.w wVar) throws g0 {
        int iBitsLeft = wVar.bitsLeft();
        a.b audioSpecificConfig = io.odeeo.internal.d.a.parseAudioSpecificConfig(wVar, true);
        this.f65510u = audioSpecificConfig.f63315c;
        this.f65507r = audioSpecificConfig.f63313a;
        this.f65509t = audioSpecificConfig.f63314b;
        return iBitsLeft - wVar.bitsLeft();
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) throws g0 {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65493d);
        while (xVar.bytesLeft() > 0) {
            int i10 = this.f65496g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int unsignedByte = xVar.readUnsignedByte();
                    if ((unsignedByte & 224) == 224) {
                        this.f65499j = unsignedByte;
                        this.f65496g = 2;
                    } else if (unsignedByte != 86) {
                        this.f65496g = 0;
                    }
                } else if (i10 == 2) {
                    int unsignedByte2 = ((this.f65499j & (-225)) << 8) | xVar.readUnsignedByte();
                    this.f65498i = unsignedByte2;
                    if (unsignedByte2 > this.f65491b.getData().length) {
                        a(this.f65498i);
                    }
                    this.f65497h = 0;
                    this.f65496g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(xVar.bytesLeft(), this.f65498i - this.f65497h);
                    xVar.readBytes(this.f65492c.f65964a, this.f65497h, iMin);
                    int i11 = this.f65497h + iMin;
                    this.f65497h = i11;
                    if (i11 == this.f65498i) {
                        this.f65492c.setPosition(0);
                        b(this.f65492c);
                        this.f65496g = 0;
                    }
                }
            } else if (xVar.readUnsignedByte() == 86) {
                this.f65496g = 1;
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65493d = jVar.track(dVar.getTrackId(), 1);
        this.f65494e = dVar.getFormatId();
    }

    public final void d(io.odeeo.internal.q0.w wVar) {
        int bits = wVar.readBits(3);
        this.f65504o = bits;
        if (bits == 0) {
            wVar.skipBits(8);
            return;
        }
        if (bits == 1) {
            wVar.skipBits(9);
            return;
        }
        if (bits == 3 || bits == 4 || bits == 5) {
            wVar.skipBits(6);
        } else {
            if (bits != 6 && bits != 7) {
                throw new IllegalStateException();
            }
            wVar.skipBits(1);
        }
    }

    public final int e(io.odeeo.internal.q0.w wVar) throws g0 {
        int bits;
        if (this.f65504o != 0) {
            throw g0.createForMalformedContainer(null, null);
        }
        int i10 = 0;
        do {
            bits = wVar.readBits(8);
            i10 += bits;
        } while (bits == 255);
        return i10;
    }

    @RequiresNonNull({"output"})
    public final void f(io.odeeo.internal.q0.w wVar) throws g0 {
        boolean bit;
        int bits = wVar.readBits(1);
        int bits2 = bits == 1 ? wVar.readBits(1) : 0;
        this.f65502m = bits2;
        if (bits2 != 0) {
            throw g0.createForMalformedContainer(null, null);
        }
        if (bits == 1) {
            a(wVar);
        }
        if (!wVar.readBit()) {
            throw g0.createForMalformedContainer(null, null);
        }
        this.f65503n = wVar.readBits(6);
        int bits3 = wVar.readBits(4);
        int bits4 = wVar.readBits(3);
        if (bits3 != 0 || bits4 != 0) {
            throw g0.createForMalformedContainer(null, null);
        }
        if (bits == 0) {
            int position = wVar.getPosition();
            int iC = c(wVar);
            wVar.setPosition(position);
            byte[] bArr = new byte[(iC + 7) / 8];
            wVar.readBits(bArr, 0, iC);
            io.odeeo.internal.b.t tVarBuild = new t.b().setId(this.f65494e).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(this.f65510u).setChannelCount(this.f65509t).setSampleRate(this.f65507r).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.f65490a).build();
            if (!tVarBuild.equals(this.f65495f)) {
                this.f65495f = tVarBuild;
                this.f65508s = 1024000000 / tVarBuild.f62985z;
                this.f65493d.format(tVarBuild);
            }
        } else {
            wVar.skipBits(((int) a(wVar)) - c(wVar));
        }
        d(wVar);
        boolean bit2 = wVar.readBit();
        this.f65505p = bit2;
        this.f65506q = 0L;
        if (bit2) {
            if (bits == 1) {
                this.f65506q = a(wVar);
            } else {
                do {
                    bit = wVar.readBit();
                    this.f65506q = (this.f65506q << 8) + wVar.readBits(8);
                } while (bit);
            }
        }
        if (wVar.readBit()) {
            wVar.skipBits(8);
        }
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65500k = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65496g = 0;
        this.f65500k = C.TIME_UNSET;
        this.f65501l = false;
    }

    public final void a(int i10) {
        this.f65491b.reset(i10);
        this.f65492c.reset(this.f65491b.getData());
    }

    public static long a(io.odeeo.internal.q0.w wVar) {
        return wVar.readBits((wVar.readBits(2) + 1) * 8);
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }
}
