package er;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import ir.n;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends View {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f55012b = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        setClickable(false);
        setFocusable(false);
    }

    public final void setWatermark(Drawable drawable) {
        n.onUiThread(new bq.c(4, this, drawable));
    }
}
