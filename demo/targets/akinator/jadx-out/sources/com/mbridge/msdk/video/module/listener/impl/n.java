package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class n extends o {
    private boolean A;
    private int B;
    private boolean C;
    private MBridgeVideoView.u D;

    /* renamed from: x, reason: collision with root package name */
    private IJSFactory f44869x;

    /* renamed from: y, reason: collision with root package name */
    private int f44870y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f44871z;

    public n(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.listener.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        this.f44871z = false;
        this.A = false;
        this.C = false;
        this.f44869x = iJSFactory;
        this.f44870y = i10;
        this.f44871z = i11 == 0;
        this.B = i13;
        if (iJSFactory == null) {
            this.f44847a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    @Override // com.mbridge.msdk.video.module.listener.impl.o, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.n.a(int, java.lang.Object):void");
    }
}
