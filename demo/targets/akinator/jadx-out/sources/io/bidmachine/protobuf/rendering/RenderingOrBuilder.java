package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.rendering.Rendering;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface RenderingOrBuilder extends MessageOrBuilder {
    boolean containsCustomParams(String str);

    Rendering.Background getBackground();

    Rendering.BackgroundOrBuilder getBackgroundOrBuilder();

    Rendering.CacheType getCacheType();

    int getCacheTypeValue();

    @Deprecated
    Map<String, String> getCustomParams();

    int getCustomParamsCount();

    Map<String, String> getCustomParamsMap();

    String getCustomParamsOrDefault(String str, String str2);

    String getCustomParamsOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    RenderingFeature getFeatures(int i10);

    int getFeaturesCount();

    List<RenderingFeature> getFeaturesList();

    RenderingFeatureOrBuilder getFeaturesOrBuilder(int i10);

    List<? extends RenderingFeatureOrBuilder> getFeaturesOrBuilderList();

    Rendering.Orientation getOrientation();

    int getOrientationValue();

    Rendering.Phase getPhases(int i10);

    int getPhasesCount();

    List<Rendering.Phase> getPhasesList();

    Rendering.PhaseOrBuilder getPhasesOrBuilder(int i10);

    List<? extends Rendering.PhaseOrBuilder> getPhasesOrBuilderList();

    Rendering.ProductConfiguration getProductConfiguration();

    Rendering.ProductConfigurationOrBuilder getProductConfigurationOrBuilder();

    Rendering.SKStoreConfiguration getSkAdNetwork();

    Rendering.SKStoreConfigurationOrBuilder getSkAdNetworkOrBuilder();

    boolean hasBackground();

    boolean hasProductConfiguration();

    boolean hasSkAdNetwork();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
