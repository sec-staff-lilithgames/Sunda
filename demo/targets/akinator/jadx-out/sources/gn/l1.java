package gn;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f57996a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f57997b = new PriorityQueue(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    public int f57998c = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super(o2.i(i10, i11, "Priority too low [priority=", ", highest=", C3191e4.i.f36531e));
        }
    }

    public void add(int i10) {
        synchronized (this.f57996a) {
            this.f57997b.add(Integer.valueOf(i10));
            this.f57998c = Math.max(this.f57998c, i10);
        }
    }

    public void proceed(int i10) throws InterruptedException {
        synchronized (this.f57996a) {
            while (this.f57998c != i10) {
                try {
                    this.f57996a.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i10) {
        boolean z10;
        synchronized (this.f57996a) {
            z10 = this.f57998c == i10;
        }
        return z10;
    }

    public void proceedOrThrow(int i10) throws a {
        synchronized (this.f57996a) {
            try {
                if (this.f57998c != i10) {
                    throw new a(i10, this.f57998c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void remove(int i10) {
        synchronized (this.f57996a) {
            this.f57997b.remove(Integer.valueOf(i10));
            this.f57998c = this.f57997b.isEmpty() ? Integer.MIN_VALUE : ((Integer) io.bidmachine.media3.common.util.a1.castNonNull((Integer) this.f57997b.peek())).intValue();
            this.f57996a.notifyAll();
        }
    }
}
