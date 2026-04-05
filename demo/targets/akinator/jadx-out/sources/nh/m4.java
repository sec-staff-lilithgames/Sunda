package nh;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m4 extends e4 implements Set {
    public abstract Set d();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || d().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d().hashCode();
    }
}
