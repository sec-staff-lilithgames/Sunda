package n8;

import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final int f75837b;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public int getStatusCode() {
        return this.f75837b;
    }

    @Deprecated
    public e(String str) {
        this(str, -1);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, Throwable th2) {
        super(o2.g(i10, str, ", status code: "), th2);
        this.f75837b = i10;
    }
}
