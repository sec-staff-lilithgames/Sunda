package ao;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface j0 {
    m0 createMediaSource(gn.p0 p0Var);

    int[] getSupportedTypes();

    j0 setDrmSessionManagerProvider(sn.w wVar);

    j0 setLoadErrorHandlingPolicy(go.t tVar);

    @Deprecated
    default j0 experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return this;
    }

    default j0 experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return this;
    }

    default j0 setCmcdConfigurationFactory(go.g gVar) {
        return this;
    }

    default j0 setSubtitleParserFactory(hp.q qVar) {
        return this;
    }
}
