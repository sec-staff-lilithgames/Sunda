package io.ktor.util;

import cf.a;
import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import sv.n0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NioPathKt {
    public static final File combineSafe(Path path, Path relativePath) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(relativePath, "relativePath");
        Path pathNormalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (pathNormalizeAndRelativize.startsWith("..")) {
            throw new InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (pathNormalizeAndRelativize.isAbsolute()) {
            throw new IllegalStateException(("Bad relative path " + relativePath).toString());
        }
        File file = path.resolve(pathNormalizeAndRelativize).toFile();
        e0.checkNotNullExpressionValue(file, "resolve(normalized).toFile()");
        return file;
    }

    private static final Path dropLeadingTopDirs(Path path) {
        Iterator it = path.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            Object next = it.next();
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            if (!e0.areEqual(a.d(next).toString(), "..")) {
                break;
            }
            i10++;
        }
        if (i10 == 0) {
            return path;
        }
        Path pathSubpath = path.subpath(i10, path.getNameCount());
        e0.checkNotNullExpressionValue(pathSubpath, "subpath(startIndex, nameCount)");
        return pathSubpath;
    }

    public static final String getExtension(Path path) {
        e0.checkNotNullParameter(path, "<this>");
        return n0.substringAfterLast$default(path.getFileName().toString(), ".", (String) null, 2, (Object) null);
    }

    public static final Path normalizeAndRelativize(Path path) {
        Path pathRelativize;
        Path pathNormalize;
        Path pathDropLeadingTopDirs;
        e0.checkNotNullParameter(path, "<this>");
        Path root = path.getRoot();
        if (root != null && (pathRelativize = root.relativize(path)) != null && (pathNormalize = pathRelativize.normalize()) != null && (pathDropLeadingTopDirs = dropLeadingTopDirs(pathNormalize)) != null) {
            return pathDropLeadingTopDirs;
        }
        Path pathNormalize2 = path.normalize();
        e0.checkNotNullExpressionValue(pathNormalize2, "normalize()");
        return dropLeadingTopDirs(pathNormalize2);
    }

    public static final File combineSafe(File file, Path relativePath) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(relativePath, "relativePath");
        Path pathNormalizeAndRelativize = normalizeAndRelativize(relativePath);
        if (pathNormalizeAndRelativize.startsWith("..")) {
            throw new InvalidPathException(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        if (!pathNormalizeAndRelativize.isAbsolute()) {
            return new File(file, pathNormalizeAndRelativize.toString());
        }
        throw new IllegalStateException(("Bad relative path " + relativePath).toString());
    }
}
