package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.appcompat.app.i1;
import androidx.core.app.NotificationCompat;
import androidx.customview.view.AbsSavedState;
import com.digidust.elokence.akinator.freemium.R;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import q.a3;
import q.b3;
import q.c3;
import q.d3;
import q.e3;
import q.f3;
import q.n3;
import q.u2;
import q.v2;
import q.w2;
import q.x2;
import q.y2;
import q.y3;
import q.z2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements o.d {
    public static final i1 Q;
    public boolean A;
    public f4.c B;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public CharSequence I;
    public boolean J;
    public int K;
    public SearchableInfo L;
    public Bundle M;
    public final v2 N;
    public final w2 O;
    public final WeakHashMap P;

    /* renamed from: b, reason: collision with root package name */
    public final SearchAutoComplete f5051b;

    /* renamed from: c, reason: collision with root package name */
    public final View f5052c;

    /* renamed from: e, reason: collision with root package name */
    public final View f5053e;

    /* renamed from: f, reason: collision with root package name */
    public final View f5054f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f5055g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f5056h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f5057i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f5058j;

    /* renamed from: k, reason: collision with root package name */
    public final View f5059k;

    /* renamed from: l, reason: collision with root package name */
    public a f5060l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f5061m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f5062n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f5063o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f5064p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f5065q;

    /* renamed from: r, reason: collision with root package name */
    public final Drawable f5066r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5067s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5068t;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f5069u;

    /* renamed from: v, reason: collision with root package name */
    public final Intent f5070v;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f5071w;

    /* renamed from: x, reason: collision with root package name */
    public View.OnFocusChangeListener f5072x;

    /* renamed from: y, reason: collision with root package name */
    public View.OnClickListener f5073y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5074z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new o();

        /* renamed from: e, reason: collision with root package name */
        public boolean f5075e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5075e = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" isIconified=");
            return a.b.q(sb2, this.f5075e, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f5075e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SearchAutoComplete extends q.r {

        /* renamed from: g, reason: collision with root package name */
        public int f5076g;

        /* renamed from: h, reason: collision with root package name */
        public SearchView f5077h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f5078i;

        /* renamed from: j, reason: collision with root package name */
        public final p f5079j;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (i10 >= 600) {
                return PsExtractor.AUDIO_STREAM;
            }
            if (i10 < 640 || i11 < 480) {
                return 160;
            }
            return PsExtractor.AUDIO_STREAM;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                n.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            i1 i1Var = SearchView.Q;
            i1Var.getClass();
            i1.b();
            Method method = (Method) i1Var.f4756c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f5076g <= 0 || super.enoughToFilter();
        }

        @Override // q.r, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5078i) {
                p pVar = this.f5079j;
                removeCallbacks(pVar);
                post(pVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f5077h;
            searchView.n(searchView.isIconified());
            searchView.post(searchView.N);
            if (searchView.f5051b.hasFocus()) {
                searchView.c();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5077h.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f5077h.hasFocus() && getVisibility() == 0) {
                this.f5078i = true;
                Context context = getContext();
                i1 i1Var = SearchView.Q;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            p pVar = this.f5079j;
            if (!z10) {
                this.f5078i = false;
                removeCallbacks(pVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f5078i = true;
                    return;
                }
                this.f5078i = false;
                removeCallbacks(pVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f5077h = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f5076g = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f5079j = new p(this);
            this.f5076g = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f5080a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f5081b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f5082c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f5083d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5084e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5085f;

        public a(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f5084e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f5081b = new Rect();
            this.f5083d = new Rect();
            this.f5082c = new Rect();
            setBounds(rect, rect2);
            this.f5080a = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f5085f;
                    if (z11 && !this.f5083d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f5085f;
                        this.f5085f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f5081b.contains(x10, y10)) {
                this.f5085f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            Rect rect = this.f5082c;
            View view = this.f5080a;
            if (!z10 || rect.contains(x10, y10)) {
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }

        public void setBounds(Rect rect, Rect rect2) {
            this.f5081b.set(rect);
            Rect rect3 = this.f5083d;
            rect3.set(rect);
            int i10 = this.f5084e;
            rect3.inset(-i10, -i10);
            this.f5082c.set(rect2);
        }
    }

    static {
        i1 i1Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            i1 i1Var2 = new i1();
            i1Var2.f4754a = null;
            i1Var2.f4755b = null;
            i1Var2.f4756c = null;
            i1.b();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                i1Var2.f4754a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                i1Var2.f4755b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                i1Var2.f4756c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            i1Var = i1Var2;
        }
        Q = i1Var;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    public final Intent a(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.I);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.M;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.L.getSearchActivity());
        return intent;
    }

    public final Intent b(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.M;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void c() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f5051b;
        if (i10 >= 29) {
            n.a(searchAutoComplete);
            return;
        }
        i1 i1Var = Q;
        i1Var.getClass();
        i1.b();
        Method method = (Method) i1Var.f4754a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        i1Var.getClass();
        i1.b();
        Method method2 = (Method) i1Var.f4755b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.F = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f5051b;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.F = false;
    }

    public final void d() {
        SearchAutoComplete searchAutoComplete = this.f5051b;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f5074z) {
            clearFocus();
            n(true);
        }
    }

    public final void e(int i10) {
        int position;
        String columnString;
        Cursor cursor = this.B.getCursor();
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentA = null;
            try {
                String columnString2 = f3.getColumnString(cursor, "suggest_intent_action");
                if (columnString2 == null) {
                    columnString2 = this.L.getSuggestIntentAction();
                }
                if (columnString2 == null) {
                    columnString2 = "android.intent.action.SEARCH";
                }
                String columnString3 = f3.getColumnString(cursor, "suggest_intent_data");
                if (columnString3 == null) {
                    columnString3 = this.L.getSuggestIntentData();
                }
                if (columnString3 != null && (columnString = f3.getColumnString(cursor, "suggest_intent_data_id")) != null) {
                    columnString3 = columnString3 + "/" + Uri.encode(columnString);
                }
                intentA = a(columnString3 == null ? null : Uri.parse(columnString3), columnString2, f3.getColumnString(cursor, "suggest_intent_extra_data"), f3.getColumnString(cursor, "suggest_intent_query"));
            } catch (RuntimeException e10) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            }
            if (intentA != null) {
                try {
                    getContext().startActivity(intentA);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intentA, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f5051b;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void f(int i10) {
        Editable text = this.f5051b.getText();
        Cursor cursor = this.B.getCursor();
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.B.convertToString(cursor);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    public final void g(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public int getImeOptions() {
        return this.f5051b.getImeOptions();
    }

    public int getInputType() {
        return this.f5051b.getInputType();
    }

    public int getMaxWidth() {
        return this.G;
    }

    public CharSequence getQuery() {
        return this.f5051b.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.L;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f5071w : getContext().getText(this.L.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f5068t;
    }

    public int getSuggestionRowLayout() {
        return this.f5067s;
    }

    public f4.c getSuggestionsAdapter() {
        return this.B;
    }

    public final void h() {
        SearchAutoComplete searchAutoComplete = this.f5051b;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.L != null) {
            getContext().startActivity(a(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void i() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f5051b.getText());
        int i10 = (!zIsEmpty || (this.f5074z && !this.J)) ? 0 : 8;
        ImageView imageView = this.f5057i;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public boolean isIconfiedByDefault() {
        return this.f5074z;
    }

    public boolean isIconified() {
        return this.A;
    }

    public boolean isQueryRefinementEnabled() {
        return this.E;
    }

    public boolean isSubmitButtonEnabled() {
        return this.C;
    }

    public final void j() {
        int[] iArr = this.f5051b.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f5053e.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5054f.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void k() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.f5074z;
        SearchAutoComplete searchAutoComplete = this.f5051b;
        if (z10 && (drawable = this.f5066r) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void l() {
        this.f5054f.setVisibility(((this.C || this.H) && !isIconified() && (this.f5056h.getVisibility() == 0 || this.f5058j.getVisibility() == 0)) ? 0 : 8);
    }

    public final void m(boolean z10) {
        boolean z11 = this.C;
        this.f5056h.setVisibility((!z11 || !(z11 || this.H) || isIconified() || !hasFocus() || (!z10 && this.H)) ? 8 : 0);
    }

    public final void n(boolean z10) {
        this.A = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f5051b.getText());
        this.f5055g.setVisibility(i11);
        m(!zIsEmpty);
        this.f5052c.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.f5065q;
        if (imageView.getDrawable() != null && !this.f5074z) {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        i();
        o(zIsEmpty);
        l();
    }

    public final void o(boolean z10) {
        int i10 = 8;
        if (this.H && !isIconified() && z10) {
            this.f5056h.setVisibility(8);
            i10 = 0;
        }
        this.f5058j.setVisibility(i10);
    }

    @Override // o.d
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        n(true);
        this.f5051b.setImeOptions(this.K);
        this.J = false;
    }

    @Override // o.d
    public void onActionViewExpanded() {
        if (this.J) {
            return;
        }
        this.J = true;
        SearchAutoComplete searchAutoComplete = this.f5051b;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.K = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.N);
        post(this.O);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f5051b;
            int[] iArr = this.f5063o;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f5064p;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.f5061m;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.f5062n;
            rect2.set(i16, 0, i17, i18);
            a aVar = this.f5060l;
            if (aVar != null) {
                aVar.setBounds(rect2, rect);
                return;
            }
            a aVar2 = new a(rect2, rect, searchAutoComplete);
            this.f5060l = aVar2;
            setTouchDelegate(aVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (isIconified()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.G;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.G;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.G) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        n(savedState.f5075e);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5075e = isIconified();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.F || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f5051b.requestFocus(i10, rect);
        if (zRequestFocus) {
            n(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.M = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            d();
            return;
        }
        n(false);
        SearchAutoComplete searchAutoComplete = this.f5051b;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f5073y;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f5074z == z10) {
            return;
        }
        this.f5074z = z10;
        n(z10);
        k();
    }

    public void setImeOptions(int i10) {
        this.f5051b.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f5051b.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.G = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f5072x = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f5073y = onClickListener;
    }

    public void setQuery(CharSequence charSequence, boolean z10) {
        SearchAutoComplete searchAutoComplete = this.f5051b;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.I = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        h();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.D = charSequence;
        k();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.E = z10;
        f4.c cVar = this.B;
        if (cVar instanceof f3) {
            ((f3) cVar).setQueryRefinement(z10 ? 2 : 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.L = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f5051b
            if (r7 == 0) goto L66
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.L
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.L
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.L
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            f4.c r7 = r6.B
            if (r7 == 0) goto L3b
            r7.changeCursor(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.L
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L63
            q.f3 r7 = new q.f3
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.L
            java.util.WeakHashMap r5 = r6.P
            r7.<init>(r3, r6, r4, r5)
            r6.B = r7
            r2.setAdapter(r7)
            f4.c r7 = r6.B
            q.f3 r7 = (q.f3) r7
            boolean r3 = r6.E
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.setQueryRefinement(r3)
        L63:
            r6.k()
        L66:
            android.app.SearchableInfo r7 = r6.L
            r3 = 0
            if (r7 == 0) goto L99
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L99
            android.app.SearchableInfo r7 = r6.L
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7c
            android.content.Intent r0 = r6.f5069u
            goto L86
        L7c:
            android.app.SearchableInfo r7 = r6.L
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L86
            android.content.Intent r0 = r6.f5070v
        L86:
            if (r0 == 0) goto L99
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L99
            goto L9a
        L99:
            r1 = r3
        L9a:
            r6.H = r1
            if (r1 == 0) goto La3
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La3:
            boolean r7 = r6.isIconified()
            r6.n(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.C = z10;
        n(isIconified());
    }

    public void setSuggestionsAdapter(f4.c cVar) {
        this.B = cVar;
        this.f5051b.setAdapter(cVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5061m = new Rect();
        this.f5062n = new Rect();
        this.f5063o = new int[2];
        this.f5064p = new int[2];
        this.N = new v2(this);
        this.O = new w2(this);
        this.P = new WeakHashMap();
        l lVar = new l(this);
        m mVar = new m(this);
        z2 z2Var = new z2(this);
        a3 a3Var = new a3(this);
        b3 b3Var = new b3(this);
        u2 u2Var = new u2(this);
        int[] iArr = k.a.f69998v;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        z1.saveAttributeDataForStyleable(this, context, iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        LayoutInflater.from(context).inflate(n3VarObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f5051b = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f5052c = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f5053e = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f5054f = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f5055g = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f5056h = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f5057i = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f5058j = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f5065q = imageView5;
        z1.setBackground(viewFindViewById, n3VarObtainStyledAttributes.getDrawable(20));
        z1.setBackground(viewFindViewById2, n3VarObtainStyledAttributes.getDrawable(25));
        imageView.setImageDrawable(n3VarObtainStyledAttributes.getDrawable(23));
        imageView2.setImageDrawable(n3VarObtainStyledAttributes.getDrawable(15));
        imageView3.setImageDrawable(n3VarObtainStyledAttributes.getDrawable(12));
        imageView4.setImageDrawable(n3VarObtainStyledAttributes.getDrawable(28));
        imageView5.setImageDrawable(n3VarObtainStyledAttributes.getDrawable(23));
        this.f5066r = n3VarObtainStyledAttributes.getDrawable(22);
        y3.setTooltipText(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f5067s = n3VarObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f5068t = n3VarObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(lVar);
        imageView3.setOnClickListener(lVar);
        imageView2.setOnClickListener(lVar);
        imageView4.setOnClickListener(lVar);
        searchAutoComplete.setOnClickListener(lVar);
        searchAutoComplete.addTextChangedListener(u2Var);
        searchAutoComplete.setOnEditorActionListener(z2Var);
        searchAutoComplete.setOnItemClickListener(a3Var);
        searchAutoComplete.setOnItemSelectedListener(b3Var);
        searchAutoComplete.setOnKeyListener(mVar);
        searchAutoComplete.setOnFocusChangeListener(new x2(this));
        setIconifiedByDefault(n3VarObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = n3VarObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f5071w = n3VarObtainStyledAttributes.getText(14);
        this.D = n3VarObtainStyledAttributes.getText(21);
        int i11 = n3VarObtainStyledAttributes.getInt(6, -1);
        if (i11 != -1) {
            setImeOptions(i11);
        }
        int i12 = n3VarObtainStyledAttributes.getInt(5, -1);
        if (i12 != -1) {
            setInputType(i12);
        }
        setFocusable(n3VarObtainStyledAttributes.getBoolean(1, true));
        n3VarObtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f5069u = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f5070v = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f5059k = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new y2(this));
        }
        n(this.f5074z);
        k();
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f5051b;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void setOnCloseListener(c3 c3Var) {
    }

    public void setOnQueryTextListener(d3 d3Var) {
    }

    public void setOnSuggestionListener(e3 e3Var) {
    }
}
