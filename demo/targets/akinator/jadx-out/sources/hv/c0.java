package hv;

import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c0 extends s {
    public static final void a(Path path, Path path2) throws FileSystemLoopException {
        if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path2)) {
            throw new FileSystemLoopException(path.toString());
        }
    }

    public static final FileVisitResult b(ArrayList arrayList, kv.q qVar, Path path, Path path2, Path path3, kv.q qVar2, Path path4) {
        try {
            if (!arrayList.isEmpty()) {
                checkFileName(path4);
                Object objLast = y0.last((List<? extends Object>) arrayList);
                e0.checkNotNullExpressionValue(objLast, "last(...)");
                a(path4, (Path) objLast);
            }
            int i10 = x.$EnumSwitchMapping$0[((b) qVar.invoke(c.f59191a, path4, c(path, path2, path3, path4))).ordinal()];
            if (i10 == 1) {
                return FileVisitResult.CONTINUE;
            }
            if (i10 == 2) {
                return FileVisitResult.TERMINATE;
            }
            if (i10 == 3) {
                return FileVisitResult.SKIP_SUBTREE;
            }
            throw new tu.t();
        } catch (Exception e10) {
            return d(qVar2, path, path2, path3, path4, e10);
        }
    }

    public static final Path c(Path path, Path path2, Path path3, Path path4) throws i {
        Path pathResolve = path2.resolve(d0.relativeTo(path4, path).toString());
        if (!pathResolve.normalize().startsWith(path3)) {
            throw new i(path4, pathResolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        e0.checkNotNull(pathResolve);
        return pathResolve;
    }

    public static final void checkFileName(Path path) throws i {
        e0.checkNotNullParameter(path, "<this>");
        String name = d0.getName(path);
        int iHashCode = name.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !name.equals("./")) {
                                return;
                            }
                        } else if (!name.equals("..")) {
                            return;
                        }
                    } else if (!name.equals("..\\")) {
                        return;
                    }
                } else if (!name.equals("../")) {
                    return;
                }
            } else if (!name.equals(".\\")) {
                return;
            }
        } else if (!name.equals(".")) {
            return;
        }
        throw new i(path);
    }

    public static final Path copyToRecursively(Path path, Path target, kv.q onError, boolean z10, boolean z11) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(target, "target");
        e0.checkNotNullParameter(onError, "onError");
        return z11 ? copyToRecursively(path, target, onError, z10, new v(z10, 1)) : copyToRecursively$default(path, target, onError, z10, (kv.q) null, 8, (Object) null);
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, kv.q qVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = y.f59264b;
        }
        return copyToRecursively(path, path2, qVar, z10, z11);
    }

    public static final FileVisitResult d(kv.q qVar, Path path, Path path2, Path path3, Path path4, Exception exc) {
        int i10 = x.$EnumSwitchMapping$1[((k) qVar.invoke(path4, c(path, path2, path3, path4), exc)).ordinal()];
        if (i10 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new tu.t();
    }

    public static final void deleteRecursively(Path path) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        e0.checkNotNullParameter(path, "<this>");
        boolean z10 = false;
        boolean z11 = true;
        e eVar = new e(0, 1, null);
        Path fileName = path.getFileName();
        if (fileName != null) {
            Path parent = path.getParent();
            if (parent == null) {
                parent = path.getFileSystem().getPath("", new String[0]);
            }
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    if (directoryStreamNewDirectoryStream instanceof SecureDirectoryStream) {
                        eVar.setPath(parent);
                        f((SecureDirectoryStream) directoryStreamNewDirectoryStream, fileName, null, eVar);
                    } else {
                        z10 = true;
                    }
                    gv.d.closeFinally(directoryStreamNewDirectoryStream, null);
                    z11 = z10;
                } finally {
                }
            }
        }
        if (z11) {
            g(path, null, eVar);
        }
        List<Exception> collectedExceptions = eVar.getCollectedExceptions();
        if (collectedExceptions.isEmpty()) {
            return;
        }
        FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterator<T> it = collectedExceptions.iterator();
        while (it.hasNext()) {
            tu.h.addSuppressed(fileSystemException, (Exception) it.next());
        }
        throw fileSystemException;
    }

    public static final void e(SecureDirectoryStream secureDirectoryStream, Path path, e eVar) throws IOException {
        SecureDirectoryStream secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e10) {
                eVar.collect(e10);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStreamNewDirectoryStream = null;
        }
        if (secureDirectoryStreamNewDirectoryStream == null) {
            return;
        }
        try {
            Iterator it = secureDirectoryStreamNewDirectoryStream.iterator();
            e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Path fileName = cf.a.d(it.next()).getFileName();
                e0.checkNotNullExpressionValue(fileName, "getFileName(...)");
                f(secureDirectoryStreamNewDirectoryStream, fileName, eVar.getPath(), eVar);
            }
            gv.d.closeFinally(secureDirectoryStreamNewDirectoryStream, null);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[Catch: Exception -> 0x0013, TRY_ENTER, TryCatch #2 {Exception -> 0x0013, blocks: (B:4:0x0005, B:7:0x0015, B:8:0x001f, B:12:0x003d, B:14:0x0043, B:16:0x0050, B:17:0x0054), top: B:28:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: Exception -> 0x0013, TRY_LEAVE, TryCatch #2 {Exception -> 0x0013, blocks: (B:4:0x0005, B:7:0x0015, B:8:0x001f, B:12:0x003d, B:14:0x0043, B:16:0x0050, B:17:0x0054), top: B:28:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: Exception -> 0x0013, NoSuchFileException -> 0x005b, TRY_LEAVE, TryCatch #1 {NoSuchFileException -> 0x005b, blocks: (B:16:0x0050, B:17:0x0054), top: B:26:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.nio.file.SecureDirectoryStream r3, java.nio.file.Path r4, java.nio.file.Path r5, hv.e r6) throws java.io.IOException {
        /*
            r6.enterEntry(r4)
            if (r5 == 0) goto L15
            java.nio.file.Path r0 = r6.getPath()     // Catch: java.lang.Exception -> L13
            kotlin.jvm.internal.e0.checkNotNull(r0)     // Catch: java.lang.Exception -> L13
            checkFileName(r0)     // Catch: java.lang.Exception -> L13
            a(r0, r5)     // Catch: java.lang.Exception -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L58
        L15:
            r5 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r5]     // Catch: java.lang.Exception -> L13
            java.nio.file.LinkOption r1 = cf.a.c()     // Catch: java.lang.Exception -> L13
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Exception -> L13
            java.lang.Class<java.nio.file.attribute.BasicFileAttributeView> r1 = java.nio.file.attribute.BasicFileAttributeView.class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.attribute.FileAttributeView r5 = r3.getFileAttributeView(r4, r1, r5)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.attribute.BasicFileAttributeView r5 = (java.nio.file.attribute.BasicFileAttributeView) r5     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.attribute.BasicFileAttributes r5 = r5.readAttributes()     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3a
            boolean r5 = r5.isDirectory()     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L3a
            goto L3b
        L3a:
            r5 = 0
        L3b:
            if (r5 == 0) goto L41
            boolean r2 = r5.booleanValue()     // Catch: java.lang.Exception -> L13
        L41:
            if (r2 == 0) goto L54
            int r5 = r6.getTotalExceptions()     // Catch: java.lang.Exception -> L13
            e(r3, r4, r6)     // Catch: java.lang.Exception -> L13
            int r0 = r6.getTotalExceptions()     // Catch: java.lang.Exception -> L13
            if (r5 != r0) goto L5b
            r3.deleteDirectory(r4)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L5b
            goto L5b
        L54:
            r3.deleteFile(r4)     // Catch: java.lang.Exception -> L13 java.nio.file.NoSuchFileException -> L5b
            goto L5b
        L58:
            r6.collect(r3)
        L5b:
            r6.exitEntry(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.c0.f(java.nio.file.SecureDirectoryStream, java.nio.file.Path, java.nio.file.Path, hv.e):void");
    }

    public static final void g(Path path, Path path2, e eVar) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        if (path2 != null) {
            try {
                checkFileName(path);
                a(path, path2);
            } catch (Exception e10) {
                eVar.collect(e10);
                return;
            }
        }
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            Files.deleteIfExists(path);
            return;
        }
        int totalExceptions = eVar.getTotalExceptions();
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    Iterator<Path> it = directoryStreamNewDirectoryStream.iterator();
                    e0.checkNotNullExpressionValue(it, "iterator(...)");
                    while (it.hasNext()) {
                        Path pathD = cf.a.d(it.next());
                        e0.checkNotNull(pathD);
                        g(pathD, path, eVar);
                    }
                    gv.d.closeFinally(directoryStreamNewDirectoryStream, null);
                } finally {
                }
            }
        } catch (Exception e11) {
            eVar.collect(e11);
        }
        if (totalExceptions == eVar.getTotalExceptions()) {
            Files.deleteIfExists(path);
        }
    }

    public static final Path copyToRecursively(Path path, Path target, kv.q onError, boolean z10, kv.q copyAction) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(target, "target");
        e0.checkNotNullParameter(onError, "onError");
        e0.checkNotNullParameter(copyAction, "copyAction");
        LinkOption[] linkOptions = j.f59208a.toLinkOptions(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException(path.toString(), target.toString(), QGjYBESwAiCc.oWYYmpFZ);
        }
        boolean zStartsWith = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z10 || !Files.isSymbolicLink(path))) {
            boolean z11 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
            if (!z11 || !Files.isSameFile(path, target)) {
                if (e0.areEqual(path.getFileSystem(), target.getFileSystem())) {
                    if (z11) {
                        zStartsWith = target.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        Path parent = target.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                            zStartsWith = true;
                        }
                    }
                }
                if (zStartsWith) {
                    throw new FileSystemException(path.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        d0.visitFileTree$default(path, 0, z10, new com.moloco.sdk.acm.http.a(new ArrayList(), copyAction, path, target, target.normalize(), onError, 1), 1, (Object) null);
        return target;
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, kv.q qVar, boolean z10, kv.q qVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = z.f59265b;
        }
        if ((i10 & 8) != 0) {
            qVar2 = new v(z10, 0);
        }
        return copyToRecursively(path, path2, qVar, z10, qVar2);
    }
}
