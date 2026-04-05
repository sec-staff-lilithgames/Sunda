package v3;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import sn.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements Spannable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f88967g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static ExecutorService f88968h;

    /* renamed from: b, reason: collision with root package name */
    public final Spannable f88969b;

    /* renamed from: c, reason: collision with root package name */
    public final f f88970c;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f88971e;

    /* renamed from: f, reason: collision with root package name */
    public final PrecomputedText f88972f;

    public i(CharSequence charSequence, f fVar, int[] iArr) {
        this.f88969b = new SpannableString(charSequence);
        this.f88970c = fVar;
        this.f88971e = iArr;
        this.f88972f = null;
    }

    public static i create(CharSequence charSequence, f fVar) {
        PrecomputedText.Params params;
        w3.i.checkNotNull(charSequence);
        w3.i.checkNotNull(fVar);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = fVar.f88960e) != null) {
                return new i(PrecomputedText.create(charSequence, params), fVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i10, length);
                i10 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i10));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), fVar.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(fVar.getBreakStrategy()).setHyphenationFrequency(fVar.getHyphenationFrequency()).setTextDirection(fVar.getTextDirection()).build();
            return new i(charSequence, fVar, iArr);
        } finally {
            Trace.endSection();
        }
    }

    public static Future<i> getTextFuture(CharSequence charSequence, f fVar, Executor executor) {
        g gVar = new g();
        gVar.f88965b = fVar;
        gVar.f88966c = charSequence;
        h hVar = new h(gVar);
        if (executor == null) {
            synchronized (f88967g) {
                try {
                    if (f88968h == null) {
                        f88968h = Executors.newFixedThreadPool(1);
                    }
                    executor = f88968h;
                } finally {
                }
            }
        }
        executor.execute(hVar);
        return hVar;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f88969b.charAt(i10);
    }

    public int getParagraphCount() {
        return Build.VERSION.SDK_INT >= 29 ? this.f88972f.getParagraphCount() : this.f88971e.length;
    }

    public int getParagraphEnd(int i10) {
        w3.i.checkArgumentInRange(i10, 0, getParagraphCount(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f88972f.getParagraphEnd(i10) : this.f88971e[i10];
    }

    public int getParagraphStart(int i10) {
        w3.i.checkArgumentInRange(i10, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f88972f.getParagraphStart(i10);
        }
        if (i10 == 0) {
            return 0;
        }
        return this.f88971e[i10 - 1];
    }

    public f getParams() {
        return this.f88970c;
    }

    public PrecomputedText getPrecomputedText() {
        Spannable spannable = this.f88969b;
        if (t.f(spannable)) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f88969b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f88969b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f88969b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f88972f.getSpans(i10, i11, cls) : (T[]) this.f88969b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f88969b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f88969b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f88972f.removeSpan(obj);
        } else {
            this.f88969b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f88972f.setSpan(obj, i10, i11, i12);
        } else {
            this.f88969b.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f88969b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f88969b.toString();
    }

    public i(PrecomputedText precomputedText, f fVar) {
        this.f88969b = precomputedText;
        this.f88970c = fVar;
        this.f88971e = null;
        this.f88972f = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }
}
