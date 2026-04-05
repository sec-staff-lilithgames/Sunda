package com.unity3d.ads.core.domain.scar;

import bv.f;
import bv.n;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import uu.o0;
import uu.p0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarManager scarManager;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", i = {0, 1}, l = {36, 56}, m = "invokeSuspend", n = {"startTime", "uploadStartTime"}, s = {"J$0", "J$0"})
    /* renamed from: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ ByteString $tokenId;
        final /* synthetic */ int $tokenNumber;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TokenConfiguration tokenConfiguration, int i10, ByteString byteString, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$tokenNumber = i10;
            this.$tokenId = byteString;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = AndroidFetchSignalsAndSendUseCase.this.new AnonymousClass2(this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidFetchSignalsAndSendUseCase(CoroutineScope scope, SessionRepository sessionRepository, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(scarManager, "scarManager");
        e0.checkNotNullParameter(handleGetTokenRequest, "handleGetTokenRequest");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.sessionRepository = sessionRepository;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AdFormatOuterClass.AdFormat> getRequestedSignalFormats(TokenConfiguration tokenConfiguration) {
        List<AdFormatOuterClass.AdFormat> listListOf;
        if (tokenConfiguration == null) {
            return this.sessionRepository.getScarEligibleFormats();
        }
        AdFormatOuterClass.AdFormat protoAdFormat = AdFormatExtensions.toProtoAdFormat(tokenConfiguration.getAdFormat());
        if (!this.sessionRepository.getScarEligibleFormats().contains(protoAdFormat)) {
            protoAdFormat = null;
        }
        return (protoAdFormat == null || (listListOf = o0.listOf(protoAdFormat)) == null) ? p0.emptyList() : listListOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        if (scarEligibleFormats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (scarEligibleFormats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", "true");
        }
        if (scarEligibleFormats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", "true");
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(int i10, ByteString byteString, TokenConfiguration tokenConfiguration, d<? super x0> dVar) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass2(tokenConfiguration, i10, byteString, null), 3, null);
        return x0.f87415a;
    }
}
