package u8;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements e {
    @Override // u8.e
    public Class<ByteBuffer> getDataClass() {
        return ByteBuffer.class;
    }

    @Override // u8.e
    public ByteBuffer convert(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }
}
