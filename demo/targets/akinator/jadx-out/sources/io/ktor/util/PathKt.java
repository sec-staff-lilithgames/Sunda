package io.ktor.util;

import gv.m;
import gv.s;
import j1.o2;
import java.io.File;
import kotlin.jvm.internal.e0;
import sv.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PathKt {
    public static final File combineSafe(File file, String relativePath) {
        e0.checkNotNullParameter(file, "<this>");
        e0.checkNotNullParameter(relativePath, "relativePath");
        return combineSafe(file, new File(relativePath));
    }

    public static final int dropLeadingTopDirs(String path) {
        e0.checkNotNullParameter(path, "path");
        int length = path.length() - 1;
        int i10 = 0;
        while (i10 <= length) {
            char cCharAt = path.charAt(i10);
            if (!isPathSeparator(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                if (i10 != length) {
                    char cCharAt2 = path.charAt(i10 + 1);
                    if (!isPathSeparator(cCharAt2)) {
                        if (cCharAt2 == '.') {
                            int i11 = i10 + 2;
                            if (i11 != path.length()) {
                                if (!isPathSeparator(path.charAt(i11))) {
                                    break;
                                }
                                i10 += 3;
                            } else {
                                i10 = i11;
                            }
                        } else {
                            break;
                        }
                    } else {
                        i10 += 2;
                    }
                } else {
                    return i10 + 1;
                }
            } else {
                i10++;
            }
        }
        return i10;
    }

    private static final boolean isPathSeparator(char c10) {
        return c10 == '\\' || c10 == '/';
    }

    private static final boolean isPathSeparatorOrDot(char c10) {
        return c10 == '.' || isPathSeparator(c10);
    }

    public static final File normalizeAndRelativize(File file) {
        e0.checkNotNullParameter(file, "<this>");
        return dropLeadingTopDirs(notRooted(s.normalize(file)));
    }

    private static final File notRooted(File file) {
        String strSubstring;
        if (!m.isRooted(file)) {
            return file;
        }
        File file2 = file;
        while (true) {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                break;
            }
            file2 = parentFile;
        }
        String path = file.getPath();
        e0.checkNotNullExpressionValue(path, "path");
        String strDrop = p0.drop(path, file2.getName().length());
        int length = strDrop.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                char cCharAt = strDrop.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    strSubstring = strDrop.substring(i10);
                    e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    break;
                }
                i10++;
            } else {
                strSubstring = "";
                break;
            }
        }
        return new File(strSubstring);
    }

    private static final File combineSafe(File file, File file2) {
        File fileNormalizeAndRelativize = normalizeAndRelativize(file2);
        if (s.startsWith(fileNormalizeAndRelativize, "..")) {
            throw new IllegalArgumentException(o2.h(file2, "Bad relative path "));
        }
        if (fileNormalizeAndRelativize.isAbsolute()) {
            throw new IllegalStateException(o2.h(file2, "Bad relative path ").toString());
        }
        return new File(file, fileNormalizeAndRelativize.getPath());
    }

    private static final File dropLeadingTopDirs(File file) {
        String path = file.getPath();
        if (path == null) {
            path = "";
        }
        int iDropLeadingTopDirs = dropLeadingTopDirs(path);
        if (iDropLeadingTopDirs == 0) {
            return file;
        }
        if (iDropLeadingTopDirs >= file.getPath().length()) {
            return new File(".");
        }
        String path2 = file.getPath();
        e0.checkNotNullExpressionValue(path2, "path");
        String strSubstring = path2.substring(iDropLeadingTopDirs);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return new File(strSubstring);
    }
}
