package com.ironsource;

import com.ironsource.C3434s;
import com.ironsource.S7;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Jd {

    /* renamed from: a, reason: collision with root package name */
    private final C3514wb f34718a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, C3434s.d> f34719b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, C3434s.d> f34720c;

    public Jd(C3514wb tools, Map<String, C3434s.d> map, Map<String, C3434s.d> map2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        this.f34718a = tools;
        this.f34719b = map;
        this.f34720c = map2;
    }

    private final void b(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (tu.z.m7137isSuccessimpl(objA)) {
            kotlin.jvm.internal.e0.checkNotNull(str2);
            kotlin.jvm.internal.e0.checkNotNull(num);
            aVar.a(str, str2, num.intValue());
        }
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objA);
        if (thM7134exceptionOrNullimpl != null) {
            this.f34718a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thM7134exceptionOrNullimpl.getMessage());
        }
    }

    public final void a(S7.a rewardService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C3434s.d> map = this.f34720c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C3434s.d> entry : map.entrySet()) {
                String key = entry.getKey();
                Hd hdF = entry.getValue().f();
                if (hdF != null) {
                    b(rewardService, key, hdF.b(), hdF.a());
                }
            }
        }
        Map<String, C3434s.d> map2 = this.f34719b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C3434s.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            Hd hdA = entry2.getValue().a();
            if (hdA != null) {
                a(rewardService, key2, hdA.b(), hdA.a());
            }
        }
    }

    private final void a(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (tu.z.m7137isSuccessimpl(objA)) {
            kotlin.jvm.internal.e0.checkNotNull(str2);
            kotlin.jvm.internal.e0.checkNotNull(num);
            aVar.b(str, str2, num.intValue());
        }
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objA);
        if (thM7134exceptionOrNullimpl != null) {
            this.f34718a.b(str, IronSourceError.ERROR_REWARD_VALIDATION_FAILED, thM7134exceptionOrNullimpl.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            int i10 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.x0.f87415a);
        }
        int i11 = tu.z.f87419c;
        return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
