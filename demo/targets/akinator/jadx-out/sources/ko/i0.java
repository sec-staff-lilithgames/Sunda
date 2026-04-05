package ko;

import java.io.IOException;
import java.util.Arrays;
import ko.k0;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i0 {
    public static boolean checkAndPeekStreamMarker(a0 a0Var) throws IOException {
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(4);
        a0Var.peekFully(m0Var.getData(), 0, 4);
        return m0Var.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(a0 a0Var) throws IOException {
        a0Var.resetPeekPosition();
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(2);
        a0Var.peekFully(m0Var.getData(), 0, 2);
        int unsignedShort = m0Var.readUnsignedShort();
        if ((unsignedShort >> 2) == 16382) {
            a0Var.resetPeekPosition();
            return unsignedShort;
        }
        a0Var.resetPeekPosition();
        throw gn.z0.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    public static gn.u0 peekId3Metadata(a0 a0Var, boolean z10) throws IOException {
        gn.u0 u0VarPeekId3Data = new p0().peekId3Data(a0Var, z10 ? null : yo.h.f94731b);
        if (u0VarPeekId3Data == null || u0VarPeekId3Data.length() == 0) {
            return null;
        }
        return u0VarPeekId3Data;
    }

    public static gn.u0 readId3Metadata(a0 a0Var, boolean z10) throws IOException {
        a0Var.resetPeekPosition();
        long peekPosition = a0Var.getPeekPosition();
        gn.u0 u0VarPeekId3Metadata = peekId3Metadata(a0Var, z10);
        a0Var.skipFully((int) (a0Var.getPeekPosition() - peekPosition));
        return u0VarPeekId3Metadata;
    }

    public static boolean readMetadataBlock(a0 a0Var, h0 h0Var) throws IOException {
        a0Var.resetPeekPosition();
        io.bidmachine.media3.common.util.l0 l0Var = new io.bidmachine.media3.common.util.l0(new byte[4]);
        a0Var.peekFully(l0Var.f60741a, 0, 4);
        boolean bit = l0Var.readBit();
        int bits = l0Var.readBits(7);
        int bits2 = l0Var.readBits(24) + 4;
        if (bits == 0) {
            byte[] bArr = new byte[38];
            a0Var.readFully(bArr, 0, 38);
            h0Var.f71662a = new k0(bArr, 4);
            return bit;
        }
        k0 k0Var = h0Var.f71662a;
        if (k0Var == null) {
            throw new IllegalArgumentException();
        }
        if (bits == 3) {
            io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(bits2);
            a0Var.readFully(m0Var.getData(), 0, bits2);
            h0Var.f71662a = k0Var.copyWithSeekTable(readSeekTableMetadataBlock(m0Var));
            return bit;
        }
        if (bits == 4) {
            io.bidmachine.media3.common.util.m0 m0Var2 = new io.bidmachine.media3.common.util.m0(bits2);
            a0Var.readFully(m0Var2.getData(), 0, bits2);
            m0Var2.skipBytes(4);
            h0Var.f71662a = k0Var.copyWithVorbisComments(Arrays.asList(k1.readVorbisCommentHeader(m0Var2, false, false).f71663a));
            return bit;
        }
        if (bits != 6) {
            a0Var.skipFully(bits2);
            return bit;
        }
        io.bidmachine.media3.common.util.m0 m0Var3 = new io.bidmachine.media3.common.util.m0(bits2);
        a0Var.readFully(m0Var3.getData(), 0, bits2);
        m0Var3.skipBytes(4);
        h0Var.f71662a = k0Var.copyWithPictureFrames(b5.of(wo.a.fromPictureBlock(m0Var3)));
        return bit;
    }

    public static k0.a readSeekTableMetadataBlock(io.bidmachine.media3.common.util.m0 m0Var) {
        m0Var.skipBytes(1);
        int unsignedInt24 = m0Var.readUnsignedInt24();
        long position = m0Var.getPosition() + unsignedInt24;
        int i10 = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long j10 = m0Var.readLong();
            if (j10 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = j10;
            jArrCopyOf2[i11] = m0Var.readLong();
            m0Var.skipBytes(2);
            i11++;
        }
        m0Var.skipBytes((int) (position - m0Var.getPosition()));
        return new k0.a(jArrCopyOf, jArrCopyOf2);
    }

    public static void readStreamMarker(a0 a0Var) throws IOException {
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(4);
        a0Var.readFully(m0Var.getData(), 0, 4);
        if (m0Var.readUnsignedInt() != 1716281667) {
            throw gn.z0.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }
}
