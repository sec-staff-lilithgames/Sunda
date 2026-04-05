package com.applovin.shadow.okio.internal;

import b0.e2;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.ironsource.C3191e4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.k0;
import sv.n0;
import tu.o;
import tu.q;
import tu.v;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final o roots$delegate;
    private final FileSystem systemFileSystem;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !k0.endsWith(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            e0.checkNotNullParameter(path, "<this>");
            e0.checkNotNullParameter(base, "base");
            return getROOT().resolve(k0.replace$default(n0.removePrefix(path.toString(), (CharSequence) base.toString()), AbstractJsonLexerKt.STRING_ESC, '/', false, 4, (Object) null));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem, int i10, u uVar) {
        this(classLoader, z10, (i10 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<v> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<v> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        e0.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        e0.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            e0.checkNotNull(url);
            v fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        e0.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        e0.checkNotNullExpressionValue(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            e0.checkNotNull(url2);
            v jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return y0.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    private final v toFileRoot(URL url) {
        if (e0.areEqual(url.getProtocol(), C3191e4.h.f36473b)) {
            return tu.e0.to(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final v toJarRoot(URL url) {
        int iLastIndexOf$default;
        String string = url.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        if (!k0.startsWith$default(string, "jar:file:", false, 2, null) || (iLastIndexOf$default = n0.lastIndexOf$default((CharSequence) string, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iLastIndexOf$default);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return tu.e0.to(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) {
        e0.checkNotNullParameter(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z10) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z10) throws IOException {
        e0.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        e0.checkNotNullParameter(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (v vVar : getRoots()) {
            FileSystem fileSystem = (FileSystem) vVar.component1();
            Path path = (Path) vVar.component2();
            try {
                List<Path> list = fileSystem.list(path.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path));
                }
                v0.addAll(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return y0.toList(linkedHashSet);
        }
        throw new FileNotFoundException(e2.j(dir, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        e0.checkNotNullParameter(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<v> it = getRoots().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            v next = it.next();
            FileSystem fileSystem = (FileSystem) next.component1();
            Path path = (Path) next.component2();
            List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                v0.addAll(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return y0.toList(linkedHashSet);
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        e0.checkNotNullParameter(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (v vVar : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) vVar.component1()).metadataOrNull(((Path) vVar.component2()).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        e0.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(e2.j(file, "file not found: "));
        }
        String relativePath = toRelativePath(file);
        for (v vVar : getRoots()) {
            try {
                return ((FileSystem) vVar.component1()).openReadOnly(((Path) vVar.component2()).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(e2.j(file, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z10, boolean z11) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws FileNotFoundException {
        Source source;
        e0.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(e2.j(file, "file not found: "));
        }
        Path path = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resourceAsStream == null || (source = Okio.source(resourceAsStream)) == null) {
            throw new FileNotFoundException(e2.j(file, "file not found: "));
        }
        return source;
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem systemFileSystem) {
        e0.checkNotNullParameter(classLoader, "classLoader");
        e0.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots$delegate = q.lazy(new ResourceFileSystem$roots$2(this));
        if (z10) {
            getRoots().size();
        }
    }
}
