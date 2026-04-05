package yf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e extends jh.i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f94388c;

    public /* synthetic */ e(int i10) {
        this.f94388c = i10;
    }

    @Override // jh.i
    public final int F(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i10;
        switch (this.f94388c) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i10 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // jh.i
    public final int G() {
        switch (this.f94388c) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // jh.i
    public final ViewPropertyAnimator H(int i10, View view) {
        switch (this.f94388c) {
            case 0:
                return view.animate().translationY(i10);
            case 1:
                return view.animate().translationX(-i10);
            default:
                return view.animate().translationX(i10);
        }
    }

    @Override // jh.i
    public final void M(View view, int i10, int i11) {
        switch (this.f94388c) {
            case 0:
                view.setTranslationY(i10 + i11);
                break;
            case 1:
                view.setTranslationX(i10 - i11);
                break;
            default:
                view.setTranslationX(i10 + i11);
                break;
        }
    }

    @Override // jh.i
    public final void O(int i10, View view) {
        switch (this.f94388c) {
            case 0:
                view.setTranslationY(i10);
                break;
            case 1:
                view.setTranslationX(-i10);
                break;
            default:
                view.setTranslationX(i10);
                break;
        }
    }
}
