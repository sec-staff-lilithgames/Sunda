package x2;

import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f91506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f91507b;

    public k(l lVar) {
        this.f91507b = lVar;
    }

    public void add(n nVar) {
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f91506a.f91525k;
            float f10 = fArr[i10] + nVar.f91525k[i10];
            fArr[i10] = f10;
            if (Math.abs(f10) < 1.0E-4f) {
                this.f91506a.f91525k[i10] = 0.0f;
            }
        }
    }

    public boolean addToGoal(n nVar, float f10) {
        boolean z10 = true;
        if (!this.f91506a.f91517b) {
            for (int i10 = 0; i10 < 9; i10++) {
                float f11 = nVar.f91525k[i10];
                if (f11 != 0.0f) {
                    float f12 = f11 * f10;
                    if (Math.abs(f12) < 1.0E-4f) {
                        f12 = 0.0f;
                    }
                    this.f91506a.f91525k[i10] = f12;
                } else {
                    this.f91506a.f91525k[i10] = 0.0f;
                }
            }
            return true;
        }
        for (int i11 = 0; i11 < 9; i11++) {
            float[] fArr = this.f91506a.f91525k;
            float f13 = (nVar.f91525k[i11] * f10) + fArr[i11];
            fArr[i11] = f13;
            if (Math.abs(f13) < 1.0E-4f) {
                this.f91506a.f91525k[i11] = 0.0f;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            this.f91507b.e(this.f91506a);
        }
        return false;
    }

    public void init(n nVar) {
        this.f91506a = nVar;
    }

    public final boolean isNegative() {
        for (int i10 = 8; i10 >= 0; i10--) {
            float f10 = this.f91506a.f91525k[i10];
            if (f10 > 0.0f) {
                return false;
            }
            if (f10 < 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final boolean isNull() {
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f91506a.f91525k[i10] != 0.0f) {
                return false;
            }
        }
        return true;
    }

    public final boolean isSmallerThan(n nVar) {
        int i10 = 8;
        while (true) {
            if (i10 < 0) {
                break;
            }
            float f10 = nVar.f91525k[i10];
            float f11 = this.f91506a.f91525k[i10];
            if (f11 == f10) {
                i10--;
            } else if (f11 < f10) {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        Arrays.fill(this.f91506a.f91525k, 0.0f);
    }

    public String toString() {
        String string = "[ ";
        if (this.f91506a != null) {
            for (int i10 = 0; i10 < 9; i10++) {
                StringBuilder sbU = o2.u(string);
                sbU.append(this.f91506a.f91525k[i10]);
                sbU.append(" ");
                string = sbU.toString();
            }
        }
        StringBuilder sbT = a.b.t(string, "] ");
        sbT.append(this.f91506a);
        return sbT.toString();
    }
}
