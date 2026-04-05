package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    public List<String> fetchStores(List<String> additionalStores) {
        e0.checkNotNullParameter(additionalStores, "additionalStores");
        AndroidKnownStore[] androidKnownStoreArrValues = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(androidKnownStoreArrValues.length);
        for (AndroidKnownStore androidKnownStore : androidKnownStoreArrValues) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List listDistinct = y0.distinct(y0.plus((Collection) arrayList, (Iterable) additionalStores));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listDistinct) {
            String str = (String) obj;
            try {
                if ((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0)) != null) {
                    arrayList2.add(obj);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList2;
    }
}
