package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.Yf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Yf {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32586a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f32587b;

    public Yf(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f32586a = new ArrayList();
        this.f32587b = new WeakReference(view);
        if (R3.f32183a.P()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: zk.f0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return Yf.a(this.f98099a, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(Yf this$0, View view, WindowInsets windowInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<anonymous parameter 0>");
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "windowInsets");
        if (!this$0.f32586a.isEmpty()) {
            Iterator it = this$0.f32586a.iterator();
            while (it.hasNext()) {
                cg cgVar = (cg) ((Xf) it.next());
                cgVar.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "windowInsets");
                cgVar.f32717a.a(windowInsets);
                try {
                    Activity activity = (Activity) cgVar.f32721e.get();
                    if (!cgVar.f32717a.a()) {
                        F5 f52 = cgVar.f32718b;
                        if (f52 != null) {
                            ((G5) f52).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                        }
                    } else if (activity == null) {
                        F5 f53 = cgVar.f32718b;
                        if (f53 != null) {
                            ((G5) f53).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                        }
                    } else {
                        ag agVarB = D2.a(activity) ? Jc.b(windowInsets) : Jc.a(windowInsets);
                        Integer numF = AbstractC2679a4.f();
                        int iIntValue = numF != null ? numF.intValue() : AbstractC2679a4.a(windowInsets);
                        AbstractC2679a4.a(Integer.valueOf(iIntValue));
                        cgVar.a(agVarB, iIntValue);
                    }
                } catch (Error e10) {
                    F5 f54 = cgVar.f32718b;
                    if (f54 != null) {
                        ((G5) f54).b("WindowInsetsHandler", "Error in getting safeArea " + e10.getMessage());
                    }
                } catch (Exception e11) {
                    F5 f55 = cgVar.f32718b;
                    if (f55 != null) {
                        ((G5) f55).a("WindowInsetsHandler", "Exception in getting safeArea", e11);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.f32586a.clear();
        if (!R3.f32183a.P() || (view = (View) this.f32587b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
