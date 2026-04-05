package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\r\u000eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "", "mTrackName", "", "mStartTime", "", "mEndTime", "mStickerTrackType", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;", "mSegmentMetadata", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;", "<init>", "(Ljava/lang/String;JJLcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$SegmentMetadata;)V", "StickerTrackType", "SegmentMetadata", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.he, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class ImfDataTrack {
    public static byte[] A05;
    public final long A00;
    public final long A01;
    public final C2195hc A02;
    public final C2196hd A03;
    public final String A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{72, 118, 64, 66, 72, 64, 75, 81, 104, 64, 81, 68, 65, 68, 81, 68, 92, 98, 69, 88, 82, 90, 84, 67, 101, 67, 80, 82, 90, 101, 72, 65, 84, 29, 36, 2, 17, 19, 27, 62, 17, 29, 21};
    }

    public ImfDataTrack(String str, long j10, long j11, C2196hd c2196hd, C2195hc c2195hc) {
        C2628p6.A09(str, A00(33, 10, 89));
        C2628p6.A09(c2196hd, A00(16, 17, 24));
        C2628p6.A09(c2195hc, A00(0, 16, 12));
        this.A04 = str;
        this.A01 = j10;
        this.A00 = j11;
        this.A03 = c2196hd;
        this.A02 = c2195hc;
    }
}
