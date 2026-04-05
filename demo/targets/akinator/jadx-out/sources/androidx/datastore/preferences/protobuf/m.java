package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements o {
    @Override // androidx.datastore.preferences.protobuf.o
    public byte[] copyFrom(byte[] bArr, int i10, int i11) {
        return Arrays.copyOfRange(bArr, i10, i11 + i10);
    }
}
