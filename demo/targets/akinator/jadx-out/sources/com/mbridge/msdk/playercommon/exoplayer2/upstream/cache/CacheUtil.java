package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class CachingCounters {
        public volatile long alreadyCachedBytes;
        public volatile long contentLength = -1;
        public volatile long newlyCachedBytes;

        public long totalCachedBytes() {
            return this.alreadyCachedBytes + this.newlyCachedBytes;
        }
    }

    private CacheUtil() {
    }

    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, CachingCounters cachingCounters, AtomicBoolean atomicBoolean) throws InterruptedException, IOException {
        cache(dataSpec, cache, new CacheDataSource(cache, dataSource), new byte[131072], null, 0, cachingCounters, atomicBoolean, false);
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static void getCached(DataSpec dataSpec, Cache cache, CachingCounters cachingCounters) {
        String key = getKey(dataSpec);
        long j10 = dataSpec.absoluteStreamPosition;
        long contentLength = dataSpec.length;
        Cache cache2 = cache;
        if (contentLength == -1) {
            contentLength = cache2.getContentLength(key);
        }
        cachingCounters.contentLength = contentLength;
        cachingCounters.alreadyCachedBytes = 0L;
        cachingCounters.newlyCachedBytes = 0L;
        long j11 = contentLength;
        while (j11 != 0) {
            long cachedLength = cache2.getCachedLength(key, j10, j11 != -1 ? j11 : Long.MAX_VALUE);
            if (cachedLength > 0) {
                cachingCounters.alreadyCachedBytes += cachedLength;
            } else {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    return;
                }
            }
            j10 += cachedLength;
            if (j11 == -1) {
                cachedLength = 0;
            }
            j11 -= cachedLength;
            cache2 = cache;
        }
    }

    public static String getKey(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : generateKey(dataSpec.uri);
    }

    private static long readAndDiscard(DataSpec dataSpec, long j10, long j11, DataSource dataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i10, CachingCounters cachingCounters) throws InterruptedException, IOException {
        DataSpec dataSpec2 = dataSpec;
        while (true) {
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(i10);
            }
            try {
                try {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    DataSpec dataSpec3 = new DataSpec(dataSpec2.uri, dataSpec2.postBody, j10, (dataSpec2.position + j10) - dataSpec2.absoluteStreamPosition, -1L, dataSpec2.key, dataSpec2.flags | 2);
                    try {
                        long jOpen = dataSource.open(dataSpec3);
                        if (cachingCounters.contentLength == -1 && jOpen != -1) {
                            cachingCounters.contentLength = dataSpec3.absoluteStreamPosition + jOpen;
                        }
                        long j12 = 0;
                        while (true) {
                            if (j12 == j11) {
                                break;
                            }
                            if (Thread.interrupted()) {
                                throw new InterruptedException();
                            }
                            int i11 = dataSource.read(bArr, 0, j11 != -1 ? (int) Math.min(bArr.length, j11 - j12) : bArr.length);
                            if (i11 != -1) {
                                long j13 = i11;
                                j12 += j13;
                                cachingCounters.newlyCachedBytes += j13;
                            } else if (cachingCounters.contentLength == -1) {
                                cachingCounters.contentLength = dataSpec3.absoluteStreamPosition + j12;
                            }
                        }
                        Util.closeQuietly(dataSource);
                        return j12;
                    } catch (PriorityTaskManager.PriorityTooLowException unused) {
                        dataSpec2 = dataSpec3;
                    }
                } catch (Throwable th2) {
                    Util.closeQuietly(dataSource);
                    throw th2;
                }
            } catch (PriorityTaskManager.PriorityTooLowException unused2) {
            }
            Util.closeQuietly(dataSource);
        }
    }

    public static void remove(Cache cache, String str) {
        Iterator<CacheSpan> it = cache.getCachedSpans(str).iterator();
        while (it.hasNext()) {
            try {
                cache.removeSpan(it.next());
            } catch (Cache.CacheException unused) {
            }
        }
    }

    public static void cache(DataSpec dataSpec, Cache cache, CacheDataSource cacheDataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i10, CachingCounters cachingCounters, AtomicBoolean atomicBoolean, boolean z10) throws InterruptedException, IOException {
        DataSpec dataSpec2 = dataSpec;
        Cache cache2 = cache;
        CachingCounters cachingCounters2 = cachingCounters;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        if (cachingCounters2 != null) {
            getCached(dataSpec2, cache2, cachingCounters2);
        } else {
            cachingCounters2 = new CachingCounters();
        }
        CachingCounters cachingCounters3 = cachingCounters2;
        String key = getKey(dataSpec2);
        long j10 = dataSpec2.absoluteStreamPosition;
        long contentLength = dataSpec2.length;
        if (contentLength == -1) {
            contentLength = cache2.getContentLength(key);
        }
        long j11 = contentLength;
        while (true) {
            long j12 = 0;
            if (j11 == 0) {
                return;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long cachedLength = cache2.getCachedLength(key, j10, j11 != -1 ? j11 : Long.MAX_VALUE);
            String str = key;
            long j13 = j10;
            if (cachedLength <= 0) {
                long j14 = -cachedLength;
                if (readAndDiscard(dataSpec2, j13, j14, cacheDataSource, bArr, priorityTaskManager, i10, cachingCounters3) < j14) {
                    if (z10 && j11 != -1) {
                        throw new EOFException();
                    }
                    return;
                }
                cachedLength = j14;
            }
            j10 = j13 + cachedLength;
            if (j11 != -1) {
                j12 = cachedLength;
            }
            j11 -= j12;
            dataSpec2 = dataSpec;
            cache2 = cache;
            key = str;
        }
    }
}
