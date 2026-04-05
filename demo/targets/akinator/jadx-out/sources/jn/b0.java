package jn;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f69718a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f69719b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f69720c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final PriorityQueue f69721d = new PriorityQueue();

    /* renamed from: e, reason: collision with root package name */
    public int f69722e = -1;

    /* renamed from: f, reason: collision with root package name */
    public a f69723f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Comparable {

        /* renamed from: c, reason: collision with root package name */
        public long f69725c = C.TIME_UNSET;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f69724b = new ArrayList();

        public void init(long j10, m0 m0Var) {
            io.bidmachine.media3.common.util.a.checkArgument(j10 != C.TIME_UNSET);
            ArrayList arrayList = this.f69724b;
            io.bidmachine.media3.common.util.a.checkState(arrayList.isEmpty());
            this.f69725c = j10;
            arrayList.add(m0Var);
        }

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            return Long.compare(this.f69725c, aVar.f69725c);
        }
    }

    public b0(c0 c0Var) {
        this.f69718a = c0Var;
    }

    public final void a(int i10) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f69721d;
            if (priorityQueue.size() <= i10) {
                return;
            }
            a aVar = (a) a1.castNonNull((a) priorityQueue.poll());
            int i11 = 0;
            while (true) {
                arrayList = aVar.f69724b;
                if (i11 >= arrayList.size()) {
                    break;
                }
                this.f69718a.consume(aVar.f69725c, (m0) arrayList.get(i11));
                this.f69719b.push((m0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            a aVar2 = this.f69723f;
            if (aVar2 != null && aVar2.f69725c == aVar.f69725c) {
                this.f69723f = null;
            }
            this.f69720c.push(aVar);
        }
    }

    public void add(long j10, m0 m0Var) {
        int i10 = this.f69722e;
        if (i10 != 0) {
            PriorityQueue priorityQueue = this.f69721d;
            if (i10 == -1 || priorityQueue.size() < this.f69722e || j10 >= ((a) a1.castNonNull((a) priorityQueue.peek())).f69725c) {
                ArrayDeque arrayDeque = this.f69719b;
                m0 m0Var2 = arrayDeque.isEmpty() ? new m0() : (m0) arrayDeque.pop();
                m0Var2.reset(m0Var.bytesLeft());
                System.arraycopy(m0Var.getData(), m0Var.getPosition(), m0Var2.getData(), 0, m0Var2.bytesLeft());
                a aVar = this.f69723f;
                if (aVar != null && j10 == aVar.f69725c) {
                    aVar.f69724b.add(m0Var2);
                    return;
                }
                ArrayDeque arrayDeque2 = this.f69720c;
                a aVar2 = arrayDeque2.isEmpty() ? new a() : (a) arrayDeque2.pop();
                aVar2.init(j10, m0Var2);
                priorityQueue.add(aVar2);
                this.f69723f = aVar2;
                int i11 = this.f69722e;
                if (i11 != -1) {
                    a(i11);
                    return;
                }
                return;
            }
        }
        this.f69718a.consume(j10, m0Var);
    }

    public void clear() {
        this.f69721d.clear();
    }

    public void flush() {
        a(0);
    }

    public int getMaxSize() {
        return this.f69722e;
    }

    public void setMaxSize(int i10) {
        io.bidmachine.media3.common.util.a.checkState(i10 >= 0);
        this.f69722e = i10;
        a(i10);
    }
}
