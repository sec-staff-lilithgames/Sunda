package um;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n extends s {
    public n(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // um.s
    public final void a(View view, p pVar) {
        ((zm.b) view).setText(!TextUtils.isEmpty(pVar.getContent()) ? pVar.getContent() : "Learn more");
    }

    @Override // um.s
    public final View b(Context context, p pVar) {
        return new zm.b(context);
    }

    @Override // um.s
    public final p c(Context context, p pVar) {
        return a.f88529h;
    }
}
