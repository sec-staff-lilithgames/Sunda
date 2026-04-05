package com.bytedance.sdk.openadsdk.p001if;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {
    private final AudioManager jpo;

    /* renamed from: jd, reason: collision with root package name */
    private int f21187jd = -1;
    private boolean wqx = false;

    public zz(Context context) {
        this.jpo = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int jpo() {
        return this.f21187jd;
    }

    public void jpo(boolean z10) {
        jpo(z10, false);
    }

    public void jpo(boolean z10, boolean z11) {
        if (this.jpo == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int iQk = DeviceUtils.qk();
            if (iQk != 0) {
                this.f21187jd = iQk;
            } else if (!z11) {
                return;
            }
            jpo(3, 0, 0);
            this.wqx = true;
            return;
        }
        int iZz = this.f21187jd;
        if (iZz == 0) {
            iZz = DeviceUtils.zz() / 15;
        } else {
            if (iZz == -1) {
                if (!z11) {
                    return;
                } else {
                    iZz = DeviceUtils.zz() / 15;
                }
            }
            this.f21187jd = -1;
            jpo(3, iZz, i10);
            this.wqx = true;
        }
        i10 = 1;
        this.f21187jd = -1;
        jpo(3, iZz, i10);
        this.wqx = true;
    }

    private void jpo(int i10, int i11, int i12) {
        try {
            this.jpo.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
