package io.odeeo.internal.n;

import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import j1.o2;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f64850a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64851b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f64852c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f64850a = uuid;
            this.f64851b = i10;
            this.f64852c = bArr;
        }
    }

    public static a a(byte[] bArr) {
        x xVar = new x(bArr);
        if (xVar.limit() < 32) {
            return null;
        }
        xVar.setPosition(0);
        if (xVar.readInt() != xVar.bytesLeft() + 4 || xVar.readInt() != 1886614376) {
            return null;
        }
        int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
        if (fullAtomVersion > 1) {
            e3.g.z(fullAtomVersion, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(xVar.readLong(), xVar.readLong());
        if (fullAtomVersion == 1) {
            xVar.skipBytes(xVar.readUnsignedIntToInt() * 16);
        }
        int unsignedIntToInt = xVar.readUnsignedIntToInt();
        if (unsignedIntToInt != xVar.bytesLeft()) {
            return null;
        }
        byte[] bArr2 = new byte[unsignedIntToInt];
        xVar.readBytes(bArr2, 0, unsignedIntToInt);
        return new a(uuid, fullAtomVersion, bArr2);
    }

    public static byte[] buildPsshAtom(UUID uuid, byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }

    public static boolean isPsshAtom(byte[] bArr) {
        return a(bArr) != null;
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return null;
        }
        if (uuid.equals(aVarA.f64850a)) {
            return aVarA.f64852c;
        }
        p.w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarA.f64850a + ".");
        return null;
    }

    public static UUID parseUuid(byte[] bArr) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return null;
        }
        return aVarA.f64850a;
    }

    public static int parseVersion(byte[] bArr) {
        a aVarA = a(bArr);
        if (aVarA == null) {
            return -1;
        }
        return aVarA.f64851b;
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
