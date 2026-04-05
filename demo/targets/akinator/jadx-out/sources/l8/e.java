package l8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f72682a;

    /* renamed from: b, reason: collision with root package name */
    public final long f72683b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f72684c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f72685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f72686e;

    public e(f fVar, String str, long j10, File[] fileArr, long[] jArr) {
        this.f72686e = fVar;
        this.f72682a = str;
        this.f72683b = j10;
        this.f72685d = fileArr;
        this.f72684c = jArr;
    }

    public c edit() throws IOException {
        String str = this.f72682a;
        return this.f72686e.e(this.f72683b, str);
    }

    public File getFile(int i10) {
        return this.f72685d[i10];
    }

    public long getLength(int i10) {
        return this.f72684c[i10];
    }

    public String getString(int i10) throws IOException {
        return f.a(new FileInputStream(this.f72685d[i10]));
    }
}
