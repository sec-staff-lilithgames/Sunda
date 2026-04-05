package s4;

import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    public final Class f85437b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f85438c;

    public q0(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f85438c = new ArrayList();
        w3.i.checkNotNull(cls, "watcherClass cannot be null");
        this.f85437b = cls;
    }

    public static q0 create(Class<?> cls, CharSequence charSequence) {
        return new q0(cls, charSequence);
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f85438c;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p0) arrayList.get(i10)).f85436c.incrementAndGet();
            i10++;
        }
    }

    public final p0 b(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f85438c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            p0 p0Var = (p0) arrayList.get(i10);
            if (p0Var.f85435b == obj) {
                return p0Var;
            }
            i10++;
        }
    }

    public void beginBatchEdit() {
        a();
    }

    public final boolean c(Object obj) {
        if (obj != null) {
            return this.f85437b == obj.getClass();
        }
        return false;
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f85438c;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p0) arrayList.get(i10)).f85436c.decrementAndGet();
            i10++;
        }
    }

    public void endBatchEdit() {
        d();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f85438c;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p0) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
            i10++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        p0 p0VarB;
        if (c(obj) && (p0VarB = b(obj)) != null) {
            obj = p0VarB;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        p0 p0VarB;
        if (c(obj) && (p0VarB = b(obj)) != null) {
            obj = p0VarB;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        p0 p0VarB;
        if (c(obj) && (p0VarB = b(obj)) != null) {
            obj = p0VarB;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (this.f85437b != cls) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        p0[] p0VarArr = (p0[]) super.getSpans(i10, i11, p0.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, p0VarArr.length));
        for (int i12 = 0; i12 < p0VarArr.length; i12++) {
            tArr[i12] = p0VarArr[i12].f85435b;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || this.f85437b == cls) {
            cls = p0.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        p0 p0VarB;
        if (c(obj)) {
            p0VarB = b(obj);
            if (p0VarB != null) {
                obj = p0VarB;
            }
        } else {
            p0VarB = null;
        }
        super.removeSpan(obj);
        if (p0VarB != null) {
            this.f85438c.remove(p0VarB);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (c(obj)) {
            p0 p0Var = new p0(obj);
            this.f85438c.add(p0Var);
            obj = p0Var;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return new q0(this.f85437b, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        d();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public q0(Class cls, q0 q0Var, int i10, int i11) {
        super(q0Var, i10, i11);
        this.f85438c = new ArrayList();
        w3.i.checkNotNull(cls, "watcherClass cannot be null");
        this.f85437b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        d();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
