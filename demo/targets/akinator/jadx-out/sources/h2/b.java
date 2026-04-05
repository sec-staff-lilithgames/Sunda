package h2;

import java.text.CharacterIterator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f58626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58627c;

    /* renamed from: e, reason: collision with root package name */
    public final int f58628e;

    /* renamed from: f, reason: collision with root package name */
    public int f58629f;

    public b(CharSequence charSequence, int i10, int i11) {
        e0.checkNotNullParameter(charSequence, "charSequence");
        this.f58626b = charSequence;
        this.f58627c = i10;
        this.f58628e = i11;
        this.f58629f = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object objClone = super.clone();
            e0.checkNotNullExpressionValue(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f58629f;
        if (i10 == this.f58628e) {
            return (char) 65535;
        }
        return this.f58626b.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f58629f = this.f58627c;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f58627c;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f58628e;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f58629f;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f58627c;
        int i11 = this.f58628e;
        if (i10 == i11) {
            this.f58629f = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f58629f = i12;
        return this.f58626b.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f58629f + 1;
        this.f58629f = i10;
        int i11 = this.f58628e;
        if (i10 < i11) {
            return this.f58626b.charAt(i10);
        }
        this.f58629f = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f58629f;
        if (i10 <= this.f58627c) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f58629f = i11;
        return this.f58626b.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        if (i10 > this.f58628e || this.f58627c > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f58629f = i10;
        return current();
    }
}
