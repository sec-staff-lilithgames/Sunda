package com.digidust.elokence.akinator.graphic.spinner;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import com.applovin.sdk.AppLovinEventTypes;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner;
import ia.a;
import ia.d;
import ia.e;
import java.util.List;
import y4.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AkinatorSpinner extends AppCompatTextView {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f21785n = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f21786b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f21787c;

    /* renamed from: e, reason: collision with root package name */
    public PopupWindow f21788e;

    /* renamed from: f, reason: collision with root package name */
    public ListView f21789f;

    /* renamed from: g, reason: collision with root package name */
    public d f21790g;

    /* renamed from: h, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f21791h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21792i;

    /* renamed from: j, reason: collision with root package name */
    public int f21793j;

    /* renamed from: k, reason: collision with root package name */
    public int f21794k;

    /* renamed from: l, reason: collision with root package name */
    public int f21795l;

    /* renamed from: m, reason: collision with root package name */
    public final e f21796m;

    public AkinatorSpinner(Context context) throws Resources.NotFoundException {
        super(context);
        this.f21796m = new e();
        b(context);
    }

    private void setAdapterInternal(d dVar) {
        this.f21786b = 0;
        this.f21789f.setAdapter((ListAdapter) dVar);
        setText((String) dVar.f59443e.get(this.f21786b));
    }

    private void setArrowDrawableOrHide(Drawable drawable) {
        if (this.f21792i || drawable == null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    public final void a(boolean z10) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f21787c, AppLovinEventTypes.USER_COMPLETED_LEVEL, z10 ? 0 : 10000, z10 ? 10000 : 0);
        objectAnimatorOfInt.setInterpolator(new c());
        objectAnimatorOfInt.start();
    }

    public void attachDataSource(List<String> list) {
        d dVar = new d(list, this.f21793j, this.f21796m);
        this.f21790g = dVar;
        setAdapterInternal(dVar);
    }

    public final void b(Context context) throws Resources.NotFoundException {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.one_and_a_half_grid_unit);
        setGravity(8388627);
        setPadding(resources.getDimensionPixelSize(R.dimen.three_grid_unit), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setClickable(true);
        setBackgroundResource(R.drawable.spinner_rect);
        this.f21793j = -16777216;
        setTextColor(-16777216);
        setTypeface(AkApplication.getTypeFace());
        ListView listView = new ListView(context);
        this.f21789f = listView;
        listView.setId(getId());
        this.f21789f.setDivider(null);
        this.f21789f.setItemsCanFocus(true);
        this.f21789f.setVerticalScrollBarEnabled(false);
        this.f21789f.setHorizontalScrollBarEnabled(false);
        this.f21789f.setOnItemClickListener(new a(this, 0));
        PopupWindow popupWindow = new PopupWindow(context);
        this.f21788e = popupWindow;
        popupWindow.setContentView(this.f21789f);
        this.f21788e.setOutsideTouchable(true);
        this.f21788e.setFocusable(true);
        this.f21788e.setBackgroundDrawable(m3.a.getDrawable(context, R.drawable.spinner_rect));
        this.f21788e.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ia.b
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                AkinatorSpinner akinatorSpinner = this.f59439b;
                if (akinatorSpinner.f21792i) {
                    return;
                }
                akinatorSpinner.a(false);
            }
        });
        this.f21794k = -16777216;
        this.f21795l = R.drawable.arrow;
    }

    public void dismissDropDown() {
        if (!this.f21792i) {
            a(false);
        }
        this.f21788e.dismiss();
    }

    public int getSelectedIndex() {
        return this.f21786b;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f21789f.measure(i10, i11);
        this.f21788e.setWidth(View.MeasureSpec.getSize(i10));
        if (this.f21789f.getAdapter().getCount() > 5) {
            this.f21788e.setHeight(getMeasuredHeight() * 5);
            return;
        }
        this.f21788e.setHeight(this.f21789f.getAdapter().getCount() * getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = bundle.getInt("selected_index");
            this.f21786b = i10;
            d dVar = this.f21790g;
            if (dVar != null) {
                setText((String) dVar.f59443e.get(i10));
                this.f21790g.f59444f = this.f21786b;
            }
            if (bundle.getBoolean("is_popup_showing") && this.f21788e != null) {
                post(new com.unity3d.services.banners.view.a(this, 20));
            }
            this.f21792i = bundle.getBoolean("is_arrow_hidden", false);
            this.f21795l = bundle.getInt("arrow_drawable_res_id");
            parcelable = bundle.getParcelable("instance_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instance_state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f21786b);
        bundle.putBoolean("is_arrow_hidden", this.f21792i);
        bundle.putInt("arrow_drawable_res_id", this.f21795l);
        PopupWindow popupWindow = this.f21788e;
        if (popupWindow != null) {
            bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
        }
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getAction() == 1) {
            if (this.f21788e.isShowing()) {
                dismissDropDown();
            } else {
                showDropDown();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        int i11 = this.f21794k;
        Drawable drawable = m3.a.getDrawable(getContext(), this.f21795l);
        if (drawable != null) {
            drawable = p3.a.wrap(drawable);
            if (i11 != Integer.MAX_VALUE && i11 != 0) {
                p3.a.setTint(drawable, i11);
            }
        }
        this.f21787c = drawable;
        setArrowDrawableOrHide(drawable);
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f21791h = onItemSelectedListener;
    }

    public void setSelectedIndex(int i10) {
        d dVar = this.f21790g;
        if (dVar != null) {
            if (i10 < 0 || i10 > dVar.getCount()) {
                throw new IllegalArgumentException("Position must be lower than adapter count!");
            }
            d dVar2 = this.f21790g;
            dVar2.f59444f = i10;
            this.f21786b = i10;
            setText((String) dVar2.f59443e.get(i10));
            a(false);
        }
    }

    public void showDropDown() {
        if (!this.f21792i) {
            a(true);
        }
        this.f21788e.showAsDropDown(this);
    }

    public AkinatorSpinner(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f21796m = new e();
        b(context);
    }

    public AkinatorSpinner(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f21796m = new e();
        b(context);
    }
}
