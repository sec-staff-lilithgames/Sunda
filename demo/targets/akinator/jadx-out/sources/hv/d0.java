package hv;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.n0;
import uu.b2;
import uu.c2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d0 extends c0 {
    public static final Path createParentDirectories(Path path, FileAttribute<?>... attributes) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(attributes, "attributes");
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                e0.checkNotNullExpressionValue(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length)), "createDirectories(...)");
                return path;
            } catch (FileAlreadyExistsException e10) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e10;
                }
            }
        }
        return path;
    }

    public static final Path createTempDirectory(Path path, String str, FileAttribute<?>... attributes) throws IOException {
        e0.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            e0.checkNotNullExpressionValue(pathCreateTempDirectory, "createTempDirectory(...)");
            return pathCreateTempDirectory;
        }
        Path pathCreateTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        e0.checkNotNullExpressionValue(pathCreateTempDirectory2, "createTempDirectory(...)");
        return pathCreateTempDirectory2;
    }

    public static /* synthetic */ Path createTempDirectory$default(Path path, String str, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return createTempDirectory(path, str, fileAttributeArr);
    }

    public static final Path createTempFile(Path path, String str, String str2, FileAttribute<?>... attributes) throws IOException {
        e0.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            e0.checkNotNullExpressionValue(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        e0.checkNotNullExpressionValue(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    public static /* synthetic */ Path createTempFile$default(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return createTempFile(path, str, str2, fileAttributeArr);
    }

    public static final Void fileAttributeViewNotAvailable(Path path, Class<?> attributeViewClass) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    public static final FileVisitor<Path> fileVisitor(kv.l builderAction) {
        e0.checkNotNullParameter(builderAction, "builderAction");
        g gVar = new g();
        builderAction.invoke(gVar);
        return gVar.build();
    }

    public static final String getExtension(Path path) {
        String string;
        String strSubstringAfterLast;
        e0.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringAfterLast = n0.substringAfterLast(string, '.', "")) == null) ? "" : strSubstringAfterLast;
    }

    public static final String getInvariantSeparatorsPathString(Path path) {
        e0.checkNotNullParameter(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (e0.areEqual(separator, "/")) {
            return path.toString();
        }
        String string = path.toString();
        e0.checkNotNull(separator);
        return k0.replace$default(string, separator, "/", false, 4, (Object) null);
    }

    public static final String getName(Path path) {
        e0.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    public static final String getNameWithoutExtension(Path path) {
        String string;
        String strSubstringBeforeLast$default;
        e0.checkNotNullParameter(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringBeforeLast$default = n0.substringBeforeLast$default(string, ".", (String) null, 2, (Object) null)) == null) ? "" : strSubstringBeforeLast$default;
    }

    public static final List<Path> listDirectoryEntries(Path path, String glob) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(glob, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            e0.checkNotNull(directoryStreamNewDirectoryStream);
            List<Path> list = y0.toList(directoryStreamNewDirectoryStream);
            gv.d.closeFinally(directoryStreamNewDirectoryStream, null);
            return list;
        } finally {
        }
    }

    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return listDirectoryEntries(path, str);
    }

    public static final Path relativeTo(Path path, Path base) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(base, "base");
        try {
            return m.f59219a.tryRelativeTo(path, base);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e10);
        }
    }

    public static final Path relativeToOrNull(Path path, Path base) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(base, "base");
        try {
            return m.f59219a.tryRelativeTo(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final Path relativeToOrSelf(Path path, Path base) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(base, "base");
        Path pathRelativeToOrNull = relativeToOrNull(path, base);
        return pathRelativeToOrNull == null ? path : pathRelativeToOrNull;
    }

    public static final void visitFileTree(Path path, FileVisitor<Path> visitor, int i10, boolean z10) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(visitor, "visitor");
        Files.walkFileTree(path, z10 ? b2.setOf(FileVisitOption.FOLLOW_LINKS) : c2.emptySet(), i10, visitor);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, FileVisitor fileVisitor, int i10, boolean z10, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        visitFileTree(path, (FileVisitor<Path>) fileVisitor, i10, z10);
    }

    public static final rv.t walk(Path path, r... options) {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(options, "options");
        return new p(path, options);
    }

    public static /* synthetic */ void visitFileTree$default(Path path, int i10, boolean z10, kv.l lVar, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        visitFileTree(path, i10, z10, lVar);
    }

    public static final void visitFileTree(Path path, int i10, boolean z10, kv.l builderAction) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(builderAction, "builderAction");
        visitFileTree(path, fileVisitor(builderAction), i10, z10);
    }

    public static /* synthetic */ void getExtension$annotations(Path path) {
    }

    @tu.f
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(Path path) {
    }

    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(Path path) {
    }

    public static /* synthetic */ void getName$annotations(Path path) {
    }

    public static /* synthetic */ void getNameWithoutExtension$annotations(Path path) {
    }

    public static /* synthetic */ void getPathString$annotations(Path path) {
    }
}
