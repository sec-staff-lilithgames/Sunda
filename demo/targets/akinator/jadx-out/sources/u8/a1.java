package u8;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a1 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f88053a;

    public a1(l0 l0Var) {
        this.f88053a = l0Var;
    }

    @Override // u8.l0
    public k0 buildLoadData(String str, int i10, int i11, n8.v vVar) {
        Uri uriFromFile;
        if (TextUtils.isEmpty(str)) {
            uriFromFile = null;
        } else if (str.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str));
        } else {
            Uri uri = Uri.parse(str);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
        }
        if (uriFromFile != null) {
            l0 l0Var = this.f88053a;
            if (l0Var.handles(uriFromFile)) {
                return l0Var.buildLoadData(uriFromFile, i10, i11, vVar);
            }
        }
        return null;
    }

    @Override // u8.l0
    public boolean handles(String str) {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new a1(t0Var.build(Uri.class, AssetFileDescriptor.class));
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new a1(t0Var.build(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // u8.m0
        public void teardown() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new a1(t0Var.build(Uri.class, InputStream.class));
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
