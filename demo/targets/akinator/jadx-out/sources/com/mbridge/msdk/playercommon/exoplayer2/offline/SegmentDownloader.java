package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.FilterableManifest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M, K>, K> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private final Cache cache;
    private final CacheDataSource dataSource;
    private volatile long downloadedBytes;
    private volatile int downloadedSegments;
    private final Uri manifestUri;
    private final CacheDataSource offlineDataSource;
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<K> streamKeys;
    private volatile int totalSegments = -1;
    private final AtomicBoolean isCanceled = new AtomicBoolean();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j10, DataSpec dataSpec) {
            this.startTimeUs = j10;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            long j10 = this.startTimeUs - segment.startTimeUs;
            if (j10 == 0) {
                return 0;
            }
            return j10 < 0 ? -1 : 1;
        }
    }

    public SegmentDownloader(Uri uri, List<K> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        this.manifestUri = uri;
        this.streamKeys = new ArrayList<>(list);
        this.cache = downloaderConstructorHelper.getCache();
        this.dataSource = downloaderConstructorHelper.buildCacheDataSource(false);
        this.offlineDataSource = downloaderConstructorHelper.buildCacheDataSource(true);
        this.priorityTaskManager = downloaderConstructorHelper.getPriorityTaskManager();
    }

    private List<Segment> initDownload() throws InterruptedException, IOException {
        FilterableManifest manifest = getManifest(this.dataSource, this.manifestUri);
        if (!this.streamKeys.isEmpty()) {
            manifest = (FilterableManifest) manifest.copy(this.streamKeys);
        }
        List<Segment> segments = getSegments(this.dataSource, manifest, false);
        CacheUtil.CachingCounters cachingCounters = new CacheUtil.CachingCounters();
        this.totalSegments = segments.size();
        this.downloadedSegments = 0;
        this.downloadedBytes = 0L;
        for (int size = segments.size() - 1; size >= 0; size--) {
            CacheUtil.getCached(segments.get(size).dataSpec, this.cache, cachingCounters);
            this.downloadedBytes += cachingCounters.alreadyCachedBytes;
            if (cachingCounters.alreadyCachedBytes == cachingCounters.contentLength) {
                this.downloadedSegments++;
                segments.remove(size);
            }
        }
        return segments;
    }

    private void removeUri(Uri uri) {
        CacheUtil.remove(this.cache, CacheUtil.generateKey(uri));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public void cancel() {
        this.isCanceled.set(true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public final void download() throws InterruptedException, IOException {
        this.priorityTaskManager.add(-1000);
        try {
            List<Segment> listInitDownload = initDownload();
            Collections.sort(listInitDownload);
            byte[] bArr = new byte[131072];
            CacheUtil.CachingCounters cachingCounters = new CacheUtil.CachingCounters();
            for (int i10 = 0; i10 < listInitDownload.size(); i10++) {
                try {
                    CacheUtil.cache(listInitDownload.get(i10).dataSpec, this.cache, this.dataSource, bArr, this.priorityTaskManager, -1000, cachingCounters, this.isCanceled, true);
                    this.downloadedSegments++;
                    this.downloadedBytes += cachingCounters.newlyCachedBytes;
                } finally {
                }
            }
            this.priorityTaskManager.remove(-1000);
        } catch (Throwable th2) {
            this.priorityTaskManager.remove(-1000);
            throw th2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public final float getDownloadPercentage() {
        int i10 = this.totalSegments;
        int i11 = this.downloadedSegments;
        if (i10 == -1 || i11 == -1) {
            return -1.0f;
        }
        if (i10 == 0) {
            return 100.0f;
        }
        return (i11 * 100.0f) / i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public abstract M getManifest(DataSource dataSource, Uri uri) throws IOException;

    public abstract List<Segment> getSegments(DataSource dataSource, M m9, boolean z10) throws InterruptedException, IOException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public final void remove() throws InterruptedException {
        try {
            List<Segment> segments = getSegments(this.offlineDataSource, getManifest(this.offlineDataSource, this.manifestUri), true);
            for (int i10 = 0; i10 < segments.size(); i10++) {
                removeUri(segments.get(i10).dataSpec.uri);
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            removeUri(this.manifestUri);
            throw th2;
        }
        removeUri(this.manifestUri);
    }
}
