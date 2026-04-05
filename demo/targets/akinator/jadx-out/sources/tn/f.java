package tn;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f87183a;

    public f(int i10) {
        this.f87183a = new e(i10 + 1, i10);
    }

    public boolean containsUri(Uri uri) {
        return this.f87183a.containsKey(io.bidmachine.media3.common.util.a.checkNotNull(uri));
    }

    public byte[] get(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f87183a.get(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] put(Uri uri, byte[] bArr) {
        return (byte[]) this.f87183a.put((Uri) io.bidmachine.media3.common.util.a.checkNotNull(uri), (byte[]) io.bidmachine.media3.common.util.a.checkNotNull(bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public byte[] remove(Uri uri) {
        return (byte[]) this.f87183a.remove(io.bidmachine.media3.common.util.a.checkNotNull(uri));
    }
}
