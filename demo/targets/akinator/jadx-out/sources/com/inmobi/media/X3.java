package com.inmobi.media;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X3 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream[] f32482a;

    public X3(InputStream[] inputStreamArr) {
        this.f32482a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        for (InputStream inputStream : this.f32482a) {
            AbstractC2775ff.a(inputStream);
        }
    }
}
