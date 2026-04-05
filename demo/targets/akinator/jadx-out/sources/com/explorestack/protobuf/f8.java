package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f8 extends e implements g8, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final f8 f22138e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22139c;

    static {
        f8 f8Var = new f8();
        f8Var.makeImmutable();
        f22138e = f8Var;
    }

    public f8() {
        this(10);
    }

    public static void d(f8 f8Var, int i10, byte[] bArr) {
        f8Var.c();
        f8Var.f22139c.add(i10, bArr);
        ((AbstractList) f8Var).modCount++;
    }

    public static void e(f8 f8Var, int i10, ByteString byteString) {
        f8Var.c();
        f8Var.f22139c.add(i10, byteString);
        ((AbstractList) f8Var).modCount++;
    }

    public static byte[] f(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? x7.toByteArray((String) obj) : ((ByteString) obj).toByteArray();
    }

    public static ByteString g(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.explorestack.protobuf.g8
    public boolean addAllByteArray(Collection<byte[]> collection) {
        c();
        boolean zAddAll = this.f22139c.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.explorestack.protobuf.g8
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        c();
        boolean zAddAll = this.f22139c.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.explorestack.protobuf.g8
    public List<byte[]> asByteArrayList() {
        return new d8(this);
    }

    @Override // com.explorestack.protobuf.g8, com.explorestack.protobuf.ka
    public List<ByteString> asByteStringList() {
        return new e8(this);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f22139c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.g8
    public byte[] getByteArray(int i10) {
        ArrayList arrayList = this.f22139c;
        Object obj = arrayList.get(i10);
        byte[] bArrF = f(obj);
        if (bArrF != obj) {
            arrayList.set(i10, bArrF);
        }
        return bArrF;
    }

    @Override // com.explorestack.protobuf.g8
    public ByteString getByteString(int i10) {
        ArrayList arrayList = this.f22139c;
        Object obj = arrayList.get(i10);
        ByteString byteStringG = g(obj);
        if (byteStringG != obj) {
            arrayList.set(i10, byteStringG);
        }
        return byteStringG;
    }

    @Override // com.explorestack.protobuf.g8
    public Object getRaw(int i10) {
        return this.f22139c.get(i10);
    }

    @Override // com.explorestack.protobuf.g8
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f22139c);
    }

    @Override // com.explorestack.protobuf.g8
    public g8 getUnmodifiableView() {
        return isModifiable() ? new mc(this) : this;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.explorestack.protobuf.e, com.explorestack.protobuf.w7
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.explorestack.protobuf.g8
    public void mergeFrom(g8 g8Var) {
        c();
        for (Object obj : g8Var.getUnderlyingElements()) {
            boolean z10 = obj instanceof byte[];
            ArrayList arrayList = this.f22139c;
            if (z10) {
                byte[] bArr = (byte[]) obj;
                arrayList.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                arrayList.add(obj);
            }
        }
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22139c.size();
    }

    public f8(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public void add(int i10, String str) {
        c();
        this.f22139c.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof g8) {
            collection = ((g8) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f22139c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        ArrayList arrayList = this.f22139c;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                arrayList.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = x7.toStringUtf8(bArr);
        if (x7.isValidUtf8(bArr)) {
            arrayList.set(i10, stringUtf82);
        }
        return stringUtf82;
    }

    @Override // com.explorestack.protobuf.e, com.explorestack.protobuf.w7, com.explorestack.protobuf.r7
    public f8 mutableCopyWithCapacity(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f22139c);
        return new f8(arrayList);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public String set(int i10, String str) {
        c();
        Object obj = this.f22139c.set(i10, str);
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : x7.toStringUtf8((byte[]) obj);
    }

    public f8(g8 g8Var) {
        this.f22139c = new ArrayList(g8Var.size());
        addAll(g8Var);
    }

    @Override // com.explorestack.protobuf.e, java.util.AbstractList, java.util.List
    public String remove(int i10) {
        c();
        Object objRemove = this.f22139c.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof ByteString) {
            return ((ByteString) objRemove).toStringUtf8();
        }
        return x7.toStringUtf8((byte[]) objRemove);
    }

    @Override // com.explorestack.protobuf.g8
    public void add(ByteString byteString) {
        c();
        this.f22139c.add(byteString);
        ((AbstractList) this).modCount++;
    }

    public f8(List<String> list) {
        this(new ArrayList(list));
    }

    public f8(ArrayList arrayList) {
        this.f22139c = arrayList;
    }

    @Override // com.explorestack.protobuf.g8
    public void add(byte[] bArr) {
        c();
        this.f22139c.add(bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.g8
    public void set(int i10, ByteString byteString) {
        c();
        this.f22139c.set(i10, byteString);
    }

    @Override // com.explorestack.protobuf.g8
    public void set(int i10, byte[] bArr) {
        c();
        this.f22139c.set(i10, bArr);
    }
}
