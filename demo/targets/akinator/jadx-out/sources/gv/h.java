package gv;

import j1.o2;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final File f58475a;

    /* renamed from: b, reason: collision with root package name */
    public final List f58476b;

    public h(File root, List<? extends File> segments) {
        e0.checkNotNullParameter(root, "root");
        e0.checkNotNullParameter(segments, "segments");
        this.f58475a = root;
        this.f58476b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h copy$kotlin_stdlib$default(h hVar, File file, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = hVar.f58475a;
        }
        if ((i10 & 2) != 0) {
            list = hVar.f58476b;
        }
        return hVar.copy$kotlin_stdlib(file, list);
    }

    public final File component1() {
        return this.f58475a;
    }

    public final List<File> component2() {
        return this.f58476b;
    }

    public final h copy$kotlin_stdlib(File root, List<? extends File> segments) {
        e0.checkNotNullParameter(root, "root");
        e0.checkNotNullParameter(segments, "segments");
        return new h(root, segments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(this.f58475a, hVar.f58475a) && e0.areEqual(this.f58476b, hVar.f58476b);
    }

    public final File getRoot() {
        return this.f58475a;
    }

    public final String getRootName() {
        String path = this.f58475a.getPath();
        e0.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    public final List<File> getSegments() {
        return this.f58476b;
    }

    public final int getSize() {
        return this.f58476b.size();
    }

    public int hashCode() {
        return this.f58476b.hashCode() + (this.f58475a.hashCode() * 31);
    }

    public final boolean isRooted() {
        String path = this.f58475a.getPath();
        e0.checkNotNullExpressionValue(path, "getPath(...)");
        return path.length() > 0;
    }

    public final File subPath(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > getSize()) {
            throw new IllegalArgumentException();
        }
        List listSubList = this.f58476b.subList(i10, i11);
        String separator = File.separator;
        e0.checkNotNullExpressionValue(separator, "separator");
        return new File(y0.joinToString$default(listSubList, separator, null, null, 0, null, null, 62, null));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FilePathComponents(root=");
        sb2.append(this.f58475a);
        sb2.append(", segments=");
        return o2.p(sb2, this.f58476b, ')');
    }
}
