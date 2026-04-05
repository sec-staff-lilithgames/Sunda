package io.odeeo.internal.d0;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import io.odeeo.internal.u0.h1;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {
    public h1<a> decode(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return io.odeeo.internal.q0.c.fromBundleList(a.f63545s, (ArrayList) io.odeeo.internal.q0.a.checkNotNull(bundle.getParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)));
    }
}
