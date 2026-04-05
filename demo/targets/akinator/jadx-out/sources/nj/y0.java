package nj;

import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;
import com.google.firebase.inappmessaging.internal.RateLimitProto$RateLimit;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y0 extends GeneratedMessageLite.Builder implements a1 {
    public y0 clearLimits() {
        copyOnWrite();
        ((RateLimitProto$RateLimit) this.instance).getMutableLimitsMap().clear();
        return this;
    }

    @Override // nj.a1
    public boolean containsLimits(String str) {
        str.getClass();
        return ((RateLimitProto$RateLimit) this.instance).getLimitsMap().containsKey(str);
    }

    @Override // nj.a1
    @Deprecated
    public Map<String, RateLimitProto$Counter> getLimits() {
        return getLimitsMap();
    }

    @Override // nj.a1
    public int getLimitsCount() {
        return ((RateLimitProto$RateLimit) this.instance).getLimitsMap().size();
    }

    @Override // nj.a1
    public Map<String, RateLimitProto$Counter> getLimitsMap() {
        return Collections.unmodifiableMap(((RateLimitProto$RateLimit) this.instance).getLimitsMap());
    }

    @Override // nj.a1
    public RateLimitProto$Counter getLimitsOrDefault(String str, RateLimitProto$Counter rateLimitProto$Counter) {
        str.getClass();
        Map<String, RateLimitProto$Counter> limitsMap = ((RateLimitProto$RateLimit) this.instance).getLimitsMap();
        return limitsMap.containsKey(str) ? limitsMap.get(str) : rateLimitProto$Counter;
    }

    @Override // nj.a1
    public RateLimitProto$Counter getLimitsOrThrow(String str) {
        str.getClass();
        Map<String, RateLimitProto$Counter> limitsMap = ((RateLimitProto$RateLimit) this.instance).getLimitsMap();
        if (limitsMap.containsKey(str)) {
            return limitsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public y0 putAllLimits(Map<String, RateLimitProto$Counter> map) {
        copyOnWrite();
        ((RateLimitProto$RateLimit) this.instance).getMutableLimitsMap().putAll(map);
        return this;
    }

    public y0 putLimits(String str, RateLimitProto$Counter rateLimitProto$Counter) {
        str.getClass();
        rateLimitProto$Counter.getClass();
        copyOnWrite();
        ((RateLimitProto$RateLimit) this.instance).getMutableLimitsMap().put(str, rateLimitProto$Counter);
        return this;
    }

    public y0 removeLimits(String str) {
        str.getClass();
        copyOnWrite();
        ((RateLimitProto$RateLimit) this.instance).getMutableLimitsMap().remove(str);
        return this;
    }
}
