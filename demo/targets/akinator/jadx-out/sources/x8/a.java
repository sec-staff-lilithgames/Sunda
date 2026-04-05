package x8;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements n8.x {

    /* renamed from: a, reason: collision with root package name */
    public final n8.x f91791a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f91792b;

    public a(Context context, n8.x xVar) {
        this(context.getResources(), xVar);
    }

    @Override // n8.x
    public p8.v0 decode(Object obj, int i10, int i11, n8.v vVar) throws IOException {
        return m0.obtain(this.f91792b, this.f91791a.decode(obj, i10, i11, vVar));
    }

    @Override // n8.x
    public boolean handles(Object obj, n8.v vVar) throws IOException {
        return this.f91791a.handles(obj, vVar);
    }

    @Deprecated
    public a(Resources resources, q8.d dVar, n8.x xVar) {
        this(resources, xVar);
    }

    public a(Resources resources, n8.x xVar) {
        this.f91792b = (Resources) j9.q.checkNotNull(resources);
        this.f91791a = (n8.x) j9.q.checkNotNull(xVar);
    }
}
