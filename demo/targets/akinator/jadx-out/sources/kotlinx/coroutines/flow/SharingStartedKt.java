package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.SharingStarted;
import tv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m5184WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j10, long j11) {
        return new StartedWhileSubscribed(f.m7195getInWholeMillisecondsimpl(j10), f.m7195getInWholeMillisecondsimpl(j11));
    }

    /* renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ SharingStarted m5185WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f.f87433c.m7177getZEROUwyO8pc();
        }
        if ((i10 & 2) != 0) {
            j11 = f.f87433c.m7175getINFINITEUwyO8pc();
        }
        return m5184WhileSubscribed5qebJ5I(companion, j10, j11);
    }
}
