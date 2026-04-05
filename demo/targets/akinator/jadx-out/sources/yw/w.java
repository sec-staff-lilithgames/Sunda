package yw;

import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f96766a = n0.getInstance();

    public static p read(InputStream inputStream) throws Exception {
        return new a0(f96766a.provide(inputStream)).readRoot();
    }

    public static h0 write(Writer writer) throws Exception {
        return write(writer, new j());
    }

    public static h0 write(Writer writer, j jVar) throws Exception {
        return new c0(writer, jVar).writeRoot();
    }

    public static p read(Reader reader) throws Exception {
        return new a0(f96766a.provide(reader)).readRoot();
    }
}
