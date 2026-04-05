package da;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.OverlayNoInternetBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CancellableContinuationImpl;
import lb.b1;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o {
    public o(u uVar) {
    }

    public static /* synthetic */ q show$default(o oVar, Context context, int i10, p pVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            pVar = null;
        }
        return oVar.show(context, i10, pVar);
    }

    public final Object await(Context context, int i10, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new l(q.f51970b.show(context, i10, new n(cancellableContinuationImpl))));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    public final q show(Context context, int i10, p pVar) {
        e0.checkNotNullParameter(context, "context");
        q qVar = new q(context, 0);
        Window window = qVar.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        OverlayNoInternetBinding overlayNoInternetBindingInflate = OverlayNoInternetBinding.inflate(LayoutInflater.from(context));
        e0.checkNotNullExpressionValue(overlayNoInternetBindingInflate, "inflate(...)");
        qVar.setContentView(overlayNoInternetBindingInflate.getRoot());
        Window window2 = qVar.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.width = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.9d);
            window2.setAttributes(attributes);
        }
        TextView textView = overlayNoInternetBindingInflate.textviewPopupNoInternetTitle;
        AkApplication.a aVar = AkApplication.f21719f;
        textView.setTypeface(aVar.getTypeFace());
        overlayNoInternetBindingInflate.textviewPopupNoInternetDesc.setTypeface(aVar.getTypeFace());
        overlayNoInternetBindingInflate.buttonNoInternetRetry.setTypeface(aVar.getTypeFace());
        TextView textView2 = overlayNoInternetBindingInflate.textviewPopupNoInternetTitle;
        String traductionFromToken = (i10 == 0 || i10 != 1) ? b1.f72741d.sharedInstance().getTraductionFromToken("CNX_REQUIRED") : b1.f72741d.sharedInstance().getTraductionFromToken("CNX_FAILURE");
        textView2.setText(traductionFromToken);
        TextView textView3 = overlayNoInternetBindingInflate.textviewPopupNoInternetDesc;
        b1.a aVar2 = b1.f72741d;
        o2.A(aVar2, "CNX_CHECK", textView3);
        overlayNoInternetBindingInflate.buttonNoInternetRetry.setText(aVar2.sharedInstance().getTraductionFromToken("RETRY"));
        overlayNoInternetBindingInflate.buttonNoInternetRetry.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(5, qVar, pVar));
        qVar.setCancelable(false);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return qVar;
            }
        }
        qVar.show();
        return qVar;
    }
}
