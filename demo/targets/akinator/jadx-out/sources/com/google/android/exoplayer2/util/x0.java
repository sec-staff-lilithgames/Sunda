package com.google.android.exoplayer2.util;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28593a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f28594b = new PriorityQueue(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    public int f28595c = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends IOException {
        public a(int i10, int i11) {
            super(o2.i(i10, i11, "Priority too low [priority=", ", highest=", C3191e4.i.f36531e));
        }
    }

    public void add(int i10) {
        synchronized (this.f28593a) {
            this.f28594b.add(Integer.valueOf(i10));
            this.f28595c = Math.max(this.f28595c, i10);
        }
    }

    public void proceed(int i10) throws InterruptedException {
        synchronized (this.f28593a) {
            while (this.f28595c != i10) {
                try {
                    this.f28593a.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i10) {
        boolean z10;
        synchronized (this.f28593a) {
            z10 = this.f28595c == i10;
        }
        return z10;
    }

    public void proceedOrThrow(int i10) throws a {
        synchronized (this.f28593a) {
            try {
                if (this.f28595c != i10) {
                    throw new a(i10, this.f28595c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void remove(int i10) {
        synchronized (this.f28593a) {
            this.f28594b.remove(Integer.valueOf(i10));
            this.f28595c = this.f28594b.isEmpty() ? Integer.MIN_VALUE : ((Integer) n1.castNonNull((Integer) this.f28594b.peek())).intValue();
            this.f28593a.notifyAll();
        }
    }
}
