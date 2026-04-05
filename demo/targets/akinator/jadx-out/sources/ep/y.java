package ep;

import io.bidmachine.media3.common.util.m0;
import j1.o2;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class y {
    public static byte[] buildPsshAtom(UUID uuid, byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return parsePsshAtom(bArr) != null;
    }

    public static x parsePsshAtom(byte[] bArr) {
        UUID[] uuidArr;
        m0 m0Var = new m0(bArr);
        if (m0Var.limit() < 32) {
            return null;
        }
        m0Var.setPosition(0);
        int iBytesLeft = m0Var.bytesLeft();
        int i10 = m0Var.readInt();
        if (i10 != iBytesLeft) {
            io.bidmachine.media3.common.util.b0.w("PsshAtomUtil", "Advertised atom size (" + i10 + ") does not match buffer size: " + iBytesLeft);
            return null;
        }
        int i11 = m0Var.readInt();
        if (i11 != 1886614376) {
            e3.g.t(i11, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int fullBoxVersion = n.parseFullBoxVersion(m0Var.readInt());
        if (fullBoxVersion > 1) {
            e3.g.t(fullBoxVersion, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(m0Var.readLong(), m0Var.readLong());
        if (fullBoxVersion == 1) {
            int unsignedIntToInt = m0Var.readUnsignedIntToInt();
            uuidArr = new UUID[unsignedIntToInt];
            for (int i12 = 0; i12 < unsignedIntToInt; i12++) {
                uuidArr[i12] = new UUID(m0Var.readLong(), m0Var.readLong());
            }
        } else {
            uuidArr = null;
        }
        int unsignedIntToInt2 = m0Var.readUnsignedIntToInt();
        int iBytesLeft2 = m0Var.bytesLeft();
        if (unsignedIntToInt2 == iBytesLeft2) {
            byte[] bArr2 = new byte[unsignedIntToInt2];
            m0Var.readBytes(bArr2, 0, unsignedIntToInt2);
            return new x(uuid, fullBoxVersion, bArr2, uuidArr);
        }
        io.bidmachine.media3.common.util.b0.w("PsshAtomUtil", "Atom data size (" + unsignedIntToInt2 + ") does not match the bytes left: " + iBytesLeft2);
        return null;
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        x psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        UUID uuid2 = psshAtom.f54977a;
        if (uuid.equals(uuid2)) {
            return psshAtom.f54979c;
        }
        io.bidmachine.media3.common.util.b0.w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static UUID parseUuid(byte[] bArr) {
        x psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return null;
        }
        return psshAtom.f54977a;
    }

    public static int parseVersion(byte[] bArr) {
        x psshAtom = parsePsshAtom(bArr);
        if (psshAtom == null) {
            return -1;
        }
        return psshAtom.f54978b;
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
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }
}
