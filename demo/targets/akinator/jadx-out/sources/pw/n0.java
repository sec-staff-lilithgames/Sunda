package pw;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f81931c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final String f81932e;

    /* renamed from: b, reason: collision with root package name */
    public final l f81933b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ n0 get$default(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.get(str, z10);
        }

        public final n0 get(File file) {
            kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        public static /* synthetic */ n0 get$default(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.get(file, z10);
        }

        public final n0 get(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ n0 get$default(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.get(path, z10);
        }

        public final n0 get(Path path) {
            kotlin.jvm.internal.e0.checkNotNullParameter(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        public final n0 get(String str, boolean z10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            return qw.h.commonToPath(str, z10);
        }

        public final n0 get(File file, boolean z10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return get(string, z10);
        }

        public final n0 get(Path path, boolean z10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(path, "<this>");
            return get(path.toString(), z10);
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(separator, "separator");
        f81932e = separator;
    }

    public n0(l bytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        this.f81933b = bytes;
    }

    public static final n0 get(File file) {
        return f81931c.get(file);
    }

    public static /* synthetic */ n0 resolve$default(n0 n0Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return n0Var.resolve(str, z10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof n0) && kotlin.jvm.internal.e0.areEqual(((n0) obj).getBytes$okio(), getBytes$okio());
    }

    public final l getBytes$okio() {
        return this.f81933b;
    }

    public final n0 getRoot() {
        int iAccess$rootLength = qw.h.access$rootLength(this);
        if (iAccess$rootLength == -1) {
            return null;
        }
        return new n0(getBytes$okio().substring(0, iAccess$rootLength));
    }

    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = qw.h.access$rootLength(this);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < getBytes$okio().size() && getBytes$okio().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (getBytes$okio().getByte(iAccess$rootLength) == 47 || getBytes$okio().getByte(iAccess$rootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l) it.next()).utf8());
        }
        return arrayList2;
    }

    public final List<l> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = qw.h.access$rootLength(this);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < getBytes$okio().size() && getBytes$okio().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (getBytes$okio().getByte(iAccess$rootLength) == 47 || getBytes$okio().getByte(iAccess$rootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return qw.h.access$rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return qw.h.access$rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return qw.h.access$rootLength(this) == getBytes$okio().size();
    }

    public final String name() {
        return nameBytes().utf8();
    }

    public final l nameBytes() {
        int iAccess$getIndexOfLastSlash = qw.h.access$getIndexOfLastSlash(this);
        return iAccess$getIndexOfLastSlash != -1 ? l.substring$default(getBytes$okio(), iAccess$getIndexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : l.f81912g;
    }

    public final n0 normalized() {
        return f81931c.get(toString(), true);
    }

    public final n0 parent() {
        if (kotlin.jvm.internal.e0.areEqual(getBytes$okio(), qw.h.f83579d) || kotlin.jvm.internal.e0.areEqual(getBytes$okio(), qw.h.f83576a) || kotlin.jvm.internal.e0.areEqual(getBytes$okio(), qw.h.f83577b) || qw.h.access$lastSegmentIsDotDot(this)) {
            return null;
        }
        int iAccess$getIndexOfLastSlash = qw.h.access$getIndexOfLastSlash(this);
        if (iAccess$getIndexOfLastSlash == 2 && volumeLetter() != null) {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            return new n0(l.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        if (iAccess$getIndexOfLastSlash == 1 && getBytes$okio().startsWith(qw.h.f83577b)) {
            return null;
        }
        if (iAccess$getIndexOfLastSlash != -1 || volumeLetter() == null) {
            return iAccess$getIndexOfLastSlash == -1 ? new n0(qw.h.f83579d) : iAccess$getIndexOfLastSlash == 0 ? new n0(l.substring$default(getBytes$okio(), 0, 1, 1, null)) : new n0(l.substring$default(getBytes$okio(), 0, iAccess$getIndexOfLastSlash, 1, null));
        }
        if (getBytes$okio().size() == 2) {
            return null;
        }
        return new n0(l.substring$default(getBytes$okio(), 0, 2, 1, null));
    }

    public final n0 relativeTo(n0 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (!kotlin.jvm.internal.e0.areEqual(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<l> segmentsBytes = getSegmentsBytes();
        List<l> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && kotlin.jvm.internal.e0.areEqual(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes$okio().size() == other.getBytes$okio().size()) {
            return a.get$default(f81931c, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(qw.h.f83580e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.e0.areEqual(other.getBytes$okio(), qw.h.f83579d)) {
            return this;
        }
        g gVar = new g();
        l lVarA = qw.h.a(other);
        if (lVarA == null && (lVarA = qw.h.a(this)) == null) {
            lVarA = qw.h.c(f81932e);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            gVar.write(qw.h.f83580e);
            gVar.write(lVarA);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            gVar.write(segmentsBytes.get(i10));
            gVar.write(lVarA);
            i10++;
        }
        return qw.h.toPath(gVar, false);
    }

    public final n0 resolve(n0 child) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        return qw.h.commonResolve(this, child, false);
    }

    public final File toFile() {
        return new File(toString());
    }

    public final Path toNioPath() {
        Path path = Paths.get(toString(), new String[0]);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public String toString() {
        return getBytes$okio().utf8();
    }

    public final Character volumeLetter() {
        if (l.indexOf$default(getBytes$okio(), qw.h.f83576a, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) getBytes$okio().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    public static final n0 get(File file, boolean z10) {
        return f81931c.get(file, z10);
    }

    public static /* synthetic */ n0 resolve$default(n0 n0Var, l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return n0Var.resolve(lVar, z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(n0 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return getBytes$okio().compareTo(other.getBytes$okio());
    }

    public final n0 resolve(n0 child, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        return qw.h.commonResolve(this, child, z10);
    }

    public static final n0 get(String str) {
        return f81931c.get(str);
    }

    public static /* synthetic */ n0 resolve$default(n0 n0Var, n0 n0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return n0Var.resolve(n0Var2, z10);
    }

    public final n0 resolve(String child) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        return qw.h.commonResolve(this, qw.h.toPath(new g().writeUtf8(child), false), false);
    }

    public static final n0 get(String str, boolean z10) {
        return f81931c.get(str, z10);
    }

    public static final n0 get(Path path) {
        return f81931c.get(path);
    }

    public final n0 resolve(l child) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        return qw.h.commonResolve(this, qw.h.toPath(new g().write(child), false), false);
    }

    public static final n0 get(Path path, boolean z10) {
        return f81931c.get(path, z10);
    }

    public final n0 resolve(String child, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        return qw.h.commonResolve(this, qw.h.toPath(new g().writeUtf8(child), false), z10);
    }

    public final n0 resolve(l child, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        return qw.h.commonResolve(this, qw.h.toPath(new g().write(child), false), z10);
    }
}
