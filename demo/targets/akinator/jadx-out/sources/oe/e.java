package oe;

import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements ee.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f79022a;

    /* renamed from: b, reason: collision with root package name */
    public final f f79023b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f79024c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f79025d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f79026e;

    /* renamed from: f, reason: collision with root package name */
    public ee.s f79027f;

    /* renamed from: g, reason: collision with root package name */
    public long f79028g;

    /* renamed from: h, reason: collision with root package name */
    public long f79029h;

    /* renamed from: i, reason: collision with root package name */
    public int f79030i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f79031j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79032k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79033l;

    public e() {
        this(0);
    }

    public final int a(ee.q qVar) throws IOException {
        int i10 = 0;
        while (true) {
            v0 v0Var = this.f79025d;
            qVar.peekFully(v0Var.getData(), 0, 10);
            v0Var.setPosition(0);
            if (v0Var.readUnsignedInt24() != 4801587) {
                break;
            }
            v0Var.skipBytes(3);
            int synchSafeInt = v0Var.readSynchSafeInt();
            i10 += synchSafeInt + 10;
            qVar.advancePeekPosition(synchSafeInt);
        }
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(i10);
        if (this.f79029h == -1) {
            this.f79029h = i10;
        }
        return i10;
    }

    @Override // ee.p
    public void init(ee.s sVar) {
        this.f79027f = sVar;
        this.f79023b.createTracks(sVar, new i0(0, 1));
        sVar.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    @Override // ee.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ee.q r21, ee.f0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.e.read(ee.q, ee.f0):int");
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.f79032k = false;
        this.f79023b.seek();
        this.f79028g = j11;
    }

    @Override // ee.p
    public boolean sniff(ee.q qVar) throws IOException {
        int iA = a(qVar);
        int i10 = iA;
        int i11 = 0;
        int i12 = 0;
        do {
            v0 v0Var = this.f79025d;
            qVar.peekFully(v0Var.getData(), 0, 2);
            v0Var.setPosition(0);
            if (f.isAdtsSyncWord(v0Var.readUnsignedShort())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                qVar.peekFully(v0Var.getData(), 0, 4);
                u0 u0Var = this.f79026e;
                u0Var.setPosition(14);
                int bits = u0Var.readBits(13);
                if (bits <= 6) {
                    i10++;
                    qVar.resetPeekPosition();
                    qVar.advancePeekPosition(i10);
                } else {
                    qVar.advancePeekPosition(bits - 6);
                    i12 += bits;
                }
            } else {
                i10++;
                qVar.resetPeekPosition();
                qVar.advancePeekPosition(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iA < 8192);
        return false;
    }

    public e(int i10) {
        this.f79022a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f79023b = new f(true);
        this.f79024c = new v0(2048);
        this.f79030i = -1;
        this.f79029h = -1L;
        v0 v0Var = new v0(10);
        this.f79025d = v0Var;
        this.f79026e = new u0(v0Var.getData());
    }

    @Override // ee.p
    public void release() {
    }
}
