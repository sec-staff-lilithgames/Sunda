package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.a;
import org.json.JSONArray;
import org.json.JSONException;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private final MutableStateFlow<Integer> accessCounter = StateFlowKt.MutableStateFlow(-1);
    private final MutableStateFlow<String> initToken = StateFlowKt.MutableStateFlow(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final o asyncTokenStorage$delegate = q.lazy(s.f87405e, (a) new InMemoryTokenStorage$special$$inlined$inject$default$1(this, ""));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z10) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z10);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(JSONArray tokens) throws JSONException {
        e0.checkNotNullParameter(tokens, "tokens");
        this.accessCounter.compareAndSet(-1, 0);
        int length = tokens.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.queue.add(tokens.getString(i10));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(JSONArray tokens) throws JSONException {
        e0.checkNotNullParameter(tokens, "tokens");
        deleteTokens();
        appendTokens(tokens);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        Integer value;
        this.queue.clear();
        MutableStateFlow<Integer> mutableStateFlow = this.accessCounter;
        do {
            value = mutableStateFlow.getValue();
            value.intValue();
        } while (!mutableStateFlow.compareAndSet(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public x0 getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new com.google.android.gms.internal.ads.a(14));
        return x0.f87415a;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public String getToken() {
        Integer value;
        Integer num;
        if (this.accessCounter.getValue().intValue() == -1) {
            return this.initToken.getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        MutableStateFlow<Integer> mutableStateFlow = this.accessCounter;
        do {
            value = mutableStateFlow.getValue();
            num = value;
        } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(num.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(num.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(String str) {
        if (str == null) {
            return;
        }
        MutableStateFlow<String> mutableStateFlow = this.initToken;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), str)) {
        }
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }
}
