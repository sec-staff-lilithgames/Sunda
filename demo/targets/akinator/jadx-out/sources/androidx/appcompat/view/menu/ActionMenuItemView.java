package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import p.b0;
import p.e0;
import p.l;
import p.q;
import q.n;
import q.y1;
import q.y3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements b0, View.OnClickListener, n {

    /* renamed from: b, reason: collision with root package name */
    public q f4901b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f4902c;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4903e;

    /* renamed from: f, reason: collision with root package name */
    public l f4904f;

    /* renamed from: g, reason: collision with root package name */
    public a f4905g;

    /* renamed from: h, reason: collision with root package name */
    public b f4906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4907i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4908j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4909k;

    /* renamed from: l, reason: collision with root package name */
    public int f4910l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4911m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends y1 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // q.y1
        public e0 getPopup() {
            b bVar = ActionMenuItemView.this.f4906h;
            if (bVar != null) {
                return bVar.getPopup();
            }
            return null;
        }

        @Override // q.y1
        public final boolean onForwardingStarted() {
            e0 popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            l lVar = actionMenuItemView.f4904f;
            return lVar != null && lVar.invokeItem(actionMenuItemView.f4901b) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public abstract e0 getPopup();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public final boolean a() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void b() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f4902c);
        if (this.f4903e != null && (!this.f4901b.showsTextAsAction() || (!this.f4907i && !this.f4908j))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f4902c : null);
        CharSequence contentDescription = this.f4901b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f4901b.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f4901b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            y3.setTooltipText(this, z12 ? null : this.f4901b.getTitle());
        } else {
            y3.setTooltipText(this, tooltipText);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p.b0
    public q getItemData() {
        return this.f4901b;
    }

    public boolean hasText() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.b0
    public void initialize(q qVar, int i10) {
        this.f4901b = qVar;
        setIcon(qVar.getIcon());
        setTitle(prefersCondensedTitle() ? qVar.getTitleCondensed() : qVar.getTitle());
        setId(qVar.getItemId());
        setVisibility(qVar.isVisible() ? 0 : 8);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f4905g == null) {
            this.f4905g = new a();
        }
    }

    @Override // q.n
    public boolean needsDividerAfter() {
        return hasText();
    }

    @Override // q.n
    public boolean needsDividerBefore() {
        return hasText() && this.f4901b.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        l lVar = this.f4904f;
        if (lVar != null) {
            lVar.invokeItem(this.f4901b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4907i = a();
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zHasText = hasText();
        if (zHasText && (i12 = this.f4910l) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f4909k;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zHasText || this.f4903e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4903e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f4901b.hasSubMenu() && (aVar = this.f4905g) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // p.b0
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f4908j != z10) {
            this.f4908j = z10;
            q qVar = this.f4901b;
            if (qVar != null) {
                qVar.actionFormatChanged();
            }
        }
    }

    @Override // p.b0
    public void setIcon(Drawable drawable) {
        this.f4903e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f4911m;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        b();
    }

    public void setItemInvoker(l lVar) {
        this.f4904f = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f4910l = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f4906h = bVar;
    }

    @Override // p.b0
    public void setTitle(CharSequence charSequence) {
        this.f4902c = charSequence;
        b();
    }

    @Override // p.b0
    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f4907i = a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f69979c, i10, 0);
        this.f4909k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4911m = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4910l = -1;
        setSaveEnabled(false);
    }

    @Override // p.b0
    public void setCheckable(boolean z10) {
    }

    @Override // p.b0
    public void setChecked(boolean z10) {
    }

    @Override // p.b0
    public void setShortcut(boolean z10, char c10) {
    }
}
