package wp;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f90776a;

    public b(d dVar, Context context, String str) {
        this.f90776a = dVar;
        dVar.f90778c = context;
        dVar.f90779e = str;
    }

    public d build() {
        d dVar = this.f90776a;
        if (dVar.f90778c == null) {
            c cVar = dVar.f90781g;
            if (cVar != null) {
                cVar.onFail(dVar);
                return dVar;
            }
        } else if (nm.j.canUseExternalFilesDir()) {
            dVar.f90780f = nm.j.getCacheDir(dVar.f90778c, "native_cache_image");
        }
        return dVar;
    }

    public b setOnCacheImageListener(c cVar) {
        this.f90776a.f90781g = cVar;
        return this;
    }
}
