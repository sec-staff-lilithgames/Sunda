package ip;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import hp.j;
import hp.k;
import hp.n;
import hp.o;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayDeque;
import nn.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f68343a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f68344b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f68345c;

    /* renamed from: d, reason: collision with root package name */
    public c f68346d;

    /* renamed from: e, reason: collision with root package name */
    public long f68347e;

    /* renamed from: f, reason: collision with root package name */
    public long f68348f;

    /* renamed from: g, reason: collision with root package name */
    public long f68349g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends o {

        /* renamed from: h, reason: collision with root package name */
        public final h f68350h;

        public a(h hVar) {
            this.f68350h = hVar;
        }

        @Override // nn.i
        public final void release() {
            ((ha.a) this.f68350h).releaseOutputBuffer(this);
        }
    }

    public d() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f68343a.add(new c());
        }
        this.f68344b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f68344b.add(new a(new ha.a(this, 10)));
        }
        this.f68345c = new ArrayDeque();
        this.f68349g = C.TIME_UNSET;
    }

    public abstract e a();

    public abstract void b(c cVar);

    public abstract boolean c();

    @Override // hp.j, nn.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f68348f = 0L;
        this.f68347e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f68345c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f68343a;
            if (zIsEmpty) {
                break;
            }
            c cVar = (c) a1.castNonNull((c) arrayDeque2.poll());
            cVar.clear();
            arrayDeque.add(cVar);
        }
        c cVar2 = this.f68346d;
        if (cVar2 != null) {
            cVar2.clear();
            arrayDeque.add(cVar2);
            this.f68346d = null;
        }
    }

    @Override // hp.j
    public abstract String getName();

    @Override // hp.j, nn.e
    public final void setOutputStartTimeUs(long j10) {
        this.f68349g = j10;
    }

    @Override // hp.j
    public void setPositionUs(long j10) {
        this.f68347e = j10;
    }

    @Override // hp.j, nn.e
    public n dequeueInputBuffer() throws k {
        io.bidmachine.media3.common.util.a.checkState(this.f68346d == null);
        ArrayDeque arrayDeque = this.f68343a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        c cVar = (c) arrayDeque.pollFirst();
        this.f68346d = cVar;
        return cVar;
    }

    @Override // hp.j, nn.e
    public o dequeueOutputBuffer() throws k {
        ArrayDeque arrayDeque = this.f68344b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f68345c;
            if (arrayDeque2.isEmpty() || ((c) a1.castNonNull((c) arrayDeque2.peek())).f77082h > this.f68347e) {
                return null;
            }
            c cVar = (c) a1.castNonNull((c) arrayDeque2.poll());
            boolean zIsEndOfStream = cVar.isEndOfStream();
            ArrayDeque arrayDeque3 = this.f68343a;
            if (zIsEndOfStream) {
                o oVar = (o) a1.castNonNull((o) arrayDeque.pollFirst());
                oVar.addFlag(4);
                cVar.clear();
                arrayDeque3.add(cVar);
                return oVar;
            }
            b(cVar);
            if (c()) {
                e eVarA = a();
                o oVar2 = (o) a1.castNonNull((o) arrayDeque.pollFirst());
                oVar2.setContent(cVar.f77082h, eVarA, Long.MAX_VALUE);
                cVar.clear();
                arrayDeque3.add(cVar);
                return oVar2;
            }
            cVar.clear();
            arrayDeque3.add(cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // hp.j, nn.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void queueInputBuffer(hp.n r7) throws hp.k {
        /*
            r6 = this;
            ip.c r0 = r6.f68346d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            io.bidmachine.media3.common.util.a.checkArgument(r0)
            ip.c r7 = (ip.c) r7
            boolean r0 = r7.isEndOfStream()
            if (r0 != 0) goto L32
            long r0 = r7.f77082h
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            long r2 = r6.f68349g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L32
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L32
            r7.clear()
            java.util.ArrayDeque r0 = r6.f68343a
            r0.add(r7)
            goto L40
        L32:
            long r0 = r6.f68348f
            r2 = 1
            long r2 = r2 + r0
            r6.f68348f = r2
            r7.f68342m = r0
            java.util.ArrayDeque r0 = r6.f68345c
            r0.add(r7)
        L40:
            r7 = 0
            r6.f68346d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.d.queueInputBuffer(hp.n):void");
    }

    @Override // hp.j, nn.e
    public void release() {
    }
}
