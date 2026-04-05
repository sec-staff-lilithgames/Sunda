package ao;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface u0 extends j0 {
    @Override // ao.j0
    /* synthetic */ m0 createMediaSource(gn.p0 p0Var);

    @Override // ao.j0
    @Deprecated
    /* bridge */ /* synthetic */ default j0 experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return super.experimentalParseSubtitlesDuringExtraction(z10);
    }

    @Override // ao.j0
    /* bridge */ /* synthetic */ default j0 experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return super.experimentalSetCodecsToParseWithinGopSampleDependencies(i10);
    }

    @Override // ao.j0
    /* synthetic */ int[] getSupportedTypes();

    @Override // ao.j0
    /* bridge */ /* synthetic */ default j0 setCmcdConfigurationFactory(go.g gVar) {
        return super.setCmcdConfigurationFactory(gVar);
    }

    @Override // ao.j0
    /* synthetic */ j0 setDrmSessionManagerProvider(sn.w wVar);

    @Override // ao.j0
    /* synthetic */ j0 setLoadErrorHandlingPolicy(go.t tVar);

    @Override // ao.j0
    /* bridge */ /* synthetic */ default j0 setSubtitleParserFactory(hp.q qVar) {
        return super.setSubtitleParserFactory(qVar);
    }
}
