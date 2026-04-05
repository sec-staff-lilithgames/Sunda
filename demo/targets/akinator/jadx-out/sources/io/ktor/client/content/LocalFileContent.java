package io.ktor.client.content;

import io.ktor.http.ContentType;
import io.ktor.http.FileContentTypeJvmKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.utils.io.ByteReadChannel;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import qv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class LocalFileContent extends OutgoingContent.ReadChannelContent {
    private final ContentType contentType;
    private final File file;

    public /* synthetic */ LocalFileContent(File file, ContentType contentType, int i10, u uVar) {
        this(file, (i10 & 2) != 0 ? FileContentTypeJvmKt.defaultForFile(ContentType.Companion, file) : contentType);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return Long.valueOf(this.file.length());
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    public final File getFile() {
        return this.file;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public ByteReadChannel readFrom() {
        return FileChannelsKt.readChannel$default(this.file, 0L, 0L, null, 7, null);
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public ByteReadChannel readFrom(p range) {
        e0.checkNotNullParameter(range, "range");
        return FileChannelsKt.readChannel$default(this.file, range.getStart().longValue(), range.getEndInclusive().longValue(), null, 4, null);
    }

    public LocalFileContent(File file, ContentType contentType) {
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(contentType, "contentType");
        this.file = file;
        this.contentType = contentType;
    }
}
