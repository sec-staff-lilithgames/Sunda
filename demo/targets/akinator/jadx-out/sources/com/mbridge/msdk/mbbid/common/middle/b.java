package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f41585a;

    /* renamed from: b, reason: collision with root package name */
    private String f41586b;

    /* renamed from: c, reason: collision with root package name */
    private String f41587c;

    /* renamed from: e, reason: collision with root package name */
    private BidListennning f41589e;

    /* renamed from: f, reason: collision with root package name */
    private BidResponsedEx f41590f;

    /* renamed from: g, reason: collision with root package name */
    private int f41591g;

    /* renamed from: i, reason: collision with root package name */
    private long f41593i;

    /* renamed from: j, reason: collision with root package name */
    private long f41594j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41595k;

    /* renamed from: l, reason: collision with root package name */
    private int f41596l;

    /* renamed from: h, reason: collision with root package name */
    private boolean f41592h = false;

    /* renamed from: d, reason: collision with root package name */
    private Context f41588d = com.mbridge.msdk.foundation.controller.c.m().d();

    public b(String str, String str2, String str3) {
        this.f41585a = str;
        this.f41586b = str2;
        this.f41587c = str3;
    }

    public void b(boolean z10) {
        this.f41595k = z10;
    }

    public void b(int i10) {
        this.f41596l = i10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f41597b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f41592h = false;
            b.this.f41590f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f41588d, b.this.f41586b, bidResponsedEx.getBidId(), this.f41597b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f41592h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f41588d, b.this.f41586b, str, this.f41597b);
            b.this.a(str);
        }
    }

    public void b(long j10) {
        this.f41594j = j10;
    }

    public void a(int i10) {
        this.f41591g = i10;
    }

    public void a(long j10) {
        this.f41593i = j10;
    }

    public void a(boolean z10) {
        try {
            if (!this.f41592h) {
                this.f41592h = true;
                if (this.f41588d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f41588d);
                e eVar = new e();
                String strB = com.mbridge.msdk.foundation.controller.c.m().b();
                eVar.a("app_id", strB);
                eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.m().c()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f41586b);
                if (TextUtils.isEmpty(this.f41585a)) {
                    this.f41585a = "";
                }
                eVar.a("placement_id", this.f41585a);
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a("install_ids", c.a());
                }
                eVar.a("bid_floor", this.f41587c);
                eVar.a(e.f40876h, u0.a(this.f41588d, this.f41586b));
                eVar.a(e.f40875g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f41586b, ""));
                String str = "1";
                eVar.a("req_type", this.f41595k ? "1" : "2");
                eVar.a("orientation", l0.F(this.f41588d) + "");
                int i10 = this.f41591g;
                if (i10 == 296) {
                    if (this.f41593i > 0 && this.f41594j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f41594j + "x" + this.f41593i);
                        try {
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f41586b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f41586b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f41593i > 0 && this.f41594j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f41594j + "x" + this.f41593i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f41596l);
                        sb2.append("");
                        eVar.a("orientation", sb2.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = "0";
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f41593i > 0 && this.f41594j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f41594j + "x" + this.f41593i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(u0.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f41585a, this.f41586b, md5);
                aVar2.setUnitId(this.f41586b);
                aVar2.setPlacementId(this.f41585a);
                aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th2) {
            a(th2.getMessage());
        }
    }

    public void a(BidListennning bidListennning) {
        this.f41589e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f41589e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f41589e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
