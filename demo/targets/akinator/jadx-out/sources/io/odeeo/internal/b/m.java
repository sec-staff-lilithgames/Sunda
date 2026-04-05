package io.odeeo.internal.b;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final m f62813d = new m(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final g.a<m> f62814e = new is.b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f62815a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62816b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62817c;

    public m(int i10, int i11, int i12) {
        this.f62815a = i10;
        this.f62816b = i11;
        this.f62817c = i12;
    }

    public static /* synthetic */ m a(Bundle bundle) {
        return new m(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f62815a == mVar.f62815a && this.f62816b == mVar.f62816b && this.f62817c == mVar.f62817c;
    }

    public int hashCode() {
        return ((((this.f62815a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f62816b) * 31) + this.f62817c;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), this.f62815a);
        bundle.putInt(a(1), this.f62816b);
        bundle.putInt(a(2), this.f62817c);
        return bundle;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
