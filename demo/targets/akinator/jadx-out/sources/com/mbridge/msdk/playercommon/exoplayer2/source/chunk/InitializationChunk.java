package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DefaultExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InitializationChunk extends Chunk {
    private volatile int bytesLoaded;
    private final ChunkExtractorWrapper extractorWrapper;
    private volatile boolean loadCanceled;

    public InitializationChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, Object obj, ChunkExtractorWrapper chunkExtractorWrapper) {
        super(dataSource, dataSpec, 2, format, i10, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.extractorWrapper = chunkExtractorWrapper;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.chunk.Chunk
    public long bytesLoaded() {
        return this.bytesLoaded;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.Loader.Loadable
    public void load() throws InterruptedException, IOException {
        DataSpec dataSpecSubrange = this.dataSpec.subrange(this.bytesLoaded);
        try {
            DataSource dataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpecSubrange.absoluteStreamPosition, dataSource.open(dataSpecSubrange));
            if (this.bytesLoaded == 0) {
                this.extractorWrapper.init(null, C.TIME_UNSET);
            }
            try {
                Extractor extractor = this.extractorWrapper.extractor;
                int i10 = 0;
                while (i10 == 0 && !this.loadCanceled) {
                    i10 = extractor.read(defaultExtractorInput, null);
                }
                Assertions.checkState(i10 != 1);
                this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
            } catch (Throwable th2) {
                this.bytesLoaded = (int) (defaultExtractorInput.getPosition() - this.dataSpec.absoluteStreamPosition);
                throw th2;
            }
        } finally {
            Util.closeQuietly(this.dataSource);
        }
    }
}
