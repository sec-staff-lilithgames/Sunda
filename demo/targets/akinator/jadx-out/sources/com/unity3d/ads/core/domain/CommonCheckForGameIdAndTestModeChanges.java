package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(getGameId, "getGameId");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z10) {
        if (z10) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(str, map, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, null, map, null, null, null, 58, null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z10) {
        String strInvoke = this.getGameId.invoke();
        if (strInvoke == null) {
            strInvoke = AbstractJsonLexerKt.NULL;
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = AbstractJsonLexerKt.NULL;
        }
        Map<String, String> mapMapOf = p1.mapOf(tu.e0.to("previous_game_id", previousGameId), tu.e0.to("game_id", strInvoke));
        if (e0.areEqual(previousGameId, AbstractJsonLexerKt.NULL)) {
            return;
        }
        if (e0.areEqual(strInvoke, previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", mapMapOf, z10);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", mapMapOf, z10);
        }
        boolean zIsTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map<String, String> mapMapOf2 = p1.mapOf(tu.e0.to("previous_test_mode", String.valueOf(previousTestMode)), tu.e0.to("test_mode", String.valueOf(zIsTestMode)));
        if (zIsTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", mapMapOf2, z10);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", mapMapOf2, z10);
        }
    }
}
