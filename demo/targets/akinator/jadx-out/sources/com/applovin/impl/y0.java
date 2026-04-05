package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t0;
import com.applovin.impl.u0;
import com.applovin.impl.w0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f16227a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16228b;

    /* renamed from: c, reason: collision with root package name */
    private List f16229c;

    /* renamed from: d, reason: collision with root package name */
    private String f16230d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f16231e;

    /* renamed from: f, reason: collision with root package name */
    private t0.c f16232f;

    /* renamed from: g, reason: collision with root package name */
    private u0 f16233g;

    /* renamed from: h, reason: collision with root package name */
    private Dialog f16234h;

    /* renamed from: i, reason: collision with root package name */
    private t0.b f16235i = new t0.b();

    /* renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.b f16236j = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || y0.this.f16233g == null) {
                return;
            }
            if (y0.this.f16234h != null) {
                y0 y0Var = y0.this;
                if (!com.applovin.impl.d.d(y0Var.a(y0Var.f16234h))) {
                    y0.this.f16234h.dismiss();
                }
                y0.this.f16234h = null;
            }
            u0 u0Var = y0.this.f16233g;
            y0.this.f16233g = null;
            y0 y0Var2 = y0.this;
            y0Var2.a(y0Var2.f16231e, u0Var, activity);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f16238a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f16239b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f16240c;

        public b(w0 w0Var, u0 u0Var, Activity activity) {
            this.f16238a = w0Var;
            this.f16239b = u0Var;
            this.f16240c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            y0.this.f16233g = null;
            y0.this.f16234h = null;
            u0 u0VarA = y0.this.a(this.f16238a.a());
            if (u0VarA == null) {
                y0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            y0.this.a(this.f16239b, u0VarA, this.f16240c);
            if (u0VarA.c() != u0.b.f15781a) {
                dialogInterface.dismiss();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f16242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f16243b;

        public c(Uri uri, Activity activity) {
            this.f16242a = uri;
            this.f16243b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            k7.a(this.f16242a, this.f16243b, y0.this.f16227a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f16245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f16246b;

        public d(Uri uri, Activity activity) {
            this.f16245a = uri;
            this.f16246b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            k7.a(this.f16245a, this.f16246b, y0.this.f16227a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0 f16248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f16249b;

        public e(u0 u0Var, Activity activity) {
            this.f16248a = u0Var;
            this.f16249b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            y0.this.f16235i.a(appLovinCmpError);
            y0.this.a(this.f16248a, this.f16249b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0 f16251a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f16252b;

        public f(u0 u0Var, Activity activity) {
            this.f16251a = u0Var;
            this.f16252b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            y0.this.f16235i.a(appLovinCmpError);
            y0.this.a(this.f16251a, this.f16252b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements CmpServiceImpl.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0 f16254a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f16255b;

        public g(u0 u0Var, Activity activity) {
            this.f16254a = u0Var;
            this.f16255b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                y0.this.f16235i.a(appLovinCmpError);
            } else {
                y0.this.f16235i.c();
            }
            y0.this.b(this.f16254a, this.f16255b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0 f16257a;

        public h(u0 u0Var) {
            this.f16257a = u0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            y0 y0Var = y0.this;
            y0Var.a(y0Var.f16231e, this.f16257a, y0.this.f16227a.v0());
        }
    }

    public y0(com.applovin.impl.sdk.k kVar) {
        this.f16227a = kVar;
        this.f16228b = ((Integer) kVar.a(v4.N6)).intValue();
    }

    private void c(u0 u0Var, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new androidx.browser.customtabs.g(this, 24, u0Var, activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(u0 u0Var, Activity activity) {
        a(u0Var, activity, (Boolean) null);
    }

    private void b() {
        this.f16229c = null;
        this.f16231e = null;
        this.f16227a.e().b(this.f16236j);
        t0.c cVar = this.f16232f;
        if (cVar != null) {
            cVar.a(this.f16235i);
            this.f16232f = null;
        }
        this.f16235i = new t0.b();
    }

    public void a(Activity activity, t0.c cVar) {
        a(u0.a.f15776c.b(), activity, cVar);
    }

    public void a(int i10, Activity activity, t0.c cVar) {
        if (this.f16229c != null) {
            this.f16227a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f16227a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f16229c);
            }
            this.f16227a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f16227a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f16229c);
            }
            cVar.a(new t0.b(new s0(s0.f15210d, "Consent flow is already in progress.")));
            return;
        }
        List listA = z0.a(this.f16227a);
        this.f16229c = listA;
        this.f16230d = String.valueOf(listA);
        this.f16232f = cVar;
        u0 u0VarA = a(i10);
        this.f16227a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f16227a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f16229c + "\nInitial state: " + u0VarA);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f16236j);
        a((u0) null, u0VarA, activity);
    }

    public boolean a() {
        return this.f16229c != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u0 u0Var, Activity activity, Boolean bool) {
        a(u0Var, a(u0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u0 u0Var, u0 u0Var2, Activity activity) {
        this.f16231e = u0Var;
        c(u0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u0 u0Var, final Activity activity) {
        SpannableString spannableString;
        if (u0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f16227a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f16227a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + u0Var);
        }
        if (u0Var.c() == u0.b.f15781a) {
            if (com.applovin.impl.d.d(activity)) {
                a(u0Var);
                return;
            }
            this.f16227a.G().trackEvent("cf_start");
            v0 v0Var = (v0) u0Var;
            this.f16233g = v0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (w0 w0Var : v0Var.d()) {
                b bVar = new b(w0Var, u0Var, activity);
                if (w0Var.c() == w0.a.POSITIVE) {
                    builder.setPositiveButton(w0Var.d(), bVar);
                } else if (w0Var.c() == w0.a.NEGATIVE) {
                    builder.setNegativeButton(w0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(w0Var.d(), bVar);
                }
            }
            String strF = v0Var.f();
            if (StringUtils.isValidString(strF)) {
                spannableString = new SpannableString(strF);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strF, Arrays.asList(strA, strA2))) {
                    Uri uriH = this.f16227a.y().h();
                    if (uriH != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f16227a.y().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(v0Var.e()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.na
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f14877a.a(alertDialogCreate, activity, dialogInterface);
                }
            });
            this.f16234h = alertDialogCreate;
            alertDialogCreate.show();
            this.f16235i.d();
            return;
        }
        if (u0Var.c() == u0.b.POST_ALERT) {
            if (this.f16227a.y().k() && this.f16227a.y().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(u0Var);
                    return;
                } else {
                    this.f16227a.t().loadCmp(activity, new e(u0Var, activity));
                    return;
                }
            }
            a(u0Var, activity, Boolean.FALSE);
            return;
        }
        if (u0Var.c() == u0.b.EVENT) {
            x0 x0Var = (x0) u0Var;
            String strE = x0Var.e();
            Map<String, ?> mapD = x0Var.d();
            if (mapD == null) {
                mapD = new HashMap<>(1);
            }
            mapD.put("flow_type", "unified");
            this.f16227a.G().trackEvent(strE, mapD);
            b(x0Var, activity);
            return;
        }
        if (u0Var.c() == u0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(u0Var);
                return;
            } else if (this.f16227a.y().m()) {
                this.f16227a.t().preloadCmp(activity);
                a(u0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f16227a.t().loadCmp(activity, new f(u0Var, activity));
                return;
            }
        }
        if (u0Var.c() == u0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(u0Var);
                return;
            }
            if (!this.f16227a.y().m()) {
                this.f16227a.G().trackEvent("cf_start");
            }
            this.f16227a.t().showCmp(activity, new g(u0Var, activity));
            return;
        }
        if (u0Var.c() == u0.b.DECISION) {
            u0.a aVarA = u0Var.a();
            if (aVarA == u0.a.f15776c) {
                a(u0Var, activity, Boolean.valueOf(this.f16227a.y().k()));
                return;
            }
            if (aVarA == u0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                a(u0Var, activity, Boolean.valueOf(!this.f16227a.A0() || ((Boolean) this.f16227a.a(x4.f16191s, Boolean.FALSE)).booleanValue()));
                return;
            } else {
                if (aVarA == u0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a(u0Var, activity, Boolean.valueOf(this.f16227a.y().h() != null));
                    return;
                }
                a("Invalid consent flow decision type: " + aVarA);
                return;
            }
        }
        if (u0Var.c() == u0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f16228b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
    }

    private void a(u0 u0Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(u0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        k1.a(str, new Object[0]);
        this.f16227a.E().a(c2.B0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f16230d + "\nLast successful state: " + this.f16231e));
        t0.b bVar = this.f16235i;
        if (bVar != null) {
            bVar.a(new s0(s0.f15211e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u0 a(int i10) {
        List<u0> list = this.f16229c;
        if (list == null) {
            return null;
        }
        for (u0 u0Var : list) {
            if (i10 == u0Var.b()) {
                return u0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }
}
