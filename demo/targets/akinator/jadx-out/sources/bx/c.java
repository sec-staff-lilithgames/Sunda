package bx;

import java.io.Closeable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final String f11382b;

    public c(String str) {
        this.f11382b = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IllegalArgumentException {
        d.remove(this.f11382b);
    }
}
