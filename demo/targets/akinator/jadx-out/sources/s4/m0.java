package s4;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface m0 {
    long getPosition();

    int readTag() throws IOException;

    long readUnsignedInt() throws IOException;

    int readUnsignedShort() throws IOException;

    void skip(int i10) throws IOException;
}
