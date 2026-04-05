package hv;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f59215a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f59216b;

    /* renamed from: c, reason: collision with root package name */
    public final l f59217c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f59218d;

    public l(Path path, Object obj, l lVar) {
        e0.checkNotNullParameter(path, "path");
        this.f59215a = path;
        this.f59216b = obj;
        this.f59217c = lVar;
    }

    public final Iterator<l> getContentIterator() {
        return this.f59218d;
    }

    public final Object getKey() {
        return this.f59216b;
    }

    public final l getParent() {
        return this.f59217c;
    }

    public final Path getPath() {
        return this.f59215a;
    }

    public final void setContentIterator(Iterator<l> it) {
        this.f59218d = it;
    }
}
