package dh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f52281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52282c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f52283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f52284e;

    public s(u uVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f52284e = uVar;
        this.f52280a = i10;
        this.f52281b = textView;
        this.f52282c = i11;
        this.f52283d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i10 = this.f52280a;
        u uVar = this.f52284e;
        uVar.f52299n = i10;
        uVar.f52297l = null;
        TextView textView = this.f52281b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f52282c == 1 && (appCompatTextView = uVar.f52303r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f52283d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        TextView textView = this.f52283d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
