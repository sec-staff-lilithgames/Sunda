package com.mbridge.msdk.out;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface WebLoadListener {
    void onFailed(String str, int i10, int i11, int i12, String str2, String str3);

    void onProgress(String str, int i10, int i11, int i12, String str2, String str3);

    void onSucess(String str, int i10, int i11, int i12, String str2, String str3);
}
