package q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j3 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f82161c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f82162d;

    /* renamed from: a, reason: collision with root package name */
    public final q2 f82163a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f82164b;

    public j3(Context context) {
        super(context);
        if (!c4.shouldBeUsed()) {
            this.f82163a = new l3(this, context.getResources());
            this.f82164b = null;
            return;
        }
        c4 c4Var = new c4(this, context.getResources());
        this.f82163a = c4Var;
        Resources.Theme themeNewTheme = c4Var.newTheme();
        this.f82164b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static Context wrap(Context context) {
        if ((context instanceof j3) || (context.getResources() instanceof l3) || (context.getResources() instanceof c4) || !c4.shouldBeUsed()) {
            return context;
        }
        synchronized (f82161c) {
            try {
                ArrayList arrayList = f82162d;
                if (arrayList == null) {
                    f82162d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f82162d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f82162d.remove(size);
                        }
                    }
                    for (int size2 = f82162d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f82162d.get(size2);
                        j3 j3Var = weakReference2 != null ? (j3) weakReference2.get() : null;
                        if (j3Var != null && j3Var.getBaseContext() == context) {
                            return j3Var;
                        }
                    }
                }
                j3 j3Var2 = new j3(context);
                f82162d.add(new WeakReference(j3Var2));
                return j3Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f82163a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f82163a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f82164b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f82164b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
