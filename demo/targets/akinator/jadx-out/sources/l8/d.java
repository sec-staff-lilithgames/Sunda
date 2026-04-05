package l8;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f72674a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f72675b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f72676c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f72677d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f72678e;

    /* renamed from: f, reason: collision with root package name */
    public c f72679f;

    /* renamed from: g, reason: collision with root package name */
    public long f72680g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f72681h;

    public d(f fVar, String str) {
        this.f72681h = fVar;
        this.f72674a = str;
        int i10 = fVar.f72693i;
        File file = fVar.f72687b;
        this.f72675b = new long[i10];
        this.f72676c = new File[i10];
        this.f72677d = new File[i10];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(i11);
            this.f72676c[i11] = new File(file, sb2.toString());
            sb2.append(".tmp");
            this.f72677d[i11] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public File getCleanFile(int i10) {
        return this.f72676c[i10];
    }

    public File getDirtyFile(int i10) {
        return this.f72677d[i10];
    }

    public String getLengths() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        for (long j10 : this.f72675b) {
            sb2.append(' ');
            sb2.append(j10);
        }
        return sb2.toString();
    }
}
