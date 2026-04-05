package pw;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public abstract class h0 {
    public static final z0 appendingSink(File file) throws FileNotFoundException {
        return i0.appendingSink(file);
    }

    public static final r asResourceFileSystem(ClassLoader classLoader) {
        return i0.asResourceFileSystem(classLoader);
    }

    public static final z0 blackhole() {
        return j0.blackhole();
    }

    public static final j buffer(z0 z0Var) {
        return j0.buffer(z0Var);
    }

    public static final m cipherSink(z0 z0Var, Cipher cipher) {
        return i0.cipherSink(z0Var, cipher);
    }

    public static final n cipherSource(b1 b1Var, Cipher cipher) {
        return i0.cipherSource(b1Var, cipher);
    }

    public static final y hashingSink(z0 z0Var, MessageDigest messageDigest) {
        return i0.hashingSink(z0Var, messageDigest);
    }

    public static final z hashingSource(b1 b1Var, MessageDigest messageDigest) {
        return i0.hashingSource(b1Var, messageDigest);
    }

    public static final a1[] inMemorySocketPair(long j10) {
        return i0.inMemorySocketPair(j10);
    }

    public static final r openZip(r rVar, n0 n0Var) throws IOException {
        return k0.openZip(rVar, n0Var);
    }

    public static final z0 sink(File file) throws FileNotFoundException {
        return i0.sink(file);
    }

    public static final a1 socket(Socket socket) {
        return i0.socket(socket);
    }

    public static final b1 source(File file) throws FileNotFoundException {
        return i0.source(file);
    }

    public static final <T extends Closeable, R> R use(T t10, kv.l lVar) {
        return (R) j0.use(t10, lVar);
    }

    public static final k buffer(b1 b1Var) {
        return j0.buffer(b1Var);
    }

    public static final y hashingSink(z0 z0Var, Mac mac) {
        return i0.hashingSink(z0Var, mac);
    }

    public static final z hashingSource(b1 b1Var, Mac mac) {
        return i0.hashingSource(b1Var, mac);
    }

    public static final z0 sink(File file, boolean z10) throws FileNotFoundException {
        return i0.sink(file, z10);
    }

    public static final b1 source(InputStream inputStream) {
        return i0.source(inputStream);
    }

    public static final z0 sink(OutputStream outputStream) {
        return i0.sink(outputStream);
    }

    public static final b1 source(Socket socket) throws IOException {
        return i0.source(socket);
    }

    public static final z0 sink(Socket socket) throws IOException {
        return i0.sink(socket);
    }

    public static final b1 source(Path path, OpenOption... openOptionArr) throws IOException {
        return i0.source(path, openOptionArr);
    }

    public static final z0 sink(Path path, OpenOption... openOptionArr) throws IOException {
        return i0.sink(path, openOptionArr);
    }
}
