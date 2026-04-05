package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.jvm.internal.e0;
import sv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JavaStreamSerialReader implements InternalJsonReader {
    private final CharsetReader reader;

    public JavaStreamSerialReader(InputStream stream) {
        e0.checkNotNullParameter(stream, "stream");
        this.reader = new CharsetReader(stream, g.f86134b);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public int read(char[] buffer, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "buffer");
        return this.reader.read(buffer, i10, i11);
    }

    public final void release() {
        this.reader.release();
    }
}
