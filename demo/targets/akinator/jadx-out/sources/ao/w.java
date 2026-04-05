package ao;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7868a;

    public w(long j10, u uVar) {
        this.f7868a = j10;
    }

    @Override // ao.j0
    @Deprecated
    public /* bridge */ /* synthetic */ j0 experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return super.experimentalParseSubtitlesDuringExtraction(z10);
    }

    @Override // ao.j0
    public /* bridge */ /* synthetic */ j0 experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return super.experimentalSetCodecsToParseWithinGopSampleDependencies(i10);
    }

    @Override // ao.j0
    public int[] getSupportedTypes() {
        return new int[]{4};
    }

    @Override // ao.j0
    public /* bridge */ /* synthetic */ j0 setCmcdConfigurationFactory(go.g gVar) {
        return super.setCmcdConfigurationFactory(gVar);
    }

    @Override // ao.j0
    public /* bridge */ /* synthetic */ j0 setSubtitleParserFactory(hp.q qVar) {
        return super.setSubtitleParserFactory(qVar);
    }

    @Override // ao.j0
    public x createMediaSource(gn.p0 p0Var) {
        return new x(p0Var, this.f7868a);
    }

    @Override // ao.j0
    public j0 setDrmSessionManagerProvider(sn.w wVar) {
        return this;
    }

    @Override // ao.j0
    public j0 setLoadErrorHandlingPolicy(go.t tVar) {
        return this;
    }
}
