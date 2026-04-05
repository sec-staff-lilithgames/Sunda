package io.odeeo.internal.p;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.v;
import io.odeeo.internal.p.d0;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements io.odeeo.internal.g.h {

    /* renamed from: m, reason: collision with root package name */
    public static final io.odeeo.internal.g.l f65304m = new bt.a(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f65305a;

    /* renamed from: b, reason: collision with root package name */
    public final f f65306b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65307c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.q0.x f65308d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.q0.w f65309e;

    /* renamed from: f, reason: collision with root package name */
    public io.odeeo.internal.g.j f65310f;

    /* renamed from: g, reason: collision with root package name */
    public long f65311g;

    /* renamed from: h, reason: collision with root package name */
    public long f65312h;

    /* renamed from: i, reason: collision with root package name */
    public int f65313i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65314j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f65315k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65316l;

    public e() {
        this(0);
    }

    public static /* synthetic */ io.odeeo.internal.g.h[] a() {
        return new io.odeeo.internal.g.h[]{new e()};
    }

    public final int b(io.odeeo.internal.g.i iVar) throws IOException {
        int i10 = 0;
        while (true) {
            iVar.peekFully(this.f65308d.getData(), 0, 10);
            this.f65308d.setPosition(0);
            if (this.f65308d.readUnsignedInt24() != 4801587) {
                break;
            }
            this.f65308d.skipBytes(3);
            int synchSafeInt = this.f65308d.readSynchSafeInt();
            i10 += synchSafeInt + 10;
            iVar.advancePeekPosition(synchSafeInt);
        }
        iVar.resetPeekPosition();
        iVar.advancePeekPosition(i10);
        if (this.f65312h == -1) {
            this.f65312h = i10;
        }
        return i10;
    }

    @Override // io.odeeo.internal.g.h
    public void init(io.odeeo.internal.g.j jVar) {
        this.f65310f = jVar;
        this.f65306b.createTracks(jVar, new d0.d(0, 1));
        jVar.endTracks();
    }

    @Override // io.odeeo.internal.g.h
    public int read(io.odeeo.internal.g.i iVar, io.odeeo.internal.g.u uVar) throws IOException {
        io.odeeo.internal.q0.a.checkStateNotNull(this.f65310f);
        long length = iVar.getLength();
        int i10 = this.f65305a;
        if ((i10 & 2) != 0 || ((i10 & 1) != 0 && length != -1)) {
            a(iVar);
        }
        int i11 = iVar.read(this.f65307c.getData(), 0, 2048);
        boolean z10 = i11 == -1;
        b(length, z10);
        if (z10) {
            return -1;
        }
        this.f65307c.setPosition(0);
        this.f65307c.setLimit(i11);
        if (!this.f65315k) {
            this.f65306b.packetStarted(this.f65311g, 4);
            this.f65315k = true;
        }
        this.f65306b.consume(this.f65307c);
        return 0;
    }

    @Override // io.odeeo.internal.g.h
    public void seek(long j10, long j11) {
        this.f65315k = false;
        this.f65306b.seek();
        this.f65311g = j11;
    }

    @Override // io.odeeo.internal.g.h
    public boolean sniff(io.odeeo.internal.g.i iVar) throws IOException {
        int iB = b(iVar);
        int i10 = iB;
        int i11 = 0;
        int i12 = 0;
        do {
            iVar.peekFully(this.f65308d.getData(), 0, 2);
            this.f65308d.setPosition(0);
            if (f.isAdtsSyncWord(this.f65308d.readUnsignedShort())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                iVar.peekFully(this.f65308d.getData(), 0, 4);
                this.f65309e.setPosition(14);
                int bits = this.f65309e.readBits(13);
                if (bits <= 6) {
                    i10++;
                    iVar.resetPeekPosition();
                    iVar.advancePeekPosition(i10);
                } else {
                    iVar.advancePeekPosition(bits - 6);
                    i12 += bits;
                }
            } else {
                i10++;
                iVar.resetPeekPosition();
                iVar.advancePeekPosition(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iB < 8192);
        return false;
    }

    public e(int i10) {
        this.f65305a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f65306b = new f(true);
        this.f65307c = new io.odeeo.internal.q0.x(2048);
        this.f65313i = -1;
        this.f65312h = -1L;
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(10);
        this.f65308d = xVar;
        this.f65309e = new io.odeeo.internal.q0.w(xVar.getData());
    }

    public final void a(io.odeeo.internal.g.i iVar) throws IOException {
        int bits;
        if (this.f65314j) {
            return;
        }
        this.f65313i = -1;
        iVar.resetPeekPosition();
        long j10 = 0;
        if (iVar.getPosition() == 0) {
            b(iVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!iVar.peekFully(this.f65308d.getData(), 0, 2, true)) {
                    break;
                }
                this.f65308d.setPosition(0);
                if (!f.isAdtsSyncWord(this.f65308d.readUnsignedShort())) {
                    break;
                }
                if (!iVar.peekFully(this.f65308d.getData(), 0, 4, true)) {
                    break;
                }
                this.f65309e.setPosition(14);
                bits = this.f65309e.readBits(13);
                if (bits <= 6) {
                    this.f65314j = true;
                    throw g0.createForMalformedContainer("Malformed ADTS stream", null);
                }
                j10 += bits;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (iVar.advancePeekPosition(bits - 6, true));
        i10 = i11;
        iVar.resetPeekPosition();
        if (i10 > 0) {
            this.f65313i = (int) (j10 / i10);
        } else {
            this.f65313i = -1;
        }
        this.f65314j = true;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void b(long j10, boolean z10) {
        if (this.f65316l) {
            return;
        }
        boolean z11 = (this.f65305a & 1) != 0 && this.f65313i > 0;
        if (z11 && this.f65306b.getSampleDurationUs() == C.TIME_UNSET && !z10) {
            return;
        }
        if (z11 && this.f65306b.getSampleDurationUs() != C.TIME_UNSET) {
            this.f65310f.seekMap(a(j10, (this.f65305a & 2) != 0));
        } else {
            this.f65310f.seekMap(new v.b(C.TIME_UNSET));
        }
        this.f65316l = true;
    }

    @Override // io.odeeo.internal.g.h
    public void release() {
    }

    public final io.odeeo.internal.g.v a(long j10, boolean z10) {
        return new io.odeeo.internal.g.d(j10, this.f65312h, a(this.f65313i, this.f65306b.getSampleDurationUs()), this.f65313i, z10);
    }

    public static int a(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }
}
