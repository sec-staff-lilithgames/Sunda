package com.mbridge.msdk.foundation.same.net.utils;

import i2.hQ.aTNDubNmpwAqdU;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    public static String a(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i10 = aVar.f40804a;
            com.mbridge.msdk.foundation.same.net.toolbox.a aVar2 = aVar.f40806c;
            int i11 = aVar2 != null ? aVar2.f40827d : 0;
            if (i10 == -2) {
                return "Network is canceled";
            }
            if (i10 == 15) {
                return "Network error,I/O exception contents null";
            }
            if (i10 == 880023) {
                return "timeout";
            }
            if (i10 == 880041) {
                return "Network error,UnknownHostException";
            }
            switch (i10) {
                case 1:
                    return "Network error,Load failed";
                case 2:
                    return "Network error,I/O exception";
                case 3:
                    return "Network error,timeout exception";
                case 4:
                    return "Network unknown error";
                case 5:
                    return "Network error，https is not work,please check your phone time";
                case 6:
                    if (i11 == 0) {
                        return "Network error,please check ";
                    }
                    return "Network error,please check state code " + i11;
                case 7:
                    if (i11 == 0) {
                        return "The server returns an exception ";
                    }
                    return "The server returns an exception state code " + i11;
                case 8:
                    return aTNDubNmpwAqdU.SWOfzYBRlieHPO;
                default:
                    switch (i10) {
                        case 10:
                            return "Network error,socket timeout exception";
                        case 11:
                            return "Network error，sslp exception";
                        case 12:
                            return "Network error,ConnectException";
                        case 13:
                            if (aVar2 == null) {
                                return "Unknown socket exception";
                            }
                            byte[] bArr = aVar2.f40824a;
                            return bArr != null ? new String(bArr) : "Socket exception message is NULL";
                        default:
                            return "Network error,unknown";
                    }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
