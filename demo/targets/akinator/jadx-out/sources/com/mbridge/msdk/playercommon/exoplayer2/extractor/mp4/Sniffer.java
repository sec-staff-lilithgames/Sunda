package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {Util.getIntegerCodeForString("isom"), Util.getIntegerCodeForString("iso2"), Util.getIntegerCodeForString("iso3"), Util.getIntegerCodeForString("iso4"), Util.getIntegerCodeForString("iso5"), Util.getIntegerCodeForString("iso6"), Util.getIntegerCodeForString("avc1"), Util.getIntegerCodeForString("hvc1"), Util.getIntegerCodeForString("hev1"), Util.getIntegerCodeForString("mp41"), Util.getIntegerCodeForString("mp42"), Util.getIntegerCodeForString("3g2a"), Util.getIntegerCodeForString("3g2b"), Util.getIntegerCodeForString("3gr6"), Util.getIntegerCodeForString("3gs6"), Util.getIntegerCodeForString("3ge6"), Util.getIntegerCodeForString("3gg6"), Util.getIntegerCodeForString("M4V "), Util.getIntegerCodeForString("M4A "), Util.getIntegerCodeForString("f4v "), Util.getIntegerCodeForString("kddi"), Util.getIntegerCodeForString("M4VP"), Util.getIntegerCodeForString("qt  "), Util.getIntegerCodeForString("MSNV")};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i10) {
        if ((i10 >>> 8) == Util.getIntegerCodeForString("3gp")) {
            return true;
        }
        for (int i11 : COMPATIBLE_BRANDS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return sniffInternal(extractorInput, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z10) throws InterruptedException, IOException {
        boolean z11;
        int i10;
        long length = extractorInput.getLength();
        long j10 = -1;
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i11 = (int) length;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z12 = false;
        int i12 = 0;
        Object[] objArr = false;
        while (i12 < i11) {
            parsableByteArray.reset(8);
            extractorInput.peekFully(parsableByteArray.data, z12 ? 1 : 0, 8);
            long unsignedInt = parsableByteArray.readUnsignedInt();
            int i13 = parsableByteArray.readInt();
            if (unsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.data, 8, 8);
                parsableByteArray.setLimit(16);
                i10 = 16;
                unsignedInt = parsableByteArray.readUnsignedLongToLong();
            } else {
                if (unsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j10) {
                        unsignedInt = 8 + (length2 - extractorInput.getPosition());
                    }
                }
                i10 = 8;
            }
            long j11 = i10;
            if (unsignedInt < j11) {
                return z12;
            }
            i12 += i10;
            if (i13 != Atom.TYPE_moov) {
                if (i13 == Atom.TYPE_moof || i13 == Atom.TYPE_mvex) {
                    z11 = true;
                    break;
                }
                long j12 = (i12 + unsignedInt) - j11;
                boolean z13 = z12 ? 1 : 0;
                if (j12 >= i11) {
                    break;
                }
                int i14 = (int) (unsignedInt - j11);
                i12 += i14;
                if (i13 == Atom.TYPE_ftyp) {
                    if (i14 < 8) {
                        return z13;
                    }
                    parsableByteArray.reset(i14);
                    extractorInput.peekFully(parsableByteArray.data, z13 ? 1 : 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            break;
                        }
                        if (i16 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (isCompatibleBrand(parsableByteArray.readInt())) {
                            objArr = true;
                            break;
                        }
                        i16++;
                    }
                    if (objArr == false) {
                        return false;
                    }
                } else if (i14 != 0) {
                    extractorInput.advancePeekPosition(i14);
                }
                j10 = -1;
                z12 = false;
            }
        }
        z11 = false;
        return objArr == true && z10 == z11;
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return sniffInternal(extractorInput, false);
    }
}
