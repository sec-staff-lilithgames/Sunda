package hv;

import e6.h0;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends SimpleFileVisitor {

    /* renamed from: a, reason: collision with root package name */
    public final kv.p f59204a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.p f59205b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.p f59206c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.p f59207d;

    public h(kv.p pVar, kv.p pVar2, kv.p pVar3, kv.p pVar4) {
        this.f59204a = pVar;
        this.f59205b = pVar2;
        this.f59206c = pVar3;
        this.f59207d = pVar4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return postVisitDirectory(cf.a.d(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory(cf.a.d(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(cf.a.d(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return visitFileFailed(cf.a.d(obj), iOException);
    }

    public FileVisitResult postVisitDirectory(Path dir, IOException iOException) throws IOException {
        FileVisitResult fileVisitResultE;
        e0.checkNotNullParameter(dir, "dir");
        kv.p pVar = this.f59207d;
        if (pVar != null && (fileVisitResultE = h0.e(pVar.invoke(dir, iOException))) != null) {
            return fileVisitResultE;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory((h) dir, iOException);
        e0.checkNotNullExpressionValue(fileVisitResultPostVisitDirectory, "postVisitDirectory(...)");
        return fileVisitResultPostVisitDirectory;
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultE;
        e0.checkNotNullParameter(dir, "dir");
        e0.checkNotNullParameter(attrs, "attrs");
        kv.p pVar = this.f59204a;
        if (pVar != null && (fileVisitResultE = h0.e(pVar.invoke(dir, attrs))) != null) {
            return fileVisitResultE;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory((h) dir, attrs);
        e0.checkNotNullExpressionValue(fileVisitResultPreVisitDirectory, "preVisitDirectory(...)");
        return fileVisitResultPreVisitDirectory;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultE;
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(attrs, "attrs");
        kv.p pVar = this.f59205b;
        if (pVar != null && (fileVisitResultE = h0.e(pVar.invoke(file, attrs))) != null) {
            return fileVisitResultE;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile((h) file, attrs);
        e0.checkNotNullExpressionValue(fileVisitResultVisitFile, "visitFile(...)");
        return fileVisitResultVisitFile;
    }

    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        FileVisitResult fileVisitResultE;
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(exc, "exc");
        kv.p pVar = this.f59206c;
        if (pVar != null && (fileVisitResultE = h0.e(pVar.invoke(file, exc))) != null) {
            return fileVisitResultE;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed((h) file, exc);
        e0.checkNotNullExpressionValue(fileVisitResultVisitFileFailed, "visitFileFailed(...)");
        return fileVisitResultVisitFileFailed;
    }
}
