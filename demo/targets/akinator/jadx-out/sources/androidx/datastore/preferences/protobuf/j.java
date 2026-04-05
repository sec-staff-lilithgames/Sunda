package androidx.datastore.preferences.protobuf;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: b, reason: collision with root package name */
    public int f5908b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f5909c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f5910e;

    public j(x xVar) {
        this.f5910e = xVar;
        this.f5909c = xVar.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5908b < this.f5909c;
    }

    @Override // androidx.datastore.preferences.protobuf.l, androidx.datastore.preferences.protobuf.p
    public byte nextByte() {
        int i10 = this.f5908b;
        if (i10 >= this.f5909c) {
            throw new NoSuchElementException();
        }
        this.f5908b = i10 + 1;
        return this.f5910e.internalByteAt(i10);
    }
}
