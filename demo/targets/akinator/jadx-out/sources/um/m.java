package um;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m extends s {
    public m(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // um.s
    public final View b(Context context, p pVar) {
        return "text".equals(pVar.getStyle()) ? new zm.e(context) : new zm.a(context);
    }

    @Override // um.s
    public final p c(Context context, p pVar) {
        return (pVar == null || !"text".equals(pVar.getStyle())) ? a.f88527f : a.f88528g;
    }

    public void changePercentage(int i10, int i11) {
        View view = this.f88642b;
        if (!(view instanceof zm.e)) {
            if (view instanceof zm.a) {
                ((zm.a) view).changePercentage(i10, i11);
            }
        } else {
            zm.e eVar = (zm.e) view;
            if (i11 == 0) {
                eVar.setText("");
            } else {
                eVar.setRemaining(i11);
            }
        }
    }
}
