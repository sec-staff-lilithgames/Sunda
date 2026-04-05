package ef;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.ArrayList;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {
    public b5 decode(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return com.google.android.exoplayer2.util.c.fromBundleList(b.L, (ArrayList) com.google.android.exoplayer2.util.a.checkNotNull(bundle.getParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)));
    }
}
