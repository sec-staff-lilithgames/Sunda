package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static final int findParagraphByIndex(List<s> paragraphInfoList, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            s sVar = paragraphInfoList.get(i12);
            char c10 = sVar.getStartIndex() > i10 ? (char) 1 : sVar.getEndIndex() <= i10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i11 = i12 + 1;
            } else {
                if (c10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int findParagraphByLineIndex(List<s> paragraphInfoList, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            s sVar = paragraphInfoList.get(i12);
            char c10 = sVar.getStartLineIndex() > i10 ? (char) 1 : sVar.getEndLineIndex() <= i10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i11 = i12 + 1;
            } else {
                if (c10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int findParagraphByY(List<s> paragraphInfoList, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            s sVar = paragraphInfoList.get(i11);
            char c10 = sVar.getTop() > f10 ? (char) 1 : sVar.getBottom() <= f10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }
}
