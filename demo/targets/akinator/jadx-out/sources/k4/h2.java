package k4;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface h2 {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, zu.d<Object> dVar);

    Object writeTo(Object obj, OutputStream outputStream, zu.d<? super tu.x0> dVar);
}
