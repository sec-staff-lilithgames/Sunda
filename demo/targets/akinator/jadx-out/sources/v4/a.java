package v4;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public long f88980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f88981c;

    public a(g gVar) {
        this.f88981c = gVar;
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f88980b;
            g gVar = this.f88981c;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + gVar.available()) {
                    return -1;
                }
                gVar.seek(j10);
                this.f88980b = j10;
            }
            if (i11 > gVar.available()) {
                i11 = gVar.available();
            }
            int i12 = gVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f88980b += i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f88980b = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
