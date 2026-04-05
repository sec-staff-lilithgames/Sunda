package qn;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f83387a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f83388b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f83389c;

    public p(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f83387a = arrayList;
        this.f83388b = arrayList2;
        this.f83389c = arrayList3;
    }

    public static p compile(String str) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i10 = length + 1;
                int iIndexOf2 = str.indexOf("$", i10);
                String strSubstring2 = str.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(str));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new p(arrayList, arrayList2, arrayList3);
    }

    public String buildUri(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f83388b;
            int size = arrayList.size();
            ArrayList arrayList2 = this.f83387a;
            if (i11 >= size) {
                sb2.append((String) arrayList2.get(arrayList.size()));
                return sb2.toString();
            }
            sb2.append((String) arrayList2.get(i11));
            if (((Integer) arrayList.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i11)).intValue();
                ArrayList arrayList3 = this.f83389c;
                if (iIntValue == 2) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i11), Long.valueOf(j10)));
                } else if (((Integer) arrayList.get(i11)).intValue() == 3) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i11), Integer.valueOf(i10)));
                } else if (((Integer) arrayList.get(i11)).intValue() == 4) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i11), Long.valueOf(j11)));
                }
            }
            i11++;
        }
    }
}
