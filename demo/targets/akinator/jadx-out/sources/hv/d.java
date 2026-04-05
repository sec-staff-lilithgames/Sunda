package hv;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends SimpleFileVisitor {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59192a;

    /* renamed from: b, reason: collision with root package name */
    public l f59193b;

    /* renamed from: c, reason: collision with root package name */
    public uu.u f59194c = new uu.u();

    public d(boolean z10) {
        this.f59192a = z10;
    }

    public final boolean getFollowLinks() {
        return this.f59192a;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory(cf.a.d(obj), basicFileAttributes);
    }

    public final List<l> readEntries(l directoryNode) throws IOException {
        e0.checkNotNullParameter(directoryNode, "directoryNode");
        this.f59193b = directoryNode;
        Files.walkFileTree(directoryNode.getPath(), j.f59208a.toVisitOptions(this.f59192a), 1, this);
        this.f59194c.removeFirst();
        uu.u uVar = this.f59194c;
        this.f59194c = new uu.u();
        return uVar;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(cf.a.d(obj), basicFileAttributes);
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        e0.checkNotNullParameter(dir, "dir");
        e0.checkNotNullParameter(attrs, "attrs");
        this.f59194c.add(new l(dir, attrs.fileKey(), this.f59193b));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory((d) dir, attrs);
        e0.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(attrs, "attrs");
        this.f59194c.add(new l(file, null, this.f59193b));
        FileVisitResult fileVisitResultVisitFile = super.visitFile((d) file, attrs);
        e0.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }
}
