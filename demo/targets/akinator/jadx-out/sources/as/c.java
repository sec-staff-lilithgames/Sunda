package as;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface c extends Closeable {
    boolean nextFrame(b bVar) throws IOException;

    void readConnectionPreface() throws IOException;
}
