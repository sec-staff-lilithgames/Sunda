package q7;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f82561a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static d7.d f82562b;

    public final synchronized d7.d get(Context context) {
        d7.d dVarBuild;
        dVarBuild = f82562b;
        if (dVarBuild == null) {
            dVarBuild = new d7.a().directory(gv.s.resolve(n.getSafeCacheDir(context), "image_cache")).build();
            f82562b = dVarBuild;
        }
        return dVarBuild;
    }
}
