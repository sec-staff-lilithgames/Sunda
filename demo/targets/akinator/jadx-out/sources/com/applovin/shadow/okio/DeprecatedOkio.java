package com.applovin.shadow.okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import qm.zMPW.GalEuEfxjome;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes2.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @f
    public final Sink appendingSink(File file) {
        e0.checkNotNullParameter(file, "file");
        return Okio.appendingSink(file);
    }

    @f
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @f
    public final BufferedSink buffer(Sink sink) {
        e0.checkNotNullParameter(sink, "sink");
        return Okio.buffer(sink);
    }

    @f
    public final Sink sink(File file) {
        e0.checkNotNullParameter(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @f
    public final Source source(File file) {
        e0.checkNotNullParameter(file, "file");
        return Okio.source(file);
    }

    @f
    public final BufferedSource buffer(Source source) {
        e0.checkNotNullParameter(source, "source");
        return Okio.buffer(source);
    }

    @f
    public final Sink sink(OutputStream outputStream) {
        e0.checkNotNullParameter(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @f
    public final Source source(InputStream inputStream) {
        e0.checkNotNullParameter(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @f
    public final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(openOptionArr, GalEuEfxjome.jJsYdzUCdOrVITf);
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @f
    public final Source source(java.nio.file.Path path, OpenOption... options) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @f
    public final Sink sink(Socket socket) {
        e0.checkNotNullParameter(socket, "socket");
        return Okio.sink(socket);
    }

    @f
    public final Source source(Socket socket) {
        e0.checkNotNullParameter(socket, "socket");
        return Okio.source(socket);
    }
}
