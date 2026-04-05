package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReaderJsonLexerKt {
    public static final int BATCH_SIZE = 16384;
    private static final int DEFAULT_THRESHOLD = 128;

    public static final ReaderJsonLexer ReaderJsonLexer(Json json, InternalJsonReader reader, char[] buffer) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(reader, "reader");
        e0.checkNotNullParameter(buffer, "buffer");
        return !json.getConfiguration().getAllowComments() ? new ReaderJsonLexer(reader, buffer) : new ReaderJsonLexerWithComments(reader, buffer);
    }

    public static /* synthetic */ ReaderJsonLexer ReaderJsonLexer$default(Json json, InternalJsonReader internalJsonReader, char[] cArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cArr = CharArrayPoolBatchSize.INSTANCE.take();
        }
        return ReaderJsonLexer(json, internalJsonReader, cArr);
    }
}
