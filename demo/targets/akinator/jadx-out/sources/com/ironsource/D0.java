package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class D0 {

    /* renamed from: p, reason: collision with root package name */
    private static final int f33931p = -1;

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f33932a;

    /* renamed from: b, reason: collision with root package name */
    private final b f33933b;

    /* renamed from: c, reason: collision with root package name */
    private C0 f33934c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3472u3 f33935d;

    /* renamed from: e, reason: collision with root package name */
    public C3142b9 f33936e;

    /* renamed from: f, reason: collision with root package name */
    public Ab f33937f;

    /* renamed from: g, reason: collision with root package name */
    public Yf f33938g;

    /* renamed from: h, reason: collision with root package name */
    public R1 f33939h;

    /* renamed from: i, reason: collision with root package name */
    public M f33940i;

    /* renamed from: j, reason: collision with root package name */
    public C3185dg f33941j;

    /* renamed from: k, reason: collision with root package name */
    public Vc f33942k;

    /* renamed from: l, reason: collision with root package name */
    private Map<A0, a> f33943l;

    /* renamed from: m, reason: collision with root package name */
    private Map<A0, a> f33944m;

    /* renamed from: n, reason: collision with root package name */
    private Map<A0, a> f33945n;

    /* renamed from: o, reason: collision with root package name */
    private Map<A0, a> f33946o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f33947a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33948b;

        public a(D5 d52, D5 d53) {
            if (d52 != null) {
                this.f33947a = d52.b();
            } else {
                this.f33947a = -1;
            }
            if (d53 != null) {
                this.f33948b = d53.b();
            } else {
                this.f33948b = -1;
            }
        }

        public int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f33947a : this.f33948b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public D0(IronSource.a aVar, b bVar, C0 c02) {
        this(aVar, bVar, c02, a(aVar));
    }

    private static AbstractC3472u3 a(IronSource.a aVar) {
        return aVar.equals(IronSource.a.REWARDED_VIDEO) ? C3147be.i() : H9.i();
    }

    private void d() {
        HashMap map = new HashMap();
        this.f33946o = map;
        map.put(A0.INIT_STARTED, new a(D5.NT_MANAGER_INIT_STARTED, null));
        this.f33946o.put(A0.f33766d, new a(D5.NT_MANAGER_INIT_ENDED, null));
        this.f33946o.put(A0.PLACEMENT_CAPPED, new a(D5.NT_PLACEMENT_CAPPED, null));
        this.f33946o.put(A0.AUCTION_REQUEST, new a(D5.NT_AUCTION_REQUEST, null));
        this.f33946o.put(A0.AUCTION_SUCCESS, new a(D5.NT_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f33946o;
        A0 a02 = A0.AUCTION_FAILED;
        D5 d52 = D5.NT_AUCTION_FAILED;
        map2.put(a02, new a(d52, null));
        this.f33946o.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f33946o.put(A0.AUCTION_REQUEST_WATERFALL, new a(D5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.f33946o.put(A0.AUCTION_RESULT_WATERFALL, new a(D5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.f33946o.put(A0.INIT_SUCCESS, new a(null, null));
        this.f33946o.put(A0.INIT_FAILED, new a(null, null));
        this.f33946o.put(A0.AD_OPENED, new a(D5.NT_CALLBACK_SHOW, D5.NT_INSTANCE_SHOW));
        this.f33946o.put(A0.AD_CLICKED, new a(D5.NT_CALLBACK_CLICK, D5.NT_INSTANCE_CLICK));
        this.f33946o.put(A0.LOAD_AD, new a(D5.NT_LOAD, D5.NT_INSTANCE_LOAD));
        this.f33946o.put(A0.LOAD_AD_SUCCESS, new a(D5.NT_CALLBACK_LOAD_SUCCESS, D5.NT_INSTANCE_LOAD_SUCCESS));
        this.f33946o.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(D5.NT_CALLBACK_LOAD_ERROR, D5.NT_INSTANCE_LOAD_ERROR));
        this.f33946o.put(A0.LOAD_AD_NO_FILL, new a(null, D5.NT_INSTANCE_LOAD_NO_FILL));
        this.f33946o.put(A0.AD_FORMAT_CAPPED, new a(D5.NT_AD_UNIT_CAPPED, null));
        Map<A0, a> map3 = this.f33946o;
        A0 a03 = A0.COLLECT_TOKEN;
        D5 d53 = D5.NT_COLLECT_TOKENS;
        D5 d54 = D5.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(a03, new a(d53, d54));
        this.f33946o.put(A0.COLLECT_TOKENS_COMPLETED, new a(D5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.f33946o.put(A0.COLLECT_TOKENS_FAILED, new a(D5.NT_COLLECT_TOKENS_FAILED, null));
        this.f33946o.put(A0.INSTANCE_COLLECT_TOKEN, new a(d54, null));
        Map<A0, a> map4 = this.f33946o;
        A0 a04 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d55 = D5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(a04, new a(d55, d55));
        Map<A0, a> map5 = this.f33946o;
        A0 a05 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d56 = D5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(a05, new a(d56, d56));
        Map<A0, a> map6 = this.f33946o;
        A0 a06 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d57 = D5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(a06, new a(d57, d57));
        this.f33946o.put(A0.DESTROY_AD, new a(D5.NT_DESTROY, D5.NT_INSTANCE_DESTROY));
        Map<A0, a> map7 = this.f33946o;
        A0 a07 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d58 = D5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(a07, new a(d58, d58));
        Map<A0, a> map8 = this.f33946o;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d59 = D5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(a08, new a(d59, d59));
        Map<A0, a> map9 = this.f33946o;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(a09, new a(d510, d510));
        Map<A0, a> map10 = this.f33946o;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d511 = D5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(a010, new a(d511, d511));
        Map<A0, a> map11 = this.f33946o;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d512 = D5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(a011, new a(d512, d512));
        Map<A0, a> map12 = this.f33946o;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d513 = D5.Z5;
        map12.put(a012, new a(d513, d513));
        Map<A0, a> map13 = this.f33946o;
        A0 a013 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d514 = D5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(a013, new a(d514, d514));
        Map<A0, a> map14 = this.f33946o;
        A0 a014 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d515 = D5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(a014, new a(d515, d515));
        Map<A0, a> map15 = this.f33946o;
        A0 a015 = A0.TROUBLESHOOT_UNEXPECTED_OPENED;
        D5 d516 = D5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(a015, new a(d516, d516));
        Map<A0, a> map16 = this.f33946o;
        A0 a016 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d517 = D5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(a016, new a(d517, d517));
        Map<A0, a> map17 = this.f33946o;
        A0 a017 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d518 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(a017, new a(d518, d518));
        Map<A0, a> map18 = this.f33946o;
        A0 a018 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d519 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(a018, new a(d519, d519));
        this.f33946o.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    public void b() {
        c();
        e();
        a();
        d();
    }

    public void c() {
        HashMap map = new HashMap();
        this.f33943l = map;
        map.put(A0.INIT_STARTED, new a(D5.IS_MANAGER_INIT_STARTED, null));
        this.f33943l.put(A0.f33766d, new a(D5.IS_MANAGER_INIT_ENDED, null));
        this.f33943l.put(A0.SESSION_CAPPED, new a(null, D5.IS_CAP_SESSION));
        this.f33943l.put(A0.PLACEMENT_CAPPED, new a(D5.IS_CAP_PLACEMENT, null));
        this.f33943l.put(A0.CHECK_PLACEMENT_CAPPED, new a(D5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.f33943l.put(A0.AUCTION_REQUEST, new a(D5.IS_AUCTION_REQUEST, null));
        this.f33943l.put(A0.AUCTION_SUCCESS, new a(D5.IS_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f33943l;
        A0 a02 = A0.AUCTION_FAILED;
        D5 d52 = D5.IS_AUCTION_FAILED;
        map2.put(a02, new a(d52, null));
        this.f33943l.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f33943l.put(A0.AUCTION_REQUEST_WATERFALL, new a(D5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.f33943l.put(A0.AUCTION_RESULT_WATERFALL, new a(D5.IS_RESULT_WATERFALL, null));
        this.f33943l.put(A0.INIT_SUCCESS, new a(null, null));
        this.f33943l.put(A0.INIT_FAILED, new a(null, null));
        this.f33943l.put(A0.AD_OPENED, new a(null, D5.IS_INSTANCE_OPENED));
        this.f33943l.put(A0.AD_CLOSED, new a(D5.IS_CALLBACK_AD_CLOSED, D5.IS_INSTANCE_CLOSED));
        this.f33943l.put(A0.AD_CLICKED, new a(D5.IS_CALLBACK_AD_CLICKED, D5.IS_INSTANCE_CLICKED));
        this.f33943l.put(A0.AD_INFO_CHANGED, new a(D5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.f33943l.put(A0.LOAD_AD, new a(D5.IS_LOAD_CALLED, D5.IS_INSTANCE_LOAD));
        this.f33943l.put(A0.LOAD_AD_SUCCESS, new a(D5.IS_CALLBACK_LOAD_SUCCESS, D5.IS_INSTANCE_LOAD_SUCCESS));
        this.f33943l.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(D5.IS_CALLBACK_LOAD_ERROR, D5.IS_INSTANCE_LOAD_FAILED));
        this.f33943l.put(A0.LOAD_AD_NO_FILL, new a(null, D5.IS_INSTANCE_LOAD_NO_FILL));
        this.f33943l.put(A0.SHOW_AD, new a(D5.IS_SHOW_CALLED, D5.IS_INSTANCE_SHOW));
        this.f33943l.put(A0.SHOW_AD_FAILED, new a(D5.IS_CALLBACK_AD_SHOW_ERROR, D5.IS_INSTANCE_SHOW_FAILED));
        this.f33943l.put(A0.AD_FORMAT_CAPPED, new a(D5.IS_AD_FORMAT_CAPPED, null));
        this.f33943l.put(A0.AD_UNIT_CAPPED, new a(D5.IS_AD_UNIT_CAPPED, null));
        this.f33943l.put(A0.COLLECT_TOKEN, new a(D5.IS_COLLECT_TOKENS, null));
        this.f33943l.put(A0.COLLECT_TOKENS_COMPLETED, new a(D5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.f33943l.put(A0.COLLECT_TOKENS_FAILED, new a(D5.IS_COLLECT_TOKENS_FAILED, null));
        this.f33943l.put(A0.INSTANCE_COLLECT_TOKEN, new a(D5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.f33943l.put(A0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(D5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.f33943l.put(A0.INSTANCE_COLLECT_TOKEN_FAILED, new a(D5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.f33943l.put(A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(D5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.f33943l.put(A0.AD_READY_TRUE, new a(D5.IS_CHECK_READY_TRUE, null));
        this.f33943l.put(A0.AD_READY_FALSE, new a(D5.IS_CHECK_READY_FALSE, null));
        this.f33943l.put(A0.OPERATIONAL_LOAD_AD, new a(D5.IS_OPERATIONAL_LOAD_AD, null));
        this.f33943l.put(A0.OPERATIONAL_LOAD_SUCCESS, new a(D5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.f33943l.put(A0.OPERATIONAL_LOAD_FAILED, new a(D5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.f33943l.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.IS_SET_CONFIGURATION, null));
        Map<A0, a> map3 = this.f33943l;
        A0 a03 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d53 = D5.f34161z4;
        map3.put(a03, new a(d53, d53));
        Map<A0, a> map4 = this.f33943l;
        A0 a04 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d54 = D5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(a04, new a(d54, d54));
        Map<A0, a> map5 = this.f33943l;
        A0 a05 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d55 = D5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(a05, new a(d55, d55));
        Map<A0, a> map6 = this.f33943l;
        A0 a06 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d56 = D5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(a06, new a(d56, d56));
        Map<A0, a> map7 = this.f33943l;
        A0 a07 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d57 = D5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(a07, new a(d57, d57));
        Map<A0, a> map8 = this.f33943l;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d58 = D5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(a08, new a(d58, d58));
        Map<A0, a> map9 = this.f33943l;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d59 = D5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(a09, new a(d59, d59));
        Map<A0, a> map10 = this.f33943l;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(a010, new a(d510, d510));
        Map<A0, a> map11 = this.f33943l;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        D5 d511 = D5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(a011, new a(d511, d511));
        Map<A0, a> map12 = this.f33943l;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d512 = D5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(a012, new a(d512, d512));
        Map<A0, a> map13 = this.f33943l;
        A0 a013 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d513 = D5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(a013, new a(d513, d513));
        Map<A0, a> map14 = this.f33943l;
        A0 a014 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d514 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(a014, new a(d514, d514));
        Map<A0, a> map15 = this.f33943l;
        A0 a015 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d515 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(a015, new a(d515, d515));
        this.f33943l.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<A0, a> map16 = this.f33943l;
        A0 a016 = A0.TROUBLESHOOT_AD_EXPIRED;
        D5 d516 = D5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(a016, new a(d516, d516));
        this.f33943l.put(A0.TROUBLESHOOT_LOAD, new a(D5.TROUBLESHOOTING_IS_LOAD, null));
        this.f33943l.put(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(D5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.f33943l.put(A0.TROUBLESHOOT_LOAD_SUCCESS, new a(D5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.f33943l.put(A0.TROUBLESHOOT_LOAD_FAILED, new a(D5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.f33943l.put(A0.TROUBLESHOOT_SHOW, new a(D5.TROUBLESHOOTING_IS_SHOW, null));
        this.f33943l.put(A0.TROUBLESHOOT_SHOW_SUCCESS, new a(D5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.f33943l.put(A0.TROUBLESHOOT_SHOW_FAILED, new a(D5.S4, null));
        Map<A0, a> map17 = this.f33943l;
        A0 a017 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d517 = D5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(a017, new a(d517, d517));
        this.f33943l.put(A0.TROUBLESHOOT_AD_INFO_CHANGED, new a(D5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.f33943l.put(A0.TROUBLESHOOT_DISPOSE, new a(D5.TROUBLESHOOTING_IS_DISPOSE, null));
    }

    public void e() {
        HashMap map = new HashMap();
        this.f33944m = map;
        map.put(A0.INIT_STARTED, new a(D5.RV_MANAGER_INIT_STARTED, null));
        this.f33944m.put(A0.f33766d, new a(D5.RV_MANAGER_INIT_ENDED, null));
        this.f33944m.put(A0.SESSION_CAPPED, new a(null, D5.RV_CAP_SESSION));
        this.f33944m.put(A0.PLACEMENT_CAPPED, new a(D5.RV_CAP_PLACEMENT, null));
        this.f33944m.put(A0.CHECK_PLACEMENT_CAPPED, new a(D5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.f33944m.put(A0.AUCTION_REQUEST, new a(D5.RV_AUCTION_REQUEST, null));
        this.f33944m.put(A0.AUCTION_SUCCESS, new a(D5.RV_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f33944m;
        A0 a02 = A0.AUCTION_FAILED;
        D5 d52 = D5.RV_AUCTION_FAILED;
        map2.put(a02, new a(d52, null));
        this.f33944m.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f33944m.put(A0.AUCTION_REQUEST_WATERFALL, new a(D5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.f33944m.put(A0.AUCTION_RESULT_WATERFALL, new a(D5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.f33944m.put(A0.INIT_SUCCESS, new a(null, null));
        this.f33944m.put(A0.INIT_FAILED, new a(null, null));
        this.f33944m.put(A0.AD_VISIBLE, new a(null, D5.RV_INSTANCE_VISIBLE));
        this.f33944m.put(A0.AD_OPENED, new a(null, D5.RV_BUSINESS_INSTANCE_OPENED));
        this.f33944m.put(A0.AD_CLOSED, new a(null, D5.RV_INSTANCE_CLOSED));
        this.f33944m.put(A0.AD_STARTED, new a(null, D5.RV_INSTANCE_STARTED));
        this.f33944m.put(A0.AD_ENDED, new a(null, D5.RV_INSTANCE_ENDED));
        this.f33944m.put(A0.AD_CLICKED, new a(D5.RV_CALLBACK_AD_CLICKED, D5.RV_BUSINESS_INSTANCE_CLICKED));
        this.f33944m.put(A0.AD_INFO_CHANGED, new a(D5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.f33944m.put(A0.AD_REWARDED, new a(null, D5.RV_BUSINESS_INSTANCE_REWARDED));
        this.f33944m.put(A0.AD_AVAILABILITY_CHANGED_TRUE, new a(D5.f34029i0, D5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f33944m.put(A0.AD_AVAILABILITY_CHANGED_FALSE, new a(D5.RV_CALLBACK_AVAILABILITY_FALSE, D5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f33944m.put(A0.LOAD_AD, new a(D5.RV_BUSINESS_MEDIATION_LOAD, D5.RV_BUSINESS_INSTANCE_LOAD));
        this.f33944m.put(A0.LOAD_AD_SUCCESS, new a(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.f33944m.put(A0.LOAD_AD_FAILED, new a(null, D5.RV_INSTANCE_LOAD_FAILED));
        this.f33944m.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(D5.RV_MEDIATION_LOAD_ERROR, D5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f33944m.put(A0.LOAD_AD_NO_FILL, new a(null, D5.RV_INSTANCE_LOAD_NO_FILL));
        this.f33944m.put(A0.SHOW_AD, new a(D5.RV_API_SHOW_CALLED, D5.f34093q0));
        this.f33944m.put(A0.SHOW_AD_CHANCE, new a(null, D5.RV_INSTANCE_SHOW_CHANCE));
        this.f33944m.put(A0.SHOW_AD_FAILED, new a(D5.RV_CALLBACK_SHOW_FAILED, D5.RV_INSTANCE_SHOW_FAILED));
        this.f33944m.put(A0.AD_FORMAT_CAPPED, new a(D5.RV_AD_UNIT_CAPPED, null));
        this.f33944m.put(A0.COLLECT_TOKEN, new a(D5.RV_COLLECT_TOKENS, null));
        this.f33944m.put(A0.COLLECT_TOKENS_COMPLETED, new a(D5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.f33944m.put(A0.COLLECT_TOKENS_FAILED, new a(D5.RV_COLLECT_TOKENS_FAILED, null));
        this.f33944m.put(A0.INSTANCE_COLLECT_TOKEN, new a(D5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<A0, a> map3 = this.f33944m;
        A0 a03 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d53 = D5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(a03, new a(d53, d53));
        Map<A0, a> map4 = this.f33944m;
        A0 a04 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d54 = D5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(a04, new a(d54, d54));
        Map<A0, a> map5 = this.f33944m;
        A0 a05 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d55 = D5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(a05, new a(d55, d55));
        this.f33944m.put(A0.AD_READY_TRUE, new a(D5.RV_CHECK_READY_TRUE, null));
        this.f33944m.put(A0.AD_READY_FALSE, new a(D5.RV_CHECK_READY_FALSE, null));
        this.f33944m.put(A0.OPERATIONAL_LOAD_AD, new a(D5.RV_OPERATIONAL_LOAD_AD, null));
        this.f33944m.put(A0.OPERATIONAL_LOAD_SUCCESS, new a(D5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.f33944m.put(A0.OPERATIONAL_LOAD_FAILED, new a(D5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.f33944m.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.RV_SET_CONFIGURATION, null));
        Map<A0, a> map6 = this.f33944m;
        A0 a06 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d56 = D5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(a06, new a(d56, d56));
        Map<A0, a> map7 = this.f33944m;
        A0 a07 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d57 = D5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(a07, new a(d57, d57));
        Map<A0, a> map8 = this.f33944m;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d58 = D5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(a08, new a(d58, d58));
        Map<A0, a> map9 = this.f33944m;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d59 = D5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(a09, new a(d59, d59));
        Map<A0, a> map10 = this.f33944m;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(a010, new a(d510, d510));
        Map<A0, a> map11 = this.f33944m;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d511 = D5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(a011, new a(d511, d511));
        Map<A0, a> map12 = this.f33944m;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d512 = D5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(a012, new a(d512, d512));
        Map<A0, a> map13 = this.f33944m;
        A0 a013 = A0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        D5 d513 = D5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(a013, new a(d513, d513));
        Map<A0, a> map14 = this.f33944m;
        A0 a014 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d514 = D5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(a014, new a(d514, d514));
        Map<A0, a> map15 = this.f33944m;
        A0 a015 = A0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        D5 d515 = D5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(a015, new a(d515, d515));
        Map<A0, a> map16 = this.f33944m;
        A0 a016 = A0.TROUBLESHOOT_LOAD_FAILED;
        D5 d516 = D5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(a016, new a(d516, d516));
        Map<A0, a> map17 = this.f33944m;
        A0 a017 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d517 = D5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(a017, new a(d517, d517));
        Map<A0, a> map18 = this.f33944m;
        A0 a018 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d518 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(a018, new a(d518, d518));
        Map<A0, a> map19 = this.f33944m;
        A0 a019 = A0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        D5 d519 = D5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(a019, new a(d519, d519));
        this.f33944m.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<A0, a> map20 = this.f33944m;
        A0 a020 = A0.TROUBLESHOOT_AD_EXPIRED;
        D5 d520 = D5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(a020, new a(d520, d520));
        this.f33944m.put(A0.TROUBLESHOOT_LOAD, new a(D5.TROUBLESHOOTING_RV_LOAD, null));
        this.f33944m.put(A0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(D5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.f33944m.put(A0.TROUBLESHOOT_LOAD_SUCCESS, new a(D5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.f33944m.put(A0.TROUBLESHOOT_SHOW, new a(D5.TROUBLESHOOTING_RV_SHOW, null));
        this.f33944m.put(A0.TROUBLESHOOT_SHOW_SUCCESS, new a(D5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.f33944m.put(A0.TROUBLESHOOT_SHOW_FAILED, new a(D5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<A0, a> map21 = this.f33944m;
        A0 a021 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d521 = D5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(a021, new a(d521, d521));
        this.f33944m.put(A0.TROUBLESHOOT_AD_INFO_CHANGED, new a(D5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.f33944m.put(A0.TROUBLESHOOT_DISPOSE, new a(D5.TROUBLESHOOTING_RV_DISPOSE, null));
    }

    public void f() {
        this.f33934c = null;
        this.f33938g = null;
        this.f33939h = null;
        this.f33936e = null;
        this.f33937f = null;
        this.f33940i = null;
        this.f33941j = null;
        this.f33942k = null;
    }

    public D0(IronSource.a aVar, b bVar, C0 c02, AbstractC3472u3 abstractC3472u3) {
        this.f33932a = aVar;
        this.f33933b = bVar;
        this.f33934c = c02;
        this.f33935d = abstractC3472u3 == null ? a(aVar) : abstractC3472u3;
        b();
        this.f33936e = new C3142b9(this);
        this.f33937f = new Ab(this);
        this.f33938g = new Yf(this);
        this.f33939h = new R1(this);
        this.f33940i = new M(this);
        this.f33941j = new C3185dg(this);
        this.f33942k = new Vc(this);
    }

    public void a(A0 a02, Map<String, Object> map) {
        a(a02, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(A0 a02, Map<String, Object> map, long j10) {
        int iA = a(a02);
        if (-1 == iA) {
            return;
        }
        HashMap map2 = new HashMap();
        C0 c02 = this.f33934c;
        if (c02 != null) {
            map2.putAll(c02.a(a02));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f33935d.a(new C5(iA, j10, new JSONObject(map2)));
    }

    private int a(A0 a02) {
        try {
            if (IronSource.a.f37252c.equals(this.f33932a) && this.f33943l.containsKey(a02)) {
                return this.f33943l.get(a02).a(this.f33933b);
            }
            if (IronSource.a.REWARDED_VIDEO.equals(this.f33932a) && this.f33944m.containsKey(a02)) {
                return this.f33944m.get(a02).a(this.f33933b);
            }
            if (IronSource.a.BANNER.equals(this.f33932a) && this.f33945n.containsKey(a02)) {
                return this.f33945n.get(a02).a(this.f33933b);
            }
            if (IronSource.a.NATIVE_AD.equals(this.f33932a) && this.f33946o.containsKey(a02)) {
                return this.f33946o.get(a02).a(this.f33933b);
            }
            return -1;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1;
        }
    }

    public void a() {
        HashMap map = new HashMap();
        this.f33945n = map;
        map.put(A0.INIT_STARTED, new a(D5.BN_MANAGER_INIT_STARTED, null));
        this.f33945n.put(A0.f33766d, new a(D5.BN_MANAGER_INIT_ENDED, null));
        this.f33945n.put(A0.PLACEMENT_CAPPED, new a(D5.BN_PLACEMENT_CAPPED, null));
        this.f33945n.put(A0.AUCTION_REQUEST, new a(D5.BN_AUCTION_REQUEST, null));
        this.f33945n.put(A0.AUCTION_SUCCESS, new a(D5.BN_AUCTION_SUCCESS, null));
        Map<A0, a> map2 = this.f33945n;
        A0 a02 = A0.AUCTION_FAILED;
        D5 d52 = D5.BN_AUCTION_FAILED;
        map2.put(a02, new a(d52, null));
        this.f33945n.put(A0.AUCTION_FAILED_NO_CANDIDATES, new a(d52, null));
        this.f33945n.put(A0.AUCTION_REQUEST_WATERFALL, new a(D5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f33945n.put(A0.AUCTION_RESULT_WATERFALL, new a(D5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f33945n.put(A0.INIT_SUCCESS, new a(null, null));
        this.f33945n.put(A0.INIT_FAILED, new a(null, null));
        this.f33945n.put(A0.AD_OPENED, new a(D5.BN_CALLBACK_SHOW, D5.BN_INSTANCE_SHOW));
        this.f33945n.put(A0.SHOW_AD_FAILED, new a(D5.BN_CALLBACK_SHOW_FAILED, D5.BN_INSTANCE_SHOW_FAILED));
        this.f33945n.put(A0.AD_CLICKED, new a(D5.BN_CALLBACK_CLICK, D5.BN_INSTANCE_CLICK));
        this.f33945n.put(A0.LOAD_AD, new a(D5.BN_LOAD, D5.BN_INSTANCE_LOAD));
        this.f33945n.put(A0.RELOAD_AD, new a(D5.BN_RELOAD, D5.BN_INSTANCE_RELOAD));
        this.f33945n.put(A0.LOAD_AD_SUCCESS, new a(D5.BN_CALLBACK_LOAD_SUCCESS, D5.BN_INSTANCE_LOAD_SUCCESS));
        this.f33945n.put(A0.RELOAD_AD_SUCCESS, new a(D5.BN_CALLBACK_RELOAD_SUCCESS, D5.BN_INSTANCE_RELOAD_SUCCESS));
        this.f33945n.put(A0.LOAD_AD_FAILED_WITH_REASON, new a(D5.BN_CALLBACK_LOAD_ERROR, D5.BN_INSTANCE_LOAD_ERROR));
        this.f33945n.put(A0.RELOAD_AD_FAILED_WITH_REASON, new a(D5.BN_CALLBACK_RELOAD_ERROR, D5.BN_INSTANCE_RELOAD_ERROR));
        this.f33945n.put(A0.LOAD_AD_NO_FILL, new a(null, D5.BN_INSTANCE_LOAD_NO_FILL));
        this.f33945n.put(A0.RELOAD_AD_NO_FILL, new a(null, D5.BN_INSTANCE_RELOAD_NO_FILL));
        this.f33945n.put(A0.AD_FORMAT_CAPPED, new a(D5.BN_AD_UNIT_CAPPED, null));
        this.f33945n.put(A0.COLLECT_TOKEN, new a(D5.BN_COLLECT_TOKENS, null));
        this.f33945n.put(A0.COLLECT_TOKENS_COMPLETED, new a(D5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f33945n.put(A0.COLLECT_TOKENS_FAILED, new a(D5.BN_COLLECT_TOKENS_FAILED, null));
        this.f33945n.put(A0.INSTANCE_COLLECT_TOKEN, new a(D5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<A0, a> map3 = this.f33945n;
        A0 a03 = A0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        D5 d53 = D5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(a03, new a(d53, d53));
        Map<A0, a> map4 = this.f33945n;
        A0 a04 = A0.INSTANCE_COLLECT_TOKEN_FAILED;
        D5 d54 = D5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(a04, new a(d54, d54));
        Map<A0, a> map5 = this.f33945n;
        A0 a05 = A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        D5 d55 = D5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(a05, new a(d55, d55));
        this.f33945n.put(A0.DESTROY_AD, new a(D5.BN_DESTROY, D5.BN_INSTANCE_DESTROY));
        this.f33945n.put(A0.SKIP_RELOAD_AD, new a(D5.BN_SKIP_RELOAD, null));
        this.f33945n.put(A0.AD_LEFT_APPLICATION, new a(D5.BN_CALLBACK_LEAVE_APP, D5.BN_INSTANCE_LEAVE_APP));
        this.f33945n.put(A0.AD_PRESENT_SCREEN, new a(D5.BN_CALLBACK_PRESENT_SCREEN, D5.BN_INSTANCE_PRESENT_SCREEN));
        this.f33945n.put(A0.AD_DISMISS_SCREEN, new a(D5.BN_CALLBACK_DISMISS_SCREEN, D5.BN_INSTANCE_DISMISS_SCREEN));
        this.f33945n.put(A0.AD_VIEW_BOUND, new a(D5.BN_BOUND, D5.BN_INSTANCE_BOUND));
        this.f33945n.put(A0.PAUSE_AD, new a(D5.BN_REFRESH_PAUSE, null));
        this.f33945n.put(A0.RESUME_AD, new a(D5.BN_REFRESH_RESUME, null));
        this.f33945n.put(A0.OPERATIONAL_SET_CONFIGURATIONS, new a(D5.BN_SET_CONFIGURATION, null));
        Map<A0, a> map6 = this.f33945n;
        A0 a06 = A0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        D5 d56 = D5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(a06, new a(d56, d56));
        Map<A0, a> map7 = this.f33945n;
        A0 a07 = A0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        D5 d57 = D5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(a07, new a(d57, d57));
        Map<A0, a> map8 = this.f33945n;
        A0 a08 = A0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        D5 d58 = D5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(a08, new a(d58, d58));
        Map<A0, a> map9 = this.f33945n;
        A0 a09 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        D5 d59 = D5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(a09, new a(d59, d59));
        Map<A0, a> map10 = this.f33945n;
        A0 a010 = A0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        D5 d510 = D5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(a010, new a(d510, d510));
        Map<A0, a> map11 = this.f33945n;
        A0 a011 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        D5 d511 = D5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(a011, new a(d511, d511));
        Map<A0, a> map12 = this.f33945n;
        A0 a012 = A0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        D5 d512 = D5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(a012, new a(d512, d512));
        Map<A0, a> map13 = this.f33945n;
        A0 a013 = A0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        D5 d513 = D5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(a013, new a(d513, d513));
        Map<A0, a> map14 = this.f33945n;
        A0 a014 = A0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        D5 d514 = D5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(a014, new a(d514, d514));
        Map<A0, a> map15 = this.f33945n;
        A0 a015 = A0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        D5 d515 = D5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(a015, new a(d515, d515));
        Map<A0, a> map16 = this.f33945n;
        A0 a016 = A0.TROUBLESHOOT_UNEXPECTED_OPENED;
        D5 d516 = D5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(a016, new a(d516, d516));
        Map<A0, a> map17 = this.f33945n;
        A0 a017 = A0.TROUBLESHOOT_INTERNAL_ERROR;
        D5 d517 = D5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(a017, new a(d517, d517));
        Map<A0, a> map18 = this.f33945n;
        A0 a018 = A0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        D5 d518 = D5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(a018, new a(d518, d518));
        Map<A0, a> map19 = this.f33945n;
        A0 a019 = A0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        D5 d519 = D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(a019, new a(d519, d519));
        this.f33945n.put(A0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(D5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f33945n.put(A0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(D5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f33945n.put(A0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(D5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f33945n.put(A0.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, null));
        this.f33945n.put(A0.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, null));
        this.f33945n.put(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f33945n.put(A0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<A0, a> map20 = this.f33945n;
        A0 a020 = A0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        D5 d520 = D5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(a020, new a(d520, d520));
        Map<A0, a> map21 = this.f33945n;
        A0 a021 = A0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        D5 d521 = D5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(a021, new a(d521, d521));
        Map<A0, a> map22 = this.f33945n;
        A0 a022 = A0.TROUBLESHOOT_ILLEGAL_STATE;
        D5 d522 = D5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(a022, new a(d522, d522));
        this.f33945n.put(A0.R0, new a(D5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<A0, a> map23 = this.f33945n;
        A0 a023 = A0.TROUBLESHOOT_LOAD_SKIPPED;
        D5 d523 = D5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(a023, new a(d523, d523));
    }
}
