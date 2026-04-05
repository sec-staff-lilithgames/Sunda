package o8;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.l;
import com.bumptech.glide.load.data.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import n8.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f78005b;

    /* renamed from: c, reason: collision with root package name */
    public final g f78006c;

    /* renamed from: e, reason: collision with root package name */
    public InputStream f78007e;

    public e(Uri uri, g gVar) {
        this.f78005b = uri;
        this.f78006c = gVar;
    }

    public static e a(Context context, Uri uri, f fVar) {
        return new e(uri, new g(com.bumptech.glide.c.get(context).getRegistry().getImageHeaderParsers(), fVar, com.bumptech.glide.c.get(context).getArrayPool(), context.getContentResolver()));
    }

    public static e buildImageFetcher(Context context, Uri uri) {
        return a(context, uri, new c(context.getContentResolver()));
    }

    public static e buildVideoFetcher(Context context, Uri uri) {
        return a(context, uri, new d(context.getContentResolver()));
    }

    public final InputStream b() throws Throwable {
        int orientation;
        g gVar = this.f78006c;
        Uri uri = this.f78005b;
        InputStream inputStreamOpen = gVar.open(uri);
        if (inputStreamOpen != null) {
            gVar.getClass();
            InputStream inputStreamOpenInputStream = null;
            try {
                try {
                    inputStreamOpenInputStream = gVar.f78011c.openInputStream(uri);
                    orientation = p.getOrientation((List<n8.g>) gVar.f78012d, inputStreamOpenInputStream, gVar.f78010b);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException | NullPointerException e10) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e10);
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            }
        } else {
            orientation = -1;
        }
        return orientation != -1 ? new k(inputStreamOpen, orientation) : inputStreamOpen;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() throws IOException {
        InputStream inputStream = this.f78007e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public n8.a getDataSource() {
        return n8.a.f75823b;
    }

    @Override // com.bumptech.glide.load.data.e
    public void loadData(l lVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            InputStream inputStreamB = b();
            this.f78007e = inputStreamB;
            dVar.onDataReady(inputStreamB);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            dVar.onLoadFailed(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cancel() {
    }
}
