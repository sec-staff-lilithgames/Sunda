package u8;

import android.content.ContentResolver;
import android.net.Uri;
import com.ironsource.C3191e4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d1 implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f88067b = Collections.unmodifiableSet(new HashSet(Arrays.asList(C3191e4.h.f36473b, "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final e1 f88068a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m0, e1 {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f88069a;

        public a(ContentResolver contentResolver) {
            this.f88069a = contentResolver;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new d1(this);
        }

        @Override // u8.e1
        public com.bumptech.glide.load.data.e build(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f88069a, uri);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements m0, e1 {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f88070a;

        public b(ContentResolver contentResolver) {
            this.f88070a = contentResolver;
        }

        @Override // u8.e1
        public com.bumptech.glide.load.data.e build(Uri uri) {
            return new com.bumptech.glide.load.data.m(this.f88070a, uri);
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new d1(this);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements m0, e1 {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f88071a;

        public c(ContentResolver contentResolver) {
            this.f88071a = contentResolver;
        }

        @Override // u8.e1
        public com.bumptech.glide.load.data.e build(Uri uri) {
            return new com.bumptech.glide.load.data.t(this.f88071a, uri);
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new d1(this);
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    public d1(e1 e1Var) {
        this.f88068a = e1Var;
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, n8.v vVar) {
        return new k0(new i9.d(uri), this.f88068a.build(uri));
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return f88067b.contains(uri.getScheme());
    }
}
