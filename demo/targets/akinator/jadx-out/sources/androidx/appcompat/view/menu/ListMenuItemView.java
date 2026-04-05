package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import k.a;
import p.b0;
import p.m;
import p.q;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements b0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b, reason: collision with root package name */
    public q f4915b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f4916c;

    /* renamed from: e, reason: collision with root package name */
    public RadioButton f4917e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f4918f;

    /* renamed from: g, reason: collision with root package name */
    public CheckBox f4919g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f4920h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f4921i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f4922j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f4923k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f4924l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4925m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f4926n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4927o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f4928p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4929q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f4930r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4931s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f4930r == null) {
            this.f4930r = LayoutInflater.from(getContext());
        }
        return this.f4930r;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f4921i;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4922j;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4922j.getLayoutParams();
        rect.top = this.f4922j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p.b0
    public q getItemData() {
        return this.f4915b;
    }

    @Override // p.b0
    public void initialize(q qVar, int i10) {
        this.f4915b = qVar;
        boolean zIsVisible = qVar.isVisible();
        m mVar = qVar.f80099n;
        boolean z10 = false;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(prefersCondensedTitle() ? qVar.getTitleCondensed() : qVar.getTitle());
        setCheckable(qVar.isCheckable());
        if (mVar.isShortcutsVisible()) {
            if ((mVar.isQwertyMode() ? qVar.f80095j : qVar.f80093h) != 0) {
                z10 = true;
            }
        }
        setShortcut(z10, mVar.isQwertyMode() ? qVar.f80095j : qVar.f80093h);
        setIcon(qVar.getIcon());
        setEnabled(qVar.isEnabled());
        setSubMenuArrowVisible(qVar.hasSubMenu());
        setContentDescription(qVar.getContentDescription());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4924l);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4918f = textView;
        int i10 = this.f4925m;
        if (i10 != -1) {
            textView.setTextAppearance(this.f4926n, i10);
        }
        this.f4920h = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4921i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4928p);
        }
        this.f4922j = (ImageView) findViewById(R.id.group_divider);
        this.f4923k = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f4916c != null && this.f4927o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4916c.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // p.b0
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // p.b0
    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f4917e == null && this.f4919g == null) {
            return;
        }
        if (this.f4915b.isExclusiveCheckable()) {
            if (this.f4917e == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4917e = radioButton;
                LinearLayout linearLayout = this.f4923k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4917e;
            view = this.f4919g;
        } else {
            if (this.f4919g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4919g = checkBox;
                LinearLayout linearLayout2 = this.f4923k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4919g;
            view = this.f4917e;
        }
        if (z10) {
            compoundButton.setChecked(this.f4915b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4919g;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4917e;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    @Override // p.b0
    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f4915b.isExclusiveCheckable()) {
            if (this.f4917e == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4917e = radioButton;
                LinearLayout linearLayout = this.f4923k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4917e;
        } else {
            if (this.f4919g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4919g = checkBox;
                LinearLayout linearLayout2 = this.f4923k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4919g;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f4931s = z10;
        this.f4927o = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f4922j;
        if (imageView != null) {
            imageView.setVisibility((this.f4929q || !z10) ? 8 : 0);
        }
    }

    @Override // p.b0
    public void setIcon(Drawable drawable) {
        boolean z10 = this.f4915b.shouldShowIcon() || this.f4931s;
        if (z10 || this.f4927o) {
            ImageView imageView = this.f4916c;
            if (imageView == null && drawable == null && !this.f4927o) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4916c = imageView2;
                LinearLayout linearLayout = this.f4923k;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4927o) {
                this.f4916c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4916c;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4916c.getVisibility() != 0) {
                this.f4916c.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    @Override // p.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setShortcut(boolean r9, char r10) {
        /*
            r8 = this;
            r10 = 1
            r0 = 8
            if (r9 == 0) goto L23
            p.q r9 = r8.f4915b
            p.m r1 = r9.f80099n
            boolean r2 = r1.isShortcutsVisible()
            r3 = 0
            if (r2 == 0) goto L1f
            boolean r1 = r1.isQwertyMode()
            if (r1 == 0) goto L19
            char r9 = r9.f80095j
            goto L1b
        L19:
            char r9 = r9.f80093h
        L1b:
            if (r9 == 0) goto L1f
            r9 = r10
            goto L20
        L1f:
            r9 = r3
        L20:
            if (r9 == 0) goto L23
            goto L24
        L23:
            r3 = r0
        L24:
            if (r3 != 0) goto Le4
            android.widget.TextView r9 = r8.f4920h
            p.q r1 = r8.f4915b
            p.m r2 = r1.f80099n
            boolean r4 = r2.isQwertyMode()
            if (r4 == 0) goto L35
            char r4 = r1.f80095j
            goto L37
        L35:
            char r4 = r1.f80093h
        L37:
            if (r4 != 0) goto L3d
            java.lang.String r10 = ""
            goto Le1
        L3d:
            android.content.Context r5 = r2.getContext()
            android.content.res.Resources r5 = r5.getResources()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r7 = r2.getContext()
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            boolean r7 = r7.hasPermanentMenuKey()
            if (r7 == 0) goto L62
            r7 = 2132017170(0x7f140012, float:1.967261E38)
            java.lang.String r7 = r5.getString(r7)
            r6.append(r7)
        L62:
            boolean r2 = r2.isQwertyMode()
            if (r2 == 0) goto L6b
            int r1 = r1.f80096k
            goto L6d
        L6b:
            int r1 = r1.f80094i
        L6d:
            r2 = 2132017166(0x7f14000e, float:1.9672603E38)
            java.lang.String r2 = r5.getString(r2)
            r7 = 65536(0x10000, float:9.1835E-41)
            p.q.a(r1, r7, r2, r6)
            r2 = 2132017162(0x7f14000a, float:1.9672595E38)
            java.lang.String r2 = r5.getString(r2)
            r7 = 4096(0x1000, float:5.74E-42)
            p.q.a(r1, r7, r2, r6)
            r2 = 2132017161(0x7f140009, float:1.9672593E38)
            java.lang.String r2 = r5.getString(r2)
            r7 = 2
            p.q.a(r1, r7, r2, r6)
            r2 = 2132017167(0x7f14000f, float:1.9672605E38)
            java.lang.String r2 = r5.getString(r2)
            p.q.a(r1, r10, r2, r6)
            r10 = 2132017169(0x7f140011, float:1.9672609E38)
            java.lang.String r10 = r5.getString(r10)
            r2 = 4
            p.q.a(r1, r2, r10, r6)
            r10 = 2132017165(0x7f14000d, float:1.96726E38)
            java.lang.String r10 = r5.getString(r10)
            p.q.a(r1, r0, r10, r6)
            if (r4 == r0) goto Ld3
            r10 = 10
            if (r4 == r10) goto Lc8
            r10 = 32
            if (r4 == r10) goto Lbd
            r6.append(r4)
            goto Ldd
        Lbd:
            r10 = 2132017168(0x7f140010, float:1.9672607E38)
            java.lang.String r10 = r5.getString(r10)
            r6.append(r10)
            goto Ldd
        Lc8:
            r10 = 2132017164(0x7f14000c, float:1.9672599E38)
            java.lang.String r10 = r5.getString(r10)
            r6.append(r10)
            goto Ldd
        Ld3:
            r10 = 2132017163(0x7f14000b, float:1.9672597E38)
            java.lang.String r10 = r5.getString(r10)
            r6.append(r10)
        Ldd:
            java.lang.String r10 = r6.toString()
        Le1:
            r9.setText(r10)
        Le4:
            android.widget.TextView r9 = r8.f4920h
            int r9 = r9.getVisibility()
            if (r9 == r3) goto Lf1
            android.widget.TextView r9 = r8.f4920h
            r9.setVisibility(r3)
        Lf1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setShortcut(boolean, char):void");
    }

    @Override // p.b0
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4918f.getVisibility() != 8) {
                this.f4918f.setVisibility(8);
            }
        } else {
            this.f4918f.setText(charSequence);
            if (this.f4918f.getVisibility() != 0) {
                this.f4918f.setVisibility(0);
            }
        }
    }

    @Override // p.b0
    public boolean showsIcon() {
        return this.f4931s;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(getContext(), attributeSet, a.f69995s, i10, 0);
        this.f4924l = n3VarObtainStyledAttributes.getDrawable(5);
        this.f4925m = n3VarObtainStyledAttributes.getResourceId(1, -1);
        this.f4927o = n3VarObtainStyledAttributes.getBoolean(7, false);
        this.f4926n = context;
        this.f4928p = n3VarObtainStyledAttributes.getDrawable(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f4929q = typedArrayObtainStyledAttributes.hasValue(0);
        n3VarObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }
}
