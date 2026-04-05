package hv;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f59219a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final Path f59220b = Paths.get("", new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final Path f59221c = Paths.get("..", new String[0]);

    public final Path tryRelativeTo(Path path, Path base) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(base, "base");
        Path pathNormalize = base.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i10 = 0; i10 < iMin; i10++) {
            Path name = pathNormalize.getName(i10);
            Path path2 = f59221c;
            if (!e0.areEqual(name, path2)) {
                break;
            }
            if (!e0.areEqual(pathNormalize2.getName(i10), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (e0.areEqual(pathNormalize2, pathNormalize) || !e0.areEqual(pathNormalize, f59220b)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            e0.checkNotNullExpressionValue(separator, "getSeparator(...)");
            pathNormalize2 = k0.endsWith$default(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(p0.dropLast(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        e0.checkNotNull(pathNormalize2);
        return pathNormalize2;
    }
}
