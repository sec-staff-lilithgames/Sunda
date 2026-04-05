package lo;

import gn.z0;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import ko.a0;
import ko.c0;
import ko.e1;
import ko.q0;
import ko.r;
import ko.v;
import ko.y0;
import ko.z;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements z {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f73538s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f73539t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f73540u = a1.getUtf8Bytes("#!AMR\n");

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f73541v = a1.getUtf8Bytes("#!AMR-WB\n");

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f73542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73543b;

    /* renamed from: c, reason: collision with root package name */
    public final v f73544c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f73545d;

    /* renamed from: e, reason: collision with root package name */
    public long f73546e;

    /* renamed from: f, reason: collision with root package name */
    public int f73547f;

    /* renamed from: g, reason: collision with root package name */
    public int f73548g;

    /* renamed from: h, reason: collision with root package name */
    public long f73549h;

    /* renamed from: i, reason: collision with root package name */
    public int f73550i;

    /* renamed from: j, reason: collision with root package name */
    public int f73551j;

    /* renamed from: k, reason: collision with root package name */
    public long f73552k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f73553l;

    /* renamed from: m, reason: collision with root package name */
    public e1 f73554m;

    /* renamed from: n, reason: collision with root package name */
    public e1 f73555n;

    /* renamed from: o, reason: collision with root package name */
    public y0 f73556o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f73557p;

    /* renamed from: q, reason: collision with root package name */
    public long f73558q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f73559r;

    public a() {
        this(0);
    }

    public final int a(a0 a0Var) throws IOException {
        boolean z10;
        a0Var.resetPeekPosition();
        byte[] bArr = this.f73542a;
        a0Var.peekFully(bArr, 0, 1);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw z0.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b10), null);
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f73545d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f73539t[i10] : f73538s[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f73545d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw z0.createForMalformedContainer(sb2.toString(), null);
    }

    public final boolean b(a0 a0Var) throws IOException {
        a0Var.resetPeekPosition();
        byte[] bArr = f73540u;
        byte[] bArr2 = new byte[bArr.length];
        a0Var.peekFully(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f73545d = false;
            a0Var.skipFully(bArr.length);
            return true;
        }
        a0Var.resetPeekPosition();
        byte[] bArr3 = f73541v;
        byte[] bArr4 = new byte[bArr3.length];
        a0Var.peekFully(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f73545d = true;
        a0Var.skipFully(bArr3.length);
        return true;
    }

    @Override // ko.z
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(c0 c0Var) {
        this.f73553l = c0Var;
        e1 e1VarTrack = c0Var.track(0, 1);
        this.f73554m = e1VarTrack;
        this.f73555n = e1VarTrack;
        c0Var.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5 A[PHI: r10
      0x00d5: PHI (r10v1 ko.a0) = (r10v0 ko.a0), (r10v4 ko.a0) binds: [B:44:0x00d3, B:47:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r19, ko.v0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.a.read(ko.a0, ko.v0):int");
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f73546e = 0L;
        this.f73547f = 0;
        this.f73548g = 0;
        this.f73558q = j11;
        y0 y0Var = this.f73556o;
        if (!(y0Var instanceof q0)) {
            if (j10 == 0 || !(y0Var instanceof r)) {
                this.f73552k = 0L;
                return;
            } else {
                this.f73552k = ((r) y0Var).getTimeUsAtPosition(j10);
                return;
            }
        }
        long timeUs = ((q0) y0Var).getTimeUs(j10);
        this.f73552k = timeUs;
        if (Math.abs(this.f73558q - timeUs) < 20000) {
            return;
        }
        this.f73557p = true;
        this.f73555n = this.f73544c;
    }

    @Override // ko.z
    public boolean sniff(a0 a0Var) throws IOException {
        return b(a0Var);
    }

    public a(int i10) {
        this.f73543b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f73542a = new byte[1];
        this.f73550i = -1;
        v vVar = new v();
        this.f73544c = vVar;
        this.f73555n = vVar;
    }

    @Override // ko.z
    public void release() {
    }
}
