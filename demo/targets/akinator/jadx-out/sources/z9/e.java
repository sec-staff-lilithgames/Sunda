package z9;

import android.app.Activity;
import ca.m;
import ca.o;
import ca.u;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import ks.s;
import nh.b5;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: q, reason: collision with root package name */
    public static e f97699q;

    /* renamed from: k, reason: collision with root package name */
    public String[] f97710k;

    /* renamed from: l, reason: collision with root package name */
    public String[] f97711l;

    /* renamed from: m, reason: collision with root package name */
    public String[] f97712m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f97713n;

    /* renamed from: p, reason: collision with root package name */
    public final l f97715p;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f97700a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public String f97701b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f97702c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f97703d = null;

    /* renamed from: e, reason: collision with root package name */
    public String f97704e = null;

    /* renamed from: f, reason: collision with root package name */
    public String f97705f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f97706g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f97707h = null;

    /* renamed from: i, reason: collision with root package name */
    public String f97708i = null;

    /* renamed from: j, reason: collision with root package name */
    public String f97709j = null;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f97714o = new ArrayList();

    public e() {
        l lVar = new l();
        lVar.f97729b = false;
        lVar.f97730c = new TreeMap();
        lVar.f97731d = null;
        lVar.f97732e = new int[]{1, 2, 3, 4, 5};
        new HashMap();
        if (m.sharedInstance().isFreemium()) {
            l.f97727f = "com.elokence.akinatorfree.packgeniz0";
        } else {
            l.f97727f = "com.elokence.akinator.packgeniz0";
        }
        this.f97715p = lVar;
    }

    public static e getInstance() {
        if (f97699q == null) {
            f97699q = new e();
        }
        return f97699q;
    }

    public final void a(boolean z10) {
        synchronized (this.f97700a) {
            try {
                Timber.tag("AkInappManager").w("Signal Initialised %s", z10 ? "TRUE" : "FALSE");
                Iterator it = this.f97700a.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).onInitialization(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addListener(a aVar) {
        synchronized (this.f97700a) {
            if (aVar != null) {
                try {
                    this.f97700a.add(aVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b(String str) {
        try {
            if (str.contains(getSkuInappNoads()) || str.contains(getSkuInappPopu()) || str.contains(getSkuInappUltime())) {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                if (str.contains(getSkuInappUltime())) {
                    u.sharedInstance().setPotionBoughtInSession();
                    calendar.setTimeInMillis(o.sharedInstance().getDatePurchaseFull());
                    jb.h.sharedInstance().createOrUpdateMetricValeur("date_achat_potion_ultime", simpleDateFormat.format(calendar.getTime()));
                } else if (str.contains(getSkuInappPopu())) {
                    calendar.setTimeInMillis(o.sharedInstance().getDatePurchasePopu());
                    jb.h.sharedInstance().createOrUpdateMetricValeur("date_achat_potion_supercharged", simpleDateFormat.format(calendar.getTime()));
                } else if (str.contains(getSkuInappNoads())) {
                    calendar.setTimeInMillis(o.sharedInstance().getDatePurchaseNoAds());
                    jb.h.sharedInstance().createOrUpdateMetricValeur("date_achat_radiant_potion", simpleDateFormat.format(calendar.getTime()));
                }
            } else {
                l lVar = this.f97715p;
                int i10 = 0;
                while (true) {
                    String[] strArr = lVar.f97731d;
                    if (i10 >= strArr.length) {
                        i10 = -1;
                        break;
                    } else if (str.equals(strArr[i10])) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    jb.h.sharedInstance().createOrUpdateMetricCompteur("gz_gain_inapp", getValuesInappGeniz(i10));
                }
            }
        } catch (Exception unused) {
        }
        synchronized (this.f97700a) {
            try {
                Timber.w("Signal item purchased", new Object[0]);
                Iterator it = this.f97700a.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).itemPurchased(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void cancelPotionUltime() {
        this.f97715p.consumePurchase("com.digidust.elokence.akinator.freemium.full");
    }

    public String getDescInappGeniz(int i10) {
        return this.f97712m[i10];
    }

    public String getDescInappNoads() {
        return this.f97702c;
    }

    public String getDescInappPopu() {
        return this.f97705f;
    }

    public String getDescInappUltime() {
        return this.f97708i;
    }

    public int[] getListIdInappGeniz() {
        return this.f97715p.f97732e;
    }

    public String getNomInappGeniz(int i10) {
        return this.f97710k[i10];
    }

    public String getNomInappNoads() {
        return this.f97701b;
    }

    public String getNomInappPopu() {
        return this.f97704e;
    }

    public String getNomInappUltime() {
        return this.f97707h;
    }

    public String getPriceInappGeniz(int i10) {
        return this.f97711l[i10];
    }

    public String getPriceInappNoads() {
        return this.f97703d;
    }

    public String getPriceInappPopu() {
        return this.f97706g;
    }

    public String getPriceInappUltime() {
        return this.f97709j;
    }

    public String getSkuInappGeniz(int i10) {
        int i11 = 0;
        while (true) {
            l lVar = this.f97715p;
            int[] iArr = lVar.f97732e;
            if (i11 >= iArr.length) {
                return null;
            }
            if (iArr[i11] == i10) {
                String[] strArr = lVar.f97731d;
                if (strArr.length > i11) {
                    return strArr[i11];
                }
                return null;
            }
            i11++;
        }
    }

    public String getSkuInappNoads() {
        return "com.elokence.akinator.freemium.packads";
    }

    public String getSkuInappPopu() {
        return "com.elokence.akinator.freemium.packcharacters";
    }

    public String getSkuInappUltime() {
        return "com.digidust.elokence.akinator.freemium.full";
    }

    public List<String> getSkusList() {
        return this.f97714o;
    }

    public int getValuesInappGeniz(int i10) {
        return this.f97713n[i10];
    }

    public void init(Activity activity, c cVar) {
        l lVar = this.f97715p;
        int[] iArr = lVar.f97732e;
        if (lVar.f97728a == null) {
            lVar.f97731d = new String[iArr.length];
            getInstance().f97713n = new int[iArr.length];
            getInstance().f97711l = new String[iArr.length];
            getInstance().f97710k = new String[iArr.length];
            getInstance().f97712m = new String[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                lVar.f97731d[i10] = l.f97727f + iArr[i10];
            }
            lVar.f97728a = BillingClient.newBuilder(activity).enablePendingPurchases().setListener(new h(lVar)).build();
        }
        lVar.f97728a.startConnection(new i(lVar, cVar));
    }

    public boolean isInit() {
        return this.f97715p.f97729b;
    }

    public boolean purchaseInapp(String str, Activity activity) {
        if (getSkuInappUltime().equals(str)) {
            u.sharedInstance().setMarketOpen();
        }
        l lVar = this.f97715p;
        ProductDetails productDetails = (ProductDetails) lVar.f97730c.get(str);
        if (productDetails != null) {
            BillingResult billingResultLaunchBillingFlow = lVar.f97728a.launchBillingFlow(activity, BillingFlowParams.newBuilder().setProductDetailsParamsList(b5.of(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build())).build());
            if (billingResultLaunchBillingFlow.getResponseCode() != 0) {
                Timber.tag("AkInappManagerImpl").e("Error initiating purchase flow : " + String.valueOf(billingResultLaunchBillingFlow.getResponseCode()) + " " + billingResultLaunchBillingFlow.getDebugMessage(), new Object[0]);
            }
            if (billingResultLaunchBillingFlow.getResponseCode() == 0) {
                return true;
            }
        }
        return false;
    }

    public void removeListener(a aVar) {
        synchronized (this.f97700a) {
            this.f97700a.remove(aVar);
        }
    }

    public boolean requestAllPurchases(d dVar) {
        return this.f97715p.b(dVar);
    }

    public void requestInappDetailsUpdate(b bVar) {
        l lVar = this.f97715p;
        lVar.getClass();
        Timber.tag("AkInappManagerImpl").d("Request Inapp Details", new Object[0]);
        if (lVar.f97729b) {
            Timber.tag("AkInappManagerImpl").d("Request Inapp Details : init OK", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (String str : lVar.f97731d) {
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(str).setProductType("inapp").build());
            }
            if (m.sharedInstance().isFreemium()) {
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId("com.digidust.elokence.akinator.freemium.full").setProductType("inapp").build());
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId("com.elokence.akinator.freemium.packads").setProductType("inapp").build());
                arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId("com.elokence.akinator.freemium.packcharacters").setProductType("inapp").build());
            }
            Timber.tag("AkInappManagerImpl").d("Produits demandés " + arrayList, new Object[0]);
            try {
                lVar.f97728a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new s(23, lVar, bVar));
            } catch (Exception unused) {
            }
        }
    }

    public void requestLastPurchases(d dVar) {
        l lVar = this.f97715p;
        lVar.getClass();
        Timber.tag("AkInappManagerImpl").w("PurchasingService : request last updates", new Object[0]);
        lVar.b(dVar);
    }
}
