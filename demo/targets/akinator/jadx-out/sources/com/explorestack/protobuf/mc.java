package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class mc extends AbstractList implements g8, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final g8 f22383b;

    public mc(g8 g8Var) {
        this.f22383b = g8Var;
    }

    @Override // com.explorestack.protobuf.g8
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.g8
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.g8
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.g8
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.f22383b.asByteArrayList());
    }

    @Override // com.explorestack.protobuf.g8, com.explorestack.protobuf.ka
    public List<ByteString> asByteStringList() {
        return Collections.unmodifiableList(this.f22383b.asByteStringList());
    }

    @Override // com.explorestack.protobuf.g8
    public byte[] getByteArray(int i10) {
        return this.f22383b.getByteArray(i10);
    }

    @Override // com.explorestack.protobuf.g8
    public ByteString getByteString(int i10) {
        return this.f22383b.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.g8
    public Object getRaw(int i10) {
        return this.f22383b.getRaw(i10);
    }

    @Override // com.explorestack.protobuf.g8
    public List<?> getUnderlyingElements() {
        return this.f22383b.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        lc lcVar = new lc();
        lcVar.f22361b = this.f22383b.iterator();
        return lcVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        kc kcVar = new kc();
        kcVar.f22320b = this.f22383b.listIterator(i10);
        return kcVar;
    }

    @Override // com.explorestack.protobuf.g8
    public void mergeFrom(g8 g8Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.g8
    public void set(int i10, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22383b.size();
    }

    @Override // com.explorestack.protobuf.g8
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        return (String) this.f22383b.get(i10);
    }

    @Override // com.explorestack.protobuf.g8
    public void set(int i10, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.g8
    public g8 getUnmodifiableView() {
        return this;
    }
}
