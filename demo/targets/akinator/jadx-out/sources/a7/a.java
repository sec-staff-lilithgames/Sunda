package a7;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4087a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static m f4088b;

    @tu.f
    public static final l7.e enqueue(l7.i iVar) {
        throw new IllegalStateException("Unsupported");
    }

    @tu.f
    public static final Object execute(l7.i iVar, zu.d<? super l7.k> dVar) {
        throw new IllegalStateException("Unsupported");
    }

    public static final m imageLoader(Context context) {
        m mVar = f4088b;
        if (mVar != null) {
            return mVar;
        }
        synchronized (f4087a) {
            m mVar2 = f4088b;
            if (mVar2 != null) {
                return mVar2;
            }
            context.getApplicationContext();
            m mVarCreate = p.create(context);
            f4088b = mVarCreate;
            return mVarCreate;
        }
    }

    public static final synchronized void setImageLoader(m mVar) {
        f4088b = mVar;
    }

    public final synchronized void reset$coil_singleton_release() {
        f4088b = null;
    }

    public static final synchronized void setImageLoader(n nVar) {
        f4088b = null;
    }
}
