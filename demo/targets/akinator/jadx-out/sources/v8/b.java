package v8;

import android.content.Context;
import android.net.Uri;
import n8.v;
import u8.k0;
import u8.l0;
import u8.m0;
import u8.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f89172a;

    public b(Context context) {
        this.f89172a = context.getApplicationContext();
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, v vVar) {
        if (o8.b.isThumbnailSize(i10, i11)) {
            return new k0(new i9.d(uri), o8.e.buildImageFetcher(this.f89172a, uri));
        }
        return null;
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return o8.b.isMediaStoreImageUri(uri);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Context f89173a;

        public a(Context context) {
            this.f89173a = context;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new b(this.f89173a);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
