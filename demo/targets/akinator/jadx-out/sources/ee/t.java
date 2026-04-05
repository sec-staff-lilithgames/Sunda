package ee;

import com.google.android.exoplayer2.h2;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t {
    @Pure
    public static void checkContainerInput(boolean z10, String str) throws h2 {
        if (!z10) {
            throw h2.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(q qVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return qVar.peekFully(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int peekToLength(q qVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iPeek = qVar.peek(bArr, i10 + i12, i11 - i12);
            if (iPeek == -1) {
                break;
            }
            i12 += iPeek;
        }
        return i12;
    }

    public static boolean readFullyQuietly(q qVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            qVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(q qVar, int i10) throws IOException {
        try {
            qVar.skipFully(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
