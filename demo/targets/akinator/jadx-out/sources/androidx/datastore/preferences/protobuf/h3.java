package androidx.datastore.preferences.protobuf;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h3 extends l {

    /* renamed from: b, reason: collision with root package name */
    public final j3 f5895b;

    /* renamed from: c, reason: collision with root package name */
    public p f5896c;

    public h3(l3 l3Var) {
        j3 j3Var = new j3(l3Var);
        this.f5895b = j3Var;
        this.f5896c = j3Var.hasNext() ? j3Var.next().iterator() : null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5896c != null;
    }

    @Override // androidx.datastore.preferences.protobuf.l, androidx.datastore.preferences.protobuf.p
    public byte nextByte() {
        p pVar = this.f5896c;
        if (pVar == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = pVar.nextByte();
        if (!this.f5896c.hasNext()) {
            j3 j3Var = this.f5895b;
            this.f5896c = j3Var.hasNext() ? j3Var.next().iterator() : null;
        }
        return bNextByte;
    }
}
