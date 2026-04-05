package gn;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f58191a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public boolean f58192b;

    public u add(int i10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f58192b);
        this.f58191a.append(i10, true);
        return this;
    }

    public u addAll(int... iArr) {
        for (int i10 : iArr) {
            add(i10);
        }
        return this;
    }

    public u addIf(int i10, boolean z10) {
        return z10 ? add(i10) : this;
    }

    public v build() {
        io.bidmachine.media3.common.util.a.checkState(!this.f58192b);
        this.f58192b = true;
        return new v(this.f58191a);
    }

    public u remove(int i10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f58192b);
        this.f58191a.delete(i10);
        return this;
    }

    public u removeAll(int... iArr) {
        for (int i10 : iArr) {
            remove(i10);
        }
        return this;
    }

    public u removeIf(int i10, boolean z10) {
        return z10 ? remove(i10) : this;
    }

    public u addAll(v vVar) {
        for (int i10 = 0; i10 < vVar.size(); i10++) {
            add(vVar.get(i10));
        }
        return this;
    }
}
