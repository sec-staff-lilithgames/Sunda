package io.odeeo.internal.q0;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f65975a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f65976b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    public int f65977c = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super(o2.i(i10, i11, "Priority too low [priority=", ", highest=", C3191e4.i.f36531e));
        }
    }

    public void add(int i10) {
        synchronized (this.f65975a) {
            this.f65976b.add(Integer.valueOf(i10));
            this.f65977c = Math.max(this.f65977c, i10);
        }
    }

    public void proceed(int i10) throws InterruptedException {
        synchronized (this.f65975a) {
            while (this.f65977c != i10) {
                try {
                    this.f65975a.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i10) {
        boolean z10;
        synchronized (this.f65975a) {
            z10 = this.f65977c == i10;
        }
        return z10;
    }

    public void proceedOrThrow(int i10) throws a {
        synchronized (this.f65975a) {
            try {
                if (this.f65977c != i10) {
                    throw new a(i10, this.f65977c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void remove(int i10) {
        synchronized (this.f65975a) {
            this.f65976b.remove(Integer.valueOf(i10));
            this.f65977c = this.f65976b.isEmpty() ? Integer.MIN_VALUE : ((Integer) g0.castNonNull(this.f65976b.peek())).intValue();
            this.f65975a.notifyAll();
        }
    }
}
