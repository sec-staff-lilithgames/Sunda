package io.bidmachine;

import io.bidmachine.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.a f61970a;

    public p(q.a aVar) {
        this.f61970a = aVar;
    }

    @Override // io.bidmachine.s3
    public void onFail(pr.a aVar) {
        q.a aVar2 = this.f61970a;
        NetworkAdUnitManager networkAdUnitManager = aVar2.f61982d;
        networkAdUnitManager.notifyNetworkAuctionResult(null);
        networkAdUnitManager.notifyNetworkClearAuction();
        o oVarA = aVar2.a();
        if (oVarA != null) {
            ((h) oVarA).onFail(aVar);
        }
        aVar2.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:19:0x004c, B:20:0x005a, B:22:0x0060, B:25:0x0071, B:28:0x007d, B:34:0x008f, B:36:0x0097, B:39:0x009d, B:42:0x00a7, B:44:0x00b9, B:50:0x00c5, B:52:0x00cc, B:56:0x00da, B:58:0x00ec, B:64:0x00f9, B:66:0x0105, B:67:0x010e, B:69:0x0110, B:70:0x0115), top: B:82:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:19:0x004c, B:20:0x005a, B:22:0x0060, B:25:0x0071, B:28:0x007d, B:34:0x008f, B:36:0x0097, B:39:0x009d, B:42:0x00a7, B:44:0x00b9, B:50:0x00c5, B:52:0x00cc, B:56:0x00da, B:58:0x00ec, B:64:0x00f9, B:66:0x0105, B:67:0x010e, B:69:0x0110, B:70:0x0115), top: B:82:0x004c }] */
    @Override // io.bidmachine.s3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(io.bidmachine.n r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.p.onSuccess(io.bidmachine.n):void");
    }
}
