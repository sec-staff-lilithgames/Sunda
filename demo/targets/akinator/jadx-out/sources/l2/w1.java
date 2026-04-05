package l2;

import java.util.List;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final o2.o f72384a = o2.n.createSynchronizedObject();

    /* renamed from: b, reason: collision with root package name */
    public final k2.b f72385b = new k2.b(16);

    public final z1 get$ui_text_release(u1 typefaceRequest) {
        z1 z1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        synchronized (this.f72384a) {
            z1Var = (z1) this.f72385b.get(typefaceRequest);
        }
        return z1Var;
    }

    public final o2.o getLock$ui_text_release() {
        return this.f72384a;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.f72384a) {
            size = this.f72385b.size();
        }
        return size;
    }

    public final void preWarmCache(List<u1> typefaceRequests, kv.l resolveTypeface) {
        z1 z1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(typefaceRequests, "typefaceRequests");
        kotlin.jvm.internal.e0.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        int size = typefaceRequests.size();
        for (int i10 = 0; i10 < size; i10++) {
            u1 u1Var = typefaceRequests.get(i10);
            synchronized (this.f72384a) {
                z1Var = (z1) this.f72385b.get(u1Var);
            }
            if (z1Var == null) {
                try {
                    z1 z1Var2 = (z1) resolveTypeface.invoke(u1Var);
                    if (z1Var2 instanceof x1) {
                        continue;
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Could not load font", e10);
                }
            }
        }
    }

    public final v5 runCached(u1 typefaceRequest, kv.l resolveTypeface) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        synchronized (this.f72384a) {
            z1 z1Var = (z1) this.f72385b.get(typefaceRequest);
            if (z1Var != null) {
                if (z1Var.getCacheable()) {
                    return z1Var;
                }
            }
            try {
                z1 z1Var2 = (z1) resolveTypeface.invoke(new v1(this, typefaceRequest));
                synchronized (this.f72384a) {
                    if (this.f72385b.get(typefaceRequest) == null && z1Var2.getCacheable()) {
                        this.f72385b.put(typefaceRequest, z1Var2);
                    }
                }
                return z1Var2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
