package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f77222f;

    /* renamed from: a, reason: collision with root package name */
    public int f77223a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f77224b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f77225c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f77226d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f77227e;

    public e() {
        super(null);
    }

    public final void a() {
        if (this.f77224b == null) {
            this.f77224b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f77224b.setTo(theme);
            }
        }
        this.f77224b.applyStyle(this.f77223a, true);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (this.f77227e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f77226d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f77226d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f77227e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f77226d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = o.e.f77222f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            o.e.f77222f = r1
        L1c:
            android.content.res.Configuration r1 = o.e.f77222f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f77226d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f77227e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f77227e = r0
        L38:
            android.content.res.Resources r0 = r3.f77227e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f77225c == null) {
            this.f77225c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f77225c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f77224b;
        if (theme != null) {
            return theme;
        }
        if (this.f77223a == 0) {
            this.f77223a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f77224b;
    }

    public int getThemeResId() {
        return this.f77223a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f77223a != i10) {
            this.f77223a = i10;
            a();
        }
    }

    public e(Context context, int i10) {
        super(context);
        this.f77223a = i10;
    }

    public e(Context context, Resources.Theme theme) {
        super(context);
        this.f77224b = theme;
    }
}
