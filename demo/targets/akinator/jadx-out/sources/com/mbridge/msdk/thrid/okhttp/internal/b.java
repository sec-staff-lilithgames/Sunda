package com.mbridge.msdk.thrid.okhttp.internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f43286a;

    public b(String str, Object... objArr) {
        this.f43286a = c.a(str, objArr);
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f43286a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
