package me;

import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.v0;
import j1.o2;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s {
    public static r a(byte[] bArr) {
        v0 v0Var = new v0(bArr);
        if (v0Var.limit() < 32) {
            return null;
        }
        v0Var.setPosition(0);
        if (v0Var.readInt() != v0Var.bytesLeft() + 4 || v0Var.readInt() != 1886614376) {
            return null;
        }
        int fullAtomVersion = a.parseFullAtomVersion(v0Var.readInt());
        if (fullAtomVersion > 1) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(fullAtomVersion, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(v0Var.readLong(), v0Var.readLong());
        if (fullAtomVersion == 1) {
            v0Var.skipBytes(v0Var.readUnsignedIntToInt() * 16);
        }
        int unsignedIntToInt = v0Var.readUnsignedIntToInt();
        if (unsignedIntToInt != v0Var.bytesLeft()) {
            return null;
        }
        byte[] bArr2 = new byte[unsignedIntToInt];
        v0Var.readBytes(bArr2, 0, unsignedIntToInt);
        return new r(uuid, fullAtomVersion, bArr2);
    }

    public static byte[] buildPsshAtom(UUID uuid, byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return a(bArr) != null;
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        r rVarA = a(bArr);
        if (rVarA == null) {
            return null;
        }
        UUID uuid2 = rVarA.f74463a;
        if (uuid.equals(uuid2)) {
            return rVarA.f74465c;
        }
        f0.w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static UUID parseUuid(byte[] bArr) {
        r rVarA = a(bArr);
        if (rVarA == null) {
            return null;
        }
        return rVarA.f74463a;
    }

    public static int parseVersion(byte[] bArr) {
        r rVarA = a(bArr);
        if (rVarA == null) {
            return -1;
        }
        return rVarA.f74464b;
    }

    public static byte[] buildPsshAtom(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = o2.B(uuidArr.length, 16, 4, length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }
}
