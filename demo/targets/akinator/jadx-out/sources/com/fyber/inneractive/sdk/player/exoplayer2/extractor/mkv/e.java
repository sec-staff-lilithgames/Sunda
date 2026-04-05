package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0, reason: collision with root package name */
    public static final byte[] f24939a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0, reason: collision with root package name */
    public static final UUID f24940b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public j Y;

    /* renamed from: a, reason: collision with root package name */
    public final b f24941a;

    /* renamed from: b, reason: collision with root package name */
    public final g f24942b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f24943c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24944d;

    /* renamed from: e, reason: collision with root package name */
    public final n f24945e;

    /* renamed from: f, reason: collision with root package name */
    public final n f24946f;

    /* renamed from: g, reason: collision with root package name */
    public final n f24947g;

    /* renamed from: h, reason: collision with root package name */
    public final n f24948h;

    /* renamed from: i, reason: collision with root package name */
    public final n f24949i;

    /* renamed from: j, reason: collision with root package name */
    public final n f24950j;

    /* renamed from: k, reason: collision with root package name */
    public final n f24951k;

    /* renamed from: l, reason: collision with root package name */
    public final n f24952l;

    /* renamed from: m, reason: collision with root package name */
    public final n f24953m;

    /* renamed from: n, reason: collision with root package name */
    public ByteBuffer f24954n;

    /* renamed from: o, reason: collision with root package name */
    public long f24955o;

    /* renamed from: p, reason: collision with root package name */
    public long f24956p;

    /* renamed from: q, reason: collision with root package name */
    public long f24957q;

    /* renamed from: r, reason: collision with root package name */
    public long f24958r;

    /* renamed from: s, reason: collision with root package name */
    public long f24959s;

    /* renamed from: t, reason: collision with root package name */
    public d f24960t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24961u;

    /* renamed from: v, reason: collision with root package name */
    public int f24962v;

    /* renamed from: w, reason: collision with root package name */
    public long f24963w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24964x;

    /* renamed from: y, reason: collision with root package name */
    public long f24965y;

    /* renamed from: z, reason: collision with root package name */
    public long f24966z;

    public e() {
        b bVar = new b();
        this.f24956p = -1L;
        this.f24957q = C.TIME_UNSET;
        this.f24958r = C.TIME_UNSET;
        this.f24959s = C.TIME_UNSET;
        this.f24965y = -1L;
        this.f24966z = -1L;
        this.A = C.TIME_UNSET;
        this.f24941a = bVar;
        bVar.f24908d = new c(this);
        this.f24944d = true;
        this.f24942b = new g();
        this.f24943c = new SparseArray();
        this.f24947g = new n(4);
        this.f24948h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.f24949i = new n(4);
        this.f24945e = new n(l.f26034a);
        this.f24946f = new n(4);
        this.f24950j = new n();
        this.f24951k = new n();
        this.f24952l = new n(8);
        this.f24953m = new n();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        f fVar = new f();
        long j10 = bVar.f24648b;
        long j11 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j10 != -1 && j10 <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j11 = j10;
        }
        int i10 = (int) j11;
        bVar.a(fVar.f24967a.f26042a, 0, 4, false);
        long jK = fVar.f24967a.k();
        fVar.f24968b = 4;
        while (true) {
            if (jK != 440786851) {
                int i11 = fVar.f24968b + 1;
                fVar.f24968b = i11;
                if (i11 == i10) {
                    break;
                }
                bVar.a(fVar.f24967a.f26042a, 0, 1, false);
                jK = ((jK << 8) & (-256)) | (fVar.f24967a.f26042a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            } else {
                long jA = fVar.a(bVar);
                long j12 = fVar.f24968b;
                if (jA != Long.MIN_VALUE && (j10 == -1 || j12 + jA < j10)) {
                    while (true) {
                        long j13 = fVar.f24968b;
                        long j14 = j12 + jA;
                        if (j13 < j14) {
                            if (fVar.a(bVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jA2 = fVar.a(bVar);
                            if (jA2 < 0 || jA2 > 2147483647L) {
                                break;
                            }
                            if (jA2 != 0) {
                                bVar.a((int) jA2, false);
                                fVar.f24968b = (int) (fVar.f24968b + jA2);
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.A = C.TIME_UNSET;
        this.E = 0;
        b bVar = this.f24941a;
        bVar.f24909e = 0;
        bVar.f24906b.clear();
        g gVar = bVar.f24907c;
        gVar.f24971b = 0;
        gVar.f24972c = 0;
        g gVar2 = this.f24942b;
        gVar2.f24971b = 0;
        gVar2.f24972c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar = this.f24950j;
        nVar.f26043b = 0;
        nVar.f26044c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e4, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0a61, code lost:
    
        if (r5 == false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0a63, code lost:
    
        r3 = r33.f24649c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0a67, code lost:
    
        if (r32.f24964x == false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0a69, code lost:
    
        r32.f24966z = r3;
        r34.f25218a = r32.f24965y;
        r32.f24964x = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0a71, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0a76, code lost:
    
        if (r32.f24961u == false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0a78, code lost:
    
        r3 = r32.f24966z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0a7e, code lost:
    
        if (r3 == (-1)) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0a80, code lost:
    
        r34.f25218a = r3;
        r32.f24966z = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0a86, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0a86, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:306:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x082a  */
    /* JADX WARN: Type inference failed for: r3v104, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v110 */
    /* JADX WARN: Type inference failed for: r3v161 */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r33, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r34) throws java.lang.InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 3186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }

    public final void a(d dVar, long j10) {
        byte[] bArrB;
        if ("S_TEXT/UTF8".equals(dVar.f24913a)) {
            byte[] bArr = this.f24951k.f26042a;
            long j11 = this.G;
            if (j11 == C.TIME_UNSET) {
                bArrB = f24939a0;
            } else {
                int i10 = (int) (j11 / 3600000000L);
                long j12 = j11 - (i10 * 3600000000L);
                int i11 = (int) (j12 / 60000000);
                long j13 = j12 - (60000000 * i11);
                bArrB = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) (j13 / 1000000)), Integer.valueOf((int) ((j13 - (1000000 * r5)) / 1000))));
            }
            System.arraycopy(bArrB, 0, bArr, 19, 12);
            r rVar = dVar.O;
            n nVar = this.f24951k;
            rVar.a(nVar.f26044c, nVar);
            this.V += this.f24951k.f26044c;
        }
        dVar.O.a(j10, this.M, this.V, 0, dVar.f24919g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar2 = this.f24950j;
        nVar2.f26043b = 0;
        nVar2.f26044c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i10) throws InterruptedException, EOFException {
        n nVar = this.f24947g;
        if (nVar.f26044c >= i10) {
            return;
        }
        if (nVar.a() < i10) {
            n nVar2 = this.f24947g;
            byte[] bArr = nVar2.f26042a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10));
            int i11 = this.f24947g.f26044c;
            nVar2.f26042a = bArrCopyOf;
            nVar2.f26044c = i11;
            nVar2.f26043b = 0;
        }
        n nVar3 = this.f24947g;
        byte[] bArr2 = nVar3.f26042a;
        int i12 = nVar3.f26044c;
        bVar.b(bArr2, i12, i10 - i12, false);
        this.f24947g.d(i10);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i10) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        int iA;
        int iA2;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.f24913a)) {
            byte[] bArr = Z;
            int i12 = i10 + 32;
            if (this.f24951k.a() < i12) {
                this.f24951k.f26042a = Arrays.copyOf(bArr, i12 + i10);
            }
            bVar.b(this.f24951k.f26042a, 32, i10, false);
            this.f24951k.e(0);
            this.f24951k.d(i12);
            return;
        }
        r rVar = dVar.O;
        if (!this.O) {
            if (dVar.f24917e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.f24947g.f26042a, 0, 1, false);
                    this.N++;
                    byte b10 = this.f24947g.f26042a[0];
                    if ((b10 & 128) != 128) {
                        this.S = b10;
                        this.P = true;
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Extension bit is set in signal byte");
                    }
                }
                byte b11 = this.S;
                if ((b11 & 1) == 1) {
                    boolean z10 = (b11 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.f24952l.f26042a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        n nVar = this.f24947g;
                        nVar.f26042a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.f24947g);
                        this.V++;
                        this.f24952l.e(0);
                        rVar.a(8, this.f24952l);
                        this.V += 8;
                    }
                    if (z10) {
                        if (!this.R) {
                            bVar.b(this.f24947g.f26042a, 0, 1, false);
                            this.N++;
                            this.f24947g.e(0);
                            this.T = this.f24947g.j();
                            this.R = true;
                        }
                        int i13 = this.T * 4;
                        this.f24947g.c(i13);
                        bVar.b(this.f24947g.f26042a, 0, i13, false);
                        this.N += i13;
                        short s10 = (short) ((this.T / 2) + 1);
                        int i14 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f24954n;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f24954n = ByteBuffer.allocate(i14);
                        }
                        this.f24954n.position(0);
                        this.f24954n.putShort(s10);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i11 = this.T;
                            if (i15 >= i11) {
                                break;
                            }
                            int iM = this.f24947g.m();
                            if (i15 % 2 == 0) {
                                this.f24954n.putShort((short) (iM - i16));
                            } else {
                                this.f24954n.putInt(iM - i16);
                            }
                            i15++;
                            i16 = iM;
                        }
                        int i17 = (i10 - this.N) - i16;
                        if (i11 % 2 == 1) {
                            this.f24954n.putInt(i17);
                        } else {
                            this.f24954n.putShort((short) i17);
                            this.f24954n.putInt(0);
                        }
                        n nVar2 = this.f24953m;
                        nVar2.f26042a = this.f24954n.array();
                        nVar2.f26044c = i14;
                        nVar2.f26043b = 0;
                        rVar.a(i14, this.f24953m);
                        this.V += i14;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f24918f;
                if (bArr2 != null) {
                    n nVar3 = this.f24950j;
                    int length = bArr2.length;
                    nVar3.f26042a = bArr2;
                    nVar3.f26044c = length;
                    nVar3.f26043b = 0;
                }
            }
            this.O = true;
        }
        int i18 = i10 + this.f24950j.f26044c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f24913a) && !"V_MPEGH/ISO/HEVC".equals(dVar.f24913a)) {
            while (true) {
                int i19 = this.N;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                n nVar4 = this.f24950j;
                int i21 = nVar4.f26044c - nVar4.f26043b;
                if (i21 > 0) {
                    iA2 = Math.min(i20, i21);
                    rVar.a(iA2, this.f24950j);
                } else {
                    iA2 = rVar.a(bVar, i20, false);
                }
                this.N += iA2;
                this.V += iA2;
            }
        } else {
            byte[] bArr3 = this.f24946f.f26042a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i22 = dVar.P;
            int i23 = 4 - i22;
            while (this.N < i18) {
                int i24 = this.U;
                if (i24 == 0) {
                    n nVar5 = this.f24950j;
                    int iMin = Math.min(i22, nVar5.f26044c - nVar5.f26043b);
                    bVar.b(bArr3, i23 + iMin, i22 - iMin, false);
                    if (iMin > 0) {
                        this.f24950j.a(bArr3, i23, iMin);
                    }
                    this.N += i22;
                    this.f24946f.e(0);
                    this.U = this.f24946f.m();
                    this.f24945e.e(0);
                    rVar.a(4, this.f24945e);
                    this.V += 4;
                } else {
                    n nVar6 = this.f24950j;
                    int i25 = nVar6.f26044c - nVar6.f26043b;
                    if (i25 > 0) {
                        iA = Math.min(i24, i25);
                        rVar.a(iA, this.f24950j);
                    } else {
                        iA = rVar.a(bVar, i24, false);
                    }
                    this.N += iA;
                    this.V += iA;
                    this.U = i24 - iA;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f24913a)) {
            this.f24948h.e(0);
            rVar.a(4, this.f24948h);
            this.V += 4;
        }
    }

    public final long a(long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        long j11 = this.f24957q;
        if (j11 != C.TIME_UNSET) {
            return z.a(j10, j11, 1000L);
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Can't scale timecode prior to timecodeScale being set.");
    }
}
