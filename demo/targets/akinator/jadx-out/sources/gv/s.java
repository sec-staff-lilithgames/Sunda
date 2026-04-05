package gv;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.n0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s extends p {
    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            if (!e0.areEqual(name, ".")) {
                if (!e0.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || e0.areEqual(((File) y0.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static final String c(File file, File file2) throws IOException {
        h components = m.toComponents(file);
        h hVar = new h(components.getRoot(), b(components.getSegments()));
        h components2 = m.toComponents(file2);
        h hVar2 = new h(components2.getRoot(), b(components2.getSegments()));
        if (!e0.areEqual(hVar.getRoot(), hVar2.getRoot())) {
            return null;
        }
        int size = hVar2.getSize();
        int size2 = hVar.getSize();
        int iMin = Math.min(size2, size);
        int i10 = 0;
        while (i10 < iMin && e0.areEqual(hVar.getSegments().get(i10), hVar2.getSegments().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = size - 1;
        if (i10 <= i11) {
            while (!e0.areEqual(hVar2.getSegments().get(i11).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < size2) {
            if (i10 < size) {
                sb2.append(File.separatorChar);
            }
            List listDrop = y0.drop(hVar.getSegments(), i10);
            String separator = File.separator;
            e0.checkNotNullExpressionValue(separator, "separator");
            y0.joinTo(listDrop, sb2, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : separator, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : null);
        }
        return sb2.toString();
    }

    public static final boolean copyRecursively(File file, File target, boolean z10, kv.p onError) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(target, "target");
        e0.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new v(file, null, "The source file doesn't exist.", 2, null)) != w.f58512b;
        }
        try {
            Iterator<File> it = p.walkTopDown(file).onFail(new q(0, onError)).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.exists()) {
                    File file2 = new File(target, toRelativeString(next, file));
                    if (file2.exists() && (!next.isDirectory() || !file2.isDirectory())) {
                        if (z10) {
                            if (file2.isDirectory()) {
                                if (!deleteRecursively(file2)) {
                                }
                            } else if (!file2.delete()) {
                            }
                        }
                        if (onError.invoke(file2, new g(next, file2, "The destination file already exists.")) == w.f58512b) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file2.mkdirs();
                    } else {
                        boolean z11 = z10;
                        if (copyTo$default(next, file2, z11, 0, 4, null).length() != next.length() && onError.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == w.f58512b) {
                            return false;
                        }
                        z10 = z11;
                    }
                } else if (onError.invoke(next, new v(next, null, "The source file doesn't exist.", 2, null)) == w.f58512b) {
                    return false;
                }
            }
            return true;
        } catch (x unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z10, kv.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            pVar = r.f58507b;
        }
        return copyRecursively(file, file2, z10, pVar);
    }

    public static final File copyTo(File file, File target, boolean z10, int i10) throws i {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new v(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new g(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new g(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new i(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                c.copyTo(fileInputStream, fileOutputStream, i10);
                d.closeFinally(fileOutputStream, null);
                d.closeFinally(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = Segment.SIZE;
        }
        return copyTo(file, file2, z10, i10);
    }

    @tu.f
    public static final File createTempDir(String prefix, String str, File file) throws IOException {
        e0.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            e0.checkNotNull(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return createTempDir(str, str2, file);
    }

    @tu.f
    public static final File createTempFile(String prefix, String str, File file) throws IOException {
        e0.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        e0.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return createTempFile(str, str2, file);
    }

    public static boolean deleteRecursively(File file) {
        e0.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : p.walkBottomUp(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static final boolean endsWith(File file, File other) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(other, "other");
        h components = m.toComponents(file);
        h components2 = m.toComponents(other);
        if (components2.isRooted()) {
            return e0.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static String getExtension(File file) {
        e0.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        e0.checkNotNullExpressionValue(name, "getName(...)");
        return n0.substringAfterLast(name, '.', "");
    }

    public static final String getInvariantSeparatorsPath(File file) {
        e0.checkNotNullParameter(file, "<this>");
        char c10 = File.separatorChar;
        if (c10 != '/') {
            String path = file.getPath();
            e0.checkNotNullExpressionValue(path, "getPath(...)");
            return k0.replace$default(path, c10, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        e0.checkNotNullExpressionValue(path2, "getPath(...)");
        return path2;
    }

    public static final String getNameWithoutExtension(File file) {
        e0.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        e0.checkNotNullExpressionValue(name, "getName(...)");
        return n0.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
    }

    public static File normalize(File file) {
        e0.checkNotNullParameter(file, "<this>");
        h components = m.toComponents(file);
        File root = components.getRoot();
        ArrayList arrayListB = b(components.getSegments());
        String separator = File.separator;
        e0.checkNotNullExpressionValue(separator, "separator");
        return resolve(root, y0.joinToString$default(arrayListB, separator, null, null, 0, null, null, 62, null));
    }

    public static final File relativeTo(File file, File base) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(base, "base");
        return new File(toRelativeString(file, base));
    }

    public static final File relativeToOrNull(File file, File base) throws IOException {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(base, "base");
        String strC = c(file, base);
        if (strC != null) {
            return new File(strC);
        }
        return null;
    }

    public static final File relativeToOrSelf(File file, File base) throws IOException {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(base, "base");
        String strC = c(file, base);
        return strC != null ? new File(strC) : file;
    }

    public static final File resolve(File file, File relative) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(relative, "relative");
        if (m.isRooted(relative)) {
            return relative;
        }
        String string = file.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!n0.endsWith$default((CharSequence) string, c10, false, 2, (Object) null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    public static final File resolveSibling(File file, File relative) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(relative, "relative");
        h components = m.toComponents(file);
        return resolve(resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final boolean startsWith(File file, File other) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(other, "other");
        h components = m.toComponents(file);
        h components2 = m.toComponents(other);
        if (e0.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final String toRelativeString(File file, File base) throws IOException {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(base, "base");
        String strC = c(file, base);
        if (strC != null) {
            return strC;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    public static File resolve(File file, String relative) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(relative, "relative");
        return resolve(file, new File(relative));
    }

    public static final File resolveSibling(File file, String relative) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(relative, "relative");
        return resolveSibling(file, new File(relative));
    }

    public static boolean startsWith(File file, String other) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(other, "other");
        return startsWith(file, new File(other));
    }

    public static final boolean endsWith(File file, String other) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(other, "other");
        return endsWith(file, new File(other));
    }
}
