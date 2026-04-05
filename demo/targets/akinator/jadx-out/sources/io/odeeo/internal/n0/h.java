package io.odeeo.internal.n0;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f64993a;

    /* renamed from: b, reason: collision with root package name */
    public final g[] f64994b;

    /* renamed from: c, reason: collision with root package name */
    public int f64995c;

    public h(g... gVarArr) {
        this.f64994b = gVarArr;
        this.f64993a = gVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f64994b, ((h) obj).f64994b);
    }

    public g get(int i10) {
        return this.f64994b[i10];
    }

    public g[] getAll() {
        return (g[]) this.f64994b.clone();
    }

    public int hashCode() {
        if (this.f64995c == 0) {
            this.f64995c = Arrays.hashCode(this.f64994b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f64995c;
    }
}
