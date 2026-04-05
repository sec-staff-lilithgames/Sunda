package xl;

import br.h0;
import br.z;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {
    public static final pr.a toBMError(h0 h0Var, pr.a baseBMError) {
        e0.checkNotNullParameter(h0Var, "<this>");
        e0.checkNotNullParameter(baseBMError, "baseBMError");
        return new pr.a(baseBMError, -1, h0Var.getMessage());
    }

    public static final Map<String, Object> toEventParams(z zVar) {
        e0.checkNotNullParameter(zVar, "<this>");
        try {
            ListValue listValueMapNotNullToProtoListValue = pr.j.mapNotNullToProtoListValue(zVar.getAlgorithmResults(), a.f92026e);
            Struct.Builder builderNewBuilder = Struct.newBuilder();
            e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            Value protoValue = pr.j.toProtoValue(pr.j.putField(pr.j.putField(pr.j.putField(pr.j.putField(pr.j.putField(builderNewBuilder, "result", Double.valueOf(zVar.isBroken())), "phase", Integer.valueOf(zVar.getAdPhaseSequence())), "component", zVar.getAdElementName()), IronSourceConstants.EVENTS_DURATION, Long.valueOf(zVar.getDurationMs())), "algorithms", listValueMapNotNullToProtoListValue));
            HashMap map = new HashMap();
            map.put("adaptive_rendering_context", protoValue);
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }
}
