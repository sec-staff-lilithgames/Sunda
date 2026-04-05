package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final boolean P;
    public final b R;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4661a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f4662b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f4663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4664d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4665e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4666f;

    /* renamed from: g, reason: collision with root package name */
    public RecycleListView f4667g;

    /* renamed from: h, reason: collision with root package name */
    public View f4668h;

    /* renamed from: i, reason: collision with root package name */
    public int f4669i;

    /* renamed from: j, reason: collision with root package name */
    public int f4670j;

    /* renamed from: k, reason: collision with root package name */
    public int f4671k;

    /* renamed from: l, reason: collision with root package name */
    public int f4672l;

    /* renamed from: m, reason: collision with root package name */
    public int f4673m;

    /* renamed from: o, reason: collision with root package name */
    public Button f4675o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4676p;

    /* renamed from: q, reason: collision with root package name */
    public Message f4677q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f4678r;

    /* renamed from: s, reason: collision with root package name */
    public Button f4679s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f4680t;

    /* renamed from: u, reason: collision with root package name */
    public Message f4681u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f4682v;

    /* renamed from: w, reason: collision with root package name */
    public Button f4683w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f4684x;

    /* renamed from: y, reason: collision with root package name */
    public Message f4685y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f4686z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4674n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final g S = new g(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class RecycleListView extends ListView {

        /* renamed from: b, reason: collision with root package name */
        public final int f4687b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4688c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f4687b, getPaddingRight(), z11 ? getPaddingBottom() : this.f4688c);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f69997u);
            this.f4688c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f4687b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
        public int A;
        public int B;
        public int C;
        public boolean[] E;
        public boolean F;
        public boolean G;
        public DialogInterface.OnMultiChoiceClickListener I;
        public Cursor J;
        public String K;
        public String L;
        public AdapterView.OnItemSelectedListener M;

        /* renamed from: a, reason: collision with root package name */
        public final Context f4689a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f4690b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f4692d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f4693e;

        /* renamed from: f, reason: collision with root package name */
        public View f4694f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f4695g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f4696h;

        /* renamed from: i, reason: collision with root package name */
        public Drawable f4697i;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f4698j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f4699k;

        /* renamed from: l, reason: collision with root package name */
        public Drawable f4700l;

        /* renamed from: m, reason: collision with root package name */
        public DialogInterface.OnClickListener f4701m;

        /* renamed from: n, reason: collision with root package name */
        public CharSequence f4702n;

        /* renamed from: o, reason: collision with root package name */
        public Drawable f4703o;

        /* renamed from: p, reason: collision with root package name */
        public DialogInterface.OnClickListener f4704p;

        /* renamed from: r, reason: collision with root package name */
        public DialogInterface.OnCancelListener f4706r;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnDismissListener f4707s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnKeyListener f4708t;

        /* renamed from: u, reason: collision with root package name */
        public CharSequence[] f4709u;

        /* renamed from: v, reason: collision with root package name */
        public ListAdapter f4710v;

        /* renamed from: w, reason: collision with root package name */
        public DialogInterface.OnClickListener f4711w;

        /* renamed from: x, reason: collision with root package name */
        public int f4712x;

        /* renamed from: y, reason: collision with root package name */
        public View f4713y;

        /* renamed from: z, reason: collision with root package name */
        public int f4714z;

        /* renamed from: c, reason: collision with root package name */
        public int f4691c = 0;
        public boolean D = false;
        public int H = -1;

        /* renamed from: q, reason: collision with root package name */
        public boolean f4705q = true;

        public a(Context context) {
            this.f4689a = context;
            this.f4690b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void apply(AlertController alertController) {
            AlertController alertController2;
            a aVar;
            AlertController alertController3;
            ListAdapter simpleCursorAdapter;
            View view = this.f4694f;
            if (view != null) {
                alertController.setCustomTitle(view);
            } else {
                CharSequence charSequence = this.f4693e;
                if (charSequence != null) {
                    alertController.setTitle(charSequence);
                }
                Drawable drawable = this.f4692d;
                if (drawable != null) {
                    alertController.setIcon(drawable);
                }
                int i10 = this.f4691c;
                if (i10 != 0) {
                    alertController.setIcon(i10);
                }
            }
            CharSequence charSequence2 = this.f4695g;
            if (charSequence2 != null) {
                alertController.setMessage(charSequence2);
            }
            CharSequence charSequence3 = this.f4696h;
            if (charSequence3 == null && this.f4697i == null) {
                alertController2 = alertController;
            } else {
                alertController.setButton(-1, charSequence3, this.f4698j, null, this.f4697i);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f4699k;
            if (charSequence4 != null || this.f4700l != null) {
                alertController2.setButton(-2, charSequence4, this.f4701m, null, this.f4700l);
            }
            CharSequence charSequence5 = this.f4702n;
            if (charSequence5 != null || this.f4703o != null) {
                alertController2.setButton(-3, charSequence5, this.f4704p, null, this.f4703o);
            }
            if (this.f4709u == null && this.J == null && this.f4710v == null) {
                aVar = this;
                alertController3 = alertController2;
            } else {
                RecycleListView recycleListView = (RecycleListView) this.f4690b.inflate(alertController2.L, (ViewGroup) null);
                if (!this.F) {
                    aVar = this;
                    alertController3 = alertController2;
                    int i11 = aVar.G ? alertController3.N : alertController3.O;
                    if (aVar.J != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(aVar.f4689a, i11, aVar.J, new String[]{aVar.K}, new int[]{R.id.text1});
                    } else {
                        ListAdapter cVar = aVar.f4710v;
                        if (cVar == null) {
                            cVar = new c(aVar.f4689a, i11, R.id.text1, aVar.f4709u);
                        }
                        simpleCursorAdapter = cVar;
                    }
                } else if (this.J == null) {
                    aVar = this;
                    simpleCursorAdapter = new h(aVar, this.f4689a, alertController2.M, this.f4709u, recycleListView);
                    alertController3 = alertController2;
                } else {
                    aVar = this;
                    alertController3 = alertController2;
                    simpleCursorAdapter = new i(aVar, aVar.f4689a, aVar.J, recycleListView, alertController3);
                }
                alertController3.H = simpleCursorAdapter;
                alertController3.I = aVar.H;
                if (aVar.f4711w != null) {
                    recycleListView.setOnItemClickListener(new j(this, alertController3));
                } else if (aVar.I != null) {
                    recycleListView.setOnItemClickListener(new k(this, recycleListView, alertController3));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = aVar.M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (aVar.G) {
                    recycleListView.setChoiceMode(1);
                } else if (aVar.F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController3.f4667g = recycleListView;
            }
            View view2 = aVar.f4713y;
            if (view2 != null) {
                if (aVar.D) {
                    alertController3.setView(view2, aVar.f4714z, aVar.A, aVar.B, aVar.C);
                    return;
                } else {
                    alertController3.setView(view2);
                    return;
                }
            }
            AlertController alertController4 = alertController3;
            int i12 = aVar.f4712x;
            if (i12 != 0) {
                alertController4.setView(i12);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f4715a;

        public b(DialogInterface dialogInterface) {
            this.f4715a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f4715a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends ArrayAdapter {
        public c(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, v0 v0Var, Window window) {
        this.f4661a = context;
        this.f4662b = v0Var;
        this.f4663c = window;
        this.R = new b(v0Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, k.a.f69981e, com.digidust.elokence.akinator.freemium.R.attr.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f4664d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        v0Var.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public Button getButton(int i10) {
        if (i10 == -3) {
            return this.f4683w;
        }
        if (i10 == -2) {
            return this.f4679s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f4675o;
    }

    public int getIconAttributeResId(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f4661a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView getListView() {
        return this.f4667g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void installContent() {
        int i10;
        View viewFindViewById;
        int i11;
        ListAdapter listAdapter;
        View viewFindViewById2;
        int i12 = this.J;
        int i13 = this.K;
        if (i13 != 0 && this.Q == 1) {
            i12 = i13;
        }
        this.f4662b.setContentView(i12);
        Window window = this.f4663c;
        View viewFindViewById3 = window.findViewById(com.digidust.elokence.akinator.freemium.R.id.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(com.digidust.elokence.akinator.freemium.R.id.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(com.digidust.elokence.akinator.freemium.R.id.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(com.digidust.elokence.akinator.freemium.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(com.digidust.elokence.akinator.freemium.R.id.customPanel);
        View viewInflate = this.f4668h;
        Context context = this.f4661a;
        if (viewInflate == null) {
            viewInflate = this.f4669i != 0 ? LayoutInflater.from(context).inflate(this.f4669i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.digidust.elokence.akinator.freemium.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f4674n) {
                frameLayout.setPadding(this.f4670j, this.f4671k, this.f4672l, this.f4673m);
            }
            if (this.f4667g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById7 = viewGroup.findViewById(com.digidust.elokence.akinator.freemium.R.id.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.digidust.elokence.akinator.freemium.R.id.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(com.digidust.elokence.akinator.freemium.R.id.buttonPanel);
        ViewGroup viewGroupB = b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB2 = b(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupB3 = b(viewFindViewById9, viewFindViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.digidust.elokence.akinator.freemium.R.id.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f4666f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.A.removeView(this.F);
                if (this.f4667g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(this.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(this.f4667g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        this.f4675o = button;
        g gVar = this.S;
        button.setOnClickListener(gVar);
        boolean zIsEmpty = TextUtils.isEmpty(this.f4676p);
        int i14 = this.f4664d;
        if (zIsEmpty && this.f4678r == null) {
            this.f4675o.setVisibility(8);
            i10 = 0;
        } else {
            this.f4675o.setText(this.f4676p);
            Drawable drawable = this.f4678r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i14, i14);
                this.f4675o.setCompoundDrawables(this.f4678r, null, null, null);
            }
            this.f4675o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        this.f4679s = button2;
        button2.setOnClickListener(gVar);
        if (TextUtils.isEmpty(this.f4680t) && this.f4682v == null) {
            this.f4679s.setVisibility(8);
        } else {
            this.f4679s.setText(this.f4680t);
            Drawable drawable2 = this.f4682v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i14, i14);
                this.f4679s.setCompoundDrawables(this.f4682v, null, null, null);
            }
            this.f4679s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        this.f4683w = button3;
        button3.setOnClickListener(gVar);
        if (TextUtils.isEmpty(this.f4684x) && this.f4686z == null) {
            this.f4683w.setVisibility(8);
            viewFindViewById = null;
        } else {
            this.f4683w.setText(this.f4684x);
            Drawable drawable3 = this.f4686z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i14, i14);
                viewFindViewById = null;
                this.f4683w.setCompoundDrawables(this.f4686z, null, null, null);
            } else {
                viewFindViewById = null;
            }
            this.f4683w.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.digidust.elokence.akinator.freemium.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = this.f4675o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = this.f4679s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = this.f4683w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (this.G != null) {
            viewGroupB.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.digidust.elokence.akinator.freemium.R.id.title_template).setVisibility(8);
        } else {
            this.D = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(this.f4665e) || !this.P) {
                window.findViewById(com.digidust.elokence.akinator.freemium.R.id.title_template).setVisibility(8);
                this.D.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.digidust.elokence.akinator.freemium.R.id.alertTitle);
                this.E = textView2;
                textView2.setText(this.f4665e);
                int i15 = this.B;
                if (i15 != 0) {
                    this.D.setImageResource(i15);
                } else {
                    Drawable drawable4 = this.C;
                    if (drawable4 != null) {
                        this.D.setImageDrawable(drawable4);
                    } else {
                        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                        this.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        boolean z12 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z13 = viewGroupB3.getVisibility() != 8;
        if (!z13 && (viewFindViewById2 = viewGroupB2.findViewById(com.digidust.elokence.akinator.freemium.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z12 != 0) {
            NestedScrollView nestedScrollView2 = this.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (this.f4666f != null || this.f4667g != null) {
                viewFindViewById = viewGroupB.findViewById(com.digidust.elokence.akinator.freemium.R.id.titleDividerNoCustom);
            }
            i11 = 0;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else {
            i11 = 0;
            View viewFindViewById10 = viewGroupB2.findViewById(com.digidust.elokence.akinator.freemium.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        RecycleListView recycleListView = this.f4667g;
        if (recycleListView != null) {
            recycleListView.setHasDecor(z12, z13);
        }
        if (!z11) {
            View view = this.f4667g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                int i16 = z13 ? 2 : i11;
                View viewFindViewById11 = window.findViewById(com.digidust.elokence.akinator.freemium.R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(com.digidust.elokence.akinator.freemium.R.id.scrollIndicatorDown);
                z1.setScrollIndicators(view, z12 | i16, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        RecycleListView recycleListView2 = this.f4667g;
        if (recycleListView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i17 = this.I;
        if (i17 > -1) {
            recycleListView2.setItemChecked(i17, true);
            recycleListView2.setSelection(i17);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent);
    }

    public void setButton(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f4684x = charSequence;
            this.f4685y = message;
            this.f4686z = drawable;
        } else if (i10 == -2) {
            this.f4680t = charSequence;
            this.f4681u = message;
            this.f4682v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f4676p = charSequence;
            this.f4677q = message;
            this.f4678r = drawable;
        }
    }

    public void setButtonPanelLayoutHint(int i10) {
        this.Q = i10;
    }

    public void setCustomTitle(View view) {
        this.G = view;
    }

    public void setIcon(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.f4666f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f4665e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(int i10) {
        this.f4668h = null;
        this.f4669i = i10;
        this.f4674n = false;
    }

    public void setView(View view) {
        this.f4668h = view;
        this.f4669i = 0;
        this.f4674n = false;
    }

    public void setIcon(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setView(View view, int i10, int i11, int i12, int i13) {
        this.f4668h = view;
        this.f4669i = 0;
        this.f4674n = true;
        this.f4670j = i10;
        this.f4671k = i11;
        this.f4672l = i12;
        this.f4673m = i13;
    }
}
