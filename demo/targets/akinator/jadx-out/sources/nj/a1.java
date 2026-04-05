package nj;

import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface a1 extends MessageLiteOrBuilder {
    boolean containsLimits(String str);

    @Deprecated
    Map<String, RateLimitProto$Counter> getLimits();

    int getLimitsCount();

    Map<String, RateLimitProto$Counter> getLimitsMap();

    RateLimitProto$Counter getLimitsOrDefault(String str, RateLimitProto$Counter rateLimitProto$Counter);

    RateLimitProto$Counter getLimitsOrThrow(String str);
}
