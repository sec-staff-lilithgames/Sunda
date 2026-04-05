package u8;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f1 implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f88078b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    public final l0 f88079a;

    public f1(l0 l0Var) {
        this.f88079a = l0Var;
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, n8.v vVar) {
        return this.f88079a.buildLoadData(new z(uri.toString()), i10, i11, vVar);
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return f88078b.contains(uri.getScheme());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements m0 {
        @Override // u8.m0
        public l0 build(t0 t0Var) {
            return new f1(t0Var.build(z.class, InputStream.class));
        }

        @Override // u8.m0
        public void teardown() {
        }
    }
}
