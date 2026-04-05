package qv;

import java.util.NoSuchElementException;
import uu.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends j1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f83533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83534c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83535e;

    /* renamed from: f, reason: collision with root package name */
    public int f83536f;

    public l(int i10, int i11, int i12) {
        this.f83533b = i12;
        this.f83534c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f83535e = z10;
        this.f83536f = z10 ? i10 : i11;
    }

    public final int getStep() {
        return this.f83533b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f83535e;
    }

    @Override // uu.j1
    public int nextInt() {
        int i10 = this.f83536f;
        if (i10 != this.f83534c) {
            this.f83536f = this.f83533b + i10;
            return i10;
        }
        if (!this.f83535e) {
            throw new NoSuchElementException();
        }
        this.f83535e = false;
        return i10;
    }
}
