package s4;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 implements TextWatcher, SpanWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final Object f85435b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f85436c = new AtomicInteger(0);

    public p0(Object obj) {
        this.f85435b = obj;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f85435b).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f85435b).beforeTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f85436c.get() <= 0 || !(obj instanceof e0)) {
            ((SpanWatcher) this.f85435b).onSpanAdded(spannable, obj, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f85436c
            int r0 = r0.get()
            if (r0 <= 0) goto Ld
            boolean r0 = r10 instanceof s4.e0
            if (r0 == 0) goto Ld
            return
        Ld:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1c
            r0 = 0
            if (r11 <= r12) goto L17
            r11 = r0
        L17:
            if (r13 <= r14) goto L1c
            r4 = r11
            r6 = r0
            goto L1e
        L1c:
            r4 = r11
            r6 = r13
        L1e:
            java.lang.Object r11 = r8.f85435b
            r1 = r11
            android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
            r2 = r9
            r3 = r10
            r5 = r12
            r7 = r14
            r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.p0.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
        if (this.f85436c.get() <= 0 || !(obj instanceof e0)) {
            ((SpanWatcher) this.f85435b).onSpanRemoved(spannable, obj, i10, i11);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ((TextWatcher) this.f85435b).onTextChanged(charSequence, i10, i11, i12);
    }
}
