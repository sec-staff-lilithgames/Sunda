package rh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int[] f84385a;

    /* renamed from: b, reason: collision with root package name */
    public int f84386b = 0;

    public r(int i10) {
        this.f84385a = new int[i10];
    }

    public final void a(int i10) {
        int i11 = this.f84386b + i10;
        int[] iArr = this.f84385a;
        if (i11 > iArr.length) {
            int length = iArr.length;
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = length + (length >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                iHighestOneBit = Integer.MAX_VALUE;
            }
            this.f84385a = Arrays.copyOf(iArr, iHighestOneBit);
        }
    }

    public r add(int i10) {
        a(1);
        int[] iArr = this.f84385a;
        int i11 = this.f84386b;
        iArr[i11] = i10;
        this.f84386b = i11 + 1;
        return this;
    }

    public r addAll(int[] iArr) {
        a(iArr.length);
        System.arraycopy(iArr, 0, this.f84385a, this.f84386b, iArr.length);
        this.f84386b += iArr.length;
        return this;
    }

    public s build() {
        int i10 = this.f84386b;
        return i10 == 0 ? s.f84387f : new s(this.f84385a, 0, i10);
    }

    public r addAll(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return addAll((Collection<Integer>) iterable);
        }
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().intValue());
        }
        return this;
    }

    public r addAll(Collection<Integer> collection) {
        a(collection.size());
        for (Integer num : collection) {
            int[] iArr = this.f84385a;
            int i10 = this.f84386b;
            this.f84386b = i10 + 1;
            iArr[i10] = num.intValue();
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Spliterator, java.util.Spliterator$OfInt] */
    public r addAll(IntStream intStream) {
        ?? Spliterator = intStream.spliterator();
        long exactSizeIfKnown = Spliterator.getExactSizeIfKnown();
        if (exactSizeIfKnown > 0) {
            a(w.saturatedCast(exactSizeIfKnown));
        }
        Spliterator.forEachRemaining(new IntConsumer() { // from class: rh.q
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                this.f84384a.add(i10);
            }
        });
        return this;
    }

    public r addAll(s sVar) {
        a(sVar.length());
        System.arraycopy(sVar.f84388b, sVar.f84389c, this.f84385a, this.f84386b, sVar.length());
        this.f84386b = sVar.length() + this.f84386b;
        return this;
    }
}
