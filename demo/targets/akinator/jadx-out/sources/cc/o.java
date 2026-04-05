package cc;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o implements Serializable {
    public abstract OutputStream decorate(h hVar, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(h hVar, Writer writer) throws IOException;
}
