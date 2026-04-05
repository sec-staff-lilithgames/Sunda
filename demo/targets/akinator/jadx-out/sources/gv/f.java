package gv;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends ByteArrayOutputStream {
    public f(int i10) {
        super(i10);
    }

    public final byte[] getBuffer() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        e0.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
