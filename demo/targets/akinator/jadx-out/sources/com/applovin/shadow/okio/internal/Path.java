package com.applovin.shadow.okio.internal;

import a.b;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.internal.-Path, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Path {
    private static final ByteString ANY_SLASH;
    private static final ByteString BACKSLASH;
    private static final ByteString DOT;
    private static final ByteString DOT_DOT;
    private static final ByteString SLASH;

    static {
        ByteString.Companion companion = ByteString.Companion;
        SLASH = companion.encodeUtf8("/");
        BACKSLASH = companion.encodeUtf8("\\");
        ANY_SLASH = companion.encodeUtf8("/\\");
        DOT = companion.encodeUtf8(".");
        DOT_DOT = companion.encodeUtf8("..");
    }

    public static final int commonCompareTo(com.applovin.shadow.okio.Path path, com.applovin.shadow.okio.Path other) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(other, "other");
        return path.getBytes$okio().compareTo(other.getBytes$okio());
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.Path path, Object obj) {
        e0.checkNotNullParameter(path, "<this>");
        return (obj instanceof com.applovin.shadow.okio.Path) && e0.areEqual(((com.applovin.shadow.okio.Path) obj).getBytes$okio(), path.getBytes$okio());
    }

    public static final int commonHashCode(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return path.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return rootLength(path) == path.getBytes$okio().size();
    }

    public static final String commonName(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return path.nameBytes().utf8();
    }

    public static final ByteString commonNameBytes(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(path);
        return indexOfLastSlash != -1 ? ByteString.substring$default(path.getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (path.volumeLetter() == null || path.getBytes$okio().size() != 2) ? path.getBytes$okio() : ByteString.EMPTY;
    }

    public static final com.applovin.shadow.okio.Path commonNormalized(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return com.applovin.shadow.okio.Path.Companion.get(path.toString(), true);
    }

    public static final com.applovin.shadow.okio.Path commonParent(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        if (e0.areEqual(path.getBytes$okio(), DOT) || e0.areEqual(path.getBytes$okio(), SLASH) || e0.areEqual(path.getBytes$okio(), BACKSLASH) || lastSegmentIsDotDot(path)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes$okio().size() == 3) {
                return null;
            }
            return new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && path.getBytes$okio().startsWith(BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || path.volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new com.applovin.shadow.okio.Path(DOT) : indexOfLastSlash == 0 ? new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 1, 1, null)) : new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (path.getBytes$okio().size() == 2) {
            return null;
        }
        return new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 2, 1, null));
    }

    public static final com.applovin.shadow.okio.Path commonRelativeTo(com.applovin.shadow.okio.Path path, com.applovin.shadow.okio.Path other) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(other, "other");
        if (!e0.areEqual(path.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = path.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && e0.areEqual(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && path.getBytes$okio().size() == other.getBytes$okio().size()) {
            return Path.Companion.get$default(com.applovin.shadow.okio.Path.Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = getSlash(other);
        if (slash == null && (slash = getSlash(path)) == null) {
            slash = toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(slash);
            i10++;
        }
        return toPath(buffer, false);
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, String child, boolean z10) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(child), false), z10);
    }

    public static final com.applovin.shadow.okio.Path commonRoot(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            return null;
        }
        return new com.applovin.shadow.okio.Path(path.getBytes$okio().substring(0, iRootLength));
    }

    public static final List<String> commonSegments(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i10, path.getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    public static final List<ByteString> commonSegmentsBytes(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i10, path.getBytes$okio().size()));
        }
        return arrayList;
    }

    public static final com.applovin.shadow.okio.Path commonToPath(String str, boolean z10) {
        e0.checkNotNullParameter(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z10);
    }

    public static final String commonToString(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return path.getBytes$okio().utf8();
    }

    public static final Character commonVolumeLetter(com.applovin.shadow.okio.Path path) {
        e0.checkNotNullParameter(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null) != -1 || path.getBytes$okio().size() < 2 || path.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) path.getBytes$okio().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIndexOfLastSlash(com.applovin.shadow.okio.Path path) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes$okio(), BACKSLASH, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString getSlash(com.applovin.shadow.okio.Path path) {
        ByteString bytes$okio = path.getBytes$okio();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes$okio, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes$okio2 = path.getBytes$okio();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes$okio2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lastSegmentIsDotDot(com.applovin.shadow.okio.Path path) {
        return path.getBytes$okio().endsWith(DOT_DOT) && (path.getBytes$okio().size() == 2 || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), SLASH, 0, 1) || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), BACKSLASH, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootLength(com.applovin.shadow.okio.Path path) {
        if (path.getBytes$okio().size() == 0) {
            return -1;
        }
        if (path.getBytes$okio().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes$okio().getByte(0) == 92) {
            if (path.getBytes$okio().size() <= 2 || path.getBytes$okio().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = path.getBytes$okio().indexOf(BACKSLASH, 2);
            return iIndexOf == -1 ? path.getBytes$okio().size() : iIndexOf;
        }
        if (path.getBytes$okio().size() > 2 && path.getBytes$okio().getByte(1) == 58 && path.getBytes$okio().getByte(2) == 92) {
            char c10 = (char) path.getBytes$okio().getByte(0);
            if ('a' <= c10 && c10 < '{') {
                return 3;
            }
            if ('A' <= c10 && c10 < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
        if (!e0.areEqual(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c10 = (char) buffer.getByte(0L);
        if ('a' > c10 || c10 >= '{') {
            return 'A' <= c10 && c10 < '[';
        }
        return true;
    }

    public static final com.applovin.shadow.okio.Path toPath(Buffer buffer, boolean z10) throws EOFException {
        ByteString byteString;
        ByteString byteString2;
        e0.checkNotNullParameter(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString slash = null;
        int i10 = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b10 = buffer.readByte();
            if (slash == null) {
                slash = toSlash(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && e0.areEqual(slash, byteString);
        if (z11) {
            e0.checkNotNull(slash);
            buffer2.write(slash);
            buffer2.write(slash);
        } else if (i10 > 0) {
            e0.checkNotNull(slash);
            buffer2.write(slash);
        } else {
            long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (slash == null) {
                slash = jIndexOfElement == -1 ? toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(jIndexOfElement));
            }
            if (startsWithVolumeLetterAndColon(buffer, slash)) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z12 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (jIndexOfElement2 == -1) {
                byteString2 = buffer.readByteString();
            } else {
                byteString2 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (e0.areEqual(byteString2, byteString3)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || e0.areEqual(y0.last((List) arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z11 || arrayList.size() != 1) {
                        v0.removeLastOrNull(arrayList);
                    }
                }
            } else if (!e0.areEqual(byteString2, DOT) && !e0.areEqual(byteString2, ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                buffer2.write(slash);
            }
            buffer2.write((ByteString) arrayList.get(i11));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new com.applovin.shadow.okio.Path(buffer2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString toSlash(String str) {
        if (e0.areEqual(str, "/")) {
            return SLASH;
        }
        if (e0.areEqual(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(b.k("not a directory separator: ", str));
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, ByteString child, boolean z10) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().write(child), false), z10);
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, Buffer child, boolean z10) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(child, false), z10);
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, com.applovin.shadow.okio.Path child, boolean z10) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(child)) == null) {
            slash = toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes$okio());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(child.getBytes$okio());
        return toPath(buffer, z10);
    }

    private static final ByteString toSlash(byte b10) {
        if (b10 == 47) {
            return SLASH;
        }
        if (b10 == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(b.e(b10, "not a directory separator: "));
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }
}
