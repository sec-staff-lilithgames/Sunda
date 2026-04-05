package u8;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final File f88136b;

    /* renamed from: c, reason: collision with root package name */
    public final x f88137c;

    /* renamed from: e, reason: collision with root package name */
    public Object f88138e;

    public w(File file, x xVar) {
        this.f88136b = file;
        this.f88137c = xVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        Object obj = this.f88138e;
        if (obj != null) {
            try {
                this.f88137c.close(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<Object> getDataClass() {
        return this.f88137c.getDataClass();
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(com.bumptech.glide.l lVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objOpen = this.f88137c.open(this.f88136b);
            this.f88138e = objOpen;
            dVar.onDataReady(objOpen);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e10);
            }
            dVar.onLoadFailed(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }
}
