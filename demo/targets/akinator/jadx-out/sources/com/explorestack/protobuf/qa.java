package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class qa extends ByteString.AbstractByteIterator {

    /* renamed from: b, reason: collision with root package name */
    public final ra f22526b;

    /* renamed from: c, reason: collision with root package name */
    public ByteString.ByteIterator f22527c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.explorestack.protobuf.ByteString$ByteIterator] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public qa(ta taVar) {
        ra raVar = new ra(taVar);
        this.f22526b = raVar;
        this.f22527c = raVar.hasNext() ? raVar.next().iterator2() : 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22527c != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.explorestack.protobuf.ByteString$ByteIterator] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.explorestack.protobuf.ByteString.ByteIterator
    public byte nextByte() {
        ByteString.ByteIterator byteIterator = this.f22527c;
        if (byteIterator == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = byteIterator.nextByte();
        if (!this.f22527c.hasNext()) {
            ra raVar = this.f22526b;
            this.f22527c = raVar.hasNext() ? raVar.next().iterator2() : 0;
        }
        return bNextByte;
    }
}
