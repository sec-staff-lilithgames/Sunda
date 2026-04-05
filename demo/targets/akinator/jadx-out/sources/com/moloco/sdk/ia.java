package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ia extends GeneratedMessageLite.Builder implements ja {
    public ia clearBgTsMs() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.AppForegroundingInteraction) this.instance).clearBgTsMs();
        return this;
    }

    @Override // com.moloco.sdk.ja
    public long getBgTsMs() {
        return ((UserIntent$UserAdInteractionExt.AppForegroundingInteraction) this.instance).getBgTsMs();
    }

    public ia setBgTsMs(long j10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt.AppForegroundingInteraction) this.instance).setBgTsMs(j10);
        return this;
    }
}
