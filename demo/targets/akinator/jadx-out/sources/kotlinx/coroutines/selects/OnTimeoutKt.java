package kotlinx.coroutines.selects;

import kotlinx.coroutines.DelayKt;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OnTimeoutKt {
    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j10, l lVar) {
        selectBuilder.invoke(new OnTimeout(j10).getSelectClause(), lVar);
    }

    /* renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m5209onTimeout8Mi8wO0(SelectBuilder<? super R> selectBuilder, long j10, l lVar) {
        onTimeout(selectBuilder, DelayKt.m5129toDelayMillisLRDsOJo(j10), lVar);
    }
}
