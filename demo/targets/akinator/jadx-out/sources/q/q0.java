package q;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends n3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f82207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f82208d;

    public q0(v0 v0Var, int i10, int i11, WeakReference weakReference) {
        this.f82208d = v0Var;
        this.f82205a = i10;
        this.f82206b = i11;
        this.f82207c = weakReference;
    }

    @Override // n3.n
    public void onFontRetrieved(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f82205a) != -1) {
            typeface = u0.a(typeface, i10, (this.f82206b & 2) != 0);
        }
        v0 v0Var = this.f82208d;
        if (v0Var.f82282m) {
            v0Var.f82281l = typeface;
            TextView textView = (TextView) this.f82207c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new r0(textView, typeface, v0Var.f82279j));
                } else {
                    textView.setTypeface(typeface, v0Var.f82279j);
                }
            }
        }
    }

    @Override // n3.n
    public void onFontRetrievalFailed(int i10) {
    }
}
