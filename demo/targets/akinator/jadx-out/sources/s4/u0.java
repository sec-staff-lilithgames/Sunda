package s4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f85464b = false;

    /* renamed from: c, reason: collision with root package name */
    public Spannable f85465c;

    public u0(Spannable spannable) {
        this.f85465c = spannable;
    }

    public final void a() {
        Spannable spannable = this.f85465c;
        if (!this.f85464b) {
            if ((Build.VERSION.SDK_INT < 28 ? new zi.d() : new t0()).a(spannable)) {
                this.f85465c = new SpannableString(spannable);
            }
        }
        this.f85464b = true;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f85465c.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return this.f85465c.chars();
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return this.f85465c.codePoints();
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f85465c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f85465c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f85465c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f85465c.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f85465c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f85465c.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f85465c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f85465c.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f85465c.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f85465c.toString();
    }
}
