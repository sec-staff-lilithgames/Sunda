package hv;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f59195a;

    /* renamed from: b, reason: collision with root package name */
    public int f59196b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f59197c;

    /* renamed from: d, reason: collision with root package name */
    public Path f59198d;

    public e() {
        this(0, 1, null);
    }

    public final void enterEntry(Path name) {
        e0.checkNotNullParameter(name, "name");
        Path path = this.f59198d;
        this.f59198d = path != null ? path.resolve(name) : null;
    }

    public final void exitEntry(Path name) {
        e0.checkNotNullParameter(name, "name");
        Path path = this.f59198d;
        if (!e0.areEqual(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path2 = this.f59198d;
        this.f59198d = path2 != null ? path2.getParent() : null;
    }

    public final List<Exception> getCollectedExceptions() {
        return this.f59197c;
    }

    public final Path getPath() {
        return this.f59198d;
    }

    public final int getTotalExceptions() {
        return this.f59196b;
    }

    public final void setPath(Path path) {
        this.f59198d = path;
    }

    public e(int i10) {
        this.f59195a = i10;
        this.f59197c = new ArrayList();
    }

    public final void collect(Exception exception) {
        e0.checkNotNullParameter(exception, "exception");
        this.f59196b++;
        ArrayList arrayList = this.f59197c;
        if (arrayList.size() < this.f59195a) {
            if (this.f59198d != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.f59198d)).initCause(exception);
                e0.checkNotNull(thInitCause, OcvDtWCQ.fRGJQKcl);
                exception = (FileSystemException) thInitCause;
            }
            arrayList.add(exception);
        }
    }

    public /* synthetic */ e(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 64 : i10);
    }
}
