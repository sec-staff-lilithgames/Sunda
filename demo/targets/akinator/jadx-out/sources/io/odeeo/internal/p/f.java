package io.odeeo.internal.p;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.a;
import io.odeeo.internal.p.d0;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements j {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f65317v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65318a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.q0.w f65319b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65320c;

    /* renamed from: d, reason: collision with root package name */
    public final String f65321d;

    /* renamed from: e, reason: collision with root package name */
    public String f65322e;

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.g.x f65323f;

    /* renamed from: g, reason: collision with root package name */
    public io.odeeo.internal.g.x f65324g;

    /* renamed from: h, reason: collision with root package name */
    public int f65325h;

    /* renamed from: i, reason: collision with root package name */
    public int f65326i;

    /* renamed from: j, reason: collision with root package name */
    public int f65327j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f65328k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65329l;

    /* renamed from: m, reason: collision with root package name */
    public int f65330m;

    /* renamed from: n, reason: collision with root package name */
    public int f65331n;

    /* renamed from: o, reason: collision with root package name */
    public int f65332o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65333p;

    /* renamed from: q, reason: collision with root package name */
    public long f65334q;

    /* renamed from: r, reason: collision with root package name */
    public int f65335r;

    /* renamed from: s, reason: collision with root package name */
    public long f65336s;

    /* renamed from: t, reason: collision with root package name */
    public io.odeeo.internal.g.x f65337t;

    /* renamed from: u, reason: collision with root package name */
    public long f65338u;

    public f(boolean z10) {
        this(z10, null);
    }

    public static boolean isAdtsSyncWord(int i10) {
        return (i10 & 65526) == 65520;
    }

    public final boolean a(io.odeeo.internal.q0.x xVar, byte[] bArr, int i10) {
        int iMin = Math.min(xVar.bytesLeft(), i10 - this.f65326i);
        xVar.readBytes(bArr, this.f65326i, iMin);
        int i11 = this.f65326i + iMin;
        this.f65326i = i11;
        return i11 == i10;
    }

    public final void b(io.odeeo.internal.q0.x xVar) {
        byte[] data = xVar.getData();
        int position = xVar.getPosition();
        int iLimit = xVar.limit();
        while (position < iLimit) {
            int i10 = position + 1;
            byte b10 = data[position];
            int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (this.f65327j == 512 && a((byte) -1, (byte) i11) && (this.f65329l || a(xVar, position - 1))) {
                this.f65332o = (b10 & 8) >> 3;
                this.f65328k = (b10 & 1) == 0;
                if (this.f65329l) {
                    g();
                } else {
                    e();
                }
                xVar.setPosition(i10);
                return;
            }
            int i12 = this.f65327j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f65327j = 768;
            } else if (i13 == 511) {
                this.f65327j = 512;
            } else if (i13 == 836) {
                this.f65327j = 1024;
            } else if (i13 == 1075) {
                h();
                xVar.setPosition(i10);
                return;
            } else if (i12 != 256) {
                this.f65327j = NotificationCompat.FLAG_LOCAL_ONLY;
            }
            position = i10;
        }
        xVar.setPosition(position);
    }

    @RequiresNonNull({"id3Output"})
    public final void c() {
        this.f65324g.sampleData(this.f65320c, 10);
        this.f65320c.setPosition(6);
        a(this.f65324g, 0L, 10, this.f65320c.readSynchSafeInt() + 10);
    }

    @Override // io.odeeo.internal.p.j
    public void consume(io.odeeo.internal.q0.x xVar) throws g0 {
        a();
        while (xVar.bytesLeft() > 0) {
            int i10 = this.f65325h;
            if (i10 == 0) {
                b(xVar);
            } else if (i10 == 1) {
                a(xVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (a(xVar, this.f65319b.f65964a, this.f65328k ? 7 : 5)) {
                        b();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    c(xVar);
                }
            } else if (a(xVar, this.f65320c.getData(), 10)) {
                c();
            }
        }
    }

    @Override // io.odeeo.internal.p.j
    public void createTracks(io.odeeo.internal.g.j jVar, d0.d dVar) {
        dVar.generateNewId();
        this.f65322e = dVar.getFormatId();
        io.odeeo.internal.g.x xVarTrack = jVar.track(dVar.getTrackId(), 1);
        this.f65323f = xVarTrack;
        this.f65337t = xVarTrack;
        if (!this.f65318a) {
            this.f65324g = new io.odeeo.internal.g.g();
            return;
        }
        dVar.generateNewId();
        io.odeeo.internal.g.x xVarTrack2 = jVar.track(dVar.getTrackId(), 5);
        this.f65324g = xVarTrack2;
        xVarTrack2.format(new t.b().setId(dVar.getFormatId()).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
    }

    public final void d() {
        this.f65329l = false;
        f();
    }

    public final void e() {
        this.f65325h = 1;
        this.f65326i = 0;
    }

    public final void f() {
        this.f65325h = 0;
        this.f65326i = 0;
        this.f65327j = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final void g() {
        this.f65325h = 3;
        this.f65326i = 0;
    }

    public long getSampleDurationUs() {
        return this.f65334q;
    }

    public final void h() {
        this.f65325h = 2;
        this.f65326i = f65317v.length;
        this.f65335r = 0;
        this.f65320c.setPosition(0);
    }

    @Override // io.odeeo.internal.p.j
    public void packetStarted(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f65336s = j10;
        }
    }

    @Override // io.odeeo.internal.p.j
    public void seek() {
        this.f65336s = C.TIME_UNSET;
        d();
    }

    public f(boolean z10, String str) {
        this.f65319b = new io.odeeo.internal.q0.w(new byte[7]);
        this.f65320c = new io.odeeo.internal.q0.x(Arrays.copyOf(f65317v, 10));
        f();
        this.f65330m = -1;
        this.f65331n = -1;
        this.f65334q = C.TIME_UNSET;
        this.f65336s = C.TIME_UNSET;
        this.f65318a = z10;
        this.f65321d = str;
    }

    public final void a(io.odeeo.internal.g.x xVar, long j10, int i10, int i11) {
        this.f65325h = 4;
        this.f65326i = i10;
        this.f65337t = xVar;
        this.f65338u = j10;
        this.f65335r = i11;
    }

    @RequiresNonNull({"currentOutput"})
    public final void c(io.odeeo.internal.q0.x xVar) {
        int iMin = Math.min(xVar.bytesLeft(), this.f65335r - this.f65326i);
        this.f65337t.sampleData(xVar, iMin);
        int i10 = this.f65326i + iMin;
        this.f65326i = i10;
        int i11 = this.f65335r;
        if (i10 == i11) {
            long j10 = this.f65336s;
            if (j10 != C.TIME_UNSET) {
                this.f65337t.sampleMetadata(j10, 1, i11, 0, null);
                this.f65336s += this.f65338u;
            }
            f();
        }
    }

    public final void a(io.odeeo.internal.q0.x xVar) {
        if (xVar.bytesLeft() == 0) {
            return;
        }
        this.f65319b.f65964a[0] = xVar.getData()[xVar.getPosition()];
        this.f65319b.setPosition(2);
        int bits = this.f65319b.readBits(4);
        int i10 = this.f65331n;
        if (i10 != -1 && bits != i10) {
            d();
            return;
        }
        if (!this.f65329l) {
            this.f65329l = true;
            this.f65330m = this.f65332o;
            this.f65331n = bits;
        }
        g();
    }

    public final boolean a(io.odeeo.internal.q0.x xVar, int i10) {
        xVar.setPosition(i10 + 1);
        if (!b(xVar, this.f65319b.f65964a, 1)) {
            return false;
        }
        this.f65319b.setPosition(4);
        int bits = this.f65319b.readBits(1);
        int i11 = this.f65330m;
        if (i11 != -1 && bits != i11) {
            return false;
        }
        if (this.f65331n != -1) {
            if (!b(xVar, this.f65319b.f65964a, 1)) {
                return true;
            }
            this.f65319b.setPosition(2);
            if (this.f65319b.readBits(4) != this.f65331n) {
                return false;
            }
            xVar.setPosition(i10 + 2);
        }
        if (!b(xVar, this.f65319b.f65964a, 4)) {
            return true;
        }
        this.f65319b.setPosition(14);
        int bits2 = this.f65319b.readBits(13);
        if (bits2 < 7) {
            return false;
        }
        byte[] data = xVar.getData();
        int iLimit = xVar.limit();
        int i12 = i10 + bits2;
        if (i12 >= iLimit) {
            return true;
        }
        byte b10 = data[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iLimit) {
                return true;
            }
            return a((byte) -1, data[i13]) && ((data[i13] & 8) >> 3) == bits;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iLimit) {
            return true;
        }
        if (data[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iLimit || data[i15] == 51;
    }

    @Override // io.odeeo.internal.p.j
    public void packetFinished() {
    }

    public final boolean b(io.odeeo.internal.q0.x xVar, byte[] bArr, int i10) {
        if (xVar.bytesLeft() < i10) {
            return false;
        }
        xVar.readBytes(bArr, 0, i10);
        return true;
    }

    @RequiresNonNull({"output"})
    public final void b() throws g0 {
        this.f65319b.setPosition(0);
        if (!this.f65333p) {
            int i10 = 2;
            int bits = this.f65319b.readBits(2) + 1;
            if (bits != 2) {
                io.odeeo.internal.q0.p.w("AdtsReader", "Detected audio object type: " + bits + ", but assuming AAC LC.");
            } else {
                i10 = bits;
            }
            this.f65319b.skipBits(5);
            byte[] bArrBuildAudioSpecificConfig = io.odeeo.internal.d.a.buildAudioSpecificConfig(i10, this.f65331n, this.f65319b.readBits(3));
            a.b audioSpecificConfig = io.odeeo.internal.d.a.parseAudioSpecificConfig(bArrBuildAudioSpecificConfig);
            io.odeeo.internal.b.t tVarBuild = new t.b().setId(this.f65322e).setSampleMimeType(MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.f63315c).setChannelCount(audioSpecificConfig.f63314b).setSampleRate(audioSpecificConfig.f63313a).setInitializationData(Collections.singletonList(bArrBuildAudioSpecificConfig)).setLanguage(this.f65321d).build();
            this.f65334q = 1024000000 / tVarBuild.f62985z;
            this.f65323f.format(tVarBuild);
            this.f65333p = true;
        } else {
            this.f65319b.skipBits(10);
        }
        this.f65319b.skipBits(4);
        int bits2 = this.f65319b.readBits(13);
        int i11 = bits2 - 7;
        if (this.f65328k) {
            i11 = bits2 - 9;
        }
        a(this.f65323f, this.f65334q, 0, i11);
    }

    public final boolean a(byte b10, byte b11) {
        return isAdtsSyncWord(((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    public final void a() {
        io.odeeo.internal.q0.a.checkNotNull(this.f65323f);
        io.odeeo.internal.q0.g0.castNonNull(this.f65337t);
        io.odeeo.internal.q0.g0.castNonNull(this.f65324g);
    }
}
