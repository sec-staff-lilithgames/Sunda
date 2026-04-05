package io.odeeo.internal.g;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public p f64145a;

        public a(p pVar) {
            this.f64145a = pVar;
        }
    }

    public static p a(i iVar) throws IOException {
        byte[] bArr = new byte[38];
        iVar.readFully(bArr, 0, 38);
        return new p(bArr, 4);
    }

    public static p.a b(i iVar, int i10) throws IOException {
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(i10);
        iVar.readFully(xVar.getData(), 0, i10);
        return readSeekTableMetadataBlock(xVar);
    }

    public static List<String> c(i iVar, int i10) throws IOException {
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(i10);
        iVar.readFully(xVar.getData(), 0, i10);
        xVar.skipBytes(4);
        return Arrays.asList(a0.readVorbisCommentHeader(xVar, false, false).f64089b);
    }

    public static boolean checkAndPeekStreamMarker(i iVar) throws IOException {
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(4);
        iVar.peekFully(xVar.getData(), 0, 4);
        return xVar.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(i iVar) throws IOException {
        iVar.resetPeekPosition();
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(2);
        iVar.peekFully(xVar.getData(), 0, 2);
        int unsignedShort = xVar.readUnsignedShort();
        if ((unsignedShort >> 2) == 16382) {
            iVar.resetPeekPosition();
            return unsignedShort;
        }
        iVar.resetPeekPosition();
        throw g0.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    public static io.odeeo.internal.s.a peekId3Metadata(i iVar, boolean z10) throws IOException {
        io.odeeo.internal.s.a aVarPeekId3Data = new s().peekId3Data(iVar, z10 ? null : io.odeeo.internal.x.g.f67506b);
        if (aVarPeekId3Data == null || aVarPeekId3Data.length() == 0) {
            return null;
        }
        return aVarPeekId3Data;
    }

    public static io.odeeo.internal.s.a readId3Metadata(i iVar, boolean z10) throws IOException {
        iVar.resetPeekPosition();
        long peekPosition = iVar.getPeekPosition();
        io.odeeo.internal.s.a aVarPeekId3Metadata = peekId3Metadata(iVar, z10);
        iVar.skipFully((int) (iVar.getPeekPosition() - peekPosition));
        return aVarPeekId3Metadata;
    }

    public static boolean readMetadataBlock(i iVar, a aVar) throws IOException {
        iVar.resetPeekPosition();
        io.odeeo.internal.q0.w wVar = new io.odeeo.internal.q0.w(new byte[4]);
        iVar.peekFully(wVar.f65964a, 0, 4);
        boolean bit = wVar.readBit();
        int bits = wVar.readBits(7);
        int bits2 = wVar.readBits(24) + 4;
        if (bits == 0) {
            aVar.f64145a = a(iVar);
            return bit;
        }
        p pVar = aVar.f64145a;
        if (pVar == null) {
            throw new IllegalArgumentException();
        }
        if (bits == 3) {
            aVar.f64145a = pVar.copyWithSeekTable(b(iVar, bits2));
            return bit;
        }
        if (bits == 4) {
            aVar.f64145a = pVar.copyWithVorbisComments(c(iVar, bits2));
            return bit;
        }
        if (bits == 6) {
            aVar.f64145a = pVar.copyWithPictureFrames(Collections.singletonList(a(iVar, bits2)));
            return bit;
        }
        iVar.skipFully(bits2);
        return bit;
    }

    public static p.a readSeekTableMetadataBlock(io.odeeo.internal.q0.x xVar) {
        xVar.skipBytes(1);
        int unsignedInt24 = xVar.readUnsignedInt24();
        long position = xVar.getPosition() + unsignedInt24;
        int i10 = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long j10 = xVar.readLong();
            if (j10 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = j10;
            jArrCopyOf2[i11] = xVar.readLong();
            xVar.skipBytes(2);
            i11++;
        }
        xVar.skipBytes((int) (position - xVar.getPosition()));
        return new p.a(jArrCopyOf, jArrCopyOf2);
    }

    public static void readStreamMarker(i iVar) throws IOException {
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(4);
        iVar.readFully(xVar.getData(), 0, 4);
        if (xVar.readUnsignedInt() != 1716281667) {
            throw g0.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    public static io.odeeo.internal.v.a a(i iVar, int i10) throws IOException {
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(i10);
        iVar.readFully(xVar.getData(), 0, i10);
        xVar.skipBytes(4);
        int i11 = xVar.readInt();
        String string = xVar.readString(xVar.readInt(), io.odeeo.internal.t0.e.f66404a);
        String string2 = xVar.readString(xVar.readInt());
        int i12 = xVar.readInt();
        int i13 = xVar.readInt();
        int i14 = xVar.readInt();
        int i15 = xVar.readInt();
        int i16 = xVar.readInt();
        byte[] bArr = new byte[i16];
        xVar.readBytes(bArr, 0, i16);
        return new io.odeeo.internal.v.a(i11, string, string2, i12, i13, i14, i15, bArr);
    }
}
