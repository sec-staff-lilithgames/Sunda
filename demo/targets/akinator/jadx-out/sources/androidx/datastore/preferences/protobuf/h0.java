package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends IOException {
    public h0(String str) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str));
    }

    public h0(RuntimeException runtimeException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
    }

    public h0(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
