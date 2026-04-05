package lc;

import ic.m0;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f73139b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73140c;

    /* renamed from: e, reason: collision with root package name */
    public final int f73141e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73142f;

    public q(int i10, int i11, int i12, int i13) {
        this.f73139b = i10;
        this.f73141e = i11;
        this.f73140c = i12;
        this.f73142f = i13;
    }

    public static q defaultFeatures() {
        return p.getDefault();
    }

    public final q a(int i10, int i11, int i12, int i13) {
        return (this.f73139b == i10 && this.f73141e == i11 && this.f73140c == i12 && this.f73142f == i13) ? this : new q(i10, i11, i12, i13);
    }

    public Boolean getExplicitState(o oVar) {
        int iFeatureIndex = oVar.featureIndex();
        if (iFeatureIndex == 0) {
            if (oVar.enabledIn(this.f73141e)) {
                return Boolean.valueOf(oVar.enabledIn(this.f73139b));
            }
            return null;
        }
        if (iFeatureIndex != 1) {
            m0.throwInternal();
            return null;
        }
        if (oVar.enabledIn(this.f73142f)) {
            return Boolean.valueOf(oVar.enabledIn(this.f73140c));
        }
        return null;
    }

    public boolean isEnabled(o oVar) {
        int iFeatureIndex = oVar.featureIndex();
        if (iFeatureIndex == 0) {
            return oVar.enabledIn(this.f73139b);
        }
        if (iFeatureIndex == 1) {
            return oVar.enabledIn(this.f73140c);
        }
        m0.throwInternal();
        return false;
    }

    public boolean isExplicitlyDisabled(o oVar) {
        int iFeatureIndex = oVar.featureIndex();
        if (iFeatureIndex == 0) {
            return oVar.enabledIn((~this.f73139b) & this.f73141e);
        }
        if (iFeatureIndex == 1) {
            return oVar.enabledIn((~this.f73140c) & this.f73142f);
        }
        m0.throwInternal();
        return false;
    }

    public boolean isExplicitlyEnabled(o oVar) {
        int iFeatureIndex = oVar.featureIndex();
        if (iFeatureIndex == 0) {
            return oVar.enabledIn(this.f73141e & this.f73139b);
        }
        if (iFeatureIndex == 1) {
            return oVar.enabledIn(this.f73142f & this.f73140c);
        }
        m0.throwInternal();
        return false;
    }

    public boolean isExplicitlySet(o oVar) {
        int iFeatureIndex = oVar.featureIndex();
        if (iFeatureIndex == 0) {
            return oVar.enabledIn(this.f73141e);
        }
        if (iFeatureIndex == 1) {
            return oVar.enabledIn(this.f73142f);
        }
        m0.throwInternal();
        return false;
    }

    public q with(o oVar) {
        int mask = oVar.getMask();
        int iFeatureIndex = oVar.featureIndex();
        int i10 = this.f73142f;
        int i11 = this.f73140c;
        int i12 = this.f73141e;
        int i13 = this.f73139b;
        if (iFeatureIndex == 0) {
            return a(i13 | mask, mask | i12, i11, i10);
        }
        if (iFeatureIndex == 1) {
            return a(i13, i12, i11 | mask, mask | i10);
        }
        m0.throwInternal();
        return this;
    }

    public q withFeatures(o... oVarArr) {
        int mask = 0;
        for (o oVar : oVarArr) {
            mask |= oVar.getMask();
        }
        if (mask == 0) {
            return this;
        }
        int iFeatureIndex = oVarArr[0].featureIndex();
        int i10 = this.f73142f;
        int i11 = this.f73140c;
        int i12 = this.f73141e;
        int i13 = this.f73139b;
        if (iFeatureIndex == 0) {
            return a(i13 | mask, i12 | mask, i11, i10);
        }
        if (iFeatureIndex == 1) {
            return a(i13, i12, i11 | mask, i10 | mask);
        }
        m0.throwInternal();
        return this;
    }

    public q without(o oVar) {
        int mask = oVar.getMask();
        int iFeatureIndex = oVar.featureIndex();
        int i10 = this.f73142f;
        int i11 = this.f73140c;
        int i12 = this.f73141e;
        int i13 = this.f73139b;
        if (iFeatureIndex == 0) {
            return a((~mask) & i13, mask | i12, i11, i10);
        }
        if (iFeatureIndex == 1) {
            return a(i13, i12, (~mask) & i11, mask | i10);
        }
        m0.throwInternal();
        return this;
    }

    public q withoutFeatures(o... oVarArr) {
        int mask = 0;
        for (o oVar : oVarArr) {
            mask |= oVar.getMask();
        }
        if (mask == 0) {
            return this;
        }
        int iFeatureIndex = oVarArr[0].featureIndex();
        int i10 = this.f73142f;
        int i11 = this.f73140c;
        int i12 = this.f73141e;
        int i13 = this.f73139b;
        if (iFeatureIndex == 0) {
            return a((~mask) & i13, i12 | mask, i11, i10);
        }
        if (iFeatureIndex == 1) {
            return a(i13, i12, (~mask) & i11, i10 | mask);
        }
        m0.throwInternal();
        return this;
    }
}
