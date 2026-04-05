package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack$StickerTrackType;", "", "mStickerType", "", "mStickerAssetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.hd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2196hd {
    public static byte[] A02;
    public static String[] A03 = {"UaYcJDGxQyaZYV7vRv1nPrflhYMBWqQe", "6yYvkhfbIG9oN01QKIOx9", "TeUZgJzSwWL81PBp6", "205jmoWHsbHcJl4QFaaCvtd", "NFAExz9NEdor6lQkpg8BD3N5DW6Xy44K", "QZaiBJjrvYgY5dxzbw", "eBiw2bgKjDo5EjxpOMDObbhcrDI", "qkjfNEnz7dbj0"};
    public final String A00;
    public final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[7].length() == 31) {
                throw new RuntimeException();
            }
            A03[7] = "9uDvm5O3I8RCic4D8S6P5ptdUUAijK";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            if (A03[3].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "JRltFSleplkDTMCU5v";
            strArr[1] = "ayXcNP7Oa4FMyjQsHUKYa";
            bArrCopyOfRange[i13] = b10;
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{50, 24, 57, 46, 40, 48, 42, 55, 6, 56, 56, 42, 57, 14, 41, 72, 46, 79, 68, 62, 70, 64, 77, 47, 84, 75, 64};
    }

    static {
        A01();
    }

    public C2196hd(String str, String str2) {
        C2628p6.A09(str, A00(15, 12, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        C2628p6.A09(str2, A00(0, 15, 97));
        this.A01 = str;
        this.A00 = str2;
    }
}
