package o9;

import android.view.View;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w9 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoreItemsActivity f78654b;

    public w9(StoreItemsActivity storeItemsActivity) {
        this.f78654b = storeItemsActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        StoreItemsActivity storeItemsActivity = this.f78654b;
        if (view == storeItemsActivity.C) {
            int i10 = storeItemsActivity.L;
            if (i10 == 0) {
                String[] strArr = StoreItemsActivity.U;
                storeItemsActivity.L = 10;
            } else {
                storeItemsActivity.L = i10 - 1;
            }
        } else if (view == storeItemsActivity.D) {
            int i11 = storeItemsActivity.L;
            String[] strArr2 = StoreItemsActivity.U;
            if (i11 == 10) {
                storeItemsActivity.L = 0;
            } else {
                storeItemsActivity.L = i11 + 1;
            }
        }
        storeItemsActivity.t("hat");
    }
}
