package c9;

import android.content.Context;
import android.content.res.Resources;
import j9.q;
import n8.v;
import p8.v0;
import x8.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f11932a;

    public b(Context context) {
        this(context.getResources());
    }

    @Override // c9.e
    public v0 transcode(v0 v0Var, v vVar) {
        return m0.obtain(this.f11932a, v0Var);
    }

    @Deprecated
    public b(Resources resources, q8.d dVar) {
        this(resources);
    }

    public b(Resources resources) {
        this.f11932a = (Resources) q.checkNotNull(resources);
    }
}
