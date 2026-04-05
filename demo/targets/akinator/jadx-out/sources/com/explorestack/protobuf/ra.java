package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ra implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f22561b;

    /* renamed from: c, reason: collision with root package name */
    public ByteString.LeafByteString f22562c;

    public ra(ByteString byteString) {
        if (!(byteString instanceof ta)) {
            this.f22561b = null;
            this.f22562c = (ByteString.LeafByteString) byteString;
            return;
        }
        ta taVar = (ta) byteString;
        ArrayDeque arrayDeque = new ArrayDeque(taVar.f22670g);
        this.f22561b = arrayDeque;
        arrayDeque.push(taVar);
        ByteString byteString2 = taVar.f22667c;
        while (byteString2 instanceof ta) {
            ta taVar2 = (ta) byteString2;
            this.f22561b.push(taVar2);
            byteString2 = taVar2.f22667c;
        }
        this.f22562c = (ByteString.LeafByteString) byteString2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22562c != null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public ByteString.LeafByteString next() {
        ByteString.LeafByteString leafByteString;
        ByteString.LeafByteString leafByteString2 = this.f22562c;
        if (leafByteString2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f22561b;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                leafByteString = null;
                break;
            }
            ByteString byteString = ((ta) arrayDeque.pop()).f22668e;
            while (byteString instanceof ta) {
                ta taVar = (ta) byteString;
                arrayDeque.push(taVar);
                byteString = taVar.f22667c;
            }
            leafByteString = (ByteString.LeafByteString) byteString;
        } while (leafByteString.isEmpty());
        this.f22562c = leafByteString;
        return leafByteString2;
    }
}
