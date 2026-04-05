package u8;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class v0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f88131a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f88132b;

    public v0(Resources resources, l0 l0Var) {
        this.f88132b = resources;
        this.f88131a = l0Var;
    }

    @Override // u8.l0
    public k0 buildLoadData(Integer num, int i10, int i11, n8.v vVar) {
        Uri uri;
        Resources resources = this.f88132b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f88131a.buildLoadData(uri, i10, i11, vVar);
    }

    @Override // u8.l0
    public boolean handles(Integer num) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f88133a;

        public a(Resources resources) {
            this.f88133a = resources;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new v0(this.f88133a, t0Var.build(Uri.class, AssetFileDescriptor.class));
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f88134a;

        public b(Resources resources) {
            this.f88134a = resources;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new v0(this.f88134a, t0Var.build(Uri.class, InputStream.class));
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f88135a;

        public c(Resources resources) {
            this.f88135a = resources;
        }

        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new v0(this.f88135a, b1.getInstance());
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
