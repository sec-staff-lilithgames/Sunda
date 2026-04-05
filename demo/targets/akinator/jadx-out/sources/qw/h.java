package qw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import pw.l;
import pw.n0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final pw.l f83576a;

    /* renamed from: b, reason: collision with root package name */
    public static final pw.l f83577b;

    /* renamed from: c, reason: collision with root package name */
    public static final pw.l f83578c;

    /* renamed from: d, reason: collision with root package name */
    public static final pw.l f83579d;

    /* renamed from: e, reason: collision with root package name */
    public static final pw.l f83580e;

    static {
        l.a aVar = pw.l.f81911f;
        f83576a = aVar.encodeUtf8("/");
        f83577b = aVar.encodeUtf8("\\");
        f83578c = aVar.encodeUtf8("/\\");
        f83579d = aVar.encodeUtf8(".");
        f83580e = aVar.encodeUtf8("..");
    }

    public static final pw.l a(n0 n0Var) {
        pw.l bytes$okio = n0Var.getBytes$okio();
        pw.l lVar = f83576a;
        if (pw.l.indexOf$default(bytes$okio, lVar, 0, 2, (Object) null) != -1) {
            return lVar;
        }
        pw.l bytes$okio2 = n0Var.getBytes$okio();
        pw.l lVar2 = f83577b;
        if (pw.l.indexOf$default(bytes$okio2, lVar2, 0, 2, (Object) null) != -1) {
            return lVar2;
        }
        return null;
    }

    public static final int access$getIndexOfLastSlash(n0 n0Var) {
        int iLastIndexOf$default = pw.l.lastIndexOf$default(n0Var.getBytes$okio(), f83576a, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : pw.l.lastIndexOf$default(n0Var.getBytes$okio(), f83577b, 0, 2, (Object) null);
    }

    public static final boolean access$lastSegmentIsDotDot(n0 n0Var) {
        return n0Var.getBytes$okio().endsWith(f83580e) && (n0Var.getBytes$okio().size() == 2 || n0Var.getBytes$okio().rangeEquals(n0Var.getBytes$okio().size() + (-3), f83576a, 0, 1) || n0Var.getBytes$okio().rangeEquals(n0Var.getBytes$okio().size() + (-3), f83577b, 0, 1));
    }

    public static final int access$rootLength(n0 n0Var) {
        if (n0Var.getBytes$okio().size() != 0) {
            if (n0Var.getBytes$okio().getByte(0) != 47) {
                if (n0Var.getBytes$okio().getByte(0) == 92) {
                    if (n0Var.getBytes$okio().size() > 2 && n0Var.getBytes$okio().getByte(1) == 92) {
                        int iIndexOf = n0Var.getBytes$okio().indexOf(f83577b, 2);
                        return iIndexOf == -1 ? n0Var.getBytes$okio().size() : iIndexOf;
                    }
                } else if (n0Var.getBytes$okio().size() > 2 && n0Var.getBytes$okio().getByte(1) == 58 && n0Var.getBytes$okio().getByte(2) == 92) {
                    char c10 = (char) n0Var.getBytes$okio().getByte(0);
                    if ('a' <= c10 && c10 < '{') {
                        return 3;
                    }
                    if ('A' <= c10 && c10 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final pw.l b(byte b10) {
        if (b10 == 47) {
            return f83576a;
        }
        if (b10 == 92) {
            return f83577b;
        }
        throw new IllegalArgumentException(a.b.e(b10, "not a directory separator: "));
    }

    public static final pw.l c(String str) {
        if (e0.areEqual(str, "/")) {
            return f83576a;
        }
        if (e0.areEqual(str, "\\")) {
            return f83577b;
        }
        throw new IllegalArgumentException(a.b.k("not a directory separator: ", str));
    }

    public static final int commonCompareTo(n0 n0Var, n0 other) {
        e0.checkNotNullParameter(n0Var, "<this>");
        e0.checkNotNullParameter(other, "other");
        return n0Var.getBytes$okio().compareTo(other.getBytes$okio());
    }

    public static final boolean commonEquals(n0 n0Var, Object obj) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return (obj instanceof n0) && e0.areEqual(((n0) obj).getBytes$okio(), n0Var.getBytes$okio());
    }

    public static final int commonHashCode(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return n0Var.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return access$rootLength(n0Var) != -1;
    }

    public static final boolean commonIsRelative(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return access$rootLength(n0Var) == -1;
    }

    public static final boolean commonIsRoot(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return access$rootLength(n0Var) == n0Var.getBytes$okio().size();
    }

    public static final String commonName(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return n0Var.nameBytes().utf8();
    }

    public static final pw.l commonNameBytes(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        int iAccess$getIndexOfLastSlash = access$getIndexOfLastSlash(n0Var);
        return iAccess$getIndexOfLastSlash != -1 ? pw.l.substring$default(n0Var.getBytes$okio(), iAccess$getIndexOfLastSlash + 1, 0, 2, null) : (n0Var.volumeLetter() == null || n0Var.getBytes$okio().size() != 2) ? n0Var.getBytes$okio() : pw.l.f81912g;
    }

    public static final n0 commonNormalized(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return n0.f81931c.get(n0Var.toString(), true);
    }

    public static final n0 commonParent(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        if (e0.areEqual(n0Var.getBytes$okio(), f83579d) || e0.areEqual(n0Var.getBytes$okio(), f83576a) || e0.areEqual(n0Var.getBytes$okio(), f83577b) || access$lastSegmentIsDotDot(n0Var)) {
            return null;
        }
        int iAccess$getIndexOfLastSlash = access$getIndexOfLastSlash(n0Var);
        if (iAccess$getIndexOfLastSlash == 2 && n0Var.volumeLetter() != null) {
            if (n0Var.getBytes$okio().size() == 3) {
                return null;
            }
            return new n0(pw.l.substring$default(n0Var.getBytes$okio(), 0, 3, 1, null));
        }
        if (iAccess$getIndexOfLastSlash == 1 && n0Var.getBytes$okio().startsWith(f83577b)) {
            return null;
        }
        if (iAccess$getIndexOfLastSlash != -1 || n0Var.volumeLetter() == null) {
            return iAccess$getIndexOfLastSlash == -1 ? new n0(f83579d) : iAccess$getIndexOfLastSlash == 0 ? new n0(pw.l.substring$default(n0Var.getBytes$okio(), 0, 1, 1, null)) : new n0(pw.l.substring$default(n0Var.getBytes$okio(), 0, iAccess$getIndexOfLastSlash, 1, null));
        }
        if (n0Var.getBytes$okio().size() == 2) {
            return null;
        }
        return new n0(pw.l.substring$default(n0Var.getBytes$okio(), 0, 2, 1, null));
    }

    public static final n0 commonRelativeTo(n0 n0Var, n0 other) {
        e0.checkNotNullParameter(n0Var, "<this>");
        e0.checkNotNullParameter(other, "other");
        if (!e0.areEqual(n0Var.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + n0Var + " and " + other).toString());
        }
        List<pw.l> segmentsBytes = n0Var.getSegmentsBytes();
        List<pw.l> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && e0.areEqual(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && n0Var.getBytes$okio().size() == other.getBytes$okio().size()) {
            return n0.a.get$default(n0.f81931c, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(f83580e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + n0Var + " and " + other).toString());
        }
        if (e0.areEqual(other.getBytes$okio(), f83579d)) {
            return n0Var;
        }
        pw.g gVar = new pw.g();
        pw.l lVarA = a(other);
        if (lVarA == null && (lVarA = a(n0Var)) == null) {
            lVarA = c(n0.f81932e);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            gVar.write(f83580e);
            gVar.write(lVarA);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            gVar.write(segmentsBytes.get(i10));
            gVar.write(lVarA);
            i10++;
        }
        return toPath(gVar, false);
    }

    public static final n0 commonResolve(n0 n0Var, String child, boolean z10) {
        e0.checkNotNullParameter(n0Var, "<this>");
        e0.checkNotNullParameter(child, "child");
        return commonResolve(n0Var, toPath(new pw.g().writeUtf8(child), false), z10);
    }

    public static final n0 commonRoot(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        int iAccess$rootLength = access$rootLength(n0Var);
        if (iAccess$rootLength == -1) {
            return null;
        }
        return new n0(n0Var.getBytes$okio().substring(0, iAccess$rootLength));
    }

    public static final List<String> commonSegments(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = access$rootLength(n0Var);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < n0Var.getBytes$okio().size() && n0Var.getBytes$okio().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = n0Var.getBytes$okio().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (n0Var.getBytes$okio().getByte(iAccess$rootLength) == 47 || n0Var.getBytes$okio().getByte(iAccess$rootLength) == 92) {
                arrayList.add(n0Var.getBytes$okio().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < n0Var.getBytes$okio().size()) {
            arrayList.add(n0Var.getBytes$okio().substring(i10, n0Var.getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pw.l) it.next()).utf8());
        }
        return arrayList2;
    }

    public static final List<pw.l> commonSegmentsBytes(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = access$rootLength(n0Var);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < n0Var.getBytes$okio().size() && n0Var.getBytes$okio().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = n0Var.getBytes$okio().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (n0Var.getBytes$okio().getByte(iAccess$rootLength) == 47 || n0Var.getBytes$okio().getByte(iAccess$rootLength) == 92) {
                arrayList.add(n0Var.getBytes$okio().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < n0Var.getBytes$okio().size()) {
            arrayList.add(n0Var.getBytes$okio().substring(i10, n0Var.getBytes$okio().size()));
        }
        return arrayList;
    }

    public static final n0 commonToPath(String str, boolean z10) {
        e0.checkNotNullParameter(str, "<this>");
        return toPath(new pw.g().writeUtf8(str), z10);
    }

    public static final String commonToString(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return n0Var.getBytes$okio().utf8();
    }

    public static final Character commonVolumeLetter(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        if (pw.l.indexOf$default(n0Var.getBytes$okio(), f83576a, 0, 2, (Object) null) != -1 || n0Var.getBytes$okio().size() < 2 || n0Var.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) n0Var.getBytes$okio().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117 A[EDGE_INSN: B:98:0x0117->B:81:0x0117 BREAK  A[LOOP:1: B:53:0x00b4->B:112:0x00b4], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final pw.n0 toPath(pw.g r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qw.h.toPath(pw.g, boolean):pw.n0");
    }

    public static final n0 commonResolve(n0 n0Var, pw.l child, boolean z10) {
        e0.checkNotNullParameter(n0Var, "<this>");
        e0.checkNotNullParameter(child, "child");
        return commonResolve(n0Var, toPath(new pw.g().write(child), false), z10);
    }

    public static final n0 commonResolve(n0 n0Var, pw.g child, boolean z10) {
        e0.checkNotNullParameter(n0Var, "<this>");
        e0.checkNotNullParameter(child, "child");
        return commonResolve(n0Var, toPath(child, false), z10);
    }

    public static final n0 commonResolve(n0 n0Var, n0 child, boolean z10) {
        e0.checkNotNullParameter(n0Var, "<this>");
        e0.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        pw.l lVarA = a(n0Var);
        if (lVarA == null && (lVarA = a(child)) == null) {
            lVarA = c(n0.f81932e);
        }
        pw.g gVar = new pw.g();
        gVar.write(n0Var.getBytes$okio());
        if (gVar.size() > 0) {
            gVar.write(lVarA);
        }
        gVar.write(child.getBytes$okio());
        return toPath(gVar, z10);
    }
}
