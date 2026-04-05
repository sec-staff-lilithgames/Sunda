package cu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends AtomicInteger implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f51072b;

    /* renamed from: c, reason: collision with root package name */
    public final r0[] f51073c;

    /* renamed from: e, reason: collision with root package name */
    public final List[] f51074e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f51075f;

    /* renamed from: g, reason: collision with root package name */
    public final Comparator f51076g;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f51078i;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f51077h = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f51079j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f51080k = new AtomicReference();

    public s0(tw.c cVar, int i10, Comparator comparator) {
        this.f51072b = cVar;
        this.f51076g = comparator;
        r0[] r0VarArr = new r0[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            r0VarArr[i11] = new r0(this, i11);
        }
        this.f51073c = r0VarArr;
        this.f51074e = new List[i10];
        this.f51075f = new int[i10];
        this.f51079j.lazySet(i10);
    }

    public final void a() {
        for (r0 r0Var : this.f51073c) {
            r0Var.getClass();
            hu.g.cancel(r0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r11 != r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        if (r19.f51078i == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        java.util.Arrays.fill(r3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        r5 = (java.lang.Throwable) r19.f51080k.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        a();
        java.util.Arrays.fill(r3, (java.lang.Object) null);
        r2.onError(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
    
        if (r14 >= r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
    
        if (r0[r14] == r3[r14].size()) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
    
        java.util.Arrays.fill(r3, (java.lang.Object) null);
        r2.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ec, code lost:
    
        if (r11 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f5, code lost:
    
        if (r7 == Long.MAX_VALUE) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        r19.f51077h.addAndGet(-r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fd, code lost:
    
        r5 = get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0101, code lost:
    
        if (r5 != r6) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0103, code lost:
    
        r5 = addAndGet(-r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0108, code lost:
    
        if (r5 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.s0.b():void");
    }

    @Override // tw.d
    public void cancel() {
        if (this.f51078i) {
            return;
        }
        this.f51078i = true;
        a();
        if (getAndIncrement() == 0) {
            Arrays.fill(this.f51074e, (Object) null);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f51077h, j10);
            if (this.f51079j.get() == 0) {
                b();
            }
        }
    }
}
