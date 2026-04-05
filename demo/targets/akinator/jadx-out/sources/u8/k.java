package u8;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface k {
    void close(Object obj) throws IOException;

    Object decode(String str) throws IllegalArgumentException;

    Class<Object> getDataClass();
}
