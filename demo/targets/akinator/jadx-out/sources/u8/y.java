package u8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y implements x {
    @Override // u8.x
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // u8.x
    public void close(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // u8.x
    public InputStream open(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }
}
