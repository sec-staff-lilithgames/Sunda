package u8;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements e {
    @Override // u8.e
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // u8.e
    public InputStream convert(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }
}
