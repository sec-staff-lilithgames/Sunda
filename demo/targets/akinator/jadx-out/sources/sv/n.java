package sv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements Iterator, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f86185b;

    /* renamed from: c, reason: collision with root package name */
    public int f86186c;

    /* renamed from: e, reason: collision with root package name */
    public int f86187e;

    /* renamed from: f, reason: collision with root package name */
    public int f86188f;

    /* renamed from: g, reason: collision with root package name */
    public int f86189g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public n(CharSequence string) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        this.f86185b = string;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f86186c;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f86189g < 0) {
            this.f86186c = 2;
            return false;
        }
        CharSequence charSequence = this.f86185b;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f86187e; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f86186c = 1;
                this.f86189g = i10;
                this.f86188f = length;
                return true;
            }
        }
        i10 = -1;
        this.f86186c = 1;
        this.f86189g = i10;
        this.f86188f = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f86186c = 0;
        int i10 = this.f86188f;
        int i11 = this.f86187e;
        this.f86187e = this.f86189g + i10;
        return this.f86185b.subSequence(i11, i10).toString();
    }
}
