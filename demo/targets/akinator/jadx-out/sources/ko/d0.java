package ko;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d0 {
    @Pure
    public static void checkContainerInput(boolean z10, String str) throws gn.z0 {
        if (!z10) {
            throw gn.z0.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(a0 a0Var, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return a0Var.peekFully(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int peekToLength(a0 a0Var, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iPeek = a0Var.peek(bArr, i10 + i12, i11 - i12);
            if (iPeek == -1) {
                break;
            }
            i12 += iPeek;
        }
        return i12;
    }

    public static boolean readFullyQuietly(a0 a0Var, byte[] bArr, int i10, int i11) throws IOException {
        try {
            a0Var.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(a0 a0Var, int i10) throws IOException {
        try {
            a0Var.skipFully(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
