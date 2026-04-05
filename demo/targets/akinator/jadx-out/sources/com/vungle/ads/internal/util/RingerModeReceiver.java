package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.internal.ui.VungleWebClient;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RingerModeReceiver extends BroadcastReceiver {
    private VungleWebClient webClient;

    public final VungleWebClient getWebClient() {
        return this.webClient;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        VungleWebClient vungleWebClient;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e10) {
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage != null) {
                    Logger.Companion.e("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (e0.areEqual(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            Logger.Companion.d("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                VungleWebClient vungleWebClient2 = this.webClient;
                if (vungleWebClient2 != null) {
                    vungleWebClient2.notifySilentModeChange(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (vungleWebClient = this.webClient) != null) {
                    vungleWebClient.notifySilentModeChange(false);
                    return;
                }
                return;
            }
            VungleWebClient vungleWebClient3 = this.webClient;
            if (vungleWebClient3 != null) {
                vungleWebClient3.notifySilentModeChange(true);
            }
        }
    }

    public final void setWebClient(VungleWebClient vungleWebClient) {
        this.webClient = vungleWebClient;
    }
}
