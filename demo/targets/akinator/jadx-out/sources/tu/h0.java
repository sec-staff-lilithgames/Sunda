package tu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f87383b;

    /* renamed from: c, reason: collision with root package name */
    public int f87384c;

    public h0(byte[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        this.f87383b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87384c < this.f87383b.length;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return g0.m7030boximpl(m7037nextw2LRezQ());
    }

    /* renamed from: next-w2LRezQ, reason: not valid java name */
    public byte m7037nextw2LRezQ() {
        int i10 = this.f87384c;
        byte[] bArr = this.f87383b;
        if (i10 >= bArr.length) {
            throw new NoSuchElementException(String.valueOf(this.f87384c));
        }
        this.f87384c = i10 + 1;
        return g0.m7031constructorimpl(bArr[i10]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
