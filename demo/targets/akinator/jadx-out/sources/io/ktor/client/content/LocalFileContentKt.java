package io.ktor.client.content;

import io.ktor.http.ContentType;
import io.ktor.http.FileContentTypeKt;
import io.ktor.util.PathKt;
import java.io.File;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class LocalFileContentKt {
    public static final LocalFileContent LocalFileContent(File baseDir, String relativePath, ContentType contentType) {
        e0.checkNotNullParameter(baseDir, "baseDir");
        e0.checkNotNullParameter(relativePath, "relativePath");
        e0.checkNotNullParameter(contentType, "contentType");
        return new LocalFileContent(PathKt.combineSafe(baseDir, relativePath), contentType);
    }

    public static /* synthetic */ LocalFileContent LocalFileContent$default(File file, String str, ContentType contentType, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            contentType = FileContentTypeKt.defaultForFilePath(ContentType.Companion, str);
        }
        return LocalFileContent(file, str, contentType);
    }
}
