package fe;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.n1;
import ee.i0;
import ee.j;
import ee.l0;
import ee.p;
import ee.q;
import ee.s;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements p {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f55604q;

    /* renamed from: t, reason: collision with root package name */
    public static final int f55607t;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f55608a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55609b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f55610c;

    /* renamed from: d, reason: collision with root package name */
    public long f55611d;

    /* renamed from: e, reason: collision with root package name */
    public int f55612e;

    /* renamed from: f, reason: collision with root package name */
    public int f55613f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f55614g;

    /* renamed from: h, reason: collision with root package name */
    public long f55615h;

    /* renamed from: i, reason: collision with root package name */
    public int f55616i;

    /* renamed from: j, reason: collision with root package name */
    public int f55617j;

    /* renamed from: k, reason: collision with root package name */
    public long f55618k;

    /* renamed from: l, reason: collision with root package name */
    public s f55619l;

    /* renamed from: m, reason: collision with root package name */
    public l0 f55620m;

    /* renamed from: n, reason: collision with root package name */
    public i0 f55621n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f55622o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f55603p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f55605r = n1.getUtf8Bytes("#!AMR\n");

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f55606s = n1.getUtf8Bytes("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f55604q = iArr;
        f55607t = iArr[8];
    }

    public a() {
        this(0);
    }

    public final int a(q qVar) throws IOException {
        boolean z10;
        qVar.resetPeekPosition();
        byte[] bArr = this.f55608a;
        qVar.peekFully(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw h2.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b10), null);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f55610c) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f55604q[i10] : f55603p[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f55610c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw h2.createForMalformedContainer(sb2.toString(), null);
    }

    public final boolean b(q qVar) throws IOException {
        qVar.resetPeekPosition();
        byte[] bArr = f55605r;
        byte[] bArr2 = new byte[bArr.length];
        qVar.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f55610c = false;
            qVar.skipFully(bArr.length);
            return true;
        }
        qVar.resetPeekPosition();
        byte[] bArr3 = f55606s;
        byte[] bArr4 = new byte[bArr3.length];
        qVar.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f55610c = true;
        qVar.skipFully(bArr3.length);
        return true;
    }

    @Override // ee.p
    public void init(s sVar) {
        this.f55619l = sVar;
        this.f55620m = sVar.track(0, 1);
        sVar.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // ee.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ee.q r14, ee.f0 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fe.a.read(ee.q, ee.f0):int");
    }

    @Override // ee.p
    public void seek(long j10, long j11) {
        this.f55611d = 0L;
        this.f55612e = 0;
        this.f55613f = 0;
        if (j10 != 0) {
            i0 i0Var = this.f55621n;
            if (i0Var instanceof j) {
                this.f55618k = ((j) i0Var).getTimeUsAtPosition(j10);
                return;
            }
        }
        this.f55618k = 0L;
    }

    @Override // ee.p
    public boolean sniff(q qVar) throws IOException {
        return b(qVar);
    }

    public a(int i10) {
        this.f55609b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f55608a = new byte[1];
        this.f55616i = -1;
    }

    @Override // ee.p
    public void release() {
    }
}
