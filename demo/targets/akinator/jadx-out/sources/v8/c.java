package v8;

import android.content.Context;
import android.net.Uri;
import n8.v;
import u8.k0;
import u8.l0;
import u8.m0;
import u8.t0;
import x8.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f89174a;

    public c(Context context) {
        this.f89174a = context.getApplicationContext();
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, v vVar) {
        Long l9;
        if (o8.b.isThumbnailSize(i10, i11) && (l9 = (Long) vVar.get(h1.f91831d)) != null && l9.longValue() == -1) {
            return new k0(new i9.d(uri), o8.e.buildVideoFetcher(this.f89174a, uri));
        }
        return null;
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return o8.b.isMediaStoreVideoUri(uri);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Context f89175a;

        public a(Context context) {
            this.f89175a = context;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new c(this.f89175a);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
