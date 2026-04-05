package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.Interceptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:39:0x00ac, B:41:0x00b5, B:44:0x00bd, B:46:0x00e7, B:48:0x00f0, B:49:0x00f3, B:50:0x0117, B:54:0x0122, B:56:0x0141, B:58:0x014f, B:65:0x0165, B:67:0x016b, B:71:0x0178, B:73:0x018d, B:74:0x0195, B:75:0x019f, B:60:0x015a, B:55:0x0131), top: B:83:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:39:0x00ac, B:41:0x00b5, B:44:0x00bd, B:46:0x00e7, B:48:0x00f0, B:49:0x00f3, B:50:0x0117, B:54:0x0122, B:56:0x0141, B:58:0x014f, B:65:0x0165, B:67:0x016b, B:71:0x0178, B:73:0x018d, B:74:0x0195, B:75:0x019f, B:60:0x015a, B:55:0x0131), top: B:83:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:39:0x00ac, B:41:0x00b5, B:44:0x00bd, B:46:0x00e7, B:48:0x00f0, B:49:0x00f3, B:50:0x0117, B:54:0x0122, B:56:0x0141, B:58:0x014f, B:65:0x0165, B:67:0x016b, B:71:0x0178, B:73:0x018d, B:74:0x0195, B:75:0x019f, B:60:0x015a, B:55:0x0131), top: B:83:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:39:0x00ac, B:41:0x00b5, B:44:0x00bd, B:46:0x00e7, B:48:0x00f0, B:49:0x00f3, B:50:0x0117, B:54:0x0122, B:56:0x0141, B:58:0x014f, B:65:0x0165, B:67:0x016b, B:71:0x0178, B:73:0x018d, B:74:0x0195, B:75:0x019f, B:60:0x015a, B:55:0x0131), top: B:83:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:39:0x00ac, B:41:0x00b5, B:44:0x00bd, B:46:0x00e7, B:48:0x00f0, B:49:0x00f3, B:50:0x0117, B:54:0x0122, B:56:0x0141, B:58:0x014f, B:65:0x0165, B:67:0x016b, B:71:0x0178, B:73:0x018d, B:74:0x0195, B:75:0x019f, B:60:0x015a, B:55:0x0131), top: B:83:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178 A[Catch: IOException -> 0x00ba, TryCatch #0 {IOException -> 0x00ba, blocks: (B:39:0x00ac, B:41:0x00b5, B:44:0x00bd, B:46:0x00e7, B:48:0x00f0, B:49:0x00f3, B:50:0x0117, B:54:0x0122, B:56:0x0141, B:58:0x014f, B:65:0x0165, B:67:0x016b, B:71:0x0178, B:73:0x018d, B:74:0x0195, B:75:0x019f, B:60:0x015a, B:55:0x0131), top: B:83:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    @Override // com.applovin.shadow.okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.shadow.okhttp3.Response intercept(com.applovin.shadow.okhttp3.Interceptor.Chain r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http.CallServerInterceptor.intercept(com.applovin.shadow.okhttp3.Interceptor$Chain):com.applovin.shadow.okhttp3.Response");
    }
}
