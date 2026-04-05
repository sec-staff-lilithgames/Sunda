package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class o extends k {

    /* renamed from: n, reason: collision with root package name */
    private boolean f44872n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f44873o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f44874p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f44875q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f44876r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f44877s;

    /* renamed from: t, reason: collision with root package name */
    protected int f44878t;

    /* renamed from: u, reason: collision with root package name */
    private Map<Integer, String> f44879u;

    /* renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.u f44880v;

    /* renamed from: w, reason: collision with root package name */
    private int f44881w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f44882a;

        public a(Object obj) {
            this.f44882a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f44882a;
            if (obj instanceof String) {
                o.this.b((String) obj);
            }
        }
    }

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f44877s = false;
        this.f44878t = 0;
        this.f44881w = -1;
        if (this.f44847a) {
            this.f44879u = campaignEx.getAdvImpList();
        }
        this.f44878t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x014a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:18:0x0026, B:21:0x0031, B:23:0x0040, B:25:0x004b, B:24:0x0048, B:26:0x005c, B:82:0x0164, B:27:0x0064, B:29:0x0077, B:31:0x007b, B:33:0x0081, B:35:0x0086, B:37:0x008a, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00bf, B:46:0x00c8, B:48:0x00cc, B:53:0x00d4, B:54:0x00d8, B:55:0x00eb, B:58:0x00f1, B:60:0x00f5, B:62:0x00fe, B:64:0x0102, B:66:0x0114, B:68:0x0118, B:69:0x0128, B:71:0x012c, B:72:0x0136, B:74:0x0140, B:76:0x0144, B:77:0x014a, B:79:0x014e, B:81:0x0152), top: B:86:0x0006 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.o.a(int, java.lang.Object):void");
    }
}
