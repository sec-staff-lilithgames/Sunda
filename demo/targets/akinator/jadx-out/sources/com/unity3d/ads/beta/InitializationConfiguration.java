package com.unity3d.ads.beta;

import android.content.Context;
import com.unity3d.services.core.log.DeviceLog;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InitializationConfiguration {
    private final Context context;
    private final Map<String, String> extras;
    private final String gameID;
    private final boolean isTestModeEnabled;
    private final DeviceLog.UnityAdsLogLevel logLevel;
    private final MediationInfo mediationInfo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private final Context context;
        private Map<String, String> extras;
        private final String gameID;
        private final boolean isTestModeEnabled;
        private DeviceLog.UnityAdsLogLevel logLevel;
        private MediationInfo mediationInfo;

        public Builder(Context context, String gameID, boolean z10) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(gameID, "gameID");
            this.context = context;
            this.gameID = gameID;
            this.isTestModeEnabled = z10;
            this.logLevel = DeviceLog.UnityAdsLogLevel.INFO;
            this.extras = p1.emptyMap();
        }

        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.context, this.gameID, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        public final Builder withExtras(Map<String, String> extras) {
            e0.checkNotNullParameter(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withLogLevel(DeviceLog.UnityAdsLogLevel logLevel) {
            e0.checkNotNullParameter(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public InitializationConfiguration(Context context, String gameID, boolean z10, DeviceLog.UnityAdsLogLevel logLevel, Map<String, String> extras, MediationInfo mediationInfo) {
        e0.checkNotNullParameter(context, QCmNMSGd.VyyTvOcbA);
        e0.checkNotNullParameter(gameID, "gameID");
        e0.checkNotNullParameter(logLevel, "logLevel");
        e0.checkNotNullParameter(extras, "extras");
        this.context = context;
        this.gameID = gameID;
        this.isTestModeEnabled = z10;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getGameID() {
        return this.gameID;
    }

    public final DeviceLog.UnityAdsLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(Context context, String str, boolean z10, DeviceLog.UnityAdsLogLevel unityAdsLogLevel, Map map, MediationInfo mediationInfo, int i10, u uVar) {
        this(context, str, z10, (i10 & 8) != 0 ? DeviceLog.UnityAdsLogLevel.INFO : unityAdsLogLevel, (i10 & 16) != 0 ? p1.emptyMap() : map, (i10 & 32) != 0 ? null : mediationInfo);
    }
}
