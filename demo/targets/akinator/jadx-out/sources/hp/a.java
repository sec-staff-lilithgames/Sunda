package hp;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {
    public c decode(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new c(io.bidmachine.media3.common.util.f.fromBundleList(new in.c(0), (ArrayList) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM))), j10, bundle.getLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D));
    }
}
