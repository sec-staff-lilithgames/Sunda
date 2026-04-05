package tv;

import ao.kwoC.zAQQWzBxnS;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m extends k {
    public static final i durationUnitByIsoChar(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return i.f87445j;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return i.f87444i;
        }
        if (c10 == 'M') {
            return i.f87443h;
        }
        if (c10 == 'S') {
            return i.f87442g;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    public static final String shortName(i iVar) {
        e0.checkNotNullParameter(iVar, "<this>");
        switch (l.$EnumSwitchMapping$0[iVar.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return ApsMetricsDataMap.APSMETRICS_FIELD_SDK;
            case 5:
                return "m";
            case 6:
                return ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME;
            case 7:
                return DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;
            default:
                throw new IllegalStateException(("Unknown unit: " + iVar).toString());
        }
    }

    public static final i durationUnitByShortName(String shortName) {
        e0.checkNotNullParameter(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return i.f87440e;
                                }
                            } else if (shortName.equals("ns")) {
                                return i.f87439c;
                            }
                        } else if (shortName.equals("ms")) {
                            return i.f87441f;
                        }
                    } else if (shortName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_SDK)) {
                        return i.f87442g;
                    }
                } else if (shortName.equals(zAQQWzBxnS.KGZqrkbcsdQoN)) {
                    return i.f87443h;
                }
            } else if (shortName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME)) {
                return i.f87444i;
            }
        } else if (shortName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
            return i.f87445j;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: ".concat(shortName));
    }
}
