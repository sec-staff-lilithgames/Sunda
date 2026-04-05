package pw;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p0.o2;
import pw.n0;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 extends g0 {

    /* renamed from: e, reason: collision with root package name */
    public final FileSystem f81895e;

    public f0(FileSystem nioFileSystem) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nioFileSystem, "nioFileSystem");
        this.f81895e = nioFileSystem;
    }

    @Override // pw.d0, pw.r
    public z0 appendingSink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        List listCreateListBuilder = uu.o0.createListBuilder();
        listCreateListBuilder.add(StandardOpenOption.APPEND);
        if (!z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE);
        }
        List listBuild = uu.o0.build(listCreateListBuilder);
        Path pathE = e(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathE, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return h0.sink(outputStreamNewOutputStream);
    }

    @Override // pw.d0, pw.r
    public n0 canonicalize(n0 path) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        try {
            n0.a aVar = n0.f81931c;
            Path realPath = e(path).toRealPath(new LinkOption[0]);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(realPath, "toRealPath(...)");
            return n0.a.get$default(aVar, realPath, false, 1, (Object) null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(o2.s(path, "no such file: "));
        }
    }

    @Override // pw.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81895e.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // pw.d0, pw.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createDirectory(pw.n0 r4, boolean r5) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            pw.q r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L31
            if (r5 != 0) goto L1a
            goto L31
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            java.nio.file.Path r5 = r3.e(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "failed to create directory: "
            java.lang.String r4 = p0.o2.s(r4, r1)
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.f0.createDirectory(pw.n0, boolean):void");
    }

    @Override // pw.g0, pw.d0, pw.r
    public void createSymlink(n0 source, n0 target) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(Files.createSymbolicLink(e(source), e(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(...)");
    }

    public final ArrayList d(n0 n0Var, boolean z10) throws IOException {
        Path pathE = e(n0Var);
        try {
            List listListDirectoryEntries$default = hv.d0.listDirectoryEntries$default(pathE, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listListDirectoryEntries$default.iterator();
            while (it.hasNext()) {
                arrayList.add(n0.a.get$default(n0.f81931c, (Path) it.next(), false, 1, (Object) null));
            }
            uu.u0.sort(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z10) {
                return null;
            }
            if (Files.exists(pathE, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException(o2.s(n0Var, "failed to list "));
            }
            throw new FileNotFoundException(o2.s(n0Var, "no such file: "));
        }
    }

    @Override // pw.d0, pw.r
    public void delete(n0 path, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathE = e(path);
        try {
            Files.delete(pathE);
        } catch (NoSuchFileException unused) {
            if (z10) {
                throw new FileNotFoundException(o2.s(path, "no such file: "));
            }
        } catch (IOException unused2) {
            if (Files.exists(pathE, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException(o2.s(path, "failed to delete "));
            }
        }
    }

    public final Path e(n0 n0Var) {
        Path path = this.f81895e.getPath(n0Var.toString(), new String[0]);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @Override // pw.d0, pw.r
    public List<n0> list(n0 dir) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        ArrayList arrayListD = d(dir, true);
        kotlin.jvm.internal.e0.checkNotNull(arrayListD);
        return arrayListD;
    }

    @Override // pw.d0, pw.r
    public List<n0> listOrNull(n0 dir) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dir, "dir");
        return d(dir, false);
    }

    @Override // pw.g0, pw.d0, pw.r
    public q metadataOrNull(n0 path) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        return g0.b(e(path));
    }

    @Override // pw.d0, pw.r
    public p openReadOnly(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        try {
            FileChannel fileChannelOpen = FileChannel.open(e(file), StandardOpenOption.READ);
            kotlin.jvm.internal.e0.checkNotNull(fileChannelOpen);
            return new e0(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(o2.s(file, "no such file: "));
        }
    }

    @Override // pw.d0, pw.r
    public p openReadWrite(n0 file, boolean z10, boolean z11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List listCreateListBuilder = uu.o0.createListBuilder();
        listCreateListBuilder.add(StandardOpenOption.READ);
        listCreateListBuilder.add(StandardOpenOption.WRITE);
        if (z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE_NEW);
        } else if (!z11) {
            listCreateListBuilder.add(StandardOpenOption.CREATE);
        }
        List listBuild = uu.o0.build(listCreateListBuilder);
        try {
            Path pathE = e(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathE, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            kotlin.jvm.internal.e0.checkNotNull(fileChannelOpen);
            return new e0(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(o2.s(file, "no such file: "));
        }
    }

    @Override // pw.d0, pw.r
    public z0 sink(n0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        List listCreateListBuilder = uu.o0.createListBuilder();
        if (z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE_NEW);
        }
        List listBuild = uu.o0.build(listCreateListBuilder);
        try {
            Path pathE = e(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathE, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
            return h0.sink(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(o2.s(file, "no such file: "));
        }
    }

    @Override // pw.d0, pw.r
    public b1 source(n0 file) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(e(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
            return h0.source(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(o2.s(file, "no such file: "));
        }
    }

    @Override // pw.g0, pw.d0
    public String toString() {
        String simpleName = kotlin.jvm.internal.c1.getOrCreateKotlinClass(this.f81895e.getClass()).getSimpleName();
        kotlin.jvm.internal.e0.checkNotNull(simpleName);
        return simpleName;
    }

    @Override // pw.g0, pw.d0, pw.r
    public void atomicMove(n0 source, n0 target) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        try {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(Files.move(e(source), e(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), uQjDr.lUdJYqbKVEvXTuP);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }
}
