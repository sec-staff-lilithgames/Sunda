package er;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import br.p1;
import com.digidust.elokence.akinator.freemium.R;
import dq.d0;
import ir.h;
import ir.s;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.a0;
import tu.o;
import tu.q;
import tu.x0;
import tu.z;
import zq.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends Dialog {

    /* renamed from: e, reason: collision with root package name */
    public static final C0558a f55004e = new C0558a(null);

    /* renamed from: f, reason: collision with root package name */
    public static WeakReference f55005f = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final p1 f55006b;

    /* renamed from: c, reason: collision with root package name */
    public final o f55007c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: er.a$a, reason: collision with other inner class name */
    public static final class C0558a {
        public C0558a(u uVar) {
        }

        public final a show(Context context, p1 privacySheetParams) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            a aVar = (a) a.f55005f.get();
            if (aVar != null && aVar.isShowing()) {
                if (e0.areEqual(aVar.f55006b, privacySheetParams)) {
                    return aVar;
                }
                aVar.dismiss();
            }
            a aVar2 = new a(context, privacySheetParams, null);
            a.f55005f = new WeakReference(aVar2);
            try {
                aVar2.show();
                return aVar2;
            } catch (Throwable th2) {
                d0.b(th2);
                return aVar2;
            }
        }
    }

    public a(Context context, p1 p1Var, u uVar) {
        super(context, R.style.Bm_BottomSheetDialog);
        this.f55006b = p1Var;
        this.f55007c = q.lazy(new d(context));
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
    }

    public static final void access$onActionClicked(a aVar, p1.a aVar2) {
        aVar.getClass();
        String data = aVar2.getData();
        int i10 = b.$EnumSwitchMapping$0[aVar2.getType().ordinal()];
        if (i10 == 1) {
            try {
                int i11 = z.f87419c;
                Context context = aVar.getContext();
                e0.checkNotNullExpressionValue(context, "context");
                z.m7131constructorimpl(Boolean.valueOf(h.openUrl(context, data)));
                return;
            } catch (Throwable th2) {
                int i12 = z.f87419c;
                z.m7131constructorimpl(a0.createFailure(th2));
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        try {
            int i13 = z.f87419c;
            Context context2 = aVar.getContext();
            e0.checkNotNullExpressionValue(context2, "context");
            ClipboardManager clipboardManager = s.getClipboardManager(context2);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", data));
            }
            z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th3) {
            int i14 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th3));
        }
    }

    public static final a show(Context context, p1 p1Var) {
        return f55004e.show(context, p1Var);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o oVar = this.f55007c;
        g gVar = (g) oVar.getValue();
        gVar.setOnCloseClickListener(new c(this));
        setContentView(gVar);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            int i10 = Build.VERSION.SDK_INT;
            window.setLayout(-1, -1);
            if (i10 >= 30) {
                window.setDecorFitsSystemWindows(false);
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
            }
        }
        g gVar2 = (g) oVar.getValue();
        gVar2.a();
        p1 p1Var = this.f55006b;
        gVar2.setTitle(p1Var.getTitle());
        gVar2.setSubtitle(p1Var.getSubtitle());
        for (p1.a aVar : p1Var.getActions()) {
            Bitmap icon = aVar.getIcon();
            gVar2.a(aVar.getTitle(), icon != null ? new BitmapDrawable(gVar2.getResources(), icon) : null, new e(this, aVar));
        }
    }
}
