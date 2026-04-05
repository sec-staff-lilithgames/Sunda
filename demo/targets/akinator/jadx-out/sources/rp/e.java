package rp;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements ko.z {

    /* renamed from: a, reason: collision with root package name */
    public final int f84587a;

    /* renamed from: b, reason: collision with root package name */
    public final f f84588b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84589c;

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.m0 f84590d;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l0 f84591e;

    /* renamed from: f, reason: collision with root package name */
    public ko.c0 f84592f;

    /* renamed from: g, reason: collision with root package name */
    public long f84593g;

    /* renamed from: h, reason: collision with root package name */
    public long f84594h;

    /* renamed from: i, reason: collision with root package name */
    public int f84595i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f84596j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84597k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f84598l;

    public e() {
        this(0);
    }

    public final int a(ko.a0 a0Var) throws IOException {
        int i10 = 0;
        while (true) {
            io.bidmachine.media3.common.util.m0 m0Var = this.f84590d;
            a0Var.peekFully(m0Var.getData(), 0, 10);
            m0Var.setPosition(0);
            if (m0Var.readUnsignedInt24() != 4801587) {
                break;
            }
            m0Var.skipBytes(3);
            int synchSafeInt = m0Var.readSynchSafeInt();
            i10 += synchSafeInt + 10;
            a0Var.advancePeekPosition(synchSafeInt);
        }
        a0Var.resetPeekPosition();
        a0Var.advancePeekPosition(i10);
        if (this.f84594h == -1) {
            this.f84594h = i10;
        }
        return i10;
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ ko.z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(ko.c0 c0Var) {
        this.f84592f = c0Var;
        this.f84588b.createTracks(c0Var, new m0(0, 1));
        c0Var.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r21, ko.v0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.e.read(ko.a0, ko.v0):int");
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f84597k = false;
        this.f84588b.seek();
        this.f84593g = j11;
    }

    @Override // ko.z
    public boolean sniff(ko.a0 a0Var) throws IOException {
        int iA = a(a0Var);
        int i10 = iA;
        int i11 = 0;
        int i12 = 0;
        do {
            io.bidmachine.media3.common.util.m0 m0Var = this.f84590d;
            a0Var.peekFully(m0Var.getData(), 0, 2);
            m0Var.setPosition(0);
            if (f.isAdtsSyncWord(m0Var.readUnsignedShort())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                a0Var.peekFully(m0Var.getData(), 0, 4);
                io.bidmachine.media3.common.util.l0 l0Var = this.f84591e;
                l0Var.setPosition(14);
                int bits = l0Var.readBits(13);
                if (bits <= 6) {
                    i10++;
                    a0Var.resetPeekPosition();
                    a0Var.advancePeekPosition(i10);
                } else {
                    a0Var.advancePeekPosition(bits - 6);
                    i12 += bits;
                }
            } else {
                i10++;
                a0Var.resetPeekPosition();
                a0Var.advancePeekPosition(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iA < 8192);
        return false;
    }

    public e(int i10) {
        this.f84587a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f84588b = new f(true, MimeTypes.AUDIO_AAC);
        this.f84589c = new io.bidmachine.media3.common.util.m0(2048);
        this.f84595i = -1;
        this.f84594h = -1L;
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(10);
        this.f84590d = m0Var;
        this.f84591e = new io.bidmachine.media3.common.util.l0(m0Var.getData());
    }

    @Override // ko.z
    public void release() {
    }
}
