package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class P4 implements O4 {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f32121a;

    /* renamed from: b, reason: collision with root package name */
    public int f32122b;

    /* renamed from: c, reason: collision with root package name */
    public long f32123c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f32124d;

    /* renamed from: e, reason: collision with root package name */
    public Q4 f32125e;

    public P4(String filePath) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int i10 = fileInputStream.read(bArr);
            C2736da.a((Closeable) fileInputStream);
            Movie movieDecodeByteArray = Movie.decodeByteArray(bArr, 0, i10);
            this.f32121a = movieDecodeByteArray;
            if (movieDecodeByteArray == null) {
                throw new IllegalStateException("Cannot decode gif byte array");
            }
        } catch (Throwable th2) {
            C2736da.a((Closeable) fileInputStream);
            throw th2;
        }
    }

    @Override // com.inmobi.media.O4
    public final void a(boolean z10) {
        this.f32124d = z10;
        if (!this.f32124d) {
            this.f32123c = SystemClock.uptimeMillis() - this.f32122b;
        }
        Q4 q42 = this.f32125e;
        if (q42 != null) {
            kotlin.jvm.internal.e0.checkNotNull(q42);
            q42.invalidate();
        }
    }

    @Override // com.inmobi.media.O4
    public final boolean b() {
        return !this.f32124d;
    }

    @Override // com.inmobi.media.O4
    public final int c() {
        Movie movie = this.f32121a;
        if (movie != null) {
            return movie.width();
        }
        return 0;
    }

    @Override // com.inmobi.media.O4
    public final void d() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f32123c == 0) {
            this.f32123c = jUptimeMillis;
        }
        Movie movie = this.f32121a;
        int iDuration = movie != null ? movie.duration() : 0;
        if (iDuration == 0) {
            iDuration = 1000;
        }
        int i10 = (int) ((jUptimeMillis - this.f32123c) % iDuration);
        this.f32122b = i10;
        Movie movie2 = this.f32121a;
        if (movie2 != null) {
            movie2.setTime(i10);
        }
    }

    public final void e() {
        new Handler(Looper.getMainLooper()).post(new zg.h(this, 8));
    }

    @Override // com.inmobi.media.O4
    public final int a() {
        Movie movie = this.f32121a;
        if (movie != null) {
            return movie.height();
        }
        return 0;
    }

    @Override // com.inmobi.media.O4
    public final void a(Canvas canvas, float f10, float f11) {
        Movie movie = this.f32121a;
        if (movie != null) {
            movie.draw(canvas, f10, f11);
        }
        Movie movie2 = this.f32121a;
        if (this.f32122b + 20 >= (movie2 != null ? movie2.duration() : 0)) {
            e();
        }
    }

    public static final void a(P4 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f32122b = 0;
        this$0.a(false);
    }

    @Override // com.inmobi.media.O4
    public final void a(Q4 q42) {
        this.f32125e = q42;
    }

    @Override // com.inmobi.media.O4
    public final void start() {
    }
}
