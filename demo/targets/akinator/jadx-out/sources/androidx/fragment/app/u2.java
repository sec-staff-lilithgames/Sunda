package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 extends Writer {

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f6473c = new StringBuilder(128);

    /* renamed from: b, reason: collision with root package name */
    public final String f6472b = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        StringBuilder sb2 = this.f6473c;
        if (sb2.length() > 0) {
            Log.d(this.f6472b, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                d();
            } else {
                this.f6473c.append(c10);
            }
        }
    }
}
