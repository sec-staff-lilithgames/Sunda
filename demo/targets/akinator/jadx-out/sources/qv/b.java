package qv;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import uu.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends n0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f83515b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83516c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83517e;

    /* renamed from: f, reason: collision with root package name */
    public int f83518f;

    public b(char c10, char c11, int i10) {
        this.f83515b = i10;
        this.f83516c = c11;
        boolean z10 = false;
        if (i10 <= 0 ? e0.compare((int) c10, (int) c11) >= 0 : e0.compare((int) c10, (int) c11) <= 0) {
            z10 = true;
        }
        this.f83517e = z10;
        this.f83518f = z10 ? c10 : c11;
    }

    public final int getStep() {
        return this.f83515b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f83517e;
    }

    @Override // uu.n0
    public char nextChar() {
        int i10 = this.f83518f;
        if (i10 != this.f83516c) {
            this.f83518f = this.f83515b + i10;
        } else {
            if (!this.f83517e) {
                throw new NoSuchElementException();
            }
            this.f83517e = false;
        }
        return (char) i10;
    }
}
