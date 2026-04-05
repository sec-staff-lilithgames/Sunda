package ee;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import ee.a0;
import java.io.IOException;
import java.util.Arrays;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {
    public static boolean checkAndPeekStreamMarker(q qVar) throws IOException {
        v0 v0Var = new v0(4);
        qVar.peekFully(v0Var.getData(), 0, 4);
        return v0Var.readUnsignedInt() == 1716281667;
    }

    public static int getFrameStartMarker(q qVar) throws IOException {
        qVar.resetPeekPosition();
        v0 v0Var = new v0(2);
        qVar.peekFully(v0Var.getData(), 0, 2);
        int unsignedShort = v0Var.readUnsignedShort();
        if ((unsignedShort >> 2) == 16382) {
            qVar.resetPeekPosition();
            return unsignedShort;
        }
        qVar.resetPeekPosition();
        throw h2.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    public static Metadata peekId3Metadata(q qVar, boolean z10) throws IOException {
        Metadata metadataPeekId3Data = new d0().peekId3Data(qVar, z10 ? null : we.h.f90541b);
        if (metadataPeekId3Data == null || metadataPeekId3Data.length() == 0) {
            return null;
        }
        return metadataPeekId3Data;
    }

    public static Metadata readId3Metadata(q qVar, boolean z10) throws IOException {
        qVar.resetPeekPosition();
        long peekPosition = qVar.getPeekPosition();
        Metadata metadataPeekId3Metadata = peekId3Metadata(qVar, z10);
        qVar.skipFully((int) (qVar.getPeekPosition() - peekPosition));
        return metadataPeekId3Metadata;
    }

    public static boolean readMetadataBlock(q qVar, x xVar) throws IOException {
        qVar.resetPeekPosition();
        u0 u0Var = new u0(new byte[4]);
        qVar.peekFully(u0Var.f28575a, 0, 4);
        boolean bit = u0Var.readBit();
        int bits = u0Var.readBits(7);
        int bits2 = u0Var.readBits(24) + 4;
        if (bits == 0) {
            byte[] bArr = new byte[38];
            qVar.readFully(bArr, 0, 38);
            xVar.f54264a = new a0(bArr, 4);
            return bit;
        }
        a0 a0Var = xVar.f54264a;
        if (a0Var == null) {
            throw new IllegalArgumentException();
        }
        if (bits == 3) {
            v0 v0Var = new v0(bits2);
            qVar.readFully(v0Var.getData(), 0, bits2);
            xVar.f54264a = a0Var.copyWithSeekTable(readSeekTableMetadataBlock(v0Var));
            return bit;
        }
        if (bits == 4) {
            v0 v0Var2 = new v0(bits2);
            qVar.readFully(v0Var2.getData(), 0, bits2);
            v0Var2.skipBytes(4);
            xVar.f54264a = a0Var.copyWithVorbisComments(Arrays.asList(r0.readVorbisCommentHeader(v0Var2, false, false).f54254a));
            return bit;
        }
        if (bits != 6) {
            qVar.skipFully(bits2);
            return bit;
        }
        v0 v0Var3 = new v0(bits2);
        qVar.readFully(v0Var3.getData(), 0, bits2);
        v0Var3.skipBytes(4);
        xVar.f54264a = a0Var.copyWithPictureFrames(b5.of(PictureFrame.fromPictureBlock(v0Var3)));
        return bit;
    }

    public static a0.a readSeekTableMetadataBlock(v0 v0Var) {
        v0Var.skipBytes(1);
        int unsignedInt24 = v0Var.readUnsignedInt24();
        long position = v0Var.getPosition() + unsignedInt24;
        int i10 = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long j10 = v0Var.readLong();
            if (j10 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = j10;
            jArrCopyOf2[i11] = v0Var.readLong();
            v0Var.skipBytes(2);
            i11++;
        }
        v0Var.skipBytes((int) (position - v0Var.getPosition()));
        return new a0.a(jArrCopyOf, jArrCopyOf2);
    }

    public static void readStreamMarker(q qVar) throws IOException {
        v0 v0Var = new v0(4);
        qVar.readFully(v0Var.getData(), 0, 4);
        if (v0Var.readUnsignedInt() != 1716281667) {
            throw h2.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }
}
