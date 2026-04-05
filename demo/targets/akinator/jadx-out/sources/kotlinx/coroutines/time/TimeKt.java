package kotlinx.coroutines.time;

import av.e;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectBuilder;
import kv.l;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TimeKt {
    private static final long coerceToMillis(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Duration duration) {
        return FlowKt.debounce(flow, coerceToMillis(duration));
    }

    public static final Object delay(Duration duration, d<? super x0> dVar) {
        Object objDelay = DelayKt.delay(coerceToMillis(duration), dVar);
        return objDelay == e.getCOROUTINE_SUSPENDED() ? objDelay : x0.f87415a;
    }

    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, Duration duration, l lVar) {
        OnTimeoutKt.onTimeout(selectBuilder, coerceToMillis(duration), lVar);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, Duration duration) {
        return FlowKt.sample(flow, coerceToMillis(duration));
    }

    public static final <T> Object withTimeout(Duration duration, p pVar, d<? super T> dVar) {
        return TimeoutKt.withTimeout(coerceToMillis(duration), pVar, dVar);
    }

    public static final <T> Object withTimeoutOrNull(Duration duration, p pVar, d<? super T> dVar) {
        return TimeoutKt.withTimeoutOrNull(coerceToMillis(duration), pVar, dVar);
    }
}
