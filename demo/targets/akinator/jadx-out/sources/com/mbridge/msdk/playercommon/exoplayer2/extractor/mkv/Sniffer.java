package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int i10 = 0;
        extractorInput.peekFully(this.scratch.data, 0, 1);
        int i11 = this.scratch.data[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        extractorInput.peekFully(this.scratch.data, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.scratch.data[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
        }
        this.peekLength = i13 + 1 + this.peekLength;
        return i14;
    }

    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        long length = extractorInput.getLength();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = length;
        }
        int i10 = (int) j10;
        extractorInput.peekFully(this.scratch.data, 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i11 = this.peekLength + 1;
            this.peekLength = i11;
            if (i11 == i10) {
                return false;
            }
            extractorInput.peekFully(this.scratch.data, 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | (this.scratch.data[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        long uint = readUint(extractorInput);
        long j11 = this.peekLength;
        if (uint != Long.MIN_VALUE && (length == -1 || j11 + uint < length)) {
            while (true) {
                long j12 = this.peekLength;
                long j13 = j11 + uint;
                if (j12 < j13) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long uint2 = readUint(extractorInput);
                    if (uint2 < 0 || uint2 > 2147483647L) {
                        break;
                    }
                    if (uint2 != 0) {
                        int i12 = (int) uint2;
                        extractorInput.advancePeekPosition(i12);
                        this.peekLength += i12;
                    }
                } else if (j12 == j13) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
