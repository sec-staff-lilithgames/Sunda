package com.applovin.shadow.okio;

import b0.e2;
import cf.a;
import com.applovin.shadow.okio.Path;
import hv.d0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import uu.o0;
import uu.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem nioFileSystem) {
        e0.checkNotNullParameter(nioFileSystem, "nioFileSystem");
        this.nioFileSystem = nioFileSystem;
    }

    private final java.nio.file.Path resolve(Path path) {
        java.nio.file.Path path2 = this.nioFileSystem.getPath(path.toString(), new String[0]);
        e0.checkNotNullExpressionValue(path2, "getPath(...)");
        return path2;
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        List listCreateListBuilder = o0.createListBuilder();
        listCreateListBuilder.add(StandardOpenOption.APPEND);
        if (!z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE);
        }
        List listBuild = o0.build(listCreateListBuilder);
        java.nio.file.Path pathResolve = resolve(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        e0.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(this, *options)");
        return Okio.sink(outputStreamNewOutputStream);
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        try {
            e0.checkNotNullExpressionValue(Files.move(resolve(source), resolve(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(this, target, *options)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        try {
            Path.Companion companion = Path.Companion;
            java.nio.file.Path realPath = resolve(path).toRealPath(new LinkOption[0]);
            e0.checkNotNullExpressionValue(realPath, "toRealPath(...)");
            return Path.Companion.get$default(companion, realPath, false, 1, (Object) null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(e2.j(path, "no such file: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void createDirectory(com.applovin.shadow.okio.Path r4, boolean r5) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            com.applovin.shadow.okio.FileMetadata r0 = r3.metadataOrNull(r4)
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
            java.nio.file.Path r5 = r3.resolve(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(this, *attributes)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "failed to create directory: "
            java.lang.String r4 = b0.e2.j(r4, r1)
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.NioFileSystemWrappingFileSystem.createDirectory(com.applovin.shadow.okio.Path, boolean):void");
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        e0.checkNotNullExpressionValue(Files.createSymbolicLink(resolve(source), resolve(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(this, target, *attributes)");
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        e0.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        java.nio.file.Path pathResolve = resolve(path);
        try {
            Files.delete(pathResolve);
        } catch (NoSuchFileException unused) {
            if (z10) {
                throw new FileNotFoundException(e2.j(path, "no such file: "));
            }
        } catch (IOException unused2) {
            if (Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException(e2.j(path, "failed to delete "));
            }
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        List<Path> list = list(dir, true);
        e0.checkNotNull(list);
        return list;
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        e0.checkNotNullParameter(dir, "dir");
        return list(dir, false);
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        e0.checkNotNullParameter(path, "path");
        return metadataOrNull(resolve(path));
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        try {
            FileChannel fileChannelOpen = FileChannel.open(resolve(file), StandardOpenOption.READ);
            e0.checkNotNull(fileChannelOpen);
            return new NioFileSystemFileHandle(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(e2.j(file, "no such file: "));
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        e0.checkNotNullParameter(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List listCreateListBuilder = o0.createListBuilder();
        listCreateListBuilder.add(StandardOpenOption.READ);
        listCreateListBuilder.add(StandardOpenOption.WRITE);
        if (z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE_NEW);
        } else if (!z11) {
            listCreateListBuilder.add(StandardOpenOption.CREATE);
        }
        List listBuild = o0.build(listCreateListBuilder);
        try {
            java.nio.file.Path pathResolve = resolve(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathResolve, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            e0.checkNotNull(fileChannelOpen);
            return new NioFileSystemFileHandle(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(e2.j(file, "no such file: "));
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        List listCreateListBuilder = o0.createListBuilder();
        if (z10) {
            listCreateListBuilder.add(StandardOpenOption.CREATE_NEW);
        }
        List listBuild = o0.build(listCreateListBuilder);
        try {
            java.nio.file.Path pathResolve = resolve(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listBuild.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathResolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            e0.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(this, *options)");
            return Okio.sink(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(e2.j(file, "no such file: "));
        }
    }

    @Override // com.applovin.shadow.okio.JvmSystemFileSystem, com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(resolve(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            e0.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(this, *options)");
            return Okio.source(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(e2.j(file, "no such file: "));
        }
    }

    @Override // com.applovin.shadow.okio.NioSystemFileSystem, com.applovin.shadow.okio.JvmSystemFileSystem
    public String toString() {
        String simpleName = c1.getOrCreateKotlinClass(this.nioFileSystem.getClass()).getSimpleName();
        e0.checkNotNull(simpleName);
        return simpleName;
    }

    private final List<Path> list(Path path, boolean z10) throws IOException {
        java.nio.file.Path pathResolve = resolve(path);
        try {
            List listListDirectoryEntries$default = d0.listDirectoryEntries$default(pathResolve, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listListDirectoryEntries$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Path.Companion.get$default(Path.Companion, a.d(it.next()), false, 1, (Object) null));
            }
            u0.sort(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z10) {
                return null;
            }
            if (Files.exists(pathResolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException(e2.j(path, "failed to list "));
            }
            throw new FileNotFoundException(e2.j(path, "no such file: "));
        }
    }
}
