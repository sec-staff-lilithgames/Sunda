package com.applovin.shadow.okio;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Path implements Comparable<Path> {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_SEPARATOR;
    private final ByteString bytes;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(str, z10);
        }

        public final Path get(File file) {
            e0.checkNotNullParameter(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(file, z10);
        }

        public final Path get(String str) {
            e0.checkNotNullParameter(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(path, z10);
        }

        public final Path get(java.nio.file.Path path) {
            e0.checkNotNullParameter(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        public final Path get(String str, boolean z10) {
            e0.checkNotNullParameter(str, "<this>");
            return com.applovin.shadow.okio.internal.Path.commonToPath(str, z10);
        }

        public final Path get(File file, boolean z10) {
            e0.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            return get(string, z10);
        }

        public final Path get(java.nio.file.Path path, boolean z10) {
            e0.checkNotNullParameter(path, "<this>");
            return get(path.toString(), z10);
        }
    }

    static {
        String separator = File.separator;
        e0.checkNotNullExpressionValue(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public Path(ByteString bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    public static final Path get(File file) {
        return Companion.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(str, z10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Path) && e0.areEqual(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    public final Path getRoot() {
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, iRootLength));
    }

    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i10, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = com.applovin.shadow.okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
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
        return com.applovin.shadow.okio.internal.Path.rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return com.applovin.shadow.okio.internal.Path.rootLength(this) == getBytes$okio().size();
    }

    public final String name() {
        return nameBytes().utf8();
    }

    public final ByteString nameBytes() {
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        return indexOfLastSlash != -1 ? ByteString.substring$default(getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    public final Path parent() {
        if (e0.areEqual(getBytes$okio(), com.applovin.shadow.okio.internal.Path.DOT) || e0.areEqual(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH) || e0.areEqual(getBytes$okio(), com.applovin.shadow.okio.internal.Path.BACKSLASH) || com.applovin.shadow.okio.internal.Path.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = com.applovin.shadow.okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash == 2 && volumeLetter() != null) {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            return new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && getBytes$okio().startsWith(com.applovin.shadow.okio.internal.Path.BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new Path(com.applovin.shadow.okio.internal.Path.DOT) : indexOfLastSlash == 0 ? new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null)) : new Path(ByteString.substring$default(getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (getBytes$okio().size() == 2) {
            return null;
        }
        return new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
    }

    public final Path relativeTo(Path other) {
        e0.checkNotNullParameter(other, "other");
        if (!e0.areEqual(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && e0.areEqual(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes$okio().size() == other.getBytes$okio().size()) {
            return Companion.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(com.applovin.shadow.okio.internal.Path.DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = com.applovin.shadow.okio.internal.Path.getSlash(other);
        if (slash == null && (slash = com.applovin.shadow.okio.internal.Path.getSlash(this)) == null) {
            slash = com.applovin.shadow.okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(com.applovin.shadow.okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(slash);
            i10++;
        }
        return com.applovin.shadow.okio.internal.Path.toPath(buffer, false);
    }

    public final Path resolve(Path child) {
        e0.checkNotNullParameter(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, child, false);
    }

    public final File toFile() {
        return new File(toString());
    }

    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        e0.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public String toString() {
        return getBytes$okio().utf8();
    }

    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes$okio(), com.applovin.shadow.okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) getBytes$okio().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    public static final Path get(File file, boolean z10) {
        return Companion.get(file, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(byteString, z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(Path other) {
        e0.checkNotNullParameter(other, "other");
        return getBytes$okio().compareTo(other.getBytes$okio());
    }

    public final Path resolve(Path child, boolean z10) {
        e0.checkNotNullParameter(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, child, z10);
    }

    public static final Path get(String str) {
        return Companion.get(str);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(path2, z10);
    }

    public final Path resolve(String child) {
        e0.checkNotNullParameter(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
    }

    public static final Path get(String str, boolean z10) {
        return Companion.get(str, z10);
    }

    public static final Path get(java.nio.file.Path path) {
        return Companion.get(path);
    }

    public final Path resolve(ByteString child) {
        e0.checkNotNullParameter(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(child), false), false);
    }

    public static final Path get(java.nio.file.Path path, boolean z10) {
        return Companion.get(path, z10);
    }

    public final Path resolve(String child, boolean z10) {
        e0.checkNotNullParameter(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), z10);
    }

    public final Path resolve(ByteString child, boolean z10) {
        e0.checkNotNullParameter(child, "child");
        return com.applovin.shadow.okio.internal.Path.commonResolve(this, com.applovin.shadow.okio.internal.Path.toPath(new Buffer().write(child), false), z10);
    }
}
