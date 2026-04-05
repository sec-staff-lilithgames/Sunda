package androidx.datastore.preferences.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5977b;

    public r0(r2 r2Var, int i10) {
        this.f5976a = r2Var;
        this.f5977b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f5976a == r0Var.f5976a && this.f5977b == r0Var.f5977b;
    }

    public int hashCode() {
        return (System.identityHashCode(this.f5976a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f5977b;
    }
}
