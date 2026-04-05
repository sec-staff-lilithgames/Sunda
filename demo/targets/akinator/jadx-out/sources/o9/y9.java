package o9;

import android.os.AsyncTask;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;
import com.digidust.elokence.akinator.freemium.R;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y9 extends AsyncTask implements ca.s {

    /* renamed from: b, reason: collision with root package name */
    public final String f78701b;

    /* renamed from: c, reason: collision with root package name */
    public da.k f78702c = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StoreItemsActivity f78703e;

    public y9(StoreItemsActivity storeItemsActivity, String str) {
        this.f78703e = storeItemsActivity;
        this.f78701b = str;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String str = this.f78701b;
        boolean zEquals = str.equals("hat");
        StoreItemsActivity storeItemsActivity = this.f78703e;
        return Integer.valueOf(zEquals ? ca.t.sharedInstance().loadHat(StoreItemsActivity.U[storeItemsActivity.L], this) : str.equals("cloth") ? ca.t.sharedInstance().loadClothes(StoreItemsActivity.W[storeItemsActivity.N], this) : -1);
    }

    @Override // ca.s
    public void onLoadingProgress(int i10, int i11) {
        publishProgress(Integer.valueOf(i10), Integer.valueOf(i11));
        Timber.tag("storeItemsFragment").d(w0.i.a(i10, i11, "send progressbar update to : ", "/"), new Object[0]);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        try {
            da.k kVar = this.f78702c;
            if (kVar != null && kVar.isShowing()) {
                this.f78702c.dismiss();
            }
        } catch (IllegalArgumentException unused) {
            this.f78702c = null;
        }
        String str = this.f78701b;
        boolean zEquals = str.equals("hat");
        StoreItemsActivity storeItemsActivity = this.f78703e;
        if (zEquals) {
            storeItemsActivity.q(R.id.akinatorChapeau, ca.t.sharedInstance().getHatBitmap(StoreItemsActivity.U[storeItemsActivity.L], "akinator_defi"));
        } else if (str.equals("cloth")) {
            storeItemsActivity.q(R.id.akinatorTenue, ca.t.sharedInstance().getClothBitmap(StoreItemsActivity.W[storeItemsActivity.N], "akinator_defi"));
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.f78702c = da.k.show(this.f78703e);
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        double dIntValue = (numArr[0].intValue() / numArr[1].intValue()) * 100.0d;
        this.f78702c.setText(((int) dIntValue) + "%");
    }
}
