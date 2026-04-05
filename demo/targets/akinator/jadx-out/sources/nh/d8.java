package nh;

import java.util.AbstractList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d8 extends AbstractList {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f76180b;

    public d8(CharSequence charSequence) {
        this.f76180b = charSequence;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76180b.length();
    }

    @Override // java.util.AbstractList, java.util.List
    public Character get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        return Character.valueOf(this.f76180b.charAt(i10));
    }
}
