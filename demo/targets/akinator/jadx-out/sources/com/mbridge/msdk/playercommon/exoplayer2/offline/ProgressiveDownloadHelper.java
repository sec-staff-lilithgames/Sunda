package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ProgressiveDownloadHelper extends DownloadHelper {
    private final String customCacheKey;
    private final Uri uri;

    public ProgressiveDownloadHelper(Uri uri) {
        this(uri, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public DownloadAction getDownloadAction(byte[] bArr, List<TrackKey> list) {
        return new ProgressiveDownloadAction(this.uri, false, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public DownloadAction getRemoveAction(byte[] bArr) {
        return new ProgressiveDownloadAction(this.uri, true, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public TrackGroupArray getTrackGroups(int i10) {
        return TrackGroupArray.EMPTY;
    }

    public ProgressiveDownloadHelper(Uri uri, String str) {
        this.uri = uri;
        this.customCacheKey = str;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public void prepareInternal() {
    }
}
