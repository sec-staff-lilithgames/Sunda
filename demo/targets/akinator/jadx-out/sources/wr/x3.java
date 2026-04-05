package wr;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x3 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public boolean f91183b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f91184c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y3 f91185e;

    public x3(y3 y3Var) {
        this.f91185e = y3Var;
        this.f91184c = y3Var.f91200c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f91183b) {
            return true;
        }
        while (true) {
            int i10 = this.f91184c;
            y3 y3Var = this.f91185e;
            e4 e4Var = y3Var.f91201e;
            if (i10 >= e4Var.f90908b) {
                return false;
            }
            if (Arrays.equals(y3Var.f91199b.f91225c, e4Var.d(i10))) {
                this.f91183b = true;
                return true;
            }
            this.f91184c++;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f91183b = false;
        y3 y3Var = this.f91185e;
        e4 e4Var = y3Var.f91201e;
        int i10 = this.f91184c;
        this.f91184c = i10 + 1;
        z3 z3Var = y3Var.f91199b;
        Logger logger = e4.f90904c;
        return e4Var.g(i10, z3Var);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
