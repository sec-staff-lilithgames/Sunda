package com.iabtcf.utils;

import ca.p;
import java.util.BitSet;
import java.util.Collection;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BitSetIntIterable extends IntIterable {
    public static final BitSetIntIterable EMPTY = new BitSetIntIterable(new BitSet());

    /* renamed from: bs, reason: collision with root package name */
    private final BitSet f31532bs;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: bs, reason: collision with root package name */
        private final BitSet f31533bs;

        public Builder add(int i10) {
            this.f31533bs.set(i10);
            return this;
        }

        public BitSetIntIterable build() {
            return new BitSetIntIterable((BitSet) this.f31533bs.clone());
        }

        public Builder clear() {
            this.f31533bs.clear();
            return this;
        }

        public int max() {
            if (this.f31533bs.isEmpty()) {
                return 0;
            }
            return this.f31533bs.length() - 1;
        }

        public Builder add(BitSetIntIterable bitSetIntIterable) {
            this.f31533bs.or(bitSetIntIterable.f31532bs);
            return this;
        }

        private Builder() {
            this(new BitSet());
        }

        public Builder add(IntIterable intIterable) {
            IntIterator intIterator = intIterable.intIterator();
            while (intIterator.hasNext()) {
                this.f31533bs.set(intIterator.nextInt());
            }
            return this;
        }

        private Builder(BitSet bitSet) {
            this.f31533bs = bitSet;
        }

        public Builder add(Builder builder) {
            this.f31533bs.or(builder.f31533bs);
            return this;
        }

        private Builder(BitSetIntIterable bitSetIntIterable) {
            this(bitSetIntIterable.m532clone().f31532bs);
        }
    }

    public static BitSetIntIterable from(BitSet bitSet) {
        return new BitSetIntIterable((BitSet) bitSet.clone());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.iabtcf.utils.IntIterable
    public boolean contains(int i10) {
        if (i10 < 0) {
            return false;
        }
        return this.f31532bs.get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BitSetIntIterable bitSetIntIterable = (BitSetIntIterable) obj;
        BitSet bitSet = this.f31532bs;
        return bitSet == null ? bitSetIntIterable.f31532bs == null : bitSet.equals(bitSetIntIterable.f31532bs);
    }

    public int hashCode() {
        BitSet bitSet = this.f31532bs;
        return 31 + (bitSet == null ? 0 : bitSet.hashCode());
    }

    @Override // com.iabtcf.utils.IntIterable
    public IntIterator intIterator() {
        return new IntIterator() { // from class: com.iabtcf.utils.BitSetIntIterable.1
            int currentIndex = start();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex != -1;
            }

            @Override // java.util.PrimitiveIterator.OfInt
            public int nextInt() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i10 = this.currentIndex;
                this.currentIndex = BitSetIntIterable.this.f31532bs.nextSetBit(this.currentIndex + 1);
                return i10;
            }

            public int start() {
                if (BitSetIntIterable.this.f31532bs.isEmpty()) {
                    return -1;
                }
                return BitSetIntIterable.this.f31532bs.nextSetBit(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator, java.util.PrimitiveIterator.OfInt
            public Integer next() {
                return Integer.valueOf(nextInt());
            }
        };
    }

    public BitSet toBitSet() {
        return (BitSet) this.f31532bs.clone();
    }

    public String toString() {
        return this.f31532bs.toString();
    }

    private BitSetIntIterable(BitSet bitSet) {
        this.f31532bs = bitSet;
    }

    public static BitSetIntIterable from(IntIterable intIterable) {
        if (intIterable instanceof BitSetIntIterable) {
            return ((BitSetIntIterable) intIterable).m532clone();
        }
        BitSet bitSet = new BitSet();
        IntIterator intIterator = intIterable.intIterator();
        while (intIterator.hasNext()) {
            bitSet.set(intIterator.nextInt());
        }
        return new BitSetIntIterable(bitSet);
    }

    public static Builder newBuilder(BitSetIntIterable bitSetIntIterable) {
        return new Builder();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitSetIntIterable m532clone() {
        return new BitSetIntIterable((BitSet) this.f31532bs.clone());
    }

    public static Builder newBuilder(BitSet bitSet) {
        return new Builder();
    }

    public static Builder newBuilder(IntIterable intIterable) {
        return new Builder();
    }

    public static BitSetIntIterable from(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i10 : iArr) {
            bitSet.set(i10);
        }
        return new BitSetIntIterable(bitSet);
    }

    public static BitSetIntIterable from(Collection<Integer> collection) {
        BitSet bitSet = new BitSet();
        collection.forEach(new p(bitSet, 1));
        return new BitSetIntIterable(bitSet);
    }
}
