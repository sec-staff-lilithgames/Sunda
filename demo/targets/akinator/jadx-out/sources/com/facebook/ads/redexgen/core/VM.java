package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class VM implements InterfaceC1420Ns {
    public static VM A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, UK> A00 = new LinkedHashMap<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, 93, 70, 76, 68, 77, 87, 77, 80, 92, 90, 73, 91, 87, 67, 77, 81, 6, 39, 49, 54, 48, 45, 59, 39, 38, 98, 3, 38, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = VM.class.getSimpleName();
    }

    public static VM A00() {
        if (A01 == null) {
            A01 = new VM();
        }
        return A01;
    }

    public final InterfaceC1404Nc A03(String str) {
        UK adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
        strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
        return null;
    }

    public final UK A04(String str) {
        return this.A00.get(str);
    }

    public final UK A05(String str, Messenger messenger, String str2) {
        UK uk2 = new UK(str, messenger, str2);
        this.A00.put(str, uk2);
        return uk2;
    }

    public final void A06() {
        Iterator<Map.Entry<String, UK>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (zHasNext) {
                InterfaceC1404Nc interfaceC1404Nc = it.next().getValue().A00;
                if (interfaceC1404Nc != null) {
                    interfaceC1404Nc.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i10, String str, Bundle bundle, Messenger messenger) throws RemoteException {
        try {
            Message messageObtain = Message.obtain((Handler) null, i10);
            if (str != null) {
                messageObtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                messageObtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        UK uk2 = this.A00.get(str);
        if (uk2 != null && uk2.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            uk2.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1420Ns
    public final void AED(int i10, String str, Bundle bundle) throws RemoteException {
        UK adRecord = A04(str);
        if (adRecord != null) {
            A07(i10, str, bundle, adRecord.A02);
        }
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, UK>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            UK value = it.next().getValue();
            try {
                value.A02.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A03);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (zHasNext) {
                A08((String) it2.next());
            } else {
                return;
            }
        }
    }
}
