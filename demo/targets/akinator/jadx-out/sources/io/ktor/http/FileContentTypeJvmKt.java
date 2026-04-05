package io.ktor.http;

import gv.s;
import io.ktor.http.ContentType;
import io.ktor.util.NioPathKt;
import java.io.File;
import java.nio.file.Path;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FileContentTypeJvmKt {
    public static final ContentType defaultForFile(ContentType.Companion companion, File file) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(file, "file");
        return FileContentTypeKt.selectDefault(FileContentTypeKt.fromFileExtension(ContentType.Companion, s.getExtension(file)));
    }

    public static final ContentType defaultForFile(ContentType.Companion companion, Path file) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(file, "file");
        return FileContentTypeKt.selectDefault(FileContentTypeKt.fromFileExtension(ContentType.Companion, NioPathKt.getExtension(file)));
    }
}
