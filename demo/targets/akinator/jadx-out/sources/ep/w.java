package ep;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import ko.c1;
import ko.e1;
import ko.f1;
import ko.w0;
import ko.y0;
import nh.b5;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w implements ko.z, y0 {
    public static final /* synthetic */ int G = 0;
    public a[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public zo.a F;

    /* renamed from: a, reason: collision with root package name */
    public final hp.q f54946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54947b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f54948c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f54949d;

    /* renamed from: e, reason: collision with root package name */
    public final m0 f54950e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f54951f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f54952g;

    /* renamed from: h, reason: collision with root package name */
    public final z f54953h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f54954i;

    /* renamed from: j, reason: collision with root package name */
    public b5 f54955j;

    /* renamed from: k, reason: collision with root package name */
    public int f54956k;

    /* renamed from: l, reason: collision with root package name */
    public int f54957l;

    /* renamed from: m, reason: collision with root package name */
    public long f54958m;

    /* renamed from: n, reason: collision with root package name */
    public int f54959n;

    /* renamed from: o, reason: collision with root package name */
    public m0 f54960o;

    /* renamed from: p, reason: collision with root package name */
    public int f54961p;

    /* renamed from: q, reason: collision with root package name */
    public int f54962q;

    /* renamed from: r, reason: collision with root package name */
    public int f54963r;

    /* renamed from: s, reason: collision with root package name */
    public int f54964s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f54965t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f54966u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f54967v;

    /* renamed from: w, reason: collision with root package name */
    public long f54968w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f54969x;

    /* renamed from: y, reason: collision with root package name */
    public long f54970y;

    /* renamed from: z, reason: collision with root package name */
    public ko.c0 f54971z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c0 f54972a;

        /* renamed from: b, reason: collision with root package name */
        public final f0 f54973b;

        /* renamed from: c, reason: collision with root package name */
        public final e1 f54974c;

        /* renamed from: d, reason: collision with root package name */
        public final f1 f54975d;

        /* renamed from: e, reason: collision with root package name */
        public int f54976e;

        public a(c0 c0Var, f0 f0Var, e1 e1Var) {
            this.f54972a = c0Var;
            this.f54973b = f0Var;
            this.f54974c = e1Var;
            this.f54975d = MimeTypes.AUDIO_TRUEHD.equals(c0Var.f54823g.f60665o) ? new f1() : null;
        }
    }

    @Deprecated
    public w() {
        this(hp.q.f59124a, 16);
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    public static ko.e0 newFactory(hp.q qVar) {
        return new cp.e(qVar, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r31) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.w.a(long):void");
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.D;
    }

    public long[] getSampleTimestampsUs(int i10) {
        a[] aVarArr = this.A;
        return aVarArr.length <= i10 ? new long[0] : aVarArr[i10].f54973b.f54864f;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        return getSeekPoints(j10, -1);
    }

    @Override // ko.z
    @SideEffectFree
    public /* bridge */ /* synthetic */ ko.z getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // ko.z
    public void init(ko.c0 c0Var) {
        if ((this.f54947b & 16) == 0) {
            c0Var = new hp.t(c0Var, this.f54946a);
        }
        this.f54971z = c0Var;
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0006 A[SYNTHETIC] */
    @Override // ko.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(ko.a0 r37, ko.v0 r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.w.read(ko.a0, ko.v0):int");
    }

    @Override // ko.z
    public void seek(long j10, long j11) {
        this.f54952g.clear();
        this.f54959n = 0;
        this.f54961p = -1;
        this.f54962q = 0;
        this.f54963r = 0;
        this.f54964s = 0;
        this.f54965t = false;
        if (j10 == 0) {
            if (this.f54956k != 3) {
                this.f54956k = 0;
                this.f54959n = 0;
                return;
            } else {
                this.f54953h.reset();
                this.f54954i.clear();
                return;
            }
        }
        for (a aVar : this.A) {
            f0 f0Var = aVar.f54973b;
            int indexOfEarlierOrEqualSynchronizationSample = f0Var.getIndexOfEarlierOrEqualSynchronizationSample(j11);
            if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                indexOfEarlierOrEqualSynchronizationSample = f0Var.getIndexOfLaterOrEqualSynchronizationSample(j11);
            }
            aVar.f54976e = indexOfEarlierOrEqualSynchronizationSample;
            f1 f1Var = aVar.f54975d;
            if (f1Var != null) {
                f1Var.reset();
            }
        }
    }

    @Override // ko.z
    public boolean sniff(ko.a0 a0Var) throws IOException {
        c1 c1VarSniffUnfragmented = b0.sniffUnfragmented(a0Var, (this.f54947b & 2) != 0);
        this.f54955j = c1VarSniffUnfragmented != null ? b5.of(c1VarSniffUnfragmented) : b5.of();
        return c1VarSniffUnfragmented == null;
    }

    public w(hp.q qVar) {
        this(qVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ko.w0 getSeekPoints(long r20, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            ep.w$a[] r4 = r0.A
            int r5 = r4.length
            if (r5 != 0) goto L13
            ko.w0 r1 = new ko.w0
            ko.z0 r2 = ko.z0.f71810c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.C
        L1a:
            r9 = -1
            if (r6 == r5) goto L60
            r4 = r4[r6]
            ep.f0 r4 = r4.f54973b
            int r6 = r4.getIndexOfEarlierOrEqualSynchronizationSample(r1)
            if (r6 != r5) goto L2c
            int r6 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
        L2c:
            long[] r11 = r4.f54861c
            long[] r12 = r4.f54864f
            if (r6 != r5) goto L3a
            ko.w0 r1 = new ko.w0
            ko.z0 r2 = ko.z0.f71810c
            r1.<init>(r2)
            return r1
        L3a:
            r13 = r12[r6]
            r15 = r11[r6]
            int r17 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r17 >= 0) goto L5a
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = r4.f54860b
            int r7 = r7 + (-1)
            if (r6 >= r7) goto L6b
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r5) goto L6b
            if (r1 == r6) goto L6b
            r6 = r12[r1]
            r9 = r11[r1]
            goto L6d
        L5a:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L6b
        L60:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r1
        L6b:
            r6 = r17
        L6d:
            if (r3 != r5) goto Lb9
            r1 = 0
            r2 = r15
        L71:
            ep.w$a[] r4 = r0.A
            int r8 = r4.length
            if (r1 >= r8) goto Lba
            int r8 = r0.C
            if (r1 == r8) goto Lb4
            r4 = r4[r1]
            ep.f0 r4 = r4.f54973b
            int r8 = r4.getIndexOfEarlierOrEqualSynchronizationSample(r13)
            long[] r11 = r4.f54861c
            if (r8 != r5) goto L8a
            int r8 = r4.getIndexOfLaterOrEqualSynchronizationSample(r13)
        L8a:
            if (r8 != r5) goto L8f
            r20 = r6
            goto L97
        L8f:
            r20 = r6
            r5 = r11[r8]
            long r2 = java.lang.Math.min(r5, r2)
        L97:
            int r5 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            r6 = r20
            if (r5 == 0) goto Lb2
            int r5 = r4.getIndexOfEarlierOrEqualSynchronizationSample(r6)
            r12 = -1
            if (r5 != r12) goto La8
            int r5 = r4.getIndexOfLaterOrEqualSynchronizationSample(r6)
        La8:
            if (r5 != r12) goto Lab
            goto Lb5
        Lab:
            r4 = r11[r5]
            long r9 = java.lang.Math.min(r4, r9)
            goto Lb5
        Lb2:
            r12 = -1
            goto Lb5
        Lb4:
            r12 = r5
        Lb5:
            int r1 = r1 + 1
            r5 = r12
            goto L71
        Lb9:
            r2 = r15
        Lba:
            ko.z0 r1 = new ko.z0
            r1.<init>(r13, r2)
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 != 0) goto Lc9
            ko.w0 r2 = new ko.w0
            r2.<init>(r1)
            return r2
        Lc9:
            ko.z0 r2 = new ko.z0
            r2.<init>(r6, r9)
            ko.w0 r3 = new ko.w0
            r3.<init>(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.w.getSeekPoints(long, int):ko.w0");
    }

    @Override // ko.z
    public b5 getSniffFailureDetails() {
        return this.f54955j;
    }

    @Deprecated
    public w(int i10) {
        this(hp.q.f59124a, i10);
    }

    public w(hp.q qVar, int i10) {
        this.f54946a = qVar;
        this.f54947b = i10;
        this.f54955j = b5.of();
        this.f54956k = (i10 & 4) != 0 ? 3 : 0;
        this.f54953h = new z();
        this.f54954i = new ArrayList();
        this.f54951f = new m0(16);
        this.f54952g = new ArrayDeque();
        this.f54948c = new m0(jn.u.f69799a);
        this.f54949d = new m0(6);
        this.f54950e = new m0();
        this.f54961p = -1;
        this.f54971z = ko.c0.N8;
        this.A = new a[0];
    }

    @Override // ko.z
    public void release() {
    }
}
