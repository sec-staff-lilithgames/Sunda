package o9;

import android.view.View;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x9 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoreItemsActivity f78681b;

    public x9(StoreItemsActivity storeItemsActivity) {
        this.f78681b = storeItemsActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        StoreItemsActivity storeItemsActivity = this.f78681b;
        if (view == storeItemsActivity.E) {
            int i10 = storeItemsActivity.N;
            if (i10 == 0) {
                String[] strArr = StoreItemsActivity.U;
                storeItemsActivity.N = 12;
            } else {
                storeItemsActivity.N = i10 - 1;
            }
        } else if (view == storeItemsActivity.F) {
            int i11 = storeItemsActivity.N;
            String[] strArr2 = StoreItemsActivity.U;
            if (i11 == 12) {
                storeItemsActivity.N = 0;
            } else {
                storeItemsActivity.N = i11 + 1;
            }
        }
        storeItemsActivity.t("cloth");
    }
}
