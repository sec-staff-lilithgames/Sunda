package xr;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class je {

    /* renamed from: a, reason: collision with root package name */
    public final wr.h3 f92722a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f92723b;

    public je(wr.h3 h3Var, Object obj) {
        this.f92722a = (wr.h3) mh.p1.checkNotNull(h3Var, IronSourceConstants.EVENTS_PROVIDER);
        this.f92723b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && je.class == obj.getClass()) {
            je jeVar = (je) obj;
            if (mh.h1.equal(this.f92722a, jeVar.f92722a) && mh.h1.equal(this.f92723b, jeVar.f92723b)) {
                return true;
            }
        }
        return false;
    }

    public Object getConfig() {
        return this.f92723b;
    }

    public wr.h3 getProvider() {
        return this.f92722a;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f92722a, this.f92723b);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add(IronSourceConstants.EVENTS_PROVIDER, this.f92722a).add(DTBMetricsConfiguration.CONFIG_DIR, this.f92723b).toString();
    }
}
