package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.misc.IObserver;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class NativeTokenGeneratorWithPrivacyAwait implements INativeTokenGenerator {
    private final ExecutorService _executorService;
    private final INativeTokenGenerator _nativeTokenGenerator;
    private final ConditionVariable _privacyAwait = new ConditionVariable();
    private final int _privacyAwaitTimeout;

    public NativeTokenGeneratorWithPrivacyAwait(ExecutorService executorService, INativeTokenGenerator iNativeTokenGenerator, int i10) {
        this._executorService = executorService;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._privacyAwaitTimeout = i10;
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGenerator
    public void generateToken(final INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        final IObserver<PrivacyConfig> iObserver = new IObserver<PrivacyConfig>() { // from class: com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.1
            @Override // com.unity3d.services.core.misc.IObserver
            public void updated(PrivacyConfig privacyConfig) {
                NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.open();
            }
        };
        PrivacyConfigStorage.getInstance().registerObserver(iObserver);
        this._executorService.execute(new Runnable() { // from class: com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait.2
            @Override // java.lang.Runnable
            public void run() {
                NativeTokenGeneratorWithPrivacyAwait.this._privacyAwait.block(NativeTokenGeneratorWithPrivacyAwait.this._privacyAwaitTimeout);
                PrivacyConfigStorage.getInstance().unregisterObserver(iObserver);
                NativeTokenGeneratorWithPrivacyAwait.this._nativeTokenGenerator.generateToken(iNativeTokenGeneratorListener);
            }
        });
    }
}
