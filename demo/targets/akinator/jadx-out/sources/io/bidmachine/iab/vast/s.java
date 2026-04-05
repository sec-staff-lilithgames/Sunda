package io.bidmachine.iab.vast;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class s implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final long f60525b;

    /* renamed from: c, reason: collision with root package name */
    public final File f60526c;

    public s(File file) {
        this.f60526c = file;
        this.f60525b = file.lastModified();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        long j10 = this.f60525b;
        long j11 = ((s) obj).f60525b;
        if (j10 > j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
