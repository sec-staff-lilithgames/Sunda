package u8;

import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f88054a;

    /* renamed from: b, reason: collision with root package name */
    public final u8.a f88055b;

    public b(AssetManager assetManager, u8.a aVar) {
        this.f88054a = assetManager;
        this.f88055b = aVar;
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(uri), this.f88055b.buildFetcher(this.f88054a, uri.toString().substring(22)));
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return C3191e4.h.f36473b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0, u8.a {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f88056a;

        public a(AssetManager assetManager) {
            this.f88056a = assetManager;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new b(this.f88056a, this);
        }

        @Override // u8.a
        public com.bumptech.glide.load.data.e buildFetcher(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.l(assetManager, str);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: u8.b$b, reason: collision with other inner class name */
    public static class C0794b implements m0, u8.a {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f88057a;

        public C0794b(AssetManager assetManager) {
            this.f88057a = assetManager;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new b(this.f88057a, this);
        }

        @Override // u8.a
        public com.bumptech.glide.load.data.e buildFetcher(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.s(assetManager, str);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
