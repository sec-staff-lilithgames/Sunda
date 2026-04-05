package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class CachedContent {
    private static final int VERSION_MAX = Integer.MAX_VALUE;
    private static final int VERSION_METADATA_INTRODUCED = 2;

    /* renamed from: id, reason: collision with root package name */
    public final int f42176id;
    public final String key;
    private boolean locked;
    private DefaultContentMetadata metadata = DefaultContentMetadata.EMPTY;
    private final TreeSet<SimpleCacheSpan> cachedSpans = new TreeSet<>();

    public CachedContent(int i10, String str) {
        this.f42176id = i10;
        this.key = str;
    }

    public static CachedContent readFromStream(int i10, DataInputStream dataInputStream) throws IOException {
        CachedContent cachedContent = new CachedContent(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 >= 2) {
            cachedContent.metadata = DefaultContentMetadata.readFromStream(dataInputStream);
            return cachedContent;
        }
        long j10 = dataInputStream.readLong();
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        ContentMetadataInternal.setContentLength(contentMetadataMutations, j10);
        cachedContent.applyMetadataMutations(contentMetadataMutations);
        return cachedContent;
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        this.metadata = this.metadata.copyWithMutationsApplied(contentMetadataMutations);
        return !r2.equals(r0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CachedContent.class == obj.getClass()) {
            CachedContent cachedContent = (CachedContent) obj;
            if (this.f42176id == cachedContent.f42176id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
                return true;
            }
        }
        return false;
    }

    public long getCachedBytesLength(long j10, long j11) {
        SimpleCacheSpan span = getSpan(j10);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j11);
        }
        long j12 = j10 + j11;
        long jMax = span.position + span.length;
        if (jMax < j12) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j13 = simpleCacheSpan.position;
                if (j13 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j13 + simpleCacheSpan.length);
                if (jMax >= j12) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public ContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j10) {
        SimpleCacheSpan simpleCacheSpanCreateLookup = SimpleCacheSpan.createLookup(this.key, j10);
        SimpleCacheSpan simpleCacheSpanFloor = this.cachedSpans.floor(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanFloor != null && simpleCacheSpanFloor.position + simpleCacheSpanFloor.length > j10) {
            return simpleCacheSpanFloor;
        }
        SimpleCacheSpan simpleCacheSpanCeiling = this.cachedSpans.ceiling(simpleCacheSpanCreateLookup);
        return simpleCacheSpanCeiling == null ? SimpleCacheSpan.createOpenHole(this.key, j10) : SimpleCacheSpan.createClosedHole(this.key, j10, simpleCacheSpanCeiling.position - j10);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return this.cachedSpans.hashCode() + (headerHashCode(Integer.MAX_VALUE) * 31);
    }

    public int headerHashCode(int i10) {
        int iHashCode = this.key.hashCode() + (this.f42176id * 31);
        if (i10 < 2) {
            long contentLength = ContentMetadataInternal.getContentLength(this.metadata);
            return (iHashCode * 31) + ((int) (contentLength ^ (contentLength >>> 32)));
        }
        return this.metadata.hashCode() + (iHashCode * 31);
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isLocked() {
        return this.locked;
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        cacheSpan.file.delete();
        return true;
    }

    public void setLocked(boolean z10) {
        this.locked = z10;
    }

    public SimpleCacheSpan touch(SimpleCacheSpan simpleCacheSpan) throws Cache.CacheException {
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        SimpleCacheSpan simpleCacheSpanCopyWithUpdatedLastAccessTime = simpleCacheSpan.copyWithUpdatedLastAccessTime(this.f42176id);
        if (simpleCacheSpan.file.renameTo(simpleCacheSpanCopyWithUpdatedLastAccessTime.file)) {
            this.cachedSpans.add(simpleCacheSpanCopyWithUpdatedLastAccessTime);
            return simpleCacheSpanCopyWithUpdatedLastAccessTime;
        }
        throw new Cache.CacheException("Renaming of " + simpleCacheSpan.file + " to " + simpleCacheSpanCopyWithUpdatedLastAccessTime.file + " failed.");
    }

    public void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f42176id);
        dataOutputStream.writeUTF(this.key);
        this.metadata.writeToStream(dataOutputStream);
    }
}
