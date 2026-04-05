package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f45307a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f45308b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final j f45309a = new j();
    }

    public static j a() {
        return b.f45309a;
    }

    public boolean b(int i10) {
        if (MBridgeConstans.DEBUG) {
            p0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f45307a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f45307a = new AtomicBoolean(r0.a().a("r_v_r_f_l", false));
        } catch (Exception e10) {
            this.f45307a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f45307a.get();
    }

    private j() {
    }

    public boolean a(int i10) {
        if (MBridgeConstans.DEBUG) {
            p0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f45308b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f45308b = new AtomicBoolean(r0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e10) {
            this.f45308b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f45308b.get();
    }
}
