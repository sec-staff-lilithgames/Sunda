package com.applovin.shadow.okio;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import rv.t;
import uu.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.shadow.okio.ForwardingFileSystem$listRecursively$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final Path invoke(Path it) {
            e0.checkNotNullParameter(it, "it");
            return ForwardingFileSystem.this.onPathResult(it, "listRecursively");
        }
    }

    public ForwardingFileSystem(FileSystem delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", C3191e4.h.f36473b), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", "target"));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        e0.checkNotNullParameter(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        u0.sort(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        e0.checkNotNullParameter(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        u0.sort(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public t listRecursively(Path dir, boolean z10) {
        e0.checkNotNullParameter(dir, "dir");
        return rv.f0.map(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z10), new AnonymousClass1());
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String functionName, String parameterName) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(functionName, "functionName");
        e0.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String functionName) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", C3191e4.h.f36473b));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", C3191e4.h.f36473b), z10, z11);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", C3191e4.h.f36473b), z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws IOException {
        e0.checkNotNullParameter(file, "file");
        return this.delegate.source(onPathParameter(file, "source", C3191e4.h.f36473b));
    }

    public String toString() {
        return c1.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.delegate + ')';
    }
}
