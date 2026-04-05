package u8;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final File f88083b;

    public i(File file) {
        this.f88083b = file;
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<ByteBuffer> getDataClass() {
        return ByteBuffer.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        try {
            dVar.onDataReady(j9.b.fromFile(this.f88083b));
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
            }
            dVar.onLoadFailed(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
