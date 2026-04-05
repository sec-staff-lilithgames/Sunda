package pw;

import com.apm.insight.b.El.rJqlArycrfkilN;
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
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class i0 {
    public static final z0 appendingSink(File file) throws FileNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
        return h0.sink(new FileOutputStream(file, true));
    }

    public static final r asResourceFileSystem(ClassLoader classLoader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(classLoader, "<this>");
        return new qw.o(classLoader, true, null, 4, null);
    }

    public static final m cipherSink(z0 z0Var, Cipher cipher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(cipher, "cipher");
        return new m(h0.buffer(z0Var), cipher);
    }

    public static final n cipherSource(b1 b1Var, Cipher cipher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(cipher, "cipher");
        return new n(h0.buffer(b1Var), cipher);
    }

    public static final y hashingSink(z0 z0Var, Mac mac) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(mac, "mac");
        return new y(z0Var, mac);
    }

    public static final z hashingSource(b1 b1Var, Mac mac) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(mac, "mac");
        return new z(b1Var, mac);
    }

    public static final a1[] inMemorySocketPair(long j10) {
        r0 r0Var = new r0(j10);
        r0 r0Var2 = new r0(j10);
        return new a1[]{new qw.n(r0Var, r0Var2), new qw.n(r0Var2, r0Var)};
    }

    public static final z0 sink(File file) throws FileNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ z0 sink$default(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h0.sink(file, z10);
    }

    public static final a1 socket(Socket socket) {
        kotlin.jvm.internal.e0.checkNotNullParameter(socket, "<this>");
        return new qw.k(socket);
    }

    public static final b1 source(InputStream inputStream) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inputStream, rJqlArycrfkilN.skSwdBFWkwy);
        return new b0(inputStream, new d1());
    }

    public static final y hashingSink(z0 z0Var, MessageDigest digest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(digest, "digest");
        return new y(z0Var, digest);
    }

    public static final z hashingSource(b1 b1Var, MessageDigest digest) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(digest, "digest");
        return new z(b1Var, digest);
    }

    public static final z0 sink(OutputStream outputStream) {
        kotlin.jvm.internal.e0.checkNotNullParameter(outputStream, "<this>");
        return new m0(outputStream, new d1());
    }

    public static final b1 source(Socket socket) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(socket, "<this>");
        qw.p pVar = new qw.p(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return pVar.source(new b0(inputStream, pVar));
    }

    public static final z0 sink(Socket socket) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(socket, "<this>");
        qw.p pVar = new qw.p(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return pVar.sink(new m0(outputStream, pVar));
    }

    public static final b1 source(File file) throws FileNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
        return new b0(new FileInputStream(file), d1.f81884f);
    }

    public static final z0 sink(File file, boolean z10) throws FileNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "<this>");
        return h0.sink(new FileOutputStream(file, z10));
    }

    public static final b1 source(Path path, OpenOption... options) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
        return h0.source(inputStreamNewInputStream);
    }

    public static final z0 sink(Path path, OpenOption... options) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return h0.sink(outputStreamNewOutputStream);
    }
}
