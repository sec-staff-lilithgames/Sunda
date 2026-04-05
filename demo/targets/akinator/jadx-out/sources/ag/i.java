package ag;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.e f4409b;

    public i(com.google.android.material.bottomsheet.e eVar) {
        this.f4409b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.google.android.material.bottomsheet.e eVar = this.f4409b;
        if (eVar.f29031m && eVar.isShowing()) {
            if (!eVar.f29033o) {
                TypedArray typedArrayObtainStyledAttributes = eVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                eVar.f29032n = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                eVar.f29033o = true;
            }
            if (eVar.f29032n) {
                eVar.cancel();
            }
        }
    }
}
