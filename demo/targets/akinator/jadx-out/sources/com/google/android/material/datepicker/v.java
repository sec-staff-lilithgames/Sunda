package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import j1.o2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import qg.t0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class v<S> extends androidx.fragment.app.w {
    public boolean A;
    public CharSequence B;
    public CharSequence C;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f29211b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f29212c = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f29213e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f29214f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f29215g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f29216h;

    /* renamed from: i, reason: collision with root package name */
    public CalendarConstraints f29217i;

    /* renamed from: j, reason: collision with root package name */
    public DayViewDecorator f29218j;

    /* renamed from: k, reason: collision with root package name */
    public s f29219k;

    /* renamed from: l, reason: collision with root package name */
    public int f29220l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f29221m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29222n;

    /* renamed from: o, reason: collision with root package name */
    public int f29223o;

    /* renamed from: p, reason: collision with root package name */
    public int f29224p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f29225q;

    /* renamed from: r, reason: collision with root package name */
    public int f29226r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f29227s;

    /* renamed from: t, reason: collision with root package name */
    public int f29228t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f29229u;

    /* renamed from: v, reason: collision with root package name */
    public int f29230v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f29231w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f29232x;

    /* renamed from: y, reason: collision with root package name */
    public CheckableImageButton f29233y;

    /* renamed from: z, reason: collision with root package name */
    public yg.j f29234z;

    public static int c(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(j0.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i10 = month.f29149f;
        return o2.b(i10, 1, dimensionPixelOffset2, (dimensionPixelSize * i10) + (dimensionPixelOffset * 2));
    }

    public static boolean d(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ug.c.resolveOrThrow(context, R.attr.materialCalendarStyle, s.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public static long thisMonthInUtcMilliseconds() {
        return new Month(j0.b()).f29151h;
    }

    public static long todayInUtcMilliseconds() {
        return j0.b().getTimeInMillis();
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f29213e.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f29214f.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f29212c.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(w wVar) {
        return this.f29211b.add(wVar);
    }

    public final void b() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    public void clearOnCancelListeners() {
        this.f29213e.clear();
    }

    public void clearOnDismissListeners() {
        this.f29214f.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f29212c.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f29211b.clear();
    }

    public String getHeaderText() {
        b();
        getContext();
        throw null;
    }

    public int getInputMode() {
        return this.f29223o;
    }

    public final S getSelection() {
        b();
        throw null;
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f29213e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f29215g = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f29217i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f29218j = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f29220l = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f29221m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f29223o = bundle.getInt("INPUT_MODE_KEY");
        this.f29224p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f29225q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f29226r = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f29227s = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f29228t = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f29229u = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f29230v = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f29231w = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f29221m;
        if (text == null) {
            text = requireContext().getResources().getText(this.f29220l);
        }
        this.B = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.C = text;
    }

    @Override // androidx.fragment.app.w
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i10 = this.f29215g;
        if (i10 == 0) {
            b();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i10);
        Context context = dialog.getContext();
        this.f29222n = d(context, android.R.attr.windowFullscreen);
        this.f29234z = new yg.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, uf.a.f88474v, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f29234z.initializeElevationOverlay(context);
        this.f29234z.setFillColor(ColorStateList.valueOf(color));
        this.f29234z.setElevation(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f29222n ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f29218j;
        if (dayViewDecorator != null) {
            dayViewDecorator.initialize(context);
        }
        if (this.f29222n) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(c(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(c(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f29233y = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f29232x = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f29233y.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f29233y;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, l.a.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], l.a.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f29233y.setChecked(this.f29223o != 0);
        z1.setAccessibilityDelegate(this.f29233y, null);
        CheckableImageButton checkableImageButton2 = this.f29233y;
        this.f29233y.setContentDescription(this.f29223o == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f29233y.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 6));
        b();
        throw null;
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f29214f.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public void onNegativeButtonClick(View view) {
        Iterator it = this.f29212c.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dismiss();
    }

    public void onPositiveButtonClick(View view) {
        Iterator it = this.f29211b.iterator();
        if (!it.hasNext()) {
            dismiss();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            getSelection();
            throw null;
        }
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f29215g);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints = this.f29217i;
        CalendarConstraints.a aVar = new CalendarConstraints.a();
        aVar.f29139a = CalendarConstraints.a.f29137f;
        aVar.f29140b = CalendarConstraints.a.f29138g;
        aVar.f29143e = DateValidatorPointForward.from(Long.MIN_VALUE);
        aVar.f29139a = calendarConstraints.f29130b.f29151h;
        aVar.f29140b = calendarConstraints.f29131c.f29151h;
        aVar.f29141c = Long.valueOf(calendarConstraints.f29133f.f29151h);
        aVar.f29142d = calendarConstraints.f29134g;
        aVar.f29143e = calendarConstraints.f29132e;
        s sVar = this.f29219k;
        Month month = sVar != null ? sVar.f29195g : null;
        if (month != null) {
            aVar.setOpenAt(month.f29151h);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar.build());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f29218j);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f29220l);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f29221m);
        bundle.putInt("INPUT_MODE_KEY", this.f29223o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f29224p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f29225q);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f29226r);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f29227s);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f29228t);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f29229u);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f29230v);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f29231w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.fragment.app.Fragment, com.google.android.material.datepicker.y] */
    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f29222n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f29234z);
            if (!this.A) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                qg.j.applyEdgeToEdge(window, true, t0.getBackgroundColor(viewFindViewById), null);
                z1.setOnApplyWindowInsetsListener(viewFindViewById, new u(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight()));
                this.A = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f29234z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new lg.a(requireDialog(), rect));
        }
        requireContext();
        int i10 = this.f29215g;
        if (i10 == 0) {
            b();
            throw null;
        }
        b();
        s sVarNewInstance = s.newInstance(null, i10, this.f29217i, this.f29218j);
        this.f29219k = sVarNewInstance;
        if (this.f29223o == 1) {
            b();
            CalendarConstraints calendarConstraints = this.f29217i;
            ?? yVar = new y();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i10);
            bundle.putParcelable("DATE_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
            yVar.setArguments(bundle);
            sVarNewInstance = yVar;
        }
        this.f29216h = sVarNewInstance;
        this.f29232x.setText((this.f29223o == 1 && getResources().getConfiguration().orientation == 2) ? this.C : this.B);
        getHeaderText();
        b();
        requireContext();
        throw null;
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public void onStop() {
        this.f29216h.f29174b.clear();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f29213e.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f29214f.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f29212c.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(w wVar) {
        return this.f29211b.remove(wVar);
    }
}
