package re;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g implements b {
    public abstract Metadata a(e eVar, ByteBuffer byteBuffer);

    @Override // re.b
    public final Metadata decode(e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.checkNotNull(eVar.f12237e);
        com.google.android.exoplayer2.util.a.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.isDecodeOnly()) {
            return null;
        }
        return a(eVar, byteBuffer);
    }
}
