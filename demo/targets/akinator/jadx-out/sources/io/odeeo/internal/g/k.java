package io.odeeo.internal.g;

import io.odeeo.internal.b.g0;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k {
    @Pure
    public static void checkContainerInput(boolean z10, String str) throws g0 {
        if (!z10) {
            throw g0.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(i iVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return iVar.peekFully(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int peekToLength(i iVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iPeek = iVar.peek(bArr, i10 + i12, i11 - i12);
            if (iPeek == -1) {
                break;
            }
            i12 += iPeek;
        }
        return i12;
    }

    public static boolean readFullyQuietly(i iVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            iVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(i iVar, int i10) throws IOException {
        try {
            iVar.skipFully(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
