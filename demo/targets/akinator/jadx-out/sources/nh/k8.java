package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k8 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final String f76419e;

    public k8(String str) {
        this.f76419e = str;
    }

    @Override // nh.b5, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        return this.f76419e.indexOf(((Character) obj).charValue());
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // nh.b5, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        return this.f76419e.lastIndexOf(((Character) obj).charValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76419e.length();
    }

    @Override // java.util.List
    public Character get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        return Character.valueOf(this.f76419e.charAt(i10));
    }

    @Override // nh.b5, java.util.List
    public b5 subList(int i10, int i11) {
        mh.p1.checkPositionIndexes(i10, i11, size());
        return p8.charactersOf(this.f76419e.substring(i10, i11));
    }
}
