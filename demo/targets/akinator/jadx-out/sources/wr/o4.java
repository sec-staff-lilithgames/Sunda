package wr;

import com.amazon.device.ads.DTBMetricsConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final m6 f91078a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f91079b;

    public o4(Object obj) {
        this.f91079b = mh.p1.checkNotNull(obj, DTBMetricsConfiguration.CONFIG_DIR);
        this.f91078a = null;
    }

    public static o4 fromConfig(Object obj) {
        return new o4(obj);
    }

    public static o4 fromError(m6 m6Var) {
        return new o4(m6Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o4.class == obj.getClass()) {
            o4 o4Var = (o4) obj;
            if (mh.h1.equal(this.f91078a, o4Var.f91078a) && mh.h1.equal(this.f91079b, o4Var.f91079b)) {
                return true;
            }
        }
        return false;
    }

    public Object getConfig() {
        return this.f91079b;
    }

    public m6 getError() {
        return this.f91078a;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f91078a, this.f91079b);
    }

    public String toString() {
        Object obj = this.f91079b;
        return obj != null ? mh.g1.toStringHelper(this).add(DTBMetricsConfiguration.CONFIG_DIR, obj).toString() : mh.g1.toStringHelper(this).add("error", this.f91078a).toString();
    }

    public o4(m6 m6Var) {
        this.f91079b = null;
        this.f91078a = (m6) mh.p1.checkNotNull(m6Var, "status");
        mh.p1.checkArgument(!m6Var.isOk(), "cannot use OK status: %s", m6Var);
    }
}
