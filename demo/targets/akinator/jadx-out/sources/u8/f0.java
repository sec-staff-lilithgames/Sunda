package u8;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88076a;

    public f0(Context context) {
        this.f88076a = context;
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(uri), new g0(this.f88076a, uri));
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return o8.b.isMediaStoreUri(uri);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Context f88077a;

        public a(Context context) {
            this.f88077a = context;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new f0(this.f88077a);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
