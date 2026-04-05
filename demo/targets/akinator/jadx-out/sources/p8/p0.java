package p8;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p0 implements Appendable {

    /* renamed from: b, reason: collision with root package name */
    public final Appendable f80842b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f80843c = true;

    public p0(Appendable appendable) {
        this.f80842b = appendable;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c10) throws IOException {
        boolean z10 = this.f80843c;
        Appendable appendable = this.f80842b;
        if (z10) {
            this.f80843c = false;
            appendable.append("  ");
        }
        this.f80843c = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        return append(charSequence, 0, charSequence.length());
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z10 = this.f80843c;
        Appendable appendable = this.f80842b;
        boolean z11 = false;
        if (z10) {
            this.f80843c = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z11 = true;
        }
        this.f80843c = z11;
        appendable.append(charSequence, i10, i11);
        return this;
    }
}
