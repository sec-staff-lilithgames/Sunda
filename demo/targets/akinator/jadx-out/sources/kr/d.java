package kr;

import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f71950a;

    public d(String prefix) {
        e0.checkNotNullParameter(prefix, "prefix");
        this.f71950a = prefix;
    }

    @Override // kr.a
    public boolean canDelete(File file) {
        e0.checkNotNullParameter(file, "file");
        return b.startWith(file, this.f71950a);
    }

    @Override // kr.a
    public /* bridge */ /* synthetic */ void clean(File file) {
        super.clean(file);
    }
}
