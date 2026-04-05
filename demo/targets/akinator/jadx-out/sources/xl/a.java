package xl;

import br.u;
import br.v;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final a f92026e = new a(1);

    @Override // kv.l
    public final Value invoke(v brokenCreativeAlgorithmResult) {
        e0.checkNotNullParameter(brokenCreativeAlgorithmResult, "brokenCreativeAlgorithmResult");
        u algorithmParams = brokenCreativeAlgorithmResult.getAlgorithmParams();
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        Struct structBuild = pr.j.putField(pr.j.putField(pr.j.putField(builderNewBuilder, "name", algorithmParams.getType().getKey()), "weight", Float.valueOf(algorithmParams.getWeight())), "threshold", Float.valueOf(algorithmParams.getThreshold())).build();
        e0.checkNotNullExpressionValue(structBuild, "brokenCreativeAlgorithmR…build()\n                }");
        Struct.Builder builderNewBuilder2 = Struct.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        return pr.j.toProtoValue(pr.j.putField(pr.j.putField(pr.j.putField(builderNewBuilder2, "algorithm", structBuild), "result", Integer.valueOf(nm.k.convertToInt(brokenCreativeAlgorithmResult.isBroken()))), IronSourceConstants.EVENTS_DURATION, Long.valueOf(brokenCreativeAlgorithmResult.getDurationMs())));
    }
}
