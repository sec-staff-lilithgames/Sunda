package r8;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final long f84018a;

    /* renamed from: b, reason: collision with root package name */
    public final h f84019b;

    public i(String str, long j10) {
        this(new f(str), j10);
    }

    @Override // r8.a
    public c build() {
        File cacheDirectory = this.f84019b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return j.create(cacheDirectory, this.f84018a);
        }
        return null;
    }

    public i(String str, String str2, long j10) {
        this(new g(str, str2), j10);
    }

    public i(h hVar, long j10) {
        this.f84018a = j10;
        this.f84019b = hVar;
    }
}
