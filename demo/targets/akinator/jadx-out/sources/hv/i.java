package hv;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Path file, Path path, String str) {
        super(file.toString(), path != null ? path.toString() : null, str);
        e0.checkNotNullParameter(file, "file");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Path file) {
        this(file, null, null);
        e0.checkNotNullParameter(file, "file");
    }
}
