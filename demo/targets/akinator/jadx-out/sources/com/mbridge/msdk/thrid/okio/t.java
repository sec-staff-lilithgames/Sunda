package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f43861d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f43862a;

    /* renamed from: b, reason: collision with root package name */
    private long f43863b;

    /* renamed from: c, reason: collision with root package name */
    private long f43864c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends t {
        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public t a(long j10, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.t
        public void e() throws IOException {
        }
    }

    public t a(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f43864c = timeUnit.toNanos(j10);
        return this;
    }

    public t b() {
        this.f43864c = 0L;
        return this;
    }

    public long c() {
        if (this.f43862a) {
            return this.f43863b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f43862a;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f43862a && this.f43863b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f43864c;
    }

    public t a(long j10) {
        this.f43862a = true;
        this.f43863b = j10;
        return this;
    }

    public t a() {
        this.f43862a = false;
        return this;
    }
}
