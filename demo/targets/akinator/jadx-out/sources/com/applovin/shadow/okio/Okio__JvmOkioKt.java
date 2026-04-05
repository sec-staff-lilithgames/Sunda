package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("com.applovin.shadow.okio.Okio");

    public static final Sink appendingSink(File file) throws FileNotFoundException {
        e0.checkNotNullParameter(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        e0.checkNotNullParameter(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        e0.checkNotNullParameter(sink, "<this>");
        e0.checkNotNullParameter(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        e0.checkNotNullParameter(source, "<this>");
        e0.checkNotNullParameter(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        e0.checkNotNullParameter(sink, "<this>");
        e0.checkNotNullParameter(mac, "mac");
        return new HashingSink(sink, mac);
    }

    public static final HashingSource hashingSource(Source source, Mac mac) {
        e0.checkNotNullParameter(source, "<this>");
        e0.checkNotNullParameter(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        e0.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? n0.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final FileSystem openZip(FileSystem fileSystem, Path zipPath) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }

    public static final Sink sink(File file) throws FileNotFoundException {
        e0.checkNotNullParameter(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Okio.sink(file, z10);
    }

    public static final Source source(InputStream inputStream) {
        e0.checkNotNullParameter(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest digest) {
        e0.checkNotNullParameter(sink, "<this>");
        e0.checkNotNullParameter(digest, "digest");
        return new HashingSink(sink, digest);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest digest) {
        e0.checkNotNullParameter(source, "<this>");
        e0.checkNotNullParameter(digest, "digest");
        return new HashingSource(source, digest);
    }

    public static final Sink sink(OutputStream outputStream) {
        e0.checkNotNullParameter(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source source(Socket socket) throws IOException {
        e0.checkNotNullParameter(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        e0.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Sink sink(Socket socket) throws IOException {
        e0.checkNotNullParameter(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        e0.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final Source source(File file) throws FileNotFoundException {
        e0.checkNotNullParameter(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Sink sink(File file, boolean z10) throws FileNotFoundException {
        e0.checkNotNullParameter(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z10));
    }

    public static final Source source(java.nio.file.Path path, OpenOption... options) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        e0.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return Okio.source(inputStreamNewInputStream);
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... options) throws IOException {
        e0.checkNotNullParameter(path, "<this>");
        e0.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        e0.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return Okio.sink(outputStreamNewOutputStream);
    }
}
